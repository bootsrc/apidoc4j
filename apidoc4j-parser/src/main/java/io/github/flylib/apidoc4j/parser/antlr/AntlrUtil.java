package io.github.flylib.apidoc4j.parser.antlr;

import io.github.flylib.apidoc4j.parser.antlr.api.ApiLexer;
import io.github.flylib.apidoc4j.parser.antlr.api.ApiParser;
import io.github.flylib.apidoc4j.parser.antlr.api.custom.CustomParser;
import io.github.flylib.apidoc4j.parser.antlr.extractor.ExtractorUtil;
import io.github.flylib.apidoc4j.parser.model.ApiDoc;
import org.antlr.v4.runtime.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liushaoming
 * @Package com.lsm.antlrstudy.app
 * @Description:
 * @date 2018-1-8 14:50
 */
public class AntlrUtil {
    public static List<ApiDoc> parse(String filePath) {
        List<ApiDoc> apiDocList = new ArrayList<ApiDoc>();
        try {
            List<String> commentStrList =  ExtractorUtil.extractCommentStr(filePath);

            for (String commentStr : commentStrList) {
                apiDocList.add(extractField(commentStr));
            }
            System.out.println(apiDocList);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return apiDocList;
        }
    }

    public static void main(String[] args) {
        String filePath = "E:/tmp/antlr/TestCode3.java";
        parse(filePath);
    }

    private static ApiDoc extractField(String str) throws IOException {
/*        For ANTLR 4.7 the API was changed a little (ANTLRInputStream is deprecated):

        InputStream stream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        lexer.setInputStream(CharStreams.fromStream(stream, StandardCharsets.UTF_8));
        parser.setInputStream(new CommonTokenStream(lexer));
        Hint: if you want to re-use the parser+lexer instances, call their 'reset()' methods after setting their input streams.*/

    /*    原来的deprecated的代码
        ANTLRInputStream input = new ANTLRInputStream(str);
        ApiLexer lexer = new ApiLexer(input);*/

        // 改成如下的代码：
        InputStream stream = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
        ApiLexer lexer = new ApiLexer(CharStreams.fromStream(stream, StandardCharsets.UTF_8));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ApiParser parser = new ApiParser(tokens);
        ApiParser.ApidocContext tree = parser.apidoc();
        CustomParser customParser= new CustomParser();
        ApiDoc apiDoc = customParser.parse(tree);
        System.out.println(apiDoc);
        return apiDoc;
    }
}
