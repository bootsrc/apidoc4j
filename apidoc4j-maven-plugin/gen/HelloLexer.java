// Generated from E:/msgit/apidoc-root/apidoc-maven-plugin/src/main/java\Hello.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Api=1, ApiParam=2, ApiSuccess=3, ApiExample=4, TEXT=5, TEXT1=6, METHOD=7, 
		ID=8, PATH_VALUE=9, WS=10, STRING=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Api", "ApiParam", "ApiSuccess", "ApiExample", "TEXT", "TEXT1", "METHOD", 
		"ID", "PATH_VALUE", "WS", "STRING", "ESC", "UNICODE", "HEX"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@api '", "'@apiParam '", "'@apiSuccess '", "'@apiExample '", null, 
		"'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Api", "ApiParam", "ApiSuccess", "ApiExample", "TEXT", "TEXT1", 
		"METHOD", "ID", "PATH_VALUE", "WS", "STRING"
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


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rw\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\6\6L\n\6\r\6\16\6M\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\6\tX\n\t\r\t"+
		"\16\tY\3\n\3\n\3\n\3\13\6\13`\n\13\r\13\16\13a\3\f\3\f\7\ff\n\f\f\f\16"+
		"\fi\13\f\3\r\3\r\3\r\5\rn\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\2\33\2\35"+
		"\2\3\2\t\3\2BB\4\2C\\c|\4\2\f\fBB\5\2\13\f\17\17\"\"\4\2$$^^\n\2$$\61"+
		"\61^^ddhhppttvv\5\2\62;CHch\2y\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\3\37\3\2\2\2\5%\3\2\2\2\7\60\3\2\2\2\t=\3"+
		"\2\2\2\13K\3\2\2\2\rO\3\2\2\2\17Q\3\2\2\2\21W\3\2\2\2\23[\3\2\2\2\25_"+
		"\3\2\2\2\27g\3\2\2\2\31j\3\2\2\2\33o\3\2\2\2\35u\3\2\2\2\37 \7B\2\2 !"+
		"\7c\2\2!\"\7r\2\2\"#\7k\2\2#$\7\"\2\2$\4\3\2\2\2%&\7B\2\2&\'\7c\2\2\'"+
		"(\7r\2\2()\7k\2\2)*\7R\2\2*+\7c\2\2+,\7t\2\2,-\7c\2\2-.\7o\2\2./\7\"\2"+
		"\2/\6\3\2\2\2\60\61\7B\2\2\61\62\7c\2\2\62\63\7r\2\2\63\64\7k\2\2\64\65"+
		"\7U\2\2\65\66\7w\2\2\66\67\7e\2\2\678\7e\2\289\7g\2\29:\7u\2\2:;\7u\2"+
		"\2;<\7\"\2\2<\b\3\2\2\2=>\7B\2\2>?\7c\2\2?@\7r\2\2@A\7k\2\2AB\7G\2\2B"+
		"C\7z\2\2CD\7c\2\2DE\7o\2\2EF\7r\2\2FG\7n\2\2GH\7g\2\2HI\7\"\2\2I\n\3\2"+
		"\2\2JL\n\2\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\f\3\2\2\2OP\7"+
		"\f\2\2P\16\3\2\2\2QR\7}\2\2RS\5\27\f\2ST\7\177\2\2TU\5\25\13\2U\20\3\2"+
		"\2\2VX\t\3\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\22\3\2\2\2[\\"+
		"\n\4\2\2\\]\7\"\2\2]\24\3\2\2\2^`\t\5\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2"+
		"\2ab\3\2\2\2b\26\3\2\2\2cf\5\31\r\2df\n\6\2\2ec\3\2\2\2ed\3\2\2\2fi\3"+
		"\2\2\2ge\3\2\2\2gh\3\2\2\2h\30\3\2\2\2ig\3\2\2\2jm\7^\2\2kn\t\7\2\2ln"+
		"\5\33\16\2mk\3\2\2\2ml\3\2\2\2n\32\3\2\2\2op\7w\2\2pq\5\35\17\2qr\5\35"+
		"\17\2rs\5\35\17\2st\5\35\17\2t\34\3\2\2\2uv\t\b\2\2v\36\3\2\2\2\t\2MY"+
		"aegm\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}