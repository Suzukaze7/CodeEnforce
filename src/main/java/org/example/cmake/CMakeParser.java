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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, SLASH_ESCAPE=8, 
		IDENTIFY=9, VALUE=10, Comment=11, WS=12, NL=13;
	public static final int
		RULE_cmake = 0, RULE_statement = 1, RULE_values = 2, RULE_unsquare_value = 3, 
		RULE_square_value = 4, RULE_value = 5, RULE_string = 6, RULE_string_value = 7, 
		RULE_simple_value = 8, RULE_escape = 9, RULE_deref = 10, RULE_slash_escape = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmake", "statement", "values", "unsquare_value", "square_value", "value", 
			"string", "string_value", "simple_value", "escape", "deref", "slash_escape"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'\"'", "'$'", "'{'", "'}'", "'${'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "SLASH_ESCAPE", "IDENTIFY", 
			"VALUE", "Comment", "WS", "NL"
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
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFY) {
				{
				{
				setState(24);
				statement();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
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
		public TerminalNode IDENTIFY() { return getToken(CMakeParser.IDENTIFY, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(IDENTIFY);
			setState(33);
			match(T__0);
			setState(34);
			values();
			setState(35);
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
	public static class ValuesContext extends ParserRuleContext {
		public List<Unsquare_valueContext> unsquare_value() {
			return getRuleContexts(Unsquare_valueContext.class);
		}
		public Unsquare_valueContext unsquare_value(int i) {
			return getRuleContext(Unsquare_valueContext.class,i);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMakeVisitor ) return ((CMakeVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2042L) != 0)) {
				{
				{
				setState(37);
				unsquare_value();
				}
				}
				setState(42);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Unsquare_valueContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Square_valueContext square_value() {
			return getRuleContext(Square_valueContext.class,0);
		}
		public Unsquare_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsquare_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).enterUnsquare_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).exitUnsquare_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMakeVisitor ) return ((CMakeVisitor<? extends T>)visitor).visitUnsquare_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unsquare_valueContext unsquare_value() throws RecognitionException {
		Unsquare_valueContext _localctx = new Unsquare_valueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unsquare_value);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case SLASH_ESCAPE:
			case IDENTIFY:
			case VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				value();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				square_value();
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
	public static class Square_valueContext extends ParserRuleContext {
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public Square_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_square_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).enterSquare_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).exitSquare_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMakeVisitor ) return ((CMakeVisitor<? extends T>)visitor).visitSquare_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Square_valueContext square_value() throws RecognitionException {
		Square_valueContext _localctx = new Square_valueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_square_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__0);
			setState(48);
			values();
			setState(49);
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
	public static class ValueContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Simple_valueContext simple_value() {
			return getRuleContext(Simple_valueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMakeVisitor ) return ((CMakeVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				string();
				}
				break;
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case SLASH_ESCAPE:
			case IDENTIFY:
			case VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				simple_value();
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
	public static class StringContext extends ParserRuleContext {
		public List<String_valueContext> string_value() {
			return getRuleContexts(String_valueContext.class);
		}
		public String_valueContext string_value(int i) {
			return getRuleContext(String_valueContext.class,i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMakeVisitor ) return ((CMakeVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__2);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2038L) != 0)) {
				{
				{
				setState(56);
				string_value();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
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
	public static class String_valueContext extends ParserRuleContext {
		public List<Simple_valueContext> simple_value() {
			return getRuleContexts(Simple_valueContext.class);
		}
		public Simple_valueContext simple_value(int i) {
			return getRuleContext(Simple_valueContext.class,i);
		}
		public String_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).enterString_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).exitString_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMakeVisitor ) return ((CMakeVisitor<? extends T>)visitor).visitString_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_valueContext string_value() throws RecognitionException {
		String_valueContext _localctx = new String_valueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_string_value);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(67);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__3:
					case T__4:
					case T__5:
					case T__6:
					case SLASH_ESCAPE:
					case IDENTIFY:
					case VALUE:
						{
						setState(64);
						simple_value();
						}
						break;
					case T__0:
						{
						setState(65);
						match(T__0);
						}
						break;
					case T__1:
						{
						setState(66);
						match(T__1);
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
				setState(69); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
	public static class Simple_valueContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFY() { return getTokens(CMakeParser.IDENTIFY); }
		public TerminalNode IDENTIFY(int i) {
			return getToken(CMakeParser.IDENTIFY, i);
		}
		public List<TerminalNode> VALUE() { return getTokens(CMakeParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(CMakeParser.VALUE, i);
		}
		public List<EscapeContext> escape() {
			return getRuleContexts(EscapeContext.class);
		}
		public EscapeContext escape(int i) {
			return getRuleContext(EscapeContext.class,i);
		}
		public Simple_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).enterSimple_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).exitSimple_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMakeVisitor ) return ((CMakeVisitor<? extends T>)visitor).visitSimple_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_valueContext simple_value() throws RecognitionException {
		Simple_valueContext _localctx = new Simple_valueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simple_value);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(77);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFY:
						{
						setState(71);
						match(IDENTIFY);
						}
						break;
					case VALUE:
						{
						setState(72);
						match(VALUE);
						}
						break;
					case T__6:
					case SLASH_ESCAPE:
						{
						setState(73);
						escape();
						}
						break;
					case T__3:
						{
						setState(74);
						match(T__3);
						}
						break;
					case T__4:
						{
						setState(75);
						match(T__4);
						}
						break;
					case T__5:
						{
						setState(76);
						match(T__5);
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
				setState(79); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public DerefContext deref() {
			return getRuleContext(DerefContext.class,0);
		}
		public Slash_escapeContext slash_escape() {
			return getRuleContext(Slash_escapeContext.class,0);
		}
		public EscapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).enterEscape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).exitEscape(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMakeVisitor ) return ((CMakeVisitor<? extends T>)visitor).visitEscape(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscapeContext escape() throws RecognitionException {
		EscapeContext _localctx = new EscapeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_escape);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				deref();
				}
				break;
			case SLASH_ESCAPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				slash_escape();
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
	public static class DerefContext extends ParserRuleContext {
		public TerminalNode IDENTIFY() { return getToken(CMakeParser.IDENTIFY, 0); }
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
		enterRule(_localctx, 20, RULE_deref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__6);
			setState(86);
			match(IDENTIFY);
			setState(87);
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
	public static class Slash_escapeContext extends ParserRuleContext {
		public TerminalNode SLASH_ESCAPE() { return getToken(CMakeParser.SLASH_ESCAPE, 0); }
		public Slash_escapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slash_escape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).enterSlash_escape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).exitSlash_escape(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMakeVisitor ) return ((CMakeVisitor<? extends T>)visitor).visitSlash_escape(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Slash_escapeContext slash_escape() throws RecognitionException {
		Slash_escapeContext _localctx = new Slash_escapeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_slash_escape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(SLASH_ESCAPE);
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
		"\u0004\u0001\r\\\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0005\u0002\'\b\u0002\n\u0002\f\u0002*\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0003\u0003.\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u00056\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0005\u0006:\b\u0006\n\u0006\f\u0006=\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007D\b\u0007"+
		"\u000b\u0007\f\u0007E\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0004\bN\b\b\u000b\b\f\bO\u0001\t\u0001\t\u0003\tT\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0000\f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0000^\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0002 \u0001\u0000\u0000\u0000\u0004(\u0001"+
		"\u0000\u0000\u0000\u0006-\u0001\u0000\u0000\u0000\b/\u0001\u0000\u0000"+
		"\u0000\n5\u0001\u0000\u0000\u0000\f7\u0001\u0000\u0000\u0000\u000eC\u0001"+
		"\u0000\u0000\u0000\u0010M\u0001\u0000\u0000\u0000\u0012S\u0001\u0000\u0000"+
		"\u0000\u0014U\u0001\u0000\u0000\u0000\u0016Y\u0001\u0000\u0000\u0000\u0018"+
		"\u001a\u0003\u0002\u0001\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a"+
		"\u001d\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0001\u0000\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d"+
		"\u001b\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0000\u0000\u0001\u001f"+
		"\u0001\u0001\u0000\u0000\u0000 !\u0005\t\u0000\u0000!\"\u0005\u0001\u0000"+
		"\u0000\"#\u0003\u0004\u0002\u0000#$\u0005\u0002\u0000\u0000$\u0003\u0001"+
		"\u0000\u0000\u0000%\'\u0003\u0006\u0003\u0000&%\u0001\u0000\u0000\u0000"+
		"\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000"+
		"\u0000)\u0005\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000+.\u0003"+
		"\n\u0005\u0000,.\u0003\b\u0004\u0000-+\u0001\u0000\u0000\u0000-,\u0001"+
		"\u0000\u0000\u0000.\u0007\u0001\u0000\u0000\u0000/0\u0005\u0001\u0000"+
		"\u000001\u0003\u0004\u0002\u000012\u0005\u0002\u0000\u00002\t\u0001\u0000"+
		"\u0000\u000036\u0003\f\u0006\u000046\u0003\u0010\b\u000053\u0001\u0000"+
		"\u0000\u000054\u0001\u0000\u0000\u00006\u000b\u0001\u0000\u0000\u0000"+
		"7;\u0005\u0003\u0000\u00008:\u0003\u000e\u0007\u000098\u0001\u0000\u0000"+
		"\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<>\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>?\u0005"+
		"\u0003\u0000\u0000?\r\u0001\u0000\u0000\u0000@D\u0003\u0010\b\u0000AD"+
		"\u0005\u0001\u0000\u0000BD\u0005\u0002\u0000\u0000C@\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000DE\u0001\u0000"+
		"\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\u000f"+
		"\u0001\u0000\u0000\u0000GN\u0005\t\u0000\u0000HN\u0005\n\u0000\u0000I"+
		"N\u0003\u0012\t\u0000JN\u0005\u0004\u0000\u0000KN\u0005\u0005\u0000\u0000"+
		"LN\u0005\u0006\u0000\u0000MG\u0001\u0000\u0000\u0000MH\u0001\u0000\u0000"+
		"\u0000MI\u0001\u0000\u0000\u0000MJ\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\u0011\u0001\u0000\u0000"+
		"\u0000QT\u0003\u0014\n\u0000RT\u0003\u0016\u000b\u0000SQ\u0001\u0000\u0000"+
		"\u0000SR\u0001\u0000\u0000\u0000T\u0013\u0001\u0000\u0000\u0000UV\u0005"+
		"\u0007\u0000\u0000VW\u0005\t\u0000\u0000WX\u0005\u0006\u0000\u0000X\u0015"+
		"\u0001\u0000\u0000\u0000YZ\u0005\b\u0000\u0000Z\u0017\u0001\u0000\u0000"+
		"\u0000\n\u001b(-5;CEMOS";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}