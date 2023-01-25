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
		try {
			setState(181);
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
			case StringLiteral:
			case CharacterConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				constant();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(LeftParen);
				setState(177);
				expression();
				setState(178);
				match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
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
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(183);
				primaryExpression();
				}
				break;
			case 2:
				{
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(184);
					match(T__0);
					}
				}

				setState(187);
				match(LeftParen);
				setState(188);
				typeName();
				setState(189);
				match(RightParen);
				setState(190);
				match(LeftBrace);
				setState(191);
				initializerList();
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(192);
					match(Comma);
					}
				}

				setState(195);
				match(RightBrace);
				}
				break;
			}
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (LeftParen - 52)) | (1L << (LeftBracket - 52)) | (1L << (PlusPlus - 52)) | (1L << (MinusMinus - 52)) | (1L << (Arrow - 52)) | (1L << (Dot - 52)))) != 0)) {
				{
				setState(211);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftBracket:
					{
					setState(199);
					match(LeftBracket);
					setState(200);
					expression();
					setState(201);
					match(RightBracket);
					}
					break;
				case LeftParen:
					{
					setState(203);
					match(LeftParen);
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << Alignof) | (1L << LeftParen) | (1L << LeftBracket))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (CharacterConstant - 64)))) != 0)) {
						{
						setState(204);
						argumentExpressionList();
						}
					}

					setState(207);
					match(RightParen);
					}
					break;
				case Arrow:
				case Dot:
					{
					setState(208);
					_la = _input.LA(1);
					if ( !(_la==Arrow || _la==Dot) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(209);
					match(Identifier);
					}
					break;
				case PlusPlus:
				case MinusMinus:
					{
					setState(210);
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
				setState(215);
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
			setState(216);
			assignmentExpression();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(217);
				match(Comma);
				setState(218);
				assignmentExpression();
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
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(224);
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
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(241);
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
				setState(230);
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
				setState(231);
				unaryOperator();
				setState(232);
				castExpression();
				}
				break;
			case Sizeof:
			case Alignof:
				{
				setState(234);
				_la = _input.LA(1);
				if ( !(_la==Sizeof || _la==Alignof) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(235);
				match(LeftParen);
				setState(236);
				typeName();
				setState(237);
				match(RightParen);
				}
				break;
			case AndAnd:
				{
				setState(239);
				match(AndAnd);
				setState(240);
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
			setState(243);
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
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(245);
					match(T__0);
					}
				}

				setState(248);
				match(LeftParen);
				setState(249);
				typeName();
				setState(250);
				match(RightParen);
				setState(251);
				castExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
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
			setState(257);
			castExpression();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Star - 68)) | (1L << (Div - 68)) | (1L << (Mod - 68)))) != 0)) {
				{
				{
				setState(258);
				_la = _input.LA(1);
				if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Star - 68)) | (1L << (Div - 68)) | (1L << (Mod - 68)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(259);
				castExpression();
				}
				}
				setState(264);
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
			setState(265);
			multiplicativeExpression();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				{
				setState(266);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(267);
				multiplicativeExpression();
				}
				}
				setState(272);
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
			setState(273);
			additiveExpression();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftShift || _la==RightShift) {
				{
				{
				setState(274);
				_la = _input.LA(1);
				if ( !(_la==LeftShift || _la==RightShift) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(275);
				additiveExpression();
				}
				}
				setState(280);
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
			setState(281);
			shiftExpression();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << LessEqual) | (1L << Greater) | (1L << GreaterEqual))) != 0)) {
				{
				{
				setState(282);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << LessEqual) | (1L << Greater) | (1L << GreaterEqual))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(283);
				shiftExpression();
				}
				}
				setState(288);
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
			setState(289);
			relationalExpression();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Equal || _la==NotEqual) {
				{
				{
				setState(290);
				_la = _input.LA(1);
				if ( !(_la==Equal || _la==NotEqual) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(291);
				relationalExpression();
				}
				}
				setState(296);
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
			setState(297);
			equalityExpression();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(298);
				match(And);
				setState(299);
				equalityExpression();
				}
				}
				setState(304);
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
			setState(305);
			andExpression();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Caret) {
				{
				{
				setState(306);
				match(Caret);
				setState(307);
				andExpression();
				}
				}
				setState(312);
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
			setState(313);
			exclusiveOrExpression();
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(314);
					match(Or);
					setState(315);
					exclusiveOrExpression();
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
			setState(321);
			inclusiveOrExpression();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AndAnd) {
				{
				{
				setState(322);
				match(AndAnd);
				setState(323);
				inclusiveOrExpression();
				}
				}
				setState(328);
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
			setState(329);
			logicalAndExpression();
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrOr) {
				{
				{
				setState(330);
				match(OrOr);
				setState(331);
				logicalAndExpression();
				}
				}
				setState(336);
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
			setState(337);
			logicalOrExpression();
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Question) {
				{
				setState(338);
				match(Question);
				setState(339);
				expression();
				setState(340);
				match(Colon);
				setState(341);
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
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				unaryExpression();
				setState(347);
				match(Assign);
				setState(348);
				assignmentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
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
			setState(353);
			assignmentExpression();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(354);
				match(Comma);
				setState(355);
				assignmentExpression();
				}
				}
				setState(360);
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
			setState(361);
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
			setState(363);
			declarationSpecifiers();
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (LeftParen - 52)) | (1L << (Star - 52)) | (1L << (Caret - 52)) | (1L << (Identifier - 52)))) != 0)) {
				{
				setState(364);
				initDeclaratorList();
				}
			}

			setState(367);
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
			setState(370); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(369);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(372); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
			setState(375); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(374);
				declarationSpecifier();
				}
				}
				setState(377); 
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
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				storageClassSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				typeSpecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				typeQualifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(382);
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
			setState(385);
			initDeclarator();
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(386);
				match(Comma);
				setState(387);
				initDeclarator();
				}
				}
				setState(392);
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
			setState(393);
			declarator();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(394);
				match(Assign);
				setState(395);
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
			setState(398);
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
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Void:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				match(Void);
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(Char);
				}
				break;
			case Short:
				enterOuterAlt(_localctx, 3);
				{
				setState(402);
				match(Short);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 4);
				{
				setState(403);
				match(Int);
				}
				break;
			case Long:
				enterOuterAlt(_localctx, 5);
				{
				setState(404);
				match(Long);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 6);
				{
				setState(405);
				match(Float);
				}
				break;
			case Double:
				enterOuterAlt(_localctx, 7);
				{
				setState(406);
				match(Double);
				}
				break;
			case Signed:
				enterOuterAlt(_localctx, 8);
				{
				setState(407);
				match(Signed);
				}
				break;
			case Unsigned:
				enterOuterAlt(_localctx, 9);
				{
				setState(408);
				match(Unsigned);
				}
				break;
			case Matrix:
				enterOuterAlt(_localctx, 10);
				{
				setState(409);
				match(Matrix);
				}
				break;
			case Atomic:
				enterOuterAlt(_localctx, 11);
				{
				setState(410);
				atomicTypeSpecifier();
				}
				break;
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 12);
				{
				setState(411);
				structOrUnionSpecifier();
				}
				break;
			case Enum:
				enterOuterAlt(_localctx, 13);
				{
				setState(412);
				enumSpecifier();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 14);
				{
				setState(413);
				typedefName();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 15);
				{
				setState(414);
				match(T__1);
				setState(415);
				match(LeftParen);
				setState(416);
				constantExpression();
				setState(417);
				match(RightParen);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 16);
				{
				setState(419);
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
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				structOrUnion();
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(423);
					match(Identifier);
					}
				}

				setState(426);
				match(LeftBrace);
				setState(427);
				structDeclarationList();
				setState(428);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				structOrUnion();
				setState(431);
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
			setState(435);
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
			setState(438); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(437);
				structDeclaration();
				}
				}
				setState(440); 
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
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				specifierQualifierList();
				setState(443);
				structDeclaratorList();
				setState(444);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				specifierQualifierList();
				setState(447);
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
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(451);
				typeSpecifier();
				}
				break;
			case 2:
				{
				setState(452);
				typeQualifier();
				}
				break;
			}
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(455);
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
			setState(458);
			structDeclarator();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(459);
				match(Comma);
				setState(460);
				structDeclarator();
				}
				}
				setState(465);
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
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (LeftParen - 52)) | (1L << (Star - 52)) | (1L << (Caret - 52)) | (1L << (Identifier - 52)))) != 0)) {
					{
					setState(467);
					declarator();
					}
				}

				setState(470);
				match(Colon);
				setState(471);
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
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				match(Enum);
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(475);
					match(Identifier);
					}
				}

				setState(478);
				match(LeftBrace);
				setState(479);
				enumeratorList();
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(480);
					match(Comma);
					}
				}

				setState(483);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				match(Enum);
				setState(486);
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
			setState(489);
			enumerator();
			setState(494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(490);
					match(Comma);
					setState(491);
					enumerator();
					}
					} 
				}
				setState(496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
			setState(497);
			enumerationConstant();
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(498);
				match(Assign);
				setState(499);
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
			setState(502);
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
			setState(504);
			match(Atomic);
			setState(505);
			match(LeftParen);
			setState(506);
			typeName();
			setState(507);
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
			setState(509);
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
			setState(511);
			match(Alignas);
			setState(512);
			match(LeftParen);
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(513);
				typeName();
				}
				break;
			case 2:
				{
				setState(514);
				constantExpression();
				}
				break;
			}
			setState(517);
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
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star || _la==Caret) {
				{
				setState(519);
				pointer();
				}
			}

			setState(522);
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
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(525);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(526);
				match(LeftParen);
				setState(527);
				declarator();
				setState(528);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(530);
				match(Identifier);
				setState(531);
				match(Colon);
				setState(532);
				match(DigitSequence);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(580);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(578);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(535);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(536);
						match(LeftBracket);
						setState(538);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(537);
							typeQualifierList();
							}
						}

						setState(541);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << Alignof) | (1L << LeftParen) | (1L << LeftBracket))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (CharacterConstant - 64)))) != 0)) {
							{
							setState(540);
							assignmentExpression();
							}
						}

						setState(543);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(544);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(545);
						match(LeftBracket);
						setState(546);
						match(Static);
						setState(548);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(547);
							typeQualifierList();
							}
						}

						setState(550);
						assignmentExpression();
						setState(551);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(553);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(554);
						match(LeftBracket);
						setState(555);
						typeQualifierList();
						setState(556);
						match(Static);
						setState(557);
						assignmentExpression();
						setState(558);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(560);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(561);
						match(LeftBracket);
						setState(563);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(562);
							typeQualifierList();
							}
						}

						setState(565);
						match(Star);
						setState(566);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(567);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(568);
						match(LeftParen);
						setState(569);
						parameterTypeList();
						setState(570);
						match(RightParen);
						}
						break;
					case 6:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(572);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(573);
						match(LeftParen);
						setState(575);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(574);
							identifierList();
							}
						}

						setState(577);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(582);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Less) | (1L << LessEqual) | (1L << Greater) | (1L << GreaterEqual) | (1L << LeftShift) | (1L << RightShift))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Comma - 64)) | (1L << (Assign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (Arrow - 64)) | (1L << (Dot - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (ComplexDefine - 64)) | (1L << (IncludeDirective - 64)) | (1L << (AsmBlock - 64)) | (1L << (LineAfterPreprocessing - 64)) | (1L << (LineDirective - 64)) | (1L << (PragmaDirective - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)) | (1L << (Matrix - 64)) | (1L << (CharacterConstant - 64)))) != 0)) {
				{
				setState(588);
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
					setState(583);
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
					setState(584);
					match(LeftParen);
					setState(585);
					nestedParenthesesBlock();
					setState(586);
					match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(592);
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
			setState(597); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(593);
				_la = _input.LA(1);
				if ( !(_la==Star || _la==Caret) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(594);
					typeQualifierList();
					}
				}

				}
				}
				setState(599); 
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
			setState(602); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(601);
				typeQualifier();
				}
				}
				setState(604); 
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
			setState(606);
			parameterList();
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(607);
				match(Comma);
				setState(608);
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
			setState(611);
			parameterDeclaration();
			setState(616);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(612);
					match(Comma);
					setState(613);
					parameterDeclaration();
					}
					} 
				}
				setState(618);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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
			setState(623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				declarationSpecifiers();
				setState(620);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
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
			setState(625);
			match(Identifier);
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(626);
				match(Comma);
				setState(627);
				match(Identifier);
				}
				}
				setState(632);
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
			setState(633);
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
			setState(635);
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
			setState(647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				assignmentExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				match(LeftBrace);
				setState(639);
				initializerList();
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(640);
					match(Comma);
					}
				}

				setState(643);
				match(RightBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(645);
				matrix();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(646);
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
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(649);
				designation();
				}
				break;
			}
			setState(652);
			initializer();
			setState(660);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(653);
					match(Comma);
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
					}
					} 
				}
				setState(662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(663);
				designation();
				}
				break;
			}
			setState(666);
			initializer();
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(667);
				match(Or);
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
				}
				}
				setState(676);
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
			setState(677);
			designatorList();
			setState(678);
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
			setState(681); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(680);
				designator();
				}
				}
				setState(683); 
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
			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				match(LeftBracket);
				setState(686);
				constantExpression();
				setState(687);
				match(RightBracket);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(689);
				match(Dot);
				setState(690);
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
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(695);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(696);
				selectionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(697);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(698);
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
			setState(712);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				match(Identifier);
				setState(702);
				match(Colon);
				setState(703);
				statement();
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				match(Case);
				setState(705);
				constantExpression();
				setState(706);
				match(Colon);
				setState(707);
				statement();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 3);
				{
				setState(709);
				match(Default);
				setState(710);
				match(Colon);
				setState(711);
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
			setState(714);
			match(LeftBrace);
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Int) | (1L << Long) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Semi - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (Matrix - 64)) | (1L << (CharacterConstant - 64)))) != 0)) {
				{
				setState(715);
				blockItemList();
				}
			}

			setState(718);
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
			setState(721); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(720);
				blockItem();
				}
				}
				setState(723); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Int) | (1L << Long) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Semi - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (Matrix - 64)) | (1L << (CharacterConstant - 64)))) != 0) );
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
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
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
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(727);
				functionDefinition();
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
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << Alignof) | (1L << LeftParen) | (1L << LeftBracket))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (CharacterConstant - 64)))) != 0)) {
				{
				setState(730);
				expression();
				}
			}

			setState(733);
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
			setState(750);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				match(If);
				setState(736);
				match(LeftParen);
				setState(737);
				expression();
				setState(738);
				match(RightParen);
				setState(739);
				statement();
				setState(742);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(740);
					match(Else);
					setState(741);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(744);
				match(Switch);
				setState(745);
				match(LeftParen);
				setState(746);
				expression();
				setState(747);
				match(RightParen);
				setState(748);
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
			setState(772);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				match(While);
				setState(753);
				match(LeftParen);
				setState(754);
				expression();
				setState(755);
				match(RightParen);
				setState(756);
				statement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(758);
				match(Do);
				setState(759);
				statement();
				setState(760);
				match(While);
				setState(761);
				match(LeftParen);
				setState(762);
				expression();
				setState(763);
				match(RightParen);
				setState(764);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(766);
				match(For);
				setState(767);
				match(LeftParen);
				setState(768);
				forCondition();
				setState(769);
				match(RightParen);
				setState(770);
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
			setState(778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(774);
				forDeclaration();
				}
				break;
			case 2:
				{
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << Alignof) | (1L << LeftParen) | (1L << LeftBracket))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (CharacterConstant - 64)))) != 0)) {
					{
					setState(775);
					expression();
					}
				}

				}
				break;
			}
			setState(780);
			match(Semi);
			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << Alignof) | (1L << LeftParen) | (1L << LeftBracket))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (CharacterConstant - 64)))) != 0)) {
				{
				setState(781);
				forExpression();
				}
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
			setState(788);
			declarationSpecifiers();
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (LeftParen - 52)) | (1L << (Star - 52)) | (1L << (Caret - 52)) | (1L << (Identifier - 52)))) != 0)) {
				{
				setState(789);
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
			setState(792);
			assignmentExpression();
			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(793);
				match(Comma);
				setState(794);
				assignmentExpression();
				}
				}
				setState(799);
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
			setState(809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(800);
				match(Goto);
				setState(801);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(802);
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
				setState(803);
				match(Return);
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << Alignof) | (1L << LeftParen) | (1L << LeftBracket))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerConstant - 64)) | (1L << (FloatingConstant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (CharacterConstant - 64)))) != 0)) {
					{
					setState(804);
					expression();
					}
				}

				}
				break;
			case 4:
				{
				setState(807);
				match(Goto);
				setState(808);
				unaryExpression();
				}
				break;
			}
			setState(811);
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
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << LeftParen))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Star - 68)) | (1L << (Caret - 68)) | (1L << (Semi - 68)) | (1L << (Identifier - 68)) | (1L << (Matrix - 68)))) != 0)) {
				{
				setState(813);
				translationUnit();
				}
			}

			setState(816);
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
			setState(819); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(818);
				externalDeclaration();
				}
				}
				setState(821); 
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
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(823);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(824);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(825);
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
			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(828);
				declarationSpecifiers();
				}
				break;
			}
			setState(831);
			declarator();
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic))) != 0) || _la==Identifier || _la==Matrix) {
				{
				setState(832);
				declarationList();
				}
			}

			setState(835);
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
			setState(838); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(837);
				declaration();
				}
				}
				setState(840); 
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
		public List<TerminalNode> StringLiteral() { return getTokens(gParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(gParser.StringLiteral, i);
		}
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
			setState(850);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerConstant:
				enterOuterAlt(_localctx, 1);
				{
				setState(842);
				match(IntegerConstant);
				}
				break;
			case FloatingConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(843);
				match(FloatingConstant);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(845); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(844);
					match(StringLiteral);
					}
					}
					setState(847); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				}
				break;
			case CharacterConstant:
				enterOuterAlt(_localctx, 4);
				{
				setState(849);
				match(CharacterConstant);
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
			setState(864);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				match(T__3);
				setState(853);
				row();
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(854);
					match(T__4);
					setState(855);
					row();
					}
					}
					setState(860);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(861);
				match(T__5);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(863);
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
			setState(866);
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
			setState(868);
			sqlbase();
			setState(870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket) {
				{
				setState(869);
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
			setState(884);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(872);
				match(LeftBracket);
				setState(873);
				querydatajoin();
				setState(878);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(874);
					match(Comma);
					setState(875);
					querydatajoin();
					}
					}
					setState(880);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(881);
				match(RightBracket);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(883);
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
			setState(886);
			match(LeftBracket);
			setState(887);
			conditionalExpression();
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(888);
				match(Comma);
				setState(889);
				conditionalExpression();
				}
				}
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(895);
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
			setState(897);
			match(Identifier);
			setState(902);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(898);
					_la = _input.LA(1);
					if ( !(_la==Comma || _la==Dot) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(899);
					match(Identifier);
					}
					} 
				}
				setState(904);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			}
			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Colon) {
				{
				{
				setState(905);
				match(Colon);
				setState(906);
				match(Identifier);
				setState(909); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(907);
						match(Comma);
						setState(908);
						match(Identifier);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(911); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(917);
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
			setState(918);
			match(LeftBracket);
			setState(919);
			match(Identifier);
			setState(922); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(920);
				match(Or);
				setState(921);
				match(Identifier);
				}
				}
				setState(924); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Or );
			setState(926);
			match(T__6);
			setState(927);
			shortquery();
			setState(928);
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
			setState(930);
			match(Identifier);
			setState(931);
			match(Question);
			setState(932);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3t\u03a9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00b8\n\3\3"+
		"\4\3\4\5\4\u00bc\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00c4\n\4\3\4\3\4\5\4"+
		"\u00c8\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00d0\n\4\3\4\3\4\3\4\3\4\7\4\u00d6"+
		"\n\4\f\4\16\4\u00d9\13\4\3\5\3\5\3\5\7\5\u00de\n\5\f\5\16\5\u00e1\13\5"+
		"\3\6\7\6\u00e4\n\6\f\6\16\6\u00e7\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u00f4\n\6\3\7\3\7\3\b\5\b\u00f9\n\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u0102\n\b\3\t\3\t\3\t\7\t\u0107\n\t\f\t\16\t\u010a\13\t"+
		"\3\n\3\n\3\n\7\n\u010f\n\n\f\n\16\n\u0112\13\n\3\13\3\13\3\13\7\13\u0117"+
		"\n\13\f\13\16\13\u011a\13\13\3\f\3\f\3\f\7\f\u011f\n\f\f\f\16\f\u0122"+
		"\13\f\3\r\3\r\3\r\7\r\u0127\n\r\f\r\16\r\u012a\13\r\3\16\3\16\3\16\7\16"+
		"\u012f\n\16\f\16\16\16\u0132\13\16\3\17\3\17\3\17\7\17\u0137\n\17\f\17"+
		"\16\17\u013a\13\17\3\20\3\20\3\20\7\20\u013f\n\20\f\20\16\20\u0142\13"+
		"\20\3\21\3\21\3\21\7\21\u0147\n\21\f\21\16\21\u014a\13\21\3\22\3\22\3"+
		"\22\7\22\u014f\n\22\f\22\16\22\u0152\13\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\5\23\u015a\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0162\n\24\3\25"+
		"\3\25\3\25\7\25\u0167\n\25\f\25\16\25\u016a\13\25\3\26\3\26\3\27\3\27"+
		"\5\27\u0170\n\27\3\27\3\27\3\30\6\30\u0175\n\30\r\30\16\30\u0176\3\31"+
		"\6\31\u017a\n\31\r\31\16\31\u017b\3\32\3\32\3\32\3\32\5\32\u0182\n\32"+
		"\3\33\3\33\3\33\7\33\u0187\n\33\f\33\16\33\u018a\13\33\3\34\3\34\3\34"+
		"\5\34\u018f\n\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01a7\n\36"+
		"\3\37\3\37\5\37\u01ab\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01b4"+
		"\n\37\3 \3 \3!\6!\u01b9\n!\r!\16!\u01ba\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5"+
		"\"\u01c4\n\"\3#\3#\5#\u01c8\n#\3#\5#\u01cb\n#\3$\3$\3$\7$\u01d0\n$\f$"+
		"\16$\u01d3\13$\3%\3%\5%\u01d7\n%\3%\3%\5%\u01db\n%\3&\3&\5&\u01df\n&\3"+
		"&\3&\3&\5&\u01e4\n&\3&\3&\3&\3&\5&\u01ea\n&\3\'\3\'\3\'\7\'\u01ef\n\'"+
		"\f\'\16\'\u01f2\13\'\3(\3(\3(\5(\u01f7\n(\3)\3)\3*\3*\3*\3*\3*\3+\3+\3"+
		",\3,\3,\3,\5,\u0206\n,\3,\3,\3-\5-\u020b\n-\3-\3-\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\5.\u0218\n.\3.\3.\3.\5.\u021d\n.\3.\5.\u0220\n.\3.\3.\3.\3.\3"+
		".\5.\u0227\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0236\n.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0242\n.\3.\7.\u0245\n.\f.\16.\u0248\13."+
		"\3/\3/\3/\3/\3/\7/\u024f\n/\f/\16/\u0252\13/\3\60\3\60\5\60\u0256\n\60"+
		"\6\60\u0258\n\60\r\60\16\60\u0259\3\61\6\61\u025d\n\61\r\61\16\61\u025e"+
		"\3\62\3\62\3\62\5\62\u0264\n\62\3\63\3\63\3\63\7\63\u0269\n\63\f\63\16"+
		"\63\u026c\13\63\3\64\3\64\3\64\3\64\5\64\u0272\n\64\3\65\3\65\3\65\7\65"+
		"\u0277\n\65\f\65\16\65\u027a\13\65\3\66\3\66\3\67\3\67\38\38\38\38\58"+
		"\u0284\n8\38\38\38\38\58\u028a\n8\39\59\u028d\n9\39\39\39\59\u0292\n9"+
		"\39\79\u0295\n9\f9\169\u0298\139\3:\5:\u029b\n:\3:\3:\3:\5:\u02a0\n:\3"+
		":\7:\u02a3\n:\f:\16:\u02a6\13:\3;\3;\3;\3<\6<\u02ac\n<\r<\16<\u02ad\3"+
		"=\3=\3=\3=\3=\3=\5=\u02b6\n=\3>\3>\3>\3>\3>\3>\5>\u02be\n>\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\5?\u02cb\n?\3@\3@\5@\u02cf\n@\3@\3@\3A\6A\u02d4"+
		"\nA\rA\16A\u02d5\3B\3B\3B\5B\u02db\nB\3C\5C\u02de\nC\3C\3C\3D\3D\3D\3"+
		"D\3D\3D\3D\5D\u02e9\nD\3D\3D\3D\3D\3D\3D\5D\u02f1\nD\3E\3E\3E\3E\3E\3"+
		"E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u0307\nE\3F\3F\5F\u030b"+
		"\nF\5F\u030d\nF\3F\3F\5F\u0311\nF\3F\3F\5F\u0315\nF\3G\3G\5G\u0319\nG"+
		"\3H\3H\3H\7H\u031e\nH\fH\16H\u0321\13H\3I\3I\3I\3I\3I\5I\u0328\nI\3I\3"+
		"I\5I\u032c\nI\3I\3I\3J\5J\u0331\nJ\3J\3J\3K\6K\u0336\nK\rK\16K\u0337\3"+
		"L\3L\3L\5L\u033d\nL\3M\5M\u0340\nM\3M\3M\5M\u0344\nM\3M\3M\3N\6N\u0349"+
		"\nN\rN\16N\u034a\3O\3O\3O\6O\u0350\nO\rO\16O\u0351\3O\5O\u0355\nO\3P\3"+
		"P\3P\3P\7P\u035b\nP\fP\16P\u035e\13P\3P\3P\3P\5P\u0363\nP\3Q\3Q\3R\3R"+
		"\5R\u0369\nR\3S\3S\3S\3S\7S\u036f\nS\fS\16S\u0372\13S\3S\3S\3S\5S\u0377"+
		"\nS\3T\3T\3T\3T\7T\u037d\nT\fT\16T\u0380\13T\3T\3T\3U\3U\3U\7U\u0387\n"+
		"U\fU\16U\u038a\13U\3U\3U\3U\3U\6U\u0390\nU\rU\16U\u0391\7U\u0394\nU\f"+
		"U\16U\u0397\13U\3V\3V\3V\3V\6V\u039d\nV\rV\16V\u039e\3V\3V\3V\3V\3W\3"+
		"W\3W\3W\3W\2\3ZX\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\2\22\3\2ab\4\2CCEE\5\2\"\"CCEE\4"+
		"\2\"\"--\7\2BBDDFFIINO\3\2FH\4\2BBDD\3\2@A\3\2<?\3\2_`\4\2$$\'\'\6\2\16"+
		"\16\36\36**..\3\2\66\67\4\2FFMM\4\2\13\13\17\17\4\2SSbb\2\u03eb\2\u00ae"+
		"\3\2\2\2\4\u00b7\3\2\2\2\6\u00c7\3\2\2\2\b\u00da\3\2\2\2\n\u00e5\3\2\2"+
		"\2\f\u00f5\3\2\2\2\16\u0101\3\2\2\2\20\u0103\3\2\2\2\22\u010b\3\2\2\2"+
		"\24\u0113\3\2\2\2\26\u011b\3\2\2\2\30\u0123\3\2\2\2\32\u012b\3\2\2\2\34"+
		"\u0133\3\2\2\2\36\u013b\3\2\2\2 \u0143\3\2\2\2\"\u014b\3\2\2\2$\u0153"+
		"\3\2\2\2&\u0161\3\2\2\2(\u0163\3\2\2\2*\u016b\3\2\2\2,\u016d\3\2\2\2."+
		"\u0174\3\2\2\2\60\u0179\3\2\2\2\62\u0181\3\2\2\2\64\u0183\3\2\2\2\66\u018b"+
		"\3\2\2\28\u0190\3\2\2\2:\u01a6\3\2\2\2<\u01b3\3\2\2\2>\u01b5\3\2\2\2@"+
		"\u01b8\3\2\2\2B\u01c3\3\2\2\2D\u01c7\3\2\2\2F\u01cc\3\2\2\2H\u01da\3\2"+
		"\2\2J\u01e9\3\2\2\2L\u01eb\3\2\2\2N\u01f3\3\2\2\2P\u01f8\3\2\2\2R\u01fa"+
		"\3\2\2\2T\u01ff\3\2\2\2V\u0201\3\2\2\2X\u020a\3\2\2\2Z\u0217\3\2\2\2\\"+
		"\u0250\3\2\2\2^\u0257\3\2\2\2`\u025c\3\2\2\2b\u0260\3\2\2\2d\u0265\3\2"+
		"\2\2f\u0271\3\2\2\2h\u0273\3\2\2\2j\u027b\3\2\2\2l\u027d\3\2\2\2n\u0289"+
		"\3\2\2\2p\u028c\3\2\2\2r\u029a\3\2\2\2t\u02a7\3\2\2\2v\u02ab\3\2\2\2x"+
		"\u02b5\3\2\2\2z\u02bd\3\2\2\2|\u02ca\3\2\2\2~\u02cc\3\2\2\2\u0080\u02d3"+
		"\3\2\2\2\u0082\u02da\3\2\2\2\u0084\u02dd\3\2\2\2\u0086\u02f0\3\2\2\2\u0088"+
		"\u0306\3\2\2\2\u008a\u030c\3\2\2\2\u008c\u0316\3\2\2\2\u008e\u031a\3\2"+
		"\2\2\u0090\u032b\3\2\2\2\u0092\u0330\3\2\2\2\u0094\u0335\3\2\2\2\u0096"+
		"\u033c\3\2\2\2\u0098\u033f\3\2\2\2\u009a\u0348\3\2\2\2\u009c\u0354\3\2"+
		"\2\2\u009e\u0362\3\2\2\2\u00a0\u0364\3\2\2\2\u00a2\u0366\3\2\2\2\u00a4"+
		"\u0376\3\2\2\2\u00a6\u0378\3\2\2\2\u00a8\u0383\3\2\2\2\u00aa\u0398\3\2"+
		"\2\2\u00ac\u03a4\3\2\2\2\u00ae\u00af\5\u0092J\2\u00af\3\3\2\2\2\u00b0"+
		"\u00b8\7d\2\2\u00b1\u00b8\5\u009cO\2\u00b2\u00b3\7\66\2\2\u00b3\u00b4"+
		"\5(\25\2\u00b4\u00b5\7\67\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b8\5\u00aa"+
		"V\2\u00b7\u00b0\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b7"+
		"\u00b6\3\2\2\2\u00b8\5\3\2\2\2\u00b9\u00c8\5\4\3\2\u00ba\u00bc\7\3\2\2"+
		"\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be"+
		"\7\66\2\2\u00be\u00bf\5j\66\2\u00bf\u00c0\7\67\2\2\u00c0\u00c1\7:\2\2"+
		"\u00c1\u00c3\5p9\2\u00c2\u00c4\7S\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\7;\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00b9\3\2\2\2\u00c7\u00bb\3\2\2\2\u00c8\u00d7\3\2\2\2\u00c9\u00ca\78"+
		"\2\2\u00ca\u00cb\5(\25\2\u00cb\u00cc\79\2\2\u00cc\u00d6\3\2\2\2\u00cd"+
		"\u00cf\7\66\2\2\u00ce\u00d0\5\b\5\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3"+
		"\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d6\7\67\2\2\u00d2\u00d3\t\2\2\2\u00d3"+
		"\u00d6\7d\2\2\u00d4\u00d6\t\3\2\2\u00d5\u00c9\3\2\2\2\u00d5\u00cd\3\2"+
		"\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\7\3\2\2\2\u00d9\u00d7\3\2\2\2"+
		"\u00da\u00df\5&\24\2\u00db\u00dc\7S\2\2\u00dc\u00de\5&\24\2\u00dd\u00db"+
		"\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\t\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e4\t\4\2\2\u00e3\u00e2\3\2\2\2"+
		"\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00f3"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00f4\5\6\4\2\u00e9\u00ea\5\f\7\2\u00ea"+
		"\u00eb\5\16\b\2\u00eb\u00f4\3\2\2\2\u00ec\u00ed\t\5\2\2\u00ed\u00ee\7"+
		"\66\2\2\u00ee\u00ef\5j\66\2\u00ef\u00f0\7\67\2\2\u00f0\u00f4\3\2\2\2\u00f1"+
		"\u00f2\7K\2\2\u00f2\u00f4\7d\2\2\u00f3\u00e8\3\2\2\2\u00f3\u00e9\3\2\2"+
		"\2\u00f3\u00ec\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\13\3\2\2\2\u00f5\u00f6"+
		"\t\6\2\2\u00f6\r\3\2\2\2\u00f7\u00f9\7\3\2\2\u00f8\u00f7\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\7\66\2\2\u00fb\u00fc\5"+
		"j\66\2\u00fc\u00fd\7\67\2\2\u00fd\u00fe\5\16\b\2\u00fe\u0102\3\2\2\2\u00ff"+
		"\u0102\5\n\6\2\u0100\u0102\7g\2\2\u0101\u00f8\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0101\u0100\3\2\2\2\u0102\17\3\2\2\2\u0103\u0108\5\16\b\2\u0104\u0105"+
		"\t\7\2\2\u0105\u0107\5\16\b\2\u0106\u0104\3\2\2\2\u0107\u010a\3\2\2\2"+
		"\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\21\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010b\u0110\5\20\t\2\u010c\u010d\t\b\2\2\u010d\u010f\5\20\t\2"+
		"\u010e\u010c\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\23\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0118\5\22\n\2\u0114"+
		"\u0115\t\t\2\2\u0115\u0117\5\22\n\2\u0116\u0114\3\2\2\2\u0117\u011a\3"+
		"\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\25\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011b\u0120\5\24\13\2\u011c\u011d\t\n\2\2\u011d\u011f\5"+
		"\24\13\2\u011e\u011c\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\27\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0128\5\26\f"+
		"\2\u0124\u0125\t\13\2\2\u0125\u0127\5\26\f\2\u0126\u0124\3\2\2\2\u0127"+
		"\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\31\3\2\2"+
		"\2\u012a\u0128\3\2\2\2\u012b\u0130\5\30\r\2\u012c\u012d\7I\2\2\u012d\u012f"+
		"\5\30\r\2\u012e\u012c\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2"+
		"\u0130\u0131\3\2\2\2\u0131\33\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0138"+
		"\5\32\16\2\u0134\u0135\7M\2\2\u0135\u0137\5\32\16\2\u0136\u0134\3\2\2"+
		"\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\35"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u0140\5\34\17\2\u013c\u013d\7J\2\2"+
		"\u013d\u013f\5\34\17\2\u013e\u013c\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e"+
		"\3\2\2\2\u0140\u0141\3\2\2\2\u0141\37\3\2\2\2\u0142\u0140\3\2\2\2\u0143"+
		"\u0148\5\36\20\2\u0144\u0145\7K\2\2\u0145\u0147\5\36\20\2\u0146\u0144"+
		"\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"!\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u0150\5 \21\2\u014c\u014d\7L\2\2\u014d"+
		"\u014f\5 \21\2\u014e\u014c\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2"+
		"\2\2\u0150\u0151\3\2\2\2\u0151#\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0159"+
		"\5\"\22\2\u0154\u0155\7P\2\2\u0155\u0156\5(\25\2\u0156\u0157\7Q\2\2\u0157"+
		"\u0158\5$\23\2\u0158\u015a\3\2\2\2\u0159\u0154\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015a%\3\2\2\2\u015b\u0162\5$\23\2\u015c\u015d\5\n\6\2\u015d\u015e"+
		"\7T\2\2\u015e\u015f\5&\24\2\u015f\u0162\3\2\2\2\u0160\u0162\7g\2\2\u0161"+
		"\u015b\3\2\2\2\u0161\u015c\3\2\2\2\u0161\u0160\3\2\2\2\u0162\'\3\2\2\2"+
		"\u0163\u0168\5&\24\2\u0164\u0165\7S\2\2\u0165\u0167\5&\24\2\u0166\u0164"+
		"\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		")\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\5$\23\2\u016c+\3\2\2\2\u016d"+
		"\u016f\5.\30\2\u016e\u0170\5\64\33\2\u016f\u016e\3\2\2\2\u016f\u0170\3"+
		"\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\7R\2\2\u0172-\3\2\2\2\u0173\u0175"+
		"\5\62\32\2\u0174\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0174\3\2\2\2"+
		"\u0176\u0177\3\2\2\2\u0177/\3\2\2\2\u0178\u017a\5\62\32\2\u0179\u0178"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\61\3\2\2\2\u017d\u0182\58\35\2\u017e\u0182\5:\36\2\u017f\u0182\5T+\2"+
		"\u0180\u0182\5V,\2\u0181\u017d\3\2\2\2\u0181\u017e\3\2\2\2\u0181\u017f"+
		"\3\2\2\2\u0181\u0180\3\2\2\2\u0182\63\3\2\2\2\u0183\u0188\5\66\34\2\u0184"+
		"\u0185\7S\2\2\u0185\u0187\5\66\34\2\u0186\u0184\3\2\2\2\u0187\u018a\3"+
		"\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\65\3\2\2\2\u018a"+
		"\u0188\3\2\2\2\u018b\u018e\5X-\2\u018c\u018d\7T\2\2\u018d\u018f\5n8\2"+
		"\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\67\3\2\2\2\u0190\u0191"+
		"\7#\2\2\u01919\3\2\2\2\u0192\u01a7\7)\2\2\u0193\u01a7\7\r\2\2\u0194\u01a7"+
		"\7 \2\2\u0195\u01a7\7\33\2\2\u0196\u01a7\7\34\2\2\u0197\u01a7\7\26\2\2"+
		"\u0198\u01a7\7\22\2\2\u0199\u01a7\7!\2\2\u019a\u01a7\7(\2\2\u019b\u01a7"+
		"\7s\2\2\u019c\u01a7\5R*\2\u019d\u01a7\5<\37\2\u019e\u01a7\5J&\2\u019f"+
		"\u01a7\5l\67\2\u01a0\u01a1\7\4\2\2\u01a1\u01a2\7\66\2\2\u01a2\u01a3\5"+
		"*\26\2\u01a3\u01a4\7\67\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a7\7\5\2\2\u01a6"+
		"\u0192\3\2\2\2\u01a6\u0193\3\2\2\2\u01a6\u0194\3\2\2\2\u01a6\u0195\3\2"+
		"\2\2\u01a6\u0196\3\2\2\2\u01a6\u0197\3\2\2\2\u01a6\u0198\3\2\2\2\u01a6"+
		"\u0199\3\2\2\2\u01a6\u019a\3\2\2\2\u01a6\u019b\3\2\2\2\u01a6\u019c\3\2"+
		"\2\2\u01a6\u019d\3\2\2\2\u01a6\u019e\3\2\2\2\u01a6\u019f\3\2\2\2\u01a6"+
		"\u01a0\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7;\3\2\2\2\u01a8\u01aa\5> \2\u01a9"+
		"\u01ab\7d\2\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2"+
		"\2\2\u01ac\u01ad\7:\2\2\u01ad\u01ae\5@!\2\u01ae\u01af\7;\2\2\u01af\u01b4"+
		"\3\2\2\2\u01b0\u01b1\5> \2\u01b1\u01b2\7d\2\2\u01b2\u01b4\3\2\2\2\u01b3"+
		"\u01a8\3\2\2\2\u01b3\u01b0\3\2\2\2\u01b4=\3\2\2\2\u01b5\u01b6\t\f\2\2"+
		"\u01b6?\3\2\2\2\u01b7\u01b9\5B\"\2\u01b8\u01b7\3\2\2\2\u01b9\u01ba\3\2"+
		"\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bbA\3\2\2\2\u01bc\u01bd"+
		"\5D#\2\u01bd\u01be\5F$\2\u01be\u01bf\7R\2\2\u01bf\u01c4\3\2\2\2\u01c0"+
		"\u01c1\5D#\2\u01c1\u01c2\7R\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01bc\3\2\2"+
		"\2\u01c3\u01c0\3\2\2\2\u01c4C\3\2\2\2\u01c5\u01c8\5:\36\2\u01c6\u01c8"+
		"\5T+\2\u01c7\u01c5\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9"+
		"\u01cb\5D#\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cbE\3\2\2\2\u01cc"+
		"\u01d1\5H%\2\u01cd\u01ce\7S\2\2\u01ce\u01d0\5H%\2\u01cf\u01cd\3\2\2\2"+
		"\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2G\3"+
		"\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01db\5X-\2\u01d5\u01d7\5X-\2\u01d6\u01d5"+
		"\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\7Q\2\2\u01d9"+
		"\u01db\5*\26\2\u01da\u01d4\3\2\2\2\u01da\u01d6\3\2\2\2\u01dbI\3\2\2\2"+
		"\u01dc\u01de\7\24\2\2\u01dd\u01df\7d\2\2\u01de\u01dd\3\2\2\2\u01de\u01df"+
		"\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\7:\2\2\u01e1\u01e3\5L\'\2\u01e2"+
		"\u01e4\7S\2\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2"+
		"\2\2\u01e5\u01e6\7;\2\2\u01e6\u01ea\3\2\2\2\u01e7\u01e8\7\24\2\2\u01e8"+
		"\u01ea\7d\2\2\u01e9\u01dc\3\2\2\2\u01e9\u01e7\3\2\2\2\u01eaK\3\2\2\2\u01eb"+
		"\u01f0\5N(\2\u01ec\u01ed\7S\2\2\u01ed\u01ef\5N(\2\u01ee\u01ec\3\2\2\2"+
		"\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1M\3"+
		"\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f6\5P)\2\u01f4\u01f5\7T\2\2\u01f5"+
		"\u01f7\5*\26\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7O\3\2\2\2"+
		"\u01f8\u01f9\7d\2\2\u01f9Q\3\2\2\2\u01fa\u01fb\7.\2\2\u01fb\u01fc\7\66"+
		"\2\2\u01fc\u01fd\5j\66\2\u01fd\u01fe\7\67\2\2\u01feS\3\2\2\2\u01ff\u0200"+
		"\t\r\2\2\u0200U\3\2\2\2\u0201\u0202\7,\2\2\u0202\u0205\7\66\2\2\u0203"+
		"\u0206\5j\66\2\u0204\u0206\5*\26\2\u0205\u0203\3\2\2\2\u0205\u0204\3\2"+
		"\2\2\u0206\u0207\3\2\2\2\u0207\u0208\7\67\2\2\u0208W\3\2\2\2\u0209\u020b"+
		"\5^\60\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020d\5Z.\2\u020dY\3\2\2\2\u020e\u020f\b.\1\2\u020f\u0218\7d\2\2\u0210"+
		"\u0211\7\66\2\2\u0211\u0212\5X-\2\u0212\u0213\7\67\2\2\u0213\u0218\3\2"+
		"\2\2\u0214\u0215\7d\2\2\u0215\u0216\7Q\2\2\u0216\u0218\7g\2\2\u0217\u020e"+
		"\3\2\2\2\u0217\u0210\3\2\2\2\u0217\u0214\3\2\2\2\u0218\u0246\3\2\2\2\u0219"+
		"\u021a\f\t\2\2\u021a\u021c\78\2\2\u021b\u021d\5`\61\2\u021c\u021b\3\2"+
		"\2\2\u021c\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u0220\5&\24\2\u021f"+
		"\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0245\79"+
		"\2\2\u0222\u0223\f\b\2\2\u0223\u0224\78\2\2\u0224\u0226\7#\2\2\u0225\u0227"+
		"\5`\61\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u0229\5&\24\2\u0229\u022a\79\2\2\u022a\u0245\3\2\2\2\u022b\u022c\f\7"+
		"\2\2\u022c\u022d\78\2\2\u022d\u022e\5`\61\2\u022e\u022f\7#\2\2\u022f\u0230"+
		"\5&\24\2\u0230\u0231\79\2\2\u0231\u0245\3\2\2\2\u0232\u0233\f\6\2\2\u0233"+
		"\u0235\78\2\2\u0234\u0236\5`\61\2\u0235\u0234\3\2\2\2\u0235\u0236\3\2"+
		"\2\2\u0236\u0237\3\2\2\2\u0237\u0238\7F\2\2\u0238\u0245\79\2\2\u0239\u023a"+
		"\f\5\2\2\u023a\u023b\7\66\2\2\u023b\u023c\5b\62\2\u023c\u023d\7\67\2\2"+
		"\u023d\u0245\3\2\2\2\u023e\u023f\f\4\2\2\u023f\u0241\7\66\2\2\u0240\u0242"+
		"\5h\65\2\u0241\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\3\2\2\2\u0243"+
		"\u0245\7\67\2\2\u0244\u0219\3\2\2\2\u0244\u0222\3\2\2\2\u0244\u022b\3"+
		"\2\2\2\u0244\u0232\3\2\2\2\u0244\u0239\3\2\2\2\u0244\u023e\3\2\2\2\u0245"+
		"\u0248\3\2\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247[\3\2\2\2"+
		"\u0248\u0246\3\2\2\2\u0249\u024f\n\16\2\2\u024a\u024b\7\66\2\2\u024b\u024c"+
		"\5\\/\2\u024c\u024d\7\67\2\2\u024d\u024f\3\2\2\2\u024e\u0249\3\2\2\2\u024e"+
		"\u024a\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2"+
		"\2\2\u0251]\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u0255\t\17\2\2\u0254\u0256"+
		"\5`\61\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0258\3\2\2\2\u0257"+
		"\u0253\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2"+
		"\2\2\u025a_\3\2\2\2\u025b\u025d\5T+\2\u025c\u025b\3\2\2\2\u025d\u025e"+
		"\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025fa\3\2\2\2\u0260"+
		"\u0263\5d\63\2\u0261\u0262\7S\2\2\u0262\u0264\7c\2\2\u0263\u0261\3\2\2"+
		"\2\u0263\u0264\3\2\2\2\u0264c\3\2\2\2\u0265\u026a\5f\64\2\u0266\u0267"+
		"\7S\2\2\u0267\u0269\5f\64\2\u0268\u0266\3\2\2\2\u0269\u026c\3\2\2\2\u026a"+
		"\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026be\3\2\2\2\u026c\u026a\3\2\2\2"+
		"\u026d\u026e\5.\30\2\u026e\u026f\5X-\2\u026f\u0272\3\2\2\2\u0270\u0272"+
		"\5\60\31\2\u0271\u026d\3\2\2\2\u0271\u0270\3\2\2\2\u0272g\3\2\2\2\u0273"+
		"\u0278\7d\2\2\u0274\u0275\7S\2\2\u0275\u0277\7d\2\2\u0276\u0274\3\2\2"+
		"\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279i"+
		"\3\2\2\2\u027a\u0278\3\2\2\2\u027b\u027c\5D#\2\u027ck\3\2\2\2\u027d\u027e"+
		"\7d\2\2\u027em\3\2\2\2\u027f\u028a\5&\24\2\u0280\u0281\7:\2\2\u0281\u0283"+
		"\5p9\2\u0282\u0284\7S\2\2\u0283\u0282\3\2\2\2\u0283\u0284\3\2\2\2\u0284"+
		"\u0285\3\2\2\2\u0285\u0286\7;\2\2\u0286\u028a\3\2\2\2\u0287\u028a\5\u009e"+
		"P\2\u0288\u028a\5\u00aaV\2\u0289\u027f\3\2\2\2\u0289\u0280\3\2\2\2\u0289"+
		"\u0287\3\2\2\2\u0289\u0288\3\2\2\2\u028ao\3\2\2\2\u028b\u028d\5t;\2\u028c"+
		"\u028b\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0296\5n"+
		"8\2\u028f\u0291\7S\2\2\u0290\u0292\5t;\2\u0291\u0290\3\2\2\2\u0291\u0292"+
		"\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0295\5n8\2\u0294\u028f\3\2\2\2\u0295"+
		"\u0298\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297q\3\2\2\2"+
		"\u0298\u0296\3\2\2\2\u0299\u029b\5t;\2\u029a\u0299\3\2\2\2\u029a\u029b"+
		"\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u02a4\5n8\2\u029d\u029f\7J\2\2\u029e"+
		"\u02a0\5t;\2\u029f\u029e\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\3\2\2"+
		"\2\u02a1\u02a3\5n8\2\u02a2\u029d\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2"+
		"\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5s\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7"+
		"\u02a8\5v<\2\u02a8\u02a9\7T\2\2\u02a9u\3\2\2\2\u02aa\u02ac\5x=\2\u02ab"+
		"\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2"+
		"\2\2\u02aew\3\2\2\2\u02af\u02b0\78\2\2\u02b0\u02b1\5*\26\2\u02b1\u02b2"+
		"\79\2\2\u02b2\u02b6\3\2\2\2\u02b3\u02b4\7b\2\2\u02b4\u02b6\7d\2\2\u02b5"+
		"\u02af\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6y\3\2\2\2\u02b7\u02be\5|?\2\u02b8"+
		"\u02be\5~@\2\u02b9\u02be\5\u0084C\2\u02ba\u02be\5\u0086D\2\u02bb\u02be"+
		"\5\u0088E\2\u02bc\u02be\5\u0090I\2\u02bd\u02b7\3\2\2\2\u02bd\u02b8\3\2"+
		"\2\2\u02bd\u02b9\3\2\2\2\u02bd\u02ba\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd"+
		"\u02bc\3\2\2\2\u02be{\3\2\2\2\u02bf\u02c0\7d\2\2\u02c0\u02c1\7Q\2\2\u02c1"+
		"\u02cb\5z>\2\u02c2\u02c3\7\f\2\2\u02c3\u02c4\5*\26\2\u02c4\u02c5\7Q\2"+
		"\2\u02c5\u02c6\5z>\2\u02c6\u02cb\3\2\2\2\u02c7\u02c8\7\20\2\2\u02c8\u02c9"+
		"\7Q\2\2\u02c9\u02cb\5z>\2\u02ca\u02bf\3\2\2\2\u02ca\u02c2\3\2\2\2\u02ca"+
		"\u02c7\3\2\2\2\u02cb}\3\2\2\2\u02cc\u02ce\7:\2\2\u02cd\u02cf\5\u0080A"+
		"\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1"+
		"\7;\2\2\u02d1\177\3\2\2\2\u02d2\u02d4\5\u0082B\2\u02d3\u02d2\3\2\2\2\u02d4"+
		"\u02d5\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u0081\3\2"+
		"\2\2\u02d7\u02db\5z>\2\u02d8\u02db\5,\27\2\u02d9\u02db\5\u0098M\2\u02da"+
		"\u02d7\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02d9\3\2\2\2\u02db\u0083\3\2"+
		"\2\2\u02dc\u02de\5(\25\2\u02dd\u02dc\3\2\2\2\u02dd\u02de\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02df\u02e0\7R\2\2\u02e0\u0085\3\2\2\2\u02e1\u02e2\7\31"+
		"\2\2\u02e2\u02e3\7\66\2\2\u02e3\u02e4\5(\25\2\u02e4\u02e5\7\67\2\2\u02e5"+
		"\u02e8\5z>\2\u02e6\u02e7\7\23\2\2\u02e7\u02e9\5z>\2\u02e8\u02e6\3\2\2"+
		"\2\u02e8\u02e9\3\2\2\2\u02e9\u02f1\3\2\2\2\u02ea\u02eb\7%\2\2\u02eb\u02ec"+
		"\7\66\2\2\u02ec\u02ed\5(\25\2\u02ed\u02ee\7\67\2\2\u02ee\u02ef\5z>\2\u02ef"+
		"\u02f1\3\2\2\2\u02f0\u02e1\3\2\2\2\u02f0\u02ea\3\2\2\2\u02f1\u0087\3\2"+
		"\2\2\u02f2\u02f3\7+\2\2\u02f3\u02f4\7\66\2\2\u02f4\u02f5\5(\25\2\u02f5"+
		"\u02f6\7\67\2\2\u02f6\u02f7\5z>\2\u02f7\u0307\3\2\2\2\u02f8\u02f9\7\21"+
		"\2\2\u02f9\u02fa\5z>\2\u02fa\u02fb\7+\2\2\u02fb\u02fc\7\66\2\2\u02fc\u02fd"+
		"\5(\25\2\u02fd\u02fe\7\67\2\2\u02fe\u02ff\7R\2\2\u02ff\u0307\3\2\2\2\u0300"+
		"\u0301\7\27\2\2\u0301\u0302\7\66\2\2\u0302\u0303\5\u008aF\2\u0303\u0304"+
		"\7\67\2\2\u0304\u0305\5z>\2\u0305\u0307\3\2\2\2\u0306\u02f2\3\2\2\2\u0306"+
		"\u02f8\3\2\2\2\u0306\u0300\3\2\2\2\u0307\u0089\3\2\2\2\u0308\u030d\5\u008c"+
		"G\2\u0309\u030b\5(\25\2\u030a\u0309\3\2\2\2\u030a\u030b\3\2\2\2\u030b"+
		"\u030d\3\2\2\2\u030c\u0308\3\2\2\2\u030c\u030a\3\2\2\2\u030d\u030e\3\2"+
		"\2\2\u030e\u0310\7R\2\2\u030f\u0311\5\u008eH\2\u0310\u030f\3\2\2\2\u0310"+
		"\u0311\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0314\7R\2\2\u0313\u0315\5\u008e"+
		"H\2\u0314\u0313\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u008b\3\2\2\2\u0316"+
		"\u0318\5.\30\2\u0317\u0319\5\64\33\2\u0318\u0317\3\2\2\2\u0318\u0319\3"+
		"\2\2\2\u0319\u008d\3\2\2\2\u031a\u031f\5&\24\2\u031b\u031c\7S\2\2\u031c"+
		"\u031e\5&\24\2\u031d\u031b\3\2\2\2\u031e\u0321\3\2\2\2\u031f\u031d\3\2"+
		"\2\2\u031f\u0320\3\2\2\2\u0320\u008f\3\2\2\2\u0321\u031f\3\2\2\2\u0322"+
		"\u0323\7\30\2\2\u0323\u032c\7d\2\2\u0324\u032c\t\20\2\2\u0325\u0327\7"+
		"\37\2\2\u0326\u0328\5(\25\2\u0327\u0326\3\2\2\2\u0327\u0328\3\2\2\2\u0328"+
		"\u032c\3\2\2\2\u0329\u032a\7\30\2\2\u032a\u032c\5\n\6\2\u032b\u0322\3"+
		"\2\2\2\u032b\u0324\3\2\2\2\u032b\u0325\3\2\2\2\u032b\u0329\3\2\2\2\u032c"+
		"\u032d\3\2\2\2\u032d\u032e\7R\2\2\u032e\u0091\3\2\2\2\u032f\u0331\5\u0094"+
		"K\2\u0330\u032f\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0332\3\2\2\2\u0332"+
		"\u0333\7\2\2\3\u0333\u0093\3\2\2\2\u0334\u0336\5\u0096L\2\u0335\u0334"+
		"\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0335\3\2\2\2\u0337\u0338\3\2\2\2\u0338"+
		"\u0095\3\2\2\2\u0339\u033d\5\u0098M\2\u033a\u033d\5,\27\2\u033b\u033d"+
		"\7R\2\2\u033c\u0339\3\2\2\2\u033c\u033a\3\2\2\2\u033c\u033b\3\2\2\2\u033d"+
		"\u0097\3\2\2\2\u033e\u0340\5.\30\2\u033f\u033e\3\2\2\2\u033f\u0340\3\2"+
		"\2\2\u0340\u0341\3\2\2\2\u0341\u0343\5X-\2\u0342\u0344\5\u009aN\2\u0343"+
		"\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\5~"+
		"@\2\u0346\u0099\3\2\2\2\u0347\u0349\5,\27\2\u0348\u0347\3\2\2\2\u0349"+
		"\u034a\3\2\2\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u009b\3\2"+
		"\2\2\u034c\u0355\7e\2\2\u034d\u0355\7f\2\2\u034e\u0350\7h\2\2\u034f\u034e"+
		"\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352"+
		"\u0355\3\2\2\2\u0353\u0355\7t\2\2\u0354\u034c\3\2\2\2\u0354\u034d\3\2"+
		"\2\2\u0354\u034f\3\2\2\2\u0354\u0353\3\2\2\2\u0355\u009d\3\2\2\2\u0356"+
		"\u0357\7\6\2\2\u0357\u035c\5\u00a0Q\2\u0358\u0359\7\7\2\2\u0359\u035b"+
		"\5\u00a0Q\2\u035a\u0358\3\2\2\2\u035b\u035e\3\2\2\2\u035c\u035a\3\2\2"+
		"\2\u035c\u035d\3\2\2\2\u035d\u035f\3\2\2\2\u035e\u035c\3\2\2\2\u035f\u0360"+
		"\7\b\2\2\u0360\u0363\3\2\2\2\u0361\u0363\5\u00aaV\2\u0362\u0356\3\2\2"+
		"\2\u0362\u0361\3\2\2\2\u0363\u009f\3\2\2\2\u0364\u0365\5r:\2\u0365\u00a1"+
		"\3\2\2\2\u0366\u0368\5\u00a4S\2\u0367\u0369\5\u00a6T\2\u0368\u0367\3\2"+
		"\2\2\u0368\u0369\3\2\2\2\u0369\u00a3\3\2\2\2\u036a\u036b\78\2\2\u036b"+
		"\u0370\5\u00a8U\2\u036c\u036d\7S\2\2\u036d\u036f\5\u00a8U\2\u036e\u036c"+
		"\3\2\2\2\u036f\u0372\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371"+
		"\u0373\3\2\2\2\u0372\u0370\3\2\2\2\u0373\u0374\79\2\2\u0374\u0377\3\2"+
		"\2\2\u0375\u0377\7d\2\2\u0376\u036a\3\2\2\2\u0376\u0375\3\2\2\2\u0377"+
		"\u00a5\3\2\2\2\u0378\u0379\78\2\2\u0379\u037e\5$\23\2\u037a\u037b\7S\2"+
		"\2\u037b\u037d\5$\23\2\u037c\u037a\3\2\2\2\u037d\u0380\3\2\2\2\u037e\u037c"+
		"\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0381\3\2\2\2\u0380\u037e\3\2\2\2\u0381"+
		"\u0382\79\2\2\u0382\u00a7\3\2\2\2\u0383\u0388\7d\2\2\u0384\u0385\t\21"+
		"\2\2\u0385\u0387\7d\2\2\u0386\u0384\3\2\2\2\u0387\u038a\3\2\2\2\u0388"+
		"\u0386\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u0395\3\2\2\2\u038a\u0388\3\2"+
		"\2\2\u038b\u038c\7Q\2\2\u038c\u038f\7d\2\2\u038d\u038e\7S\2\2\u038e\u0390"+
		"\7d\2\2\u038f\u038d\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u038f\3\2\2\2\u0391"+
		"\u0392\3\2\2\2\u0392\u0394\3\2\2\2\u0393\u038b\3\2\2\2\u0394\u0397\3\2"+
		"\2\2\u0395\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u00a9\3\2\2\2\u0397"+
		"\u0395\3\2\2\2\u0398\u0399\78\2\2\u0399\u039c\7d\2\2\u039a\u039b\7J\2"+
		"\2\u039b\u039d\7d\2\2\u039c\u039a\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u039c"+
		"\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\7\t\2\2\u03a1"+
		"\u03a2\5\u00a2R\2\u03a2\u03a3\79\2\2\u03a3\u00ab\3\2\2\2\u03a4\u03a5\7"+
		"d\2\2\u03a5\u03a6\7P\2\2\u03a6\u03a7\5\u00a6T\2\u03a7\u00ad\3\2\2\2p\u00b7"+
		"\u00bb\u00c3\u00c7\u00cf\u00d5\u00d7\u00df\u00e5\u00f3\u00f8\u0101\u0108"+
		"\u0110\u0118\u0120\u0128\u0130\u0138\u0140\u0148\u0150\u0159\u0161\u0168"+
		"\u016f\u0176\u017b\u0181\u0188\u018e\u01a6\u01aa\u01b3\u01ba\u01c3\u01c7"+
		"\u01ca\u01d1\u01d6\u01da\u01de\u01e3\u01e9\u01f0\u01f6\u0205\u020a\u0217"+
		"\u021c\u021f\u0226\u0235\u0241\u0244\u0246\u024e\u0250\u0255\u0259\u025e"+
		"\u0263\u026a\u0271\u0278\u0283\u0289\u028c\u0291\u0296\u029a\u029f\u02a4"+
		"\u02ad\u02b5\u02bd\u02ca\u02ce\u02d5\u02da\u02dd\u02e8\u02f0\u0306\u030a"+
		"\u030c\u0310\u0314\u0318\u031f\u0327\u032b\u0330\u0337\u033c\u033f\u0343"+
		"\u034a\u0351\u0354\u035c\u0362\u0368\u0370\u0376\u037e\u0388\u0391\u0395"+
		"\u039e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}