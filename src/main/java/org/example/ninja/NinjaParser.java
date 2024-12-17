// Generated from src/main/java/org/example/ninja/Ninja.g4 by ANTLR 4.13.2

package org.example.ninja;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class NinjaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, SIMPLE_IDENTIFY=13, IDENTIFY=14, VALUE=15, 
		WS=16, NL=17;
	public static final int
		RULE_ninja = 0, RULE_assign = 1, RULE_variable = 2, RULE_rule = 3, RULE_rule_name = 4, 
		RULE_pool = 5, RULE_pool_name = 6, RULE_build = 7, RULE_target = 8, RULE_depdency = 9, 
		RULE_build_values = 10, RULE_build_value = 11, RULE_build_rule = 12, RULE_scope = 13, 
		RULE_scope_line = 14, RULE_scope_assign = 15, RULE_scope_variable = 16, 
		RULE_comment = 17, RULE_include = 18, RULE_submodule = 19, RULE_file = 20, 
		RULE_default = 21, RULE_assign_value_lines = 22, RULE_assign_value_line = 23, 
		RULE_assign_values = 24, RULE_values = 25, RULE_value = 26, RULE_escape = 27, 
		RULE_escape_nl = 28, RULE_identify = 29, RULE_keyword = 30, RULE_ws = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"ninja", "assign", "variable", "rule", "rule_name", "pool", "pool_name", 
			"build", "target", "depdency", "build_values", "build_value", "build_rule", 
			"scope", "scope_line", "scope_assign", "scope_variable", "comment", "include", 
			"submodule", "file", "default", "assign_value_lines", "assign_value_line", 
			"assign_values", "values", "value", "escape", "escape_nl", "identify", 
			"keyword", "ws"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'rule'", "'pool'", "'build'", "':'", "'#'", "'include'", 
			"'submodule'", "'default'", "'$'", "'${'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "SIMPLE_IDENTIFY", "IDENTIFY", "VALUE", "WS", "NL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Ninja.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NinjaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NinjaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(NinjaParser.EOF, 0); }
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<RuleContext> rule_() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule_(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public List<PoolContext> pool() {
			return getRuleContexts(PoolContext.class);
		}
		public PoolContext pool(int i) {
			return getRuleContext(PoolContext.class,i);
		}
		public List<BuildContext> build() {
			return getRuleContexts(BuildContext.class);
		}
		public BuildContext build(int i) {
			return getRuleContext(BuildContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<IncludeContext> include() {
			return getRuleContexts(IncludeContext.class);
		}
		public IncludeContext include(int i) {
			return getRuleContext(IncludeContext.class,i);
		}
		public List<SubmoduleContext> submodule() {
			return getRuleContexts(SubmoduleContext.class);
		}
		public SubmoduleContext submodule(int i) {
			return getRuleContext(SubmoduleContext.class,i);
		}
		public List<DefaultContext> default_() {
			return getRuleContexts(DefaultContext.class);
		}
		public DefaultContext default_(int i) {
			return getRuleContext(DefaultContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(NinjaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(NinjaParser.NL, i);
		}
		public NinjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ninja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterNinja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitNinja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitNinja(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NinjaContext ninja() throws RecognitionException {
		NinjaContext _localctx = new NinjaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ninja);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 156636L) != 0)) {
				{
				setState(73);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SIMPLE_IDENTIFY:
				case IDENTIFY:
					{
					setState(64);
					assign();
					}
					break;
				case T__1:
					{
					setState(65);
					rule_();
					}
					break;
				case T__2:
					{
					setState(66);
					pool();
					}
					break;
				case T__3:
					{
					setState(67);
					build();
					}
					break;
				case T__5:
					{
					setState(68);
					comment();
					}
					break;
				case T__6:
					{
					setState(69);
					include();
					}
					break;
				case T__7:
					{
					setState(70);
					submodule();
					}
					break;
				case T__8:
					{
					setState(71);
					default_();
					}
					break;
				case NL:
					{
					setState(72);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Assign_value_linesContext assign_value_lines() {
			return getRuleContext(Assign_value_linesContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			variable();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(81);
				ws();
				}
			}

			setState(84);
			match(T__0);
			setState(85);
			assign_value_lines();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public IdentifyContext identify() {
			return getRuleContext(IdentifyContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			identify();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RuleContext extends ParserRuleContext {
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public Rule_nameContext rule_name() {
			return getRuleContext(Rule_nameContext.class,0);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContext rule_() throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__1);
			setState(90);
			ws();
			setState(91);
			rule_name();
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(92);
				scope();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Rule_nameContext extends ParserRuleContext {
		public IdentifyContext identify() {
			return getRuleContext(IdentifyContext.class,0);
		}
		public Rule_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterRule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitRule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitRule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_nameContext rule_name() throws RecognitionException {
		Rule_nameContext _localctx = new Rule_nameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rule_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			identify();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PoolContext extends ParserRuleContext {
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public Pool_nameContext pool_name() {
			return getRuleContext(Pool_nameContext.class,0);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public PoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterPool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitPool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitPool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PoolContext pool() throws RecognitionException {
		PoolContext _localctx = new PoolContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__2);
			setState(98);
			ws();
			setState(99);
			pool_name();
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(100);
				scope();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pool_nameContext extends ParserRuleContext {
		public IdentifyContext identify() {
			return getRuleContext(IdentifyContext.class,0);
		}
		public Pool_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pool_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterPool_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitPool_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitPool_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pool_nameContext pool_name() throws RecognitionException {
		Pool_nameContext _localctx = new Pool_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pool_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			identify();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BuildContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public Build_ruleContext build_rule() {
			return getRuleContext(Build_ruleContext.class,0);
		}
		public DepdencyContext depdency() {
			return getRuleContext(DepdencyContext.class,0);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public BuildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterBuild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitBuild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitBuild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildContext build() throws RecognitionException {
		BuildContext _localctx = new BuildContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_build);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__3);
			setState(106);
			ws();
			setState(107);
			target();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(108);
				ws();
				}
			}

			setState(111);
			match(T__4);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(112);
				ws();
				}
			}

			setState(115);
			build_rule();
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(116);
				ws();
				setState(117);
				depdency();
				}
				break;
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(121);
				ws();
				}
			}

			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(124);
				scope();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class TargetContext extends ParserRuleContext {
		public Build_valuesContext build_values() {
			return getRuleContext(Build_valuesContext.class,0);
		}
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			build_values();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DepdencyContext extends ParserRuleContext {
		public Build_valuesContext build_values() {
			return getRuleContext(Build_valuesContext.class,0);
		}
		public DepdencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_depdency; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterDepdency(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitDepdency(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitDepdency(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DepdencyContext depdency() throws RecognitionException {
		DepdencyContext _localctx = new DepdencyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_depdency);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			build_values();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Build_valuesContext extends ParserRuleContext {
		public List<Build_valueContext> build_value() {
			return getRuleContexts(Build_valueContext.class);
		}
		public Build_valueContext build_value(int i) {
			return getRuleContext(Build_valueContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public Build_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterBuild_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitBuild_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitBuild_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_valuesContext build_values() throws RecognitionException {
		Build_valuesContext _localctx = new Build_valuesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_build_values);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			build_value();
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(132);
					ws();
					setState(133);
					build_value();
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Build_valueContext extends ParserRuleContext {
		public List<IdentifyContext> identify() {
			return getRuleContexts(IdentifyContext.class);
		}
		public IdentifyContext identify(int i) {
			return getRuleContext(IdentifyContext.class,i);
		}
		public List<TerminalNode> VALUE() { return getTokens(NinjaParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(NinjaParser.VALUE, i);
		}
		public List<EscapeContext> escape() {
			return getRuleContexts(EscapeContext.class);
		}
		public EscapeContext escape(int i) {
			return getRuleContext(EscapeContext.class,i);
		}
		public Build_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterBuild_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitBuild_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitBuild_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_valueContext build_value() throws RecognitionException {
		Build_valueContext _localctx = new Build_valueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_build_value);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(143);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SIMPLE_IDENTIFY:
					case IDENTIFY:
						{
						setState(140);
						identify();
						}
						break;
					case VALUE:
						{
						setState(141);
						match(VALUE);
						}
						break;
					case T__9:
					case T__10:
						{
						setState(142);
						escape();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(145); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Build_ruleContext extends ParserRuleContext {
		public IdentifyContext identify() {
			return getRuleContext(IdentifyContext.class,0);
		}
		public Build_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterBuild_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitBuild_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitBuild_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_ruleContext build_rule() throws RecognitionException {
		Build_ruleContext _localctx = new Build_ruleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_build_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			identify();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScopeContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(NinjaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(NinjaParser.NL, i);
		}
		public List<Scope_lineContext> scope_line() {
			return getRuleContexts(Scope_lineContext.class);
		}
		public Scope_lineContext scope_line(int i) {
			return getRuleContext(Scope_lineContext.class,i);
		}
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_scope);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(149);
					match(NL);
					setState(150);
					scope_line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(153); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Scope_lineContext extends ParserRuleContext {
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public Scope_assignContext scope_assign() {
			return getRuleContext(Scope_assignContext.class,0);
		}
		public Scope_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterScope_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitScope_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitScope_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scope_lineContext scope_line() throws RecognitionException {
		Scope_lineContext _localctx = new Scope_lineContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_scope_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			ws();
			setState(156);
			scope_assign();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Scope_assignContext extends ParserRuleContext {
		public Scope_variableContext scope_variable() {
			return getRuleContext(Scope_variableContext.class,0);
		}
		public Assign_value_linesContext assign_value_lines() {
			return getRuleContext(Assign_value_linesContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public Scope_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterScope_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitScope_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitScope_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scope_assignContext scope_assign() throws RecognitionException {
		Scope_assignContext _localctx = new Scope_assignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_scope_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			scope_variable();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(159);
				ws();
				}
			}

			setState(162);
			match(T__0);
			setState(163);
			assign_value_lines();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Scope_variableContext extends ParserRuleContext {
		public IdentifyContext identify() {
			return getRuleContext(IdentifyContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Scope_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterScope_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitScope_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitScope_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scope_variableContext scope_variable() throws RecognitionException {
		Scope_variableContext _localctx = new Scope_variableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_scope_variable);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIMPLE_IDENTIFY:
			case IDENTIFY:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				identify();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				keyword();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(NinjaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(NinjaParser.NL, i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__5);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(170);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IncludeContext extends ParserRuleContext {
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitInclude(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitInclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__6);
			setState(177);
			ws();
			setState(178);
			file();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubmoduleContext extends ParserRuleContext {
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public SubmoduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_submodule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterSubmodule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitSubmodule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitSubmodule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubmoduleContext submodule() throws RecognitionException {
		SubmoduleContext _localctx = new SubmoduleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_submodule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__7);
			setState(181);
			ws();
			setState(182);
			file();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<IdentifyContext> identify() {
			return getRuleContexts(IdentifyContext.class);
		}
		public IdentifyContext identify(int i) {
			return getRuleContext(IdentifyContext.class,i);
		}
		public DefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultContext default_() throws RecognitionException {
		DefaultContext _localctx = new DefaultContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_default);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__8);
			setState(190); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(187);
					ws();
					setState(188);
					identify();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(192); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(194);
				ws();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_value_linesContext extends ParserRuleContext {
		public List<Assign_value_lineContext> assign_value_line() {
			return getRuleContexts(Assign_value_lineContext.class);
		}
		public Assign_value_lineContext assign_value_line(int i) {
			return getRuleContext(Assign_value_lineContext.class,i);
		}
		public List<Escape_nlContext> escape_nl() {
			return getRuleContexts(Escape_nlContext.class);
		}
		public Escape_nlContext escape_nl(int i) {
			return getRuleContext(Escape_nlContext.class,i);
		}
		public Assign_value_linesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_value_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterAssign_value_lines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitAssign_value_lines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitAssign_value_lines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_value_linesContext assign_value_lines() throws RecognitionException {
		Assign_value_linesContext _localctx = new Assign_value_linesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assign_value_lines);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(197);
					assign_value_line();
					setState(198);
					escape_nl();
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(205);
			assign_value_line();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_value_lineContext extends ParserRuleContext {
		public Assign_valuesContext assign_values() {
			return getRuleContext(Assign_valuesContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public Assign_value_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_value_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterAssign_value_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitAssign_value_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitAssign_value_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_value_lineContext assign_value_line() throws RecognitionException {
		Assign_value_lineContext _localctx = new Assign_value_lineContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assign_value_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(207);
				ws();
				}
			}

			setState(210);
			assign_values();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_valuesContext extends ParserRuleContext {
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public Assign_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterAssign_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitAssign_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitAssign_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_valuesContext assign_values() throws RecognitionException {
		Assign_valuesContext _localctx = new Assign_valuesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assign_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			values();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(213);
				ws();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValuesContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_values);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			value();
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					ws();
					setState(218);
					value();
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public List<IdentifyContext> identify() {
			return getRuleContexts(IdentifyContext.class);
		}
		public IdentifyContext identify(int i) {
			return getRuleContext(IdentifyContext.class,i);
		}
		public List<TerminalNode> VALUE() { return getTokens(NinjaParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(NinjaParser.VALUE, i);
		}
		public List<EscapeContext> escape() {
			return getRuleContexts(EscapeContext.class);
		}
		public EscapeContext escape(int i) {
			return getRuleContext(EscapeContext.class,i);
		}
		public List<KeywordContext> keyword() {
			return getRuleContexts(KeywordContext.class);
		}
		public KeywordContext keyword(int i) {
			return getRuleContext(KeywordContext.class,i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_value);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(230);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SIMPLE_IDENTIFY:
					case IDENTIFY:
						{
						setState(225);
						identify();
						}
						break;
					case VALUE:
						{
						setState(226);
						match(VALUE);
						}
						break;
					case T__9:
					case T__10:
						{
						setState(227);
						escape();
						}
						break;
					case T__4:
						{
						setState(228);
						match(T__4);
						}
						break;
					case T__1:
					case T__2:
					case T__3:
					case T__6:
					case T__7:
					case T__8:
						{
						setState(229);
						keyword();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(232); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class EscapeContext extends ParserRuleContext {
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public TerminalNode SIMPLE_IDENTIFY() { return getToken(NinjaParser.SIMPLE_IDENTIFY, 0); }
		public IdentifyContext identify() {
			return getRuleContext(IdentifyContext.class,0);
		}
		public EscapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterEscape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitEscape(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitEscape(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscapeContext escape() throws RecognitionException {
		EscapeContext _localctx = new EscapeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_escape);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(T__9);
				setState(238);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(235);
					match(T__9);
					}
					break;
				case T__4:
					{
					setState(236);
					match(T__4);
					}
					break;
				case WS:
					{
					setState(237);
					ws();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(T__9);
				setState(241);
				match(SIMPLE_IDENTIFY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(T__10);
				setState(243);
				identify();
				setState(244);
				match(T__11);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Escape_nlContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(NinjaParser.NL, 0); }
		public Escape_nlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escape_nl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterEscape_nl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitEscape_nl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitEscape_nl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Escape_nlContext escape_nl() throws RecognitionException {
		Escape_nlContext _localctx = new Escape_nlContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_escape_nl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__9);
			setState(249);
			match(NL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifyContext extends ParserRuleContext {
		public TerminalNode SIMPLE_IDENTIFY() { return getToken(NinjaParser.SIMPLE_IDENTIFY, 0); }
		public TerminalNode IDENTIFY() { return getToken(NinjaParser.IDENTIFY, 0); }
		public IdentifyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identify; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterIdentify(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitIdentify(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitIdentify(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifyContext identify() throws RecognitionException {
		IdentifyContext _localctx = new IdentifyContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_identify);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !(_la==SIMPLE_IDENTIFY || _la==IDENTIFY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordContext extends ParserRuleContext {
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 924L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WsContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(NinjaParser.WS, 0); }
		public WsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).enterWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NinjaListener ) ((NinjaListener)listener).exitWs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NinjaVisitor ) return ((NinjaVisitor<? extends T>)visitor).visitWs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ws);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(WS);
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
		"\u0004\u0001\u0011\u0102\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000J\b\u0000\n\u0000\f\u0000M\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0003\u0001S\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003^\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005f\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007n\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007r\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007x\b\u0007\u0001\u0007\u0003"+
		"\u0007{\b\u0007\u0001\u0007\u0003\u0007~\b\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0088\b\n\n\n\f\n\u008b"+
		"\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u0090\b\u000b\u000b"+
		"\u000b\f\u000b\u0091\u0001\f\u0001\f\u0001\r\u0001\r\u0004\r\u0098\b\r"+
		"\u000b\r\f\r\u0099\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00a1\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00a8\b\u0010\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u00ac\b\u0011\n\u0011\f\u0011\u00af\t\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0004\u0015\u00bf\b\u0015\u000b\u0015\f\u0015\u00c0\u0001\u0015\u0003"+
		"\u0015\u00c4\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00c9"+
		"\b\u0016\n\u0016\f\u0016\u00cc\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0003\u0017\u00d1\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u00d7\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u00dd\b\u0019\n\u0019\f\u0019\u00e0\t\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0004\u001a\u00e7\b\u001a\u000b"+
		"\u001a\f\u001a\u00e8\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u00ef\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u00f7\b\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0000\u0000 \u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>\u0000\u0003"+
		"\u0001\u0000\u0011\u0011\u0001\u0000\r\u000e\u0002\u0000\u0002\u0004\u0007"+
		"\t\u0109\u0000K\u0001\u0000\u0000\u0000\u0002P\u0001\u0000\u0000\u0000"+
		"\u0004W\u0001\u0000\u0000\u0000\u0006Y\u0001\u0000\u0000\u0000\b_\u0001"+
		"\u0000\u0000\u0000\na\u0001\u0000\u0000\u0000\fg\u0001\u0000\u0000\u0000"+
		"\u000ei\u0001\u0000\u0000\u0000\u0010\u007f\u0001\u0000\u0000\u0000\u0012"+
		"\u0081\u0001\u0000\u0000\u0000\u0014\u0083\u0001\u0000\u0000\u0000\u0016"+
		"\u008f\u0001\u0000\u0000\u0000\u0018\u0093\u0001\u0000\u0000\u0000\u001a"+
		"\u0097\u0001\u0000\u0000\u0000\u001c\u009b\u0001\u0000\u0000\u0000\u001e"+
		"\u009e\u0001\u0000\u0000\u0000 \u00a7\u0001\u0000\u0000\u0000\"\u00a9"+
		"\u0001\u0000\u0000\u0000$\u00b0\u0001\u0000\u0000\u0000&\u00b4\u0001\u0000"+
		"\u0000\u0000(\u00b8\u0001\u0000\u0000\u0000*\u00ba\u0001\u0000\u0000\u0000"+
		",\u00ca\u0001\u0000\u0000\u0000.\u00d0\u0001\u0000\u0000\u00000\u00d4"+
		"\u0001\u0000\u0000\u00002\u00d8\u0001\u0000\u0000\u00004\u00e6\u0001\u0000"+
		"\u0000\u00006\u00f6\u0001\u0000\u0000\u00008\u00f8\u0001\u0000\u0000\u0000"+
		":\u00fb\u0001\u0000\u0000\u0000<\u00fd\u0001\u0000\u0000\u0000>\u00ff"+
		"\u0001\u0000\u0000\u0000@J\u0003\u0002\u0001\u0000AJ\u0003\u0006\u0003"+
		"\u0000BJ\u0003\n\u0005\u0000CJ\u0003\u000e\u0007\u0000DJ\u0003\"\u0011"+
		"\u0000EJ\u0003$\u0012\u0000FJ\u0003&\u0013\u0000GJ\u0003*\u0015\u0000"+
		"HJ\u0005\u0011\u0000\u0000I@\u0001\u0000\u0000\u0000IA\u0001\u0000\u0000"+
		"\u0000IB\u0001\u0000\u0000\u0000IC\u0001\u0000\u0000\u0000ID\u0001\u0000"+
		"\u0000\u0000IE\u0001\u0000\u0000\u0000IF\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000"+
		"KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000"+
		"\u0000MK\u0001\u0000\u0000\u0000NO\u0005\u0000\u0000\u0001O\u0001\u0001"+
		"\u0000\u0000\u0000PR\u0003\u0004\u0002\u0000QS\u0003>\u001f\u0000RQ\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TU\u0005\u0001\u0000\u0000UV\u0003,\u0016\u0000V\u0003\u0001\u0000\u0000"+
		"\u0000WX\u0003:\u001d\u0000X\u0005\u0001\u0000\u0000\u0000YZ\u0005\u0002"+
		"\u0000\u0000Z[\u0003>\u001f\u0000[]\u0003\b\u0004\u0000\\^\u0003\u001a"+
		"\r\u0000]\\\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\u0007\u0001"+
		"\u0000\u0000\u0000_`\u0003:\u001d\u0000`\t\u0001\u0000\u0000\u0000ab\u0005"+
		"\u0003\u0000\u0000bc\u0003>\u001f\u0000ce\u0003\f\u0006\u0000df\u0003"+
		"\u001a\r\u0000ed\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\u000b"+
		"\u0001\u0000\u0000\u0000gh\u0003:\u001d\u0000h\r\u0001\u0000\u0000\u0000"+
		"ij\u0005\u0004\u0000\u0000jk\u0003>\u001f\u0000km\u0003\u0010\b\u0000"+
		"ln\u0003>\u001f\u0000ml\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000oq\u0005\u0005\u0000\u0000pr\u0003>\u001f\u0000"+
		"qp\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000sw\u0003\u0018\f\u0000tu\u0003>\u001f\u0000uv\u0003\u0012\t\u0000"+
		"vx\u0001\u0000\u0000\u0000wt\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xz\u0001\u0000\u0000\u0000y{\u0003>\u001f\u0000zy\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|~\u0003\u001a"+
		"\r\u0000}|\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u000f\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0003\u0014\n\u0000\u0080\u0011\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0003\u0014\n\u0000\u0082\u0013\u0001\u0000\u0000"+
		"\u0000\u0083\u0089\u0003\u0016\u000b\u0000\u0084\u0085\u0003>\u001f\u0000"+
		"\u0085\u0086\u0003\u0016\u000b\u0000\u0086\u0088\u0001\u0000\u0000\u0000"+
		"\u0087\u0084\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000"+
		"\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000"+
		"\u008a\u0015\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000"+
		"\u008c\u0090\u0003:\u001d\u0000\u008d\u0090\u0005\u000f\u0000\u0000\u008e"+
		"\u0090\u00036\u001b\u0000\u008f\u008c\u0001\u0000\u0000\u0000\u008f\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0001\u0000\u0000\u0000\u0092\u0017\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0003:\u001d\u0000\u0094\u0019\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"\u0011\u0000\u0000\u0096\u0098\u0003\u001c\u000e\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u0097\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u001b\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0003>\u001f\u0000\u009c\u009d\u0003\u001e"+
		"\u000f\u0000\u009d\u001d\u0001\u0000\u0000\u0000\u009e\u00a0\u0003 \u0010"+
		"\u0000\u009f\u00a1\u0003>\u001f\u0000\u00a0\u009f\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0005\u0001\u0000\u0000\u00a3\u00a4\u0003,\u0016\u0000\u00a4"+
		"\u001f\u0001\u0000\u0000\u0000\u00a5\u00a8\u0003:\u001d\u0000\u00a6\u00a8"+
		"\u0003<\u001e\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a8!\u0001\u0000\u0000\u0000\u00a9\u00ad\u0005\u0006"+
		"\u0000\u0000\u00aa\u00ac\b\u0000\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae#\u0001\u0000\u0000\u0000"+
		"\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u0007\u0000\u0000"+
		"\u00b1\u00b2\u0003>\u001f\u0000\u00b2\u00b3\u0003(\u0014\u0000\u00b3%"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\b\u0000\u0000\u00b5\u00b6\u0003"+
		">\u001f\u0000\u00b6\u00b7\u0003(\u0014\u0000\u00b7\'\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u00034\u001a\u0000\u00b9)\u0001\u0000\u0000\u0000\u00ba"+
		"\u00be\u0005\t\u0000\u0000\u00bb\u00bc\u0003>\u001f\u0000\u00bc\u00bd"+
		"\u0003:\u001d\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00be\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c4\u0003>\u001f\u0000\u00c3\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4+\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0003.\u0017\u0000\u00c6\u00c7\u00038\u001c\u0000\u00c7"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c9"+
		"\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ca\u0001\u0000\u0000\u0000\u00cd\u00ce\u0003.\u0017\u0000\u00ce-\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d1\u0003>\u001f\u0000\u00d0\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u00030\u0018\u0000\u00d3/\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d6\u00032\u0019\u0000\u00d5\u00d7\u0003>\u001f\u0000\u00d6\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d71\u0001"+
		"\u0000\u0000\u0000\u00d8\u00de\u00034\u001a\u0000\u00d9\u00da\u0003>\u001f"+
		"\u0000\u00da\u00db\u00034\u001a\u0000\u00db\u00dd\u0001\u0000\u0000\u0000"+
		"\u00dc\u00d9\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000"+
		"\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000"+
		"\u00df3\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e7\u0003:\u001d\u0000\u00e2\u00e7\u0005\u000f\u0000\u0000\u00e3\u00e7"+
		"\u00036\u001b\u0000\u00e4\u00e7\u0005\u0005\u0000\u0000\u00e5\u00e7\u0003"+
		"<\u001e\u0000\u00e6\u00e1\u0001\u0000\u0000\u0000\u00e6\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000"+
		"\u0000\u0000\u00e95\u0001\u0000\u0000\u0000\u00ea\u00ee\u0005\n\u0000"+
		"\u0000\u00eb\u00ef\u0005\n\u0000\u0000\u00ec\u00ef\u0005\u0005\u0000\u0000"+
		"\u00ed\u00ef\u0003>\u001f\u0000\u00ee\u00eb\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\n\u0000\u0000\u00f1\u00f7"+
		"\u0005\r\u0000\u0000\u00f2\u00f3\u0005\u000b\u0000\u0000\u00f3\u00f4\u0003"+
		":\u001d\u0000\u00f4\u00f5\u0005\f\u0000\u0000\u00f5\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f6\u00ea\u0001\u0000\u0000\u0000\u00f6\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f2\u0001\u0000\u0000\u0000\u00f77\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0005\n\u0000\u0000\u00f9\u00fa\u0005\u0011\u0000\u0000"+
		"\u00fa9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0007\u0001\u0000\u0000\u00fc"+
		";\u0001\u0000\u0000\u0000\u00fd\u00fe\u0007\u0002\u0000\u0000\u00fe=\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0005\u0010\u0000\u0000\u0100?\u0001\u0000"+
		"\u0000\u0000\u001bIKR]emqwz}\u0089\u008f\u0091\u0099\u00a0\u00a7\u00ad"+
		"\u00c0\u00c3\u00ca\u00d0\u00d6\u00de\u00e6\u00e8\u00ee\u00f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}