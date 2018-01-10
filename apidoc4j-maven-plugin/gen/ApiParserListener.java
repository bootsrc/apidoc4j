// Generated from E:/msgit/apidoc-root/apidoc-maven-plugin/src/main/java\ApiParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ApiParser}.
 */
public interface ApiParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ApiParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(ApiParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApiParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(ApiParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApiParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(ApiParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApiParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(ApiParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link ApiParser#fieldKey}.
	 * @param ctx the parse tree
	 */
	void enterFieldKey(ApiParser.FieldKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ApiParser#fieldKey}.
	 * @param ctx the parse tree
	 */
	void exitFieldKey(ApiParser.FieldKeyContext ctx);
}