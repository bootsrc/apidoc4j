package io.github.flylib.apidoc4j.parser.util;

import java.io.*;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc.plugin.util
 * @Description:
 * @date 2017-12-18 16:14
 */
public class LogFileUtil {
    @Deprecated
    public static void write(String str) {
        String filePath = "e:/tmp/apidoc.log";
        File file = new File(filePath);
        try {
//            FileWriter writer = new FileWriter(file, true);

            PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file, true),"UTF-8"));
            pw.append(str);
            pw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
