package io.github.flylib.apidoc4j.parser.antlr.extractor;

import io.github.flylib.apidoc4j.parser.antlr.util.CommentStrUtil;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liushaoming
 * @Package com.lsm.antlrstudy.extractor
 * @Description:
 * @date 2018-1-8 17:42
 */
public class CustomExtractorListener extends ExtractorParserBaseListener {
    private BufferedTokenStream tokens;

    private List<String> commentStrList;

    public CustomExtractorListener(BufferedTokenStream tokens) {
        this.tokens = tokens;
        commentStrList = new ArrayList<String>();
    }

    public List<String> getCommentStrList() {
        return commentStrList;
    }

    @Override
    public void enterRoot(ExtractorParser.RootContext ctx) {
        System.out.println("----------------------enterApidocContent------------------------");
        int tokenIndex = tokens.index();
        List<Token> comments = tokens.getHiddenTokensToLeft(tokenIndex, ExtractorLexer.CHANNEL_COMMENT);

        if (comments != null) {
            for (Token cmt : comments) {
                if (cmt != null) {
                    String text = cmt.getText();
                    System.out.printf("-------text = %s--------\n", text);
                    text = CommentStrUtil.trimStr(text);
                    commentStrList.add(text);
                }
            }

        }
    }

}
