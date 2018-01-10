package io.github.flylib.apidoc4j.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoadUtil {
    public static void main(String[] args) throws Exception {
        test();
    }

    public static void test() throws Exception {
//        String path = "e:/tmp/Test1.java";
//        try {
//            String sourceStr = load(path);
//            List<String> commentStrList = getCommentStrList(sourceStr);
//            List<ApiDoc> docCommentList = ParseUtil.parse(commentStrList);
//            System.out.println("=====>docCommentList=");
//            System.out.println("=====>docCommentList.size()=" + docCommentList.size());
//            System.out.println(docCommentList);
//            System.out.println("=====>docCommentList display end.===================>>>");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public static String load(String path) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(path);
        InputStreamReader reader = new InputStreamReader(fileInputStream, "UTF-8");
//        FileReader fl = new FileReader(path);//File name
//        BufferedReader bf = new BufferedReader(fl);
        BufferedReader bf = new BufferedReader(reader);
        StringBuffer oriBuffer = new StringBuffer();
        String line = null;
        line = bf.readLine();
        while (line != null) {
            oriBuffer.append(line + "\n");
            line = bf.readLine();
        }
        return oriBuffer.toString();
    }

    public static List<String> getCommentStrList(String src) {
        List<String> strList = new ArrayList<String>();
        try {
            String regex = "/\\*\\*([\\s\\S])*?\\*/";
            Pattern pattern=Pattern.compile(regex);
            Matcher matcher=pattern.matcher(src.trim());
            int i = 0;
            while(matcher.find()){
//                i++;
//                System.out.println("-------comment" + i + " start");
                String commentStr = matcher.group();
                strList.add(commentStr);
//                System.out.println("-------comment" + i + " end");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strList;
    }

}
