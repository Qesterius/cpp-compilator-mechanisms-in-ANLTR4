// Generated from g.g4 by ANTLR 4.9.3
package org.agh.cppinterpreter;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, Auto=8, Break=9, 
		Case=10, Char=11, Const=12, Continue=13, Default=14, Do=15, Double=16, 
		Else=17, Enum=18, Extern=19, Float=20, For=21, Goto=22, If=23, Inline=24, 
		Int=25, Long=26, Register=27, Restrict=28, Return=29, Short=30, Signed=31, 
		Sizeof=32, Static=33, Struct=34, Switch=35, Typedef=36, Union=37, Unsigned=38, 
		Void=39, Volatile=40, While=41, Alignas=42, Alignof=43, Atomic=44, Bool=45, 
		Complex=46, Generic=47, Imaginary=48, Noreturn=49, StaticAssert=50, ThreadLocal=51, 
		LeftParen=52, RightParen=53, LeftBracket=54, RightBracket=55, LeftBrace=56, 
		RightBrace=57, Less=58, LessEqual=59, Greater=60, GreaterEqual=61, LeftShift=62, 
		RightShift=63, Plus=64, PlusPlus=65, Minus=66, MinusMinus=67, Star=68, 
		Div=69, Mod=70, And=71, Or=72, AndAnd=73, OrOr=74, Caret=75, Not=76, Tilde=77, 
		Question=78, Colon=79, Semi=80, Comma=81, Assign=82, StarAssign=83, DivAssign=84, 
		ModAssign=85, PlusAssign=86, MinusAssign=87, LeftShiftAssign=88, RightShiftAssign=89, 
		AndAssign=90, XorAssign=91, OrAssign=92, Equal=93, NotEqual=94, Arrow=95, 
		Dot=96, Ellipsis=97, Identifier=98, IntegerConstant=99, FloatingConstant=100, 
		DigitSequence=101, StringLiteral=102, ComplexDefine=103, IncludeDirective=104, 
		AsmBlock=105, LineAfterPreprocessing=106, LineDirective=107, PragmaDirective=108, 
		Whitespace=109, Newline=110, BlockComment=111, LineComment=112, Matrix=113, 
		CharacterConstant=114;
	public static final int
		RULE_prog = 0, RULE_primaryExpression = 1, RULE_postfixExpression = 2, 
		RULE_argumentExpressionList = 3, RULE_unaryExpression = 4, RULE_unaryOperator = 5, 
		RULE_castExpression = 6, RULE_multiplicativeExpression = 7, RULE_additiveExpression = 8, 
		RULE_shiftExpression = 9, RULE_relationalExpression = 10, RULE_equalityExpression = 11, 
		RULE_andExpression = 12, RULE_exclusiveOrExpression = 13, RULE_inclusiveOrExpression = 14, 
		RULE_logicalAndExpression = 15, RULE_logicalOrExpression = 16, RULE_conditionalExpression = 17, 
		RULE_assignmentExpression = 18, RULE_expression = 19, RULE_constantExpression = 20, 
		RULE_declaration = 21, RULE_declarationSpecifiers = 22, RULE_declarationSpecifiers2 = 23, 
		RULE_declarationSpecifier = 24, RULE_initDeclaratorList = 25, RULE_initDeclarator = 26, 
		RULE_storageClassSpecifier = 27, RULE_typeSpecifier = 28, RULE_structOrUnionSpecifier = 29, 
		RULE_structOrUnion = 30, RULE_structDeclarationList = 31, RULE_structDeclaration = 32, 
		RULE_specifierQualifierList = 33, RULE_structDeclaratorList = 34, RULE_structDeclarator = 35, 
		RULE_enumSpecifier = 36, RULE_enumeratorList = 37, RULE_enumerator = 38, 
		RULE_enumerationConstant = 39, RULE_atomicTypeSpecifier = 40, RULE_typeQualifier = 41, 
		RULE_alignmentSpecifier = 42, RULE_declarator = 43, RULE_directDeclarator = 44, 
		RULE_nestedParenthesesBlock = 45, RULE_pointer = 46, RULE_typeQualifierList = 47, 
		RULE_parameterTypeList = 48, RULE_parameterList = 49, RULE_parameterDeclaration = 50, 
		RULE_identifierList = 51, RULE_typeName = 52, RULE_typedefName = 53, RULE_initializer = 54, 
		RULE_initializerList = 55, RULE_matrixInitializerList = 56, RULE_designation = 57, 
		RULE_designatorList = 58, RULE_designator = 59, RULE_statement = 60, RULE_labeledStatement = 61, 
		RULE_compoundStatement = 62, RULE_blockItemList = 63, RULE_blockItem = 64, 
		RULE_expressionStatement = 65, RULE_selectionStatement = 66, RULE_iterationStatement = 67, 
		RULE_forCondition = 68, RULE_forDeclaration = 69, RULE_forExpression = 70, 
		RULE_jumpStatement = 71, RULE_compilationUnit = 72, RULE_translationUnit = 73, 
		RULE_externalDeclaration = 74, RULE_functionDefinition = 75, RULE_declarationList = 76, 
		RULE_constant = 77, RULE_matrix = 78, RULE_row = 79, RULE_shortquery = 80, 
		RULE_sqlbase = 81, RULE_sqlwhere = 82, RULE_querydatajoin = 83, RULE_query = 84, 
		RULE_askingquery = 85;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "primaryExpression", "postfixExpression", "argumentExpressionList", 
			"unaryExpression", "unaryOperator", "castExpression", "multiplicativeExpression", 
			"additiveExpression", "shiftExpression", "relationalExpression", "equalityExpression", 
			"andExpression", "exclusiveOrExpression", "inclusiveOrExpression", "logicalAndExpression", 
			"logicalOrExpression", "conditionalExpression", "assignmentExpression", 
			"expression", "constantExpression", "declaration", "declarationSpecifiers", 
			"declarationSpecifiers2", "declarationSpecifier", "initDeclaratorList", 
			"initDeclarator", "storageClassSpecifier", "typeSpecifier", "structOrUnionSpecifier", 
			"structOrUnion", "structDeclarationList", "structDeclaration", "specifierQualifierList", 
			"structDeclaratorList", "structDeclarator", "enumSpecifier", "enumeratorList", 
			"enumerator", "enumerationConstant", "atomicTypeSpecifier", "typeQualifier", 
			"alignmentSpecifier", "declarator", "directDeclarator", "nestedParenthesesBlock", 
			"pointer", "typeQualifierList", "parameterTypeList", "parameterList", 
			"parameterDeclaration", "identifierList", "typeName", "typedefName", 
			"initializer", "initializerList", "matrixInitializerList", "designation", 
			"designatorList", "designator", "statement", "labeledStatement", "compoundStatement", 
			"blockItemList", "blockItem", "expressionStatement", "selectionStatement", 
			"iterationStatement", "forCondition", "forDeclaration", "forExpression", 
			"jumpStatement", "compilationUnit", "translationUnit", "externalDeclaration", 
			"functionDefinition", "declarationList", "constant", "matrix", "row", 
			"shortquery", "sqlbase", "sqlwhere", "querydatajoin", "query", "askingquery"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'__extension__'", "'__typeof__'", "'matrix'", "'$'", "'\\'", "'#'", 
			"'from'", "'auto'", "'break'", "'case'", "'char'", "'const'", "'continue'", 
			"'default'", "'do'", "'double'", "'else'", "'enum'", "'extern'", "'float'", 
			"'for'", "'goto'", "'if'", "'inline'", "'int'", "'long'", "'register'", 
			"'restrict'", "'return'", "'short'", "'signed'", "'sizeof'", "'static'", 
			"'struct'", "'switch'", "'typedef'", "'union'", "'unsigned'", "'void'", 
			"'volatile'", "'while'", "'_Alignas'", "'_Alignof'", "'_Atomic'", "'_Bool'", 
			"'_Complex'", "'_Generic'", "'_Imaginary'", "'_Noreturn'", "'_Static_assert'", 
			"'_Thread_local'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", 
			"'>'", "'>='", "'<<'", "'>>'", "'+'", "'++'", "'-'", "'--'", "'*'", "'/'", 
			"'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", "'~'", "'?'", "':'", 
			"';'", "','", "'='", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", 
			"'>>='", "'&='", "'^='", "'|='", "'=='", "'!='", "'->'", "'.'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "Auto", "Break", "Case", 
			"Char", "Const", "Continue", "Default", "Do", "Double", "Else", "Enum", 
			"Extern", "Float", "For", "Goto", "If", "Inline", "Int", "Long", "Register", 
			"Restrict", "Return", "Short", "Signed", "Sizeof", "Static", "Struct", 
			"Switch", "Typedef", "Union", "Unsigned", "Void", "Volatile", "While", 
			"Alignas", "Alignof", "Atomic", "Bool", "Complex", "Generic", "Imaginary", 
			"Noreturn", "StaticAssert", "ThreadLocal", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Less", "LessEqual", 
			"Greater", "GreaterEqual", "LeftShift", "RightShift", "Plus", "PlusPlus", 
			"Minus", "MinusMinus", "Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", 
			"Caret", "Not", "Tilde", "Question", "Colon", "Semi", "Comma", "Assign", 
			"StarAssign", "DivAssign", "ModAssign", "PlusAssign", "MinusAssign", 
			"LeftShiftAssign", "RightShiftAssign", "AndAssign", "XorAssign", "OrAssign", 
			"Equal", "NotEqual", "Arrow", "Dot", "Ellipsis", "Identifier", "IntegerConstant", 
			"FloatingConstant", "DigitSequence", "StringLiteral", "ComplexDefine", 
			"IncludeDirective", "AsmBlock", "LineAfterPreprocessing", "LineDirective", 
			"PragmaDirective", "Whitespace", "Newline", "BlockComment", "LineComment", 
			"Matrix", "CharacterConstant"
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
	public String getGrammarFileName() { return "g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public CompilationUnitContext compilationUnit() {
			return getRuleContext(CompilationUnitContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			compilationUnit();
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(gParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(gParser.StringLiteral, i);
		}
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primaryExpression);
		int _la;
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(Identifier);
				}
				break;
			case IntegerConstant:
			case FloatingConstant:
			case CharacterConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				constant();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(176);
					match(StringLiteral);
					}
					}
					setState(179); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				match(LeftParen);
				setState(182);
				expression();
				setState(183);
				match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				query();
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<TerminalNode> LeftParen() { return getTokens(gParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(gParser.LeftParen, i);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(gParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(gParser.RightParen, i);
		}
		public TerminalNode LeftBrace() { return getToken(gParser.LeftBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(gParser.RightBrace, 0); }
		public List<TerminalNode> LeftBracket() { return getTokens(gParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(gParser.LeftBracket, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(gParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(gParser.RightBracket, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(gParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(gParser.Identifier, i);
		}
		public List<TerminalNode> Dot() { return getTokens(gParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(gParser.Dot, i);
		}
		public List<TerminalNode> Arrow() { return getTokens(gParser.Arrow); }
		public TerminalNode Arrow(int i) {
			return getToken(gParser.Arrow, i);
		}
		public List<TerminalNode> PlusPlus() { return getTokens(gParser.PlusPlus); }
		public TerminalNode PlusPlus(int i) {
			return getToken(gParser.PlusPlus, i);
		}
		public List<TerminalNode> MinusMinus() { return getTokens(gParser.MinusMinus); }
		public TerminalNode MinusMinus(int i) {
			return getToken(gParser.MinusMinus, i);
		}
		public TerminalNode Comma() { return getToken(gParser.Comma, 0); }
		public List<ArgumentExpressionListContext> argumentExpressionList() {
			return getRuleContexts(ArgumentExpressionListContext.class);
		}
		public ArgumentExpressionListContext argumentExpressionList(int i) {
			return getRuleContext(ArgumentExpressionListContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(188);
				primaryExpression();
				}
				break;
			case 2:
				{
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(189);
					match(T__0);
					}
				}

				setState(192);
				match(LeftParen);
				setState(193);
				typeName();
				setState(194);
				match(RightParen);
				setState(195);
				match(LeftBrace);
				setState(196);
				initializerList();
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(197);
					match(Comma);
					}
				}

				setState(200);
				match(RightBrace);
				}
				break;
			}
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (LeftParen - 52)) | (1L << (LeftBracket - 52)) | (1L << (PlusPlus - 52)) | (1L << (MinusMinus - 52)) | (1L << (Arrow - 52)) | (1L << (Dot - 52)))) != 0)) {
				{
				setState(216);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftBracket:
					{
					setState(204);
					match(LeftBracket);
					setState(205);
					expression();
					setState(206);
					match(RightBracket);
					}
					break;
				case LeftParen:
					{
					setState(208);
					match(LeftParen);
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << Alignof) | (1L << LeftParen) | (1L << LeftBracket))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (CharacterConstant - 64)))) != 0)) {
						{
						setState(209);
						argumentExpressionList();
						}
					}

					setState(212);
					match(RightParen);
					}
					break;
				case Arrow:
				case Dot:
					{
					setState(213);
					_la = _input.LA(1);
					if ( !(_la==Arrow || _la==Dot) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(214);
					match(Identifier);
					}
					break;
				case PlusPlus:
				case MinusMinus:
					{
					setState(215);
					_la = _input.LA(1);
					if ( !(_la==PlusPlus || _la==MinusMinus) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(220);
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

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(gParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(gParser.Comma, i);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitArgumentExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_argumentExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			assignmentExpression();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(222);
				match(Comma);
				setState(223);
				assignmentExpression();
				}
				}
				setState(228);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public TerminalNode AndAnd() { return getToken(gParser.AndAnd, 0); }
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public List<TerminalNode> Sizeof() { return getTokens(gParser.Sizeof); }
		public TerminalNode Sizeof(int i) {
			return getToken(gParser.Sizeof, i);
		}
		public TerminalNode Alignof() { return getToken(gParser.Alignof, 0); }
		public List<TerminalNode> PlusPlus() { return getTokens(gParser.PlusPlus); }
		public TerminalNode PlusPlus(int i) {
			return getToken(gParser.PlusPlus, i);
		}
		public List<TerminalNode> MinusMinus() { return getTokens(gParser.MinusMinus); }
		public TerminalNode MinusMinus(int i) {
			return getToken(gParser.MinusMinus, i);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unaryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(229);
					_la = _input.LA(1);
					if ( !(((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (Sizeof - 32)) | (1L << (PlusPlus - 32)) | (1L << (MinusMinus - 32)))) != 0)) ) {
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
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case LeftParen:
			case LeftBracket:
			case Identifier:
			case IntegerConstant:
			case FloatingConstant:
			case StringLiteral:
			case CharacterConstant:
				{
				setState(235);
				postfixExpression();
				}
				break;
			case Plus:
			case Minus:
			case Star:
			case And:
			case Not:
			case Tilde:
				{
				setState(236);
				unaryOperator();
				setState(237);
				castExpression();
				}
				break;
			case Sizeof:
			case Alignof:
				{
				setState(239);
				_la = _input.LA(1);
				if ( !(_la==Sizeof || _la==Alignof) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(240);
				match(LeftParen);
				setState(241);
				typeName();
				setState(242);
				match(RightParen);
				}
				break;
			case AndAnd:
				{
				setState(244);
				match(AndAnd);
				setState(245);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(gParser.And, 0); }
		public TerminalNode Star() { return getToken(gParser.Star, 0); }
		public TerminalNode Plus() { return getToken(gParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(gParser.Minus, 0); }
		public TerminalNode Tilde() { return getToken(gParser.Tilde, 0); }
		public TerminalNode Not() { return getToken(gParser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)))) != 0)) ) {
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

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(gParser.DigitSequence, 0); }
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_castExpression);
		int _la;
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(250);
					match(T__0);
					}
				}

				setState(253);
				match(LeftParen);
				setState(254);
				typeName();
				setState(255);
				match(RightParen);
				setState(256);
				castExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				match(DigitSequence);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<CastExpressionContext> castExpression() {
			return getRuleContexts(CastExpressionContext.class);
		}
		public CastExpressionContext castExpression(int i) {
			return getRuleContext(CastExpressionContext.class,i);
		}
		public List<TerminalNode> Star() { return getTokens(gParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(gParser.Star, i);
		}
		public List<TerminalNode> Div() { return getTokens(gParser.Div); }
		public TerminalNode Div(int i) {
			return getToken(gParser.Div, i);
		}
		public List<TerminalNode> Mod() { return getTokens(gParser.Mod); }
		public TerminalNode Mod(int i) {
			return getToken(gParser.Mod, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			castExpression();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Star - 68)) | (1L << (Div - 68)) | (1L << (Mod - 68)))) != 0)) {
				{
				{
				setState(263);
				_la = _input.LA(1);
				if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Star - 68)) | (1L << (Div - 68)) | (1L << (Mod - 68)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(264);
				castExpression();
				}
				}
				setState(269);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(gParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(gParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(gParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(gParser.Minus, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			multiplicativeExpression();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				{
				setState(271);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(272);
				multiplicativeExpression();
				}
				}
				setState(277);
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

	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> LeftShift() { return getTokens(gParser.LeftShift); }
		public TerminalNode LeftShift(int i) {
			return getToken(gParser.LeftShift, i);
		}
		public List<TerminalNode> RightShift() { return getTokens(gParser.RightShift); }
		public TerminalNode RightShift(int i) {
			return getToken(gParser.RightShift, i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_shiftExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			additiveExpression();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftShift || _la==RightShift) {
				{
				{
				setState(279);
				_la = _input.LA(1);
				if ( !(_la==LeftShift || _la==RightShift) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(280);
				additiveExpression();
				}
				}
				setState(285);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<TerminalNode> Less() { return getTokens(gParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(gParser.Less, i);
		}
		public List<TerminalNode> Greater() { return getTokens(gParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(gParser.Greater, i);
		}
		public List<TerminalNode> LessEqual() { return getTokens(gParser.LessEqual); }
		public TerminalNode LessEqual(int i) {
			return getToken(gParser.LessEqual, i);
		}
		public List<TerminalNode> GreaterEqual() { return getTokens(gParser.GreaterEqual); }
		public TerminalNode GreaterEqual(int i) {
			return getToken(gParser.GreaterEqual, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			shiftExpression();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << LessEqual) | (1L << Greater) | (1L << GreaterEqual))) != 0)) {
				{
				{
				setState(287);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << LessEqual) | (1L << Greater) | (1L << GreaterEqual))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(288);
				shiftExpression();
				}
				}
				setState(293);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> Equal() { return getTokens(gParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(gParser.Equal, i);
		}
		public List<TerminalNode> NotEqual() { return getTokens(gParser.NotEqual); }
		public TerminalNode NotEqual(int i) {
			return getToken(gParser.NotEqual, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			relationalExpression();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Equal || _la==NotEqual) {
				{
				{
				setState(295);
				_la = _input.LA(1);
				if ( !(_la==Equal || _la==NotEqual) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(296);
				relationalExpression();
				}
				}
				setState(301);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(gParser.And); }
		public TerminalNode And(int i) {
			return getToken(gParser.And, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			equalityExpression();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(303);
				match(And);
				setState(304);
				equalityExpression();
				}
				}
				setState(309);
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

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> Caret() { return getTokens(gParser.Caret); }
		public TerminalNode Caret(int i) {
			return getToken(gParser.Caret, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			andExpression();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Caret) {
				{
				{
				setState(311);
				match(Caret);
				setState(312);
				andExpression();
				}
				}
				setState(317);
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

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> Or() { return getTokens(gParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(gParser.Or, i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_inclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			exclusiveOrExpression();
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(319);
					match(Or);
					setState(320);
					exclusiveOrExpression();
					}
					} 
				}
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> AndAnd() { return getTokens(gParser.AndAnd); }
		public TerminalNode AndAnd(int i) {
			return getToken(gParser.AndAnd, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			inclusiveOrExpression();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AndAnd) {
				{
				{
				setState(327);
				match(AndAnd);
				setState(328);
				inclusiveOrExpression();
				}
				}
				setState(333);
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

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OrOr() { return getTokens(gParser.OrOr); }
		public TerminalNode OrOr(int i) {
			return getToken(gParser.OrOr, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			logicalAndExpression();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrOr) {
				{
				{
				setState(335);
				match(OrOr);
				setState(336);
				logicalAndExpression();
				}
				}
				setState(341);
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode Question() { return getToken(gParser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(gParser.Colon, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			logicalOrExpression();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Question) {
				{
				setState(343);
				match(Question);
				setState(344);
				expression();
				setState(345);
				match(Colon);
				setState(346);
				conditionalExpression();
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Assign() { return getToken(gParser.Assign, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(gParser.DigitSequence, 0); }
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignmentExpression);
		try {
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				unaryExpression();
				setState(352);
				match(Assign);
				setState(353);
				assignmentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				match(DigitSequence);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(gParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(gParser.Comma, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			assignmentExpression();
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(359);
				match(Comma);
				setState(360);
				assignmentExpression();
				}
				}
				setState(365);
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			conditionalExpression();
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public TerminalNode Semi() { return getToken(gParser.Semi, 0); }
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			declarationSpecifiers();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (LeftParen - 52)) | (1L << (Star - 52)) | (1L << (Caret - 52)) | (1L << (Identifier - 52)))) != 0)) {
				{
				setState(369);
				initDeclaratorList();
				}
			}

			setState(372);
			match(Semi);
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

	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclarationSpecifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(375); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(374);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(377); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class DeclarationSpecifiers2Context extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiers2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclarationSpecifiers2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifiers2Context declarationSpecifiers2() throws RecognitionException {
		DeclarationSpecifiers2Context _localctx = new DeclarationSpecifiers2Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_declarationSpecifiers2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(379);
				declarationSpecifier();
				}
				}
				setState(382); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic))) != 0) || _la==Identifier || _la==Matrix );
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

	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public AlignmentSpecifierContext alignmentSpecifier() {
			return getRuleContext(AlignmentSpecifierContext.class,0);
		}
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclarationSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_declarationSpecifier);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				storageClassSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				typeSpecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				typeQualifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(387);
				alignmentSpecifier();
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

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(gParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(gParser.Comma, i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			initDeclarator();
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(391);
				match(Comma);
				setState(392);
				initDeclarator();
				}
				}
				setState(397);
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

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(gParser.Assign, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			declarator();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(399);
				match(Assign);
				setState(400);
				initializer();
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

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public TerminalNode Static() { return getToken(gParser.Static, 0); }
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStorageClassSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_storageClassSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(Static);
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

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Void() { return getToken(gParser.Void, 0); }
		public TerminalNode Char() { return getToken(gParser.Char, 0); }
		public TerminalNode Short() { return getToken(gParser.Short, 0); }
		public TerminalNode Int() { return getToken(gParser.Int, 0); }
		public TerminalNode Long() { return getToken(gParser.Long, 0); }
		public TerminalNode Float() { return getToken(gParser.Float, 0); }
		public TerminalNode Double() { return getToken(gParser.Double, 0); }
		public TerminalNode Signed() { return getToken(gParser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(gParser.Unsigned, 0); }
		public TerminalNode Matrix() { return getToken(gParser.Matrix, 0); }
		public AtomicTypeSpecifierContext atomicTypeSpecifier() {
			return getRuleContext(AtomicTypeSpecifierContext.class,0);
		}
		public StructOrUnionSpecifierContext structOrUnionSpecifier() {
			return getRuleContext(StructOrUnionSpecifierContext.class,0);
		}
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_typeSpecifier);
		try {
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Void:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				match(Void);
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				match(Char);
				}
				break;
			case Short:
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				match(Short);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 4);
				{
				setState(408);
				match(Int);
				}
				break;
			case Long:
				enterOuterAlt(_localctx, 5);
				{
				setState(409);
				match(Long);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 6);
				{
				setState(410);
				match(Float);
				}
				break;
			case Double:
				enterOuterAlt(_localctx, 7);
				{
				setState(411);
				match(Double);
				}
				break;
			case Signed:
				enterOuterAlt(_localctx, 8);
				{
				setState(412);
				match(Signed);
				}
				break;
			case Unsigned:
				enterOuterAlt(_localctx, 9);
				{
				setState(413);
				match(Unsigned);
				}
				break;
			case Matrix:
				enterOuterAlt(_localctx, 10);
				{
				setState(414);
				match(Matrix);
				}
				break;
			case Atomic:
				enterOuterAlt(_localctx, 11);
				{
				setState(415);
				atomicTypeSpecifier();
				}
				break;
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 12);
				{
				setState(416);
				structOrUnionSpecifier();
				}
				break;
			case Enum:
				enterOuterAlt(_localctx, 13);
				{
				setState(417);
				enumSpecifier();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 14);
				{
				setState(418);
				typedefName();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 15);
				{
				setState(419);
				match(T__1);
				setState(420);
				match(LeftParen);
				setState(421);
				constantExpression();
				setState(422);
				match(RightParen);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 16);
				{
				setState(424);
				match(T__2);
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

	public static class StructOrUnionSpecifierContext extends ParserRuleContext {
		public StructOrUnionContext structOrUnion() {
			return getRuleContext(StructOrUnionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(gParser.LeftBrace, 0); }
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(gParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public StructOrUnionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnionSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStructOrUnionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructOrUnionSpecifierContext structOrUnionSpecifier() throws RecognitionException {
		StructOrUnionSpecifierContext _localctx = new StructOrUnionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_structOrUnionSpecifier);
		int _la;
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				structOrUnion();
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(428);
					match(Identifier);
					}
				}

				setState(431);
				match(LeftBrace);
				setState(432);
				structDeclarationList();
				setState(433);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				structOrUnion();
				setState(436);
				match(Identifier);
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

	public static class StructOrUnionContext extends ParserRuleContext {
		public TerminalNode Struct() { return getToken(gParser.Struct, 0); }
		public TerminalNode Union() { return getToken(gParser.Union, 0); }
		public StructOrUnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStructOrUnion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructOrUnionContext structOrUnion() throws RecognitionException {
		StructOrUnionContext _localctx = new StructOrUnionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_structOrUnion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_la = _input.LA(1);
			if ( !(_la==Struct || _la==Union) ) {
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

	public static class StructDeclarationListContext extends ParserRuleContext {
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
		public StructDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarationList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStructDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationListContext structDeclarationList() throws RecognitionException {
		StructDeclarationListContext _localctx = new StructDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_structDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(442);
				structDeclaration();
				}
				}
				setState(445); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Atomic))) != 0) || _la==Identifier || _la==Matrix );
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

	public static class StructDeclarationContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public TerminalNode Semi() { return getToken(gParser.Semi, 0); }
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_structDeclaration);
		try {
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				specifierQualifierList();
				setState(448);
				structDeclaratorList();
				setState(449);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				specifierQualifierList();
				setState(452);
				match(Semi);
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

	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSpecifierQualifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_specifierQualifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(456);
				typeSpecifier();
				}
				break;
			case 2:
				{
				setState(457);
				typeQualifier();
				}
				break;
			}
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(460);
				specifierQualifierList();
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

	public static class StructDeclaratorListContext extends ParserRuleContext {
		public List<StructDeclaratorContext> structDeclarator() {
			return getRuleContexts(StructDeclaratorContext.class);
		}
		public StructDeclaratorContext structDeclarator(int i) {
			return getRuleContext(StructDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(gParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(gParser.Comma, i);
		}
		public StructDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaratorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStructDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclaratorListContext structDeclaratorList() throws RecognitionException {
		StructDeclaratorListContext _localctx = new StructDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_structDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			structDeclarator();
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(464);
				match(Comma);
				setState(465);
				structDeclarator();
				}
				}
				setState(470);
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

	public static class StructDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Colon() { return getToken(gParser.Colon, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public StructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStructDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclaratorContext structDeclarator() throws RecognitionException {
		StructDeclaratorContext _localctx = new StructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_structDeclarator);
		int _la;
		try {
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (LeftParen - 52)) | (1L << (Star - 52)) | (1L << (Caret - 52)) | (1L << (Identifier - 52)))) != 0)) {
					{
					setState(472);
					declarator();
					}
				}

				setState(475);
				match(Colon);
				setState(476);
				constantExpression();
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

	public static class EnumSpecifierContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(gParser.Enum, 0); }
		public TerminalNode LeftBrace() { return getToken(gParser.LeftBrace, 0); }
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(gParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public TerminalNode Comma() { return getToken(gParser.Comma, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitEnumSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_enumSpecifier);
		int _la;
		try {
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				match(Enum);
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(480);
					match(Identifier);
					}
				}

				setState(483);
				match(LeftBrace);
				setState(484);
				enumeratorList();
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(485);
					match(Comma);
					}
				}

				setState(488);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				match(Enum);
				setState(491);
				match(Identifier);
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

	public static class EnumeratorListContext extends ParserRuleContext {
		public List<EnumeratorContext> enumerator() {
			return getRuleContexts(EnumeratorContext.class);
		}
		public EnumeratorContext enumerator(int i) {
			return getRuleContext(EnumeratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(gParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(gParser.Comma, i);
		}
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitEnumeratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_enumeratorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			enumerator();
			setState(499);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(495);
					match(Comma);
					setState(496);
					enumerator();
					}
					} 
				}
				setState(501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	public static class EnumeratorContext extends ParserRuleContext {
		public EnumerationConstantContext enumerationConstant() {
			return getRuleContext(EnumerationConstantContext.class,0);
		}
		public TerminalNode Assign() { return getToken(gParser.Assign, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitEnumerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			enumerationConstant();
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(503);
				match(Assign);
				setState(504);
				constantExpression();
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

	public static class EnumerationConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public EnumerationConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitEnumerationConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerationConstantContext enumerationConstant() throws RecognitionException {
		EnumerationConstantContext _localctx = new EnumerationConstantContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(Identifier);
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

	public static class AtomicTypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Atomic() { return getToken(gParser.Atomic, 0); }
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public AtomicTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicTypeSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAtomicTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicTypeSpecifierContext atomicTypeSpecifier() throws RecognitionException {
		AtomicTypeSpecifierContext _localctx = new AtomicTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_atomicTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(Atomic);
			setState(510);
			match(LeftParen);
			setState(511);
			typeName();
			setState(512);
			match(RightParen);
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

	public static class TypeQualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(gParser.Const, 0); }
		public TerminalNode Restrict() { return getToken(gParser.Restrict, 0); }
		public TerminalNode Volatile() { return getToken(gParser.Volatile, 0); }
		public TerminalNode Atomic() { return getToken(gParser.Atomic, 0); }
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTypeQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) ) {
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

	public static class AlignmentSpecifierContext extends ParserRuleContext {
		public TerminalNode Alignas() { return getToken(gParser.Alignas, 0); }
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AlignmentSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAlignmentSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlignmentSpecifierContext alignmentSpecifier() throws RecognitionException {
		AlignmentSpecifierContext _localctx = new AlignmentSpecifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_alignmentSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(Alignas);
			setState(517);
			match(LeftParen);
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(518);
				typeName();
				}
				break;
			case 2:
				{
				setState(519);
				constantExpression();
				}
				break;
			}
			setState(522);
			match(RightParen);
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

	public static class DeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star || _la==Caret) {
				{
				setState(524);
				pointer();
				}
			}

			setState(527);
			directDeclarator(0);
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

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public TerminalNode Colon() { return getToken(gParser.Colon, 0); }
		public TerminalNode DigitSequence() { return getToken(gParser.DigitSequence, 0); }
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(gParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(gParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Static() { return getToken(gParser.Static, 0); }
		public TerminalNode Star() { return getToken(gParser.Star, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDirectDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(530);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(531);
				match(LeftParen);
				setState(532);
				declarator();
				setState(533);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(535);
				match(Identifier);
				setState(536);
				match(Colon);
				setState(537);
				match(DigitSequence);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(585);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(583);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(540);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(541);
						match(LeftBracket);
						setState(543);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(542);
							typeQualifierList();
							}
						}

						setState(546);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << Alignof) | (1L << LeftParen) | (1L << LeftBracket))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (CharacterConstant - 64)))) != 0)) {
							{
							setState(545);
							assignmentExpression();
							}
						}

						setState(548);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(549);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(550);
						match(LeftBracket);
						setState(551);
						match(Static);
						setState(553);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(552);
							typeQualifierList();
							}
						}

						setState(555);
						assignmentExpression();
						setState(556);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(558);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(559);
						match(LeftBracket);
						setState(560);
						typeQualifierList();
						setState(561);
						match(Static);
						setState(562);
						assignmentExpression();
						setState(563);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(565);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(566);
						match(LeftBracket);
						setState(568);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(567);
							typeQualifierList();
							}
						}

						setState(570);
						match(Star);
						setState(571);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(572);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(573);
						match(LeftParen);
						setState(574);
						parameterTypeList();
						setState(575);
						match(RightParen);
						}
						break;
					case 6:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(577);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(578);
						match(LeftParen);
						setState(580);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(579);
							identifierList();
							}
						}

						setState(582);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(587);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NestedParenthesesBlockContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() { return getTokens(gParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(gParser.LeftParen, i);
		}
		public List<NestedParenthesesBlockContext> nestedParenthesesBlock() {
			return getRuleContexts(NestedParenthesesBlockContext.class);
		}
		public NestedParenthesesBlockContext nestedParenthesesBlock(int i) {
			return getRuleContext(NestedParenthesesBlockContext.class,i);
		}
		public List<TerminalNode> RightParen() { return getTokens(gParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(gParser.RightParen, i);
		}
		public NestedParenthesesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedParenthesesBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNestedParenthesesBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedParenthesesBlockContext nestedParenthesesBlock() throws RecognitionException {
		NestedParenthesesBlockContext _localctx = new NestedParenthesesBlockContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Less) | (1L << LessEqual) | (1L << Greater) | (1L << GreaterEqual) | (1L << LeftShift) | (1L << RightShift))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Comma - 64)) | (1L << (Assign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (Arrow - 64)) | (1L << (Dot - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (ComplexDefine - 64)) | (1L << (IncludeDirective - 64)) | (1L << (AsmBlock - 64)) | (1L << (LineAfterPreprocessing - 64)) | (1L << (LineDirective - 64)) | (1L << (PragmaDirective - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)) | (1L << (Matrix - 64)) | (1L << (CharacterConstant - 64)))) != 0)) {
				{
				setState(593);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case Auto:
				case Break:
				case Case:
				case Char:
				case Const:
				case Continue:
				case Default:
				case Do:
				case Double:
				case Else:
				case Enum:
				case Extern:
				case Float:
				case For:
				case Goto:
				case If:
				case Inline:
				case Int:
				case Long:
				case Register:
				case Restrict:
				case Return:
				case Short:
				case Signed:
				case Sizeof:
				case Static:
				case Struct:
				case Switch:
				case Typedef:
				case Union:
				case Unsigned:
				case Void:
				case Volatile:
				case While:
				case Alignas:
				case Alignof:
				case Atomic:
				case Bool:
				case Complex:
				case Generic:
				case Imaginary:
				case Noreturn:
				case StaticAssert:
				case ThreadLocal:
				case LeftBracket:
				case RightBracket:
				case LeftBrace:
				case RightBrace:
				case Less:
				case LessEqual:
				case Greater:
				case GreaterEqual:
				case LeftShift:
				case RightShift:
				case Plus:
				case PlusPlus:
				case Minus:
				case MinusMinus:
				case Star:
				case Div:
				case Mod:
				case And:
				case Or:
				case AndAnd:
				case OrOr:
				case Caret:
				case Not:
				case Tilde:
				case Question:
				case Colon:
				case Semi:
				case Comma:
				case Assign:
				case StarAssign:
				case DivAssign:
				case ModAssign:
				case PlusAssign:
				case MinusAssign:
				case LeftShiftAssign:
				case RightShiftAssign:
				case AndAssign:
				case XorAssign:
				case OrAssign:
				case Equal:
				case NotEqual:
				case Arrow:
				case Dot:
				case Ellipsis:
				case Identifier:
				case IntegerConstant:
				case FloatingConstant:
				case DigitSequence:
				case StringLiteral:
				case ComplexDefine:
				case IncludeDirective:
				case AsmBlock:
				case LineAfterPreprocessing:
				case LineDirective:
				case PragmaDirective:
				case Whitespace:
				case Newline:
				case BlockComment:
				case LineComment:
				case Matrix:
				case CharacterConstant:
					{
					setState(588);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LeftParen || _la==RightParen) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case LeftParen:
					{
					setState(589);
					match(LeftParen);
					setState(590);
					nestedParenthesesBlock();
					setState(591);
					match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(597);
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

	public static class PointerContext extends ParserRuleContext {
		public List<TerminalNode> Star() { return getTokens(gParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(gParser.Star, i);
		}
		public List<TerminalNode> Caret() { return getTokens(gParser.Caret); }
		public TerminalNode Caret(int i) {
			return getToken(gParser.Caret, i);
		}
		public List<TypeQualifierListContext> typeQualifierList() {
			return getRuleContexts(TypeQualifierListContext.class);
		}
		public TypeQualifierListContext typeQualifierList(int i) {
			return getRuleContext(TypeQualifierListContext.class,i);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_pointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(598);
				_la = _input.LA(1);
				if ( !(_la==Star || _la==Caret) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(599);
					typeQualifierList();
					}
				}

				}
				}
				setState(604); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Star || _la==Caret );
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

	public static class TypeQualifierListContext extends ParserRuleContext {
		public List<TypeQualifierContext> typeQualifier() {
			return getRuleContexts(TypeQualifierContext.class);
		}
		public TypeQualifierContext typeQualifier(int i) {
			return getRuleContext(TypeQualifierContext.class,i);
		}
		public TypeQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifierList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTypeQualifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierListContext typeQualifierList() throws RecognitionException {
		TypeQualifierListContext _localctx = new TypeQualifierListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_typeQualifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(606);
				typeQualifier();
				}
				}
				setState(609); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0) );
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

	public static class ParameterTypeListContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(gParser.Comma, 0); }
		public TerminalNode Ellipsis() { return getToken(gParser.Ellipsis, 0); }
		public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTypeList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitParameterTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
		ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_parameterTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			parameterList();
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(612);
				match(Comma);
				setState(613);
				match(Ellipsis);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(gParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(gParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			parameterDeclaration();
			setState(621);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(617);
					match(Comma);
					setState(618);
					parameterDeclaration();
					}
					} 
				}
				setState(623);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public DeclarationSpecifiers2Context declarationSpecifiers2() {
			return getRuleContext(DeclarationSpecifiers2Context.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_parameterDeclaration);
		try {
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				declarationSpecifiers();
				setState(625);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				declarationSpecifiers2();
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(gParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(gParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(gParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(gParser.Comma, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(Identifier);
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(631);
				match(Comma);
				setState(632);
				match(Identifier);
				}
				}
				setState(637);
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

	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			specifierQualifierList();
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

	public static class TypedefNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTypedefName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(Identifier);
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

	public static class InitializerContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(gParser.LeftBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(gParser.RightBrace, 0); }
		public TerminalNode Comma() { return getToken(gParser.Comma, 0); }
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_initializer);
		int _la;
		try {
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				assignmentExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				match(LeftBrace);
				setState(644);
				initializerList();
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(645);
					match(Comma);
					}
				}

				setState(648);
				match(RightBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(650);
				matrix();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(651);
				query();
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

	public static class InitializerListContext extends ParserRuleContext {
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public List<DesignationContext> designation() {
			return getRuleContexts(DesignationContext.class);
		}
		public DesignationContext designation(int i) {
			return getRuleContext(DesignationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(gParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(gParser.Comma, i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_initializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(654);
				designation();
				}
				break;
			}
			setState(657);
			initializer();
			setState(665);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(658);
					match(Comma);
					setState(660);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						setState(659);
						designation();
						}
						break;
					}
					setState(662);
					initializer();
					}
					} 
				}
				setState(667);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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

	public static class MatrixInitializerListContext extends ParserRuleContext {
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public List<DesignationContext> designation() {
			return getRuleContexts(DesignationContext.class);
		}
		public DesignationContext designation(int i) {
			return getRuleContext(DesignationContext.class,i);
		}
		public List<TerminalNode> Or() { return getTokens(gParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(gParser.Or, i);
		}
		public MatrixInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixInitializerList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMatrixInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixInitializerListContext matrixInitializerList() throws RecognitionException {
		MatrixInitializerListContext _localctx = new MatrixInitializerListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_matrixInitializerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(668);
				designation();
				}
				break;
			}
			setState(671);
			initializer();
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(672);
				match(Or);
				setState(674);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(673);
					designation();
					}
					break;
				}
				setState(676);
				initializer();
				}
				}
				setState(681);
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

	public static class DesignationContext extends ParserRuleContext {
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public TerminalNode Assign() { return getToken(gParser.Assign, 0); }
		public DesignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDesignation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignationContext designation() throws RecognitionException {
		DesignationContext _localctx = new DesignationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			designatorList();
			setState(683);
			match(Assign);
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

	public static class DesignatorListContext extends ParserRuleContext {
		public List<DesignatorContext> designator() {
			return getRuleContexts(DesignatorContext.class);
		}
		public DesignatorContext designator(int i) {
			return getRuleContext(DesignatorContext.class,i);
		}
		public DesignatorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designatorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDesignatorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorListContext designatorList() throws RecognitionException {
		DesignatorListContext _localctx = new DesignatorListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_designatorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(685);
				designator();
				}
				}
				setState(688); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LeftBracket || _la==Dot );
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

	public static class DesignatorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(gParser.LeftBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(gParser.RightBracket, 0); }
		public TerminalNode Dot() { return getToken(gParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_designator);
		try {
			setState(696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				match(LeftBracket);
				setState(691);
				constantExpression();
				setState(692);
				match(RightBracket);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				match(Dot);
				setState(695);
				match(Identifier);
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

	public static class StatementContext extends ParserRuleContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_statement);
		try {
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(699);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(700);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(701);
				selectionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(702);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(703);
				jumpStatement();
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

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(gParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Case() { return getToken(gParser.Case, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(gParser.Default, 0); }
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_labeledStatement);
		try {
			setState(717);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(706);
				match(Identifier);
				setState(707);
				match(Colon);
				setState(708);
				statement();
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				match(Case);
				setState(710);
				constantExpression();
				setState(711);
				match(Colon);
				setState(712);
				statement();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 3);
				{
				setState(714);
				match(Default);
				setState(715);
				match(Colon);
				setState(716);
				statement();
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(gParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(gParser.RightBrace, 0); }
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(LeftBrace);
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Int) | (1L << Long) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Semi - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (Matrix - 64)) | (1L << (CharacterConstant - 64)))) != 0)) {
				{
				setState(720);
				blockItemList();
				}
			}

			setState(723);
			match(RightBrace);
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

	public static class BlockItemListContext extends ParserRuleContext {
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBlockItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_blockItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(725);
				blockItem();
				}
				}
				setState(728); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Int) | (1L << Long) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Semi - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (Matrix - 64)) | (1L << (CharacterConstant - 64)))) != 0) );
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

	public static class BlockItemContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBlockItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_blockItem);
		try {
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
				declaration();
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(gParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << Alignof) | (1L << LeftParen) | (1L << LeftBracket))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (CharacterConstant - 64)))) != 0)) {
				{
				setState(734);
				expression();
				}
			}

			setState(737);
			match(Semi);
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

	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(gParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(gParser.Else, 0); }
		public TerminalNode Switch() { return getToken(gParser.Switch, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_selectionStatement);
		try {
			setState(754);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				match(If);
				setState(740);
				match(LeftParen);
				setState(741);
				expression();
				setState(742);
				match(RightParen);
				setState(743);
				statement();
				setState(746);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(744);
					match(Else);
					setState(745);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(748);
				match(Switch);
				setState(749);
				match(LeftParen);
				setState(750);
				expression();
				setState(751);
				match(RightParen);
				setState(752);
				statement();
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

	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(gParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(gParser.Do, 0); }
		public TerminalNode Semi() { return getToken(gParser.Semi, 0); }
		public TerminalNode For() { return getToken(gParser.For, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_iterationStatement);
		try {
			setState(776);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(756);
				match(While);
				setState(757);
				match(LeftParen);
				setState(758);
				expression();
				setState(759);
				match(RightParen);
				setState(760);
				statement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				match(Do);
				setState(763);
				statement();
				setState(764);
				match(While);
				setState(765);
				match(LeftParen);
				setState(766);
				expression();
				setState(767);
				match(RightParen);
				setState(768);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(770);
				match(For);
				setState(771);
				match(LeftParen);
				setState(772);
				forCondition();
				setState(773);
				match(RightParen);
				setState(774);
				statement();
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

	public static class ForConditionContext extends ParserRuleContext {
		public List<TerminalNode> Semi() { return getTokens(gParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(gParser.Semi, i);
		}
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(778);
				forDeclaration();
				}
				break;
			case 2:
				{
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << Alignof) | (1L << LeftParen) | (1L << LeftBracket))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (CharacterConstant - 64)))) != 0)) {
					{
					setState(779);
					expression();
					}
				}

				}
				break;
			}
			setState(784);
			match(Semi);
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << Alignof) | (1L << LeftParen) | (1L << LeftBracket))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (CharacterConstant - 64)))) != 0)) {
				{
				setState(785);
				forExpression();
				}
			}

			setState(788);
			match(Semi);
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << Alignof) | (1L << LeftParen) | (1L << LeftBracket))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (CharacterConstant - 64)))) != 0)) {
				{
				setState(789);
				forExpression();
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

	public static class ForDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_forDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			declarationSpecifiers();
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (LeftParen - 52)) | (1L << (Star - 52)) | (1L << (Caret - 52)) | (1L << (Identifier - 52)))) != 0)) {
				{
				setState(793);
				initDeclaratorList();
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

	public static class ForExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(gParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(gParser.Comma, i);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			assignmentExpression();
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(797);
				match(Comma);
				setState(798);
				assignmentExpression();
				}
				}
				setState(803);
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

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(gParser.Semi, 0); }
		public TerminalNode Goto() { return getToken(gParser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public TerminalNode Return() { return getToken(gParser.Return, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Continue() { return getToken(gParser.Continue, 0); }
		public TerminalNode Break() { return getToken(gParser.Break, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_jumpStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(804);
				match(Goto);
				setState(805);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(806);
				_la = _input.LA(1);
				if ( !(_la==Break || _la==Continue) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				setState(807);
				match(Return);
				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << Alignof) | (1L << LeftParen) | (1L << LeftBracket))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (CharacterConstant - 64)))) != 0)) {
					{
					setState(808);
					expression();
					}
				}

				}
				break;
			case 4:
				{
				setState(811);
				match(Goto);
				setState(812);
				unaryExpression();
				}
				break;
			}
			setState(815);
			match(Semi);
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

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(gParser.EOF, 0); }
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << LeftParen))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Star - 68)) | (1L << (Caret - 68)) | (1L << (Semi - 68)) | (1L << (Identifier - 68)) | (1L << (Matrix - 68)))) != 0)) {
				{
				setState(817);
				translationUnit();
				}
			}

			setState(820);
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

	public static class TranslationUnitContext extends ParserRuleContext {
		public List<ExternalDeclarationContext> externalDeclaration() {
			return getRuleContexts(ExternalDeclarationContext.class);
		}
		public ExternalDeclarationContext externalDeclaration(int i) {
			return getRuleContext(ExternalDeclarationContext.class,i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(822);
				externalDeclaration();
				}
				}
				setState(825); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << LeftParen))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Star - 68)) | (1L << (Caret - 68)) | (1L << (Semi - 68)) | (1L << (Identifier - 68)) | (1L << (Matrix - 68)))) != 0) );
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

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Semi() { return getToken(gParser.Semi, 0); }
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExternalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_externalDeclaration);
		try {
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(827);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(829);
				match(Semi);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(832);
				declarationSpecifiers();
				}
				break;
			}
			setState(835);
			declarator();
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic))) != 0) || _la==Identifier || _la==Matrix) {
				{
				setState(836);
				declarationList();
				}
			}

			setState(839);
			compoundStatement();
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

	public static class DeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(841);
				declaration();
				}
				}
				setState(844); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic))) != 0) || _la==Identifier || _la==Matrix );
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode IntegerConstant() { return getToken(gParser.IntegerConstant, 0); }
		public TerminalNode FloatingConstant() { return getToken(gParser.FloatingConstant, 0); }
		public TerminalNode CharacterConstant() { return getToken(gParser.CharacterConstant, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			_la = _input.LA(1);
			if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (IntegerConstant - 99)) | (1L << (FloatingConstant - 99)) | (1L << (CharacterConstant - 99)))) != 0)) ) {
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

	public static class MatrixContext extends ParserRuleContext {
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public MatrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMatrix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixContext matrix() throws RecognitionException {
		MatrixContext _localctx = new MatrixContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_matrix);
		int _la;
		try {
			setState(860);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(848);
				match(T__3);
				setState(849);
				row();
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(850);
					match(T__4);
					setState(851);
					row();
					}
					}
					setState(856);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(857);
				match(T__5);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(859);
				query();
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

	public static class RowContext extends ParserRuleContext {
		public MatrixInitializerListContext matrixInitializerList() {
			return getRuleContext(MatrixInitializerListContext.class,0);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_row);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			matrixInitializerList();
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

	public static class ShortqueryContext extends ParserRuleContext {
		public SqlbaseContext sqlbase() {
			return getRuleContext(SqlbaseContext.class,0);
		}
		public SqlwhereContext sqlwhere() {
			return getRuleContext(SqlwhereContext.class,0);
		}
		public ShortqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortquery; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitShortquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortqueryContext shortquery() throws RecognitionException {
		ShortqueryContext _localctx = new ShortqueryContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_shortquery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			sqlbase();
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket) {
				{
				setState(865);
				sqlwhere();
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

	public static class SqlbaseContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(gParser.LeftBracket, 0); }
		public List<QuerydatajoinContext> querydatajoin() {
			return getRuleContexts(QuerydatajoinContext.class);
		}
		public QuerydatajoinContext querydatajoin(int i) {
			return getRuleContext(QuerydatajoinContext.class,i);
		}
		public TerminalNode RightBracket() { return getToken(gParser.RightBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(gParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(gParser.Comma, i);
		}
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public SqlbaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlbase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSqlbase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlbaseContext sqlbase() throws RecognitionException {
		SqlbaseContext _localctx = new SqlbaseContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_sqlbase);
		int _la;
		try {
			setState(880);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				match(LeftBracket);
				setState(869);
				querydatajoin();
				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(870);
					match(Comma);
					setState(871);
					querydatajoin();
					}
					}
					setState(876);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(877);
				match(RightBracket);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(879);
				match(Identifier);
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

	public static class SqlwhereContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(gParser.LeftBracket, 0); }
		public List<ConditionalExpressionContext> conditionalExpression() {
			return getRuleContexts(ConditionalExpressionContext.class);
		}
		public ConditionalExpressionContext conditionalExpression(int i) {
			return getRuleContext(ConditionalExpressionContext.class,i);
		}
		public TerminalNode RightBracket() { return getToken(gParser.RightBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(gParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(gParser.Comma, i);
		}
		public SqlwhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlwhere; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSqlwhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlwhereContext sqlwhere() throws RecognitionException {
		SqlwhereContext _localctx = new SqlwhereContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_sqlwhere);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			match(LeftBracket);
			setState(883);
			conditionalExpression();
			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(884);
				match(Comma);
				setState(885);
				conditionalExpression();
				}
				}
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(891);
			match(RightBracket);
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

	public static class QuerydatajoinContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(gParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(gParser.Identifier, i);
		}
		public List<TerminalNode> Colon() { return getTokens(gParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(gParser.Colon, i);
		}
		public List<TerminalNode> Dot() { return getTokens(gParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(gParser.Dot, i);
		}
		public List<TerminalNode> Comma() { return getTokens(gParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(gParser.Comma, i);
		}
		public QuerydatajoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querydatajoin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitQuerydatajoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerydatajoinContext querydatajoin() throws RecognitionException {
		QuerydatajoinContext _localctx = new QuerydatajoinContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_querydatajoin);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			match(Identifier);
			setState(898);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(894);
					_la = _input.LA(1);
					if ( !(_la==Comma || _la==Dot) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(895);
					match(Identifier);
					}
					} 
				}
				setState(900);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			}
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Colon) {
				{
				{
				setState(901);
				match(Colon);
				setState(902);
				match(Identifier);
				setState(905); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(903);
						match(Comma);
						setState(904);
						match(Identifier);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(907); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(913);
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

	public static class QueryContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(gParser.LeftBracket, 0); }
		public List<TerminalNode> Identifier() { return getTokens(gParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(gParser.Identifier, i);
		}
		public ShortqueryContext shortquery() {
			return getRuleContext(ShortqueryContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(gParser.RightBracket, 0); }
		public List<TerminalNode> Or() { return getTokens(gParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(gParser.Or, i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			match(LeftBracket);
			setState(915);
			match(Identifier);
			setState(918); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(916);
				match(Or);
				setState(917);
				match(Identifier);
				}
				}
				setState(920); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Or );
			setState(922);
			match(T__6);
			setState(923);
			shortquery();
			setState(924);
			match(RightBracket);
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

	public static class AskingqueryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public TerminalNode Question() { return getToken(gParser.Question, 0); }
		public SqlwhereContext sqlwhere() {
			return getRuleContext(SqlwhereContext.class,0);
		}
		public AskingqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_askingquery; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAskingquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AskingqueryContext askingquery() throws RecognitionException {
		AskingqueryContext _localctx = new AskingqueryContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_askingquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(Identifier);
			setState(927);
			match(Question);
			setState(928);
			sqlwhere();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 44:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3t\u03a5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\3\3\3\3\3\6\3\u00b4\n\3\r\3\16\3\u00b5\3"+
		"\3\3\3\3\3\3\3\3\3\5\3\u00bd\n\3\3\4\3\4\5\4\u00c1\n\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\u00c9\n\4\3\4\3\4\5\4\u00cd\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\u00d5\n\4\3\4\3\4\3\4\3\4\7\4\u00db\n\4\f\4\16\4\u00de\13\4\3\5\3\5"+
		"\3\5\7\5\u00e3\n\5\f\5\16\5\u00e6\13\5\3\6\7\6\u00e9\n\6\f\6\16\6\u00ec"+
		"\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00f9\n\6\3\7\3"+
		"\7\3\b\5\b\u00fe\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0107\n\b\3\t\3\t"+
		"\3\t\7\t\u010c\n\t\f\t\16\t\u010f\13\t\3\n\3\n\3\n\7\n\u0114\n\n\f\n\16"+
		"\n\u0117\13\n\3\13\3\13\3\13\7\13\u011c\n\13\f\13\16\13\u011f\13\13\3"+
		"\f\3\f\3\f\7\f\u0124\n\f\f\f\16\f\u0127\13\f\3\r\3\r\3\r\7\r\u012c\n\r"+
		"\f\r\16\r\u012f\13\r\3\16\3\16\3\16\7\16\u0134\n\16\f\16\16\16\u0137\13"+
		"\16\3\17\3\17\3\17\7\17\u013c\n\17\f\17\16\17\u013f\13\17\3\20\3\20\3"+
		"\20\7\20\u0144\n\20\f\20\16\20\u0147\13\20\3\21\3\21\3\21\7\21\u014c\n"+
		"\21\f\21\16\21\u014f\13\21\3\22\3\22\3\22\7\22\u0154\n\22\f\22\16\22\u0157"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u015f\n\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\5\24\u0167\n\24\3\25\3\25\3\25\7\25\u016c\n\25\f\25\16\25"+
		"\u016f\13\25\3\26\3\26\3\27\3\27\5\27\u0175\n\27\3\27\3\27\3\30\6\30\u017a"+
		"\n\30\r\30\16\30\u017b\3\31\6\31\u017f\n\31\r\31\16\31\u0180\3\32\3\32"+
		"\3\32\3\32\5\32\u0187\n\32\3\33\3\33\3\33\7\33\u018c\n\33\f\33\16\33\u018f"+
		"\13\33\3\34\3\34\3\34\5\34\u0194\n\34\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\5\36\u01ac\n\36\3\37\3\37\5\37\u01b0\n\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u01b9\n\37\3 \3 \3!\6!\u01be\n!\r!\16!\u01bf\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01c9\n\"\3#\3#\5#\u01cd\n#\3#\5#\u01d0\n"+
		"#\3$\3$\3$\7$\u01d5\n$\f$\16$\u01d8\13$\3%\3%\5%\u01dc\n%\3%\3%\5%\u01e0"+
		"\n%\3&\3&\5&\u01e4\n&\3&\3&\3&\5&\u01e9\n&\3&\3&\3&\3&\5&\u01ef\n&\3\'"+
		"\3\'\3\'\7\'\u01f4\n\'\f\'\16\'\u01f7\13\'\3(\3(\3(\5(\u01fc\n(\3)\3)"+
		"\3*\3*\3*\3*\3*\3+\3+\3,\3,\3,\3,\5,\u020b\n,\3,\3,\3-\5-\u0210\n-\3-"+
		"\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u021d\n.\3.\3.\3.\5.\u0222\n.\3.\5."+
		"\u0225\n.\3.\3.\3.\3.\3.\5.\u022c\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\5.\u023b\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0247\n.\3.\7.\u024a"+
		"\n.\f.\16.\u024d\13.\3/\3/\3/\3/\3/\7/\u0254\n/\f/\16/\u0257\13/\3\60"+
		"\3\60\5\60\u025b\n\60\6\60\u025d\n\60\r\60\16\60\u025e\3\61\6\61\u0262"+
		"\n\61\r\61\16\61\u0263\3\62\3\62\3\62\5\62\u0269\n\62\3\63\3\63\3\63\7"+
		"\63\u026e\n\63\f\63\16\63\u0271\13\63\3\64\3\64\3\64\3\64\5\64\u0277\n"+
		"\64\3\65\3\65\3\65\7\65\u027c\n\65\f\65\16\65\u027f\13\65\3\66\3\66\3"+
		"\67\3\67\38\38\38\38\58\u0289\n8\38\38\38\38\58\u028f\n8\39\59\u0292\n"+
		"9\39\39\39\59\u0297\n9\39\79\u029a\n9\f9\169\u029d\139\3:\5:\u02a0\n:"+
		"\3:\3:\3:\5:\u02a5\n:\3:\7:\u02a8\n:\f:\16:\u02ab\13:\3;\3;\3;\3<\6<\u02b1"+
		"\n<\r<\16<\u02b2\3=\3=\3=\3=\3=\3=\5=\u02bb\n=\3>\3>\3>\3>\3>\3>\5>\u02c3"+
		"\n>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u02d0\n?\3@\3@\5@\u02d4\n@\3@"+
		"\3@\3A\6A\u02d9\nA\rA\16A\u02da\3B\3B\5B\u02df\nB\3C\5C\u02e2\nC\3C\3"+
		"C\3D\3D\3D\3D\3D\3D\3D\5D\u02ed\nD\3D\3D\3D\3D\3D\3D\5D\u02f5\nD\3E\3"+
		"E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u030b\nE\3"+
		"F\3F\5F\u030f\nF\5F\u0311\nF\3F\3F\5F\u0315\nF\3F\3F\5F\u0319\nF\3G\3"+
		"G\5G\u031d\nG\3H\3H\3H\7H\u0322\nH\fH\16H\u0325\13H\3I\3I\3I\3I\3I\5I"+
		"\u032c\nI\3I\3I\5I\u0330\nI\3I\3I\3J\5J\u0335\nJ\3J\3J\3K\6K\u033a\nK"+
		"\rK\16K\u033b\3L\3L\3L\5L\u0341\nL\3M\5M\u0344\nM\3M\3M\5M\u0348\nM\3"+
		"M\3M\3N\6N\u034d\nN\rN\16N\u034e\3O\3O\3P\3P\3P\3P\7P\u0357\nP\fP\16P"+
		"\u035a\13P\3P\3P\3P\5P\u035f\nP\3Q\3Q\3R\3R\5R\u0365\nR\3S\3S\3S\3S\7"+
		"S\u036b\nS\fS\16S\u036e\13S\3S\3S\3S\5S\u0373\nS\3T\3T\3T\3T\7T\u0379"+
		"\nT\fT\16T\u037c\13T\3T\3T\3U\3U\3U\7U\u0383\nU\fU\16U\u0386\13U\3U\3"+
		"U\3U\3U\6U\u038c\nU\rU\16U\u038d\7U\u0390\nU\fU\16U\u0393\13U\3V\3V\3"+
		"V\3V\6V\u0399\nV\rV\16V\u039a\3V\3V\3V\3V\3W\3W\3W\3W\3W\2\3ZX\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\2\23\3\2ab\4\2CCEE\5\2\"\"CCEE\4\2\"\"--\7\2BBDDFFIINO\3"+
		"\2FH\4\2BBDD\3\2@A\3\2<?\3\2_`\4\2$$\'\'\6\2\16\16\36\36**..\3\2\66\67"+
		"\4\2FFMM\4\2\13\13\17\17\4\2eftt\4\2SSbb\2\u03e4\2\u00ae\3\2\2\2\4\u00bc"+
		"\3\2\2\2\6\u00cc\3\2\2\2\b\u00df\3\2\2\2\n\u00ea\3\2\2\2\f\u00fa\3\2\2"+
		"\2\16\u0106\3\2\2\2\20\u0108\3\2\2\2\22\u0110\3\2\2\2\24\u0118\3\2\2\2"+
		"\26\u0120\3\2\2\2\30\u0128\3\2\2\2\32\u0130\3\2\2\2\34\u0138\3\2\2\2\36"+
		"\u0140\3\2\2\2 \u0148\3\2\2\2\"\u0150\3\2\2\2$\u0158\3\2\2\2&\u0166\3"+
		"\2\2\2(\u0168\3\2\2\2*\u0170\3\2\2\2,\u0172\3\2\2\2.\u0179\3\2\2\2\60"+
		"\u017e\3\2\2\2\62\u0186\3\2\2\2\64\u0188\3\2\2\2\66\u0190\3\2\2\28\u0195"+
		"\3\2\2\2:\u01ab\3\2\2\2<\u01b8\3\2\2\2>\u01ba\3\2\2\2@\u01bd\3\2\2\2B"+
		"\u01c8\3\2\2\2D\u01cc\3\2\2\2F\u01d1\3\2\2\2H\u01df\3\2\2\2J\u01ee\3\2"+
		"\2\2L\u01f0\3\2\2\2N\u01f8\3\2\2\2P\u01fd\3\2\2\2R\u01ff\3\2\2\2T\u0204"+
		"\3\2\2\2V\u0206\3\2\2\2X\u020f\3\2\2\2Z\u021c\3\2\2\2\\\u0255\3\2\2\2"+
		"^\u025c\3\2\2\2`\u0261\3\2\2\2b\u0265\3\2\2\2d\u026a\3\2\2\2f\u0276\3"+
		"\2\2\2h\u0278\3\2\2\2j\u0280\3\2\2\2l\u0282\3\2\2\2n\u028e\3\2\2\2p\u0291"+
		"\3\2\2\2r\u029f\3\2\2\2t\u02ac\3\2\2\2v\u02b0\3\2\2\2x\u02ba\3\2\2\2z"+
		"\u02c2\3\2\2\2|\u02cf\3\2\2\2~\u02d1\3\2\2\2\u0080\u02d8\3\2\2\2\u0082"+
		"\u02de\3\2\2\2\u0084\u02e1\3\2\2\2\u0086\u02f4\3\2\2\2\u0088\u030a\3\2"+
		"\2\2\u008a\u0310\3\2\2\2\u008c\u031a\3\2\2\2\u008e\u031e\3\2\2\2\u0090"+
		"\u032f\3\2\2\2\u0092\u0334\3\2\2\2\u0094\u0339\3\2\2\2\u0096\u0340\3\2"+
		"\2\2\u0098\u0343\3\2\2\2\u009a\u034c\3\2\2\2\u009c\u0350\3\2\2\2\u009e"+
		"\u035e\3\2\2\2\u00a0\u0360\3\2\2\2\u00a2\u0362\3\2\2\2\u00a4\u0372\3\2"+
		"\2\2\u00a6\u0374\3\2\2\2\u00a8\u037f\3\2\2\2\u00aa\u0394\3\2\2\2\u00ac"+
		"\u03a0\3\2\2\2\u00ae\u00af\5\u0092J\2\u00af\3\3\2\2\2\u00b0\u00bd\7d\2"+
		"\2\u00b1\u00bd\5\u009cO\2\u00b2\u00b4\7h\2\2\u00b3\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00bd\3\2"+
		"\2\2\u00b7\u00b8\7\66\2\2\u00b8\u00b9\5(\25\2\u00b9\u00ba\7\67\2\2\u00ba"+
		"\u00bd\3\2\2\2\u00bb\u00bd\5\u00aaV\2\u00bc\u00b0\3\2\2\2\u00bc\u00b1"+
		"\3\2\2\2\u00bc\u00b3\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\5\3\2\2\2\u00be\u00cd\5\4\3\2\u00bf\u00c1\7\3\2\2\u00c0\u00bf\3\2\2\2"+
		"\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7\66\2\2\u00c3\u00c4"+
		"\5j\66\2\u00c4\u00c5\7\67\2\2\u00c5\u00c6\7:\2\2\u00c6\u00c8\5p9\2\u00c7"+
		"\u00c9\7S\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cb\7;\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00be\3\2\2\2\u00cc"+
		"\u00c0\3\2\2\2\u00cd\u00dc\3\2\2\2\u00ce\u00cf\78\2\2\u00cf\u00d0\5(\25"+
		"\2\u00d0\u00d1\79\2\2\u00d1\u00db\3\2\2\2\u00d2\u00d4\7\66\2\2\u00d3\u00d5"+
		"\5\b\5\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00db\7\67\2\2\u00d7\u00d8\t\2\2\2\u00d8\u00db\7d\2\2\u00d9\u00db\t\3"+
		"\2\2\u00da\u00ce\3\2\2\2\u00da\u00d2\3\2\2\2\u00da\u00d7\3\2\2\2\u00da"+
		"\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\7\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e4\5&\24\2\u00e0\u00e1"+
		"\7S\2\2\u00e1\u00e3\5&\24\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\t\3\2\2\2\u00e6\u00e4\3\2\2\2"+
		"\u00e7\u00e9\t\4\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00f8\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed"+
		"\u00f9\5\6\4\2\u00ee\u00ef\5\f\7\2\u00ef\u00f0\5\16\b\2\u00f0\u00f9\3"+
		"\2\2\2\u00f1\u00f2\t\5\2\2\u00f2\u00f3\7\66\2\2\u00f3\u00f4\5j\66\2\u00f4"+
		"\u00f5\7\67\2\2\u00f5\u00f9\3\2\2\2\u00f6\u00f7\7K\2\2\u00f7\u00f9\7d"+
		"\2\2\u00f8\u00ed\3\2\2\2\u00f8\u00ee\3\2\2\2\u00f8\u00f1\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\13\3\2\2\2\u00fa\u00fb\t\6\2\2\u00fb\r\3\2\2\2\u00fc"+
		"\u00fe\7\3\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u0100\7\66\2\2\u0100\u0101\5j\66\2\u0101\u0102\7\67\2\2\u0102"+
		"\u0103\5\16\b\2\u0103\u0107\3\2\2\2\u0104\u0107\5\n\6\2\u0105\u0107\7"+
		"g\2\2\u0106\u00fd\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107"+
		"\17\3\2\2\2\u0108\u010d\5\16\b\2\u0109\u010a\t\7\2\2\u010a\u010c\5\16"+
		"\b\2\u010b\u0109\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\21\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0115\5\20\t"+
		"\2\u0111\u0112\t\b\2\2\u0112\u0114\5\20\t\2\u0113\u0111\3\2\2\2\u0114"+
		"\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\23\3\2\2"+
		"\2\u0117\u0115\3\2\2\2\u0118\u011d\5\22\n\2\u0119\u011a\t\t\2\2\u011a"+
		"\u011c\5\22\n\2\u011b\u0119\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3"+
		"\2\2\2\u011d\u011e\3\2\2\2\u011e\25\3\2\2\2\u011f\u011d\3\2\2\2\u0120"+
		"\u0125\5\24\13\2\u0121\u0122\t\n\2\2\u0122\u0124\5\24\13\2\u0123\u0121"+
		"\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\27\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012d\5\26\f\2\u0129\u012a\t\13"+
		"\2\2\u012a\u012c\5\26\f\2\u012b\u0129\3\2\2\2\u012c\u012f\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\31\3\2\2\2\u012f\u012d\3\2\2"+
		"\2\u0130\u0135\5\30\r\2\u0131\u0132\7I\2\2\u0132\u0134\5\30\r\2\u0133"+
		"\u0131\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\33\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013d\5\32\16\2\u0139"+
		"\u013a\7M\2\2\u013a\u013c\5\32\16\2\u013b\u0139\3\2\2\2\u013c\u013f\3"+
		"\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\35\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u0140\u0145\5\34\17\2\u0141\u0142\7J\2\2\u0142\u0144\5"+
		"\34\17\2\u0143\u0141\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\37\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u014d\5\36\20"+
		"\2\u0149\u014a\7K\2\2\u014a\u014c\5\36\20\2\u014b\u0149\3\2\2\2\u014c"+
		"\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e!\3\2\2\2"+
		"\u014f\u014d\3\2\2\2\u0150\u0155\5 \21\2\u0151\u0152\7L\2\2\u0152\u0154"+
		"\5 \21\2\u0153\u0151\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156#\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u015e\5\"\22\2"+
		"\u0159\u015a\7P\2\2\u015a\u015b\5(\25\2\u015b\u015c\7Q\2\2\u015c\u015d"+
		"\5$\23\2\u015d\u015f\3\2\2\2\u015e\u0159\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"%\3\2\2\2\u0160\u0167\5$\23\2\u0161\u0162\5\n\6\2\u0162\u0163\7T\2\2\u0163"+
		"\u0164\5&\24\2\u0164\u0167\3\2\2\2\u0165\u0167\7g\2\2\u0166\u0160\3\2"+
		"\2\2\u0166\u0161\3\2\2\2\u0166\u0165\3\2\2\2\u0167\'\3\2\2\2\u0168\u016d"+
		"\5&\24\2\u0169\u016a\7S\2\2\u016a\u016c\5&\24\2\u016b\u0169\3\2\2\2\u016c"+
		"\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e)\3\2\2\2"+
		"\u016f\u016d\3\2\2\2\u0170\u0171\5$\23\2\u0171+\3\2\2\2\u0172\u0174\5"+
		".\30\2\u0173\u0175\5\64\33\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0177\7R\2\2\u0177-\3\2\2\2\u0178\u017a\5\62\32\2"+
		"\u0179\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c"+
		"\3\2\2\2\u017c/\3\2\2\2\u017d\u017f\5\62\32\2\u017e\u017d\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\61\3\2\2"+
		"\2\u0182\u0187\58\35\2\u0183\u0187\5:\36\2\u0184\u0187\5T+\2\u0185\u0187"+
		"\5V,\2\u0186\u0182\3\2\2\2\u0186\u0183\3\2\2\2\u0186\u0184\3\2\2\2\u0186"+
		"\u0185\3\2\2\2\u0187\63\3\2\2\2\u0188\u018d\5\66\34\2\u0189\u018a\7S\2"+
		"\2\u018a\u018c\5\66\34\2\u018b\u0189\3\2\2\2\u018c\u018f\3\2\2\2\u018d"+
		"\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\65\3\2\2\2\u018f\u018d\3\2\2"+
		"\2\u0190\u0193\5X-\2\u0191\u0192\7T\2\2\u0192\u0194\5n8\2\u0193\u0191"+
		"\3\2\2\2\u0193\u0194\3\2\2\2\u0194\67\3\2\2\2\u0195\u0196\7#\2\2\u0196"+
		"9\3\2\2\2\u0197\u01ac\7)\2\2\u0198\u01ac\7\r\2\2\u0199\u01ac\7 \2\2\u019a"+
		"\u01ac\7\33\2\2\u019b\u01ac\7\34\2\2\u019c\u01ac\7\26\2\2\u019d\u01ac"+
		"\7\22\2\2\u019e\u01ac\7!\2\2\u019f\u01ac\7(\2\2\u01a0\u01ac\7s\2\2\u01a1"+
		"\u01ac\5R*\2\u01a2\u01ac\5<\37\2\u01a3\u01ac\5J&\2\u01a4\u01ac\5l\67\2"+
		"\u01a5\u01a6\7\4\2\2\u01a6\u01a7\7\66\2\2\u01a7\u01a8\5*\26\2\u01a8\u01a9"+
		"\7\67\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01ac\7\5\2\2\u01ab\u0197\3\2\2\2"+
		"\u01ab\u0198\3\2\2\2\u01ab\u0199\3\2\2\2\u01ab\u019a\3\2\2\2\u01ab\u019b"+
		"\3\2\2\2\u01ab\u019c\3\2\2\2\u01ab\u019d\3\2\2\2\u01ab\u019e\3\2\2\2\u01ab"+
		"\u019f\3\2\2\2\u01ab\u01a0\3\2\2\2\u01ab\u01a1\3\2\2\2\u01ab\u01a2\3\2"+
		"\2\2\u01ab\u01a3\3\2\2\2\u01ab\u01a4\3\2\2\2\u01ab\u01a5\3\2\2\2\u01ab"+
		"\u01aa\3\2\2\2\u01ac;\3\2\2\2\u01ad\u01af\5> \2\u01ae\u01b0\7d\2\2\u01af"+
		"\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\7:"+
		"\2\2\u01b2\u01b3\5@!\2\u01b3\u01b4\7;\2\2\u01b4\u01b9\3\2\2\2\u01b5\u01b6"+
		"\5> \2\u01b6\u01b7\7d\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01ad\3\2\2\2\u01b8"+
		"\u01b5\3\2\2\2\u01b9=\3\2\2\2\u01ba\u01bb\t\f\2\2\u01bb?\3\2\2\2\u01bc"+
		"\u01be\5B\"\2\u01bd\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01bd\3\2"+
		"\2\2\u01bf\u01c0\3\2\2\2\u01c0A\3\2\2\2\u01c1\u01c2\5D#\2\u01c2\u01c3"+
		"\5F$\2\u01c3\u01c4\7R\2\2\u01c4\u01c9\3\2\2\2\u01c5\u01c6\5D#\2\u01c6"+
		"\u01c7\7R\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c1\3\2\2\2\u01c8\u01c5\3\2"+
		"\2\2\u01c9C\3\2\2\2\u01ca\u01cd\5:\36\2\u01cb\u01cd\5T+\2\u01cc\u01ca"+
		"\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01d0\5D#\2\u01cf"+
		"\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0E\3\2\2\2\u01d1\u01d6\5H%\2\u01d2"+
		"\u01d3\7S\2\2\u01d3\u01d5\5H%\2\u01d4\u01d2\3\2\2\2\u01d5\u01d8\3\2\2"+
		"\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7G\3\2\2\2\u01d8\u01d6"+
		"\3\2\2\2\u01d9\u01e0\5X-\2\u01da\u01dc\5X-\2\u01db\u01da\3\2\2\2\u01db"+
		"\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\7Q\2\2\u01de\u01e0\5*\26"+
		"\2\u01df\u01d9\3\2\2\2\u01df\u01db\3\2\2\2\u01e0I\3\2\2\2\u01e1\u01e3"+
		"\7\24\2\2\u01e2\u01e4\7d\2\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5\u01e6\7:\2\2\u01e6\u01e8\5L\'\2\u01e7\u01e9\7S\2"+
		"\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb"+
		"\7;\2\2\u01eb\u01ef\3\2\2\2\u01ec\u01ed\7\24\2\2\u01ed\u01ef\7d\2\2\u01ee"+
		"\u01e1\3\2\2\2\u01ee\u01ec\3\2\2\2\u01efK\3\2\2\2\u01f0\u01f5\5N(\2\u01f1"+
		"\u01f2\7S\2\2\u01f2\u01f4\5N(\2\u01f3\u01f1\3\2\2\2\u01f4\u01f7\3\2\2"+
		"\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6M\3\2\2\2\u01f7\u01f5"+
		"\3\2\2\2\u01f8\u01fb\5P)\2\u01f9\u01fa\7T\2\2\u01fa\u01fc\5*\26\2\u01fb"+
		"\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fcO\3\2\2\2\u01fd\u01fe\7d\2\2\u01fe"+
		"Q\3\2\2\2\u01ff\u0200\7.\2\2\u0200\u0201\7\66\2\2\u0201\u0202\5j\66\2"+
		"\u0202\u0203\7\67\2\2\u0203S\3\2\2\2\u0204\u0205\t\r\2\2\u0205U\3\2\2"+
		"\2\u0206\u0207\7,\2\2\u0207\u020a\7\66\2\2\u0208\u020b\5j\66\2\u0209\u020b"+
		"\5*\26\2\u020a\u0208\3\2\2\2\u020a\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020d\7\67\2\2\u020dW\3\2\2\2\u020e\u0210\5^\60\2\u020f\u020e\3\2\2\2"+
		"\u020f\u0210\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\5Z.\2\u0212Y\3\2"+
		"\2\2\u0213\u0214\b.\1\2\u0214\u021d\7d\2\2\u0215\u0216\7\66\2\2\u0216"+
		"\u0217\5X-\2\u0217\u0218\7\67\2\2\u0218\u021d\3\2\2\2\u0219\u021a\7d\2"+
		"\2\u021a\u021b\7Q\2\2\u021b\u021d\7g\2\2\u021c\u0213\3\2\2\2\u021c\u0215"+
		"\3\2\2\2\u021c\u0219\3\2\2\2\u021d\u024b\3\2\2\2\u021e\u021f\f\t\2\2\u021f"+
		"\u0221\78\2\2\u0220\u0222\5`\61\2\u0221\u0220\3\2\2\2\u0221\u0222\3\2"+
		"\2\2\u0222\u0224\3\2\2\2\u0223\u0225\5&\24\2\u0224\u0223\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u024a\79\2\2\u0227\u0228\f\b"+
		"\2\2\u0228\u0229\78\2\2\u0229\u022b\7#\2\2\u022a\u022c\5`\61\2\u022b\u022a"+
		"\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\5&\24\2\u022e"+
		"\u022f\79\2\2\u022f\u024a\3\2\2\2\u0230\u0231\f\7\2\2\u0231\u0232\78\2"+
		"\2\u0232\u0233\5`\61\2\u0233\u0234\7#\2\2\u0234\u0235\5&\24\2\u0235\u0236"+
		"\79\2\2\u0236\u024a\3\2\2\2\u0237\u0238\f\6\2\2\u0238\u023a\78\2\2\u0239"+
		"\u023b\5`\61\2\u023a\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\3\2"+
		"\2\2\u023c\u023d\7F\2\2\u023d\u024a\79\2\2\u023e\u023f\f\5\2\2\u023f\u0240"+
		"\7\66\2\2\u0240\u0241\5b\62\2\u0241\u0242\7\67\2\2\u0242\u024a\3\2\2\2"+
		"\u0243\u0244\f\4\2\2\u0244\u0246\7\66\2\2\u0245\u0247\5h\65\2\u0246\u0245"+
		"\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024a\7\67\2\2"+
		"\u0249\u021e\3\2\2\2\u0249\u0227\3\2\2\2\u0249\u0230\3\2\2\2\u0249\u0237"+
		"\3\2\2\2\u0249\u023e\3\2\2\2\u0249\u0243\3\2\2\2\u024a\u024d\3\2\2\2\u024b"+
		"\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c[\3\2\2\2\u024d\u024b\3\2\2\2"+
		"\u024e\u0254\n\16\2\2\u024f\u0250\7\66\2\2\u0250\u0251\5\\/\2\u0251\u0252"+
		"\7\67\2\2\u0252\u0254\3\2\2\2\u0253\u024e\3\2\2\2\u0253\u024f\3\2\2\2"+
		"\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256]\3"+
		"\2\2\2\u0257\u0255\3\2\2\2\u0258\u025a\t\17\2\2\u0259\u025b\5`\61\2\u025a"+
		"\u0259\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025d\3\2\2\2\u025c\u0258\3\2"+
		"\2\2\u025d\u025e\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f"+
		"_\3\2\2\2\u0260\u0262\5T+\2\u0261\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263"+
		"\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264a\3\2\2\2\u0265\u0268\5d\63\2"+
		"\u0266\u0267\7S\2\2\u0267\u0269\7c\2\2\u0268\u0266\3\2\2\2\u0268\u0269"+
		"\3\2\2\2\u0269c\3\2\2\2\u026a\u026f\5f\64\2\u026b\u026c\7S\2\2\u026c\u026e"+
		"\5f\64\2\u026d\u026b\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3\2\2\2\u026f"+
		"\u0270\3\2\2\2\u0270e\3\2\2\2\u0271\u026f\3\2\2\2\u0272\u0273\5.\30\2"+
		"\u0273\u0274\5X-\2\u0274\u0277\3\2\2\2\u0275\u0277\5\60\31\2\u0276\u0272"+
		"\3\2\2\2\u0276\u0275\3\2\2\2\u0277g\3\2\2\2\u0278\u027d\7d\2\2\u0279\u027a"+
		"\7S\2\2\u027a\u027c\7d\2\2\u027b\u0279\3\2\2\2\u027c\u027f\3\2\2\2\u027d"+
		"\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027ei\3\2\2\2\u027f\u027d\3\2\2\2"+
		"\u0280\u0281\5D#\2\u0281k\3\2\2\2\u0282\u0283\7d\2\2\u0283m\3\2\2\2\u0284"+
		"\u028f\5&\24\2\u0285\u0286\7:\2\2\u0286\u0288\5p9\2\u0287\u0289\7S\2\2"+
		"\u0288\u0287\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b"+
		"\7;\2\2\u028b\u028f\3\2\2\2\u028c\u028f\5\u009eP\2\u028d\u028f\5\u00aa"+
		"V\2\u028e\u0284\3\2\2\2\u028e\u0285\3\2\2\2\u028e\u028c\3\2\2\2\u028e"+
		"\u028d\3\2\2\2\u028fo\3\2\2\2\u0290\u0292\5t;\2\u0291\u0290\3\2\2\2\u0291"+
		"\u0292\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u029b\5n8\2\u0294\u0296\7S\2"+
		"\2\u0295\u0297\5t;\2\u0296\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298"+
		"\3\2\2\2\u0298\u029a\5n8\2\u0299\u0294\3\2\2\2\u029a\u029d\3\2\2\2\u029b"+
		"\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029cq\3\2\2\2\u029d\u029b\3\2\2\2"+
		"\u029e\u02a0\5t;\2\u029f\u029e\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1"+
		"\3\2\2\2\u02a1\u02a9\5n8\2\u02a2\u02a4\7J\2\2\u02a3\u02a5\5t;\2\u02a4"+
		"\u02a3\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a8\5n"+
		"8\2\u02a7\u02a2\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9"+
		"\u02aa\3\2\2\2\u02aas\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02ad\5v<\2\u02ad"+
		"\u02ae\7T\2\2\u02aeu\3\2\2\2\u02af\u02b1\5x=\2\u02b0\u02af\3\2\2\2\u02b1"+
		"\u02b2\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3w\3\2\2\2"+
		"\u02b4\u02b5\78\2\2\u02b5\u02b6\5*\26\2\u02b6\u02b7\79\2\2\u02b7\u02bb"+
		"\3\2\2\2\u02b8\u02b9\7b\2\2\u02b9\u02bb\7d\2\2\u02ba\u02b4\3\2\2\2\u02ba"+
		"\u02b8\3\2\2\2\u02bby\3\2\2\2\u02bc\u02c3\5|?\2\u02bd\u02c3\5~@\2\u02be"+
		"\u02c3\5\u0084C\2\u02bf\u02c3\5\u0086D\2\u02c0\u02c3\5\u0088E\2\u02c1"+
		"\u02c3\5\u0090I\2\u02c2\u02bc\3\2\2\2\u02c2\u02bd\3\2\2\2\u02c2\u02be"+
		"\3\2\2\2\u02c2\u02bf\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c1\3\2\2\2\u02c3"+
		"{\3\2\2\2\u02c4\u02c5\7d\2\2\u02c5\u02c6\7Q\2\2\u02c6\u02d0\5z>\2\u02c7"+
		"\u02c8\7\f\2\2\u02c8\u02c9\5*\26\2\u02c9\u02ca\7Q\2\2\u02ca\u02cb\5z>"+
		"\2\u02cb\u02d0\3\2\2\2\u02cc\u02cd\7\20\2\2\u02cd\u02ce\7Q\2\2\u02ce\u02d0"+
		"\5z>\2\u02cf\u02c4\3\2\2\2\u02cf\u02c7\3\2\2\2\u02cf\u02cc\3\2\2\2\u02d0"+
		"}\3\2\2\2\u02d1\u02d3\7:\2\2\u02d2\u02d4\5\u0080A\2\u02d3\u02d2\3\2\2"+
		"\2\u02d3\u02d4\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6\7;\2\2\u02d6\177"+
		"\3\2\2\2\u02d7\u02d9\5\u0082B\2\u02d8\u02d7\3\2\2\2\u02d9\u02da\3\2\2"+
		"\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u0081\3\2\2\2\u02dc\u02df"+
		"\5z>\2\u02dd\u02df\5,\27\2\u02de\u02dc\3\2\2\2\u02de\u02dd\3\2\2\2\u02df"+
		"\u0083\3\2\2\2\u02e0\u02e2\5(\25\2\u02e1\u02e0\3\2\2\2\u02e1\u02e2\3\2"+
		"\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\7R\2\2\u02e4\u0085\3\2\2\2\u02e5"+
		"\u02e6\7\31\2\2\u02e6\u02e7\7\66\2\2\u02e7\u02e8\5(\25\2\u02e8\u02e9\7"+
		"\67\2\2\u02e9\u02ec\5z>\2\u02ea\u02eb\7\23\2\2\u02eb\u02ed\5z>\2\u02ec"+
		"\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02f5\3\2\2\2\u02ee\u02ef\7%"+
		"\2\2\u02ef\u02f0\7\66\2\2\u02f0\u02f1\5(\25\2\u02f1\u02f2\7\67\2\2\u02f2"+
		"\u02f3\5z>\2\u02f3\u02f5\3\2\2\2\u02f4\u02e5\3\2\2\2\u02f4\u02ee\3\2\2"+
		"\2\u02f5\u0087\3\2\2\2\u02f6\u02f7\7+\2\2\u02f7\u02f8\7\66\2\2\u02f8\u02f9"+
		"\5(\25\2\u02f9\u02fa\7\67\2\2\u02fa\u02fb\5z>\2\u02fb\u030b\3\2\2\2\u02fc"+
		"\u02fd\7\21\2\2\u02fd\u02fe\5z>\2\u02fe\u02ff\7+\2\2\u02ff\u0300\7\66"+
		"\2\2\u0300\u0301\5(\25\2\u0301\u0302\7\67\2\2\u0302\u0303\7R\2\2\u0303"+
		"\u030b\3\2\2\2\u0304\u0305\7\27\2\2\u0305\u0306\7\66\2\2\u0306\u0307\5"+
		"\u008aF\2\u0307\u0308\7\67\2\2\u0308\u0309\5z>\2\u0309\u030b\3\2\2\2\u030a"+
		"\u02f6\3\2\2\2\u030a\u02fc\3\2\2\2\u030a\u0304\3\2\2\2\u030b\u0089\3\2"+
		"\2\2\u030c\u0311\5\u008cG\2\u030d\u030f\5(\25\2\u030e\u030d\3\2\2\2\u030e"+
		"\u030f\3\2\2\2\u030f\u0311\3\2\2\2\u0310\u030c\3\2\2\2\u0310\u030e\3\2"+
		"\2\2\u0311\u0312\3\2\2\2\u0312\u0314\7R\2\2\u0313\u0315\5\u008eH\2\u0314"+
		"\u0313\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0318\7R"+
		"\2\2\u0317\u0319\5\u008eH\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2\2\2\u0319"+
		"\u008b\3\2\2\2\u031a\u031c\5.\30\2\u031b\u031d\5\64\33\2\u031c\u031b\3"+
		"\2\2\2\u031c\u031d\3\2\2\2\u031d\u008d\3\2\2\2\u031e\u0323\5&\24\2\u031f"+
		"\u0320\7S\2\2\u0320\u0322\5&\24\2\u0321\u031f\3\2\2\2\u0322\u0325\3\2"+
		"\2\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u008f\3\2\2\2\u0325"+
		"\u0323\3\2\2\2\u0326\u0327\7\30\2\2\u0327\u0330\7d\2\2\u0328\u0330\t\20"+
		"\2\2\u0329\u032b\7\37\2\2\u032a\u032c\5(\25\2\u032b\u032a\3\2\2\2\u032b"+
		"\u032c\3\2\2\2\u032c\u0330\3\2\2\2\u032d\u032e\7\30\2\2\u032e\u0330\5"+
		"\n\6\2\u032f\u0326\3\2\2\2\u032f\u0328\3\2\2\2\u032f\u0329\3\2\2\2\u032f"+
		"\u032d\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0332\7R\2\2\u0332\u0091\3\2"+
		"\2\2\u0333\u0335\5\u0094K\2\u0334\u0333\3\2\2\2\u0334\u0335\3\2\2\2\u0335"+
		"\u0336\3\2\2\2\u0336\u0337\7\2\2\3\u0337\u0093\3\2\2\2\u0338\u033a\5\u0096"+
		"L\2\u0339\u0338\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u0339\3\2\2\2\u033b"+
		"\u033c\3\2\2\2\u033c\u0095\3\2\2\2\u033d\u0341\5\u0098M\2\u033e\u0341"+
		"\5,\27\2\u033f\u0341\7R\2\2\u0340\u033d\3\2\2\2\u0340\u033e\3\2\2\2\u0340"+
		"\u033f\3\2\2\2\u0341\u0097\3\2\2\2\u0342\u0344\5.\30\2\u0343\u0342\3\2"+
		"\2\2\u0343\u0344\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0347\5X-\2\u0346\u0348"+
		"\5\u009aN\2\u0347\u0346\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\3\2\2"+
		"\2\u0349\u034a\5~@\2\u034a\u0099\3\2\2\2\u034b\u034d\5,\27\2\u034c\u034b"+
		"\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u034c\3\2\2\2\u034e\u034f\3\2\2\2\u034f"+
		"\u009b\3\2\2\2\u0350\u0351\t\21\2\2\u0351\u009d\3\2\2\2\u0352\u0353\7"+
		"\6\2\2\u0353\u0358\5\u00a0Q\2\u0354\u0355\7\7\2\2\u0355\u0357\5\u00a0"+
		"Q\2\u0356\u0354\3\2\2\2\u0357\u035a\3\2\2\2\u0358\u0356\3\2\2\2\u0358"+
		"\u0359\3\2\2\2\u0359\u035b\3\2\2\2\u035a\u0358\3\2\2\2\u035b\u035c\7\b"+
		"\2\2\u035c\u035f\3\2\2\2\u035d\u035f\5\u00aaV\2\u035e\u0352\3\2\2\2\u035e"+
		"\u035d\3\2\2\2\u035f\u009f\3\2\2\2\u0360\u0361\5r:\2\u0361\u00a1\3\2\2"+
		"\2\u0362\u0364\5\u00a4S\2\u0363\u0365\5\u00a6T\2\u0364\u0363\3\2\2\2\u0364"+
		"\u0365\3\2\2\2\u0365\u00a3\3\2\2\2\u0366\u0367\78\2\2\u0367\u036c\5\u00a8"+
		"U\2\u0368\u0369\7S\2\2\u0369\u036b\5\u00a8U\2\u036a\u0368\3\2\2\2\u036b"+
		"\u036e\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036f\3\2"+
		"\2\2\u036e\u036c\3\2\2\2\u036f\u0370\79\2\2\u0370\u0373\3\2\2\2\u0371"+
		"\u0373\7d\2\2\u0372\u0366\3\2\2\2\u0372\u0371\3\2\2\2\u0373\u00a5\3\2"+
		"\2\2\u0374\u0375\78\2\2\u0375\u037a\5$\23\2\u0376\u0377\7S\2\2\u0377\u0379"+
		"\5$\23\2\u0378\u0376\3\2\2\2\u0379\u037c\3\2\2\2\u037a\u0378\3\2\2\2\u037a"+
		"\u037b\3\2\2\2\u037b\u037d\3\2\2\2\u037c\u037a\3\2\2\2\u037d\u037e\79"+
		"\2\2\u037e\u00a7\3\2\2\2\u037f\u0384\7d\2\2\u0380\u0381\t\22\2\2\u0381"+
		"\u0383\7d\2\2\u0382\u0380\3\2\2\2\u0383\u0386\3\2\2\2\u0384\u0382\3\2"+
		"\2\2\u0384\u0385\3\2\2\2\u0385\u0391\3\2\2\2\u0386\u0384\3\2\2\2\u0387"+
		"\u0388\7Q\2\2\u0388\u038b\7d\2\2\u0389\u038a\7S\2\2\u038a\u038c\7d\2\2"+
		"\u038b\u0389\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038b\3\2\2\2\u038d\u038e"+
		"\3\2\2\2\u038e\u0390\3\2\2\2\u038f\u0387\3\2\2\2\u0390\u0393\3\2\2\2\u0391"+
		"\u038f\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u00a9\3\2\2\2\u0393\u0391\3\2"+
		"\2\2\u0394\u0395\78\2\2\u0395\u0398\7d\2\2\u0396\u0397\7J\2\2\u0397\u0399"+
		"\7d\2\2\u0398\u0396\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u0398\3\2\2\2\u039a"+
		"\u039b\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039d\7\t\2\2\u039d\u039e\5\u00a2"+
		"R\2\u039e\u039f\79\2\2\u039f\u00ab\3\2\2\2\u03a0\u03a1\7d\2\2\u03a1\u03a2"+
		"\7P\2\2\u03a2\u03a3\5\u00a6T\2\u03a3\u00ad\3\2\2\2o\u00b5\u00bc\u00c0"+
		"\u00c8\u00cc\u00d4\u00da\u00dc\u00e4\u00ea\u00f8\u00fd\u0106\u010d\u0115"+
		"\u011d\u0125\u012d\u0135\u013d\u0145\u014d\u0155\u015e\u0166\u016d\u0174"+
		"\u017b\u0180\u0186\u018d\u0193\u01ab\u01af\u01b8\u01bf\u01c8\u01cc\u01cf"+
		"\u01d6\u01db\u01df\u01e3\u01e8\u01ee\u01f5\u01fb\u020a\u020f\u021c\u0221"+
		"\u0224\u022b\u023a\u0246\u0249\u024b\u0253\u0255\u025a\u025e\u0263\u0268"+
		"\u026f\u0276\u027d\u0288\u028e\u0291\u0296\u029b\u029f\u02a4\u02a9\u02b2"+
		"\u02ba\u02c2\u02cf\u02d3\u02da\u02de\u02e1\u02ec\u02f4\u030a\u030e\u0310"+
		"\u0314\u0318\u031c\u0323\u032b\u032f\u0334\u033b\u0340\u0343\u0347\u034e"+
		"\u0358\u035e\u0364\u036c\u0372\u037a\u0384\u038d\u0391\u039a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}