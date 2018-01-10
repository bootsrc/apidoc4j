// Generated from E:/msgit/apidoc-root/apidoc-maven-plugin/src/main/java\Hello.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Api=1, ApiParam=2, ApiSuccess=3, ApiExample=4, TEXT=5, TEXT1=6, METHOD=7, 
		ID=8, PATH_VALUE=9, WS=10, STRING=11;
	public static final int
		RULE_root = 0, RULE_field = 1, RULE_api = 2, RULE_apiParam = 3, RULE_apiSuccess = 4, 
		RULE_apiExample = 5, RULE_apiContent = 6, RULE_path = 7, RULE_title = 8;
	public static final String[] ruleNames = {
		"root", "field", "api", "apiParam", "apiSuccess", "apiExample", "apiContent", 
		"path", "title"
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

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(HelloParser.TEXT, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(TEXT);
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Api) | (1L << ApiParam) | (1L << ApiSuccess) | (1L << ApiExample))) != 0)) {
				{
				{
				setState(19);
				field();
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public ApiContext api() {
			return getRuleContext(ApiContext.class,0);
		}
		public ApiParamContext apiParam() {
			return getRuleContext(ApiParamContext.class,0);
		}
		public ApiSuccessContext apiSuccess() {
			return getRuleContext(ApiSuccessContext.class,0);
		}
		public ApiExampleContext apiExample() {
			return getRuleContext(ApiExampleContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Api:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				api();
				}
				break;
			case ApiParam:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				apiParam();
				}
				break;
			case ApiSuccess:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				apiSuccess();
				}
				break;
			case ApiExample:
				enterOuterAlt(_localctx, 4);
				{
				setState(28);
				apiExample();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ApiContext extends ParserRuleContext {
		public TerminalNode Api() { return getToken(HelloParser.Api, 0); }
		public ApiContentContext apiContent() {
			return getRuleContext(ApiContentContext.class,0);
		}
		public ApiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_api; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterApi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitApi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitApi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApiContext api() throws RecognitionException {
		ApiContext _localctx = new ApiContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_api);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(Api);
			setState(32);
			apiContent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ApiParamContext extends ParserRuleContext {
		public TerminalNode ApiParam() { return getToken(HelloParser.ApiParam, 0); }
		public TerminalNode TEXT() { return getToken(HelloParser.TEXT, 0); }
		public ApiParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apiParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterApiParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitApiParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitApiParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApiParamContext apiParam() throws RecognitionException {
		ApiParamContext _localctx = new ApiParamContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_apiParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(ApiParam);
			setState(35);
			match(TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ApiSuccessContext extends ParserRuleContext {
		public TerminalNode ApiSuccess() { return getToken(HelloParser.ApiSuccess, 0); }
		public TerminalNode TEXT() { return getToken(HelloParser.TEXT, 0); }
		public ApiSuccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apiSuccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterApiSuccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitApiSuccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitApiSuccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApiSuccessContext apiSuccess() throws RecognitionException {
		ApiSuccessContext _localctx = new ApiSuccessContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_apiSuccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(ApiSuccess);
			setState(38);
			match(TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ApiExampleContext extends ParserRuleContext {
		public TerminalNode ApiExample() { return getToken(HelloParser.ApiExample, 0); }
		public TerminalNode TEXT() { return getToken(HelloParser.TEXT, 0); }
		public ApiExampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apiExample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterApiExample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitApiExample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitApiExample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApiExampleContext apiExample() throws RecognitionException {
		ApiExampleContext _localctx = new ApiExampleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_apiExample);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(ApiExample);
			setState(41);
			match(TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ApiContentContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(HelloParser.METHOD, 0); }
		public ApiContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apiContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterApiContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitApiContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitApiContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApiContentContext apiContent() throws RecognitionException {
		ApiContentContext _localctx = new ApiContentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_apiContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(METHOD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public TerminalNode PATH_VALUE() { return getToken(HelloParser.PATH_VALUE, 0); }
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(PATH_VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_title);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(ID);
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(48);
					matchWildcard();
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(54);
			match(TEXT1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r;\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\7\2"+
		"\27\n\2\f\2\16\2\32\13\2\3\3\3\3\3\3\3\3\5\3 \n\3\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\7\n\64\n\n\f\n\16"+
		"\n\67\13\n\3\n\3\n\3\n\3\65\2\13\2\4\6\b\n\f\16\20\22\2\2\2\66\2\24\3"+
		"\2\2\2\4\37\3\2\2\2\6!\3\2\2\2\b$\3\2\2\2\n\'\3\2\2\2\f*\3\2\2\2\16-\3"+
		"\2\2\2\20/\3\2\2\2\22\61\3\2\2\2\24\30\7\7\2\2\25\27\5\4\3\2\26\25\3\2"+
		"\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\3\3\2\2\2\32\30\3\2"+
		"\2\2\33 \5\6\4\2\34 \5\b\5\2\35 \5\n\6\2\36 \5\f\7\2\37\33\3\2\2\2\37"+
		"\34\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2 \5\3\2\2\2!\"\7\3\2\2\"#\5\16"+
		"\b\2#\7\3\2\2\2$%\7\4\2\2%&\7\7\2\2&\t\3\2\2\2\'(\7\5\2\2()\7\7\2\2)\13"+
		"\3\2\2\2*+\7\6\2\2+,\7\7\2\2,\r\3\2\2\2-.\7\t\2\2.\17\3\2\2\2/\60\7\13"+
		"\2\2\60\21\3\2\2\2\61\65\7\n\2\2\62\64\13\2\2\2\63\62\3\2\2\2\64\67\3"+
		"\2\2\2\65\66\3\2\2\2\65\63\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7\b\2\2"+
		"9\23\3\2\2\2\5\30\37\65";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}