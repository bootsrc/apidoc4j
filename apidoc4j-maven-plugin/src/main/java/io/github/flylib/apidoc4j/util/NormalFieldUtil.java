package io.github.flylib.apidoc4j.util;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc4j.plugin.util
 * @Description:
 * @date 2017-12-22 16:28
 */
public class NormalFieldUtil {
    public static String getContent(String src) {
        if (src != null && src.length() > 0){
            src = src.replace("*", "");
            src = src.trim();
        }
        return src;
    }
}
