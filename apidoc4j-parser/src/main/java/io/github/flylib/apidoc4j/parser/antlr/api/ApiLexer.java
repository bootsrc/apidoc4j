// Generated from D:/git/flylib/apidoc4j/apidoc4j-parser/src/main/antlr4\Api.g4 by ANTLR 4.7
package io.github.flylib.apidoc4j.parser.antlr.api;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ApiLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		K_API=1, K_APIPARAM=2, K_APIPARAMEXAMPLE=3, K_APIDEFINE=4, K_APINAME=5, 
		K_APIGROUP=6, K_APIDESCRIPTION=7, K_APISUCCESS=8, K_APIVERSION=9, STRING_UNICODE=10, 
		PATH_VALUE=11, VERSION=12, OP_LPAREN=13, OP_RPAREN=14, OP_LBRACE=15, OP_RBRACE=16, 
		OP_LBRACK=17, OP_RBRACK=18, OP_BACK_SLASH=19, OP_AT=20, SPACE=21, ENTER=22, 
		DOT=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"K_API", "K_APIPARAM", "K_APIPARAMEXAMPLE", "K_APIDEFINE", "K_APINAME", 
		"K_APIGROUP", "K_APIDESCRIPTION", "K_APISUCCESS", "K_APIVERSION", "STRING_UNICODE", 
		"PATH_VALUE", "VERSION", "CHAR_WITH_OP", "CHAR_UNICODE_AND_DOT", "CHAR_UNICODE", 
		"OP_LPAREN", "OP_RPAREN", "OP_LBRACE", "OP_RBRACE", "OP_LBRACK", "OP_RBRACK", 
		"OP_BACK_SLASH", "OP_AT", "SPACE", "ENTER", "DOT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'api'", "'apiParam'", "'apiParamExample'", "'apiDefine'", "'apiName'", 
		"'apiGroup'", "'apiDescription'", "'apiSuccess'", "'apiVersion'", null, 
		null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'/'", "'@'", "' '", 
		"'\n'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "K_API", "K_APIPARAM", "K_APIPARAMEXAMPLE", "K_APIDEFINE", "K_APINAME", 
		"K_APIGROUP", "K_APIDESCRIPTION", "K_APISUCCESS", "K_APIVERSION", "STRING_UNICODE", 
		"PATH_VALUE", "VERSION", "OP_LPAREN", "OP_RPAREN", "OP_LBRACE", "OP_RBRACE", 
		"OP_LBRACK", "OP_RBRACK", "OP_BACK_SLASH", "OP_AT", "SPACE", "ENTER", 
		"DOT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ApiLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Api.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00c0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13\u0096\n\13"+
		"\r\13\16\13\u0097\3\f\3\f\6\f\u009c\n\f\r\f\16\f\u009d\3\r\6\r\u00a1\n"+
		"\r\r\r\16\r\u00a2\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\2\35\2\37\2!\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63"+
		"\30\65\31\3\2\5\t\2\"\"/\60\62<C\\aac|\u4e02\u9fcd\7\2\60\60\62;C\\c|"+
		"\u4e02\u9fcd\6\2\62;C\\c|\u4e02\u9fcd\2\u00c0\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5;\3\2\2"+
		"\2\7D\3\2\2\2\tT\3\2\2\2\13^\3\2\2\2\rf\3\2\2\2\17o\3\2\2\2\21~\3\2\2"+
		"\2\23\u0089\3\2\2\2\25\u0095\3\2\2\2\27\u009b\3\2\2\2\31\u00a0\3\2\2\2"+
		"\33\u00a4\3\2\2\2\35\u00a6\3\2\2\2\37\u00a8\3\2\2\2!\u00aa\3\2\2\2#\u00ac"+
		"\3\2\2\2%\u00ae\3\2\2\2\'\u00b0\3\2\2\2)\u00b2\3\2\2\2+\u00b4\3\2\2\2"+
		"-\u00b6\3\2\2\2/\u00b8\3\2\2\2\61\u00ba\3\2\2\2\63\u00bc\3\2\2\2\65\u00be"+
		"\3\2\2\2\678\7c\2\289\7r\2\29:\7k\2\2:\4\3\2\2\2;<\7c\2\2<=\7r\2\2=>\7"+
		"k\2\2>?\7R\2\2?@\7c\2\2@A\7t\2\2AB\7c\2\2BC\7o\2\2C\6\3\2\2\2DE\7c\2\2"+
		"EF\7r\2\2FG\7k\2\2GH\7R\2\2HI\7c\2\2IJ\7t\2\2JK\7c\2\2KL\7o\2\2LM\7G\2"+
		"\2MN\7z\2\2NO\7c\2\2OP\7o\2\2PQ\7r\2\2QR\7n\2\2RS\7g\2\2S\b\3\2\2\2TU"+
		"\7c\2\2UV\7r\2\2VW\7k\2\2WX\7F\2\2XY\7g\2\2YZ\7h\2\2Z[\7k\2\2[\\\7p\2"+
		"\2\\]\7g\2\2]\n\3\2\2\2^_\7c\2\2_`\7r\2\2`a\7k\2\2ab\7P\2\2bc\7c\2\2c"+
		"d\7o\2\2de\7g\2\2e\f\3\2\2\2fg\7c\2\2gh\7r\2\2hi\7k\2\2ij\7I\2\2jk\7t"+
		"\2\2kl\7q\2\2lm\7w\2\2mn\7r\2\2n\16\3\2\2\2op\7c\2\2pq\7r\2\2qr\7k\2\2"+
		"rs\7F\2\2st\7g\2\2tu\7u\2\2uv\7e\2\2vw\7t\2\2wx\7k\2\2xy\7r\2\2yz\7v\2"+
		"\2z{\7k\2\2{|\7q\2\2|}\7p\2\2}\20\3\2\2\2~\177\7c\2\2\177\u0080\7r\2\2"+
		"\u0080\u0081\7k\2\2\u0081\u0082\7U\2\2\u0082\u0083\7w\2\2\u0083\u0084"+
		"\7e\2\2\u0084\u0085\7e\2\2\u0085\u0086\7g\2\2\u0086\u0087\7u\2\2\u0087"+
		"\u0088\7u\2\2\u0088\22\3\2\2\2\u0089\u008a\7c\2\2\u008a\u008b\7r\2\2\u008b"+
		"\u008c\7k\2\2\u008c\u008d\7X\2\2\u008d\u008e\7g\2\2\u008e\u008f\7t\2\2"+
		"\u008f\u0090\7u\2\2\u0090\u0091\7k\2\2\u0091\u0092\7q\2\2\u0092\u0093"+
		"\7p\2\2\u0093\24\3\2\2\2\u0094\u0096\5\37\20\2\u0095\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\26\3\2\2"+
		"\2\u0099\u009c\5-\27\2\u009a\u009c\5\25\13\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\30\3\2\2\2\u009f\u00a1\5\35\17\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\32\3\2\2"+
		"\2\u00a4\u00a5\t\2\2\2\u00a5\34\3\2\2\2\u00a6\u00a7\t\3\2\2\u00a7\36\3"+
		"\2\2\2\u00a8\u00a9\t\4\2\2\u00a9 \3\2\2\2\u00aa\u00ab\7*\2\2\u00ab\"\3"+
		"\2\2\2\u00ac\u00ad\7+\2\2\u00ad$\3\2\2\2\u00ae\u00af\7}\2\2\u00af&\3\2"+
		"\2\2\u00b0\u00b1\7\177\2\2\u00b1(\3\2\2\2\u00b2\u00b3\7]\2\2\u00b3*\3"+
		"\2\2\2\u00b4\u00b5\7_\2\2\u00b5,\3\2\2\2\u00b6\u00b7\7\61\2\2\u00b7.\3"+
		"\2\2\2\u00b8\u00b9\7B\2\2\u00b9\60\3\2\2\2\u00ba\u00bb\7\"\2\2\u00bb\62"+
		"\3\2\2\2\u00bc\u00bd\7\f\2\2\u00bd\64\3\2\2\2\u00be\u00bf\7\60\2\2\u00bf"+
		"\66\3\2\2\2\7\2\u0097\u009b\u009d\u00a2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}