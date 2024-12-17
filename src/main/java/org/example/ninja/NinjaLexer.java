// Generated from src/main/java/org/example/ninja/Ninja.g4 by ANTLR 4.13.2

package org.example.ninja;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class NinjaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, SIMPLE_IDENTIFY=13, IDENTIFY=14, VALUE=15, 
		WS=16, NL=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "SIMPLE_IDENTIFY", "IDENTIFY", "VALUE", "WS", 
			"NL"
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


	public NinjaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ninja.g4"; }

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
		"\u0004\u0000\u0011s\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0004\f\\\b\f\u000b\f\f\f]\u0001\r\u0004\ra\b\r\u000b\r\f\rb"+
		"\u0001\u000e\u0004\u000ef\b\u000e\u000b\u000e\f\u000eg\u0001\u000f\u0004"+
		"\u000fk\b\u000f\u000b\u000f\f\u000fl\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010r\b\u0010\u0000\u0000\u0011\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"\u0001\u0000\u0004\u0005\u0000--09AZ__az\u0005\u0000-.09AZ__az\b\u0000"+
		"\t\n\r\r  #$::=={{}}\u0002\u0000\t\t  w\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001"+
		"\u0000\u0000\u0000\u0003%\u0001\u0000\u0000\u0000\u0005*\u0001\u0000\u0000"+
		"\u0000\u0007/\u0001\u0000\u0000\u0000\t5\u0001\u0000\u0000\u0000\u000b"+
		"7\u0001\u0000\u0000\u0000\r9\u0001\u0000\u0000\u0000\u000fA\u0001\u0000"+
		"\u0000\u0000\u0011K\u0001\u0000\u0000\u0000\u0013S\u0001\u0000\u0000\u0000"+
		"\u0015U\u0001\u0000\u0000\u0000\u0017X\u0001\u0000\u0000\u0000\u0019["+
		"\u0001\u0000\u0000\u0000\u001b`\u0001\u0000\u0000\u0000\u001de\u0001\u0000"+
		"\u0000\u0000\u001fj\u0001\u0000\u0000\u0000!q\u0001\u0000\u0000\u0000"+
		"#$\u0005=\u0000\u0000$\u0002\u0001\u0000\u0000\u0000%&\u0005r\u0000\u0000"+
		"&\'\u0005u\u0000\u0000\'(\u0005l\u0000\u0000()\u0005e\u0000\u0000)\u0004"+
		"\u0001\u0000\u0000\u0000*+\u0005p\u0000\u0000+,\u0005o\u0000\u0000,-\u0005"+
		"o\u0000\u0000-.\u0005l\u0000\u0000.\u0006\u0001\u0000\u0000\u0000/0\u0005"+
		"b\u0000\u000001\u0005u\u0000\u000012\u0005i\u0000\u000023\u0005l\u0000"+
		"\u000034\u0005d\u0000\u00004\b\u0001\u0000\u0000\u000056\u0005:\u0000"+
		"\u00006\n\u0001\u0000\u0000\u000078\u0005#\u0000\u00008\f\u0001\u0000"+
		"\u0000\u00009:\u0005i\u0000\u0000:;\u0005n\u0000\u0000;<\u0005c\u0000"+
		"\u0000<=\u0005l\u0000\u0000=>\u0005u\u0000\u0000>?\u0005d\u0000\u0000"+
		"?@\u0005e\u0000\u0000@\u000e\u0001\u0000\u0000\u0000AB\u0005s\u0000\u0000"+
		"BC\u0005u\u0000\u0000CD\u0005b\u0000\u0000DE\u0005m\u0000\u0000EF\u0005"+
		"o\u0000\u0000FG\u0005d\u0000\u0000GH\u0005u\u0000\u0000HI\u0005l\u0000"+
		"\u0000IJ\u0005e\u0000\u0000J\u0010\u0001\u0000\u0000\u0000KL\u0005d\u0000"+
		"\u0000LM\u0005e\u0000\u0000MN\u0005f\u0000\u0000NO\u0005a\u0000\u0000"+
		"OP\u0005u\u0000\u0000PQ\u0005l\u0000\u0000QR\u0005t\u0000\u0000R\u0012"+
		"\u0001\u0000\u0000\u0000ST\u0005$\u0000\u0000T\u0014\u0001\u0000\u0000"+
		"\u0000UV\u0005$\u0000\u0000VW\u0005{\u0000\u0000W\u0016\u0001\u0000\u0000"+
		"\u0000XY\u0005}\u0000\u0000Y\u0018\u0001\u0000\u0000\u0000Z\\\u0007\u0000"+
		"\u0000\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\u001a\u0001\u0000\u0000"+
		"\u0000_a\u0007\u0001\u0000\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\u001c"+
		"\u0001\u0000\u0000\u0000df\b\u0002\u0000\u0000ed\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000h\u001e\u0001\u0000\u0000\u0000ik\u0007\u0003\u0000\u0000ji\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000"+
		"lm\u0001\u0000\u0000\u0000m \u0001\u0000\u0000\u0000nr\u0005\n\u0000\u0000"+
		"op\u0005\r\u0000\u0000pr\u0005\n\u0000\u0000qn\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000r\"\u0001\u0000\u0000\u0000\u0006\u0000]bgl"+
		"q\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}