// Generated from E:/msgit/apidoc-root/apidoc-maven-plugin/src/main/java\Hello.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(HelloParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(HelloParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(HelloParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(HelloParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#api}.
	 * @param ctx the parse tree
	 */
	void enterApi(HelloParser.ApiContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#api}.
	 * @param ctx the parse tree
	 */
	void exitApi(HelloParser.ApiContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#apiParam}.
	 * @param ctx the parse tree
	 */
	void enterApiParam(HelloParser.ApiParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#apiParam}.
	 * @param ctx the parse tree
	 */
	void exitApiParam(HelloParser.ApiParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#apiSuccess}.
	 * @param ctx the parse tree
	 */
	void enterApiSuccess(HelloParser.ApiSuccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#apiSuccess}.
	 * @param ctx the parse tree
	 */
	void exitApiSuccess(HelloParser.ApiSuccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#apiExample}.
	 * @param ctx the parse tree
	 */
	void enterApiExample(HelloParser.ApiExampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#apiExample}.
	 * @param ctx the parse tree
	 */
	void exitApiExample(HelloParser.ApiExampleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#apiContent}.
	 * @param ctx the parse tree
	 */
	void enterApiContent(HelloParser.ApiContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#apiContent}.
	 * @param ctx the parse tree
	 */
	void exitApiContent(HelloParser.ApiContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(HelloParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(HelloParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(HelloParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(HelloParser.TitleContext ctx);
}