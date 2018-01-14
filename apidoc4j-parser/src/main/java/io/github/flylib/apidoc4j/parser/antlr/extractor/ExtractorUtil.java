package io.github.flylib.apidoc4j.parser.antlr.extractor;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/**
 * @author liushaoming
 * @Package com.lsm.antlrstudy.extractor
 * @Description:
 * @date 2018-1-8 17:47
 */
public class ExtractorUtil {
    public static void main(String[] args) throws Exception {
        String filePath = "E:/tmp/antlr/TestCode.java";
        extractCommentStr(filePath);
    }

    public static List<String> extractCommentStr(String filePath) throws Exception {
        InputStream is = System.in;
        if (filePath != null) {
            is = new FileInputStream(filePath);
        }
//        ANTLRInputStream input = new ANTLRInputStream(is);
        CharStream input = CharStreams.fromStream(is);
        ExtractorLexer lexer = new ExtractorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExtractorParser parser = new ExtractorParser(tokens);

        RuleContext tree = parser.root();
        ParseTreeWalker walker = new ParseTreeWalker();
        CustomExtractorListener myListener = new CustomExtractorListener(tokens);
        walker.walk(myListener, tree);
        List<String> commentStrList = myListener.getCommentStrList();
        System.out.println(commentStrList);
        return commentStrList;
    }
}
