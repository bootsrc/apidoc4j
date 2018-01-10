package io.github.flylib.apidoc4j.mojo;

import com.alibaba.fastjson.JSONArray;
import io.github.flylib.apidoc4j.constant.ResponseConstant;
import io.github.flylib.apidoc4j.model.ApiDoc;
import io.github.flylib.apidoc4j.util.DocGenerator;
import io.github.flylib.apidoc4j.util.LoadUtil;
import io.github.flylib.apidoc4j.util.ParseUtil;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Mojo(name = "generate")
public class GeneratorMojo extends AbstractMojo {
    /**
     * 项目根目录
     */
//    @Parameter(defaultValue = "${project.basedir}", property = "baseDir", required = true,
//            readonly = true)
//    private File basedir;

    @Parameter(defaultValue = "${project.build.sourceDirectory}", required = true, readonly = true)
    private File sourceDirectory;

    @Parameter(defaultValue = "", required = true, readonly = true)
    private String writerUrl;

    @Parameter(required = false, readonly = true)
    private String[] includes;

    /**
     * default includes
     */
//    private static final String[] INCLUDES_DEFAULT = {"java", "xml", "properties"};
    private static final String[] INCLUDES_DEFAULT = {"java"};
    private DocGenerator generator;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        if (includes == null || includes.length == 0) {
            includes = INCLUDES_DEFAULT;
        }
        doExecute();
    }

    private void doExecute() {
        generator = new DocGenerator(getLog(), includes);
        getLog().info("=====> apidoc4j===> sourceDirectory=" + sourceDirectory);
        getLog().info("=====> apidoc4j===> writerUrl=" + writerUrl);

        try {
            List<ApiDoc> allDocList = new ArrayList<ApiDoc>();
            List<File> srcFiles = generator.generateComments(sourceDirectory);
            for (File file : srcFiles) {
                String sourceStr = LoadUtil.load(file.getAbsolutePath());
                List<String> commentStrList = LoadUtil.getCommentStrList(sourceStr);
                List<ApiDoc> docList = ParseUtil.parse(commentStrList);
                if (docList != null && docList.size() > 0) {
                    allDocList.addAll(docList);
                }
            }

            getLog().info("===>apidoc4j==allDocList.size() = " + allDocList.size());
            getLog().info("===>apidoc4j==allDocList = " + allDocList);

            String jsonStr = JSONArray.toJSONString(allDocList);
            getLog().info("========>jsonStr===>");
            getLog().info(jsonStr);
            getLog().info("========>jsonStr===>end");
            byte[] bytes = jsonStr.getBytes();
//            writeToDB(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void writeToDB(byte[] bytes) {
        OutputStream outputStream = null;

        try {
            URL url = new URL(writerUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);// 忽略缓存
            conn.setRequestProperty("Content-Type", "application/octet-stream");
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Connection", "Keep-Alive");
            outputStream = conn.getOutputStream();
            getLog().info("===>invoking http service--------------------------");
            outputStream.write(bytes);
            outputStream.flush();
            getLog().info("===>invoking http service--------------end------------");
            InputStream inputStream = conn.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuffer stringBuffer = new StringBuffer();
            String line = bufferedReader.readLine();
            while (line != null) {
                stringBuffer.append(line);
                line = bufferedReader.readLine();
            }
            String responseStr = stringBuffer.toString();
            getLog().info("====>apidoc4j==responseFromService=" + responseStr);
            if (ResponseConstant.SUCCESS.equals(responseStr)) {
                getLog().info("====>apidoc4j==writeToDB successfully!");
            } else {
                getLog().info("====>apidoc4j==writeToDB failed!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}