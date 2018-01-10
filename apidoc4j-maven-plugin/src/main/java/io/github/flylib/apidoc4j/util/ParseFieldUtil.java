package io.github.flylib.apidoc4j.util;

import org.codehaus.plexus.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc4j.plugin.util
 * @Description:
 * @date 2017-12-27 14:25
 */
public class ParseFieldUtil {
    public static String parseNormalField(String commentStr, String fieldName) {
        String text = null;
        if (commentStr == null || commentStr.trim().length() < 1) {
            return null;
        }
        String regex1 = "@" + fieldName + "\\s([\\s\\S])*?@api";
        String regex2 = "@" + fieldName + "\\s([\\s\\S])*?\\*/";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(commentStr);
        if (matcher1.find()) {
            text = matcher1.group();
        } else {
            Pattern pattern2 = Pattern.compile(regex2);
            Matcher matcher2 = pattern2.matcher(commentStr);
            if (matcher2.find()) {
                text = matcher2.group();

            }
        }

        if (text != null && text.length() > 0) {
//            System.out.println("---Filed text=" + text);
            text = text.replace("@" + fieldName + " ", " ");
            text = text.replace("@api", "");
            text = text.replace("\\*/", "");
        }

        text = NormalFieldUtil.getContent(text);
        return text;
    }

    /**
     *
     * @param commentStr
     * @param fieldName For example: "apiParamExample"
     * @return
     */
    public static List<String> parseMultiValue(String commentStr, String fieldName) {
        if (StringUtils.isEmpty(commentStr)) {
            return null;
        }
//        String regex1 = "@apiParamExample" + "\\s([\\s\\S])*?@api";
        List<String> elementStrList = new ArrayList<String>();
        int elementCount = ParseFieldUtil.getElementCount(commentStr, fieldName);
        int elementIndex = 0;
        String copiedCommentStr = new String(commentStr);

        String regex1 = "@" + fieldName + "\\s([\\s\\S])*?@api";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(commentStr);

        while (matcher1.find()) {
            String paramStr = matcher1.group();
            elementIndex++;
            copiedCommentStr= copiedCommentStr.replaceAll(paramStr, "");

            if (paramStr != null && paramStr.length() > 0) {
                paramStr = paramStr.replace("@" + fieldName + " ", " ");
                paramStr = paramStr.replace("@api", "");
                paramStr = paramStr.replace("\\*/", "");
            }
            elementStrList.add(paramStr);
        }



        return elementStrList;
    }

    public static int getElementCount(String commentStr, String fieldName) {
        int count = 0;
        String regex1 = "@" + fieldName + "\\s";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(commentStr);
        while (matcher1.find()) {
            String paramStr = matcher1.group();
            count++;
        }
        return count;
    }

//    public static String parseLastElement(String src, String fieldName) {
////        String regex = "@" + fieldName + "";
//        String regex = "@" + fieldName + "\\s([\\s\\S])*?\\*/";
//
//    }

}
