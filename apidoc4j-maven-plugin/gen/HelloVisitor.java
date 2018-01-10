// Generated from E:/msgit/apidoc-root/apidoc-maven-plugin/src/main/java\Hello.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(HelloParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(HelloParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#api}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApi(HelloParser.ApiContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#apiParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApiParam(HelloParser.ApiParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#apiSuccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApiSuccess(HelloParser.ApiSuccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#apiExample}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApiExample(HelloParser.ApiExampleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#apiContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApiContent(HelloParser.ApiContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(HelloParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(HelloParser.TitleContext ctx);
}