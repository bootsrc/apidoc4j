package io.github.flylib.apidoc4j.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc4j.plugin.util
 * @Description:
 * @date 2018-1-2 15:05
 */
public class ParseFieldUtilTest {

    @Test
    public void getElementCount() {
        String path = "e:/tmp/Test2.java";
        try {
            String sourceStr = null;
            sourceStr = LoadUtil.load(path);
            List<String> commentStrList = LoadUtil.getCommentStrList(sourceStr);
            String commentStr = commentStrList.get(0);
            String fieldName = "apiParam";
            int elementCount = ParseFieldUtil.getElementCount(commentStr, fieldName);
            Assert.assertTrue(elementCount > 0);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}