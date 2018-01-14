package io.github.flylib.apidoc4j.parser.antlr.api.custom;

import io.github.flylib.apidoc4j.parser.antlr.api.ApiBaseVisitor;
import io.github.flylib.apidoc4j.parser.antlr.api.ApiParser;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc.plugin.antlr.api.custom
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
//
//    @Override
//    public  Object visitText(ApiParser.TextContext ctx) {
//        return ctx.getText();
//    }

    // apiParam
    @Override
    public String visitType(ApiParser.TypeContext ctx) {
        return ctx.getText();
    }

    @Override
    public Object visitField(ApiParser.FieldContext ctx) {
        return ctx.getText();
    }

    @Override
    public Object visitDescription(ApiParser.DescriptionContext ctx) {
        return ctx.getText();
    }
}
