package io.github.flylib.apidoc4j.util;

import io.github.flylib.apidoc4j.model.ApiDoc;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc4j.plugin.util
 * @Description:
 * @date 2017-12-28 15:15
 */
public class ApiParseUtilTest {

//    @Test
//    public void doParseApiGroup() {
//
//    }

//    @Test
//    public void doParseApiHeader() {
////        String valueStr = "{String} access-key Users unique access-key.";
//        String valueStr = "(groupX) {String} access-key Users unique access-key.";
//        ApiHeader apiHeader= ApiParseUtil.doParseApiHeader(valueStr);
//        Assert.assertNotNull(apiHeader.getDescription());
//    }

//    @Test
//    public void doParseApiHeaderExample() {
//        String valueStr="{json} Header-Example:\n" +
//                " {\n" +
//                " \"Accept-Encoding\": \"Accept-Encoding: gzip, deflate\"\n" +
//                " }";
//        ApiHeaderExample apiHeaderExample=ApiParseUtil.doParseApiHeaderExample(valueStr);
//        Assert.assertNotNull(apiHeaderExample.getExample());
//    }

//    @Test
//    public void doParseApiIgnore() {
//        String valueStr = "Not finished Method";
//        ApiIgnore apiIgnore= ApiParseUtil.doParseApiIgnore(valueStr);
//        Assert.assertNotNull(apiIgnore);
//    }

    @Test
    public void testAll() {
//        String path = "e:/tmp/Test1.java";
        String path = "e:/tmp/Test2.java";
        try {
            String sourceStr = LoadUtil.load(path);
            List<String> commentStrList = LoadUtil.getCommentStrList(sourceStr);
            List<ApiDoc> allDocList = ParseUtil.parse(commentStrList);
            System.out.println("=====>allDocList=");
            System.out.println("=====>allDocList.size()=" + allDocList.size());
            System.out.println(allDocList);
            System.out.println("=====>allDocList display end.===================>>>");

            Assert.assertTrue( allDocList != null && allDocList.size() > 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}