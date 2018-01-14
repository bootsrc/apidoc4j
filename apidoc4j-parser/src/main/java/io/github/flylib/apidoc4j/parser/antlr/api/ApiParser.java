// Generated from D:/git/flylib/apidoc4j/apidoc4j-parser/src/main/antlr4\Api.g4 by ANTLR 4.7
package io.github.flylib.apidoc4j.parser.antlr.api;
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
		K_API=1, K_APIPARAM=2, K_APIPARAMEXAMPLE=3, K_APIDEFINE=4, K_APINAME=5, 
		K_APIGROUP=6, K_APIDESCRIPTION=7, K_APISUCCESS=8, K_APIVERSION=9, STRING_UNICODE=10, 
		PATH_VALUE=11, VERSION=12, OP_LPAREN=13, OP_RPAREN=14, OP_LBRACE=15, OP_RBRACE=16, 
		OP_LBRACK=17, OP_RBRACK=18, OP_BACK_SLASH=19, OP_AT=20, SPACE=21, ENTER=22, 
		DOT=23;
	public static final int
		RULE_apidoc = 0, RULE_otherComment = 1, RULE_fieldExpr = 2, RULE_fieldString = 3, 
		RULE_fieldApi = 4, RULE_fieldApiName = 5, RULE_fieldApiParam = 6, RULE_fieldApiParamExample = 7, 
		RULE_fieldApiSuccess = 8, RULE_fieldApiVersion = 9, RULE_name = 10, RULE_method = 11, 
		RULE_path = 12, RULE_title = 13, RULE_group = 14, RULE_type = 15, RULE_field = 16, 
		RULE_description = 17, RULE_paramTitle = 18, RULE_example = 19, RULE_version = 20, 
		RULE_multiText = 21;
	public static final String[] ruleNames = {
		"apidoc", "otherComment", "fieldExpr", "fieldString", "fieldApi", "fieldApiName", 
		"fieldApiParam", "fieldApiParamExample", "fieldApiSuccess", "fieldApiVersion", 
		"name", "method", "path", "title", "group", "type", "field", "description", 
		"paramTitle", "example", "version", "multiText"
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
		public OtherCommentContext otherComment() {
			return getRuleContext(OtherCommentContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ApiParser.EOF, 0); }
		public List<FieldExprContext> fieldExpr() {
			return getRuleContexts(FieldExprContext.class);
		}
		public FieldExprContext fieldExpr(int i) {
			return getRuleContext(FieldExprContext.class,i);
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
			setState(44);
			otherComment();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AT) {
				{
				{
				setState(45);
				fieldExpr();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(EOF);
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

	public static class OtherCommentContext extends ParserRuleContext {
		public List<MultiTextContext> multiText() {
			return getRuleContexts(MultiTextContext.class);
		}
		public MultiTextContext multiText(int i) {
			return getRuleContext(MultiTextContext.class,i);
		}
		public List<TerminalNode> ENTER() { return getTokens(ApiParser.ENTER); }
		public TerminalNode ENTER(int i) {
			return getToken(ApiParser.ENTER, i);
		}
		public OtherCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherComment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApiVisitor ) return ((ApiVisitor<? extends T>)visitor).visitOtherComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherCommentContext otherComment() throws RecognitionException {
		OtherCommentContext _localctx = new OtherCommentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_otherComment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			multiText();
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(55); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(54);
						match(ENTER);
						}
						}
						setState(57); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==ENTER );
					setState(59);
					multiText();
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				match(ENTER);
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ENTER );
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

	public static class FieldExprContext extends ParserRuleContext {
		public TerminalNode OP_AT() { return getToken(ApiParser.OP_AT, 0); }
		public FieldStringContext fieldString() {
			return getRuleContext(FieldStringContext.class,0);
		}
		public List<TerminalNode> ENTER() { return getTokens(ApiParser.ENTER); }
		public TerminalNode ENTER(int i) {
			return getToken(ApiParser.ENTER, i);
		}
		public FieldExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApiVisitor ) return ((ApiVisitor<? extends T>)visitor).visitFieldExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldExprContext fieldExpr() throws RecognitionException {
		FieldExprContext _localctx = new FieldExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fieldExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(OP_AT);
			setState(71);
			fieldString();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENTER) {
				{
				{
				setState(72);
				match(ENTER);
				}
				}
				setState(77);
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

	public static class FieldStringContext extends ParserRuleContext {
		public FieldApiContext fieldApi() {
			return getRuleContext(FieldApiContext.class,0);
		}
		public FieldApiNameContext fieldApiName() {
			return getRuleContext(FieldApiNameContext.class,0);
		}
		public FieldApiParamContext fieldApiParam() {
			return getRuleContext(FieldApiParamContext.class,0);
		}
		public FieldApiParamExampleContext fieldApiParamExample() {
			return getRuleContext(FieldApiParamExampleContext.class,0);
		}
		public FieldApiSuccessContext fieldApiSuccess() {
			return getRuleContext(FieldApiSuccessContext.class,0);
		}
		public FieldApiVersionContext fieldApiVersion() {
			return getRuleContext(FieldApiVersionContext.class,0);
		}
		public FieldStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldString; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApiVisitor ) return ((ApiVisitor<? extends T>)visitor).visitFieldString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldStringContext fieldString() throws RecognitionException {
		FieldStringContext _localctx = new FieldStringContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fieldString);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_API:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				fieldApi();
				}
				break;
			case K_APINAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				fieldApiName();
				}
				break;
			case K_APIPARAM:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				fieldApiParam();
				}
				break;
			case K_APIPARAMEXAMPLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				fieldApiParamExample();
				}
				break;
			case K_APISUCCESS:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				fieldApiSuccess();
				}
				break;
			case K_APIVERSION:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				fieldApiVersion();
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

	public static class FieldApiContext extends ParserRuleContext {
		public TerminalNode K_API() { return getToken(ApiParser.K_API, 0); }
		public TerminalNode OP_LBRACE() { return getToken(ApiParser.OP_LBRACE, 0); }
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public TerminalNode OP_RBRACE() { return getToken(ApiParser.OP_RBRACE, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(ApiParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(ApiParser.SPACE, i);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public FieldApiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldApi; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApiVisitor ) return ((ApiVisitor<? extends T>)visitor).visitFieldApi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldApiContext fieldApi() throws RecognitionException {
		FieldApiContext _localctx = new FieldApiContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fieldApi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(K_API);
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(87);
				match(SPACE);
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(92);
			match(OP_LBRACE);
			setState(93);
			method();
			setState(94);
			match(OP_RBRACE);
			setState(96); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(95);
				match(SPACE);
				}
				}
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(100);
			path();
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(101);
					match(SPACE);
					}
					}
					setState(104); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SPACE );
				setState(106);
				title();
				}
				break;
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(109);
				match(SPACE);
				}
				}
				setState(114);
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

	public static class FieldApiNameContext extends ParserRuleContext {
		public TerminalNode K_APINAME() { return getToken(ApiParser.K_APINAME, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(ApiParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(ApiParser.SPACE, i);
		}
		public FieldApiNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldApiName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApiVisitor ) return ((ApiVisitor<? extends T>)visitor).visitFieldApiName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldApiNameContext fieldApiName() throws RecognitionException {
		FieldApiNameContext _localctx = new FieldApiNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fieldApiName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(K_APINAME);
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				match(SPACE);
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(121);
			name();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(122);
				match(SPACE);
				}
				}
				setState(127);
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

	public static class FieldApiParamContext extends ParserRuleContext {
		public TerminalNode K_APIPARAM() { return getToken(ApiParser.K_APIPARAM, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(ApiParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(ApiParser.SPACE, i);
		}
		public TerminalNode OP_LPAREN() { return getToken(ApiParser.OP_LPAREN, 0); }
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public TerminalNode OP_RPAREN() { return getToken(ApiParser.OP_RPAREN, 0); }
		public TerminalNode OP_LBRACE() { return getToken(ApiParser.OP_LBRACE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OP_RBRACE() { return getToken(ApiParser.OP_RBRACE, 0); }
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public FieldApiParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldApiParam; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApiVisitor ) return ((ApiVisitor<? extends T>)visitor).visitFieldApiParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldApiParamContext fieldApiParam() throws RecognitionException {
		FieldApiParamContext _localctx = new FieldApiParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fieldApiParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(K_APIPARAM);
			setState(130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129);
				match(SPACE);
				}
				}
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_LPAREN) {
				{
				setState(134);
				match(OP_LPAREN);
				setState(135);
				group();
				setState(136);
				match(OP_RPAREN);
				}
			}

			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_LBRACE) {
				{
				setState(140);
				match(OP_LBRACE);
				setState(141);
				type();
				setState(142);
				match(OP_RBRACE);
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(143);
					match(SPACE);
					}
					}
					setState(146); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SPACE );
				}
			}

			setState(150);
			field();
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(151);
					match(SPACE);
					}
					}
					setState(154); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SPACE );
				setState(156);
				description();
				}
				break;
			}
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(159);
				match(SPACE);
				}
				}
				setState(164);
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

	public static class FieldApiParamExampleContext extends ParserRuleContext {
		public TerminalNode K_APIPARAMEXAMPLE() { return getToken(ApiParser.K_APIPARAMEXAMPLE, 0); }
		public ExampleContext example() {
			return getRuleContext(ExampleContext.class,0);
		}
		public TerminalNode OP_LBRACE() { return getToken(ApiParser.OP_LBRACE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OP_RBRACE() { return getToken(ApiParser.OP_RBRACE, 0); }
		public ParamTitleContext paramTitle() {
			return getRuleContext(ParamTitleContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(ApiParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(ApiParser.SPACE, i);
		}
		public FieldApiParamExampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldApiParamExample; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApiVisitor ) return ((ApiVisitor<? extends T>)visitor).visitFieldApiParamExample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldApiParamExampleContext fieldApiParamExample() throws RecognitionException {
		FieldApiParamExampleContext _localctx = new FieldApiParamExampleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldApiParamExample);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(K_APIPARAMEXAMPLE);
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(166);
					match(SPACE);
					}
					}
					setState(169); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SPACE );
				setState(171);
				match(OP_LBRACE);
				setState(172);
				type();
				setState(173);
				match(OP_RBRACE);
				}
				break;
			}
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(177);
					match(SPACE);
					}
					}
					setState(180); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SPACE );
				setState(182);
				paramTitle();
				}
			}

			setState(185);
			example();
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

	public static class FieldApiSuccessContext extends ParserRuleContext {
		public TerminalNode K_APISUCCESS() { return getToken(ApiParser.K_APISUCCESS, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(ApiParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(ApiParser.SPACE, i);
		}
		public TerminalNode OP_LPAREN() { return getToken(ApiParser.OP_LPAREN, 0); }
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public TerminalNode OP_RPAREN() { return getToken(ApiParser.OP_RPAREN, 0); }
		public TerminalNode OP_LBRACE() { return getToken(ApiParser.OP_LBRACE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OP_RBRACE() { return getToken(ApiParser.OP_RBRACE, 0); }
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public FieldApiSuccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldApiSuccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApiVisitor ) return ((ApiVisitor<? extends T>)visitor).visitFieldApiSuccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldApiSuccessContext fieldApiSuccess() throws RecognitionException {
		FieldApiSuccessContext _localctx = new FieldApiSuccessContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fieldApiSuccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(K_APISUCCESS);
			setState(189); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(188);
				match(SPACE);
				}
				}
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_LPAREN) {
				{
				setState(193);
				match(OP_LPAREN);
				setState(194);
				group();
				setState(195);
				match(OP_RPAREN);
				}
			}

			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_LBRACE) {
				{
				setState(199);
				match(OP_LBRACE);
				setState(200);
				type();
				setState(201);
				match(OP_RBRACE);
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(202);
					match(SPACE);
					}
					}
					setState(205); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SPACE );
				}
			}

			setState(209);
			field();
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(211); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(210);
					match(SPACE);
					}
					}
					setState(213); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SPACE );
				setState(215);
				description();
				}
				break;
			}
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(218);
				match(SPACE);
				}
				}
				setState(223);
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

	public static class FieldApiVersionContext extends ParserRuleContext {
		public TerminalNode K_APIVERSION() { return getToken(ApiParser.K_APIVERSION, 0); }
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(ApiParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(ApiParser.SPACE, i);
		}
		public FieldApiVersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldApiVersion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApiVisitor ) return ((ApiVisitor<? extends T>)visitor).visitFieldApiVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldApiVersionContext fieldApiVersion() throws RecognitionException {
		FieldApiVersionContext _localctx = new FieldApiVersionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fieldApiVersion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(K_APIVERSION);
			setState(226); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(225);
				match(SPACE);
				}
				}
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(230);
			version();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(231);
				match(SPACE);
				}
				}
				setState(236);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode STRING_UNICODE() { return getToken(ApiParser.STRING_UNICODE, 0); }
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
		enterRule(_localctx, 20, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(STRING_UNICODE);
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
		public TerminalNode STRING_UNICODE() { return getToken(ApiParser.STRING_UNICODE, 0); }
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
		enterRule(_localctx, 22, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(STRING_UNICODE);
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
		public TerminalNode PATH_VALUE() { return getToken(ApiParser.PATH_VALUE, 0); }
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
		enterRule(_localctx, 24, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
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
		public MultiTextContext multiText() {
			return getRuleContext(MultiTextContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			multiText();
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

	public static class GroupContext extends ParserRuleContext {
		public TerminalNode STRING_UNICODE() { return getToken(ApiParser.STRING_UNICODE, 0); }
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApiVisitor ) return ((ApiVisitor<? extends T>)visitor).visitGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(STRING_UNICODE);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode STRING_UNICODE() { return getToken(ApiParser.STRING_UNICODE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApiVisitor ) return ((ApiVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(STRING_UNICODE);
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
		public TerminalNode STRING_UNICODE() { return getToken(ApiParser.STRING_UNICODE, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApiVisitor ) return ((ApiVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(STRING_UNICODE);
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

	public static class DescriptionContext extends ParserRuleContext {
		public MultiTextContext multiText() {
			return getRuleContext(MultiTextContext.class,0);
		}
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApiVisitor ) return ((ApiVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			multiText();
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

	public static class ParamTitleContext extends ParserRuleContext {
		public MultiTextContext multiText() {
			return getRuleContext(MultiTextContext.class,0);
		}
		public ParamTitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramTitle; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApiVisitor ) return ((ApiVisitor<? extends T>)visitor).visitParamTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamTitleContext paramTitle() throws RecognitionException {
		ParamTitleContext _localctx = new ParamTitleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_paramTitle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			multiText();
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

	public static class ExampleContext extends ParserRuleContext {
		public MultiTextContext multiText() {
			return getRuleContext(MultiTextContext.class,0);
		}
		public List<TerminalNode> ENTER() { return getTokens(ApiParser.ENTER); }
		public TerminalNode ENTER(int i) {
			return getToken(ApiParser.ENTER, i);
		}
		public ExampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_example; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApiVisitor ) return ((ApiVisitor<? extends T>)visitor).visitExample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExampleContext example() throws RecognitionException {
		ExampleContext _localctx = new ExampleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_example);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(255);
				match(ENTER);
				}
				}
				setState(258); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ENTER );
			setState(260);
			multiText();
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

	public static class VersionContext extends ParserRuleContext {
		public TerminalNode VERSION() { return getToken(ApiParser.VERSION, 0); }
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApiVisitor ) return ((ApiVisitor<? extends T>)visitor).visitVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_version);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(VERSION);
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

	public static class MultiTextContext extends ParserRuleContext {
		public List<TerminalNode> STRING_UNICODE() { return getTokens(ApiParser.STRING_UNICODE); }
		public TerminalNode STRING_UNICODE(int i) {
			return getToken(ApiParser.STRING_UNICODE, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(ApiParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(ApiParser.SPACE, i);
		}
		public MultiTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiText; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApiVisitor ) return ((ApiVisitor<? extends T>)visitor).visitMultiText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiTextContext multiText() throws RecognitionException {
		MultiTextContext _localctx = new MultiTextContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multiText);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(STRING_UNICODE);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(266); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(265);
						match(SPACE);
						}
						}
						setState(268); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SPACE );
					setState(270);
					match(STRING_UNICODE);
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u0117\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\7\2\61\n\2"+
		"\f\2\16\2\64\13\2\3\2\3\2\3\3\3\3\6\3:\n\3\r\3\16\3;\3\3\7\3?\n\3\f\3"+
		"\16\3B\13\3\3\3\6\3E\n\3\r\3\16\3F\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5W\n\5\3\6\3\6\6\6[\n\6\r\6\16\6\\\3\6\3\6"+
		"\3\6\3\6\6\6c\n\6\r\6\16\6d\3\6\3\6\6\6i\n\6\r\6\16\6j\3\6\5\6n\n\6\3"+
		"\6\7\6q\n\6\f\6\16\6t\13\6\3\7\3\7\6\7x\n\7\r\7\16\7y\3\7\3\7\7\7~\n\7"+
		"\f\7\16\7\u0081\13\7\3\b\3\b\6\b\u0085\n\b\r\b\16\b\u0086\3\b\3\b\3\b"+
		"\3\b\5\b\u008d\n\b\3\b\3\b\3\b\3\b\6\b\u0093\n\b\r\b\16\b\u0094\5\b\u0097"+
		"\n\b\3\b\3\b\6\b\u009b\n\b\r\b\16\b\u009c\3\b\5\b\u00a0\n\b\3\b\7\b\u00a3"+
		"\n\b\f\b\16\b\u00a6\13\b\3\t\3\t\6\t\u00aa\n\t\r\t\16\t\u00ab\3\t\3\t"+
		"\3\t\3\t\5\t\u00b2\n\t\3\t\6\t\u00b5\n\t\r\t\16\t\u00b6\3\t\5\t\u00ba"+
		"\n\t\3\t\3\t\3\n\3\n\6\n\u00c0\n\n\r\n\16\n\u00c1\3\n\3\n\3\n\3\n\5\n"+
		"\u00c8\n\n\3\n\3\n\3\n\3\n\6\n\u00ce\n\n\r\n\16\n\u00cf\5\n\u00d2\n\n"+
		"\3\n\3\n\6\n\u00d6\n\n\r\n\16\n\u00d7\3\n\5\n\u00db\n\n\3\n\7\n\u00de"+
		"\n\n\f\n\16\n\u00e1\13\n\3\13\3\13\6\13\u00e5\n\13\r\13\16\13\u00e6\3"+
		"\13\3\13\7\13\u00eb\n\13\f\13\16\13\u00ee\13\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\6"+
		"\25\u0103\n\25\r\25\16\25\u0104\3\25\3\25\3\26\3\26\3\27\3\27\6\27\u010d"+
		"\n\27\r\27\16\27\u010e\3\27\7\27\u0112\n\27\f\27\16\27\u0115\13\27\3\27"+
		"\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\2\2\u0128\2."+
		"\3\2\2\2\4\67\3\2\2\2\6H\3\2\2\2\bV\3\2\2\2\nX\3\2\2\2\fu\3\2\2\2\16\u0082"+
		"\3\2\2\2\20\u00a7\3\2\2\2\22\u00bd\3\2\2\2\24\u00e2\3\2\2\2\26\u00ef\3"+
		"\2\2\2\30\u00f1\3\2\2\2\32\u00f3\3\2\2\2\34\u00f5\3\2\2\2\36\u00f7\3\2"+
		"\2\2 \u00f9\3\2\2\2\"\u00fb\3\2\2\2$\u00fd\3\2\2\2&\u00ff\3\2\2\2(\u0102"+
		"\3\2\2\2*\u0108\3\2\2\2,\u010a\3\2\2\2.\62\5\4\3\2/\61\5\6\4\2\60/\3\2"+
		"\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2"+
		"\2\2\65\66\7\2\2\3\66\3\3\2\2\2\67@\5,\27\28:\7\30\2\298\3\2\2\2:;\3\2"+
		"\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=?\5,\27\2>9\3\2\2\2?B\3\2\2\2@>\3\2"+
		"\2\2@A\3\2\2\2AD\3\2\2\2B@\3\2\2\2CE\7\30\2\2DC\3\2\2\2EF\3\2\2\2FD\3"+
		"\2\2\2FG\3\2\2\2G\5\3\2\2\2HI\7\26\2\2IM\5\b\5\2JL\7\30\2\2KJ\3\2\2\2"+
		"LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\7\3\2\2\2OM\3\2\2\2PW\5\n\6\2QW\5\f\7"+
		"\2RW\5\16\b\2SW\5\20\t\2TW\5\22\n\2UW\5\24\13\2VP\3\2\2\2VQ\3\2\2\2VR"+
		"\3\2\2\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\t\3\2\2\2XZ\7\3\2\2Y[\7\27\2\2"+
		"ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\21\2\2_`\5\30"+
		"\r\2`b\7\22\2\2ac\7\27\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2ef\3"+
		"\2\2\2fm\5\32\16\2gi\7\27\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2"+
		"kl\3\2\2\2ln\5\34\17\2mh\3\2\2\2mn\3\2\2\2nr\3\2\2\2oq\7\27\2\2po\3\2"+
		"\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\13\3\2\2\2tr\3\2\2\2uw\7\7\2\2vx\7"+
		"\27\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{\177\5\26\f"+
		"\2|~\7\27\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2"+
		"\u0080\r\3\2\2\2\u0081\177\3\2\2\2\u0082\u0084\7\4\2\2\u0083\u0085\7\27"+
		"\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u008c\3\2\2\2\u0088\u0089\7\17\2\2\u0089\u008a\5"+
		"\36\20\2\u008a\u008b\7\20\2\2\u008b\u008d\3\2\2\2\u008c\u0088\3\2\2\2"+
		"\u008c\u008d\3\2\2\2\u008d\u0096\3\2\2\2\u008e\u008f\7\21\2\2\u008f\u0090"+
		"\5 \21\2\u0090\u0092\7\22\2\2\u0091\u0093\7\27\2\2\u0092\u0091\3\2\2\2"+
		"\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097"+
		"\3\2\2\2\u0096\u008e\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u009f\5\"\22\2\u0099\u009b\7\27\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3"+
		"\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a0\5$\23\2\u009f\u009a\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a4\3\2"+
		"\2\2\u00a1\u00a3\7\27\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\17\3\2\2\2\u00a6\u00a4\3\2\2"+
		"\2\u00a7\u00b1\7\5\2\2\u00a8\u00aa\7\27\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00ae\7\21\2\2\u00ae\u00af\5 \21\2\u00af\u00b0\7\22\2\2\u00b0"+
		"\u00b2\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b9\3\2"+
		"\2\2\u00b3\u00b5\7\27\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\5&"+
		"\24\2\u00b9\u00b4\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\5(\25\2\u00bc\21\3\2\2\2\u00bd\u00bf\7\n\2\2\u00be\u00c0\7\27\2"+
		"\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\u00c7\3\2\2\2\u00c3\u00c4\7\17\2\2\u00c4\u00c5\5\36\20"+
		"\2\u00c5\u00c6\7\20\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00d1\3\2\2\2\u00c9\u00ca\7\21\2\2\u00ca\u00cb\5"+
		" \21\2\u00cb\u00cd\7\22\2\2\u00cc\u00ce\7\27\2\2\u00cd\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2"+
		"\2\2\u00d1\u00c9\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00da\5\"\22\2\u00d4\u00d6\7\27\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3"+
		"\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00db\5$\23\2\u00da\u00d5\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00df\3\2"+
		"\2\2\u00dc\u00de\7\27\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\23\3\2\2\2\u00e1\u00df\3\2\2"+
		"\2\u00e2\u00e4\7\13\2\2\u00e3\u00e5\7\27\2\2\u00e4\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00ec\5*\26\2\u00e9\u00eb\7\27\2\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\25\3\2\2"+
		"\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7\f\2\2\u00f0\27\3\2\2\2\u00f1\u00f2"+
		"\7\f\2\2\u00f2\31\3\2\2\2\u00f3\u00f4\7\r\2\2\u00f4\33\3\2\2\2\u00f5\u00f6"+
		"\5,\27\2\u00f6\35\3\2\2\2\u00f7\u00f8\7\f\2\2\u00f8\37\3\2\2\2\u00f9\u00fa"+
		"\7\f\2\2\u00fa!\3\2\2\2\u00fb\u00fc\7\f\2\2\u00fc#\3\2\2\2\u00fd\u00fe"+
		"\5,\27\2\u00fe%\3\2\2\2\u00ff\u0100\5,\27\2\u0100\'\3\2\2\2\u0101\u0103"+
		"\7\30\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2"+
		"\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\5,\27\2\u0107)\3"+
		"\2\2\2\u0108\u0109\7\16\2\2\u0109+\3\2\2\2\u010a\u0113\7\f\2\2\u010b\u010d"+
		"\7\27\2\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2"+
		"\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\7\f\2\2\u0111\u010c"+
		"\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"-\3\2\2\2\u0115\u0113\3\2\2\2&\62;@FMV\\djmry\177\u0086\u008c\u0094\u0096"+
		"\u009c\u009f\u00a4\u00ab\u00b1\u00b6\u00b9\u00c1\u00c7\u00cf\u00d1\u00d7"+
		"\u00da\u00df\u00e6\u00ec\u0104\u010e\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}