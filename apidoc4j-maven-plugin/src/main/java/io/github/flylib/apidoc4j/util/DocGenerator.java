package io.github.flylib.apidoc4j.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.maven.plugin.logging.Log;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc4j.plugin.util
 * @Description:
 * @date 2017-12-19 11:07
 */
public class DocGenerator {
    private Log log;
    private String[] includes;

public DocGenerator(Log log, String[] includes) {
    this.log = log;
    this.includes = includes;
}

    /**
     * 解析某个目录下所有Java代码的apidoc注释
     * @param dir 目录
     * @throws IOException 文件异常
     */
    public List<File> generateComments(File dir) throws IOException {
        List<File> collected = new ArrayList<File>();
        if(!dir.exists()){
            return collected;
        }

        collectFiles(collected, dir);
        log.info("===apidoc4j==> Count of collected file = " + collected.size());
        return collected;
    }

    /**
     * 递归获取文件列表
     * @param collected 文件列表list
     * @param file 文件
     */
    private void collectFiles(List<File> collected, File file){
        if(file.isFile()){
            for(String include : includes){
                if(file.getName().endsWith("." + include)){
                    collected.add(file);
                    break;
                }
            }
        }else{
            for(File sub : file.listFiles()){
                collectFiles(collected, sub);
            }
        }
    }
}
