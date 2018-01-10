// Generated from E:/msgit/apidoc-root/apidoc-maven-plugin/src/main/java\ApiParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ApiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ApiParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ApiParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(ApiParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApiParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(ApiParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApiParser#fieldKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldKey(ApiParser.FieldKeyContext ctx);
}