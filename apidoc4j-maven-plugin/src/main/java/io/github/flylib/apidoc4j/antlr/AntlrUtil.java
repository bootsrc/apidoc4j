package io.github.flylib.apidoc4j.antlr;

import io.github.flylib.apidoc4j.antlr.api.ApiLexer;
import io.github.flylib.apidoc4j.antlr.api.ApiParser;
import io.github.flylib.apidoc4j.antlr.api.custom.CustomParser;
import io.github.flylib.apidoc4j.antlr.extractor.ExtractorUtil;
import io.github.flylib.apidoc4j.model.ApiDoc;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liushaoming
 * @Package com.lsm.antlrstudy.app
 * @Description:
 * @date 2018-1-8 14:50
 */
public class AntlrUtil {
    public static void main(String[] args) {
        String filePath = "E:/tmp/antlr/TestCode3.java";
        try {
            List<String> commentStrList =  ExtractorUtil.extractCommentStr(filePath);
            List<ApiDoc> apiDocList = new ArrayList<ApiDoc>();
            for (String commentStr : commentStrList) {
                apiDocList.add(extractField(commentStr));
            }
            System.out.println(apiDocList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static ApiDoc extractField(String str) {
        ANTLRInputStream input = new ANTLRInputStream(str);
        ApiLexer lexer = new ApiLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ApiParser parser = new ApiParser(tokens);
        ApiParser.ApidocContext tree = parser.apidoc();
        CustomParser customParser= new CustomParser();
        ApiDoc apiDoc = customParser.parse(tree);
        System.out.println(apiDoc);
        return apiDoc;
    }
}
