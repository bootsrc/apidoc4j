package io.github.flylib.apidoc4j.antlr.api.custom;

import io.github.flylib.apidoc4j.antlr.api.ApiBaseVisitor;
import io.github.flylib.apidoc4j.antlr.api.ApiParser;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc4j.plugin.antlr.api.custom
 * @Description:
 * @date 2018-1-10 13:04
 */
public class ObjectVisitor extends ApiBaseVisitor<Object> {
    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitMethod(ApiParser.MethodContext ctx) {
        return ctx.getText();
//        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitPath(ApiParser.PathContext ctx) {
        return ctx.getText();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitTitle(ApiParser.TitleContext ctx) {
        return ctx.getText();
    }

    @Override
    public Object visitName(ApiParser.NameContext ctx) {
        return ctx.getText();
    }
}
