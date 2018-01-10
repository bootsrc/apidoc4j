// Generated from E:/msgit/apidoc-root/apidoc-maven-plugin/src/main/java\ApiLexer.g4 by ANTLR 4.7
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
		ApiParam=1, ApiSuccess=2, ApiExample=3, TEXT=4;
	public static final int
		WHITESPACE=2, COMMENTS=3, APIPARAM=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "WHITESPACE", "COMMENTS", "APIPARAM"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ApiParam", "ApiSuccess", "ApiExample", "TEXT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@apiParam '", "'@apiSuccess '", "'@apiExample '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ApiParam", "ApiSuccess", "ApiExample", "TEXT"
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
	public String getGrammarFileName() { return "ApiLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\6\65\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\6\5\62\n\5\r\5\16\5\63\2\2\6\3\3"+
		"\5\4\7\5\t\6\3\2\3\3\2BB\2\65\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\3\13\3\2\2\2\5\26\3\2\2\2\7#\3\2\2\2\t\61\3\2\2\2\13\f\7B\2\2"+
		"\f\r\7c\2\2\r\16\7r\2\2\16\17\7k\2\2\17\20\7R\2\2\20\21\7c\2\2\21\22\7"+
		"t\2\2\22\23\7c\2\2\23\24\7o\2\2\24\25\7\"\2\2\25\4\3\2\2\2\26\27\7B\2"+
		"\2\27\30\7c\2\2\30\31\7r\2\2\31\32\7k\2\2\32\33\7U\2\2\33\34\7w\2\2\34"+
		"\35\7e\2\2\35\36\7e\2\2\36\37\7g\2\2\37 \7u\2\2 !\7u\2\2!\"\7\"\2\2\""+
		"\6\3\2\2\2#$\7B\2\2$%\7c\2\2%&\7r\2\2&\'\7k\2\2\'(\7G\2\2()\7z\2\2)*\7"+
		"c\2\2*+\7o\2\2+,\7r\2\2,-\7n\2\2-.\7g\2\2./\7\"\2\2/\b\3\2\2\2\60\62\n"+
		"\2\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\n\3"+
		"\2\2\2\4\2\63\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}