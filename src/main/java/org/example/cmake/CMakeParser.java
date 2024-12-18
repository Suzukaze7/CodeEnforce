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
		T__0=1, T__1=2, T__2=3, Identifier=4, Value=5, Comment=6, WS=7, NL=8;
	public static final int
		RULE_cmake = 0, RULE_statement = 1, RULE_arguments = 2, RULE_argument = 3, 
		RULE_compound_argument = 4, RULE_quoted_argument = 5, RULE_quoted_value = 6, 
		RULE_unquoted_argument = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmake", "statement", "arguments", "argument", "compound_argument", "quoted_argument", 
			"quoted_value", "unquoted_argument"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "Identifier", "Value", "Comment", "WS", "NL"
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
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(16);
				statement();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
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
			setState(24);
			match(Identifier);
			setState(25);
			match(T__0);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 58L) != 0)) {
				{
				setState(26);
				arguments();
				}
			}

			setState(29);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				argument();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 58L) != 0) );
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
		public Compound_argumentContext compound_argument() {
			return getRuleContext(Compound_argumentContext.class,0);
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
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
			case Value:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				unquoted_argument();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				quoted_argument();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				compound_argument();
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
	public static class Compound_argumentContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Compound_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).enterCompound_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMakeListener ) ((CMakeListener)listener).exitCompound_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMakeVisitor ) return ((CMakeVisitor<? extends T>)visitor).visitCompound_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_argumentContext compound_argument() throws RecognitionException {
		Compound_argumentContext _localctx = new Compound_argumentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compound_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__0);
			setState(42);
			arguments();
			setState(43);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__2);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 502L) != 0)) {
				{
				{
				setState(46);
				quoted_value();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(54);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__2) ) {
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
				setState(57); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
	public static class Unquoted_argumentContext extends ParserRuleContext {
		public List<TerminalNode> Value() { return getTokens(CMakeParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(CMakeParser.Value, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(CMakeParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(CMakeParser.Identifier, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(59);
					_la = _input.LA(1);
					if ( !(_la==Identifier || _la==Value) ) {
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
				setState(62); 
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

	public static final String _serializedATN =
		"\u0004\u0001\bA\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0005\u0000\u0012\b\u0000\n\u0000\f\u0000\u0015\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001c\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002!\b\u0002\u000b\u0002"+
		"\f\u0002\"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003(\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005"+
		"\u00050\b\u0005\n\u0005\f\u00053\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0004\u00068\b\u0006\u000b\u0006\f\u00069\u0001\u0007\u0004\u0007"+
		"=\b\u0007\u000b\u0007\f\u0007>\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0000\u0002\u0001\u0000\u0003\u0003\u0001\u0000\u0004"+
		"\u0005@\u0000\u0013\u0001\u0000\u0000\u0000\u0002\u0018\u0001\u0000\u0000"+
		"\u0000\u0004 \u0001\u0000\u0000\u0000\u0006\'\u0001\u0000\u0000\u0000"+
		"\b)\u0001\u0000\u0000\u0000\n-\u0001\u0000\u0000\u0000\f7\u0001\u0000"+
		"\u0000\u0000\u000e<\u0001\u0000\u0000\u0000\u0010\u0012\u0003\u0002\u0001"+
		"\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0015\u0001\u0000\u0000"+
		"\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000"+
		"\u0000\u0014\u0016\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000"+
		"\u0000\u0016\u0017\u0005\u0000\u0000\u0001\u0017\u0001\u0001\u0000\u0000"+
		"\u0000\u0018\u0019\u0005\u0004\u0000\u0000\u0019\u001b\u0005\u0001\u0000"+
		"\u0000\u001a\u001c\u0003\u0004\u0002\u0000\u001b\u001a\u0001\u0000\u0000"+
		"\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0005\u0002\u0000\u0000\u001e\u0003\u0001\u0000\u0000"+
		"\u0000\u001f!\u0003\u0006\u0003\u0000 \u001f\u0001\u0000\u0000\u0000!"+
		"\"\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#\u0005\u0001\u0000\u0000\u0000$(\u0003\u000e\u0007\u0000%(\u0003"+
		"\n\u0005\u0000&(\u0003\b\u0004\u0000\'$\u0001\u0000\u0000\u0000\'%\u0001"+
		"\u0000\u0000\u0000\'&\u0001\u0000\u0000\u0000(\u0007\u0001\u0000\u0000"+
		"\u0000)*\u0005\u0001\u0000\u0000*+\u0003\u0004\u0002\u0000+,\u0005\u0002"+
		"\u0000\u0000,\t\u0001\u0000\u0000\u0000-1\u0005\u0003\u0000\u0000.0\u0003"+
		"\f\u0006\u0000/.\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u000024\u0001\u0000\u0000\u0000"+
		"31\u0001\u0000\u0000\u000045\u0005\u0003\u0000\u00005\u000b\u0001\u0000"+
		"\u0000\u000068\b\u0000\u0000\u000076\u0001\u0000\u0000\u000089\u0001\u0000"+
		"\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:\r\u0001"+
		"\u0000\u0000\u0000;=\u0007\u0001\u0000\u0000<;\u0001\u0000\u0000\u0000"+
		"=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000?\u000f\u0001\u0000\u0000\u0000\u0007\u0013\u001b\"\'19>";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}