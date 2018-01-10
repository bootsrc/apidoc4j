// Generated from D:/git/flylib/apidoc4j/apidoc4j-maven-plugin/src/main/java\Api.g4 by ANTLR 4.7
package io.github.flylib.apidoc4j.plugin.antlr.api;
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
	 * Visit a parse tree produced by {@link ApiParser#api}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApi(ApiParser.ApiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApiParser#apiName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApiName(ApiParser.ApiNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApiParser#apiGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApiGroup(ApiParser.ApiGroupContext ctx);
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
	 * Visit a parse tree produced by {@link ApiParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(ApiParser.NameContext ctx);
}