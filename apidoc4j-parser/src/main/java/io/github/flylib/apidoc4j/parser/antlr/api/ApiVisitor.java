// Generated from D:/git/flylib/apidoc4j/apidoc4j-parser/src/main/antlr4\Api.g4 by ANTLR 4.7
package io.github.flylib.apidoc4j.parser.antlr.api;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ApiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ApiVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ApiParser#apidoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApidoc(ApiParser.ApidocContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApiParser#otherComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherComment(ApiParser.OtherCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApiParser#fieldExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldExpr(ApiParser.FieldExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApiParser#fieldString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldString(ApiParser.FieldStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApiParser#fieldApi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldApi(ApiParser.FieldApiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApiParser#fieldApiName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldApiName(ApiParser.FieldApiNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApiParser#fieldApiParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldApiParam(ApiParser.FieldApiParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApiParser#fieldApiParamExample}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldApiParamExample(ApiParser.FieldApiParamExampleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApiParser#fieldApiSuccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldApiSuccess(ApiParser.FieldApiSuccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApiParser#fieldApiVersion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldApiVersion(ApiParser.FieldApiVersionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApiParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(ApiParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApiParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(ApiParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApiParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(ApiParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApiParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(ApiParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApiParser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(ApiParser.GroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApiParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ApiParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApiParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(ApiParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApiParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(ApiParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApiParser#paramTitle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamTitle(ApiParser.ParamTitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApiParser#example}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExample(ApiParser.ExampleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApiParser#version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersion(ApiParser.VersionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApiParser#multiText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiText(ApiParser.MultiTextContext ctx);
}