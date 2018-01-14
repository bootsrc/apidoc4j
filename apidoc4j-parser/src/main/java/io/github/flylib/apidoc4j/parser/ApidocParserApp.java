package io.github.flylib.apidoc4j.parser;

import io.github.flylib.apidoc4j.parser.antlr.AntlrUtil;

public class ApidocParserApp {
    public static void main(String[] args) {
        String filePath = "E:/tmp/antlr/TestCode3.java";
        AntlrUtil.parse(filePath);
    }
}
