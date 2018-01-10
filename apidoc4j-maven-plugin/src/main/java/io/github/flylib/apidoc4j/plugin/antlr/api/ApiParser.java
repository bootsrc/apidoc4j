// Generated from D:/git/flylib/apidoc4j/apidoc4j-maven-plugin/src/main/java\Api.g4 by ANTLR 4.7
package io.github.flylib.apidoc4j.plugin.antlr.api;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ApiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WS=3, NEWLINE=4, PATH=5, TEXT=6, TEXT_WITH_SPACE=7, CHINESE_CHAR=8, 
		EN_CHAR=9, XXX=10, API=11, APIDEFINE=12, APINAME=13, APIGROUP=14, REQUEST_METHOD_NAME=15;
	public static final int
		RULE_apidoc = 0, RULE_api = 1, RULE_apiName = 2, RULE_apiGroup = 3, RULE_method = 4, 
		RULE_path = 5, RULE_title = 6, RULE_name = 7;
	public static final String[] ruleNames = {
		"apidoc", "api", "apiName", "apiGroup", "method", "path", "title", "name"
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

	@Override
	public String getGrammarFileName() { return "Api.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ApiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ApidocContext extends ParserRuleContext {
		public List<ApiContext> api() {
			return getRuleContexts(ApiContext.class);
		}
		public ApiContext api(int i) {
			return getRuleContext(ApiContext.class,i);
		}
		public List<ApiNameContext> apiName() {
			return getRuleContexts(ApiNameContext.class);
		}
		public ApiNameContext apiName(int i) {
			return getRuleContext(ApiNameContext.class,i);
		}
		public List<ApiGroupContext> apiGroup() {
			return getRuleContexts(ApiGroupContext.class);
		}
		public ApiGroupContext apiGroup(int i) {
			return getRuleContext(ApiGroupContext.class,i);
		}
		public ApidocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apidoc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApiVisitor ) return ((ApiVisitor<? extends T>)visitor).visitApidoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApidocContext apidoc() throws RecognitionException {
		ApidocContext _localctx = new ApidocContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_apidoc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << API) | (1L << APINAME) | (1L << APIGROUP))) != 0)) {
				{
				setState(19);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case API:
					{
					setState(16);
					api();
					}
					break;
				case APINAME:
					{
					setState(17);
					apiName();
					}
					break;
				case APIGROUP:
					{
					setState(18);
					apiGroup();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(23);
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

	public static class ApiContext extends ParserRuleContext {
		public TerminalNode API() { return getToken(ApiParser.API, 0); }
		public List<TerminalNode> WS() { return getTokens(ApiParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ApiParser.WS, i);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ApiParser.NEWLINE, 0); }
		public ApiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_api; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApiVisitor ) return ((ApiVisitor<? extends T>)visitor).visitApi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApiContext api() throws RecognitionException {
		ApiContext _localctx = new ApiContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_api);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(API);
			setState(25);
			match(WS);
			setState(26);
			match(T__0);
			setState(27);
			method();
			setState(28);
			match(T__1);
			setState(29);
			match(WS);
			setState(30);
			path();
			setState(31);
			match(WS);
			setState(32);
			title();
			setState(33);
			match(NEWLINE);
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

	public static class ApiNameContext extends ParserRuleContext {
		public TerminalNode APINAME() { return getToken(ApiParser.APINAME, 0); }
		public TerminalNode WS() { return getToken(ApiParser.WS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ApiParser.NEWLINE, 0); }
		public ApiNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apiName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApiVisitor ) return ((ApiVisitor<? extends T>)visitor).visitApiName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApiNameContext apiName() throws RecognitionException {
		ApiNameContext _localctx = new ApiNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_apiName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(APINAME);
			setState(36);
			match(WS);
			setState(37);
			name();
			setState(38);
			match(NEWLINE);
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

	public static class ApiGroupContext extends ParserRuleContext {
		public TerminalNode APIGROUP() { return getToken(ApiParser.APIGROUP, 0); }
		public TerminalNode WS() { return getToken(ApiParser.WS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ApiParser.NEWLINE, 0); }
		public ApiGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apiGroup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApiVisitor ) return ((ApiVisitor<? extends T>)visitor).visitApiGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApiGroupContext apiGroup() throws RecognitionException {
		ApiGroupContext _localctx = new ApiGroupContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_apiGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(APIGROUP);
			setState(41);
			match(WS);
			setState(42);
			name();
			setState(43);
			match(NEWLINE);
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

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode REQUEST_METHOD_NAME() { return getToken(ApiParser.REQUEST_METHOD_NAME, 0); }
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApiVisitor ) return ((ApiVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(REQUEST_METHOD_NAME);
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
		public TerminalNode PATH() { return getToken(ApiParser.PATH, 0); }
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApiVisitor ) return ((ApiVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(PATH);
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
		public TerminalNode TEXT() { return getToken(ApiParser.TEXT, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApiVisitor ) return ((ApiVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(ApiParser.TEXT, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApiVisitor ) return ((ApiVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\218\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\t\2\2\n\2\4\6\b\n\f\16\20\2\2\2\62\2\27\3\2\2\2\4\32\3\2\2\2\6%\3\2\2"+
		"\2\b*\3\2\2\2\n/\3\2\2\2\f\61\3\2\2\2\16\63\3\2\2\2\20\65\3\2\2\2\22\26"+
		"\5\4\3\2\23\26\5\6\4\2\24\26\5\b\5\2\25\22\3\2\2\2\25\23\3\2\2\2\25\24"+
		"\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31\27"+
		"\3\2\2\2\32\33\7\r\2\2\33\34\7\5\2\2\34\35\7\3\2\2\35\36\5\n\6\2\36\37"+
		"\7\4\2\2\37 \7\5\2\2 !\5\f\7\2!\"\7\5\2\2\"#\5\16\b\2#$\7\6\2\2$\5\3\2"+
		"\2\2%&\7\17\2\2&\'\7\5\2\2\'(\5\20\t\2()\7\6\2\2)\7\3\2\2\2*+\7\20\2\2"+
		"+,\7\5\2\2,-\5\20\t\2-.\7\6\2\2.\t\3\2\2\2/\60\7\21\2\2\60\13\3\2\2\2"+
		"\61\62\7\7\2\2\62\r\3\2\2\2\63\64\7\b\2\2\64\17\3\2\2\2\65\66\7\b\2\2"+
		"\66\21\3\2\2\2\4\25\27";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}