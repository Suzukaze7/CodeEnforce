// Generated from src/main/java/org/example/cmake/CMake.g4 by ANTLR 4.13.2

package org.example.cmake;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CMakeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, Escape=7, Identifier=8, 
		Value=9, Comment=10, WS=11, NL=12;
	public static final int
		RULE_cmake = 0, RULE_statement = 1, RULE_arguments = 2, RULE_argument = 3, 
		RULE_squared_argument = 4, RULE_quoted_argument = 5, RULE_quoted_value = 6, 
		RULE_unquoted_argument = 7, RULE_unquoted_argument_part = 8, RULE_deref = 9, 
		RULE_ws = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmake", "statement", "arguments", "argument", "squared_argument", "quoted_argument", 
			"quoted_value", "unquoted_argument", "unquoted_argument_part", "deref", 
			"ws"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'\"'", "'$'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "Escape", "Identifier", "Value", 
			"Comment", "WS", "NL"
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
	public String getGrammarFileName() { return "CMake.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CMakeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmakeContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CMakeParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public CmakeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmake; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).enterCmake(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).exitCmake(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMakeVisitor ) return ((CMakeVisitor<? extends T>)visitor).visitCmake(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmakeContext cmake() throws RecognitionException {
		CmakeContext _localctx = new CmakeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmake);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6400L) != 0)) {
				{
				setState(24);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(22);
					statement();
					}
					break;
				case WS:
				case NL:
					{
					setState(23);
					ws();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
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
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CMakeParser.Identifier, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMakeVisitor ) return ((CMakeVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(Identifier);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==NL) {
				{
				setState(32);
				ws();
				}
			}

			setState(35);
			match(T__0);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7162L) != 0)) {
				{
				setState(36);
				arguments();
				}
			}

			setState(39);
			match(T__1);
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
	public static class ArgumentsContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMakeVisitor ) return ((CMakeVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==NL) {
				{
				setState(41);
				ws();
				}
			}

			setState(44);
			argument();
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(45);
					ws();
					setState(46);
					argument();
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS || _la==NL) {
				{
				setState(53);
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
	public static class ArgumentContext extends ParserRuleContext {
		public Unquoted_argumentContext unquoted_argument() {
			return getRuleContext(Unquoted_argumentContext.class,0);
		}
		public Quoted_argumentContext quoted_argument() {
			return getRuleContext(Quoted_argumentContext.class,0);
		}
		public Squared_argumentContext squared_argument() {
			return getRuleContext(Squared_argumentContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMakeVisitor ) return ((CMakeVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_argument);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
			case Escape:
			case Identifier:
			case Value:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				unquoted_argument();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				quoted_argument();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				squared_argument();
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
	public static class Squared_argumentContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Squared_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_squared_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).enterSquared_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).exitSquared_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMakeVisitor ) return ((CMakeVisitor<? extends T>)visitor).visitSquared_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Squared_argumentContext squared_argument() throws RecognitionException {
		Squared_argumentContext _localctx = new Squared_argumentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_squared_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__0);
			setState(62);
			arguments();
			setState(63);
			match(T__1);
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
	public static class Quoted_argumentContext extends ParserRuleContext {
		public List<Quoted_valueContext> quoted_value() {
			return getRuleContexts(Quoted_valueContext.class);
		}
		public Quoted_valueContext quoted_value(int i) {
			return getRuleContext(Quoted_valueContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public Quoted_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quoted_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).enterQuoted_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).exitQuoted_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMakeVisitor ) return ((CMakeVisitor<? extends T>)visitor).visitQuoted_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quoted_argumentContext quoted_argument() throws RecognitionException {
		Quoted_argumentContext _localctx = new Quoted_argumentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_quoted_argument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__2);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8182L) != 0)) {
				{
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==NL) {
					{
					setState(66);
					ws();
					}
				}

				setState(69);
				quoted_value();
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(70);
						ws();
						setState(71);
						quoted_value();
						}
						} 
					}
					setState(77);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS || _la==NL) {
					{
					setState(78);
					ws();
					}
				}

				}
			}

			setState(83);
			match(T__2);
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
	public static class Quoted_valueContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(CMakeParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(CMakeParser.NL, i);
		}
		public List<TerminalNode> WS() { return getTokens(CMakeParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CMakeParser.WS, i);
		}
		public Quoted_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quoted_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).enterQuoted_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).exitQuoted_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMakeVisitor ) return ((CMakeVisitor<? extends T>)visitor).visitQuoted_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quoted_valueContext quoted_value() throws RecognitionException {
		Quoted_valueContext _localctx = new Quoted_valueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_quoted_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				_la = _input.LA(1);
				if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6152L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2038L) != 0) );
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
	public static class Unquoted_argumentContext extends ParserRuleContext {
		public List<DerefContext> deref() {
			return getRuleContexts(DerefContext.class);
		}
		public DerefContext deref(int i) {
			return getRuleContext(DerefContext.class,i);
		}
		public List<TerminalNode> Escape() { return getTokens(CMakeParser.Escape); }
		public TerminalNode Escape(int i) {
			return getToken(CMakeParser.Escape, i);
		}
		public List<Unquoted_argument_partContext> unquoted_argument_part() {
			return getRuleContexts(Unquoted_argument_partContext.class);
		}
		public Unquoted_argument_partContext unquoted_argument_part(int i) {
			return getRuleContext(Unquoted_argument_partContext.class,i);
		}
		public Unquoted_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unquoted_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).enterUnquoted_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).exitUnquoted_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMakeVisitor ) return ((CMakeVisitor<? extends T>)visitor).visitUnquoted_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unquoted_argumentContext unquoted_argument() throws RecognitionException {
		Unquoted_argumentContext _localctx = new Unquoted_argumentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unquoted_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(93);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(90);
					deref();
					}
					break;
				case 2:
					{
					setState(91);
					match(Escape);
					}
					break;
				case 3:
					{
					setState(92);
					unquoted_argument_part();
					}
					break;
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1008L) != 0) );
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
	public static class Unquoted_argument_partContext extends ParserRuleContext {
		public List<TerminalNode> Value() { return getTokens(CMakeParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(CMakeParser.Value, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(CMakeParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(CMakeParser.Identifier, i);
		}
		public Unquoted_argument_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unquoted_argument_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).enterUnquoted_argument_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).exitUnquoted_argument_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMakeVisitor ) return ((CMakeVisitor<? extends T>)visitor).visitUnquoted_argument_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unquoted_argument_partContext unquoted_argument_part() throws RecognitionException {
		Unquoted_argument_partContext _localctx = new Unquoted_argument_partContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unquoted_argument_part);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(97);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 880L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(100); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
	public static class DerefContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CMakeParser.Identifier, 0); }
		public DerefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).enterDeref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).exitDeref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMakeVisitor ) return ((CMakeVisitor<? extends T>)visitor).visitDeref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DerefContext deref() throws RecognitionException {
		DerefContext _localctx = new DerefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_deref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__3);
			setState(103);
			match(T__4);
			setState(104);
			match(Identifier);
			setState(105);
			match(T__5);
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
		public List<TerminalNode> WS() { return getTokens(CMakeParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CMakeParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(CMakeParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(CMakeParser.NL, i);
		}
		public WsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).enterWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).exitWs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMakeVisitor ) return ((CMakeVisitor<? extends T>)visitor).visitWs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ws);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(107);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(110); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static final String _serializedATN =
		"\u0004\u0001\fq\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u0019\b\u0000\n\u0000\f\u0000\u001c\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001&\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0003\u0002"+
		"+\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"1\b\u0002\n\u0002\f\u00024\t\u0002\u0001\u0002\u0003\u00027\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003<\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005D\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005J\b"+
		"\u0005\n\u0005\f\u0005M\t\u0005\u0001\u0005\u0003\u0005P\b\u0005\u0003"+
		"\u0005R\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006W\b\u0006"+
		"\u000b\u0006\f\u0006X\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007"+
		"^\b\u0007\u000b\u0007\f\u0007_\u0001\b\u0004\bc\b\b\u000b\b\f\bd\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0004\nm\b\n\u000b\n\f\nn\u0001"+
		"\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0000\u0003\u0002\u0000\u0003\u0003\u000b\f\u0002\u0000\u0004\u0006\b"+
		"\t\u0001\u0000\u000b\fx\u0000\u001a\u0001\u0000\u0000\u0000\u0002\u001f"+
		"\u0001\u0000\u0000\u0000\u0004*\u0001\u0000\u0000\u0000\u0006;\u0001\u0000"+
		"\u0000\u0000\b=\u0001\u0000\u0000\u0000\nA\u0001\u0000\u0000\u0000\fV"+
		"\u0001\u0000\u0000\u0000\u000e]\u0001\u0000\u0000\u0000\u0010b\u0001\u0000"+
		"\u0000\u0000\u0012f\u0001\u0000\u0000\u0000\u0014l\u0001\u0000\u0000\u0000"+
		"\u0016\u0019\u0003\u0002\u0001\u0000\u0017\u0019\u0003\u0014\n\u0000\u0018"+
		"\u0016\u0001\u0000\u0000\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019"+
		"\u001c\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0001\u0000\u0000\u0000\u001b\u001d\u0001\u0000\u0000\u0000\u001c"+
		"\u001a\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u0000\u0000\u0001\u001e"+
		"\u0001\u0001\u0000\u0000\u0000\u001f!\u0005\b\u0000\u0000 \"\u0003\u0014"+
		"\n\u0000! \u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"#\u0001"+
		"\u0000\u0000\u0000#%\u0005\u0001\u0000\u0000$&\u0003\u0004\u0002\u0000"+
		"%$\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000"+
		"\u0000\'(\u0005\u0002\u0000\u0000(\u0003\u0001\u0000\u0000\u0000)+\u0003"+
		"\u0014\n\u0000*)\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,2\u0003\u0006\u0003\u0000-.\u0003\u0014\n\u0000./\u0003"+
		"\u0006\u0003\u0000/1\u0001\u0000\u0000\u00000-\u0001\u0000\u0000\u0000"+
		"14\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000"+
		"\u000036\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000057\u0003\u0014"+
		"\n\u000065\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007\u0005\u0001"+
		"\u0000\u0000\u00008<\u0003\u000e\u0007\u00009<\u0003\n\u0005\u0000:<\u0003"+
		"\b\u0004\u0000;8\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;:\u0001"+
		"\u0000\u0000\u0000<\u0007\u0001\u0000\u0000\u0000=>\u0005\u0001\u0000"+
		"\u0000>?\u0003\u0004\u0002\u0000?@\u0005\u0002\u0000\u0000@\t\u0001\u0000"+
		"\u0000\u0000AQ\u0005\u0003\u0000\u0000BD\u0003\u0014\n\u0000CB\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EK\u0003"+
		"\f\u0006\u0000FG\u0003\u0014\n\u0000GH\u0003\f\u0006\u0000HJ\u0001\u0000"+
		"\u0000\u0000IF\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000NP\u0003\u0014\n\u0000ON\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QC\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0005\u0003"+
		"\u0000\u0000T\u000b\u0001\u0000\u0000\u0000UW\b\u0000\u0000\u0000VU\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000Y\r\u0001\u0000\u0000\u0000Z^\u0003\u0012\t"+
		"\u0000[^\u0005\u0007\u0000\u0000\\^\u0003\u0010\b\u0000]Z\u0001\u0000"+
		"\u0000\u0000][\u0001\u0000\u0000\u0000]\\\u0001\u0000\u0000\u0000^_\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`\u000f\u0001\u0000\u0000\u0000ac\u0007\u0001\u0000\u0000ba\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000e\u0011\u0001\u0000\u0000\u0000fg\u0005\u0004\u0000"+
		"\u0000gh\u0005\u0005\u0000\u0000hi\u0005\b\u0000\u0000ij\u0005\u0006\u0000"+
		"\u0000j\u0013\u0001\u0000\u0000\u0000km\u0007\u0002\u0000\u0000lk\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000o\u0015\u0001\u0000\u0000\u0000\u0011\u0018"+
		"\u001a!%*26;CKOQX]_dn";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}