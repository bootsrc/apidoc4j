package io.github.flylib.apidoc4j.antlr.api.custom;

import io.github.flylib.apidoc4j.model.ApiDoc;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc4j.plugin.antlr.api.custom
 * @Description:
 * @date 2018-1-10 13:33
 */
public class CustomParser {
    public ApiDoc parse(ParseTree parseTree) {
//        ClassVisitor classVistor = new ClassVisitor();
//        return classVistor.visit(parseTree);

        ApidocVisitor visitor = new ApidocVisitor();
        ApiDoc apidoc =visitor.visit(parseTree);
        return apidoc;
    }
}
