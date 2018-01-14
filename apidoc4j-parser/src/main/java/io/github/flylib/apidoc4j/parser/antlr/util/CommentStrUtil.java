package io.github.flylib.apidoc4j.parser.antlr.util;

/**
 * @author liushaoming
 * @Package com.lsm.antlrstudy.util
 * @Description:
 * @date 2018-1-8 18:19
 */
public class CommentStrUtil {
    public static String trimStr(String src) {
        src = src.replace("/**", "");
        src = src.replace("*/", "");
        src = src.replace("\n * ", "\n");
        src = src.replace("\n *", "\n");
        src = src.trim();
        return src;
    }
}
