// Generated from g.g4 by ANTLR 4.9.3
package org.agh.cppinterpreter;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, IntegerLiteral=6, StringLiteral=7, 
		BooleanLiteral=8, Directive=9, Bool=10, Break=11, Continue=12, Else=13, 
		False_=14, True_=15, Float=16, For=17, If=18, Matrix=19, Int=20, Return=21, 
		Void=22, While=23, LeftParen=24, RightParen=25, LeftBracket=26, RightBracket=27, 
		LeftBrace=28, RightBrace=29, Plus=30, Minus=31, Star=32, Div=33, Mod=34, 
		Caret=35, And=36, Tilde=37, Not=38, Assign=39, Less=40, Greater=41, PlusAssign=42, 
		MinusAssign=43, StarAssign=44, DivAssign=45, ModAssign=46, XorAssign=47, 
		AndAssign=48, OrAssign=49, LeftShiftAssign=50, RightShiftAssign=51, Equal=52, 
		NotEqual=53, LessEqual=54, GreaterEqual=55, AndAnd=56, OrOr=57, PlusPlus=58, 
		MinusMinus=59, Comma=60, ArrowStar=61, Arrow=62, Question=63, Colon=64, 
		Semi=65, Dot=66, DotStar=67, Ellipsis=68, Identifier=69, DecimalLiteral=70, 
		Whitespace=71, Newline=72, BlockComment=73, LineComment=74;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "LOWERCASE", "UPPERCASE", "LETTER", 
			"DIGIT", "NONDIGIT", "UNDERSCORE", "IntegerLiteral", "StringLiteral", 
			"BooleanLiteral", "Directive", "Bool", "Break", "Continue", "Else", "False_", 
			"True_", "Float", "For", "If", "Matrix", "Int", "Return", "Void", "While", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Plus", "Minus", "Star", "Div", "Mod", "Caret", "And", 
			"Tilde", "Not", "Assign", "Less", "Greater", "PlusAssign", "MinusAssign", 
			"StarAssign", "DivAssign", "ModAssign", "XorAssign", "AndAssign", "OrAssign", 
			"LeftShiftAssign", "RightShiftAssign", "Equal", "NotEqual", "LessEqual", 
			"GreaterEqual", "AndAnd", "OrOr", "PlusPlus", "MinusMinus", "Comma", 
			"ArrowStar", "Arrow", "Question", "Colon", "Semi", "Dot", "DotStar", 
			"Ellipsis", "Hexquad", "Universalcharactername", "Identifier", "Identifiernondigit", 
			"DecimalLiteral", "NONZERODIGIT", "Cchar", "Escapesequence", "Simpleescapesequence", 
			"Fractionalconstant", "SIGN", "Digitsequence", "Floatingsuffix", "Schar", 
			"HEXADECIMALDIGIT", "Rawstring", "Whitespace", "Newline", "BlockComment", 
			"LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$'", "'\\'", "'#'", "'|'", "'from'", null, null, null, null, 
			"'bool'", "'break'", "'continue'", "'else'", "'false'", "'true'", "'float'", 
			"'for'", "'if'", "'matrix'", "'int'", "'return'", "'void'", "'while'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'^'", "'&'", "'~'", null, "'='", "'<'", "'>'", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'<<='", "'>>='", "'=='", 
			"'!='", "'<='", "'>='", null, null, "'++'", "'--'", "','", "'->*'", "'->'", 
			"'?'", "':'", "';'", "'.'", "'.*'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "IntegerLiteral", "StringLiteral", 
			"BooleanLiteral", "Directive", "Bool", "Break", "Continue", "Else", "False_", 
			"True_", "Float", "For", "If", "Matrix", "Int", "Return", "Void", "While", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Plus", "Minus", "Star", "Div", "Mod", "Caret", "And", 
			"Tilde", "Not", "Assign", "Less", "Greater", "PlusAssign", "MinusAssign", 
			"StarAssign", "DivAssign", "ModAssign", "XorAssign", "AndAssign", "OrAssign", 
			"LeftShiftAssign", "RightShiftAssign", "Equal", "NotEqual", "LessEqual", 
			"GreaterEqual", "AndAnd", "OrOr", "PlusPlus", "MinusMinus", "Comma", 
			"ArrowStar", "Arrow", "Question", "Colon", "Semi", "Dot", "DotStar", 
			"Ellipsis", "Identifier", "DecimalLiteral", "Whitespace", "Newline", 
			"BlockComment", "LineComment"
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


	public gLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "g.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2L\u027e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\5\t\u00d3\n\t\3\n\3\n\3\13\3\13\3\13\5\13\u00da\n\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\16\7\16\u00e3\n\16\f\16\16\16\u00e6\13\16\3\16\5\16\u00e9"+
		"\n\16\3\17\3\17\5\17\u00ed\n\17\3\20\3\20\3\20\3\20\7\20\u00f3\n\20\f"+
		"\20\16\20\u00f6\13\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&"+
		"\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\5-\u016b\n-\3.\3.\3"+
		"/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3"+
		"9\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3?\3?\5?\u01a4"+
		"\n?\3@\3@\3@\3@\5@\u01aa\n@\3A\3A\3A\3B\3B\3B\3C\3C\3D\3D\3D\3D\3E\3E"+
		"\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3J\3K\3K\3K\3K\3L\3L\3L\3L\3L\3M\3M"+
		"\3M\3M\3M\3M\3M\3M\3M\3M\5M\u01d9\nM\3N\3N\3N\7N\u01de\nN\fN\16N\u01e1"+
		"\13N\3O\3O\3P\3P\5P\u01e7\nP\3P\7P\u01ea\nP\fP\16P\u01ed\13P\3P\5P\u01f0"+
		"\nP\3Q\3Q\3R\3R\5R\u01f6\nR\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T"+
		"\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u020f\nT\3T\5T\u0212\nT\3T\3T\3T\3T\5T"+
		"\u0218\nT\3U\5U\u021b\nU\3U\3U\3U\3U\3U\5U\u0222\nU\3V\3V\3W\3W\5W\u0228"+
		"\nW\3W\7W\u022b\nW\fW\16W\u022e\13W\3X\3X\3Y\3Y\3Y\5Y\u0235\nY\3Z\3Z\3"+
		"[\3[\3[\3[\3[\3[\7[\u023f\n[\f[\16[\u0242\13[\3[\3[\7[\u0246\n[\f[\16"+
		"[\u0249\13[\3[\3[\3[\3[\7[\u024f\n[\f[\16[\u0252\13[\3[\3[\3\\\6\\\u0257"+
		"\n\\\r\\\16\\\u0258\3\\\3\\\3]\3]\5]\u025f\n]\3]\5]\u0262\n]\3]\3]\3^"+
		"\3^\3^\3^\7^\u026a\n^\f^\16^\u026d\13^\3^\3^\3^\3^\3^\3_\3_\3_\3_\7_\u0278"+
		"\n_\f_\16_\u027b\13_\3_\3_\6\u0240\u0247\u0250\u026b\2`\3\3\5\4\7\5\t"+
		"\6\13\7\r\2\17\2\21\2\23\2\25\2\27\2\31\b\33\t\35\n\37\13!\f#\r%\16\'"+
		"\17)\20+\21-\22/\23\61\24\63\25\65\26\67\279\30;\31=\32?\33A\34C\35E\36"+
		"G\37I K!M\"O#Q$S%U&W\'Y([)]*_+a,c-e.g/i\60k\61m\62o\63q\64s\65u\66w\67"+
		"y8{9}:\177;\u0081<\u0083=\u0085>\u0087?\u0089@\u008bA\u008dB\u008fC\u0091"+
		"D\u0093E\u0095F\u0097\2\u0099\2\u009bG\u009d\2\u009fH\u00a1\2\u00a3\2"+
		"\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1\2\u00b3\2\u00b5"+
		"\2\u00b7I\u00b9J\u00bbK\u00bdL\3\2\22\3\2c|\3\2C\\\3\2\62;\3\2\f\f\3\2"+
		"\63;\6\2\f\f\17\17))^^\4\2--//\6\2HHNNhhnn\6\2\f\f\17\17$$^^\5\2\62;C"+
		"Hch\4\2$$*+\6\2\f\f\17\17\"\"**\3\2++\6\2\f\f\17\17\"\"$$\4\2\13\13\""+
		"\"\4\2\f\f\17\17\2\u0297\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2"+
		"\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u009b\3\2\2\2\2\u009f\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9"+
		"\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\3\u00bf\3\2\2\2\5\u00c1\3\2\2"+
		"\2\7\u00c3\3\2\2\2\t\u00c5\3\2\2\2\13\u00c7\3\2\2\2\r\u00cc\3\2\2\2\17"+
		"\u00ce\3\2\2\2\21\u00d2\3\2\2\2\23\u00d4\3\2\2\2\25\u00d9\3\2\2\2\27\u00db"+
		"\3\2\2\2\31\u00dd\3\2\2\2\33\u00e8\3\2\2\2\35\u00ec\3\2\2\2\37\u00ee\3"+
		"\2\2\2!\u00fc\3\2\2\2#\u0101\3\2\2\2%\u0107\3\2\2\2\'\u0110\3\2\2\2)\u0115"+
		"\3\2\2\2+\u011b\3\2\2\2-\u0120\3\2\2\2/\u0126\3\2\2\2\61\u012a\3\2\2\2"+
		"\63\u012d\3\2\2\2\65\u0134\3\2\2\2\67\u0138\3\2\2\29\u013f\3\2\2\2;\u0144"+
		"\3\2\2\2=\u014a\3\2\2\2?\u014c\3\2\2\2A\u014e\3\2\2\2C\u0150\3\2\2\2E"+
		"\u0152\3\2\2\2G\u0154\3\2\2\2I\u0156\3\2\2\2K\u0158\3\2\2\2M\u015a\3\2"+
		"\2\2O\u015c\3\2\2\2Q\u015e\3\2\2\2S\u0160\3\2\2\2U\u0162\3\2\2\2W\u0164"+
		"\3\2\2\2Y\u016a\3\2\2\2[\u016c\3\2\2\2]\u016e\3\2\2\2_\u0170\3\2\2\2a"+
		"\u0172\3\2\2\2c\u0175\3\2\2\2e\u0178\3\2\2\2g\u017b\3\2\2\2i\u017e\3\2"+
		"\2\2k\u0181\3\2\2\2m\u0184\3\2\2\2o\u0187\3\2\2\2q\u018a\3\2\2\2s\u018e"+
		"\3\2\2\2u\u0192\3\2\2\2w\u0195\3\2\2\2y\u0198\3\2\2\2{\u019b\3\2\2\2}"+
		"\u01a3\3\2\2\2\177\u01a9\3\2\2\2\u0081\u01ab\3\2\2\2\u0083\u01ae\3\2\2"+
		"\2\u0085\u01b1\3\2\2\2\u0087\u01b3\3\2\2\2\u0089\u01b7\3\2\2\2\u008b\u01ba"+
		"\3\2\2\2\u008d\u01bc\3\2\2\2\u008f\u01be\3\2\2\2\u0091\u01c0\3\2\2\2\u0093"+
		"\u01c2\3\2\2\2\u0095\u01c5\3\2\2\2\u0097\u01c9\3\2\2\2\u0099\u01d8\3\2"+
		"\2\2\u009b\u01da\3\2\2\2\u009d\u01e2\3\2\2\2\u009f\u01ef\3\2\2\2\u00a1"+
		"\u01f1\3\2\2\2\u00a3\u01f5\3\2\2\2\u00a5\u01f7\3\2\2\2\u00a7\u0217\3\2"+
		"\2\2\u00a9\u0221\3\2\2\2\u00ab\u0223\3\2\2\2\u00ad\u0225\3\2\2\2\u00af"+
		"\u022f\3\2\2\2\u00b1\u0234\3\2\2\2\u00b3\u0236\3\2\2\2\u00b5\u0238\3\2"+
		"\2\2\u00b7\u0256\3\2\2\2\u00b9\u0261\3\2\2\2\u00bb\u0265\3\2\2\2\u00bd"+
		"\u0273\3\2\2\2\u00bf\u00c0\7&\2\2\u00c0\4\3\2\2\2\u00c1\u00c2\7^\2\2\u00c2"+
		"\6\3\2\2\2\u00c3\u00c4\7%\2\2\u00c4\b\3\2\2\2\u00c5\u00c6\7~\2\2\u00c6"+
		"\n\3\2\2\2\u00c7\u00c8\7h\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7q\2\2\u00ca"+
		"\u00cb\7o\2\2\u00cb\f\3\2\2\2\u00cc\u00cd\t\2\2\2\u00cd\16\3\2\2\2\u00ce"+
		"\u00cf\t\3\2\2\u00cf\20\3\2\2\2\u00d0\u00d3\5\r\7\2\u00d1\u00d3\5\17\b"+
		"\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\22\3\2\2\2\u00d4\u00d5"+
		"\t\4\2\2\u00d5\24\3\2\2\2\u00d6\u00da\5\27\f\2\u00d7\u00da\5\r\7\2\u00d8"+
		"\u00da\5\17\b\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3"+
		"\2\2\2\u00da\26\3\2\2\2\u00db\u00dc\7a\2\2\u00dc\30\3\2\2\2\u00dd\u00de"+
		"\5\u009fP\2\u00de\32\3\2\2\2\u00df\u00e9\5\u00b5[\2\u00e0\u00e4\7$\2\2"+
		"\u00e1\u00e3\5\u00b1Y\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e7\u00e9\7$\2\2\u00e8\u00df\3\2\2\2\u00e8\u00e0\3\2\2\2\u00e9"+
		"\34\3\2\2\2\u00ea\u00ed\5)\25\2\u00eb\u00ed\5+\26\2\u00ec\u00ea\3\2\2"+
		"\2\u00ec\u00eb\3\2\2\2\u00ed\36\3\2\2\2\u00ee\u00ef\7\61\2\2\u00ef\u00f0"+
		"\7,\2\2\u00f0\u00f4\3\2\2\2\u00f1\u00f3\n\5\2\2\u00f2\u00f1\3\2\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7,\2\2\u00f8\u00f9\7\61\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fb\b\20\2\2\u00fb \3\2\2\2\u00fc\u00fd\7d\2\2"+
		"\u00fd\u00fe\7q\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7n\2\2\u0100\"\3\2"+
		"\2\2\u0101\u0102\7d\2\2\u0102\u0103\7t\2\2\u0103\u0104\7g\2\2\u0104\u0105"+
		"\7c\2\2\u0105\u0106\7m\2\2\u0106$\3\2\2\2\u0107\u0108\7e\2\2\u0108\u0109"+
		"\7q\2\2\u0109\u010a\7p\2\2\u010a\u010b\7v\2\2\u010b\u010c\7k\2\2\u010c"+
		"\u010d\7p\2\2\u010d\u010e\7w\2\2\u010e\u010f\7g\2\2\u010f&\3\2\2\2\u0110"+
		"\u0111\7g\2\2\u0111\u0112\7n\2\2\u0112\u0113\7u\2\2\u0113\u0114\7g\2\2"+
		"\u0114(\3\2\2\2\u0115\u0116\7h\2\2\u0116\u0117\7c\2\2\u0117\u0118\7n\2"+
		"\2\u0118\u0119\7u\2\2\u0119\u011a\7g\2\2\u011a*\3\2\2\2\u011b\u011c\7"+
		"v\2\2\u011c\u011d\7t\2\2\u011d\u011e\7w\2\2\u011e\u011f\7g\2\2\u011f,"+
		"\3\2\2\2\u0120\u0121\7h\2\2\u0121\u0122\7n\2\2\u0122\u0123\7q\2\2\u0123"+
		"\u0124\7c\2\2\u0124\u0125\7v\2\2\u0125.\3\2\2\2\u0126\u0127\7h\2\2\u0127"+
		"\u0128\7q\2\2\u0128\u0129\7t\2\2\u0129\60\3\2\2\2\u012a\u012b\7k\2\2\u012b"+
		"\u012c\7h\2\2\u012c\62\3\2\2\2\u012d\u012e\7o\2\2\u012e\u012f\7c\2\2\u012f"+
		"\u0130\7v\2\2\u0130\u0131\7t\2\2\u0131\u0132\7k\2\2\u0132\u0133\7z\2\2"+
		"\u0133\64\3\2\2\2\u0134\u0135\7k\2\2\u0135\u0136\7p\2\2\u0136\u0137\7"+
		"v\2\2\u0137\66\3\2\2\2\u0138\u0139\7t\2\2\u0139\u013a\7g\2\2\u013a\u013b"+
		"\7v\2\2\u013b\u013c\7w\2\2\u013c\u013d\7t\2\2\u013d\u013e\7p\2\2\u013e"+
		"8\3\2\2\2\u013f\u0140\7x\2\2\u0140\u0141\7q\2\2\u0141\u0142\7k\2\2\u0142"+
		"\u0143\7f\2\2\u0143:\3\2\2\2\u0144\u0145\7y\2\2\u0145\u0146\7j\2\2\u0146"+
		"\u0147\7k\2\2\u0147\u0148\7n\2\2\u0148\u0149\7g\2\2\u0149<\3\2\2\2\u014a"+
		"\u014b\7*\2\2\u014b>\3\2\2\2\u014c\u014d\7+\2\2\u014d@\3\2\2\2\u014e\u014f"+
		"\7]\2\2\u014fB\3\2\2\2\u0150\u0151\7_\2\2\u0151D\3\2\2\2\u0152\u0153\7"+
		"}\2\2\u0153F\3\2\2\2\u0154\u0155\7\177\2\2\u0155H\3\2\2\2\u0156\u0157"+
		"\7-\2\2\u0157J\3\2\2\2\u0158\u0159\7/\2\2\u0159L\3\2\2\2\u015a\u015b\7"+
		",\2\2\u015bN\3\2\2\2\u015c\u015d\7\61\2\2\u015dP\3\2\2\2\u015e\u015f\7"+
		"\'\2\2\u015fR\3\2\2\2\u0160\u0161\7`\2\2\u0161T\3\2\2\2\u0162\u0163\7"+
		"(\2\2\u0163V\3\2\2\2\u0164\u0165\7\u0080\2\2\u0165X\3\2\2\2\u0166\u016b"+
		"\7#\2\2\u0167\u0168\7p\2\2\u0168\u0169\7q\2\2\u0169\u016b\7v\2\2\u016a"+
		"\u0166\3\2\2\2\u016a\u0167\3\2\2\2\u016bZ\3\2\2\2\u016c\u016d\7?\2\2\u016d"+
		"\\\3\2\2\2\u016e\u016f\7>\2\2\u016f^\3\2\2\2\u0170\u0171\7@\2\2\u0171"+
		"`\3\2\2\2\u0172\u0173\7-\2\2\u0173\u0174\7?\2\2\u0174b\3\2\2\2\u0175\u0176"+
		"\7/\2\2\u0176\u0177\7?\2\2\u0177d\3\2\2\2\u0178\u0179\7,\2\2\u0179\u017a"+
		"\7?\2\2\u017af\3\2\2\2\u017b\u017c\7\61\2\2\u017c\u017d\7?\2\2\u017dh"+
		"\3\2\2\2\u017e\u017f\7\'\2\2\u017f\u0180\7?\2\2\u0180j\3\2\2\2\u0181\u0182"+
		"\7`\2\2\u0182\u0183\7?\2\2\u0183l\3\2\2\2\u0184\u0185\7(\2\2\u0185\u0186"+
		"\7?\2\2\u0186n\3\2\2\2\u0187\u0188\7~\2\2\u0188\u0189\7?\2\2\u0189p\3"+
		"\2\2\2\u018a\u018b\7>\2\2\u018b\u018c\7>\2\2\u018c\u018d\7?\2\2\u018d"+
		"r\3\2\2\2\u018e\u018f\7@\2\2\u018f\u0190\7@\2\2\u0190\u0191\7?\2\2\u0191"+
		"t\3\2\2\2\u0192\u0193\7?\2\2\u0193\u0194\7?\2\2\u0194v\3\2\2\2\u0195\u0196"+
		"\7#\2\2\u0196\u0197\7?\2\2\u0197x\3\2\2\2\u0198\u0199\7>\2\2\u0199\u019a"+
		"\7?\2\2\u019az\3\2\2\2\u019b\u019c\7@\2\2\u019c\u019d\7?\2\2\u019d|\3"+
		"\2\2\2\u019e\u019f\7(\2\2\u019f\u01a4\7(\2\2\u01a0\u01a1\7c\2\2\u01a1"+
		"\u01a2\7p\2\2\u01a2\u01a4\7f\2\2\u01a3\u019e\3\2\2\2\u01a3\u01a0\3\2\2"+
		"\2\u01a4~\3\2\2\2\u01a5\u01a6\7~\2\2\u01a6\u01aa\7~\2\2\u01a7\u01a8\7"+
		"q\2\2\u01a8\u01aa\7t\2\2\u01a9\u01a5\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa"+
		"\u0080\3\2\2\2\u01ab\u01ac\7-\2\2\u01ac\u01ad\7-\2\2\u01ad\u0082\3\2\2"+
		"\2\u01ae\u01af\7/\2\2\u01af\u01b0\7/\2\2\u01b0\u0084\3\2\2\2\u01b1\u01b2"+
		"\7.\2\2\u01b2\u0086\3\2\2\2\u01b3\u01b4\7/\2\2\u01b4\u01b5\7@\2\2\u01b5"+
		"\u01b6\7,\2\2\u01b6\u0088\3\2\2\2\u01b7\u01b8\7/\2\2\u01b8\u01b9\7@\2"+
		"\2\u01b9\u008a\3\2\2\2\u01ba\u01bb\7A\2\2\u01bb\u008c\3\2\2\2\u01bc\u01bd"+
		"\7<\2\2\u01bd\u008e\3\2\2\2\u01be\u01bf\7=\2\2\u01bf\u0090\3\2\2\2\u01c0"+
		"\u01c1\7\60\2\2\u01c1\u0092\3\2\2\2\u01c2\u01c3\7\60\2\2\u01c3\u01c4\7"+
		",\2\2\u01c4\u0094\3\2\2\2\u01c5\u01c6\7\60\2\2\u01c6\u01c7\7\60\2\2\u01c7"+
		"\u01c8\7\60\2\2\u01c8\u0096\3\2\2\2\u01c9\u01ca\5\u00b3Z\2\u01ca\u01cb"+
		"\5\u00b3Z\2\u01cb\u01cc\5\u00b3Z\2\u01cc\u01cd\5\u00b3Z\2\u01cd\u0098"+
		"\3\2\2\2\u01ce\u01cf\7^\2\2\u01cf\u01d0\7w\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\u01d9\5\u0097L\2\u01d2\u01d3\7^\2\2\u01d3\u01d4\7W\2\2\u01d4\u01d5\3"+
		"\2\2\2\u01d5\u01d6\5\u0097L\2\u01d6\u01d7\5\u0097L\2\u01d7\u01d9\3\2\2"+
		"\2\u01d8\u01ce\3\2\2\2\u01d8\u01d2\3\2\2\2\u01d9\u009a\3\2\2\2\u01da\u01df"+
		"\5\u009dO\2\u01db\u01de\5\u009dO\2\u01dc\u01de\5\23\n\2\u01dd\u01db\3"+
		"\2\2\2\u01dd\u01dc\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u009c\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3\5\25"+
		"\13\2\u01e3\u009e\3\2\2\2\u01e4\u01eb\5\u00a1Q\2\u01e5\u01e7\7)\2\2\u01e6"+
		"\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\5\23"+
		"\n\2\u01e9\u01e6\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01f0\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01f0\5\23"+
		"\n\2\u01ef\u01e4\3\2\2\2\u01ef\u01ee\3\2\2\2\u01f0\u00a0\3\2\2\2\u01f1"+
		"\u01f2\t\6\2\2\u01f2\u00a2\3\2\2\2\u01f3\u01f6\n\7\2\2\u01f4\u01f6\5\u00a5"+
		"S\2\u01f5\u01f3\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6\u00a4\3\2\2\2\u01f7"+
		"\u01f8\5\u00a7T\2\u01f8\u00a6\3\2\2\2\u01f9\u01fa\7^\2\2\u01fa\u0218\7"+
		")\2\2\u01fb\u01fc\7^\2\2\u01fc\u0218\7$\2\2\u01fd\u01fe\7^\2\2\u01fe\u0218"+
		"\7A\2\2\u01ff\u0200\7^\2\2\u0200\u0218\7^\2\2\u0201\u0202\7^\2\2\u0202"+
		"\u0218\7c\2\2\u0203\u0204\7^\2\2\u0204\u0218\7d\2\2\u0205\u0206\7^\2\2"+
		"\u0206\u0218\7h\2\2\u0207\u0208\7^\2\2\u0208\u0218\7p\2\2\u0209\u020a"+
		"\7^\2\2\u020a\u0218\7t\2\2\u020b\u0211\7^\2\2\u020c\u020e\7\17\2\2\u020d"+
		"\u020f\7\f\2\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0212\3\2"+
		"\2\2\u0210\u0212\7\f\2\2\u0211\u020c\3\2\2\2\u0211\u0210\3\2\2\2\u0212"+
		"\u0218\3\2\2\2\u0213\u0214\7^\2\2\u0214\u0218\7v\2\2\u0215\u0216\7^\2"+
		"\2\u0216\u0218\7x\2\2\u0217\u01f9\3\2\2\2\u0217\u01fb\3\2\2\2\u0217\u01fd"+
		"\3\2\2\2\u0217\u01ff\3\2\2\2\u0217\u0201\3\2\2\2\u0217\u0203\3\2\2\2\u0217"+
		"\u0205\3\2\2\2\u0217\u0207\3\2\2\2\u0217\u0209\3\2\2\2\u0217\u020b\3\2"+
		"\2\2\u0217\u0213\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u00a8\3\2\2\2\u0219"+
		"\u021b\5\u00adW\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c"+
		"\3\2\2\2\u021c\u021d\7\60\2\2\u021d\u0222\5\u00adW\2\u021e\u021f\5\u00ad"+
		"W\2\u021f\u0220\7\60\2\2\u0220\u0222\3\2\2\2\u0221\u021a\3\2\2\2\u0221"+
		"\u021e\3\2\2\2\u0222\u00aa\3\2\2\2\u0223\u0224\t\b\2\2\u0224\u00ac\3\2"+
		"\2\2\u0225\u022c\5\23\n\2\u0226\u0228\7)\2\2\u0227\u0226\3\2\2\2\u0227"+
		"\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\5\23\n\2\u022a\u0227\3"+
		"\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d"+
		"\u00ae\3\2\2\2\u022e\u022c\3\2\2\2\u022f\u0230\t\t\2\2\u0230\u00b0\3\2"+
		"\2\2\u0231\u0235\n\n\2\2\u0232\u0235\5\u00a5S\2\u0233\u0235\5\u0099M\2"+
		"\u0234\u0231\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0233\3\2\2\2\u0235\u00b2"+
		"\3\2\2\2\u0236\u0237\t\13\2\2\u0237\u00b4\3\2\2\2\u0238\u0239\7T\2\2\u0239"+
		"\u023a\7$\2\2\u023a\u0240\3\2\2\2\u023b\u023c\7^\2\2\u023c\u023f\t\f\2"+
		"\2\u023d\u023f\n\r\2\2\u023e\u023b\3\2\2\2\u023e\u023d\3\2\2\2\u023f\u0242"+
		"\3\2\2\2\u0240\u0241\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0243\3\2\2\2\u0242"+
		"\u0240\3\2\2\2\u0243\u0247\7*\2\2\u0244\u0246\n\16\2\2\u0245\u0244\3\2"+
		"\2\2\u0246\u0249\3\2\2\2\u0247\u0248\3\2\2\2\u0247\u0245\3\2\2\2\u0248"+
		"\u024a\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u0250\7+\2\2\u024b\u024c\7^\2"+
		"\2\u024c\u024f\t\f\2\2\u024d\u024f\n\17\2\2\u024e\u024b\3\2\2\2\u024e"+
		"\u024d\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u0251\3\2\2\2\u0250\u024e\3\2"+
		"\2\2\u0251\u0253\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u0254\7$\2\2\u0254"+
		"\u00b6\3\2\2\2\u0255\u0257\t\20\2\2\u0256\u0255\3\2\2\2\u0257\u0258\3"+
		"\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u025b\b\\\3\2\u025b\u00b8\3\2\2\2\u025c\u025e\7\17\2\2\u025d\u025f\7"+
		"\f\2\2\u025e\u025d\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0262\3\2\2\2\u0260"+
		"\u0262\7\f\2\2\u0261\u025c\3\2\2\2\u0261\u0260\3\2\2\2\u0262\u0263\3\2"+
		"\2\2\u0263\u0264\b]\3\2\u0264\u00ba\3\2\2\2\u0265\u0266\7\61\2\2\u0266"+
		"\u0267\7,\2\2\u0267\u026b\3\2\2\2\u0268\u026a\13\2\2\2\u0269\u0268\3\2"+
		"\2\2\u026a\u026d\3\2\2\2\u026b\u026c\3\2\2\2\u026b\u0269\3\2\2\2\u026c"+
		"\u026e\3\2\2\2\u026d\u026b\3\2\2\2\u026e\u026f\7,\2\2\u026f\u0270\7\61"+
		"\2\2\u0270\u0271\3\2\2\2\u0271\u0272\b^\3\2\u0272\u00bc\3\2\2\2\u0273"+
		"\u0274\7\61\2\2\u0274\u0275\7\61\2\2\u0275\u0279\3\2\2\2\u0276\u0278\n"+
		"\21\2\2\u0277\u0276\3\2\2\2\u0278\u027b\3\2\2\2\u0279\u0277\3\2\2\2\u0279"+
		"\u027a\3\2\2\2\u027a\u027c\3\2\2\2\u027b\u0279\3\2\2\2\u027c\u027d\b_"+
		"\3\2\u027d\u00be\3\2\2\2%\2\u00d2\u00d9\u00e4\u00e8\u00ec\u00f4\u016a"+
		"\u01a3\u01a9\u01d8\u01dd\u01df\u01e6\u01eb\u01ef\u01f5\u020e\u0211\u0217"+
		"\u021a\u0221\u0227\u022c\u0234\u023e\u0240\u0247\u024e\u0250\u0258\u025e"+
		"\u0261\u026b\u0279\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}