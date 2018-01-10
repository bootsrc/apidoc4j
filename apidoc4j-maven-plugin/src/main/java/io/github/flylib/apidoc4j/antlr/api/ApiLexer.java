// Generated from D:/code/frank/antlr/apidoc-maven-plugin-20180110-1823/apidoc-maven-plugin/src/main/java\Api.g4 by ANTLR 4.7
package io.github.flylib.apidoc4j.antlr.api;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ApiLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WS=3, NEWLINE=4, PATH=5, TEXT=6, TEXT_WITH_SPACE=7, CHINESE_CHAR=8, 
		EN_CHAR=9, XXX=10, API=11, APIDEFINE=12, APINAME=13, APIGROUP=14, REQUEST_METHOD_NAME=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "WS", "NEWLINE", "PATH", "TEXT", "TEXT_WITH_SPACE", "CHINESE_CHAR", 
		"EN_CHAR", "XXX", "API", "APIDEFINE", "APINAME", "APIGROUP", "REQUEST_METHOD_NAME"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", null, null, null, null, null, null, null, null, "'@api'", 
		"'@apiDefine'", "'@apiName'", "'@apiGroup'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "WS", "NEWLINE", "PATH", "TEXT", "TEXT_WITH_SPACE", 
		"CHINESE_CHAR", "EN_CHAR", "XXX", "API", "APIDEFINE", "APINAME", "APIGROUP", 
		"REQUEST_METHOD_NAME"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0097\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3"+
		"\3\4\6\4\'\n\4\r\4\16\4(\3\5\6\5,\n\5\r\5\16\5-\3\6\6\6\61\n\6\r\6\16"+
		"\6\62\3\7\3\7\6\7\67\n\7\r\7\16\78\3\b\3\b\3\b\7\b>\n\b\f\b\16\bA\13\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0096\n\20\2\2\21\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21\3\2\7\4\2\13\13\"\"\4\2\f\f\17\17\7\2//\61;C\\aac|\3\2\u4e02\u9fcd"+
		"\7\2//\62;C\\aac|\2\u00a3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7&\3\2\2\2\t+\3\2\2\2\13\60\3\2\2\2\r\66"+
		"\3\2\2\2\17:\3\2\2\2\21B\3\2\2\2\23D\3\2\2\2\25F\3\2\2\2\27H\3\2\2\2\31"+
		"M\3\2\2\2\33X\3\2\2\2\35a\3\2\2\2\37\u0095\3\2\2\2!\"\7}\2\2\"\4\3\2\2"+
		"\2#$\7\177\2\2$\6\3\2\2\2%\'\t\2\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()"+
		"\3\2\2\2)\b\3\2\2\2*,\t\3\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2"+
		".\n\3\2\2\2/\61\t\4\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63"+
		"\3\2\2\2\63\f\3\2\2\2\64\67\5\23\n\2\65\67\5\21\t\2\66\64\3\2\2\2\66\65"+
		"\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29\16\3\2\2\2:?\5\r\7\2;<\7\""+
		"\2\2<>\5\r\7\2=;\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\20\3\2\2\2A?\3"+
		"\2\2\2BC\t\5\2\2C\22\3\2\2\2DE\t\6\2\2E\24\3\2\2\2FG\4\u2072\u2191\2G"+
		"\26\3\2\2\2HI\7B\2\2IJ\7c\2\2JK\7r\2\2KL\7k\2\2L\30\3\2\2\2MN\7B\2\2N"+
		"O\7c\2\2OP\7r\2\2PQ\7k\2\2QR\7F\2\2RS\7g\2\2ST\7h\2\2TU\7k\2\2UV\7p\2"+
		"\2VW\7g\2\2W\32\3\2\2\2XY\7B\2\2YZ\7c\2\2Z[\7r\2\2[\\\7k\2\2\\]\7P\2\2"+
		"]^\7c\2\2^_\7o\2\2_`\7g\2\2`\34\3\2\2\2ab\7B\2\2bc\7c\2\2cd\7r\2\2de\7"+
		"k\2\2ef\7I\2\2fg\7t\2\2gh\7q\2\2hi\7w\2\2ij\7r\2\2j\36\3\2\2\2kl\7I\2"+
		"\2lm\7G\2\2m\u0096\7V\2\2no\7R\2\2op\7Q\2\2pq\7U\2\2q\u0096\7V\2\2rs\7"+
		"F\2\2st\7G\2\2tu\7N\2\2uv\7G\2\2vw\7V\2\2w\u0096\7G\2\2xy\7J\2\2yz\7G"+
		"\2\2z{\7C\2\2{\u0096\7F\2\2|}\7\"\2\2}~\7V\2\2~\177\7T\2\2\177\u0080\7"+
		"C\2\2\u0080\u0081\7E\2\2\u0081\u0096\7G\2\2\u0082\u0083\7Q\2\2\u0083\u0084"+
		"\7R\2\2\u0084\u0085\7V\2\2\u0085\u0086\7K\2\2\u0086\u0087\7Q\2\2\u0087"+
		"\u0088\7P\2\2\u0088\u0096\7U\2\2\u0089\u008a\7E\2\2\u008a\u008b\7Q\2\2"+
		"\u008b\u008c\7P\2\2\u008c\u008d\7P\2\2\u008d\u008e\7G\2\2\u008e\u008f"+
		"\7E\2\2\u008f\u0096\7V\2\2\u0090\u0091\7R\2\2\u0091\u0092\7C\2\2\u0092"+
		"\u0093\7V\2\2\u0093\u0094\7E\2\2\u0094\u0096\7J\2\2\u0095k\3\2\2\2\u0095"+
		"n\3\2\2\2\u0095r\3\2\2\2\u0095x\3\2\2\2\u0095|\3\2\2\2\u0095\u0082\3\2"+
		"\2\2\u0095\u0089\3\2\2\2\u0095\u0090\3\2\2\2\u0096 \3\2\2\2\13\2(-\60"+
		"\62\668?\u0095\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}