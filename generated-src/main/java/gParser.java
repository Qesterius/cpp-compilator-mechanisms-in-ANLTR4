// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

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
		Whitespace=71, Newline=72, BlockComment=73, LineComment=74, Doublecolon=75, 
		This=76, Mutable=77, Dynamic_cast=78, Static_cast=79, Reinterpret_cast=80, 
		Const_cast=81, Template=82, Typeid_=83, Sizeof=84, Alignof=85, Or=86, 
		New=87, Delete=88, Noexcept=89, Case=90, Default=91, Switch=92, Do=93, 
		Goto=94, Using=95, Static_assert=96, Friend=97, Typedef=98, Constexpr=99, 
		Register=100, Static=101, Thread_local=102, Extern=103, Inline=104, Virtual=105, 
		Explicit=106, Short=107, Long=108, Unsigned=109, Signed=110, Char=111, 
		Char16=112, Char32=113, Wchar=114, Double=115, Auto=116, Decltype=117, 
		Enum=118, Class=119, Struct=120, Namespace=121, Typename_=122, Asm=123, 
		Alignas=124, Const=125, Volatile=126, Operator=127, UserDefinedStringLiteral=128, 
		MatrixLiteral=129, CharacterLiteral=130, FloatingLiteral=131, PointerLiteral=132, 
		UserDefinedLiteral=133;
	public static final int
		RULE_translationUnit = 0, RULE_primaryExpression = 1, RULE_idExpression = 2, 
		RULE_unqualifiedId = 3, RULE_qualifiedId = 4, RULE_nestedNameSpecifier = 5, 
		RULE_lambdaExpression = 6, RULE_lambdaIntroducer = 7, RULE_lambdaCapture = 8, 
		RULE_captureDefault = 9, RULE_captureList = 10, RULE_capture = 11, RULE_simpleCapture = 12, 
		RULE_initcapture = 13, RULE_lambdaDeclarator = 14, RULE_postfixExpression = 15, 
		RULE_typeIdOfTheTypeId = 16, RULE_expressionList = 17, RULE_pseudoDestructorName = 18, 
		RULE_unaryExpression = 19, RULE_unaryOperator = 20, RULE_newExpression = 21, 
		RULE_newPlacement = 22, RULE_newTypeId = 23, RULE_newDeclarator = 24, 
		RULE_noPointerNewDeclarator = 25, RULE_newInitializer = 26, RULE_deleteExpression = 27, 
		RULE_noExceptExpression = 28, RULE_castExpression = 29, RULE_pointerMemberExpression = 30, 
		RULE_multiplicativeExpression = 31, RULE_additiveExpression = 32, RULE_shiftExpression = 33, 
		RULE_shiftOperator = 34, RULE_relationalExpression = 35, RULE_equalityExpression = 36, 
		RULE_andExpression = 37, RULE_exclusiveOrExpression = 38, RULE_inclusiveOrExpression = 39, 
		RULE_logicalAndExpression = 40, RULE_logicalOrExpression = 41, RULE_conditionalExpression = 42, 
		RULE_assignmentExpression = 43, RULE_assignmentOperator = 44, RULE_expression = 45, 
		RULE_constantExpression = 46, RULE_statement = 47, RULE_labeledStatement = 48, 
		RULE_expressionStatement = 49, RULE_compoundStatement = 50, RULE_statementSeq = 51, 
		RULE_selectionStatement = 52, RULE_condition = 53, RULE_iterationStatement = 54, 
		RULE_forInitStatement = 55, RULE_forRangeDeclaration = 56, RULE_forRangeInitializer = 57, 
		RULE_jumpStatement = 58, RULE_declarationStatement = 59, RULE_declarationseq = 60, 
		RULE_declaration = 61, RULE_blockDeclaration = 62, RULE_aliasDeclaration = 63, 
		RULE_simpleDeclaration = 64, RULE_staticAssertDeclaration = 65, RULE_emptyDeclaration = 66, 
		RULE_attributeDeclaration = 67, RULE_declSpecifier = 68, RULE_declSpecifierSeq = 69, 
		RULE_storageClassSpecifier = 70, RULE_functionSpecifier = 71, RULE_typedefName = 72, 
		RULE_typeSpecifier = 73, RULE_trailingTypeSpecifier = 74, RULE_typeSpecifierSeq = 75, 
		RULE_trailingTypeSpecifierSeq = 76, RULE_simpleTypeLengthModifier = 77, 
		RULE_simpleTypeSignednessModifier = 78, RULE_simpleTypeSpecifier = 79, 
		RULE_theTypeName = 80, RULE_decltypeSpecifier = 81, RULE_elaboratedTypeSpecifier = 82, 
		RULE_enumName = 83, RULE_enumSpecifier = 84, RULE_enumHead = 85, RULE_opaqueEnumDeclaration = 86, 
		RULE_enumkey = 87, RULE_enumbase = 88, RULE_enumeratorList = 89, RULE_enumeratorDefinition = 90, 
		RULE_enumerator = 91, RULE_namespaceName = 92, RULE_originalNamespaceName = 93, 
		RULE_namespaceDefinition = 94, RULE_namespaceAlias = 95, RULE_namespaceAliasDefinition = 96, 
		RULE_qualifiednamespacespecifier = 97, RULE_usingDeclaration = 98, RULE_usingDirective = 99, 
		RULE_asmDefinition = 100, RULE_linkageSpecification = 101, RULE_attributeSpecifierSeq = 102, 
		RULE_attributeSpecifier = 103, RULE_alignmentspecifier = 104, RULE_attributeList = 105, 
		RULE_attribute = 106, RULE_attributeNamespace = 107, RULE_attributeArgumentClause = 108, 
		RULE_balancedTokenSeq = 109, RULE_balancedtoken = 110, RULE_initDeclaratorList = 111, 
		RULE_initDeclarator = 112, RULE_declarator = 113, RULE_pointerDeclarator = 114, 
		RULE_noPointerDeclarator = 115, RULE_parametersAndQualifiers = 116, RULE_trailingReturnType = 117, 
		RULE_pointerOperator = 118, RULE_cvqualifierseq = 119, RULE_cvQualifier = 120, 
		RULE_refqualifier = 121, RULE_declaratorid = 122, RULE_theTypeId = 123, 
		RULE_abstractDeclarator = 124, RULE_pointerAbstractDeclarator = 125, RULE_noPointerAbstractDeclarator = 126, 
		RULE_abstractPackDeclarator = 127, RULE_noPointerAbstractPackDeclarator = 128, 
		RULE_parameterDeclarationClause = 129, RULE_parameterDeclarationList = 130, 
		RULE_parameterDeclaration = 131, RULE_functionDefinition = 132, RULE_functionBody = 133, 
		RULE_initializer = 134, RULE_braceOrEqualInitializer = 135, RULE_initializerClause = 136, 
		RULE_initializerList = 137, RULE_bracedInitList = 138, RULE_meminitializerid = 139, 
		RULE_operatorFunctionId = 140, RULE_literalOperatorId = 141, RULE_theOperator = 142, 
		RULE_literal = 143, RULE_matrix = 144, RULE_row = 145, RULE_shortquery = 146, 
		RULE_sqlbase = 147, RULE_sqlwhere = 148, RULE_querydatajoin = 149, RULE_query = 150, 
		RULE_askingquery = 151;
	private static String[] makeRuleNames() {
		return new String[] {
			"translationUnit", "primaryExpression", "idExpression", "unqualifiedId", 
			"qualifiedId", "nestedNameSpecifier", "lambdaExpression", "lambdaIntroducer", 
			"lambdaCapture", "captureDefault", "captureList", "capture", "simpleCapture", 
			"initcapture", "lambdaDeclarator", "postfixExpression", "typeIdOfTheTypeId", 
			"expressionList", "pseudoDestructorName", "unaryExpression", "unaryOperator", 
			"newExpression", "newPlacement", "newTypeId", "newDeclarator", "noPointerNewDeclarator", 
			"newInitializer", "deleteExpression", "noExceptExpression", "castExpression", 
			"pointerMemberExpression", "multiplicativeExpression", "additiveExpression", 
			"shiftExpression", "shiftOperator", "relationalExpression", "equalityExpression", 
			"andExpression", "exclusiveOrExpression", "inclusiveOrExpression", "logicalAndExpression", 
			"logicalOrExpression", "conditionalExpression", "assignmentExpression", 
			"assignmentOperator", "expression", "constantExpression", "statement", 
			"labeledStatement", "expressionStatement", "compoundStatement", "statementSeq", 
			"selectionStatement", "condition", "iterationStatement", "forInitStatement", 
			"forRangeDeclaration", "forRangeInitializer", "jumpStatement", "declarationStatement", 
			"declarationseq", "declaration", "blockDeclaration", "aliasDeclaration", 
			"simpleDeclaration", "staticAssertDeclaration", "emptyDeclaration", "attributeDeclaration", 
			"declSpecifier", "declSpecifierSeq", "storageClassSpecifier", "functionSpecifier", 
			"typedefName", "typeSpecifier", "trailingTypeSpecifier", "typeSpecifierSeq", 
			"trailingTypeSpecifierSeq", "simpleTypeLengthModifier", "simpleTypeSignednessModifier", 
			"simpleTypeSpecifier", "theTypeName", "decltypeSpecifier", "elaboratedTypeSpecifier", 
			"enumName", "enumSpecifier", "enumHead", "opaqueEnumDeclaration", "enumkey", 
			"enumbase", "enumeratorList", "enumeratorDefinition", "enumerator", "namespaceName", 
			"originalNamespaceName", "namespaceDefinition", "namespaceAlias", "namespaceAliasDefinition", 
			"qualifiednamespacespecifier", "usingDeclaration", "usingDirective", 
			"asmDefinition", "linkageSpecification", "attributeSpecifierSeq", "attributeSpecifier", 
			"alignmentspecifier", "attributeList", "attribute", "attributeNamespace", 
			"attributeArgumentClause", "balancedTokenSeq", "balancedtoken", "initDeclaratorList", 
			"initDeclarator", "declarator", "pointerDeclarator", "noPointerDeclarator", 
			"parametersAndQualifiers", "trailingReturnType", "pointerOperator", "cvqualifierseq", 
			"cvQualifier", "refqualifier", "declaratorid", "theTypeId", "abstractDeclarator", 
			"pointerAbstractDeclarator", "noPointerAbstractDeclarator", "abstractPackDeclarator", 
			"noPointerAbstractPackDeclarator", "parameterDeclarationClause", "parameterDeclarationList", 
			"parameterDeclaration", "functionDefinition", "functionBody", "initializer", 
			"braceOrEqualInitializer", "initializerClause", "initializerList", "bracedInitList", 
			"meminitializerid", "operatorFunctionId", "literalOperatorId", "theOperator", 
			"literal", "matrix", "row", "shortquery", "sqlbase", "sqlwhere", "querydatajoin", 
			"query", "askingquery"
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
			"BlockComment", "LineComment", "Doublecolon", "This", "Mutable", "Dynamic_cast", 
			"Static_cast", "Reinterpret_cast", "Const_cast", "Template", "Typeid_", 
			"Sizeof", "Alignof", "Or", "New", "Delete", "Noexcept", "Case", "Default", 
			"Switch", "Do", "Goto", "Using", "Static_assert", "Friend", "Typedef", 
			"Constexpr", "Register", "Static", "Thread_local", "Extern", "Inline", 
			"Virtual", "Explicit", "Short", "Long", "Unsigned", "Signed", "Char", 
			"Char16", "Char32", "Wchar", "Double", "Auto", "Decltype", "Enum", "Class", 
			"Struct", "Namespace", "Typename_", "Asm", "Alignas", "Const", "Volatile", 
			"Operator", "UserDefinedStringLiteral", "MatrixLiteral", "CharacterLiteral", 
			"FloatingLiteral", "PointerLiteral", "UserDefinedLiteral"
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
	public String getGrammarFileName() { return "java-escape"; }

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

	@SuppressWarnings("CheckReturnValue")
	public static class TranslationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(gParser.EOF, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTranslationUnit(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 72057804581045248L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 9025213652176737305L) != 0) {
				{
				setState(304);
				declarationseq();
				}
			}

			setState(307);
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
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public IdExpressionContext idExpression() {
			return getRuleContext(IdExpressionContext.class,0);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primaryExpression);
		try {
			int _alt;
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(309);
						literal();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(312); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(LeftParen);
				setState(315);
				expression();
				setState(316);
				match(RightParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				idExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				lambdaExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(320);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdExpressionContext extends ParserRuleContext {
		public UnqualifiedIdContext unqualifiedId() {
			return getRuleContext(UnqualifiedIdContext.class,0);
		}
		public QualifiedIdContext qualifiedId() {
			return getRuleContext(QualifiedIdContext.class,0);
		}
		public IdExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIdExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIdExpression(this);
		}
	}

	public final IdExpressionContext idExpression() throws RecognitionException {
		IdExpressionContext _localctx = new IdExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_idExpression);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				unqualifiedId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				qualifiedId();
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
	public static class UnqualifiedIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public OperatorFunctionIdContext operatorFunctionId() {
			return getRuleContext(OperatorFunctionIdContext.class,0);
		}
		public LiteralOperatorIdContext literalOperatorId() {
			return getRuleContext(LiteralOperatorIdContext.class,0);
		}
		public TerminalNode Tilde() { return getToken(gParser.Tilde, 0); }
		public DecltypeSpecifierContext decltypeSpecifier() {
			return getRuleContext(DecltypeSpecifierContext.class,0);
		}
		public UnqualifiedIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterUnqualifiedId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitUnqualifiedId(this);
		}
	}

	public final UnqualifiedIdContext unqualifiedId() throws RecognitionException {
		UnqualifiedIdContext _localctx = new UnqualifiedIdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unqualifiedId);
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				operatorFunctionId();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				literalOperatorId();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				match(Tilde);
				{
				setState(331);
				decltypeSpecifier();
				}
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
	public static class QualifiedIdContext extends ParserRuleContext {
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public UnqualifiedIdContext unqualifiedId() {
			return getRuleContext(UnqualifiedIdContext.class,0);
		}
		public QualifiedIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterQualifiedId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitQualifiedId(this);
		}
	}

	public final QualifiedIdContext qualifiedId() throws RecognitionException {
		QualifiedIdContext _localctx = new QualifiedIdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_qualifiedId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			nestedNameSpecifier(0);
			setState(335);
			unqualifiedId();
			}
		}
		catch (RecognitionException re) {
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
	public static class NestedNameSpecifierContext extends ParserRuleContext {
		public TerminalNode Doublecolon() { return getToken(gParser.Doublecolon, 0); }
		public TheTypeNameContext theTypeName() {
			return getRuleContext(TheTypeNameContext.class,0);
		}
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public DecltypeSpecifierContext decltypeSpecifier() {
			return getRuleContext(DecltypeSpecifierContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public NestedNameSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedNameSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNestedNameSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNestedNameSpecifier(this);
		}
	}

	public final NestedNameSpecifierContext nestedNameSpecifier() throws RecognitionException {
		return nestedNameSpecifier(0);
	}

	private NestedNameSpecifierContext nestedNameSpecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NestedNameSpecifierContext _localctx = new NestedNameSpecifierContext(_ctx, _parentState);
		NestedNameSpecifierContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_nestedNameSpecifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(338);
				theTypeName();
				}
				break;
			case 2:
				{
				setState(339);
				namespaceName();
				}
				break;
			case 3:
				{
				setState(340);
				decltypeSpecifier();
				}
				break;
			}
			setState(343);
			match(Doublecolon);
			}
			_ctx.stop = _input.LT(-1);
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NestedNameSpecifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_nestedNameSpecifier);
					setState(345);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					{
					setState(346);
					match(Identifier);
					}
					setState(347);
					match(Doublecolon);
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaIntroducerContext lambdaIntroducer() {
			return getRuleContext(LambdaIntroducerContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public LambdaDeclaratorContext lambdaDeclarator() {
			return getRuleContext(LambdaDeclaratorContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLambdaExpression(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lambdaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			lambdaIntroducer();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(354);
				lambdaDeclarator();
				}
			}

			setState(357);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaIntroducerContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(gParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(gParser.RightBracket, 0); }
		public LambdaCaptureContext lambdaCapture() {
			return getRuleContext(LambdaCaptureContext.class,0);
		}
		public LambdaIntroducerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaIntroducer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLambdaIntroducer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLambdaIntroducer(this);
		}
	}

	public final LambdaIntroducerContext lambdaIntroducer() throws RecognitionException {
		LambdaIntroducerContext _localctx = new LambdaIntroducerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lambdaIntroducer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(LeftBracket);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & 1108101562377L) != 0) {
				{
				setState(360);
				lambdaCapture();
				}
			}

			setState(363);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaCaptureContext extends ParserRuleContext {
		public CaptureListContext captureList() {
			return getRuleContext(CaptureListContext.class,0);
		}
		public CaptureDefaultContext captureDefault() {
			return getRuleContext(CaptureDefaultContext.class,0);
		}
		public TerminalNode Comma() { return getToken(gParser.Comma, 0); }
		public LambdaCaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaCapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLambdaCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLambdaCapture(this);
		}
	}

	public final LambdaCaptureContext lambdaCapture() throws RecognitionException {
		LambdaCaptureContext _localctx = new LambdaCaptureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lambdaCapture);
		int _la;
		try {
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				captureList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				captureDefault();
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(367);
					match(Comma);
					setState(368);
					captureList();
					}
				}

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
	public static class CaptureDefaultContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(gParser.And, 0); }
		public TerminalNode Assign() { return getToken(gParser.Assign, 0); }
		public CaptureDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCaptureDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCaptureDefault(this);
		}
	}

	public final CaptureDefaultContext captureDefault() throws RecognitionException {
		CaptureDefaultContext _localctx = new CaptureDefaultContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_captureDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_la = _input.LA(1);
			if ( !(_la==And || _la==Assign) ) {
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
	public static class CaptureListContext extends ParserRuleContext {
		public List<CaptureContext> capture() {
			return getRuleContexts(CaptureContext.class);
		}
		public CaptureContext capture(int i) {
			return getRuleContext(CaptureContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(gParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(gParser.Comma, i);
		}
		public TerminalNode Ellipsis() { return getToken(gParser.Ellipsis, 0); }
		public CaptureListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCaptureList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCaptureList(this);
		}
	}

	public final CaptureListContext captureList() throws RecognitionException {
		CaptureListContext _localctx = new CaptureListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_captureList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			capture();
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(376);
				match(Comma);
				setState(377);
				capture();
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(383);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaptureContext extends ParserRuleContext {
		public SimpleCaptureContext simpleCapture() {
			return getRuleContext(SimpleCaptureContext.class,0);
		}
		public InitcaptureContext initcapture() {
			return getRuleContext(InitcaptureContext.class,0);
		}
		public CaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCapture(this);
		}
	}

	public final CaptureContext capture() throws RecognitionException {
		CaptureContext _localctx = new CaptureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_capture);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				simpleCapture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				initcapture();
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
	public static class SimpleCaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public TerminalNode And() { return getToken(gParser.And, 0); }
		public TerminalNode This() { return getToken(gParser.This, 0); }
		public SimpleCaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSimpleCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSimpleCapture(this);
		}
	}

	public final SimpleCaptureContext simpleCapture() throws RecognitionException {
		SimpleCaptureContext _localctx = new SimpleCaptureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simpleCapture);
		int _la;
		try {
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case And:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(390);
					match(And);
					}
				}

				setState(393);
				match(Identifier);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(This);
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
	public static class InitcaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public TerminalNode And() { return getToken(gParser.And, 0); }
		public InitcaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initcapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterInitcapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitInitcapture(this);
		}
	}

	public final InitcaptureContext initcapture() throws RecognitionException {
		InitcaptureContext _localctx = new InitcaptureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_initcapture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And) {
				{
				setState(397);
				match(And);
				}
			}

			setState(400);
			match(Identifier);
			setState(401);
			initializer();
			}
		}
		catch (RecognitionException re) {
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
	public static class LambdaDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public ParameterDeclarationClauseContext parameterDeclarationClause() {
			return getRuleContext(ParameterDeclarationClauseContext.class,0);
		}
		public TerminalNode Mutable() { return getToken(gParser.Mutable, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TrailingReturnTypeContext trailingReturnType() {
			return getRuleContext(TrailingReturnTypeContext.class,0);
		}
		public LambdaDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLambdaDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLambdaDeclarator(this);
		}
	}

	public final LambdaDeclaratorContext lambdaDeclarator() throws RecognitionException {
		LambdaDeclaratorContext _localctx = new LambdaDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lambdaDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(LeftParen);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 72942592L) != 0 || (((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 253327478771155265L) != 0) {
				{
				setState(404);
				parameterDeclarationClause();
				}
			}

			setState(407);
			match(RightParen);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Mutable) {
				{
				setState(408);
				match(Mutable);
				}
			}

			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Alignas) {
				{
				setState(411);
				attributeSpecifierSeq();
				}
			}

			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(414);
				trailingReturnType();
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
	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public SimpleTypeSpecifierContext simpleTypeSpecifier() {
			return getRuleContext(SimpleTypeSpecifierContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode Less() { return getToken(gParser.Less, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode Greater() { return getToken(gParser.Greater, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Dynamic_cast() { return getToken(gParser.Dynamic_cast, 0); }
		public TerminalNode Static_cast() { return getToken(gParser.Static_cast, 0); }
		public TerminalNode Reinterpret_cast() { return getToken(gParser.Reinterpret_cast, 0); }
		public TerminalNode Const_cast() { return getToken(gParser.Const_cast, 0); }
		public TypeIdOfTheTypeIdContext typeIdOfTheTypeId() {
			return getRuleContext(TypeIdOfTheTypeIdContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(gParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(gParser.RightBracket, 0); }
		public TerminalNode Dot() { return getToken(gParser.Dot, 0); }
		public TerminalNode Arrow() { return getToken(gParser.Arrow, 0); }
		public IdExpressionContext idExpression() {
			return getRuleContext(IdExpressionContext.class,0);
		}
		public PseudoDestructorNameContext pseudoDestructorName() {
			return getRuleContext(PseudoDestructorNameContext.class,0);
		}
		public TerminalNode Template() { return getToken(gParser.Template, 0); }
		public TerminalNode PlusPlus() { return getToken(gParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(gParser.MinusMinus, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPostfixExpression(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(418);
				primaryExpression();
				}
				break;
			case 2:
				{
				{
				setState(419);
				simpleTypeSpecifier();
				}
				setState(426);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftParen:
					{
					setState(420);
					match(LeftParen);
					setState(422);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((_la) & ~0x3f) == 0 && ((1L << _la) & 864691617365820866L) != 0 || (((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & -864128453377532351L) != 0 || _la==UserDefinedLiteral) {
						{
						setState(421);
						expressionList();
						}
					}

					setState(424);
					match(RightParen);
					}
					break;
				case LeftBrace:
					{
					setState(425);
					bracedInitList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				{
				setState(428);
				_la = _input.LA(1);
				if ( !((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 15L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(429);
				match(Less);
				setState(430);
				theTypeId();
				setState(431);
				match(Greater);
				setState(432);
				match(LeftParen);
				setState(433);
				expression();
				setState(434);
				match(RightParen);
				}
				break;
			case 4:
				{
				setState(436);
				typeIdOfTheTypeId();
				setState(437);
				match(LeftParen);
				setState(440);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(438);
					expression();
					}
					break;
				case 2:
					{
					setState(439);
					theTypeId();
					}
					break;
				}
				setState(442);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(471);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(446);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(447);
						match(LeftBracket);
						setState(450);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IntegerLiteral:
						case StringLiteral:
						case BooleanLiteral:
						case Bool:
						case Float:
						case Matrix:
						case Int:
						case Void:
						case LeftParen:
						case LeftBracket:
						case Plus:
						case Minus:
						case Star:
						case And:
						case Tilde:
						case Not:
						case PlusPlus:
						case MinusMinus:
						case Identifier:
						case Doublecolon:
						case Dynamic_cast:
						case Static_cast:
						case Reinterpret_cast:
						case Const_cast:
						case Typeid_:
						case Sizeof:
						case Alignof:
						case Or:
						case New:
						case Delete:
						case Noexcept:
						case Short:
						case Long:
						case Unsigned:
						case Signed:
						case Char:
						case Char16:
						case Char32:
						case Wchar:
						case Double:
						case Auto:
						case Decltype:
						case Operator:
						case MatrixLiteral:
						case CharacterLiteral:
						case FloatingLiteral:
						case PointerLiteral:
						case UserDefinedLiteral:
							{
							setState(448);
							expression();
							}
							break;
						case LeftBrace:
							{
							setState(449);
							bracedInitList();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(452);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(454);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(455);
						match(LeftParen);
						setState(457);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((_la) & ~0x3f) == 0 && ((1L << _la) & 864691617365820866L) != 0 || (((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & -864128453377532351L) != 0 || _la==UserDefinedLiteral) {
							{
							setState(456);
							expressionList();
							}
						}

						setState(459);
						match(RightParen);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(460);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(461);
						_la = _input.LA(1);
						if ( !(_la==Arrow || _la==Dot) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(467);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
						case 1:
							{
							setState(463);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==Template) {
								{
								setState(462);
								match(Template);
								}
							}

							setState(465);
							idExpression();
							}
							break;
						case 2:
							{
							setState(466);
							pseudoDestructorName();
							}
							break;
						}
						}
						break;
					case 4:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(469);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(470);
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
					}
					} 
				}
				setState(475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeIdOfTheTypeIdContext extends ParserRuleContext {
		public TerminalNode Typeid_() { return getToken(gParser.Typeid_, 0); }
		public TypeIdOfTheTypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdOfTheTypeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTypeIdOfTheTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTypeIdOfTheTypeId(this);
		}
	}

	public final TypeIdOfTheTypeIdContext typeIdOfTheTypeId() throws RecognitionException {
		TypeIdOfTheTypeIdContext _localctx = new TypeIdOfTheTypeIdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeIdOfTheTypeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(Typeid_);
			}
		}
		catch (RecognitionException re) {
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
	public static class ExpressionListContext extends ParserRuleContext {
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressionList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			initializerList();
			}
		}
		catch (RecognitionException re) {
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
	public static class PseudoDestructorNameContext extends ParserRuleContext {
		public TerminalNode Tilde() { return getToken(gParser.Tilde, 0); }
		public List<TheTypeNameContext> theTypeName() {
			return getRuleContexts(TheTypeNameContext.class);
		}
		public TheTypeNameContext theTypeName(int i) {
			return getRuleContext(TheTypeNameContext.class,i);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(gParser.Doublecolon, 0); }
		public DecltypeSpecifierContext decltypeSpecifier() {
			return getRuleContext(DecltypeSpecifierContext.class,0);
		}
		public PseudoDestructorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoDestructorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPseudoDestructorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPseudoDestructorName(this);
		}
	}

	public final PseudoDestructorNameContext pseudoDestructorName() throws RecognitionException {
		PseudoDestructorNameContext _localctx = new PseudoDestructorNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pseudoDestructorName);
		int _la;
		try {
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(480);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(483);
					theTypeName();
					setState(484);
					match(Doublecolon);
					}
				}

				setState(488);
				match(Tilde);
				setState(489);
				theTypeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				match(Tilde);
				setState(491);
				decltypeSpecifier();
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
	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(gParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(gParser.MinusMinus, 0); }
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public TerminalNode Sizeof() { return getToken(gParser.Sizeof, 0); }
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public TerminalNode Ellipsis() { return getToken(gParser.Ellipsis, 0); }
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public TerminalNode Alignof() { return getToken(gParser.Alignof, 0); }
		public NoExceptExpressionContext noExceptExpression() {
			return getRuleContext(NoExceptExpressionContext.class,0);
		}
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public DeleteExpressionContext deleteExpression() {
			return getRuleContext(DeleteExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unaryExpression);
		try {
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				postfixExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PlusPlus:
					{
					setState(495);
					match(PlusPlus);
					}
					break;
				case MinusMinus:
					{
					setState(496);
					match(MinusMinus);
					}
					break;
				case Plus:
				case Minus:
				case Star:
				case And:
				case Tilde:
				case Not:
				case Or:
					{
					setState(497);
					unaryOperator();
					}
					break;
				case Sizeof:
					{
					setState(498);
					match(Sizeof);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(501);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(502);
				match(Sizeof);
				setState(511);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftParen:
					{
					setState(503);
					match(LeftParen);
					setState(504);
					theTypeId();
					setState(505);
					match(RightParen);
					}
					break;
				case Ellipsis:
					{
					setState(507);
					match(Ellipsis);
					setState(508);
					match(LeftParen);
					setState(509);
					match(Identifier);
					setState(510);
					match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(513);
				match(Alignof);
				setState(514);
				match(LeftParen);
				setState(515);
				theTypeId();
				setState(516);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(518);
				noExceptExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(519);
				newExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(520);
				deleteExpression();
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
	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode Or() { return getToken(gParser.Or, 0); }
		public TerminalNode Star() { return getToken(gParser.Star, 0); }
		public TerminalNode And() { return getToken(gParser.And, 0); }
		public TerminalNode Plus() { return getToken(gParser.Plus, 0); }
		public TerminalNode Tilde() { return getToken(gParser.Tilde, 0); }
		public TerminalNode Minus() { return getToken(gParser.Minus, 0); }
		public TerminalNode Not() { return getToken(gParser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitUnaryOperator(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_la = _input.LA(1);
			if ( !((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 72057594037928391L) != 0) ) {
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
	public static class NewExpressionContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(gParser.New, 0); }
		public NewTypeIdContext newTypeId() {
			return getRuleContext(NewTypeIdContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(gParser.Doublecolon, 0); }
		public NewPlacementContext newPlacement() {
			return getRuleContext(NewPlacementContext.class,0);
		}
		public NewInitializerContext newInitializer() {
			return getRuleContext(NewInitializerContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNewExpression(this);
		}
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_newExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Doublecolon) {
				{
				setState(525);
				match(Doublecolon);
				}
			}

			setState(528);
			match(New);
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(529);
				newPlacement();
				}
				break;
			}
			setState(537);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bool:
			case Float:
			case Matrix:
			case Int:
			case Void:
			case Identifier:
			case Doublecolon:
			case Short:
			case Long:
			case Unsigned:
			case Signed:
			case Char:
			case Char16:
			case Char32:
			case Wchar:
			case Double:
			case Auto:
			case Decltype:
			case Enum:
			case Const:
			case Volatile:
				{
				setState(532);
				newTypeId();
				}
				break;
			case LeftParen:
				{
				{
				setState(533);
				match(LeftParen);
				setState(534);
				theTypeId();
				setState(535);
				match(RightParen);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen || _la==LeftBrace) {
				{
				setState(539);
				newInitializer();
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
	public static class NewPlacementContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public NewPlacementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newPlacement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNewPlacement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNewPlacement(this);
		}
	}

	public final NewPlacementContext newPlacement() throws RecognitionException {
		NewPlacementContext _localctx = new NewPlacementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_newPlacement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(LeftParen);
			setState(543);
			expressionList();
			setState(544);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NewTypeIdContext extends ParserRuleContext {
		public TypeSpecifierSeqContext typeSpecifierSeq() {
			return getRuleContext(TypeSpecifierSeqContext.class,0);
		}
		public NewDeclaratorContext newDeclarator() {
			return getRuleContext(NewDeclaratorContext.class,0);
		}
		public NewTypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newTypeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNewTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNewTypeId(this);
		}
	}

	public final NewTypeIdContext newTypeId() throws RecognitionException {
		NewTypeIdContext _localctx = new NewTypeIdContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_newTypeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			typeSpecifierSeq();
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(547);
				newDeclarator();
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
	public static class NewDeclaratorContext extends ParserRuleContext {
		public PointerOperatorContext pointerOperator() {
			return getRuleContext(PointerOperatorContext.class,0);
		}
		public NewDeclaratorContext newDeclarator() {
			return getRuleContext(NewDeclaratorContext.class,0);
		}
		public NoPointerNewDeclaratorContext noPointerNewDeclarator() {
			return getRuleContext(NoPointerNewDeclaratorContext.class,0);
		}
		public NewDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNewDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNewDeclarator(this);
		}
	}

	public final NewDeclaratorContext newDeclarator() throws RecognitionException {
		NewDeclaratorContext _localctx = new NewDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_newDeclarator);
		try {
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Star:
			case And:
			case AndAnd:
			case Identifier:
			case Doublecolon:
			case Decltype:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				pointerOperator();
				setState(552);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(551);
					newDeclarator();
					}
					break;
				}
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
				noPointerNewDeclarator(0);
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
	public static class NoPointerNewDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(gParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(gParser.RightBracket, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public NoPointerNewDeclaratorContext noPointerNewDeclarator() {
			return getRuleContext(NoPointerNewDeclaratorContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public NoPointerNewDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noPointerNewDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNoPointerNewDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNoPointerNewDeclarator(this);
		}
	}

	public final NoPointerNewDeclaratorContext noPointerNewDeclarator() throws RecognitionException {
		return noPointerNewDeclarator(0);
	}

	private NoPointerNewDeclaratorContext noPointerNewDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoPointerNewDeclaratorContext _localctx = new NoPointerNewDeclaratorContext(_ctx, _parentState);
		NoPointerNewDeclaratorContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_noPointerNewDeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(558);
			match(LeftBracket);
			setState(559);
			expression();
			setState(560);
			match(RightBracket);
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(561);
				attributeSpecifierSeq();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(573);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoPointerNewDeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noPointerNewDeclarator);
					setState(564);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(565);
					match(LeftBracket);
					setState(566);
					constantExpression();
					setState(567);
					match(RightBracket);
					setState(569);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(568);
						attributeSpecifierSeq();
						}
						break;
					}
					}
					} 
				}
				setState(575);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NewInitializerContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public NewInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNewInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNewInitializer(this);
		}
	}

	public final NewInitializerContext newInitializer() throws RecognitionException {
		NewInitializerContext _localctx = new NewInitializerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_newInitializer);
		int _la;
		try {
			setState(582);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				match(LeftParen);
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 864691617365820866L) != 0 || (((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & -864128453377532351L) != 0 || _la==UserDefinedLiteral) {
					{
					setState(577);
					expressionList();
					}
				}

				setState(580);
				match(RightParen);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				bracedInitList();
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
	public static class DeleteExpressionContext extends ParserRuleContext {
		public TerminalNode Delete() { return getToken(gParser.Delete, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(gParser.Doublecolon, 0); }
		public TerminalNode LeftBracket() { return getToken(gParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(gParser.RightBracket, 0); }
		public DeleteExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeleteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeleteExpression(this);
		}
	}

	public final DeleteExpressionContext deleteExpression() throws RecognitionException {
		DeleteExpressionContext _localctx = new DeleteExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_deleteExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Doublecolon) {
				{
				setState(584);
				match(Doublecolon);
				}
			}

			setState(587);
			match(Delete);
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(588);
				match(LeftBracket);
				setState(589);
				match(RightBracket);
				}
				break;
			}
			setState(592);
			castExpression();
			}
		}
		catch (RecognitionException re) {
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
	public static class NoExceptExpressionContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(gParser.Noexcept, 0); }
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public NoExceptExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noExceptExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNoExceptExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNoExceptExpression(this);
		}
	}

	public final NoExceptExpressionContext noExceptExpression() throws RecognitionException {
		NoExceptExpressionContext _localctx = new NoExceptExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_noExceptExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(Noexcept);
			setState(595);
			match(LeftParen);
			setState(596);
			expression();
			setState(597);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CastExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_castExpression);
		try {
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				match(LeftParen);
				setState(601);
				theTypeId();
				setState(602);
				match(RightParen);
				setState(603);
				castExpression();
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
	public static class PointerMemberExpressionContext extends ParserRuleContext {
		public List<CastExpressionContext> castExpression() {
			return getRuleContexts(CastExpressionContext.class);
		}
		public CastExpressionContext castExpression(int i) {
			return getRuleContext(CastExpressionContext.class,i);
		}
		public List<TerminalNode> DotStar() { return getTokens(gParser.DotStar); }
		public TerminalNode DotStar(int i) {
			return getToken(gParser.DotStar, i);
		}
		public List<TerminalNode> ArrowStar() { return getTokens(gParser.ArrowStar); }
		public TerminalNode ArrowStar(int i) {
			return getToken(gParser.ArrowStar, i);
		}
		public PointerMemberExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerMemberExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPointerMemberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPointerMemberExpression(this);
		}
	}

	public final PointerMemberExpressionContext pointerMemberExpression() throws RecognitionException {
		PointerMemberExpressionContext _localctx = new PointerMemberExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_pointerMemberExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			castExpression();
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ArrowStar || _la==DotStar) {
				{
				{
				setState(608);
				_la = _input.LA(1);
				if ( !(_la==ArrowStar || _la==DotStar) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(609);
				castExpression();
				}
				}
				setState(614);
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
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<PointerMemberExpressionContext> pointerMemberExpression() {
			return getRuleContexts(PointerMemberExpressionContext.class);
		}
		public PointerMemberExpressionContext pointerMemberExpression(int i) {
			return getRuleContext(PointerMemberExpressionContext.class,i);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			pointerMemberExpression();
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0) {
				{
				{
				setState(616);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(617);
				pointerMemberExpression();
				}
				}
				setState(622);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			multiplicativeExpression();
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				{
				setState(624);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(625);
				multiplicativeExpression();
				}
				}
				setState(630);
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
	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<ShiftOperatorContext> shiftOperator() {
			return getRuleContexts(ShiftOperatorContext.class);
		}
		public ShiftOperatorContext shiftOperator(int i) {
			return getRuleContext(ShiftOperatorContext.class,i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			additiveExpression();
			setState(637);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(632);
					shiftOperator();
					setState(633);
					additiveExpression();
					}
					} 
				}
				setState(639);
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
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShiftOperatorContext extends ParserRuleContext {
		public List<TerminalNode> Greater() { return getTokens(gParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(gParser.Greater, i);
		}
		public List<TerminalNode> Less() { return getTokens(gParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(gParser.Less, i);
		}
		public ShiftOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterShiftOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitShiftOperator(this);
		}
	}

	public final ShiftOperatorContext shiftOperator() throws RecognitionException {
		ShiftOperatorContext _localctx = new ShiftOperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_shiftOperator);
		try {
			setState(644);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Greater:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				match(Greater);
				setState(641);
				match(Greater);
				}
				break;
			case Less:
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				match(Less);
				setState(643);
				match(Less);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			shiftExpression();
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 54046494063329280L) != 0) {
				{
				{
				setState(647);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 54046494063329280L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(648);
				shiftExpression();
				}
				}
				setState(653);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			relationalExpression();
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Equal || _la==NotEqual) {
				{
				{
				setState(655);
				_la = _input.LA(1);
				if ( !(_la==Equal || _la==NotEqual) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(656);
				relationalExpression();
				}
				}
				setState(661);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			equalityExpression();
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(663);
				match(And);
				setState(664);
				equalityExpression();
				}
				}
				setState(669);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			andExpression();
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Caret) {
				{
				{
				setState(671);
				match(Caret);
				setState(672);
				andExpression();
				}
				}
				setState(677);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			exclusiveOrExpression();
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(679);
				match(Or);
				setState(680);
				exclusiveOrExpression();
				}
				}
				setState(685);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLogicalAndExpression(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			inclusiveOrExpression();
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AndAnd) {
				{
				{
				setState(687);
				match(AndAnd);
				setState(688);
				inclusiveOrExpression();
				}
				}
				setState(693);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLogicalOrExpression(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			logicalAndExpression();
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrOr) {
				{
				{
				setState(695);
				match(OrOr);
				setState(696);
				logicalAndExpression();
				}
				}
				setState(701);
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
	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode Question() { return getToken(gParser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(gParser.Colon, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			logicalOrExpression();
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Question) {
				{
				setState(703);
				match(Question);
				setState(704);
				expression();
				setState(705);
				match(Colon);
				setState(706);
				assignmentExpression();
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
	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public InitializerClauseContext initializerClause() {
			return getRuleContext(InitializerClauseContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_assignmentExpression);
		try {
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
				logicalOrExpression();
				setState(712);
				assignmentOperator();
				setState(713);
				initializerClause();
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
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(gParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(gParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(gParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(gParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(gParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(gParser.MinusAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(gParser.RightShiftAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(gParser.LeftShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(gParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(gParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(gParser.OrAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 4499751336673280L) != 0) ) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			assignmentExpression();
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(720);
				match(Comma);
				setState(721);
				assignmentExpression();
				}
				}
				setState(726);
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
	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
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
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_statement);
		try {
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(729);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
				declarationStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(732);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(731);
					attributeSpecifierSeq();
					}
					break;
				}
				setState(739);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IntegerLiteral:
				case StringLiteral:
				case BooleanLiteral:
				case Bool:
				case Float:
				case Matrix:
				case Int:
				case Void:
				case LeftParen:
				case LeftBracket:
				case Plus:
				case Minus:
				case Star:
				case And:
				case Tilde:
				case Not:
				case PlusPlus:
				case MinusMinus:
				case Semi:
				case Identifier:
				case Doublecolon:
				case Dynamic_cast:
				case Static_cast:
				case Reinterpret_cast:
				case Const_cast:
				case Typeid_:
				case Sizeof:
				case Alignof:
				case Or:
				case New:
				case Delete:
				case Noexcept:
				case Short:
				case Long:
				case Unsigned:
				case Signed:
				case Char:
				case Char16:
				case Char32:
				case Wchar:
				case Double:
				case Auto:
				case Decltype:
				case Operator:
				case MatrixLiteral:
				case CharacterLiteral:
				case FloatingLiteral:
				case PointerLiteral:
				case UserDefinedLiteral:
					{
					setState(734);
					expressionStatement();
					}
					break;
				case LeftBrace:
					{
					setState(735);
					compoundStatement();
					}
					break;
				case If:
				case Switch:
					{
					setState(736);
					selectionStatement();
					}
					break;
				case For:
				case While:
				case Do:
					{
					setState(737);
					iterationStatement();
					}
					break;
				case Break:
				case Continue:
				case Return:
				case Goto:
					{
					setState(738);
					jumpStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(gParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public TerminalNode Case() { return getToken(gParser.Case, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(gParser.Default, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_labeledStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Alignas) {
				{
				setState(743);
				attributeSpecifierSeq();
				}
			}

			setState(750);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(746);
				match(Identifier);
				}
				break;
			case Case:
				{
				setState(747);
				match(Case);
				setState(748);
				constantExpression();
				}
				break;
			case Default:
				{
				setState(749);
				match(Default);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(752);
			match(Colon);
			setState(753);
			statement();
			}
		}
		catch (RecognitionException re) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -9209861230337629161L) != 0 || (((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 562958745219399545L) != 0) {
				{
				setState(755);
				expression();
				}
			}

			setState(758);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(gParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(gParser.RightBrace, 0); }
		public StatementSeqContext statementSeq() {
			return getRuleContext(StatementSeqContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCompoundStatement(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			match(LeftBrace);
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -4020588559695610761L) != 0 || (((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 567260039002193789L) != 0) {
				{
				setState(761);
				statementSeq();
				}
			}

			setState(764);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementSeqContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterStatementSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitStatementSeq(this);
		}
	}

	public final StatementSeqContext statementSeq() throws RecognitionException {
		StatementSeqContext _localctx = new StatementSeqContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_statementSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(766);
				statement();
				}
				}
				setState(769); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -4020588559695610761L) != 0 || (((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 567260039002193789L) != 0 );
			}
		}
		catch (RecognitionException re) {
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
	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(gParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSelectionStatement(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_selectionStatement);
		try {
			setState(786);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(771);
				match(If);
				setState(772);
				match(LeftParen);
				setState(773);
				condition();
				setState(774);
				match(RightParen);
				setState(775);
				statement();
				setState(778);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(776);
					match(Else);
					setState(777);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				match(Switch);
				setState(781);
				match(LeftParen);
				setState(782);
				condition();
				setState(783);
				match(RightParen);
				setState(784);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(gParser.Assign, 0); }
		public InitializerClauseContext initializerClause() {
			return getRuleContext(InitializerClauseContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_condition);
		int _la;
		try {
			setState(799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket || _la==Alignas) {
					{
					setState(789);
					attributeSpecifierSeq();
					}
				}

				setState(792);
				declSpecifierSeq();
				setState(793);
				declarator();
				setState(797);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Assign:
					{
					setState(794);
					match(Assign);
					setState(795);
					initializerClause();
					}
					break;
				case LeftBrace:
					{
					setState(796);
					bracedInitList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(gParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(gParser.Do, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(gParser.Semi, 0); }
		public TerminalNode For() { return getToken(gParser.For, 0); }
		public ForInitStatementContext forInitStatement() {
			return getRuleContext(ForInitStatementContext.class,0);
		}
		public ForRangeDeclarationContext forRangeDeclaration() {
			return getRuleContext(ForRangeDeclarationContext.class,0);
		}
		public TerminalNode Colon() { return getToken(gParser.Colon, 0); }
		public ForRangeInitializerContext forRangeInitializer() {
			return getRuleContext(ForRangeInitializerContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIterationStatement(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_iterationStatement);
		int _la;
		try {
			setState(834);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(801);
				match(While);
				setState(802);
				match(LeftParen);
				setState(803);
				condition();
				setState(804);
				match(RightParen);
				setState(805);
				statement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(807);
				match(Do);
				setState(808);
				statement();
				setState(809);
				match(While);
				setState(810);
				match(LeftParen);
				setState(811);
				expression();
				setState(812);
				match(RightParen);
				setState(813);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(815);
				match(For);
				setState(816);
				match(LeftParen);
				setState(829);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(817);
					forInitStatement();
					setState(819);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -9209861230337629161L) != 0 || (((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 566908195277143933L) != 0) {
						{
						setState(818);
						condition();
						}
					}

					setState(821);
					match(Semi);
					setState(823);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -9209861230337629161L) != 0 || (((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 562958745219399545L) != 0) {
						{
						setState(822);
						expression();
						}
					}

					}
					break;
				case 2:
					{
					setState(825);
					forRangeDeclaration();
					setState(826);
					match(Colon);
					setState(827);
					forRangeInitializer();
					}
					break;
				}
				setState(831);
				match(RightParen);
				setState(832);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitStatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SimpleDeclarationContext simpleDeclaration() {
			return getRuleContext(SimpleDeclarationContext.class,0);
		}
		public ForInitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterForInitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitForInitStatement(this);
		}
	}

	public final ForInitStatementContext forInitStatement() throws RecognitionException {
		ForInitStatementContext _localctx = new ForInitStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_forInitStatement);
		try {
			setState(838);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(836);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(837);
				simpleDeclaration();
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
	public static class ForRangeDeclarationContext extends ParserRuleContext {
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public ForRangeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forRangeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterForRangeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitForRangeDeclaration(this);
		}
	}

	public final ForRangeDeclarationContext forRangeDeclaration() throws RecognitionException {
		ForRangeDeclarationContext _localctx = new ForRangeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_forRangeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Alignas) {
				{
				setState(840);
				attributeSpecifierSeq();
				}
			}

			setState(843);
			declSpecifierSeq();
			setState(844);
			declarator();
			}
		}
		catch (RecognitionException re) {
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
	public static class ForRangeInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public ForRangeInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forRangeInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterForRangeInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitForRangeInitializer(this);
		}
	}

	public final ForRangeInitializerContext forRangeInitializer() throws RecognitionException {
		ForRangeInitializerContext _localctx = new ForRangeInitializerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_forRangeInitializer);
		try {
			setState(848);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case StringLiteral:
			case BooleanLiteral:
			case Bool:
			case Float:
			case Matrix:
			case Int:
			case Void:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Tilde:
			case Not:
			case PlusPlus:
			case MinusMinus:
			case Identifier:
			case Doublecolon:
			case Dynamic_cast:
			case Static_cast:
			case Reinterpret_cast:
			case Const_cast:
			case Typeid_:
			case Sizeof:
			case Alignof:
			case Or:
			case New:
			case Delete:
			case Noexcept:
			case Short:
			case Long:
			case Unsigned:
			case Signed:
			case Char:
			case Char16:
			case Char32:
			case Wchar:
			case Double:
			case Auto:
			case Decltype:
			case Operator:
			case MatrixLiteral:
			case CharacterLiteral:
			case FloatingLiteral:
			case PointerLiteral:
			case UserDefinedLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(846);
				expression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(847);
				bracedInitList();
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
	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(gParser.Semi, 0); }
		public TerminalNode Break() { return getToken(gParser.Break, 0); }
		public TerminalNode Continue() { return getToken(gParser.Continue, 0); }
		public TerminalNode Return() { return getToken(gParser.Return, 0); }
		public TerminalNode Goto() { return getToken(gParser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitJumpStatement(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_jumpStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
				{
				setState(850);
				match(Break);
				}
				break;
			case Continue:
				{
				setState(851);
				match(Continue);
				}
				break;
			case Return:
				{
				setState(852);
				match(Return);
				setState(855);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IntegerLiteral:
				case StringLiteral:
				case BooleanLiteral:
				case Bool:
				case Float:
				case Matrix:
				case Int:
				case Void:
				case LeftParen:
				case LeftBracket:
				case Plus:
				case Minus:
				case Star:
				case And:
				case Tilde:
				case Not:
				case PlusPlus:
				case MinusMinus:
				case Identifier:
				case Doublecolon:
				case Dynamic_cast:
				case Static_cast:
				case Reinterpret_cast:
				case Const_cast:
				case Typeid_:
				case Sizeof:
				case Alignof:
				case Or:
				case New:
				case Delete:
				case Noexcept:
				case Short:
				case Long:
				case Unsigned:
				case Signed:
				case Char:
				case Char16:
				case Char32:
				case Wchar:
				case Double:
				case Auto:
				case Decltype:
				case Operator:
				case MatrixLiteral:
				case CharacterLiteral:
				case FloatingLiteral:
				case PointerLiteral:
				case UserDefinedLiteral:
					{
					setState(853);
					expression();
					}
					break;
				case LeftBrace:
					{
					setState(854);
					bracedInitList();
					}
					break;
				case Semi:
					break;
				default:
					break;
				}
				}
				break;
			case Goto:
				{
				setState(857);
				match(Goto);
				setState(858);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(861);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationStatementContext extends ParserRuleContext {
		public BlockDeclarationContext blockDeclaration() {
			return getRuleContext(BlockDeclarationContext.class,0);
		}
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclarationStatement(this);
		}
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_declarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			blockDeclaration();
			}
		}
		catch (RecognitionException re) {
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
	public static class DeclarationseqContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclarationseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclarationseq(this);
		}
	}

	public final DeclarationseqContext declarationseq() throws RecognitionException {
		DeclarationseqContext _localctx = new DeclarationseqContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_declarationseq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(865);
				declaration();
				}
				}
				setState(868); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 72057804581045248L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 9025213652176737305L) != 0 );
			}
		}
		catch (RecognitionException re) {
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
	public static class DeclarationContext extends ParserRuleContext {
		public BlockDeclarationContext blockDeclaration() {
			return getRuleContext(BlockDeclarationContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public LinkageSpecificationContext linkageSpecification() {
			return getRuleContext(LinkageSpecificationContext.class,0);
		}
		public NamespaceDefinitionContext namespaceDefinition() {
			return getRuleContext(NamespaceDefinitionContext.class,0);
		}
		public EmptyDeclarationContext emptyDeclaration() {
			return getRuleContext(EmptyDeclarationContext.class,0);
		}
		public AttributeDeclarationContext attributeDeclaration() {
			return getRuleContext(AttributeDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_declaration);
		try {
			setState(876);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(870);
				blockDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(871);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(872);
				linkageSpecification();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(873);
				namespaceDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(874);
				emptyDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(875);
				attributeDeclaration();
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
	public static class BlockDeclarationContext extends ParserRuleContext {
		public SimpleDeclarationContext simpleDeclaration() {
			return getRuleContext(SimpleDeclarationContext.class,0);
		}
		public AsmDefinitionContext asmDefinition() {
			return getRuleContext(AsmDefinitionContext.class,0);
		}
		public NamespaceAliasDefinitionContext namespaceAliasDefinition() {
			return getRuleContext(NamespaceAliasDefinitionContext.class,0);
		}
		public UsingDeclarationContext usingDeclaration() {
			return getRuleContext(UsingDeclarationContext.class,0);
		}
		public UsingDirectiveContext usingDirective() {
			return getRuleContext(UsingDirectiveContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public AliasDeclarationContext aliasDeclaration() {
			return getRuleContext(AliasDeclarationContext.class,0);
		}
		public OpaqueEnumDeclarationContext opaqueEnumDeclaration() {
			return getRuleContext(OpaqueEnumDeclarationContext.class,0);
		}
		public BlockDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBlockDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBlockDeclaration(this);
		}
	}

	public final BlockDeclarationContext blockDeclaration() throws RecognitionException {
		BlockDeclarationContext _localctx = new BlockDeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_blockDeclaration);
		try {
			setState(886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(878);
				simpleDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(879);
				asmDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(880);
				namespaceAliasDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(881);
				usingDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(882);
				usingDirective();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(883);
				staticAssertDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(884);
				aliasDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(885);
				opaqueEnumDeclaration();
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
	public static class AliasDeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(gParser.Using, 0); }
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(gParser.Assign, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode Semi() { return getToken(gParser.Semi, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public AliasDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAliasDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAliasDeclaration(this);
		}
	}

	public final AliasDeclarationContext aliasDeclaration() throws RecognitionException {
		AliasDeclarationContext _localctx = new AliasDeclarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_aliasDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(Using);
			setState(889);
			match(Identifier);
			setState(891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Alignas) {
				{
				setState(890);
				attributeSpecifierSeq();
				}
			}

			setState(893);
			match(Assign);
			setState(894);
			theTypeId();
			setState(895);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleDeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(gParser.Semi, 0); }
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public SimpleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSimpleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSimpleDeclaration(this);
		}
	}

	public final SimpleDeclarationContext simpleDeclaration() throws RecognitionException {
		SimpleDeclarationContext _localctx = new SimpleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_simpleDeclaration);
		int _la;
		try {
			setState(911);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bool:
			case Float:
			case Matrix:
			case Int:
			case Void:
			case LeftParen:
			case Star:
			case And:
			case Tilde:
			case AndAnd:
			case Semi:
			case Ellipsis:
			case Identifier:
			case Doublecolon:
			case Mutable:
			case Friend:
			case Typedef:
			case Constexpr:
			case Register:
			case Static:
			case Thread_local:
			case Extern:
			case Inline:
			case Virtual:
			case Explicit:
			case Short:
			case Long:
			case Unsigned:
			case Signed:
			case Char:
			case Char16:
			case Char32:
			case Wchar:
			case Double:
			case Auto:
			case Decltype:
			case Enum:
			case Const:
			case Volatile:
			case Operator:
				enterOuterAlt(_localctx, 1);
				{
				setState(898);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(897);
					declSpecifierSeq();
					}
					break;
				}
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 72057804508102656L) != 0 || (((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 577023702256844931L) != 0) {
					{
					setState(900);
					initDeclaratorList();
					}
				}

				setState(903);
				match(Semi);
				}
				break;
			case LeftBracket:
			case Alignas:
				enterOuterAlt(_localctx, 2);
				{
				setState(904);
				attributeSpecifierSeq();
				setState(906);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(905);
					declSpecifierSeq();
					}
					break;
				}
				setState(908);
				initDeclaratorList();
				setState(909);
				match(Semi);
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
	public static class StaticAssertDeclarationContext extends ParserRuleContext {
		public TerminalNode Static_assert() { return getToken(gParser.Static_assert, 0); }
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(gParser.Comma, 0); }
		public TerminalNode StringLiteral() { return getToken(gParser.StringLiteral, 0); }
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(gParser.Semi, 0); }
		public StaticAssertDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticAssertDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterStaticAssertDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitStaticAssertDeclaration(this);
		}
	}

	public final StaticAssertDeclarationContext staticAssertDeclaration() throws RecognitionException {
		StaticAssertDeclarationContext _localctx = new StaticAssertDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_staticAssertDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			match(Static_assert);
			setState(914);
			match(LeftParen);
			setState(915);
			constantExpression();
			setState(916);
			match(Comma);
			setState(917);
			match(StringLiteral);
			setState(918);
			match(RightParen);
			setState(919);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyDeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(gParser.Semi, 0); }
		public EmptyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterEmptyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitEmptyDeclaration(this);
		}
	}

	public final EmptyDeclarationContext emptyDeclaration() throws RecognitionException {
		EmptyDeclarationContext _localctx = new EmptyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_emptyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeDeclarationContext extends ParserRuleContext {
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode Semi() { return getToken(gParser.Semi, 0); }
		public AttributeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAttributeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAttributeDeclaration(this);
		}
	}

	public final AttributeDeclarationContext attributeDeclaration() throws RecognitionException {
		AttributeDeclarationContext _localctx = new AttributeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_attributeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			attributeSpecifierSeq();
			setState(924);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public FunctionSpecifierContext functionSpecifier() {
			return getRuleContext(FunctionSpecifierContext.class,0);
		}
		public TerminalNode Friend() { return getToken(gParser.Friend, 0); }
		public TerminalNode Typedef() { return getToken(gParser.Typedef, 0); }
		public TerminalNode Constexpr() { return getToken(gParser.Constexpr, 0); }
		public DeclSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclSpecifier(this);
		}
	}

	public final DeclSpecifierContext declSpecifier() throws RecognitionException {
		DeclSpecifierContext _localctx = new DeclSpecifierContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_declSpecifier);
		try {
			setState(932);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Mutable:
			case Register:
			case Static:
			case Thread_local:
			case Extern:
				enterOuterAlt(_localctx, 1);
				{
				setState(926);
				storageClassSpecifier();
				}
				break;
			case Bool:
			case Float:
			case Matrix:
			case Int:
			case Void:
			case Identifier:
			case Doublecolon:
			case Short:
			case Long:
			case Unsigned:
			case Signed:
			case Char:
			case Char16:
			case Char32:
			case Wchar:
			case Double:
			case Auto:
			case Decltype:
			case Enum:
			case Const:
			case Volatile:
				enterOuterAlt(_localctx, 2);
				{
				setState(927);
				typeSpecifier();
				}
				break;
			case Inline:
			case Virtual:
			case Explicit:
				enterOuterAlt(_localctx, 3);
				{
				setState(928);
				functionSpecifier();
				}
				break;
			case Friend:
				enterOuterAlt(_localctx, 4);
				{
				setState(929);
				match(Friend);
				}
				break;
			case Typedef:
				enterOuterAlt(_localctx, 5);
				{
				setState(930);
				match(Typedef);
				}
				break;
			case Constexpr:
				enterOuterAlt(_localctx, 6);
				{
				setState(931);
				match(Constexpr);
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
	public static class DeclSpecifierSeqContext extends ParserRuleContext {
		public List<DeclSpecifierContext> declSpecifier() {
			return getRuleContexts(DeclSpecifierContext.class);
		}
		public DeclSpecifierContext declSpecifier(int i) {
			return getRuleContext(DeclSpecifierContext.class,i);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public DeclSpecifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declSpecifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclSpecifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclSpecifierSeq(this);
		}
	}

	public final DeclSpecifierSeqContext declSpecifierSeq() throws RecognitionException {
		DeclSpecifierSeqContext _localctx = new DeclSpecifierSeqContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_declSpecifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(935); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(934);
					declSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(937); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(940);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(939);
				attributeSpecifierSeq();
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
	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public TerminalNode Register() { return getToken(gParser.Register, 0); }
		public TerminalNode Static() { return getToken(gParser.Static, 0); }
		public TerminalNode Thread_local() { return getToken(gParser.Thread_local, 0); }
		public TerminalNode Extern() { return getToken(gParser.Extern, 0); }
		public TerminalNode Mutable() { return getToken(gParser.Mutable, 0); }
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterStorageClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitStorageClassSpecifier(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			_la = _input.LA(1);
			if ( !((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 125829121L) != 0) ) {
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
	public static class FunctionSpecifierContext extends ParserRuleContext {
		public TerminalNode Inline() { return getToken(gParser.Inline, 0); }
		public TerminalNode Virtual() { return getToken(gParser.Virtual, 0); }
		public TerminalNode Explicit() { return getToken(gParser.Explicit, 0); }
		public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunctionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunctionSpecifier(this);
		}
	}

	public final FunctionSpecifierContext functionSpecifier() throws RecognitionException {
		FunctionSpecifierContext _localctx = new FunctionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_functionSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			_la = _input.LA(1);
			if ( !((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 7L) != 0) ) {
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
	public static class TypedefNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTypedefName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTypedefName(this);
		}
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSpecifierContext extends ParserRuleContext {
		public TrailingTypeSpecifierContext trailingTypeSpecifier() {
			return getRuleContext(TrailingTypeSpecifierContext.class,0);
		}
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTypeSpecifier(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_typeSpecifier);
		try {
			setState(950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(948);
				trailingTypeSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(949);
				enumSpecifier();
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
	public static class TrailingTypeSpecifierContext extends ParserRuleContext {
		public SimpleTypeSpecifierContext simpleTypeSpecifier() {
			return getRuleContext(SimpleTypeSpecifierContext.class,0);
		}
		public ElaboratedTypeSpecifierContext elaboratedTypeSpecifier() {
			return getRuleContext(ElaboratedTypeSpecifierContext.class,0);
		}
		public CvQualifierContext cvQualifier() {
			return getRuleContext(CvQualifierContext.class,0);
		}
		public TrailingTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTrailingTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTrailingTypeSpecifier(this);
		}
	}

	public final TrailingTypeSpecifierContext trailingTypeSpecifier() throws RecognitionException {
		TrailingTypeSpecifierContext _localctx = new TrailingTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_trailingTypeSpecifier);
		try {
			setState(955);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bool:
			case Float:
			case Matrix:
			case Int:
			case Void:
			case Identifier:
			case Doublecolon:
			case Short:
			case Long:
			case Unsigned:
			case Signed:
			case Char:
			case Char16:
			case Char32:
			case Wchar:
			case Double:
			case Auto:
			case Decltype:
				enterOuterAlt(_localctx, 1);
				{
				setState(952);
				simpleTypeSpecifier();
				}
				break;
			case Enum:
				enterOuterAlt(_localctx, 2);
				{
				setState(953);
				elaboratedTypeSpecifier();
				}
				break;
			case Const:
			case Volatile:
				enterOuterAlt(_localctx, 3);
				{
				setState(954);
				cvQualifier();
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
	public static class TypeSpecifierSeqContext extends ParserRuleContext {
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TypeSpecifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTypeSpecifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTypeSpecifierSeq(this);
		}
	}

	public final TypeSpecifierSeqContext typeSpecifierSeq() throws RecognitionException {
		TypeSpecifierSeqContext _localctx = new TypeSpecifierSeqContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_typeSpecifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(958); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(957);
					typeSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(960); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(963);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(962);
				attributeSpecifierSeq();
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
	public static class TrailingTypeSpecifierSeqContext extends ParserRuleContext {
		public List<TrailingTypeSpecifierContext> trailingTypeSpecifier() {
			return getRuleContexts(TrailingTypeSpecifierContext.class);
		}
		public TrailingTypeSpecifierContext trailingTypeSpecifier(int i) {
			return getRuleContext(TrailingTypeSpecifierContext.class,i);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TrailingTypeSpecifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingTypeSpecifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTrailingTypeSpecifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTrailingTypeSpecifierSeq(this);
		}
	}

	public final TrailingTypeSpecifierSeqContext trailingTypeSpecifierSeq() throws RecognitionException {
		TrailingTypeSpecifierSeqContext _localctx = new TrailingTypeSpecifierSeqContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_trailingTypeSpecifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(966); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(965);
					trailingTypeSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(968); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(970);
				attributeSpecifierSeq();
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
	public static class SimpleTypeLengthModifierContext extends ParserRuleContext {
		public TerminalNode Short() { return getToken(gParser.Short, 0); }
		public TerminalNode Long() { return getToken(gParser.Long, 0); }
		public SimpleTypeLengthModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeLengthModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSimpleTypeLengthModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSimpleTypeLengthModifier(this);
		}
	}

	public final SimpleTypeLengthModifierContext simpleTypeLengthModifier() throws RecognitionException {
		SimpleTypeLengthModifierContext _localctx = new SimpleTypeLengthModifierContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_simpleTypeLengthModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			_la = _input.LA(1);
			if ( !(_la==Short || _la==Long) ) {
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
	public static class SimpleTypeSignednessModifierContext extends ParserRuleContext {
		public TerminalNode Unsigned() { return getToken(gParser.Unsigned, 0); }
		public TerminalNode Signed() { return getToken(gParser.Signed, 0); }
		public SimpleTypeSignednessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeSignednessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSimpleTypeSignednessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSimpleTypeSignednessModifier(this);
		}
	}

	public final SimpleTypeSignednessModifierContext simpleTypeSignednessModifier() throws RecognitionException {
		SimpleTypeSignednessModifierContext _localctx = new SimpleTypeSignednessModifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_simpleTypeSignednessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			_la = _input.LA(1);
			if ( !(_la==Unsigned || _la==Signed) ) {
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
	public static class SimpleTypeSpecifierContext extends ParserRuleContext {
		public TheTypeNameContext theTypeName() {
			return getRuleContext(TheTypeNameContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public SimpleTypeSignednessModifierContext simpleTypeSignednessModifier() {
			return getRuleContext(SimpleTypeSignednessModifierContext.class,0);
		}
		public List<SimpleTypeLengthModifierContext> simpleTypeLengthModifier() {
			return getRuleContexts(SimpleTypeLengthModifierContext.class);
		}
		public SimpleTypeLengthModifierContext simpleTypeLengthModifier(int i) {
			return getRuleContext(SimpleTypeLengthModifierContext.class,i);
		}
		public TerminalNode Char() { return getToken(gParser.Char, 0); }
		public TerminalNode Char16() { return getToken(gParser.Char16, 0); }
		public TerminalNode Char32() { return getToken(gParser.Char32, 0); }
		public TerminalNode Wchar() { return getToken(gParser.Wchar, 0); }
		public TerminalNode Matrix() { return getToken(gParser.Matrix, 0); }
		public TerminalNode Bool() { return getToken(gParser.Bool, 0); }
		public TerminalNode Int() { return getToken(gParser.Int, 0); }
		public TerminalNode Float() { return getToken(gParser.Float, 0); }
		public TerminalNode Double() { return getToken(gParser.Double, 0); }
		public TerminalNode Void() { return getToken(gParser.Void, 0); }
		public TerminalNode Auto() { return getToken(gParser.Auto, 0); }
		public DecltypeSpecifierContext decltypeSpecifier() {
			return getRuleContext(DecltypeSpecifierContext.class,0);
		}
		public SimpleTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSimpleTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSimpleTypeSpecifier(this);
		}
	}

	public final SimpleTypeSpecifierContext simpleTypeSpecifier() throws RecognitionException {
		SimpleTypeSpecifierContext _localctx = new SimpleTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_simpleTypeSpecifier);
		int _la;
		try {
			int _alt;
			setState(1026);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(978);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(977);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(980);
				theTypeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(981);
				simpleTypeSignednessModifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Unsigned || _la==Signed) {
					{
					setState(982);
					simpleTypeSignednessModifier();
					}
				}

				setState(986); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(985);
						simpleTypeLengthModifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(988); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(991);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Unsigned || _la==Signed) {
					{
					setState(990);
					simpleTypeSignednessModifier();
					}
				}

				setState(993);
				match(Char);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(995);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Unsigned || _la==Signed) {
					{
					setState(994);
					simpleTypeSignednessModifier();
					}
				}

				setState(997);
				match(Char16);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Unsigned || _la==Signed) {
					{
					setState(998);
					simpleTypeSignednessModifier();
					}
				}

				setState(1001);
				match(Char32);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1003);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Unsigned || _la==Signed) {
					{
					setState(1002);
					simpleTypeSignednessModifier();
					}
				}

				setState(1005);
				match(Wchar);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1006);
				match(Matrix);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1007);
				match(Bool);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Unsigned || _la==Signed) {
					{
					setState(1008);
					simpleTypeSignednessModifier();
					}
				}

				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Short || _la==Long) {
					{
					{
					setState(1011);
					simpleTypeLengthModifier();
					}
					}
					setState(1016);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1017);
				match(Int);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1018);
				match(Float);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Short || _la==Long) {
					{
					setState(1019);
					simpleTypeLengthModifier();
					}
				}

				setState(1022);
				match(Double);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1023);
				match(Void);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1024);
				match(Auto);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1025);
				decltypeSpecifier();
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
	public static class TheTypeNameContext extends ParserRuleContext {
		public EnumNameContext enumName() {
			return getRuleContext(EnumNameContext.class,0);
		}
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public TheTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTheTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTheTypeName(this);
		}
	}

	public final TheTypeNameContext theTypeName() throws RecognitionException {
		TheTypeNameContext _localctx = new TheTypeNameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_theTypeName);
		try {
			setState(1030);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1028);
				enumName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029);
				typedefName();
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
	public static class DecltypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Decltype() { return getToken(gParser.Decltype, 0); }
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Auto() { return getToken(gParser.Auto, 0); }
		public DecltypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decltypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDecltypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDecltypeSpecifier(this);
		}
	}

	public final DecltypeSpecifierContext decltypeSpecifier() throws RecognitionException {
		DecltypeSpecifierContext _localctx = new DecltypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_decltypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			match(Decltype);
			setState(1033);
			match(LeftParen);
			setState(1036);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1034);
				expression();
				}
				break;
			case 2:
				{
				setState(1035);
				match(Auto);
				}
				break;
			}
			setState(1038);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElaboratedTypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(gParser.Enum, 0); }
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public ElaboratedTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elaboratedTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterElaboratedTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitElaboratedTypeSpecifier(this);
		}
	}

	public final ElaboratedTypeSpecifierContext elaboratedTypeSpecifier() throws RecognitionException {
		ElaboratedTypeSpecifierContext _localctx = new ElaboratedTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_elaboratedTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			match(Enum);
			setState(1042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1041);
				nestedNameSpecifier(0);
				}
				break;
			}
			setState(1044);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public EnumNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterEnumName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitEnumName(this);
		}
	}

	public final EnumNameContext enumName() throws RecognitionException {
		EnumNameContext _localctx = new EnumNameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_enumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumSpecifierContext extends ParserRuleContext {
		public EnumHeadContext enumHead() {
			return getRuleContext(EnumHeadContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(gParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(gParser.RightBrace, 0); }
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(gParser.Comma, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterEnumSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitEnumSpecifier(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_enumSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			enumHead();
			setState(1049);
			match(LeftBrace);
			setState(1054);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1050);
				enumeratorList();
				setState(1052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1051);
					match(Comma);
					}
				}

				}
			}

			setState(1056);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumHeadContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public EnumHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterEnumHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitEnumHead(this);
		}
	}

	public final EnumHeadContext enumHead() throws RecognitionException {
		EnumHeadContext _localctx = new EnumHeadContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_enumHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			enumkey();
			setState(1060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Alignas) {
				{
				setState(1059);
				attributeSpecifierSeq();
				}
			}

			setState(1066);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 281474976710721L) != 0) {
				{
				setState(1063);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1062);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(1065);
				match(Identifier);
				}
			}

			setState(1069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1068);
				enumbase();
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
	public static class OpaqueEnumDeclarationContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public TerminalNode Semi() { return getToken(gParser.Semi, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public OpaqueEnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opaqueEnumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterOpaqueEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitOpaqueEnumDeclaration(this);
		}
	}

	public final OpaqueEnumDeclarationContext opaqueEnumDeclaration() throws RecognitionException {
		OpaqueEnumDeclarationContext _localctx = new OpaqueEnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_opaqueEnumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			enumkey();
			setState(1073);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Alignas) {
				{
				setState(1072);
				attributeSpecifierSeq();
				}
			}

			setState(1075);
			match(Identifier);
			setState(1077);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1076);
				enumbase();
				}
			}

			setState(1079);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumkeyContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(gParser.Enum, 0); }
		public TerminalNode Class() { return getToken(gParser.Class, 0); }
		public TerminalNode Struct() { return getToken(gParser.Struct, 0); }
		public EnumkeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumkey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterEnumkey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitEnumkey(this);
		}
	}

	public final EnumkeyContext enumkey() throws RecognitionException {
		EnumkeyContext _localctx = new EnumkeyContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_enumkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			match(Enum);
			setState(1083);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Class || _la==Struct) {
				{
				setState(1082);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==Struct) ) {
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
		}
		catch (RecognitionException re) {
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
	public static class EnumbaseContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(gParser.Colon, 0); }
		public TypeSpecifierSeqContext typeSpecifierSeq() {
			return getRuleContext(TypeSpecifierSeqContext.class,0);
		}
		public EnumbaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumbase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterEnumbase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitEnumbase(this);
		}
	}

	public final EnumbaseContext enumbase() throws RecognitionException {
		EnumbaseContext _localctx = new EnumbaseContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_enumbase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			match(Colon);
			setState(1086);
			typeSpecifierSeq();
			}
		}
		catch (RecognitionException re) {
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
	public static class EnumeratorListContext extends ParserRuleContext {
		public List<EnumeratorDefinitionContext> enumeratorDefinition() {
			return getRuleContexts(EnumeratorDefinitionContext.class);
		}
		public EnumeratorDefinitionContext enumeratorDefinition(int i) {
			return getRuleContext(EnumeratorDefinitionContext.class,i);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterEnumeratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitEnumeratorList(this);
		}
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_enumeratorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			enumeratorDefinition();
			setState(1093);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1089);
					match(Comma);
					setState(1090);
					enumeratorDefinition();
					}
					} 
				}
				setState(1095);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
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
	public static class EnumeratorDefinitionContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(gParser.Assign, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumeratorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterEnumeratorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitEnumeratorDefinition(this);
		}
	}

	public final EnumeratorDefinitionContext enumeratorDefinition() throws RecognitionException {
		EnumeratorDefinitionContext _localctx = new EnumeratorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_enumeratorDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1096);
			enumerator();
			setState(1099);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1097);
				match(Assign);
				setState(1098);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumeratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitEnumerator(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceNameContext extends ParserRuleContext {
		public OriginalNamespaceNameContext originalNamespaceName() {
			return getRuleContext(OriginalNamespaceNameContext.class,0);
		}
		public NamespaceAliasContext namespaceAlias() {
			return getRuleContext(NamespaceAliasContext.class,0);
		}
		public NamespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNamespaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNamespaceName(this);
		}
	}

	public final NamespaceNameContext namespaceName() throws RecognitionException {
		NamespaceNameContext _localctx = new NamespaceNameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_namespaceName);
		try {
			setState(1105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1103);
				originalNamespaceName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1104);
				namespaceAlias();
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
	public static class OriginalNamespaceNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public OriginalNamespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalNamespaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterOriginalNamespaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitOriginalNamespaceName(this);
		}
	}

	public final OriginalNamespaceNameContext originalNamespaceName() throws RecognitionException {
		OriginalNamespaceNameContext _localctx = new OriginalNamespaceNameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_originalNamespaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceDefinitionContext extends ParserRuleContext {
		public DeclarationseqContext namespaceBody;
		public TerminalNode Namespace() { return getToken(gParser.Namespace, 0); }
		public TerminalNode LeftBrace() { return getToken(gParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(gParser.RightBrace, 0); }
		public TerminalNode Inline() { return getToken(gParser.Inline, 0); }
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public OriginalNamespaceNameContext originalNamespaceName() {
			return getRuleContext(OriginalNamespaceNameContext.class,0);
		}
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public NamespaceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNamespaceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNamespaceDefinition(this);
		}
	}

	public final NamespaceDefinitionContext namespaceDefinition() throws RecognitionException {
		NamespaceDefinitionContext _localctx = new NamespaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_namespaceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1109);
				match(Inline);
				}
			}

			setState(1112);
			match(Namespace);
			setState(1115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1113);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(1114);
				originalNamespaceName();
				}
				break;
			}
			setState(1117);
			match(LeftBrace);
			setState(1119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 72057804581045248L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 9025213652176737305L) != 0) {
				{
				setState(1118);
				((NamespaceDefinitionContext)_localctx).namespaceBody = declarationseq();
				}
			}

			setState(1121);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceAliasContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public NamespaceAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNamespaceAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNamespaceAlias(this);
		}
	}

	public final NamespaceAliasContext namespaceAlias() throws RecognitionException {
		NamespaceAliasContext _localctx = new NamespaceAliasContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_namespaceAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceAliasDefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(gParser.Namespace, 0); }
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(gParser.Assign, 0); }
		public QualifiednamespacespecifierContext qualifiednamespacespecifier() {
			return getRuleContext(QualifiednamespacespecifierContext.class,0);
		}
		public TerminalNode Semi() { return getToken(gParser.Semi, 0); }
		public NamespaceAliasDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceAliasDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNamespaceAliasDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNamespaceAliasDefinition(this);
		}
	}

	public final NamespaceAliasDefinitionContext namespaceAliasDefinition() throws RecognitionException {
		NamespaceAliasDefinitionContext _localctx = new NamespaceAliasDefinitionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_namespaceAliasDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
			match(Namespace);
			setState(1126);
			match(Identifier);
			setState(1127);
			match(Assign);
			setState(1128);
			qualifiednamespacespecifier();
			setState(1129);
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

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiednamespacespecifierContext extends ParserRuleContext {
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public QualifiednamespacespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiednamespacespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterQualifiednamespacespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitQualifiednamespacespecifier(this);
		}
	}

	public final QualifiednamespacespecifierContext qualifiednamespacespecifier() throws RecognitionException {
		QualifiednamespacespecifierContext _localctx = new QualifiednamespacespecifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_qualifiednamespacespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1131);
				nestedNameSpecifier(0);
				}
				break;
			}
			setState(1134);
			namespaceName();
			}
		}
		catch (RecognitionException re) {
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
	public static class UsingDeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(gParser.Using, 0); }
		public UnqualifiedIdContext unqualifiedId() {
			return getRuleContext(UnqualifiedIdContext.class,0);
		}
		public TerminalNode Semi() { return getToken(gParser.Semi, 0); }
		public TerminalNode Doublecolon() { return getToken(gParser.Doublecolon, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Typename_() { return getToken(gParser.Typename_, 0); }
		public UsingDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterUsingDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitUsingDeclaration(this);
		}
	}

	public final UsingDeclarationContext usingDeclaration() throws RecognitionException {
		UsingDeclarationContext _localctx = new UsingDeclarationContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_usingDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136);
			match(Using);
			setState(1142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				{
				setState(1138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Typename_) {
					{
					setState(1137);
					match(Typename_);
					}
				}

				setState(1140);
				nestedNameSpecifier(0);
				}
				}
				break;
			case 2:
				{
				setState(1141);
				match(Doublecolon);
				}
				break;
			}
			setState(1144);
			unqualifiedId();
			setState(1145);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UsingDirectiveContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(gParser.Using, 0); }
		public TerminalNode Namespace() { return getToken(gParser.Namespace, 0); }
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public TerminalNode Semi() { return getToken(gParser.Semi, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public UsingDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterUsingDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitUsingDirective(this);
		}
	}

	public final UsingDirectiveContext usingDirective() throws RecognitionException {
		UsingDirectiveContext _localctx = new UsingDirectiveContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_usingDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Alignas) {
				{
				setState(1147);
				attributeSpecifierSeq();
				}
			}

			setState(1150);
			match(Using);
			setState(1151);
			match(Namespace);
			setState(1153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1152);
				nestedNameSpecifier(0);
				}
				break;
			}
			setState(1155);
			namespaceName();
			setState(1156);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsmDefinitionContext extends ParserRuleContext {
		public TerminalNode Asm() { return getToken(gParser.Asm, 0); }
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public TerminalNode StringLiteral() { return getToken(gParser.StringLiteral, 0); }
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(gParser.Semi, 0); }
		public AsmDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAsmDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAsmDefinition(this);
		}
	}

	public final AsmDefinitionContext asmDefinition() throws RecognitionException {
		AsmDefinitionContext _localctx = new AsmDefinitionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_asmDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1158);
			match(Asm);
			setState(1159);
			match(LeftParen);
			setState(1160);
			match(StringLiteral);
			setState(1161);
			match(RightParen);
			setState(1162);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LinkageSpecificationContext extends ParserRuleContext {
		public TerminalNode Extern() { return getToken(gParser.Extern, 0); }
		public TerminalNode StringLiteral() { return getToken(gParser.StringLiteral, 0); }
		public TerminalNode LeftBrace() { return getToken(gParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(gParser.RightBrace, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public LinkageSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkageSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLinkageSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLinkageSpecification(this);
		}
	}

	public final LinkageSpecificationContext linkageSpecification() throws RecognitionException {
		LinkageSpecificationContext _localctx = new LinkageSpecificationContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_linkageSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
			match(Extern);
			setState(1165);
			match(StringLiteral);
			setState(1172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
				{
				setState(1166);
				match(LeftBrace);
				setState(1168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 72057804581045248L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 9025213652176737305L) != 0) {
					{
					setState(1167);
					declarationseq();
					}
				}

				setState(1170);
				match(RightBrace);
				}
				break;
			case Bool:
			case Float:
			case Matrix:
			case Int:
			case Void:
			case LeftParen:
			case LeftBracket:
			case Star:
			case And:
			case Tilde:
			case AndAnd:
			case Semi:
			case Ellipsis:
			case Identifier:
			case Doublecolon:
			case Mutable:
			case Using:
			case Static_assert:
			case Friend:
			case Typedef:
			case Constexpr:
			case Register:
			case Static:
			case Thread_local:
			case Extern:
			case Inline:
			case Virtual:
			case Explicit:
			case Short:
			case Long:
			case Unsigned:
			case Signed:
			case Char:
			case Char16:
			case Char32:
			case Wchar:
			case Double:
			case Auto:
			case Decltype:
			case Enum:
			case Namespace:
			case Asm:
			case Alignas:
			case Const:
			case Volatile:
			case Operator:
				{
				setState(1171);
				declaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeSpecifierSeqContext extends ParserRuleContext {
		public List<AttributeSpecifierContext> attributeSpecifier() {
			return getRuleContexts(AttributeSpecifierContext.class);
		}
		public AttributeSpecifierContext attributeSpecifier(int i) {
			return getRuleContext(AttributeSpecifierContext.class,i);
		}
		public AttributeSpecifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSpecifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAttributeSpecifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAttributeSpecifierSeq(this);
		}
	}

	public final AttributeSpecifierSeqContext attributeSpecifierSeq() throws RecognitionException {
		AttributeSpecifierSeqContext _localctx = new AttributeSpecifierSeqContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_attributeSpecifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1175); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1174);
					attributeSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1177); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
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
	public static class AttributeSpecifierContext extends ParserRuleContext {
		public List<TerminalNode> LeftBracket() { return getTokens(gParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(gParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(gParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(gParser.RightBracket, i);
		}
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public AlignmentspecifierContext alignmentspecifier() {
			return getRuleContext(AlignmentspecifierContext.class,0);
		}
		public AttributeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAttributeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAttributeSpecifier(this);
		}
	}

	public final AttributeSpecifierContext attributeSpecifier() throws RecognitionException {
		AttributeSpecifierContext _localctx = new AttributeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_attributeSpecifier);
		int _la;
		try {
			setState(1187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1179);
				match(LeftBracket);
				setState(1180);
				match(LeftBracket);
				setState(1182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1181);
					attributeList();
					}
				}

				setState(1184);
				match(RightBracket);
				setState(1185);
				match(RightBracket);
				}
				break;
			case Alignas:
				enterOuterAlt(_localctx, 2);
				{
				setState(1186);
				alignmentspecifier();
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
	public static class AlignmentspecifierContext extends ParserRuleContext {
		public TerminalNode Alignas() { return getToken(gParser.Alignas, 0); }
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(gParser.Ellipsis, 0); }
		public AlignmentspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAlignmentspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAlignmentspecifier(this);
		}
	}

	public final AlignmentspecifierContext alignmentspecifier() throws RecognitionException {
		AlignmentspecifierContext _localctx = new AlignmentspecifierContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_alignmentspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189);
			match(Alignas);
			setState(1190);
			match(LeftParen);
			setState(1193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1191);
				theTypeId();
				}
				break;
			case 2:
				{
				setState(1192);
				constantExpression();
				}
				break;
			}
			setState(1196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1195);
				match(Ellipsis);
				}
			}

			setState(1198);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeListContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(gParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(gParser.Comma, i);
		}
		public TerminalNode Ellipsis() { return getToken(gParser.Ellipsis, 0); }
		public AttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAttributeList(this);
		}
	}

	public final AttributeListContext attributeList() throws RecognitionException {
		AttributeListContext _localctx = new AttributeListContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_attributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			attribute();
			setState(1205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1201);
				match(Comma);
				setState(1202);
				attribute();
				}
				}
				setState(1207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1208);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public AttributeNamespaceContext attributeNamespace() {
			return getRuleContext(AttributeNamespaceContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(gParser.Doublecolon, 0); }
		public AttributeArgumentClauseContext attributeArgumentClause() {
			return getRuleContext(AttributeArgumentClauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1211);
				attributeNamespace();
				setState(1212);
				match(Doublecolon);
				}
				break;
			}
			setState(1216);
			match(Identifier);
			setState(1218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(1217);
				attributeArgumentClause();
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
	public static class AttributeNamespaceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public AttributeNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeNamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAttributeNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAttributeNamespace(this);
		}
	}

	public final AttributeNamespaceContext attributeNamespace() throws RecognitionException {
		AttributeNamespaceContext _localctx = new AttributeNamespaceContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_attributeNamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeArgumentClauseContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public BalancedTokenSeqContext balancedTokenSeq() {
			return getRuleContext(BalancedTokenSeqContext.class,0);
		}
		public AttributeArgumentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeArgumentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAttributeArgumentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAttributeArgumentClause(this);
		}
	}

	public final AttributeArgumentClauseContext attributeArgumentClause() throws RecognitionException {
		AttributeArgumentClauseContext _localctx = new AttributeArgumentClauseContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_attributeArgumentClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			match(LeftParen);
			setState(1224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -704643074L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0 || (((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 63L) != 0) {
				{
				setState(1223);
				balancedTokenSeq();
				}
			}

			setState(1226);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BalancedTokenSeqContext extends ParserRuleContext {
		public List<BalancedtokenContext> balancedtoken() {
			return getRuleContexts(BalancedtokenContext.class);
		}
		public BalancedtokenContext balancedtoken(int i) {
			return getRuleContext(BalancedtokenContext.class,i);
		}
		public BalancedTokenSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedTokenSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBalancedTokenSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBalancedTokenSeq(this);
		}
	}

	public final BalancedTokenSeqContext balancedTokenSeq() throws RecognitionException {
		BalancedTokenSeqContext _localctx = new BalancedTokenSeqContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_balancedTokenSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1228);
				balancedtoken();
				}
				}
				setState(1231); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & -704643074L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0 || (((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 63L) != 0 );
			}
		}
		catch (RecognitionException re) {
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
	public static class BalancedtokenContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() { return getTokens(gParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(gParser.LeftParen, i);
		}
		public BalancedTokenSeqContext balancedTokenSeq() {
			return getRuleContext(BalancedTokenSeqContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(gParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(gParser.RightParen, i);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(gParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(gParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(gParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(gParser.RightBracket, i);
		}
		public List<TerminalNode> LeftBrace() { return getTokens(gParser.LeftBrace); }
		public TerminalNode LeftBrace(int i) {
			return getToken(gParser.LeftBrace, i);
		}
		public List<TerminalNode> RightBrace() { return getTokens(gParser.RightBrace); }
		public TerminalNode RightBrace(int i) {
			return getToken(gParser.RightBrace, i);
		}
		public BalancedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBalancedtoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBalancedtoken(this);
		}
	}

	public final BalancedtokenContext balancedtoken() throws RecognitionException {
		BalancedtokenContext _localctx = new BalancedtokenContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_balancedtoken);
		int _la;
		try {
			int _alt;
			setState(1250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(1233);
				match(LeftParen);
				setState(1234);
				balancedTokenSeq();
				setState(1235);
				match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1237);
				match(LeftBracket);
				setState(1238);
				balancedTokenSeq();
				setState(1239);
				match(RightBracket);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(1241);
				match(LeftBrace);
				setState(1242);
				balancedTokenSeq();
				setState(1243);
				match(RightBrace);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case IntegerLiteral:
			case StringLiteral:
			case BooleanLiteral:
			case Directive:
			case Bool:
			case Break:
			case Continue:
			case Else:
			case False_:
			case True_:
			case Float:
			case For:
			case If:
			case Matrix:
			case Int:
			case Return:
			case Void:
			case While:
			case Plus:
			case Minus:
			case Star:
			case Div:
			case Mod:
			case Caret:
			case And:
			case Tilde:
			case Not:
			case Assign:
			case Less:
			case Greater:
			case PlusAssign:
			case MinusAssign:
			case StarAssign:
			case DivAssign:
			case ModAssign:
			case XorAssign:
			case AndAssign:
			case OrAssign:
			case LeftShiftAssign:
			case RightShiftAssign:
			case Equal:
			case NotEqual:
			case LessEqual:
			case GreaterEqual:
			case AndAnd:
			case OrOr:
			case PlusPlus:
			case MinusMinus:
			case Comma:
			case ArrowStar:
			case Arrow:
			case Question:
			case Colon:
			case Semi:
			case Dot:
			case DotStar:
			case Ellipsis:
			case Identifier:
			case DecimalLiteral:
			case Whitespace:
			case Newline:
			case BlockComment:
			case LineComment:
			case Doublecolon:
			case This:
			case Mutable:
			case Dynamic_cast:
			case Static_cast:
			case Reinterpret_cast:
			case Const_cast:
			case Template:
			case Typeid_:
			case Sizeof:
			case Alignof:
			case Or:
			case New:
			case Delete:
			case Noexcept:
			case Case:
			case Default:
			case Switch:
			case Do:
			case Goto:
			case Using:
			case Static_assert:
			case Friend:
			case Typedef:
			case Constexpr:
			case Register:
			case Static:
			case Thread_local:
			case Extern:
			case Inline:
			case Virtual:
			case Explicit:
			case Short:
			case Long:
			case Unsigned:
			case Signed:
			case Char:
			case Char16:
			case Char32:
			case Wchar:
			case Double:
			case Auto:
			case Decltype:
			case Enum:
			case Class:
			case Struct:
			case Namespace:
			case Typename_:
			case Asm:
			case Alignas:
			case Const:
			case Volatile:
			case Operator:
			case UserDefinedStringLiteral:
			case MatrixLiteral:
			case CharacterLiteral:
			case FloatingLiteral:
			case PointerLiteral:
			case UserDefinedLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(1246); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1245);
						_la = _input.LA(1);
						if ( _la <= 0 || (((_la) & ~0x3f) == 0 && ((1L << _la) & 1056964608L) != 0) ) {
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
					setState(1248); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitInitDeclaratorList(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
			initDeclarator();
			setState(1257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1253);
				match(Comma);
				setState(1254);
				initDeclarator();
				}
				}
				setState(1259);
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
	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitInitDeclarator(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			declarator();
			setState(1262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 550041026560L) != 0) {
				{
				setState(1261);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaratorContext extends ParserRuleContext {
		public PointerDeclaratorContext pointerDeclarator() {
			return getRuleContext(PointerDeclaratorContext.class,0);
		}
		public NoPointerDeclaratorContext noPointerDeclarator() {
			return getRuleContext(NoPointerDeclaratorContext.class,0);
		}
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public TrailingReturnTypeContext trailingReturnType() {
			return getRuleContext(TrailingReturnTypeContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_declarator);
		try {
			setState(1269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1264);
				pointerDeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1265);
				noPointerDeclarator(0);
				setState(1266);
				parametersAndQualifiers();
				setState(1267);
				trailingReturnType();
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
	public static class PointerDeclaratorContext extends ParserRuleContext {
		public NoPointerDeclaratorContext noPointerDeclarator() {
			return getRuleContext(NoPointerDeclaratorContext.class,0);
		}
		public List<PointerOperatorContext> pointerOperator() {
			return getRuleContexts(PointerOperatorContext.class);
		}
		public PointerOperatorContext pointerOperator(int i) {
			return getRuleContext(PointerOperatorContext.class,i);
		}
		public List<TerminalNode> Const() { return getTokens(gParser.Const); }
		public TerminalNode Const(int i) {
			return getToken(gParser.Const, i);
		}
		public PointerDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPointerDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPointerDeclarator(this);
		}
	}

	public final PointerDeclaratorContext pointerDeclarator() throws RecognitionException {
		PointerDeclaratorContext _localctx = new PointerDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_pointerDeclarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1271);
					pointerOperator();
					setState(1273);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Const) {
						{
						setState(1272);
						match(Const);
						}
					}

					}
					} 
				}
				setState(1279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			}
			setState(1280);
			noPointerDeclarator(0);
			}
		}
		catch (RecognitionException re) {
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
	public static class NoPointerDeclaratorContext extends ParserRuleContext {
		public DeclaratoridContext declaratorid() {
			return getRuleContext(DeclaratoridContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public PointerDeclaratorContext pointerDeclarator() {
			return getRuleContext(PointerDeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public NoPointerDeclaratorContext noPointerDeclarator() {
			return getRuleContext(NoPointerDeclaratorContext.class,0);
		}
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(gParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(gParser.RightBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public NoPointerDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noPointerDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNoPointerDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNoPointerDeclarator(this);
		}
	}

	public final NoPointerDeclaratorContext noPointerDeclarator() throws RecognitionException {
		return noPointerDeclarator(0);
	}

	private NoPointerDeclaratorContext noPointerDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoPointerDeclaratorContext _localctx = new NoPointerDeclaratorContext(_ctx, _parentState);
		NoPointerDeclaratorContext _prevctx = _localctx;
		int _startState = 230;
		enterRecursionRule(_localctx, 230, RULE_noPointerDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tilde:
			case Ellipsis:
			case Identifier:
			case Doublecolon:
			case Decltype:
			case Operator:
				{
				setState(1283);
				declaratorid();
				setState(1285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1284);
					attributeSpecifierSeq();
					}
					break;
				}
				}
				break;
			case LeftParen:
				{
				setState(1287);
				match(LeftParen);
				setState(1288);
				pointerDeclarator();
				setState(1289);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoPointerDeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noPointerDeclarator);
					setState(1293);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1303);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LeftParen:
						{
						setState(1294);
						parametersAndQualifiers();
						}
						break;
					case LeftBracket:
						{
						setState(1295);
						match(LeftBracket);
						setState(1297);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -9209861230337629161L) != 0 || (((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 562958745219399545L) != 0) {
							{
							setState(1296);
							constantExpression();
							}
						}

						setState(1299);
						match(RightBracket);
						setState(1301);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
						case 1:
							{
							setState(1300);
							attributeSpecifierSeq();
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersAndQualifiersContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public ParameterDeclarationClauseContext parameterDeclarationClause() {
			return getRuleContext(ParameterDeclarationClauseContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public RefqualifierContext refqualifier() {
			return getRuleContext(RefqualifierContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public ParametersAndQualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersAndQualifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterParametersAndQualifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitParametersAndQualifiers(this);
		}
	}

	public final ParametersAndQualifiersContext parametersAndQualifiers() throws RecognitionException {
		ParametersAndQualifiersContext _localctx = new ParametersAndQualifiersContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_parametersAndQualifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310);
			match(LeftParen);
			setState(1312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 72942592L) != 0 || (((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 253327478771155265L) != 0) {
				{
				setState(1311);
				parameterDeclarationClause();
				}
			}

			setState(1314);
			match(RightParen);
			setState(1316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1315);
				cvqualifierseq();
				}
				break;
			}
			setState(1319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1318);
				refqualifier();
				}
				break;
			}
			setState(1322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1321);
				attributeSpecifierSeq();
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
	public static class TrailingReturnTypeContext extends ParserRuleContext {
		public TerminalNode Arrow() { return getToken(gParser.Arrow, 0); }
		public TrailingTypeSpecifierSeqContext trailingTypeSpecifierSeq() {
			return getRuleContext(TrailingTypeSpecifierSeqContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TrailingReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTrailingReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTrailingReturnType(this);
		}
	}

	public final TrailingReturnTypeContext trailingReturnType() throws RecognitionException {
		TrailingReturnTypeContext _localctx = new TrailingReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_trailingReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			match(Arrow);
			setState(1325);
			trailingTypeSpecifierSeq();
			setState(1327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1326);
				abstractDeclarator();
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
	public static class PointerOperatorContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(gParser.And, 0); }
		public TerminalNode AndAnd() { return getToken(gParser.AndAnd, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode Star() { return getToken(gParser.Star, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public PointerOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPointerOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPointerOperator(this);
		}
	}

	public final PointerOperatorContext pointerOperator() throws RecognitionException {
		PointerOperatorContext _localctx = new PointerOperatorContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_pointerOperator);
		int _la;
		try {
			setState(1343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case And:
			case AndAnd:
				enterOuterAlt(_localctx, 1);
				{
				setState(1329);
				_la = _input.LA(1);
				if ( !(_la==And || _la==AndAnd) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1330);
					attributeSpecifierSeq();
					}
					break;
				}
				}
				break;
			case Star:
			case Identifier:
			case Doublecolon:
			case Decltype:
				enterOuterAlt(_localctx, 2);
				{
				setState(1334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 281474976710721L) != 0) {
					{
					setState(1333);
					nestedNameSpecifier(0);
					}
				}

				setState(1336);
				match(Star);
				setState(1338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1337);
					attributeSpecifierSeq();
					}
					break;
				}
				setState(1341);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1340);
					cvqualifierseq();
					}
					break;
				}
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
	public static class CvqualifierseqContext extends ParserRuleContext {
		public List<CvQualifierContext> cvQualifier() {
			return getRuleContexts(CvQualifierContext.class);
		}
		public CvQualifierContext cvQualifier(int i) {
			return getRuleContext(CvQualifierContext.class,i);
		}
		public CvqualifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCvqualifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCvqualifierseq(this);
		}
	}

	public final CvqualifierseqContext cvqualifierseq() throws RecognitionException {
		CvqualifierseqContext _localctx = new CvqualifierseqContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_cvqualifierseq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1346); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1345);
					cvQualifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1348); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
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
	public static class CvQualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(gParser.Const, 0); }
		public TerminalNode Volatile() { return getToken(gParser.Volatile, 0); }
		public CvQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCvQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCvQualifier(this);
		}
	}

	public final CvQualifierContext cvQualifier() throws RecognitionException {
		CvQualifierContext _localctx = new CvQualifierContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_cvQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			_la = _input.LA(1);
			if ( !(_la==Const || _la==Volatile) ) {
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
	public static class RefqualifierContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(gParser.And, 0); }
		public TerminalNode AndAnd() { return getToken(gParser.AndAnd, 0); }
		public RefqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refqualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterRefqualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitRefqualifier(this);
		}
	}

	public final RefqualifierContext refqualifier() throws RecognitionException {
		RefqualifierContext _localctx = new RefqualifierContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_refqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352);
			_la = _input.LA(1);
			if ( !(_la==And || _la==AndAnd) ) {
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
	public static class DeclaratoridContext extends ParserRuleContext {
		public IdExpressionContext idExpression() {
			return getRuleContext(IdExpressionContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(gParser.Ellipsis, 0); }
		public DeclaratoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratorid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclaratorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclaratorid(this);
		}
	}

	public final DeclaratoridContext declaratorid() throws RecognitionException {
		DeclaratoridContext _localctx = new DeclaratoridContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_declaratorid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1354);
				match(Ellipsis);
				}
			}

			setState(1357);
			idExpression();
			}
		}
		catch (RecognitionException re) {
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
	public static class TheTypeIdContext extends ParserRuleContext {
		public TypeSpecifierSeqContext typeSpecifierSeq() {
			return getRuleContext(TypeSpecifierSeqContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TheTypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theTypeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTheTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTheTypeId(this);
		}
	}

	public final TheTypeIdContext theTypeId() throws RecognitionException {
		TheTypeIdContext _localctx = new TheTypeIdContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_theTypeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			typeSpecifierSeq();
			setState(1361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1360);
				abstractDeclarator();
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
	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public PointerAbstractDeclaratorContext pointerAbstractDeclarator() {
			return getRuleContext(PointerAbstractDeclaratorContext.class,0);
		}
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public TrailingReturnTypeContext trailingReturnType() {
			return getRuleContext(TrailingReturnTypeContext.class,0);
		}
		public NoPointerAbstractDeclaratorContext noPointerAbstractDeclarator() {
			return getRuleContext(NoPointerAbstractDeclaratorContext.class,0);
		}
		public AbstractPackDeclaratorContext abstractPackDeclarator() {
			return getRuleContext(AbstractPackDeclaratorContext.class,0);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAbstractDeclarator(this);
		}
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_abstractDeclarator);
		try {
			setState(1371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1363);
				pointerAbstractDeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1364);
					noPointerAbstractDeclarator(0);
					}
					break;
				}
				setState(1367);
				parametersAndQualifiers();
				setState(1368);
				trailingReturnType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1370);
				abstractPackDeclarator();
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
	public static class PointerAbstractDeclaratorContext extends ParserRuleContext {
		public NoPointerAbstractDeclaratorContext noPointerAbstractDeclarator() {
			return getRuleContext(NoPointerAbstractDeclaratorContext.class,0);
		}
		public List<PointerOperatorContext> pointerOperator() {
			return getRuleContexts(PointerOperatorContext.class);
		}
		public PointerOperatorContext pointerOperator(int i) {
			return getRuleContext(PointerOperatorContext.class,i);
		}
		public PointerAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerAbstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPointerAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPointerAbstractDeclarator(this);
		}
	}

	public final PointerAbstractDeclaratorContext pointerAbstractDeclarator() throws RecognitionException {
		PointerAbstractDeclaratorContext _localctx = new PointerAbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_pointerAbstractDeclarator);
		int _la;
		try {
			setState(1382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1373);
				noPointerAbstractDeclarator(0);
				}
				break;
			case Star:
			case And:
			case AndAnd:
			case Identifier:
			case Doublecolon:
			case Decltype:
				enterOuterAlt(_localctx, 2);
				{
				setState(1375); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1374);
					pointerOperator();
					}
					}
					setState(1377); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 72057667052371968L) != 0 || (((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 281474976710721L) != 0 );
				setState(1380);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1379);
					noPointerAbstractDeclarator(0);
					}
					break;
				}
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
	public static class NoPointerAbstractDeclaratorContext extends ParserRuleContext {
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(gParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(gParser.RightBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public PointerAbstractDeclaratorContext pointerAbstractDeclarator() {
			return getRuleContext(PointerAbstractDeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public List<NoPointerAbstractDeclaratorContext> noPointerAbstractDeclarator() {
			return getRuleContexts(NoPointerAbstractDeclaratorContext.class);
		}
		public NoPointerAbstractDeclaratorContext noPointerAbstractDeclarator(int i) {
			return getRuleContext(NoPointerAbstractDeclaratorContext.class,i);
		}
		public NoPointerAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noPointerAbstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNoPointerAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNoPointerAbstractDeclarator(this);
		}
	}

	public final NoPointerAbstractDeclaratorContext noPointerAbstractDeclarator() throws RecognitionException {
		return noPointerAbstractDeclarator(0);
	}

	private NoPointerAbstractDeclaratorContext noPointerAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoPointerAbstractDeclaratorContext _localctx = new NoPointerAbstractDeclaratorContext(_ctx, _parentState);
		NoPointerAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 252;
		enterRecursionRule(_localctx, 252, RULE_noPointerAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1385);
				parametersAndQualifiers();
				}
				break;
			case 2:
				{
				setState(1386);
				match(LeftBracket);
				setState(1388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -9209861230337629161L) != 0 || (((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 562958745219399545L) != 0) {
					{
					setState(1387);
					constantExpression();
					}
				}

				setState(1390);
				match(RightBracket);
				setState(1392);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1391);
					attributeSpecifierSeq();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1394);
				match(LeftParen);
				setState(1395);
				pointerAbstractDeclarator();
				setState(1396);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoPointerAbstractDeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noPointerAbstractDeclarator);
					setState(1400);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(1411);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
					case 1:
						{
						setState(1401);
						parametersAndQualifiers();
						}
						break;
					case 2:
						{
						setState(1402);
						noPointerAbstractDeclarator(0);
						setState(1403);
						match(LeftBracket);
						setState(1405);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -9209861230337629161L) != 0 || (((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 562958745219399545L) != 0) {
							{
							setState(1404);
							constantExpression();
							}
						}

						setState(1407);
						match(RightBracket);
						setState(1409);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
						case 1:
							{
							setState(1408);
							attributeSpecifierSeq();
							}
							break;
						}
						}
						break;
					}
					}
					} 
				}
				setState(1417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AbstractPackDeclaratorContext extends ParserRuleContext {
		public NoPointerAbstractPackDeclaratorContext noPointerAbstractPackDeclarator() {
			return getRuleContext(NoPointerAbstractPackDeclaratorContext.class,0);
		}
		public List<PointerOperatorContext> pointerOperator() {
			return getRuleContexts(PointerOperatorContext.class);
		}
		public PointerOperatorContext pointerOperator(int i) {
			return getRuleContext(PointerOperatorContext.class,i);
		}
		public AbstractPackDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractPackDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAbstractPackDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAbstractPackDeclarator(this);
		}
	}

	public final AbstractPackDeclaratorContext abstractPackDeclarator() throws RecognitionException {
		AbstractPackDeclaratorContext _localctx = new AbstractPackDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_abstractPackDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 72057667052371968L) != 0 || (((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 281474976710721L) != 0) {
				{
				{
				setState(1418);
				pointerOperator();
				}
				}
				setState(1423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1424);
			noPointerAbstractPackDeclarator(0);
			}
		}
		catch (RecognitionException re) {
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
	public static class NoPointerAbstractPackDeclaratorContext extends ParserRuleContext {
		public TerminalNode Ellipsis() { return getToken(gParser.Ellipsis, 0); }
		public NoPointerAbstractPackDeclaratorContext noPointerAbstractPackDeclarator() {
			return getRuleContext(NoPointerAbstractPackDeclaratorContext.class,0);
		}
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(gParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(gParser.RightBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public NoPointerAbstractPackDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noPointerAbstractPackDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNoPointerAbstractPackDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNoPointerAbstractPackDeclarator(this);
		}
	}

	public final NoPointerAbstractPackDeclaratorContext noPointerAbstractPackDeclarator() throws RecognitionException {
		return noPointerAbstractPackDeclarator(0);
	}

	private NoPointerAbstractPackDeclaratorContext noPointerAbstractPackDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoPointerAbstractPackDeclaratorContext _localctx = new NoPointerAbstractPackDeclaratorContext(_ctx, _parentState);
		NoPointerAbstractPackDeclaratorContext _prevctx = _localctx;
		int _startState = 256;
		enterRecursionRule(_localctx, 256, RULE_noPointerAbstractPackDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1427);
			match(Ellipsis);
			}
			_ctx.stop = _input.LT(-1);
			setState(1443);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoPointerAbstractPackDeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noPointerAbstractPackDeclarator);
					setState(1429);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1439);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LeftParen:
						{
						setState(1430);
						parametersAndQualifiers();
						}
						break;
					case LeftBracket:
						{
						setState(1431);
						match(LeftBracket);
						setState(1433);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -9209861230337629161L) != 0 || (((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 562958745219399545L) != 0) {
							{
							setState(1432);
							constantExpression();
							}
						}

						setState(1435);
						match(RightBracket);
						setState(1437);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
						case 1:
							{
							setState(1436);
							attributeSpecifierSeq();
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1445);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterDeclarationClauseContext extends ParserRuleContext {
		public ParameterDeclarationListContext parameterDeclarationList() {
			return getRuleContext(ParameterDeclarationListContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(gParser.Ellipsis, 0); }
		public TerminalNode Comma() { return getToken(gParser.Comma, 0); }
		public ParameterDeclarationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclarationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterParameterDeclarationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitParameterDeclarationClause(this);
		}
	}

	public final ParameterDeclarationClauseContext parameterDeclarationClause() throws RecognitionException {
		ParameterDeclarationClauseContext _localctx = new ParameterDeclarationClauseContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_parameterDeclarationClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1446);
			parameterDeclarationList();
			setState(1451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma || _la==Ellipsis) {
				{
				setState(1448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1447);
					match(Comma);
					}
				}

				setState(1450);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterDeclarationListContext extends ParserRuleContext {
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
		public ParameterDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterParameterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitParameterDeclarationList(this);
		}
	}

	public final ParameterDeclarationListContext parameterDeclarationList() throws RecognitionException {
		ParameterDeclarationListContext _localctx = new ParameterDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_parameterDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1453);
			parameterDeclaration();
			setState(1458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1454);
					match(Comma);
					setState(1455);
					parameterDeclaration();
					}
					} 
				}
				setState(1460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
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
	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(gParser.Assign, 0); }
		public InitializerClauseContext initializerClause() {
			return getRuleContext(InitializerClauseContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitParameterDeclaration(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Alignas) {
				{
				setState(1461);
				attributeSpecifierSeq();
				}
			}

			setState(1464);
			declSpecifierSeq();
			{
			setState(1469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1465);
				declarator();
				}
				break;
			case 2:
				{
				setState(1467);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1466);
					abstractDeclarator();
					}
					break;
				}
				}
				break;
			}
			setState(1473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1471);
				match(Assign);
				setState(1472);
				initializerClause();
				}
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
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Alignas) {
				{
				setState(1475);
				attributeSpecifierSeq();
				}
			}

			setState(1479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1478);
				declSpecifierSeq();
				}
				break;
			}
			setState(1481);
			declarator();
			setState(1482);
			functionBody();
			}
		}
		catch (RecognitionException re) {
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
	public static class FunctionBodyContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode Assign() { return getToken(gParser.Assign, 0); }
		public TerminalNode Semi() { return getToken(gParser.Semi, 0); }
		public TerminalNode Default() { return getToken(gParser.Default, 0); }
		public TerminalNode Delete() { return getToken(gParser.Delete, 0); }
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_functionBody);
		int _la;
		try {
			setState(1488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(1484);
				compoundStatement();
				}
				break;
			case Assign:
				enterOuterAlt(_localctx, 2);
				{
				setState(1485);
				match(Assign);
				setState(1486);
				_la = _input.LA(1);
				if ( !(_la==Delete || _la==Default) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1487);
				match(Semi);
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
	public static class InitializerContext extends ParserRuleContext {
		public BraceOrEqualInitializerContext braceOrEqualInitializer() {
			return getRuleContext(BraceOrEqualInitializerContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_initializer);
		try {
			setState(1495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1490);
				braceOrEqualInitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(1491);
				match(LeftParen);
				setState(1492);
				expressionList();
				setState(1493);
				match(RightParen);
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
	public static class BraceOrEqualInitializerContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(gParser.Assign, 0); }
		public InitializerClauseContext initializerClause() {
			return getRuleContext(InitializerClauseContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public BraceOrEqualInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braceOrEqualInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBraceOrEqualInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBraceOrEqualInitializer(this);
		}
	}

	public final BraceOrEqualInitializerContext braceOrEqualInitializer() throws RecognitionException {
		BraceOrEqualInitializerContext _localctx = new BraceOrEqualInitializerContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_braceOrEqualInitializer);
		try {
			setState(1500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1497);
				match(Assign);
				setState(1498);
				initializerClause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1499);
				bracedInitList();
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
	public static class InitializerClauseContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public InitializerClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterInitializerClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitInitializerClause(this);
		}
	}

	public final InitializerClauseContext initializerClause() throws RecognitionException {
		InitializerClauseContext _localctx = new InitializerClauseContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_initializerClause);
		try {
			setState(1505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case StringLiteral:
			case BooleanLiteral:
			case Bool:
			case Float:
			case Matrix:
			case Int:
			case Void:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Tilde:
			case Not:
			case PlusPlus:
			case MinusMinus:
			case Identifier:
			case Doublecolon:
			case Dynamic_cast:
			case Static_cast:
			case Reinterpret_cast:
			case Const_cast:
			case Typeid_:
			case Sizeof:
			case Alignof:
			case Or:
			case New:
			case Delete:
			case Noexcept:
			case Short:
			case Long:
			case Unsigned:
			case Signed:
			case Char:
			case Char16:
			case Char32:
			case Wchar:
			case Double:
			case Auto:
			case Decltype:
			case Operator:
			case MatrixLiteral:
			case CharacterLiteral:
			case FloatingLiteral:
			case PointerLiteral:
			case UserDefinedLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1502);
				assignmentExpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1503);
				bracedInitList();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(1504);
				matrix();
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
	public static class InitializerListContext extends ParserRuleContext {
		public List<InitializerClauseContext> initializerClause() {
			return getRuleContexts(InitializerClauseContext.class);
		}
		public InitializerClauseContext initializerClause(int i) {
			return getRuleContext(InitializerClauseContext.class,i);
		}
		public List<TerminalNode> Ellipsis() { return getTokens(gParser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(gParser.Ellipsis, i);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitInitializerList(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			initializerClause();
			setState(1509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1508);
				match(Ellipsis);
				}
			}

			setState(1518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1511);
					match(Comma);
					setState(1512);
					initializerClause();
					setState(1514);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Ellipsis) {
						{
						setState(1513);
						match(Ellipsis);
						}
					}

					}
					} 
				}
				setState(1520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
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
	public static class BracedInitListContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(gParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(gParser.RightBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(gParser.Comma, 0); }
		public BracedInitListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracedInitList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBracedInitList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBracedInitList(this);
		}
	}

	public final BracedInitListContext bracedInitList() throws RecognitionException {
		BracedInitListContext _localctx = new BracedInitListContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_bracedInitList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			match(LeftBrace);
			setState(1526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 864691617365820866L) != 0 || (((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & -864128453377532351L) != 0 || _la==UserDefinedLiteral) {
				{
				setState(1522);
				initializerList();
				setState(1524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1523);
					match(Comma);
					}
				}

				}
			}

			setState(1528);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MeminitializeridContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public MeminitializeridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMeminitializerid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMeminitializerid(this);
		}
	}

	public final MeminitializeridContext meminitializerid() throws RecognitionException {
		MeminitializeridContext _localctx = new MeminitializeridContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_meminitializerid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorFunctionIdContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(gParser.Operator, 0); }
		public TheOperatorContext theOperator() {
			return getRuleContext(TheOperatorContext.class,0);
		}
		public OperatorFunctionIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorFunctionId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterOperatorFunctionId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitOperatorFunctionId(this);
		}
	}

	public final OperatorFunctionIdContext operatorFunctionId() throws RecognitionException {
		OperatorFunctionIdContext _localctx = new OperatorFunctionIdContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_operatorFunctionId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1532);
			match(Operator);
			setState(1533);
			theOperator();
			}
		}
		catch (RecognitionException re) {
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
	public static class LiteralOperatorIdContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(gParser.Operator, 0); }
		public TerminalNode StringLiteral() { return getToken(gParser.StringLiteral, 0); }
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public TerminalNode UserDefinedStringLiteral() { return getToken(gParser.UserDefinedStringLiteral, 0); }
		public LiteralOperatorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalOperatorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLiteralOperatorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLiteralOperatorId(this);
		}
	}

	public final LiteralOperatorIdContext literalOperatorId() throws RecognitionException {
		LiteralOperatorIdContext _localctx = new LiteralOperatorIdContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_literalOperatorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1535);
			match(Operator);
			setState(1539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				{
				setState(1536);
				match(StringLiteral);
				setState(1537);
				match(Identifier);
				}
				break;
			case UserDefinedStringLiteral:
				{
				setState(1538);
				match(UserDefinedStringLiteral);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TheOperatorContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(gParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(gParser.Minus, 0); }
		public TerminalNode Div() { return getToken(gParser.Div, 0); }
		public TerminalNode Mod() { return getToken(gParser.Mod, 0); }
		public TerminalNode And() { return getToken(gParser.And, 0); }
		public TerminalNode Or() { return getToken(gParser.Or, 0); }
		public TerminalNode Not() { return getToken(gParser.Not, 0); }
		public TerminalNode Assign() { return getToken(gParser.Assign, 0); }
		public TerminalNode Greater() { return getToken(gParser.Greater, 0); }
		public TerminalNode Less() { return getToken(gParser.Less, 0); }
		public TerminalNode GreaterEqual() { return getToken(gParser.GreaterEqual, 0); }
		public TerminalNode Equal() { return getToken(gParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(gParser.NotEqual, 0); }
		public TerminalNode LessEqual() { return getToken(gParser.LessEqual, 0); }
		public TerminalNode AndAnd() { return getToken(gParser.AndAnd, 0); }
		public TerminalNode OrOr() { return getToken(gParser.OrOr, 0); }
		public TerminalNode Comma() { return getToken(gParser.Comma, 0); }
		public TerminalNode LeftParen() { return getToken(gParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(gParser.RightParen, 0); }
		public TerminalNode LeftBracket() { return getToken(gParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(gParser.RightBracket, 0); }
		public TheOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTheOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTheOperator(this);
		}
	}

	public final TheOperatorContext theOperator() throws RecognitionException {
		TheOperatorContext _localctx = new TheOperatorContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_theOperator);
		try {
			setState(1563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1542);
				match(Plus);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1543);
				match(Minus);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1544);
				match(Div);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1545);
				match(Mod);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1546);
				match(And);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1547);
				match(Or);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1548);
				match(Not);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1549);
				match(Assign);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1550);
				match(Greater);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1551);
				match(Less);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1552);
				match(GreaterEqual);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1553);
				match(Equal);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1554);
				match(NotEqual);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1555);
				match(LessEqual);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1556);
				match(AndAnd);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1557);
				match(OrOr);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1558);
				match(Comma);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1559);
				match(LeftParen);
				setState(1560);
				match(RightParen);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1561);
				match(LeftBracket);
				setState(1562);
				match(RightBracket);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(gParser.IntegerLiteral, 0); }
		public TerminalNode MatrixLiteral() { return getToken(gParser.MatrixLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(gParser.CharacterLiteral, 0); }
		public TerminalNode FloatingLiteral() { return getToken(gParser.FloatingLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(gParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(gParser.BooleanLiteral, 0); }
		public TerminalNode PointerLiteral() { return getToken(gParser.PointerLiteral, 0); }
		public TerminalNode UserDefinedLiteral() { return getToken(gParser.UserDefinedLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0 || (((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 31L) != 0) ) {
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
	public static class MatrixContext extends ParserRuleContext {
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public MatrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMatrix(this);
		}
	}

	public final MatrixContext matrix() throws RecognitionException {
		MatrixContext _localctx = new MatrixContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_matrix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567);
			match(T__0);
			setState(1568);
			row();
			setState(1573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1569);
				match(T__1);
				setState(1570);
				row();
				}
				}
				setState(1575);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1576);
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
	public static class RowContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitRow(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1578);
			literal();
			setState(1583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1579);
				match(T__3);
				setState(1580);
				literal();
				}
				}
				setState(1585);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterShortquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitShortquery(this);
		}
	}

	public final ShortqueryContext shortquery() throws RecognitionException {
		ShortqueryContext _localctx = new ShortqueryContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_shortquery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			sqlbase();
			setState(1588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket) {
				{
				setState(1587);
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

	@SuppressWarnings("CheckReturnValue")
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
		public SqlbaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlbase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSqlbase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSqlbase(this);
		}
	}

	public final SqlbaseContext sqlbase() throws RecognitionException {
		SqlbaseContext _localctx = new SqlbaseContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_sqlbase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1590);
			match(LeftBracket);
			setState(1591);
			querydatajoin();
			setState(1596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1592);
				match(Comma);
				setState(1593);
				querydatajoin();
				}
				}
				setState(1598);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1599);
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

	@SuppressWarnings("CheckReturnValue")
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSqlwhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSqlwhere(this);
		}
	}

	public final SqlwhereContext sqlwhere() throws RecognitionException {
		SqlwhereContext _localctx = new SqlwhereContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_sqlwhere);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1601);
			match(LeftBracket);
			setState(1602);
			conditionalExpression();
			setState(1607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1603);
				match(Comma);
				setState(1604);
				conditionalExpression();
				}
				}
				setState(1609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1610);
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

	@SuppressWarnings("CheckReturnValue")
	public static class QuerydatajoinContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(gParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(gParser.Identifier, i);
		}
		public TerminalNode Colon() { return getToken(gParser.Colon, 0); }
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterQuerydatajoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitQuerydatajoin(this);
		}
	}

	public final QuerydatajoinContext querydatajoin() throws RecognitionException {
		QuerydatajoinContext _localctx = new QuerydatajoinContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_querydatajoin);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1612);
			match(Identifier);
			setState(1617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				{
				setState(1613);
				match(Dot);
				setState(1614);
				match(Identifier);
				}
				}
				setState(1619);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1620);
			match(Colon);
			setState(1621);
			match(Identifier);
			setState(1624); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1622);
					match(Comma);
					setState(1623);
					match(Identifier);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1626); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
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
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
			match(LeftBracket);
			setState(1629);
			match(Identifier);
			setState(1632); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1630);
				match(T__3);
				setState(1631);
				match(Identifier);
				}
				}
				setState(1634); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(1636);
			match(T__4);
			setState(1637);
			shortquery();
			setState(1638);
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

	@SuppressWarnings("CheckReturnValue")
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAskingquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAskingquery(this);
		}
	}

	public final AskingqueryContext askingquery() throws RecognitionException {
		AskingqueryContext _localctx = new AskingqueryContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_askingquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			match(Identifier);
			setState(1641);
			match(Question);
			setState(1642);
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
		case 5:
			return nestedNameSpecifier_sempred((NestedNameSpecifierContext)_localctx, predIndex);
		case 15:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 25:
			return noPointerNewDeclarator_sempred((NoPointerNewDeclaratorContext)_localctx, predIndex);
		case 115:
			return noPointerDeclarator_sempred((NoPointerDeclaratorContext)_localctx, predIndex);
		case 126:
			return noPointerAbstractDeclarator_sempred((NoPointerAbstractDeclaratorContext)_localctx, predIndex);
		case 128:
			return noPointerAbstractPackDeclarator_sempred((NoPointerAbstractPackDeclaratorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean nestedNameSpecifier_sempred(NestedNameSpecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean noPointerNewDeclarator_sempred(NoPointerNewDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean noPointerDeclarator_sempred(NoPointerDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean noPointerAbstractDeclarator_sempred(NoPointerAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean noPointerAbstractPackDeclarator_sempred(NoPointerAbstractPackDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0085\u066d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
		"\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007"+
		"\u0095\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0001\u0000\u0003"+
		"\u0000\u0132\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u0137"+
		"\b\u0001\u000b\u0001\f\u0001\u0138\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0142\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u0146\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u014d\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u0156\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u015d\b\u0005\n\u0005\f\u0005\u0160\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u0164\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u016a\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u0172\b\b\u0003\b\u0174\b\b\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n\u017b\b\n\n\n\f\n\u017e\t\n\u0001"+
		"\n\u0003\n\u0181\b\n\u0001\u000b\u0001\u000b\u0003\u000b\u0185\b\u000b"+
		"\u0001\f\u0003\f\u0188\b\f\u0001\f\u0001\f\u0003\f\u018c\b\f\u0001\r\u0003"+
		"\r\u018f\b\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0196\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u019a\b\u000e\u0001"+
		"\u000e\u0003\u000e\u019d\b\u000e\u0001\u000e\u0003\u000e\u01a0\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u01a7\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01ab\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u01b9\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01bd\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01c3\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u01ca\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u01d0\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01d4\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u01d8\b\u000f\n\u000f\f\u000f\u01db\t\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0003\u0012"+
		"\u01e2\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01e7\b"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01ed"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u01f4\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0200\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u020a\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0003\u0015\u020f\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0213\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u021a\b\u0015\u0001\u0015\u0003\u0015\u021d"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0225\b\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0229"+
		"\b\u0018\u0001\u0018\u0003\u0018\u022c\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0233\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u023a\b\u0019"+
		"\u0005\u0019\u023c\b\u0019\n\u0019\f\u0019\u023f\t\u0019\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u0243\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0247"+
		"\b\u001a\u0001\u001b\u0003\u001b\u024a\b\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u024f\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u025e\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0263\b\u001e\n\u001e"+
		"\f\u001e\u0266\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f"+
		"\u026b\b\u001f\n\u001f\f\u001f\u026e\t\u001f\u0001 \u0001 \u0001 \u0005"+
		" \u0273\b \n \f \u0276\t \u0001!\u0001!\u0001!\u0001!\u0005!\u027c\b!"+
		"\n!\f!\u027f\t!\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0285\b\"\u0001"+
		"#\u0001#\u0001#\u0005#\u028a\b#\n#\f#\u028d\t#\u0001$\u0001$\u0001$\u0005"+
		"$\u0292\b$\n$\f$\u0295\t$\u0001%\u0001%\u0001%\u0005%\u029a\b%\n%\f%\u029d"+
		"\t%\u0001&\u0001&\u0001&\u0005&\u02a2\b&\n&\f&\u02a5\t&\u0001\'\u0001"+
		"\'\u0001\'\u0005\'\u02aa\b\'\n\'\f\'\u02ad\t\'\u0001(\u0001(\u0001(\u0005"+
		"(\u02b2\b(\n(\f(\u02b5\t(\u0001)\u0001)\u0001)\u0005)\u02ba\b)\n)\f)\u02bd"+
		"\t)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u02c5\b*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0003+\u02cc\b+\u0001,\u0001,\u0001-\u0001-\u0001"+
		"-\u0005-\u02d3\b-\n-\f-\u02d6\t-\u0001.\u0001.\u0001/\u0001/\u0001/\u0003"+
		"/\u02dd\b/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u02e4\b/\u0003/\u02e6"+
		"\b/\u00010\u00030\u02e9\b0\u00010\u00010\u00010\u00010\u00030\u02ef\b"+
		"0\u00010\u00010\u00010\u00011\u00031\u02f5\b1\u00011\u00011\u00012\u0001"+
		"2\u00032\u02fb\b2\u00012\u00012\u00013\u00043\u0300\b3\u000b3\f3\u0301"+
		"\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u030b\b4\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00034\u0313\b4\u00015\u00015\u0003"+
		"5\u0317\b5\u00015\u00015\u00015\u00015\u00015\u00035\u031e\b5\u00035\u0320"+
		"\b5\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00036\u0334"+
		"\b6\u00016\u00016\u00036\u0338\b6\u00016\u00016\u00016\u00016\u00036\u033e"+
		"\b6\u00016\u00016\u00016\u00036\u0343\b6\u00017\u00017\u00037\u0347\b"+
		"7\u00018\u00038\u034a\b8\u00018\u00018\u00018\u00019\u00019\u00039\u0351"+
		"\b9\u0001:\u0001:\u0001:\u0001:\u0001:\u0003:\u0358\b:\u0001:\u0001:\u0003"+
		":\u035c\b:\u0001:\u0001:\u0001;\u0001;\u0001<\u0004<\u0363\b<\u000b<\f"+
		"<\u0364\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0003=\u036d\b=\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u0377\b>\u0001"+
		"?\u0001?\u0001?\u0003?\u037c\b?\u0001?\u0001?\u0001?\u0001?\u0001@\u0003"+
		"@\u0383\b@\u0001@\u0003@\u0386\b@\u0001@\u0001@\u0001@\u0003@\u038b\b"+
		"@\u0001@\u0001@\u0001@\u0003@\u0390\b@\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001C\u0001C\u0001C\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0003D\u03a5\bD\u0001E\u0004E\u03a8\bE\u000b"+
		"E\fE\u03a9\u0001E\u0003E\u03ad\bE\u0001F\u0001F\u0001G\u0001G\u0001H\u0001"+
		"H\u0001I\u0001I\u0003I\u03b7\bI\u0001J\u0001J\u0001J\u0003J\u03bc\bJ\u0001"+
		"K\u0004K\u03bf\bK\u000bK\fK\u03c0\u0001K\u0003K\u03c4\bK\u0001L\u0004"+
		"L\u03c7\bL\u000bL\fL\u03c8\u0001L\u0003L\u03cc\bL\u0001M\u0001M\u0001"+
		"N\u0001N\u0001O\u0003O\u03d3\bO\u0001O\u0001O\u0001O\u0003O\u03d8\bO\u0001"+
		"O\u0004O\u03db\bO\u000bO\fO\u03dc\u0001O\u0003O\u03e0\bO\u0001O\u0001"+
		"O\u0003O\u03e4\bO\u0001O\u0001O\u0003O\u03e8\bO\u0001O\u0001O\u0003O\u03ec"+
		"\bO\u0001O\u0001O\u0001O\u0001O\u0003O\u03f2\bO\u0001O\u0005O\u03f5\b"+
		"O\nO\fO\u03f8\tO\u0001O\u0001O\u0001O\u0003O\u03fd\bO\u0001O\u0001O\u0001"+
		"O\u0001O\u0003O\u0403\bO\u0001P\u0001P\u0003P\u0407\bP\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0003Q\u040d\bQ\u0001Q\u0001Q\u0001R\u0001R\u0003R\u0413\bR\u0001"+
		"R\u0001R\u0001S\u0001S\u0001T\u0001T\u0001T\u0001T\u0003T\u041d\bT\u0003"+
		"T\u041f\bT\u0001T\u0001T\u0001U\u0001U\u0003U\u0425\bU\u0001U\u0003U\u0428"+
		"\bU\u0001U\u0003U\u042b\bU\u0001U\u0003U\u042e\bU\u0001V\u0001V\u0003"+
		"V\u0432\bV\u0001V\u0001V\u0003V\u0436\bV\u0001V\u0001V\u0001W\u0001W\u0003"+
		"W\u043c\bW\u0001X\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0005Y\u0444\bY\n"+
		"Y\fY\u0447\tY\u0001Z\u0001Z\u0001Z\u0003Z\u044c\bZ\u0001[\u0001[\u0001"+
		"\\\u0001\\\u0003\\\u0452\b\\\u0001]\u0001]\u0001^\u0003^\u0457\b^\u0001"+
		"^\u0001^\u0001^\u0003^\u045c\b^\u0001^\u0001^\u0003^\u0460\b^\u0001^\u0001"+
		"^\u0001_\u0001_\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001a\u0003"+
		"a\u046d\ba\u0001a\u0001a\u0001b\u0001b\u0003b\u0473\bb\u0001b\u0001b\u0003"+
		"b\u0477\bb\u0001b\u0001b\u0001b\u0001c\u0003c\u047d\bc\u0001c\u0001c\u0001"+
		"c\u0003c\u0482\bc\u0001c\u0001c\u0001c\u0001d\u0001d\u0001d\u0001d\u0001"+
		"d\u0001d\u0001e\u0001e\u0001e\u0001e\u0003e\u0491\be\u0001e\u0001e\u0003"+
		"e\u0495\be\u0001f\u0004f\u0498\bf\u000bf\ff\u0499\u0001g\u0001g\u0001"+
		"g\u0003g\u049f\bg\u0001g\u0001g\u0001g\u0003g\u04a4\bg\u0001h\u0001h\u0001"+
		"h\u0001h\u0003h\u04aa\bh\u0001h\u0003h\u04ad\bh\u0001h\u0001h\u0001i\u0001"+
		"i\u0001i\u0005i\u04b4\bi\ni\fi\u04b7\ti\u0001i\u0003i\u04ba\bi\u0001j"+
		"\u0001j\u0001j\u0003j\u04bf\bj\u0001j\u0001j\u0003j\u04c3\bj\u0001k\u0001"+
		"k\u0001l\u0001l\u0003l\u04c9\bl\u0001l\u0001l\u0001m\u0004m\u04ce\bm\u000b"+
		"m\fm\u04cf\u0001n\u0001n\u0001n\u0001n\u0001n\u0001n\u0001n\u0001n\u0001"+
		"n\u0001n\u0001n\u0001n\u0001n\u0004n\u04df\bn\u000bn\fn\u04e0\u0003n\u04e3"+
		"\bn\u0001o\u0001o\u0001o\u0005o\u04e8\bo\no\fo\u04eb\to\u0001p\u0001p"+
		"\u0003p\u04ef\bp\u0001q\u0001q\u0001q\u0001q\u0001q\u0003q\u04f6\bq\u0001"+
		"r\u0001r\u0003r\u04fa\br\u0005r\u04fc\br\nr\fr\u04ff\tr\u0001r\u0001r"+
		"\u0001s\u0001s\u0001s\u0003s\u0506\bs\u0001s\u0001s\u0001s\u0001s\u0003"+
		"s\u050c\bs\u0001s\u0001s\u0001s\u0001s\u0003s\u0512\bs\u0001s\u0001s\u0003"+
		"s\u0516\bs\u0003s\u0518\bs\u0005s\u051a\bs\ns\fs\u051d\ts\u0001t\u0001"+
		"t\u0003t\u0521\bt\u0001t\u0001t\u0003t\u0525\bt\u0001t\u0003t\u0528\b"+
		"t\u0001t\u0003t\u052b\bt\u0001u\u0001u\u0001u\u0003u\u0530\bu\u0001v\u0001"+
		"v\u0003v\u0534\bv\u0001v\u0003v\u0537\bv\u0001v\u0001v\u0003v\u053b\b"+
		"v\u0001v\u0003v\u053e\bv\u0003v\u0540\bv\u0001w\u0004w\u0543\bw\u000b"+
		"w\fw\u0544\u0001x\u0001x\u0001y\u0001y\u0001z\u0003z\u054c\bz\u0001z\u0001"+
		"z\u0001{\u0001{\u0003{\u0552\b{\u0001|\u0001|\u0003|\u0556\b|\u0001|\u0001"+
		"|\u0001|\u0001|\u0003|\u055c\b|\u0001}\u0001}\u0004}\u0560\b}\u000b}\f"+
		"}\u0561\u0001}\u0003}\u0565\b}\u0003}\u0567\b}\u0001~\u0001~\u0001~\u0001"+
		"~\u0003~\u056d\b~\u0001~\u0001~\u0003~\u0571\b~\u0001~\u0001~\u0001~\u0001"+
		"~\u0003~\u0577\b~\u0001~\u0001~\u0001~\u0001~\u0001~\u0003~\u057e\b~\u0001"+
		"~\u0001~\u0003~\u0582\b~\u0003~\u0584\b~\u0005~\u0586\b~\n~\f~\u0589\t"+
		"~\u0001\u007f\u0005\u007f\u058c\b\u007f\n\u007f\f\u007f\u058f\t\u007f"+
		"\u0001\u007f\u0001\u007f\u0001\u0080\u0001\u0080\u0001\u0080\u0001\u0080"+
		"\u0001\u0080\u0001\u0080\u0001\u0080\u0003\u0080\u059a\b\u0080\u0001\u0080"+
		"\u0001\u0080\u0003\u0080\u059e\b\u0080\u0003\u0080\u05a0\b\u0080\u0005"+
		"\u0080\u05a2\b\u0080\n\u0080\f\u0080\u05a5\t\u0080\u0001\u0081\u0001\u0081"+
		"\u0003\u0081\u05a9\b\u0081\u0001\u0081\u0003\u0081\u05ac\b\u0081\u0001"+
		"\u0082\u0001\u0082\u0001\u0082\u0005\u0082\u05b1\b\u0082\n\u0082\f\u0082"+
		"\u05b4\t\u0082\u0001\u0083\u0003\u0083\u05b7\b\u0083\u0001\u0083\u0001"+
		"\u0083\u0001\u0083\u0003\u0083\u05bc\b\u0083\u0003\u0083\u05be\b\u0083"+
		"\u0001\u0083\u0001\u0083\u0003\u0083\u05c2\b\u0083\u0001\u0084\u0003\u0084"+
		"\u05c5\b\u0084\u0001\u0084\u0003\u0084\u05c8\b\u0084\u0001\u0084\u0001"+
		"\u0084\u0001\u0084\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0003"+
		"\u0085\u05d1\b\u0085\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001"+
		"\u0086\u0003\u0086\u05d8\b\u0086\u0001\u0087\u0001\u0087\u0001\u0087\u0003"+
		"\u0087\u05dd\b\u0087\u0001\u0088\u0001\u0088\u0001\u0088\u0003\u0088\u05e2"+
		"\b\u0088\u0001\u0089\u0001\u0089\u0003\u0089\u05e6\b\u0089\u0001\u0089"+
		"\u0001\u0089\u0001\u0089\u0003\u0089\u05eb\b\u0089\u0005\u0089\u05ed\b"+
		"\u0089\n\u0089\f\u0089\u05f0\t\u0089\u0001\u008a\u0001\u008a\u0001\u008a"+
		"\u0003\u008a\u05f5\b\u008a\u0003\u008a\u05f7\b\u008a\u0001\u008a\u0001"+
		"\u008a\u0001\u008b\u0001\u008b\u0001\u008c\u0001\u008c\u0001\u008c\u0001"+
		"\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0003\u008d\u0604\b\u008d\u0001"+
		"\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001"+
		"\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001"+
		"\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001"+
		"\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0003\u008e\u061c\b\u008e\u0001"+
		"\u008f\u0001\u008f\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0005"+
		"\u0090\u0624\b\u0090\n\u0090\f\u0090\u0627\t\u0090\u0001\u0090\u0001\u0090"+
		"\u0001\u0091\u0001\u0091\u0001\u0091\u0005\u0091\u062e\b\u0091\n\u0091"+
		"\f\u0091\u0631\t\u0091\u0001\u0092\u0001\u0092\u0003\u0092\u0635\b\u0092"+
		"\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0005\u0093\u063b\b\u0093"+
		"\n\u0093\f\u0093\u063e\t\u0093\u0001\u0093\u0001\u0093\u0001\u0094\u0001"+
		"\u0094\u0001\u0094\u0001\u0094\u0005\u0094\u0646\b\u0094\n\u0094\f\u0094"+
		"\u0649\t\u0094\u0001\u0094\u0001\u0094\u0001\u0095\u0001\u0095\u0001\u0095"+
		"\u0005\u0095\u0650\b\u0095\n\u0095\f\u0095\u0653\t\u0095\u0001\u0095\u0001"+
		"\u0095\u0001\u0095\u0001\u0095\u0004\u0095\u0659\b\u0095\u000b\u0095\f"+
		"\u0095\u065a\u0001\u0096\u0001\u0096\u0001\u0096\u0001\u0096\u0004\u0096"+
		"\u0661\b\u0096\u000b\u0096\f\u0096\u0662\u0001\u0096\u0001\u0096\u0001"+
		"\u0096\u0001\u0096\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0001"+
		"\u0097\u0001\u03a9\u0006\n\u001e2\u00e6\u00fc\u0100\u0098\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6"+
		"\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe"+
		"\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116"+
		"\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e"+
		"\u0000\u0015\u0002\u0000$$\'\'\u0001\u0000NQ\u0002\u0000>>BB\u0001\u0000"+
		":;\u0003\u0000\u001e $&VV\u0002\u0000==CC\u0001\u0000 \"\u0001\u0000\u001e"+
		"\u001f\u0002\u0000()67\u0001\u000045\u0002\u0000\'\'*3\u0002\u0000MMd"+
		"g\u0001\u0000hj\u0001\u0000kl\u0001\u0000mn\u0001\u0000wx\u0001\u0000"+
		"\u0018\u001d\u0002\u0000$$88\u0001\u0000}~\u0002\u0000XX[[\u0002\u0000"+
		"\u0006\b\u0081\u0085\u0703\u0000\u0131\u0001\u0000\u0000\u0000\u0002\u0141"+
		"\u0001\u0000\u0000\u0000\u0004\u0145\u0001\u0000\u0000\u0000\u0006\u014c"+
		"\u0001\u0000\u0000\u0000\b\u014e\u0001\u0000\u0000\u0000\n\u0151\u0001"+
		"\u0000\u0000\u0000\f\u0161\u0001\u0000\u0000\u0000\u000e\u0167\u0001\u0000"+
		"\u0000\u0000\u0010\u0173\u0001\u0000\u0000\u0000\u0012\u0175\u0001\u0000"+
		"\u0000\u0000\u0014\u0177\u0001\u0000\u0000\u0000\u0016\u0184\u0001\u0000"+
		"\u0000\u0000\u0018\u018b\u0001\u0000\u0000\u0000\u001a\u018e\u0001\u0000"+
		"\u0000\u0000\u001c\u0193\u0001\u0000\u0000\u0000\u001e\u01bc\u0001\u0000"+
		"\u0000\u0000 \u01dc\u0001\u0000\u0000\u0000\"\u01de\u0001\u0000\u0000"+
		"\u0000$\u01ec\u0001\u0000\u0000\u0000&\u0209\u0001\u0000\u0000\u0000("+
		"\u020b\u0001\u0000\u0000\u0000*\u020e\u0001\u0000\u0000\u0000,\u021e\u0001"+
		"\u0000\u0000\u0000.\u0222\u0001\u0000\u0000\u00000\u022b\u0001\u0000\u0000"+
		"\u00002\u022d\u0001\u0000\u0000\u00004\u0246\u0001\u0000\u0000\u00006"+
		"\u0249\u0001\u0000\u0000\u00008\u0252\u0001\u0000\u0000\u0000:\u025d\u0001"+
		"\u0000\u0000\u0000<\u025f\u0001\u0000\u0000\u0000>\u0267\u0001\u0000\u0000"+
		"\u0000@\u026f\u0001\u0000\u0000\u0000B\u0277\u0001\u0000\u0000\u0000D"+
		"\u0284\u0001\u0000\u0000\u0000F\u0286\u0001\u0000\u0000\u0000H\u028e\u0001"+
		"\u0000\u0000\u0000J\u0296\u0001\u0000\u0000\u0000L\u029e\u0001\u0000\u0000"+
		"\u0000N\u02a6\u0001\u0000\u0000\u0000P\u02ae\u0001\u0000\u0000\u0000R"+
		"\u02b6\u0001\u0000\u0000\u0000T\u02be\u0001\u0000\u0000\u0000V\u02cb\u0001"+
		"\u0000\u0000\u0000X\u02cd\u0001\u0000\u0000\u0000Z\u02cf\u0001\u0000\u0000"+
		"\u0000\\\u02d7\u0001\u0000\u0000\u0000^\u02e5\u0001\u0000\u0000\u0000"+
		"`\u02e8\u0001\u0000\u0000\u0000b\u02f4\u0001\u0000\u0000\u0000d\u02f8"+
		"\u0001\u0000\u0000\u0000f\u02ff\u0001\u0000\u0000\u0000h\u0312\u0001\u0000"+
		"\u0000\u0000j\u031f\u0001\u0000\u0000\u0000l\u0342\u0001\u0000\u0000\u0000"+
		"n\u0346\u0001\u0000\u0000\u0000p\u0349\u0001\u0000\u0000\u0000r\u0350"+
		"\u0001\u0000\u0000\u0000t\u035b\u0001\u0000\u0000\u0000v\u035f\u0001\u0000"+
		"\u0000\u0000x\u0362\u0001\u0000\u0000\u0000z\u036c\u0001\u0000\u0000\u0000"+
		"|\u0376\u0001\u0000\u0000\u0000~\u0378\u0001\u0000\u0000\u0000\u0080\u038f"+
		"\u0001\u0000\u0000\u0000\u0082\u0391\u0001\u0000\u0000\u0000\u0084\u0399"+
		"\u0001\u0000\u0000\u0000\u0086\u039b\u0001\u0000\u0000\u0000\u0088\u03a4"+
		"\u0001\u0000\u0000\u0000\u008a\u03a7\u0001\u0000\u0000\u0000\u008c\u03ae"+
		"\u0001\u0000\u0000\u0000\u008e\u03b0\u0001\u0000\u0000\u0000\u0090\u03b2"+
		"\u0001\u0000\u0000\u0000\u0092\u03b6\u0001\u0000\u0000\u0000\u0094\u03bb"+
		"\u0001\u0000\u0000\u0000\u0096\u03be\u0001\u0000\u0000\u0000\u0098\u03c6"+
		"\u0001\u0000\u0000\u0000\u009a\u03cd\u0001\u0000\u0000\u0000\u009c\u03cf"+
		"\u0001\u0000\u0000\u0000\u009e\u0402\u0001\u0000\u0000\u0000\u00a0\u0406"+
		"\u0001\u0000\u0000\u0000\u00a2\u0408\u0001\u0000\u0000\u0000\u00a4\u0410"+
		"\u0001\u0000\u0000\u0000\u00a6\u0416\u0001\u0000\u0000\u0000\u00a8\u0418"+
		"\u0001\u0000\u0000\u0000\u00aa\u0422\u0001\u0000\u0000\u0000\u00ac\u042f"+
		"\u0001\u0000\u0000\u0000\u00ae\u0439\u0001\u0000\u0000\u0000\u00b0\u043d"+
		"\u0001\u0000\u0000\u0000\u00b2\u0440\u0001\u0000\u0000\u0000\u00b4\u0448"+
		"\u0001\u0000\u0000\u0000\u00b6\u044d\u0001\u0000\u0000\u0000\u00b8\u0451"+
		"\u0001\u0000\u0000\u0000\u00ba\u0453\u0001\u0000\u0000\u0000\u00bc\u0456"+
		"\u0001\u0000\u0000\u0000\u00be\u0463\u0001\u0000\u0000\u0000\u00c0\u0465"+
		"\u0001\u0000\u0000\u0000\u00c2\u046c\u0001\u0000\u0000\u0000\u00c4\u0470"+
		"\u0001\u0000\u0000\u0000\u00c6\u047c\u0001\u0000\u0000\u0000\u00c8\u0486"+
		"\u0001\u0000\u0000\u0000\u00ca\u048c\u0001\u0000\u0000\u0000\u00cc\u0497"+
		"\u0001\u0000\u0000\u0000\u00ce\u04a3\u0001\u0000\u0000\u0000\u00d0\u04a5"+
		"\u0001\u0000\u0000\u0000\u00d2\u04b0\u0001\u0000\u0000\u0000\u00d4\u04be"+
		"\u0001\u0000\u0000\u0000\u00d6\u04c4\u0001\u0000\u0000\u0000\u00d8\u04c6"+
		"\u0001\u0000\u0000\u0000\u00da\u04cd\u0001\u0000\u0000\u0000\u00dc\u04e2"+
		"\u0001\u0000\u0000\u0000\u00de\u04e4\u0001\u0000\u0000\u0000\u00e0\u04ec"+
		"\u0001\u0000\u0000\u0000\u00e2\u04f5\u0001\u0000\u0000\u0000\u00e4\u04fd"+
		"\u0001\u0000\u0000\u0000\u00e6\u050b\u0001\u0000\u0000\u0000\u00e8\u051e"+
		"\u0001\u0000\u0000\u0000\u00ea\u052c\u0001\u0000\u0000\u0000\u00ec\u053f"+
		"\u0001\u0000\u0000\u0000\u00ee\u0542\u0001\u0000\u0000\u0000\u00f0\u0546"+
		"\u0001\u0000\u0000\u0000\u00f2\u0548\u0001\u0000\u0000\u0000\u00f4\u054b"+
		"\u0001\u0000\u0000\u0000\u00f6\u054f\u0001\u0000\u0000\u0000\u00f8\u055b"+
		"\u0001\u0000\u0000\u0000\u00fa\u0566\u0001\u0000\u0000\u0000\u00fc\u0576"+
		"\u0001\u0000\u0000\u0000\u00fe\u058d\u0001\u0000\u0000\u0000\u0100\u0592"+
		"\u0001\u0000\u0000\u0000\u0102\u05a6\u0001\u0000\u0000\u0000\u0104\u05ad"+
		"\u0001\u0000\u0000\u0000\u0106\u05b6\u0001\u0000\u0000\u0000\u0108\u05c4"+
		"\u0001\u0000\u0000\u0000\u010a\u05d0\u0001\u0000\u0000\u0000\u010c\u05d7"+
		"\u0001\u0000\u0000\u0000\u010e\u05dc\u0001\u0000\u0000\u0000\u0110\u05e1"+
		"\u0001\u0000\u0000\u0000\u0112\u05e3\u0001\u0000\u0000\u0000\u0114\u05f1"+
		"\u0001\u0000\u0000\u0000\u0116\u05fa\u0001\u0000\u0000\u0000\u0118\u05fc"+
		"\u0001\u0000\u0000\u0000\u011a\u05ff\u0001\u0000\u0000\u0000\u011c\u061b"+
		"\u0001\u0000\u0000\u0000\u011e\u061d\u0001\u0000\u0000\u0000\u0120\u061f"+
		"\u0001\u0000\u0000\u0000\u0122\u062a\u0001\u0000\u0000\u0000\u0124\u0632"+
		"\u0001\u0000\u0000\u0000\u0126\u0636\u0001\u0000\u0000\u0000\u0128\u0641"+
		"\u0001\u0000\u0000\u0000\u012a\u064c\u0001\u0000\u0000\u0000\u012c\u065c"+
		"\u0001\u0000\u0000\u0000\u012e\u0668\u0001\u0000\u0000\u0000\u0130\u0132"+
		"\u0003x<\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000"+
		"\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0134\u0005\u0000"+
		"\u0000\u0001\u0134\u0001\u0001\u0000\u0000\u0000\u0135\u0137\u0003\u011e"+
		"\u008f\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000"+
		"\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000"+
		"\u0000\u0000\u0139\u0142\u0001\u0000\u0000\u0000\u013a\u013b\u0005\u0018"+
		"\u0000\u0000\u013b\u013c\u0003Z-\u0000\u013c\u013d\u0005\u0019\u0000\u0000"+
		"\u013d\u0142\u0001\u0000\u0000\u0000\u013e\u0142\u0003\u0004\u0002\u0000"+
		"\u013f\u0142\u0003\f\u0006\u0000\u0140\u0142\u0003\u012c\u0096\u0000\u0141"+
		"\u0136\u0001\u0000\u0000\u0000\u0141\u013a\u0001\u0000\u0000\u0000\u0141"+
		"\u013e\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141"+
		"\u0140\u0001\u0000\u0000\u0000\u0142\u0003\u0001\u0000\u0000\u0000\u0143"+
		"\u0146\u0003\u0006\u0003\u0000\u0144\u0146\u0003\b\u0004\u0000\u0145\u0143"+
		"\u0001\u0000\u0000\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146\u0005"+
		"\u0001\u0000\u0000\u0000\u0147\u014d\u0005E\u0000\u0000\u0148\u014d\u0003"+
		"\u0118\u008c\u0000\u0149\u014d\u0003\u011a\u008d\u0000\u014a\u014b\u0005"+
		"%\u0000\u0000\u014b\u014d\u0003\u00a2Q\u0000\u014c\u0147\u0001\u0000\u0000"+
		"\u0000\u014c\u0148\u0001\u0000\u0000\u0000\u014c\u0149\u0001\u0000\u0000"+
		"\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014d\u0007\u0001\u0000\u0000"+
		"\u0000\u014e\u014f\u0003\n\u0005\u0000\u014f\u0150\u0003\u0006\u0003\u0000"+
		"\u0150\t\u0001\u0000\u0000\u0000\u0151\u0155\u0006\u0005\uffff\uffff\u0000"+
		"\u0152\u0156\u0003\u00a0P\u0000\u0153\u0156\u0003\u00b8\\\u0000\u0154"+
		"\u0156\u0003\u00a2Q\u0000\u0155\u0152\u0001\u0000\u0000\u0000\u0155\u0153"+
		"\u0001\u0000\u0000\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0155\u0156"+
		"\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0158"+
		"\u0005K\u0000\u0000\u0158\u015e\u0001\u0000\u0000\u0000\u0159\u015a\n"+
		"\u0001\u0000\u0000\u015a\u015b\u0005E\u0000\u0000\u015b\u015d\u0005K\u0000"+
		"\u0000\u015c\u0159\u0001\u0000\u0000\u0000\u015d\u0160\u0001\u0000\u0000"+
		"\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000"+
		"\u0000\u015f\u000b\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000"+
		"\u0000\u0161\u0163\u0003\u000e\u0007\u0000\u0162\u0164\u0003\u001c\u000e"+
		"\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0166\u0003d2\u0000\u0166"+
		"\r\u0001\u0000\u0000\u0000\u0167\u0169\u0005\u001a\u0000\u0000\u0168\u016a"+
		"\u0003\u0010\b\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u0169\u016a\u0001"+
		"\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016c\u0005"+
		"\u001b\u0000\u0000\u016c\u000f\u0001\u0000\u0000\u0000\u016d\u0174\u0003"+
		"\u0014\n\u0000\u016e\u0171\u0003\u0012\t\u0000\u016f\u0170\u0005<\u0000"+
		"\u0000\u0170\u0172\u0003\u0014\n\u0000\u0171\u016f\u0001\u0000\u0000\u0000"+
		"\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0174\u0001\u0000\u0000\u0000"+
		"\u0173\u016d\u0001\u0000\u0000\u0000\u0173\u016e\u0001\u0000\u0000\u0000"+
		"\u0174\u0011\u0001\u0000\u0000\u0000\u0175\u0176\u0007\u0000\u0000\u0000"+
		"\u0176\u0013\u0001\u0000\u0000\u0000\u0177\u017c\u0003\u0016\u000b\u0000"+
		"\u0178\u0179\u0005<\u0000\u0000\u0179\u017b\u0003\u0016\u000b\u0000\u017a"+
		"\u0178\u0001\u0000\u0000\u0000\u017b\u017e\u0001\u0000\u0000\u0000\u017c"+
		"\u017a\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d"+
		"\u0180\u0001\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017f"+
		"\u0181\u0005D\u0000\u0000\u0180\u017f\u0001\u0000\u0000\u0000\u0180\u0181"+
		"\u0001\u0000\u0000\u0000\u0181\u0015\u0001\u0000\u0000\u0000\u0182\u0185"+
		"\u0003\u0018\f\u0000\u0183\u0185\u0003\u001a\r\u0000\u0184\u0182\u0001"+
		"\u0000\u0000\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0185\u0017\u0001"+
		"\u0000\u0000\u0000\u0186\u0188\u0005$\u0000\u0000\u0187\u0186\u0001\u0000"+
		"\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000"+
		"\u0000\u0000\u0189\u018c\u0005E\u0000\u0000\u018a\u018c\u0005L\u0000\u0000"+
		"\u018b\u0187\u0001\u0000\u0000\u0000\u018b\u018a\u0001\u0000\u0000\u0000"+
		"\u018c\u0019\u0001\u0000\u0000\u0000\u018d\u018f\u0005$\u0000\u0000\u018e"+
		"\u018d\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f"+
		"\u0190\u0001\u0000\u0000\u0000\u0190\u0191\u0005E\u0000\u0000\u0191\u0192"+
		"\u0003\u010c\u0086\u0000\u0192\u001b\u0001\u0000\u0000\u0000\u0193\u0195"+
		"\u0005\u0018\u0000\u0000\u0194\u0196\u0003\u0102\u0081\u0000\u0195\u0194"+
		"\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0197"+
		"\u0001\u0000\u0000\u0000\u0197\u0199\u0005\u0019\u0000\u0000\u0198\u019a"+
		"\u0005M\u0000\u0000\u0199\u0198\u0001\u0000\u0000\u0000\u0199\u019a\u0001"+
		"\u0000\u0000\u0000\u019a\u019c\u0001\u0000\u0000\u0000\u019b\u019d\u0003"+
		"\u00ccf\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000"+
		"\u0000\u0000\u019d\u019f\u0001\u0000\u0000\u0000\u019e\u01a0\u0003\u00ea"+
		"u\u0000\u019f\u019e\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a0\u001d\u0001\u0000\u0000\u0000\u01a1\u01a2\u0006\u000f\uffff"+
		"\uffff\u0000\u01a2\u01bd\u0003\u0002\u0001\u0000\u01a3\u01aa\u0003\u009e"+
		"O\u0000\u01a4\u01a6\u0005\u0018\u0000\u0000\u01a5\u01a7\u0003\"\u0011"+
		"\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01ab\u0005\u0019\u0000"+
		"\u0000\u01a9\u01ab\u0003\u0114\u008a\u0000\u01aa\u01a4\u0001\u0000\u0000"+
		"\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000\u01ab\u01bd\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ad\u0007\u0001\u0000\u0000\u01ad\u01ae\u0005(\u0000\u0000"+
		"\u01ae\u01af\u0003\u00f6{\u0000\u01af\u01b0\u0005)\u0000\u0000\u01b0\u01b1"+
		"\u0005\u0018\u0000\u0000\u01b1\u01b2\u0003Z-\u0000\u01b2\u01b3\u0005\u0019"+
		"\u0000\u0000\u01b3\u01bd\u0001\u0000\u0000\u0000\u01b4\u01b5\u0003 \u0010"+
		"\u0000\u01b5\u01b8\u0005\u0018\u0000\u0000\u01b6\u01b9\u0003Z-\u0000\u01b7"+
		"\u01b9\u0003\u00f6{\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b7"+
		"\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb"+
		"\u0005\u0019\u0000\u0000\u01bb\u01bd\u0001\u0000\u0000\u0000\u01bc\u01a1"+
		"\u0001\u0000\u0000\u0000\u01bc\u01a3\u0001\u0000\u0000\u0000\u01bc\u01ac"+
		"\u0001\u0000\u0000\u0000\u01bc\u01b4\u0001\u0000\u0000\u0000\u01bd\u01d9"+
		"\u0001\u0000\u0000\u0000\u01be\u01bf\n\u0007\u0000\u0000\u01bf\u01c2\u0005"+
		"\u001a\u0000\u0000\u01c0\u01c3\u0003Z-\u0000\u01c1\u01c3\u0003\u0114\u008a"+
		"\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c5\u0005\u001b\u0000"+
		"\u0000\u01c5\u01d8\u0001\u0000\u0000\u0000\u01c6\u01c7\n\u0006\u0000\u0000"+
		"\u01c7\u01c9\u0005\u0018\u0000\u0000\u01c8\u01ca\u0003\"\u0011\u0000\u01c9"+
		"\u01c8\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca"+
		"\u01cb\u0001\u0000\u0000\u0000\u01cb\u01d8\u0005\u0019\u0000\u0000\u01cc"+
		"\u01cd\n\u0004\u0000\u0000\u01cd\u01d3\u0007\u0002\u0000\u0000\u01ce\u01d0"+
		"\u0005R\u0000\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001"+
		"\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d4\u0003"+
		"\u0004\u0002\u0000\u01d2\u01d4\u0003$\u0012\u0000\u01d3\u01cf\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d8\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d6\n\u0003\u0000\u0000\u01d6\u01d8\u0007\u0003\u0000"+
		"\u0000\u01d7\u01be\u0001\u0000\u0000\u0000\u01d7\u01c6\u0001\u0000\u0000"+
		"\u0000\u01d7\u01cc\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000"+
		"\u0000\u01d8\u01db\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u001f\u0001\u0000\u0000"+
		"\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005S\u0000\u0000"+
		"\u01dd!\u0001\u0000\u0000\u0000\u01de\u01df\u0003\u0112\u0089\u0000\u01df"+
		"#\u0001\u0000\u0000\u0000\u01e0\u01e2\u0003\n\u0005\u0000\u01e1\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e6"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e4\u0003\u00a0P\u0000\u01e4\u01e5\u0005"+
		"K\u0000\u0000\u01e5\u01e7\u0001\u0000\u0000\u0000\u01e6\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000"+
		"\u0000\u0000\u01e8\u01e9\u0005%\u0000\u0000\u01e9\u01ed\u0003\u00a0P\u0000"+
		"\u01ea\u01eb\u0005%\u0000\u0000\u01eb\u01ed\u0003\u00a2Q\u0000\u01ec\u01e1"+
		"\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ed%\u0001"+
		"\u0000\u0000\u0000\u01ee\u020a\u0003\u001e\u000f\u0000\u01ef\u01f4\u0005"+
		":\u0000\u0000\u01f0\u01f4\u0005;\u0000\u0000\u01f1\u01f4\u0003(\u0014"+
		"\u0000\u01f2\u01f4\u0005T\u0000\u0000\u01f3\u01ef\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f0\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000"+
		"\u01f5\u020a\u0003&\u0013\u0000\u01f6\u01ff\u0005T\u0000\u0000\u01f7\u01f8"+
		"\u0005\u0018\u0000\u0000\u01f8\u01f9\u0003\u00f6{\u0000\u01f9\u01fa\u0005"+
		"\u0019\u0000\u0000\u01fa\u0200\u0001\u0000\u0000\u0000\u01fb\u01fc\u0005"+
		"D\u0000\u0000\u01fc\u01fd\u0005\u0018\u0000\u0000\u01fd\u01fe\u0005E\u0000"+
		"\u0000\u01fe\u0200\u0005\u0019\u0000\u0000\u01ff\u01f7\u0001\u0000\u0000"+
		"\u0000\u01ff\u01fb\u0001\u0000\u0000\u0000\u0200\u020a\u0001\u0000\u0000"+
		"\u0000\u0201\u0202\u0005U\u0000\u0000\u0202\u0203\u0005\u0018\u0000\u0000"+
		"\u0203\u0204\u0003\u00f6{\u0000\u0204\u0205\u0005\u0019\u0000\u0000\u0205"+
		"\u020a\u0001\u0000\u0000\u0000\u0206\u020a\u00038\u001c\u0000\u0207\u020a"+
		"\u0003*\u0015\u0000\u0208\u020a\u00036\u001b\u0000\u0209\u01ee\u0001\u0000"+
		"\u0000\u0000\u0209\u01f3\u0001\u0000\u0000\u0000\u0209\u01f6\u0001\u0000"+
		"\u0000\u0000\u0209\u0201\u0001\u0000\u0000\u0000\u0209\u0206\u0001\u0000"+
		"\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u0208\u0001\u0000"+
		"\u0000\u0000\u020a\'\u0001\u0000\u0000\u0000\u020b\u020c\u0007\u0004\u0000"+
		"\u0000\u020c)\u0001\u0000\u0000\u0000\u020d\u020f\u0005K\u0000\u0000\u020e"+
		"\u020d\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f"+
		"\u0210\u0001\u0000\u0000\u0000\u0210\u0212\u0005W\u0000\u0000\u0211\u0213"+
		"\u0003,\u0016\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0212\u0213\u0001"+
		"\u0000\u0000\u0000\u0213\u0219\u0001\u0000\u0000\u0000\u0214\u021a\u0003"+
		".\u0017\u0000\u0215\u0216\u0005\u0018\u0000\u0000\u0216\u0217\u0003\u00f6"+
		"{\u0000\u0217\u0218\u0005\u0019\u0000\u0000\u0218\u021a\u0001\u0000\u0000"+
		"\u0000\u0219\u0214\u0001\u0000\u0000\u0000\u0219\u0215\u0001\u0000\u0000"+
		"\u0000\u021a\u021c\u0001\u0000\u0000\u0000\u021b\u021d\u00034\u001a\u0000"+
		"\u021c\u021b\u0001\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000"+
		"\u021d+\u0001\u0000\u0000\u0000\u021e\u021f\u0005\u0018\u0000\u0000\u021f"+
		"\u0220\u0003\"\u0011\u0000\u0220\u0221\u0005\u0019\u0000\u0000\u0221-"+
		"\u0001\u0000\u0000\u0000\u0222\u0224\u0003\u0096K\u0000\u0223\u0225\u0003"+
		"0\u0018\u0000\u0224\u0223\u0001\u0000\u0000\u0000\u0224\u0225\u0001\u0000"+
		"\u0000\u0000\u0225/\u0001\u0000\u0000\u0000\u0226\u0228\u0003\u00ecv\u0000"+
		"\u0227\u0229\u00030\u0018\u0000\u0228\u0227\u0001\u0000\u0000\u0000\u0228"+
		"\u0229\u0001\u0000\u0000\u0000\u0229\u022c\u0001\u0000\u0000\u0000\u022a"+
		"\u022c\u00032\u0019\u0000\u022b\u0226\u0001\u0000\u0000\u0000\u022b\u022a"+
		"\u0001\u0000\u0000\u0000\u022c1\u0001\u0000\u0000\u0000\u022d\u022e\u0006"+
		"\u0019\uffff\uffff\u0000\u022e\u022f\u0005\u001a\u0000\u0000\u022f\u0230"+
		"\u0003Z-\u0000\u0230\u0232\u0005\u001b\u0000\u0000\u0231\u0233\u0003\u00cc"+
		"f\u0000\u0232\u0231\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000"+
		"\u0000\u0233\u023d\u0001\u0000\u0000\u0000\u0234\u0235\n\u0001\u0000\u0000"+
		"\u0235\u0236\u0005\u001a\u0000\u0000\u0236\u0237\u0003\\.\u0000\u0237"+
		"\u0239\u0005\u001b\u0000\u0000\u0238\u023a\u0003\u00ccf\u0000\u0239\u0238"+
		"\u0001\u0000\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u023c"+
		"\u0001\u0000\u0000\u0000\u023b\u0234\u0001\u0000\u0000\u0000\u023c\u023f"+
		"\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023d\u023e"+
		"\u0001\u0000\u0000\u0000\u023e3\u0001\u0000\u0000\u0000\u023f\u023d\u0001"+
		"\u0000\u0000\u0000\u0240\u0242\u0005\u0018\u0000\u0000\u0241\u0243\u0003"+
		"\"\u0011\u0000\u0242\u0241\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000"+
		"\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244\u0247\u0005\u0019"+
		"\u0000\u0000\u0245\u0247\u0003\u0114\u008a\u0000\u0246\u0240\u0001\u0000"+
		"\u0000\u0000\u0246\u0245\u0001\u0000\u0000\u0000\u02475\u0001\u0000\u0000"+
		"\u0000\u0248\u024a\u0005K\u0000\u0000\u0249\u0248\u0001\u0000\u0000\u0000"+
		"\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000"+
		"\u024b\u024e\u0005X\u0000\u0000\u024c\u024d\u0005\u001a\u0000\u0000\u024d"+
		"\u024f\u0005\u001b\u0000\u0000\u024e\u024c\u0001\u0000\u0000\u0000\u024e"+
		"\u024f\u0001\u0000\u0000\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250"+
		"\u0251\u0003:\u001d\u0000\u02517\u0001\u0000\u0000\u0000\u0252\u0253\u0005"+
		"Y\u0000\u0000\u0253\u0254\u0005\u0018\u0000\u0000\u0254\u0255\u0003Z-"+
		"\u0000\u0255\u0256\u0005\u0019\u0000\u0000\u02569\u0001\u0000\u0000\u0000"+
		"\u0257\u025e\u0003&\u0013\u0000\u0258\u0259\u0005\u0018\u0000\u0000\u0259"+
		"\u025a\u0003\u00f6{\u0000\u025a\u025b\u0005\u0019\u0000\u0000\u025b\u025c"+
		"\u0003:\u001d\u0000\u025c\u025e\u0001\u0000\u0000\u0000\u025d\u0257\u0001"+
		"\u0000\u0000\u0000\u025d\u0258\u0001\u0000\u0000\u0000\u025e;\u0001\u0000"+
		"\u0000\u0000\u025f\u0264\u0003:\u001d\u0000\u0260\u0261\u0007\u0005\u0000"+
		"\u0000\u0261\u0263\u0003:\u001d\u0000\u0262\u0260\u0001\u0000\u0000\u0000"+
		"\u0263\u0266\u0001\u0000\u0000\u0000\u0264\u0262\u0001\u0000\u0000\u0000"+
		"\u0264\u0265\u0001\u0000\u0000\u0000\u0265=\u0001\u0000\u0000\u0000\u0266"+
		"\u0264\u0001\u0000\u0000\u0000\u0267\u026c\u0003<\u001e\u0000\u0268\u0269"+
		"\u0007\u0006\u0000\u0000\u0269\u026b\u0003<\u001e\u0000\u026a\u0268\u0001"+
		"\u0000\u0000\u0000\u026b\u026e\u0001\u0000\u0000\u0000\u026c\u026a\u0001"+
		"\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000\u026d?\u0001\u0000"+
		"\u0000\u0000\u026e\u026c\u0001\u0000\u0000\u0000\u026f\u0274\u0003>\u001f"+
		"\u0000\u0270\u0271\u0007\u0007\u0000\u0000\u0271\u0273\u0003>\u001f\u0000"+
		"\u0272\u0270\u0001\u0000\u0000\u0000\u0273\u0276\u0001\u0000\u0000\u0000"+
		"\u0274\u0272\u0001\u0000\u0000\u0000\u0274\u0275\u0001\u0000\u0000\u0000"+
		"\u0275A\u0001\u0000\u0000\u0000\u0276\u0274\u0001\u0000\u0000\u0000\u0277"+
		"\u027d\u0003@ \u0000\u0278\u0279\u0003D\"\u0000\u0279\u027a\u0003@ \u0000"+
		"\u027a\u027c\u0001\u0000\u0000\u0000\u027b\u0278\u0001\u0000\u0000\u0000"+
		"\u027c\u027f\u0001\u0000\u0000\u0000\u027d\u027b\u0001\u0000\u0000\u0000"+
		"\u027d\u027e\u0001\u0000\u0000\u0000\u027eC\u0001\u0000\u0000\u0000\u027f"+
		"\u027d\u0001\u0000\u0000\u0000\u0280\u0281\u0005)\u0000\u0000\u0281\u0285"+
		"\u0005)\u0000\u0000\u0282\u0283\u0005(\u0000\u0000\u0283\u0285\u0005("+
		"\u0000\u0000\u0284\u0280\u0001\u0000\u0000\u0000\u0284\u0282\u0001\u0000"+
		"\u0000\u0000\u0285E\u0001\u0000\u0000\u0000\u0286\u028b\u0003B!\u0000"+
		"\u0287\u0288\u0007\b\u0000\u0000\u0288\u028a\u0003B!\u0000\u0289\u0287"+
		"\u0001\u0000\u0000\u0000\u028a\u028d\u0001\u0000\u0000\u0000\u028b\u0289"+
		"\u0001\u0000\u0000\u0000\u028b\u028c\u0001\u0000\u0000\u0000\u028cG\u0001"+
		"\u0000\u0000\u0000\u028d\u028b\u0001\u0000\u0000\u0000\u028e\u0293\u0003"+
		"F#\u0000\u028f\u0290\u0007\t\u0000\u0000\u0290\u0292\u0003F#\u0000\u0291"+
		"\u028f\u0001\u0000\u0000\u0000\u0292\u0295\u0001\u0000\u0000\u0000\u0293"+
		"\u0291\u0001\u0000\u0000\u0000\u0293\u0294\u0001\u0000\u0000\u0000\u0294"+
		"I\u0001\u0000\u0000\u0000\u0295\u0293\u0001\u0000\u0000\u0000\u0296\u029b"+
		"\u0003H$\u0000\u0297\u0298\u0005$\u0000\u0000\u0298\u029a\u0003H$\u0000"+
		"\u0299\u0297\u0001\u0000\u0000\u0000\u029a\u029d\u0001\u0000\u0000\u0000"+
		"\u029b\u0299\u0001\u0000\u0000\u0000\u029b\u029c\u0001\u0000\u0000\u0000"+
		"\u029cK\u0001\u0000\u0000\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029e"+
		"\u02a3\u0003J%\u0000\u029f\u02a0\u0005#\u0000\u0000\u02a0\u02a2\u0003"+
		"J%\u0000\u02a1\u029f\u0001\u0000\u0000\u0000\u02a2\u02a5\u0001\u0000\u0000"+
		"\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a3\u02a4\u0001\u0000\u0000"+
		"\u0000\u02a4M\u0001\u0000\u0000\u0000\u02a5\u02a3\u0001\u0000\u0000\u0000"+
		"\u02a6\u02ab\u0003L&\u0000\u02a7\u02a8\u0005V\u0000\u0000\u02a8\u02aa"+
		"\u0003L&\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02aa\u02ad\u0001\u0000"+
		"\u0000\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000"+
		"\u0000\u0000\u02acO\u0001\u0000\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000"+
		"\u0000\u02ae\u02b3\u0003N\'\u0000\u02af\u02b0\u00058\u0000\u0000\u02b0"+
		"\u02b2\u0003N\'\u0000\u02b1\u02af\u0001\u0000\u0000\u0000\u02b2\u02b5"+
		"\u0001\u0000\u0000\u0000\u02b3\u02b1\u0001\u0000\u0000\u0000\u02b3\u02b4"+
		"\u0001\u0000\u0000\u0000\u02b4Q\u0001\u0000\u0000\u0000\u02b5\u02b3\u0001"+
		"\u0000\u0000\u0000\u02b6\u02bb\u0003P(\u0000\u02b7\u02b8\u00059\u0000"+
		"\u0000\u02b8\u02ba\u0003P(\u0000\u02b9\u02b7\u0001\u0000\u0000\u0000\u02ba"+
		"\u02bd\u0001\u0000\u0000\u0000\u02bb\u02b9\u0001\u0000\u0000\u0000\u02bb"+
		"\u02bc\u0001\u0000\u0000\u0000\u02bcS\u0001\u0000\u0000\u0000\u02bd\u02bb"+
		"\u0001\u0000\u0000\u0000\u02be\u02c4\u0003R)\u0000\u02bf\u02c0\u0005?"+
		"\u0000\u0000\u02c0\u02c1\u0003Z-\u0000\u02c1\u02c2\u0005@\u0000\u0000"+
		"\u02c2\u02c3\u0003V+\u0000\u02c3\u02c5\u0001\u0000\u0000\u0000\u02c4\u02bf"+
		"\u0001\u0000\u0000\u0000\u02c4\u02c5\u0001\u0000\u0000\u0000\u02c5U\u0001"+
		"\u0000\u0000\u0000\u02c6\u02cc\u0003T*\u0000\u02c7\u02c8\u0003R)\u0000"+
		"\u02c8\u02c9\u0003X,\u0000\u02c9\u02ca\u0003\u0110\u0088\u0000\u02ca\u02cc"+
		"\u0001\u0000\u0000\u0000\u02cb\u02c6\u0001\u0000\u0000\u0000\u02cb\u02c7"+
		"\u0001\u0000\u0000\u0000\u02ccW\u0001\u0000\u0000\u0000\u02cd\u02ce\u0007"+
		"\n\u0000\u0000\u02ceY\u0001\u0000\u0000\u0000\u02cf\u02d4\u0003V+\u0000"+
		"\u02d0\u02d1\u0005<\u0000\u0000\u02d1\u02d3\u0003V+\u0000\u02d2\u02d0"+
		"\u0001\u0000\u0000\u0000\u02d3\u02d6\u0001\u0000\u0000\u0000\u02d4\u02d2"+
		"\u0001\u0000\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5[\u0001"+
		"\u0000\u0000\u0000\u02d6\u02d4\u0001\u0000\u0000\u0000\u02d7\u02d8\u0003"+
		"T*\u0000\u02d8]\u0001\u0000\u0000\u0000\u02d9\u02e6\u0003`0\u0000\u02da"+
		"\u02e6\u0003v;\u0000\u02db\u02dd\u0003\u00ccf\u0000\u02dc\u02db\u0001"+
		"\u0000\u0000\u0000\u02dc\u02dd\u0001\u0000\u0000\u0000\u02dd\u02e3\u0001"+
		"\u0000\u0000\u0000\u02de\u02e4\u0003b1\u0000\u02df\u02e4\u0003d2\u0000"+
		"\u02e0\u02e4\u0003h4\u0000\u02e1\u02e4\u0003l6\u0000\u02e2\u02e4\u0003"+
		"t:\u0000\u02e3\u02de\u0001\u0000\u0000\u0000\u02e3\u02df\u0001\u0000\u0000"+
		"\u0000\u02e3\u02e0\u0001\u0000\u0000\u0000\u02e3\u02e1\u0001\u0000\u0000"+
		"\u0000\u02e3\u02e2\u0001\u0000\u0000\u0000\u02e4\u02e6\u0001\u0000\u0000"+
		"\u0000\u02e5\u02d9\u0001\u0000\u0000\u0000\u02e5\u02da\u0001\u0000\u0000"+
		"\u0000\u02e5\u02dc\u0001\u0000\u0000\u0000\u02e6_\u0001\u0000\u0000\u0000"+
		"\u02e7\u02e9\u0003\u00ccf\u0000\u02e8\u02e7\u0001\u0000\u0000\u0000\u02e8"+
		"\u02e9\u0001\u0000\u0000\u0000\u02e9\u02ee\u0001\u0000\u0000\u0000\u02ea"+
		"\u02ef\u0005E\u0000\u0000\u02eb\u02ec\u0005Z\u0000\u0000\u02ec\u02ef\u0003"+
		"\\.\u0000\u02ed\u02ef\u0005[\u0000\u0000\u02ee\u02ea\u0001\u0000\u0000"+
		"\u0000\u02ee\u02eb\u0001\u0000\u0000\u0000\u02ee\u02ed\u0001\u0000\u0000"+
		"\u0000\u02ef\u02f0\u0001\u0000\u0000\u0000\u02f0\u02f1\u0005@\u0000\u0000"+
		"\u02f1\u02f2\u0003^/\u0000\u02f2a\u0001\u0000\u0000\u0000\u02f3\u02f5"+
		"\u0003Z-\u0000\u02f4\u02f3\u0001\u0000\u0000\u0000\u02f4\u02f5\u0001\u0000"+
		"\u0000\u0000\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6\u02f7\u0005A\u0000"+
		"\u0000\u02f7c\u0001\u0000\u0000\u0000\u02f8\u02fa\u0005\u001c\u0000\u0000"+
		"\u02f9\u02fb\u0003f3\u0000\u02fa\u02f9\u0001\u0000\u0000\u0000\u02fa\u02fb"+
		"\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc\u02fd"+
		"\u0005\u001d\u0000\u0000\u02fde\u0001\u0000\u0000\u0000\u02fe\u0300\u0003"+
		"^/\u0000\u02ff\u02fe\u0001\u0000\u0000\u0000\u0300\u0301\u0001\u0000\u0000"+
		"\u0000\u0301\u02ff\u0001\u0000\u0000\u0000\u0301\u0302\u0001\u0000\u0000"+
		"\u0000\u0302g\u0001\u0000\u0000\u0000\u0303\u0304\u0005\u0012\u0000\u0000"+
		"\u0304\u0305\u0005\u0018\u0000\u0000\u0305\u0306\u0003j5\u0000\u0306\u0307"+
		"\u0005\u0019\u0000\u0000\u0307\u030a\u0003^/\u0000\u0308\u0309\u0005\r"+
		"\u0000\u0000\u0309\u030b\u0003^/\u0000\u030a\u0308\u0001\u0000\u0000\u0000"+
		"\u030a\u030b\u0001\u0000\u0000\u0000\u030b\u0313\u0001\u0000\u0000\u0000"+
		"\u030c\u030d\u0005\\\u0000\u0000\u030d\u030e\u0005\u0018\u0000\u0000\u030e"+
		"\u030f\u0003j5\u0000\u030f\u0310\u0005\u0019\u0000\u0000\u0310\u0311\u0003"+
		"^/\u0000\u0311\u0313\u0001\u0000\u0000\u0000\u0312\u0303\u0001\u0000\u0000"+
		"\u0000\u0312\u030c\u0001\u0000\u0000\u0000\u0313i\u0001\u0000\u0000\u0000"+
		"\u0314\u0320\u0003Z-\u0000\u0315\u0317\u0003\u00ccf\u0000\u0316\u0315"+
		"\u0001\u0000\u0000\u0000\u0316\u0317\u0001\u0000\u0000\u0000\u0317\u0318"+
		"\u0001\u0000\u0000\u0000\u0318\u0319\u0003\u008aE\u0000\u0319\u031d\u0003"+
		"\u00e2q\u0000\u031a\u031b\u0005\'\u0000\u0000\u031b\u031e\u0003\u0110"+
		"\u0088\u0000\u031c\u031e\u0003\u0114\u008a\u0000\u031d\u031a\u0001\u0000"+
		"\u0000\u0000\u031d\u031c\u0001\u0000\u0000\u0000\u031e\u0320\u0001\u0000"+
		"\u0000\u0000\u031f\u0314\u0001\u0000\u0000\u0000\u031f\u0316\u0001\u0000"+
		"\u0000\u0000\u0320k\u0001\u0000\u0000\u0000\u0321\u0322\u0005\u0017\u0000"+
		"\u0000\u0322\u0323\u0005\u0018\u0000\u0000\u0323\u0324\u0003j5\u0000\u0324"+
		"\u0325\u0005\u0019\u0000\u0000\u0325\u0326\u0003^/\u0000\u0326\u0343\u0001"+
		"\u0000\u0000\u0000\u0327\u0328\u0005]\u0000\u0000\u0328\u0329\u0003^/"+
		"\u0000\u0329\u032a\u0005\u0017\u0000\u0000\u032a\u032b\u0005\u0018\u0000"+
		"\u0000\u032b\u032c\u0003Z-\u0000\u032c\u032d\u0005\u0019\u0000\u0000\u032d"+
		"\u032e\u0005A\u0000\u0000\u032e\u0343\u0001\u0000\u0000\u0000\u032f\u0330"+
		"\u0005\u0011\u0000\u0000\u0330\u033d\u0005\u0018\u0000\u0000\u0331\u0333"+
		"\u0003n7\u0000\u0332\u0334\u0003j5\u0000\u0333\u0332\u0001\u0000\u0000"+
		"\u0000\u0333\u0334\u0001\u0000\u0000\u0000\u0334\u0335\u0001\u0000\u0000"+
		"\u0000\u0335\u0337\u0005A\u0000\u0000\u0336\u0338\u0003Z-\u0000\u0337"+
		"\u0336\u0001\u0000\u0000\u0000\u0337\u0338\u0001\u0000\u0000\u0000\u0338"+
		"\u033e\u0001\u0000\u0000\u0000\u0339\u033a\u0003p8\u0000\u033a\u033b\u0005"+
		"@\u0000\u0000\u033b\u033c\u0003r9\u0000\u033c\u033e\u0001\u0000\u0000"+
		"\u0000\u033d\u0331\u0001\u0000\u0000\u0000\u033d\u0339\u0001\u0000\u0000"+
		"\u0000\u033e\u033f\u0001\u0000\u0000\u0000\u033f\u0340\u0005\u0019\u0000"+
		"\u0000\u0340\u0341\u0003^/\u0000\u0341\u0343\u0001\u0000\u0000\u0000\u0342"+
		"\u0321\u0001\u0000\u0000\u0000\u0342\u0327\u0001\u0000\u0000\u0000\u0342"+
		"\u032f\u0001\u0000\u0000\u0000\u0343m\u0001\u0000\u0000\u0000\u0344\u0347"+
		"\u0003b1\u0000\u0345\u0347\u0003\u0080@\u0000\u0346\u0344\u0001\u0000"+
		"\u0000\u0000\u0346\u0345\u0001\u0000\u0000\u0000\u0347o\u0001\u0000\u0000"+
		"\u0000\u0348\u034a\u0003\u00ccf\u0000\u0349\u0348\u0001\u0000\u0000\u0000"+
		"\u0349\u034a\u0001\u0000\u0000\u0000\u034a\u034b\u0001\u0000\u0000\u0000"+
		"\u034b\u034c\u0003\u008aE\u0000\u034c\u034d\u0003\u00e2q\u0000\u034dq"+
		"\u0001\u0000\u0000\u0000\u034e\u0351\u0003Z-\u0000\u034f\u0351\u0003\u0114"+
		"\u008a\u0000\u0350\u034e\u0001\u0000\u0000\u0000\u0350\u034f\u0001\u0000"+
		"\u0000\u0000\u0351s\u0001\u0000\u0000\u0000\u0352\u035c\u0005\u000b\u0000"+
		"\u0000\u0353\u035c\u0005\f\u0000\u0000\u0354\u0357\u0005\u0015\u0000\u0000"+
		"\u0355\u0358\u0003Z-\u0000\u0356\u0358\u0003\u0114\u008a\u0000\u0357\u0355"+
		"\u0001\u0000\u0000\u0000\u0357\u0356\u0001\u0000\u0000\u0000\u0357\u0358"+
		"\u0001\u0000\u0000\u0000\u0358\u035c\u0001\u0000\u0000\u0000\u0359\u035a"+
		"\u0005^\u0000\u0000\u035a\u035c\u0005E\u0000\u0000\u035b\u0352\u0001\u0000"+
		"\u0000\u0000\u035b\u0353\u0001\u0000\u0000\u0000\u035b\u0354\u0001\u0000"+
		"\u0000\u0000\u035b\u0359\u0001\u0000\u0000\u0000\u035c\u035d\u0001\u0000"+
		"\u0000\u0000\u035d\u035e\u0005A\u0000\u0000\u035eu\u0001\u0000\u0000\u0000"+
		"\u035f\u0360\u0003|>\u0000\u0360w\u0001\u0000\u0000\u0000\u0361\u0363"+
		"\u0003z=\u0000\u0362\u0361\u0001\u0000\u0000\u0000\u0363\u0364\u0001\u0000"+
		"\u0000\u0000\u0364\u0362\u0001\u0000\u0000\u0000\u0364\u0365\u0001\u0000"+
		"\u0000\u0000\u0365y\u0001\u0000\u0000\u0000\u0366\u036d\u0003|>\u0000"+
		"\u0367\u036d\u0003\u0108\u0084\u0000\u0368\u036d\u0003\u00cae\u0000\u0369"+
		"\u036d\u0003\u00bc^\u0000\u036a\u036d\u0003\u0084B\u0000\u036b\u036d\u0003"+
		"\u0086C\u0000\u036c\u0366\u0001\u0000\u0000\u0000\u036c\u0367\u0001\u0000"+
		"\u0000\u0000\u036c\u0368\u0001\u0000\u0000\u0000\u036c\u0369\u0001\u0000"+
		"\u0000\u0000\u036c\u036a\u0001\u0000\u0000\u0000\u036c\u036b\u0001\u0000"+
		"\u0000\u0000\u036d{\u0001\u0000\u0000\u0000\u036e\u0377\u0003\u0080@\u0000"+
		"\u036f\u0377\u0003\u00c8d\u0000\u0370\u0377\u0003\u00c0`\u0000\u0371\u0377"+
		"\u0003\u00c4b\u0000\u0372\u0377\u0003\u00c6c\u0000\u0373\u0377\u0003\u0082"+
		"A\u0000\u0374\u0377\u0003~?\u0000\u0375\u0377\u0003\u00acV\u0000\u0376"+
		"\u036e\u0001\u0000\u0000\u0000\u0376\u036f\u0001\u0000\u0000\u0000\u0376"+
		"\u0370\u0001\u0000\u0000\u0000\u0376\u0371\u0001\u0000\u0000\u0000\u0376"+
		"\u0372\u0001\u0000\u0000\u0000\u0376\u0373\u0001\u0000\u0000\u0000\u0376"+
		"\u0374\u0001\u0000\u0000\u0000\u0376\u0375\u0001\u0000\u0000\u0000\u0377"+
		"}\u0001\u0000\u0000\u0000\u0378\u0379\u0005_\u0000\u0000\u0379\u037b\u0005"+
		"E\u0000\u0000\u037a\u037c\u0003\u00ccf\u0000\u037b\u037a\u0001\u0000\u0000"+
		"\u0000\u037b\u037c\u0001\u0000\u0000\u0000\u037c\u037d\u0001\u0000\u0000"+
		"\u0000\u037d\u037e\u0005\'\u0000\u0000\u037e\u037f\u0003\u00f6{\u0000"+
		"\u037f\u0380\u0005A\u0000\u0000\u0380\u007f\u0001\u0000\u0000\u0000\u0381"+
		"\u0383\u0003\u008aE\u0000\u0382\u0381\u0001\u0000\u0000\u0000\u0382\u0383"+
		"\u0001\u0000\u0000\u0000\u0383\u0385\u0001\u0000\u0000\u0000\u0384\u0386"+
		"\u0003\u00deo\u0000\u0385\u0384\u0001\u0000\u0000\u0000\u0385\u0386\u0001"+
		"\u0000\u0000\u0000\u0386\u0387\u0001\u0000\u0000\u0000\u0387\u0390\u0005"+
		"A\u0000\u0000\u0388\u038a\u0003\u00ccf\u0000\u0389\u038b\u0003\u008aE"+
		"\u0000\u038a\u0389\u0001\u0000\u0000\u0000\u038a\u038b\u0001\u0000\u0000"+
		"\u0000\u038b\u038c\u0001\u0000\u0000\u0000\u038c\u038d\u0003\u00deo\u0000"+
		"\u038d\u038e\u0005A\u0000\u0000\u038e\u0390\u0001\u0000\u0000\u0000\u038f"+
		"\u0382\u0001\u0000\u0000\u0000\u038f\u0388\u0001\u0000\u0000\u0000\u0390"+
		"\u0081\u0001\u0000\u0000\u0000\u0391\u0392\u0005`\u0000\u0000\u0392\u0393"+
		"\u0005\u0018\u0000\u0000\u0393\u0394\u0003\\.\u0000\u0394\u0395\u0005"+
		"<\u0000\u0000\u0395\u0396\u0005\u0007\u0000\u0000\u0396\u0397\u0005\u0019"+
		"\u0000\u0000\u0397\u0398\u0005A\u0000\u0000\u0398\u0083\u0001\u0000\u0000"+
		"\u0000\u0399\u039a\u0005A\u0000\u0000\u039a\u0085\u0001\u0000\u0000\u0000"+
		"\u039b\u039c\u0003\u00ccf\u0000\u039c\u039d\u0005A\u0000\u0000\u039d\u0087"+
		"\u0001\u0000\u0000\u0000\u039e\u03a5\u0003\u008cF\u0000\u039f\u03a5\u0003"+
		"\u0092I\u0000\u03a0\u03a5\u0003\u008eG\u0000\u03a1\u03a5\u0005a\u0000"+
		"\u0000\u03a2\u03a5\u0005b\u0000\u0000\u03a3\u03a5\u0005c\u0000\u0000\u03a4"+
		"\u039e\u0001\u0000\u0000\u0000\u03a4\u039f\u0001\u0000\u0000\u0000\u03a4"+
		"\u03a0\u0001\u0000\u0000\u0000\u03a4\u03a1\u0001\u0000\u0000\u0000\u03a4"+
		"\u03a2\u0001\u0000\u0000\u0000\u03a4\u03a3\u0001\u0000\u0000\u0000\u03a5"+
		"\u0089\u0001\u0000\u0000\u0000\u03a6\u03a8\u0003\u0088D\u0000\u03a7\u03a6"+
		"\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000\u0000\u0000\u03a9\u03aa"+
		"\u0001\u0000\u0000\u0000\u03a9\u03a7\u0001\u0000\u0000\u0000\u03aa\u03ac"+
		"\u0001\u0000\u0000\u0000\u03ab\u03ad\u0003\u00ccf\u0000\u03ac\u03ab\u0001"+
		"\u0000\u0000\u0000\u03ac\u03ad\u0001\u0000\u0000\u0000\u03ad\u008b\u0001"+
		"\u0000\u0000\u0000\u03ae\u03af\u0007\u000b\u0000\u0000\u03af\u008d\u0001"+
		"\u0000\u0000\u0000\u03b0\u03b1\u0007\f\u0000\u0000\u03b1\u008f\u0001\u0000"+
		"\u0000\u0000\u03b2\u03b3\u0005E\u0000\u0000\u03b3\u0091\u0001\u0000\u0000"+
		"\u0000\u03b4\u03b7\u0003\u0094J\u0000\u03b5\u03b7\u0003\u00a8T\u0000\u03b6"+
		"\u03b4\u0001\u0000\u0000\u0000\u03b6\u03b5\u0001\u0000\u0000\u0000\u03b7"+
		"\u0093\u0001\u0000\u0000\u0000\u03b8\u03bc\u0003\u009eO\u0000\u03b9\u03bc"+
		"\u0003\u00a4R\u0000\u03ba\u03bc\u0003\u00f0x\u0000\u03bb\u03b8\u0001\u0000"+
		"\u0000\u0000\u03bb\u03b9\u0001\u0000\u0000\u0000\u03bb\u03ba\u0001\u0000"+
		"\u0000\u0000\u03bc\u0095\u0001\u0000\u0000\u0000\u03bd\u03bf\u0003\u0092"+
		"I\u0000\u03be\u03bd\u0001\u0000\u0000\u0000\u03bf\u03c0\u0001\u0000\u0000"+
		"\u0000\u03c0\u03be\u0001\u0000\u0000\u0000\u03c0\u03c1\u0001\u0000\u0000"+
		"\u0000\u03c1\u03c3\u0001\u0000\u0000\u0000\u03c2\u03c4\u0003\u00ccf\u0000"+
		"\u03c3\u03c2\u0001\u0000\u0000\u0000\u03c3\u03c4\u0001\u0000\u0000\u0000"+
		"\u03c4\u0097\u0001\u0000\u0000\u0000\u03c5\u03c7\u0003\u0094J\u0000\u03c6"+
		"\u03c5\u0001\u0000\u0000\u0000\u03c7\u03c8\u0001\u0000\u0000\u0000\u03c8"+
		"\u03c6\u0001\u0000\u0000\u0000\u03c8\u03c9\u0001\u0000\u0000\u0000\u03c9"+
		"\u03cb\u0001\u0000\u0000\u0000\u03ca\u03cc\u0003\u00ccf\u0000\u03cb\u03ca"+
		"\u0001\u0000\u0000\u0000\u03cb\u03cc\u0001\u0000\u0000\u0000\u03cc\u0099"+
		"\u0001\u0000\u0000\u0000\u03cd\u03ce\u0007\r\u0000\u0000\u03ce\u009b\u0001"+
		"\u0000\u0000\u0000\u03cf\u03d0\u0007\u000e\u0000\u0000\u03d0\u009d\u0001"+
		"\u0000\u0000\u0000\u03d1\u03d3\u0003\n\u0005\u0000\u03d2\u03d1\u0001\u0000"+
		"\u0000\u0000\u03d2\u03d3\u0001\u0000\u0000\u0000\u03d3\u03d4\u0001\u0000"+
		"\u0000\u0000\u03d4\u0403\u0003\u00a0P\u0000\u03d5\u0403\u0003\u009cN\u0000"+
		"\u03d6\u03d8\u0003\u009cN\u0000\u03d7\u03d6\u0001\u0000\u0000\u0000\u03d7"+
		"\u03d8\u0001\u0000\u0000\u0000\u03d8\u03da\u0001\u0000\u0000\u0000\u03d9"+
		"\u03db\u0003\u009aM\u0000\u03da\u03d9\u0001\u0000\u0000\u0000\u03db\u03dc"+
		"\u0001\u0000\u0000\u0000\u03dc\u03da\u0001\u0000\u0000\u0000\u03dc\u03dd"+
		"\u0001\u0000\u0000\u0000\u03dd\u0403\u0001\u0000\u0000\u0000\u03de\u03e0"+
		"\u0003\u009cN\u0000\u03df\u03de\u0001\u0000\u0000\u0000\u03df\u03e0\u0001"+
		"\u0000\u0000\u0000\u03e0\u03e1\u0001\u0000\u0000\u0000\u03e1\u0403\u0005"+
		"o\u0000\u0000\u03e2\u03e4\u0003\u009cN\u0000\u03e3\u03e2\u0001\u0000\u0000"+
		"\u0000\u03e3\u03e4\u0001\u0000\u0000\u0000\u03e4\u03e5\u0001\u0000\u0000"+
		"\u0000\u03e5\u0403\u0005p\u0000\u0000\u03e6\u03e8\u0003\u009cN\u0000\u03e7"+
		"\u03e6\u0001\u0000\u0000\u0000\u03e7\u03e8\u0001\u0000\u0000\u0000\u03e8"+
		"\u03e9\u0001\u0000\u0000\u0000\u03e9\u0403\u0005q\u0000\u0000\u03ea\u03ec"+
		"\u0003\u009cN\u0000\u03eb\u03ea\u0001\u0000\u0000\u0000\u03eb\u03ec\u0001"+
		"\u0000\u0000\u0000\u03ec\u03ed\u0001\u0000\u0000\u0000\u03ed\u0403\u0005"+
		"r\u0000\u0000\u03ee\u0403\u0005\u0013\u0000\u0000\u03ef\u0403\u0005\n"+
		"\u0000\u0000\u03f0\u03f2\u0003\u009cN\u0000\u03f1\u03f0\u0001\u0000\u0000"+
		"\u0000\u03f1\u03f2\u0001\u0000\u0000\u0000\u03f2\u03f6\u0001\u0000\u0000"+
		"\u0000\u03f3\u03f5\u0003\u009aM\u0000\u03f4\u03f3\u0001\u0000\u0000\u0000"+
		"\u03f5\u03f8\u0001\u0000\u0000\u0000\u03f6\u03f4\u0001\u0000\u0000\u0000"+
		"\u03f6\u03f7\u0001\u0000\u0000\u0000\u03f7\u03f9\u0001\u0000\u0000\u0000"+
		"\u03f8\u03f6\u0001\u0000\u0000\u0000\u03f9\u0403\u0005\u0014\u0000\u0000"+
		"\u03fa\u0403\u0005\u0010\u0000\u0000\u03fb\u03fd\u0003\u009aM\u0000\u03fc"+
		"\u03fb\u0001\u0000\u0000\u0000\u03fc\u03fd\u0001\u0000\u0000\u0000\u03fd"+
		"\u03fe\u0001\u0000\u0000\u0000\u03fe\u0403\u0005s\u0000\u0000\u03ff\u0403"+
		"\u0005\u0016\u0000\u0000\u0400\u0403\u0005t\u0000\u0000\u0401\u0403\u0003"+
		"\u00a2Q\u0000\u0402\u03d2\u0001\u0000\u0000\u0000\u0402\u03d5\u0001\u0000"+
		"\u0000\u0000\u0402\u03d7\u0001\u0000\u0000\u0000\u0402\u03df\u0001\u0000"+
		"\u0000\u0000\u0402\u03e3\u0001\u0000\u0000\u0000\u0402\u03e7\u0001\u0000"+
		"\u0000\u0000\u0402\u03eb\u0001\u0000\u0000\u0000\u0402\u03ee\u0001\u0000"+
		"\u0000\u0000\u0402\u03ef\u0001\u0000\u0000\u0000\u0402\u03f1\u0001\u0000"+
		"\u0000\u0000\u0402\u03fa\u0001\u0000\u0000\u0000\u0402\u03fc\u0001\u0000"+
		"\u0000\u0000\u0402\u03ff\u0001\u0000\u0000\u0000\u0402\u0400\u0001\u0000"+
		"\u0000\u0000\u0402\u0401\u0001\u0000\u0000\u0000\u0403\u009f\u0001\u0000"+
		"\u0000\u0000\u0404\u0407\u0003\u00a6S\u0000\u0405\u0407\u0003\u0090H\u0000"+
		"\u0406\u0404\u0001\u0000\u0000\u0000\u0406\u0405\u0001\u0000\u0000\u0000"+
		"\u0407\u00a1\u0001\u0000\u0000\u0000\u0408\u0409\u0005u\u0000\u0000\u0409"+
		"\u040c\u0005\u0018\u0000\u0000\u040a\u040d\u0003Z-\u0000\u040b\u040d\u0005"+
		"t\u0000\u0000\u040c\u040a\u0001\u0000\u0000\u0000\u040c\u040b\u0001\u0000"+
		"\u0000\u0000\u040d\u040e\u0001\u0000\u0000\u0000\u040e\u040f\u0005\u0019"+
		"\u0000\u0000\u040f\u00a3\u0001\u0000\u0000\u0000\u0410\u0412\u0005v\u0000"+
		"\u0000\u0411\u0413\u0003\n\u0005\u0000\u0412\u0411\u0001\u0000\u0000\u0000"+
		"\u0412\u0413\u0001\u0000\u0000\u0000\u0413\u0414\u0001\u0000\u0000\u0000"+
		"\u0414\u0415\u0005E\u0000\u0000\u0415\u00a5\u0001\u0000\u0000\u0000\u0416"+
		"\u0417\u0005E\u0000\u0000\u0417\u00a7\u0001\u0000\u0000\u0000\u0418\u0419"+
		"\u0003\u00aaU\u0000\u0419\u041e\u0005\u001c\u0000\u0000\u041a\u041c\u0003"+
		"\u00b2Y\u0000\u041b\u041d\u0005<\u0000\u0000\u041c\u041b\u0001\u0000\u0000"+
		"\u0000\u041c\u041d\u0001\u0000\u0000\u0000\u041d\u041f\u0001\u0000\u0000"+
		"\u0000\u041e\u041a\u0001\u0000\u0000\u0000\u041e\u041f\u0001\u0000\u0000"+
		"\u0000\u041f\u0420\u0001\u0000\u0000\u0000\u0420\u0421\u0005\u001d\u0000"+
		"\u0000\u0421\u00a9\u0001\u0000\u0000\u0000\u0422\u0424\u0003\u00aeW\u0000"+
		"\u0423\u0425\u0003\u00ccf\u0000\u0424\u0423\u0001\u0000\u0000\u0000\u0424"+
		"\u0425\u0001\u0000\u0000\u0000\u0425\u042a\u0001\u0000\u0000\u0000\u0426"+
		"\u0428\u0003\n\u0005\u0000\u0427\u0426\u0001\u0000\u0000\u0000\u0427\u0428"+
		"\u0001\u0000\u0000\u0000\u0428\u0429\u0001\u0000\u0000\u0000\u0429\u042b"+
		"\u0005E\u0000\u0000\u042a\u0427\u0001\u0000\u0000\u0000\u042a\u042b\u0001"+
		"\u0000\u0000\u0000\u042b\u042d\u0001\u0000\u0000\u0000\u042c\u042e\u0003"+
		"\u00b0X\u0000\u042d\u042c\u0001\u0000\u0000\u0000\u042d\u042e\u0001\u0000"+
		"\u0000\u0000\u042e\u00ab\u0001\u0000\u0000\u0000\u042f\u0431\u0003\u00ae"+
		"W\u0000\u0430\u0432\u0003\u00ccf\u0000\u0431\u0430\u0001\u0000\u0000\u0000"+
		"\u0431\u0432\u0001\u0000\u0000\u0000\u0432\u0433\u0001\u0000\u0000\u0000"+
		"\u0433\u0435\u0005E\u0000\u0000\u0434\u0436\u0003\u00b0X\u0000\u0435\u0434"+
		"\u0001\u0000\u0000\u0000\u0435\u0436\u0001\u0000\u0000\u0000\u0436\u0437"+
		"\u0001\u0000\u0000\u0000\u0437\u0438\u0005A\u0000\u0000\u0438\u00ad\u0001"+
		"\u0000\u0000\u0000\u0439\u043b\u0005v\u0000\u0000\u043a\u043c\u0007\u000f"+
		"\u0000\u0000\u043b\u043a\u0001\u0000\u0000\u0000\u043b\u043c\u0001\u0000"+
		"\u0000\u0000\u043c\u00af\u0001\u0000\u0000\u0000\u043d\u043e\u0005@\u0000"+
		"\u0000\u043e\u043f\u0003\u0096K\u0000\u043f\u00b1\u0001\u0000\u0000\u0000"+
		"\u0440\u0445\u0003\u00b4Z\u0000\u0441\u0442\u0005<\u0000\u0000\u0442\u0444"+
		"\u0003\u00b4Z\u0000\u0443\u0441\u0001\u0000\u0000\u0000\u0444\u0447\u0001"+
		"\u0000\u0000\u0000\u0445\u0443\u0001\u0000\u0000\u0000\u0445\u0446\u0001"+
		"\u0000\u0000\u0000\u0446\u00b3\u0001\u0000\u0000\u0000\u0447\u0445\u0001"+
		"\u0000\u0000\u0000\u0448\u044b\u0003\u00b6[\u0000\u0449\u044a\u0005\'"+
		"\u0000\u0000\u044a\u044c\u0003\\.\u0000\u044b\u0449\u0001\u0000\u0000"+
		"\u0000\u044b\u044c\u0001\u0000\u0000\u0000\u044c\u00b5\u0001\u0000\u0000"+
		"\u0000\u044d\u044e\u0005E\u0000\u0000\u044e\u00b7\u0001\u0000\u0000\u0000"+
		"\u044f\u0452\u0003\u00ba]\u0000\u0450\u0452\u0003\u00be_\u0000\u0451\u044f"+
		"\u0001\u0000\u0000\u0000\u0451\u0450\u0001\u0000\u0000\u0000\u0452\u00b9"+
		"\u0001\u0000\u0000\u0000\u0453\u0454\u0005E\u0000\u0000\u0454\u00bb\u0001"+
		"\u0000\u0000\u0000\u0455\u0457\u0005h\u0000\u0000\u0456\u0455\u0001\u0000"+
		"\u0000\u0000\u0456\u0457\u0001\u0000\u0000\u0000\u0457\u0458\u0001\u0000"+
		"\u0000\u0000\u0458\u045b\u0005y\u0000\u0000\u0459\u045c\u0005E\u0000\u0000"+
		"\u045a\u045c\u0003\u00ba]\u0000\u045b\u0459\u0001\u0000\u0000\u0000\u045b"+
		"\u045a\u0001\u0000\u0000\u0000\u045b\u045c\u0001\u0000\u0000\u0000\u045c"+
		"\u045d\u0001\u0000\u0000\u0000\u045d\u045f\u0005\u001c\u0000\u0000\u045e"+
		"\u0460\u0003x<\u0000\u045f\u045e\u0001\u0000\u0000\u0000\u045f\u0460\u0001"+
		"\u0000\u0000\u0000\u0460\u0461\u0001\u0000\u0000\u0000\u0461\u0462\u0005"+
		"\u001d\u0000\u0000\u0462\u00bd\u0001\u0000\u0000\u0000\u0463\u0464\u0005"+
		"E\u0000\u0000\u0464\u00bf\u0001\u0000\u0000\u0000\u0465\u0466\u0005y\u0000"+
		"\u0000\u0466\u0467\u0005E\u0000\u0000\u0467\u0468\u0005\'\u0000\u0000"+
		"\u0468\u0469\u0003\u00c2a\u0000\u0469\u046a\u0005A\u0000\u0000\u046a\u00c1"+
		"\u0001\u0000\u0000\u0000\u046b\u046d\u0003\n\u0005\u0000\u046c\u046b\u0001"+
		"\u0000\u0000\u0000\u046c\u046d\u0001\u0000\u0000\u0000\u046d\u046e\u0001"+
		"\u0000\u0000\u0000\u046e\u046f\u0003\u00b8\\\u0000\u046f\u00c3\u0001\u0000"+
		"\u0000\u0000\u0470\u0476\u0005_\u0000\u0000\u0471\u0473\u0005z\u0000\u0000"+
		"\u0472\u0471\u0001\u0000\u0000\u0000\u0472\u0473\u0001\u0000\u0000\u0000"+
		"\u0473\u0474\u0001\u0000\u0000\u0000\u0474\u0477\u0003\n\u0005\u0000\u0475"+
		"\u0477\u0005K\u0000\u0000\u0476\u0472\u0001\u0000\u0000\u0000\u0476\u0475"+
		"\u0001\u0000\u0000\u0000\u0477\u0478\u0001\u0000\u0000\u0000\u0478\u0479"+
		"\u0003\u0006\u0003\u0000\u0479\u047a\u0005A\u0000\u0000\u047a\u00c5\u0001"+
		"\u0000\u0000\u0000\u047b\u047d\u0003\u00ccf\u0000\u047c\u047b\u0001\u0000"+
		"\u0000\u0000\u047c\u047d\u0001\u0000\u0000\u0000\u047d\u047e\u0001\u0000"+
		"\u0000\u0000\u047e\u047f\u0005_\u0000\u0000\u047f\u0481\u0005y\u0000\u0000"+
		"\u0480\u0482\u0003\n\u0005\u0000\u0481\u0480\u0001\u0000\u0000\u0000\u0481"+
		"\u0482\u0001\u0000\u0000\u0000\u0482\u0483\u0001\u0000\u0000\u0000\u0483"+
		"\u0484\u0003\u00b8\\\u0000\u0484\u0485\u0005A\u0000\u0000\u0485\u00c7"+
		"\u0001\u0000\u0000\u0000\u0486\u0487\u0005{\u0000\u0000\u0487\u0488\u0005"+
		"\u0018\u0000\u0000\u0488\u0489\u0005\u0007\u0000\u0000\u0489\u048a\u0005"+
		"\u0019\u0000\u0000\u048a\u048b\u0005A\u0000\u0000\u048b\u00c9\u0001\u0000"+
		"\u0000\u0000\u048c\u048d\u0005g\u0000\u0000\u048d\u0494\u0005\u0007\u0000"+
		"\u0000\u048e\u0490\u0005\u001c\u0000\u0000\u048f\u0491\u0003x<\u0000\u0490"+
		"\u048f\u0001\u0000\u0000\u0000\u0490\u0491\u0001\u0000\u0000\u0000\u0491"+
		"\u0492\u0001\u0000\u0000\u0000\u0492\u0495\u0005\u001d\u0000\u0000\u0493"+
		"\u0495\u0003z=\u0000\u0494\u048e\u0001\u0000\u0000\u0000\u0494\u0493\u0001"+
		"\u0000\u0000\u0000\u0495\u00cb\u0001\u0000\u0000\u0000\u0496\u0498\u0003"+
		"\u00ceg\u0000\u0497\u0496\u0001\u0000\u0000\u0000\u0498\u0499\u0001\u0000"+
		"\u0000\u0000\u0499\u0497\u0001\u0000\u0000\u0000\u0499\u049a\u0001\u0000"+
		"\u0000\u0000\u049a\u00cd\u0001\u0000\u0000\u0000\u049b\u049c\u0005\u001a"+
		"\u0000\u0000\u049c\u049e\u0005\u001a\u0000\u0000\u049d\u049f\u0003\u00d2"+
		"i\u0000\u049e\u049d\u0001\u0000\u0000\u0000\u049e\u049f\u0001\u0000\u0000"+
		"\u0000\u049f\u04a0\u0001\u0000\u0000\u0000\u04a0\u04a1\u0005\u001b\u0000"+
		"\u0000\u04a1\u04a4\u0005\u001b\u0000\u0000\u04a2\u04a4\u0003\u00d0h\u0000"+
		"\u04a3\u049b\u0001\u0000\u0000\u0000\u04a3\u04a2\u0001\u0000\u0000\u0000"+
		"\u04a4\u00cf\u0001\u0000\u0000\u0000\u04a5\u04a6\u0005|\u0000\u0000\u04a6"+
		"\u04a9\u0005\u0018\u0000\u0000\u04a7\u04aa\u0003\u00f6{\u0000\u04a8\u04aa"+
		"\u0003\\.\u0000\u04a9\u04a7\u0001\u0000\u0000\u0000\u04a9\u04a8\u0001"+
		"\u0000\u0000\u0000\u04aa\u04ac\u0001\u0000\u0000\u0000\u04ab\u04ad\u0005"+
		"D\u0000\u0000\u04ac\u04ab\u0001\u0000\u0000\u0000\u04ac\u04ad\u0001\u0000"+
		"\u0000\u0000\u04ad\u04ae\u0001\u0000\u0000\u0000\u04ae\u04af\u0005\u0019"+
		"\u0000\u0000\u04af\u00d1\u0001\u0000\u0000\u0000\u04b0\u04b5\u0003\u00d4"+
		"j\u0000\u04b1\u04b2\u0005<\u0000\u0000\u04b2\u04b4\u0003\u00d4j\u0000"+
		"\u04b3\u04b1\u0001\u0000\u0000\u0000\u04b4\u04b7\u0001\u0000\u0000\u0000"+
		"\u04b5\u04b3\u0001\u0000\u0000\u0000\u04b5\u04b6\u0001\u0000\u0000\u0000"+
		"\u04b6\u04b9\u0001\u0000\u0000\u0000\u04b7\u04b5\u0001\u0000\u0000\u0000"+
		"\u04b8\u04ba\u0005D\u0000\u0000\u04b9\u04b8\u0001\u0000\u0000\u0000\u04b9"+
		"\u04ba\u0001\u0000\u0000\u0000\u04ba\u00d3\u0001\u0000\u0000\u0000\u04bb"+
		"\u04bc\u0003\u00d6k\u0000\u04bc\u04bd\u0005K\u0000\u0000\u04bd\u04bf\u0001"+
		"\u0000\u0000\u0000\u04be\u04bb\u0001\u0000\u0000\u0000\u04be\u04bf\u0001"+
		"\u0000\u0000\u0000\u04bf\u04c0\u0001\u0000\u0000\u0000\u04c0\u04c2\u0005"+
		"E\u0000\u0000\u04c1\u04c3\u0003\u00d8l\u0000\u04c2\u04c1\u0001\u0000\u0000"+
		"\u0000\u04c2\u04c3\u0001\u0000\u0000\u0000\u04c3\u00d5\u0001\u0000\u0000"+
		"\u0000\u04c4\u04c5\u0005E\u0000\u0000\u04c5\u00d7\u0001\u0000\u0000\u0000"+
		"\u04c6\u04c8\u0005\u0018\u0000\u0000\u04c7\u04c9\u0003\u00dam\u0000\u04c8"+
		"\u04c7\u0001\u0000\u0000\u0000\u04c8\u04c9\u0001\u0000\u0000\u0000\u04c9"+
		"\u04ca\u0001\u0000\u0000\u0000\u04ca\u04cb\u0005\u0019\u0000\u0000\u04cb"+
		"\u00d9\u0001\u0000\u0000\u0000\u04cc\u04ce\u0003\u00dcn\u0000\u04cd\u04cc"+
		"\u0001\u0000\u0000\u0000\u04ce\u04cf\u0001\u0000\u0000\u0000\u04cf\u04cd"+
		"\u0001\u0000\u0000\u0000\u04cf\u04d0\u0001\u0000\u0000\u0000\u04d0\u00db"+
		"\u0001\u0000\u0000\u0000\u04d1\u04d2\u0005\u0018\u0000\u0000\u04d2\u04d3"+
		"\u0003\u00dam\u0000\u04d3\u04d4\u0005\u0019\u0000\u0000\u04d4\u04e3\u0001"+
		"\u0000\u0000\u0000\u04d5\u04d6\u0005\u001a\u0000\u0000\u04d6\u04d7\u0003"+
		"\u00dam\u0000\u04d7\u04d8\u0005\u001b\u0000\u0000\u04d8\u04e3\u0001\u0000"+
		"\u0000\u0000\u04d9\u04da\u0005\u001c\u0000\u0000\u04da\u04db\u0003\u00da"+
		"m\u0000\u04db\u04dc\u0005\u001d\u0000\u0000\u04dc\u04e3\u0001\u0000\u0000"+
		"\u0000\u04dd\u04df\b\u0010\u0000\u0000\u04de\u04dd\u0001\u0000\u0000\u0000"+
		"\u04df\u04e0\u0001\u0000\u0000\u0000\u04e0\u04de\u0001\u0000\u0000\u0000"+
		"\u04e0\u04e1\u0001\u0000\u0000\u0000\u04e1\u04e3\u0001\u0000\u0000\u0000"+
		"\u04e2\u04d1\u0001\u0000\u0000\u0000\u04e2\u04d5\u0001\u0000\u0000\u0000"+
		"\u04e2\u04d9\u0001\u0000\u0000\u0000\u04e2\u04de\u0001\u0000\u0000\u0000"+
		"\u04e3\u00dd\u0001\u0000\u0000\u0000\u04e4\u04e9\u0003\u00e0p\u0000\u04e5"+
		"\u04e6\u0005<\u0000\u0000\u04e6\u04e8\u0003\u00e0p\u0000\u04e7\u04e5\u0001"+
		"\u0000\u0000\u0000\u04e8\u04eb\u0001\u0000\u0000\u0000\u04e9\u04e7\u0001"+
		"\u0000\u0000\u0000\u04e9\u04ea\u0001\u0000\u0000\u0000\u04ea\u00df\u0001"+
		"\u0000\u0000\u0000\u04eb\u04e9\u0001\u0000\u0000\u0000\u04ec\u04ee\u0003"+
		"\u00e2q\u0000\u04ed\u04ef\u0003\u010c\u0086\u0000\u04ee\u04ed\u0001\u0000"+
		"\u0000\u0000\u04ee\u04ef\u0001\u0000\u0000\u0000\u04ef\u00e1\u0001\u0000"+
		"\u0000\u0000\u04f0\u04f6\u0003\u00e4r\u0000\u04f1\u04f2\u0003\u00e6s\u0000"+
		"\u04f2\u04f3\u0003\u00e8t\u0000\u04f3\u04f4\u0003\u00eau\u0000\u04f4\u04f6"+
		"\u0001\u0000\u0000\u0000\u04f5\u04f0\u0001\u0000\u0000\u0000\u04f5\u04f1"+
		"\u0001\u0000\u0000\u0000\u04f6\u00e3\u0001\u0000\u0000\u0000\u04f7\u04f9"+
		"\u0003\u00ecv\u0000\u04f8\u04fa\u0005}\u0000\u0000\u04f9\u04f8\u0001\u0000"+
		"\u0000\u0000\u04f9\u04fa\u0001\u0000\u0000\u0000\u04fa\u04fc\u0001\u0000"+
		"\u0000\u0000\u04fb\u04f7\u0001\u0000\u0000\u0000\u04fc\u04ff\u0001\u0000"+
		"\u0000\u0000\u04fd\u04fb\u0001\u0000\u0000\u0000\u04fd\u04fe\u0001\u0000"+
		"\u0000\u0000\u04fe\u0500\u0001\u0000\u0000\u0000\u04ff\u04fd\u0001\u0000"+
		"\u0000\u0000\u0500\u0501\u0003\u00e6s\u0000\u0501\u00e5\u0001\u0000\u0000"+
		"\u0000\u0502\u0503\u0006s\uffff\uffff\u0000\u0503\u0505\u0003\u00f4z\u0000"+
		"\u0504\u0506\u0003\u00ccf\u0000\u0505\u0504\u0001\u0000\u0000\u0000\u0505"+
		"\u0506\u0001\u0000\u0000\u0000\u0506\u050c\u0001\u0000\u0000\u0000\u0507"+
		"\u0508\u0005\u0018\u0000\u0000\u0508\u0509\u0003\u00e4r\u0000\u0509\u050a"+
		"\u0005\u0019\u0000\u0000\u050a\u050c\u0001\u0000\u0000\u0000\u050b\u0502"+
		"\u0001\u0000\u0000\u0000\u050b\u0507\u0001\u0000\u0000\u0000\u050c\u051b"+
		"\u0001\u0000\u0000\u0000\u050d\u0517\n\u0002\u0000\u0000\u050e\u0518\u0003"+
		"\u00e8t\u0000\u050f\u0511\u0005\u001a\u0000\u0000\u0510\u0512\u0003\\"+
		".\u0000\u0511\u0510\u0001\u0000\u0000\u0000\u0511\u0512\u0001\u0000\u0000"+
		"\u0000\u0512\u0513\u0001\u0000\u0000\u0000\u0513\u0515\u0005\u001b\u0000"+
		"\u0000\u0514\u0516\u0003\u00ccf\u0000\u0515\u0514\u0001\u0000\u0000\u0000"+
		"\u0515\u0516\u0001\u0000\u0000\u0000\u0516\u0518\u0001\u0000\u0000\u0000"+
		"\u0517\u050e\u0001\u0000\u0000\u0000\u0517\u050f\u0001\u0000\u0000\u0000"+
		"\u0518\u051a\u0001\u0000\u0000\u0000\u0519\u050d\u0001\u0000\u0000\u0000"+
		"\u051a\u051d\u0001\u0000\u0000\u0000\u051b\u0519\u0001\u0000\u0000\u0000"+
		"\u051b\u051c\u0001\u0000\u0000\u0000\u051c\u00e7\u0001\u0000\u0000\u0000"+
		"\u051d\u051b\u0001\u0000\u0000\u0000\u051e\u0520\u0005\u0018\u0000\u0000"+
		"\u051f\u0521\u0003\u0102\u0081\u0000\u0520\u051f\u0001\u0000\u0000\u0000"+
		"\u0520\u0521\u0001\u0000\u0000\u0000\u0521\u0522\u0001\u0000\u0000\u0000"+
		"\u0522\u0524\u0005\u0019\u0000\u0000\u0523\u0525\u0003\u00eew\u0000\u0524"+
		"\u0523\u0001\u0000\u0000\u0000\u0524\u0525\u0001\u0000\u0000\u0000\u0525"+
		"\u0527\u0001\u0000\u0000\u0000\u0526\u0528\u0003\u00f2y\u0000\u0527\u0526"+
		"\u0001\u0000\u0000\u0000\u0527\u0528\u0001\u0000\u0000\u0000\u0528\u052a"+
		"\u0001\u0000\u0000\u0000\u0529\u052b\u0003\u00ccf\u0000\u052a\u0529\u0001"+
		"\u0000\u0000\u0000\u052a\u052b\u0001\u0000\u0000\u0000\u052b\u00e9\u0001"+
		"\u0000\u0000\u0000\u052c\u052d\u0005>\u0000\u0000\u052d\u052f\u0003\u0098"+
		"L\u0000\u052e\u0530\u0003\u00f8|\u0000\u052f\u052e\u0001\u0000\u0000\u0000"+
		"\u052f\u0530\u0001\u0000\u0000\u0000\u0530\u00eb\u0001\u0000\u0000\u0000"+
		"\u0531\u0533\u0007\u0011\u0000\u0000\u0532\u0534\u0003\u00ccf\u0000\u0533"+
		"\u0532\u0001\u0000\u0000\u0000\u0533\u0534\u0001\u0000\u0000\u0000\u0534"+
		"\u0540\u0001\u0000\u0000\u0000\u0535\u0537\u0003\n\u0005\u0000\u0536\u0535"+
		"\u0001\u0000\u0000\u0000\u0536\u0537\u0001\u0000\u0000\u0000\u0537\u0538"+
		"\u0001\u0000\u0000\u0000\u0538\u053a\u0005 \u0000\u0000\u0539\u053b\u0003"+
		"\u00ccf\u0000\u053a\u0539\u0001\u0000\u0000\u0000\u053a\u053b\u0001\u0000"+
		"\u0000\u0000\u053b\u053d\u0001\u0000\u0000\u0000\u053c\u053e\u0003\u00ee"+
		"w\u0000\u053d\u053c\u0001\u0000\u0000\u0000\u053d\u053e\u0001\u0000\u0000"+
		"\u0000\u053e\u0540\u0001\u0000\u0000\u0000\u053f\u0531\u0001\u0000\u0000"+
		"\u0000\u053f\u0536\u0001\u0000\u0000\u0000\u0540\u00ed\u0001\u0000\u0000"+
		"\u0000\u0541\u0543\u0003\u00f0x\u0000\u0542\u0541\u0001\u0000\u0000\u0000"+
		"\u0543\u0544\u0001\u0000\u0000\u0000\u0544\u0542\u0001\u0000\u0000\u0000"+
		"\u0544\u0545\u0001\u0000\u0000\u0000\u0545\u00ef\u0001\u0000\u0000\u0000"+
		"\u0546\u0547\u0007\u0012\u0000\u0000\u0547\u00f1\u0001\u0000\u0000\u0000"+
		"\u0548\u0549\u0007\u0011\u0000\u0000\u0549\u00f3\u0001\u0000\u0000\u0000"+
		"\u054a\u054c\u0005D\u0000\u0000\u054b\u054a\u0001\u0000\u0000\u0000\u054b"+
		"\u054c\u0001\u0000\u0000\u0000\u054c\u054d\u0001\u0000\u0000\u0000\u054d"+
		"\u054e\u0003\u0004\u0002\u0000\u054e\u00f5\u0001\u0000\u0000\u0000\u054f"+
		"\u0551\u0003\u0096K\u0000\u0550\u0552\u0003\u00f8|\u0000\u0551\u0550\u0001"+
		"\u0000\u0000\u0000\u0551\u0552\u0001\u0000\u0000\u0000\u0552\u00f7\u0001"+
		"\u0000\u0000\u0000\u0553\u055c\u0003\u00fa}\u0000\u0554\u0556\u0003\u00fc"+
		"~\u0000\u0555\u0554\u0001\u0000\u0000\u0000\u0555\u0556\u0001\u0000\u0000"+
		"\u0000\u0556\u0557\u0001\u0000\u0000\u0000\u0557\u0558\u0003\u00e8t\u0000"+
		"\u0558\u0559\u0003\u00eau\u0000\u0559\u055c\u0001\u0000\u0000\u0000\u055a"+
		"\u055c\u0003\u00fe\u007f\u0000\u055b\u0553\u0001\u0000\u0000\u0000\u055b"+
		"\u0555\u0001\u0000\u0000\u0000\u055b\u055a\u0001\u0000\u0000\u0000\u055c"+
		"\u00f9\u0001\u0000\u0000\u0000\u055d\u0567\u0003\u00fc~\u0000\u055e\u0560"+
		"\u0003\u00ecv\u0000\u055f\u055e\u0001\u0000\u0000\u0000\u0560\u0561\u0001"+
		"\u0000\u0000\u0000\u0561\u055f\u0001\u0000\u0000\u0000\u0561\u0562\u0001"+
		"\u0000\u0000\u0000\u0562\u0564\u0001\u0000\u0000\u0000\u0563\u0565\u0003"+
		"\u00fc~\u0000\u0564\u0563\u0001\u0000\u0000\u0000\u0564\u0565\u0001\u0000"+
		"\u0000\u0000\u0565\u0567\u0001\u0000\u0000\u0000\u0566\u055d\u0001\u0000"+
		"\u0000\u0000\u0566\u055f\u0001\u0000\u0000\u0000\u0567\u00fb\u0001\u0000"+
		"\u0000\u0000\u0568\u0569\u0006~\uffff\uffff\u0000\u0569\u0577\u0003\u00e8"+
		"t\u0000\u056a\u056c\u0005\u001a\u0000\u0000\u056b\u056d\u0003\\.\u0000"+
		"\u056c\u056b\u0001\u0000\u0000\u0000\u056c\u056d\u0001\u0000\u0000\u0000"+
		"\u056d\u056e\u0001\u0000\u0000\u0000\u056e\u0570\u0005\u001b\u0000\u0000"+
		"\u056f\u0571\u0003\u00ccf\u0000\u0570\u056f\u0001\u0000\u0000\u0000\u0570"+
		"\u0571\u0001\u0000\u0000\u0000\u0571\u0577\u0001\u0000\u0000\u0000\u0572"+
		"\u0573\u0005\u0018\u0000\u0000\u0573\u0574\u0003\u00fa}\u0000\u0574\u0575"+
		"\u0005\u0019\u0000\u0000\u0575\u0577\u0001\u0000\u0000\u0000\u0576\u0568"+
		"\u0001\u0000\u0000\u0000\u0576\u056a\u0001\u0000\u0000\u0000\u0576\u0572"+
		"\u0001\u0000\u0000\u0000\u0577\u0587\u0001\u0000\u0000\u0000\u0578\u0583"+
		"\n\u0004\u0000\u0000\u0579\u0584\u0003\u00e8t\u0000\u057a\u057b\u0003"+
		"\u00fc~\u0000\u057b\u057d\u0005\u001a\u0000\u0000\u057c\u057e\u0003\\"+
		".\u0000\u057d\u057c\u0001\u0000\u0000\u0000\u057d\u057e\u0001\u0000\u0000"+
		"\u0000\u057e\u057f\u0001\u0000\u0000\u0000\u057f\u0581\u0005\u001b\u0000"+
		"\u0000\u0580\u0582\u0003\u00ccf\u0000\u0581\u0580\u0001\u0000\u0000\u0000"+
		"\u0581\u0582\u0001\u0000\u0000\u0000\u0582\u0584\u0001\u0000\u0000\u0000"+
		"\u0583\u0579\u0001\u0000\u0000\u0000\u0583\u057a\u0001\u0000\u0000\u0000"+
		"\u0584\u0586\u0001\u0000\u0000\u0000\u0585\u0578\u0001\u0000\u0000\u0000"+
		"\u0586\u0589\u0001\u0000\u0000\u0000\u0587\u0585\u0001\u0000\u0000\u0000"+
		"\u0587\u0588\u0001\u0000\u0000\u0000\u0588\u00fd\u0001\u0000\u0000\u0000"+
		"\u0589\u0587\u0001\u0000\u0000\u0000\u058a\u058c\u0003\u00ecv\u0000\u058b"+
		"\u058a\u0001\u0000\u0000\u0000\u058c\u058f\u0001\u0000\u0000\u0000\u058d"+
		"\u058b\u0001\u0000\u0000\u0000\u058d\u058e\u0001\u0000\u0000\u0000\u058e"+
		"\u0590\u0001\u0000\u0000\u0000\u058f\u058d\u0001\u0000\u0000\u0000\u0590"+
		"\u0591\u0003\u0100\u0080\u0000\u0591\u00ff\u0001\u0000\u0000\u0000\u0592"+
		"\u0593\u0006\u0080\uffff\uffff\u0000\u0593\u0594\u0005D\u0000\u0000\u0594"+
		"\u05a3\u0001\u0000\u0000\u0000\u0595\u059f\n\u0002\u0000\u0000\u0596\u05a0"+
		"\u0003\u00e8t\u0000\u0597\u0599\u0005\u001a\u0000\u0000\u0598\u059a\u0003"+
		"\\.\u0000\u0599\u0598\u0001\u0000\u0000\u0000\u0599\u059a\u0001\u0000"+
		"\u0000\u0000\u059a\u059b\u0001\u0000\u0000\u0000\u059b\u059d\u0005\u001b"+
		"\u0000\u0000\u059c\u059e\u0003\u00ccf\u0000\u059d\u059c\u0001\u0000\u0000"+
		"\u0000\u059d\u059e\u0001\u0000\u0000\u0000\u059e\u05a0\u0001\u0000\u0000"+
		"\u0000\u059f\u0596\u0001\u0000\u0000\u0000\u059f\u0597\u0001\u0000\u0000"+
		"\u0000\u05a0\u05a2\u0001\u0000\u0000\u0000\u05a1\u0595\u0001\u0000\u0000"+
		"\u0000\u05a2\u05a5\u0001\u0000\u0000\u0000\u05a3\u05a1\u0001\u0000\u0000"+
		"\u0000\u05a3\u05a4\u0001\u0000\u0000\u0000\u05a4\u0101\u0001\u0000\u0000"+
		"\u0000\u05a5\u05a3\u0001\u0000\u0000\u0000\u05a6\u05ab\u0003\u0104\u0082"+
		"\u0000\u05a7\u05a9\u0005<\u0000\u0000\u05a8\u05a7\u0001\u0000\u0000\u0000"+
		"\u05a8\u05a9\u0001\u0000\u0000\u0000\u05a9\u05aa\u0001\u0000\u0000\u0000"+
		"\u05aa\u05ac\u0005D\u0000\u0000\u05ab\u05a8\u0001\u0000\u0000\u0000\u05ab"+
		"\u05ac\u0001\u0000\u0000\u0000\u05ac\u0103\u0001\u0000\u0000\u0000\u05ad"+
		"\u05b2\u0003\u0106\u0083\u0000\u05ae\u05af\u0005<\u0000\u0000\u05af\u05b1"+
		"\u0003\u0106\u0083\u0000\u05b0\u05ae\u0001\u0000\u0000\u0000\u05b1\u05b4"+
		"\u0001\u0000\u0000\u0000\u05b2\u05b0\u0001\u0000\u0000\u0000\u05b2\u05b3"+
		"\u0001\u0000\u0000\u0000\u05b3\u0105\u0001\u0000\u0000\u0000\u05b4\u05b2"+
		"\u0001\u0000\u0000\u0000\u05b5\u05b7\u0003\u00ccf\u0000\u05b6\u05b5\u0001"+
		"\u0000\u0000\u0000\u05b6\u05b7\u0001\u0000\u0000\u0000\u05b7\u05b8\u0001"+
		"\u0000\u0000\u0000\u05b8\u05bd\u0003\u008aE\u0000\u05b9\u05be\u0003\u00e2"+
		"q\u0000\u05ba\u05bc\u0003\u00f8|\u0000\u05bb\u05ba\u0001\u0000\u0000\u0000"+
		"\u05bb\u05bc\u0001\u0000\u0000\u0000\u05bc\u05be\u0001\u0000\u0000\u0000"+
		"\u05bd\u05b9\u0001\u0000\u0000\u0000\u05bd\u05bb\u0001\u0000\u0000\u0000"+
		"\u05be\u05c1\u0001\u0000\u0000\u0000\u05bf\u05c0\u0005\'\u0000\u0000\u05c0"+
		"\u05c2\u0003\u0110\u0088\u0000\u05c1\u05bf\u0001\u0000\u0000\u0000\u05c1"+
		"\u05c2\u0001\u0000\u0000\u0000\u05c2\u0107\u0001\u0000\u0000\u0000\u05c3"+
		"\u05c5\u0003\u00ccf\u0000\u05c4\u05c3\u0001\u0000\u0000\u0000\u05c4\u05c5"+
		"\u0001\u0000\u0000\u0000\u05c5\u05c7\u0001\u0000\u0000\u0000\u05c6\u05c8"+
		"\u0003\u008aE\u0000\u05c7\u05c6\u0001\u0000\u0000\u0000\u05c7\u05c8\u0001"+
		"\u0000\u0000\u0000\u05c8\u05c9\u0001\u0000\u0000\u0000\u05c9\u05ca\u0003"+
		"\u00e2q\u0000\u05ca\u05cb\u0003\u010a\u0085\u0000\u05cb\u0109\u0001\u0000"+
		"\u0000\u0000\u05cc\u05d1\u0003d2\u0000\u05cd\u05ce\u0005\'\u0000\u0000"+
		"\u05ce\u05cf\u0007\u0013\u0000\u0000\u05cf\u05d1\u0005A\u0000\u0000\u05d0"+
		"\u05cc\u0001\u0000\u0000\u0000\u05d0\u05cd\u0001\u0000\u0000\u0000\u05d1"+
		"\u010b\u0001\u0000\u0000\u0000\u05d2\u05d8\u0003\u010e\u0087\u0000\u05d3"+
		"\u05d4\u0005\u0018\u0000\u0000\u05d4\u05d5\u0003\"\u0011\u0000\u05d5\u05d6"+
		"\u0005\u0019\u0000\u0000\u05d6\u05d8\u0001\u0000\u0000\u0000\u05d7\u05d2"+
		"\u0001\u0000\u0000\u0000\u05d7\u05d3\u0001\u0000\u0000\u0000\u05d8\u010d"+
		"\u0001\u0000\u0000\u0000\u05d9\u05da\u0005\'\u0000\u0000\u05da\u05dd\u0003"+
		"\u0110\u0088\u0000\u05db\u05dd\u0003\u0114\u008a\u0000\u05dc\u05d9\u0001"+
		"\u0000\u0000\u0000\u05dc\u05db\u0001\u0000\u0000\u0000\u05dd\u010f\u0001"+
		"\u0000\u0000\u0000\u05de\u05e2\u0003V+\u0000\u05df\u05e2\u0003\u0114\u008a"+
		"\u0000\u05e0\u05e2\u0003\u0120\u0090\u0000\u05e1\u05de\u0001\u0000\u0000"+
		"\u0000\u05e1\u05df\u0001\u0000\u0000\u0000\u05e1\u05e0\u0001\u0000\u0000"+
		"\u0000\u05e2\u0111\u0001\u0000\u0000\u0000\u05e3\u05e5\u0003\u0110\u0088"+
		"\u0000\u05e4\u05e6\u0005D\u0000\u0000\u05e5\u05e4\u0001\u0000\u0000\u0000"+
		"\u05e5\u05e6\u0001\u0000\u0000\u0000\u05e6\u05ee\u0001\u0000\u0000\u0000"+
		"\u05e7\u05e8\u0005<\u0000\u0000\u05e8\u05ea\u0003\u0110\u0088\u0000\u05e9"+
		"\u05eb\u0005D\u0000\u0000\u05ea\u05e9\u0001\u0000\u0000\u0000\u05ea\u05eb"+
		"\u0001\u0000\u0000\u0000\u05eb\u05ed\u0001\u0000\u0000\u0000\u05ec\u05e7"+
		"\u0001\u0000\u0000\u0000\u05ed\u05f0\u0001\u0000\u0000\u0000\u05ee\u05ec"+
		"\u0001\u0000\u0000\u0000\u05ee\u05ef\u0001\u0000\u0000\u0000\u05ef\u0113"+
		"\u0001\u0000\u0000\u0000\u05f0\u05ee\u0001\u0000\u0000\u0000\u05f1\u05f6"+
		"\u0005\u001c\u0000\u0000\u05f2\u05f4\u0003\u0112\u0089\u0000\u05f3\u05f5"+
		"\u0005<\u0000\u0000\u05f4\u05f3\u0001\u0000\u0000\u0000\u05f4\u05f5\u0001"+
		"\u0000\u0000\u0000\u05f5\u05f7\u0001\u0000\u0000\u0000\u05f6\u05f2\u0001"+
		"\u0000\u0000\u0000\u05f6\u05f7\u0001\u0000\u0000\u0000\u05f7\u05f8\u0001"+
		"\u0000\u0000\u0000\u05f8\u05f9\u0005\u001d\u0000\u0000\u05f9\u0115\u0001"+
		"\u0000\u0000\u0000\u05fa\u05fb\u0005E\u0000\u0000\u05fb\u0117\u0001\u0000"+
		"\u0000\u0000\u05fc\u05fd\u0005\u007f\u0000\u0000\u05fd\u05fe\u0003\u011c"+
		"\u008e\u0000\u05fe\u0119\u0001\u0000\u0000\u0000\u05ff\u0603\u0005\u007f"+
		"\u0000\u0000\u0600\u0601\u0005\u0007\u0000\u0000\u0601\u0604\u0005E\u0000"+
		"\u0000\u0602\u0604\u0005\u0080\u0000\u0000\u0603\u0600\u0001\u0000\u0000"+
		"\u0000\u0603\u0602\u0001\u0000\u0000\u0000\u0604\u011b\u0001\u0000\u0000"+
		"\u0000\u0605\u061c\u0001\u0000\u0000\u0000\u0606\u061c\u0005\u001e\u0000"+
		"\u0000\u0607\u061c\u0005\u001f\u0000\u0000\u0608\u061c\u0005!\u0000\u0000"+
		"\u0609\u061c\u0005\"\u0000\u0000\u060a\u061c\u0005$\u0000\u0000\u060b"+
		"\u061c\u0005V\u0000\u0000\u060c\u061c\u0005&\u0000\u0000\u060d\u061c\u0005"+
		"\'\u0000\u0000\u060e\u061c\u0005)\u0000\u0000\u060f\u061c\u0005(\u0000"+
		"\u0000\u0610\u061c\u00057\u0000\u0000\u0611\u061c\u00054\u0000\u0000\u0612"+
		"\u061c\u00055\u0000\u0000\u0613\u061c\u00056\u0000\u0000\u0614\u061c\u0005"+
		"8\u0000\u0000\u0615\u061c\u00059\u0000\u0000\u0616\u061c\u0005<\u0000"+
		"\u0000\u0617\u0618\u0005\u0018\u0000\u0000\u0618\u061c\u0005\u0019\u0000"+
		"\u0000\u0619\u061a\u0005\u001a\u0000\u0000\u061a\u061c\u0005\u001b\u0000"+
		"\u0000\u061b\u0605\u0001\u0000\u0000\u0000\u061b\u0606\u0001\u0000\u0000"+
		"\u0000\u061b\u0607\u0001\u0000\u0000\u0000\u061b\u0608\u0001\u0000\u0000"+
		"\u0000\u061b\u0609\u0001\u0000\u0000\u0000\u061b\u060a\u0001\u0000\u0000"+
		"\u0000\u061b\u060b\u0001\u0000\u0000\u0000\u061b\u060c\u0001\u0000\u0000"+
		"\u0000\u061b\u060d\u0001\u0000\u0000\u0000\u061b\u060e\u0001\u0000\u0000"+
		"\u0000\u061b\u060f\u0001\u0000\u0000\u0000\u061b\u0610\u0001\u0000\u0000"+
		"\u0000\u061b\u0611\u0001\u0000\u0000\u0000\u061b\u0612\u0001\u0000\u0000"+
		"\u0000\u061b\u0613\u0001\u0000\u0000\u0000\u061b\u0614\u0001\u0000\u0000"+
		"\u0000\u061b\u0615\u0001\u0000\u0000\u0000\u061b\u0616\u0001\u0000\u0000"+
		"\u0000\u061b\u0617\u0001\u0000\u0000\u0000\u061b\u0619\u0001\u0000\u0000"+
		"\u0000\u061c\u011d\u0001\u0000\u0000\u0000\u061d\u061e\u0007\u0014\u0000"+
		"\u0000\u061e\u011f\u0001\u0000\u0000\u0000\u061f\u0620\u0005\u0001\u0000"+
		"\u0000\u0620\u0625\u0003\u0122\u0091\u0000\u0621\u0622\u0005\u0002\u0000"+
		"\u0000\u0622\u0624\u0003\u0122\u0091\u0000\u0623\u0621\u0001\u0000\u0000"+
		"\u0000\u0624\u0627\u0001\u0000\u0000\u0000\u0625\u0623\u0001\u0000\u0000"+
		"\u0000\u0625\u0626\u0001\u0000\u0000\u0000\u0626\u0628\u0001\u0000\u0000"+
		"\u0000\u0627\u0625\u0001\u0000\u0000\u0000\u0628\u0629\u0005\u0003\u0000"+
		"\u0000\u0629\u0121\u0001\u0000\u0000\u0000\u062a\u062f\u0003\u011e\u008f"+
		"\u0000\u062b\u062c\u0005\u0004\u0000\u0000\u062c\u062e\u0003\u011e\u008f"+
		"\u0000\u062d\u062b\u0001\u0000\u0000\u0000\u062e\u0631\u0001\u0000\u0000"+
		"\u0000\u062f\u062d\u0001\u0000\u0000\u0000\u062f\u0630\u0001\u0000\u0000"+
		"\u0000\u0630\u0123\u0001\u0000\u0000\u0000\u0631\u062f\u0001\u0000\u0000"+
		"\u0000\u0632\u0634\u0003\u0126\u0093\u0000\u0633\u0635\u0003\u0128\u0094"+
		"\u0000\u0634\u0633\u0001\u0000\u0000\u0000\u0634\u0635\u0001\u0000\u0000"+
		"\u0000\u0635\u0125\u0001\u0000\u0000\u0000\u0636\u0637\u0005\u001a\u0000"+
		"\u0000\u0637\u063c\u0003\u012a\u0095\u0000\u0638\u0639\u0005<\u0000\u0000"+
		"\u0639\u063b\u0003\u012a\u0095\u0000\u063a\u0638\u0001\u0000\u0000\u0000"+
		"\u063b\u063e\u0001\u0000\u0000\u0000\u063c\u063a\u0001\u0000\u0000\u0000"+
		"\u063c\u063d\u0001\u0000\u0000\u0000\u063d\u063f\u0001\u0000\u0000\u0000"+
		"\u063e\u063c\u0001\u0000\u0000\u0000\u063f\u0640\u0005\u001b\u0000\u0000"+
		"\u0640\u0127\u0001\u0000\u0000\u0000\u0641\u0642\u0005\u001a\u0000\u0000"+
		"\u0642\u0647\u0003T*\u0000\u0643\u0644\u0005<\u0000\u0000\u0644\u0646"+
		"\u0003T*\u0000\u0645\u0643\u0001\u0000\u0000\u0000\u0646\u0649\u0001\u0000"+
		"\u0000\u0000\u0647\u0645\u0001\u0000\u0000\u0000\u0647\u0648\u0001\u0000"+
		"\u0000\u0000\u0648\u064a\u0001\u0000\u0000\u0000\u0649\u0647\u0001\u0000"+
		"\u0000\u0000\u064a\u064b\u0005\u001b\u0000\u0000\u064b\u0129\u0001\u0000"+
		"\u0000\u0000\u064c\u0651\u0005E\u0000\u0000\u064d\u064e\u0005B\u0000\u0000"+
		"\u064e\u0650\u0005E\u0000\u0000\u064f\u064d\u0001\u0000\u0000\u0000\u0650"+
		"\u0653\u0001\u0000\u0000\u0000\u0651\u064f\u0001\u0000\u0000\u0000\u0651"+
		"\u0652\u0001\u0000\u0000\u0000\u0652\u0654\u0001\u0000\u0000\u0000\u0653"+
		"\u0651\u0001\u0000\u0000\u0000\u0654\u0655\u0005@\u0000\u0000\u0655\u0658"+
		"\u0005E\u0000\u0000\u0656\u0657\u0005<\u0000\u0000\u0657\u0659\u0005E"+
		"\u0000\u0000\u0658\u0656\u0001\u0000\u0000\u0000\u0659\u065a\u0001\u0000"+
		"\u0000\u0000\u065a\u0658\u0001\u0000\u0000\u0000\u065a\u065b\u0001\u0000"+
		"\u0000\u0000\u065b\u012b\u0001\u0000\u0000\u0000\u065c\u065d\u0005\u001a"+
		"\u0000\u0000\u065d\u0660\u0005E\u0000\u0000\u065e\u065f\u0005\u0004\u0000"+
		"\u0000\u065f\u0661\u0005E\u0000\u0000\u0660\u065e\u0001\u0000\u0000\u0000"+
		"\u0661\u0662\u0001\u0000\u0000\u0000\u0662\u0660\u0001\u0000\u0000\u0000"+
		"\u0662\u0663\u0001\u0000\u0000\u0000\u0663\u0664\u0001\u0000\u0000\u0000"+
		"\u0664\u0665\u0005\u0005\u0000\u0000\u0665\u0666\u0003\u0124\u0092\u0000"+
		"\u0666\u0667\u0005\u001b\u0000\u0000\u0667\u012d\u0001\u0000\u0000\u0000"+
		"\u0668\u0669\u0005E\u0000\u0000\u0669\u066a\u0005?\u0000\u0000\u066a\u066b"+
		"\u0003\u0128\u0094\u0000\u066b\u012f\u0001\u0000\u0000\u0000\u00e0\u0131"+
		"\u0138\u0141\u0145\u014c\u0155\u015e\u0163\u0169\u0171\u0173\u017c\u0180"+
		"\u0184\u0187\u018b\u018e\u0195\u0199\u019c\u019f\u01a6\u01aa\u01b8\u01bc"+
		"\u01c2\u01c9\u01cf\u01d3\u01d7\u01d9\u01e1\u01e6\u01ec\u01f3\u01ff\u0209"+
		"\u020e\u0212\u0219\u021c\u0224\u0228\u022b\u0232\u0239\u023d\u0242\u0246"+
		"\u0249\u024e\u025d\u0264\u026c\u0274\u027d\u0284\u028b\u0293\u029b\u02a3"+
		"\u02ab\u02b3\u02bb\u02c4\u02cb\u02d4\u02dc\u02e3\u02e5\u02e8\u02ee\u02f4"+
		"\u02fa\u0301\u030a\u0312\u0316\u031d\u031f\u0333\u0337\u033d\u0342\u0346"+
		"\u0349\u0350\u0357\u035b\u0364\u036c\u0376\u037b\u0382\u0385\u038a\u038f"+
		"\u03a4\u03a9\u03ac\u03b6\u03bb\u03c0\u03c3\u03c8\u03cb\u03d2\u03d7\u03dc"+
		"\u03df\u03e3\u03e7\u03eb\u03f1\u03f6\u03fc\u0402\u0406\u040c\u0412\u041c"+
		"\u041e\u0424\u0427\u042a\u042d\u0431\u0435\u043b\u0445\u044b\u0451\u0456"+
		"\u045b\u045f\u046c\u0472\u0476\u047c\u0481\u0490\u0494\u0499\u049e\u04a3"+
		"\u04a9\u04ac\u04b5\u04b9\u04be\u04c2\u04c8\u04cf\u04e0\u04e2\u04e9\u04ee"+
		"\u04f5\u04f9\u04fd\u0505\u050b\u0511\u0515\u0517\u051b\u0520\u0524\u0527"+
		"\u052a\u052f\u0533\u0536\u053a\u053d\u053f\u0544\u054b\u0551\u0555\u055b"+
		"\u0561\u0564\u0566\u056c\u0570\u0576\u057d\u0581\u0583\u0587\u058d\u0599"+
		"\u059d\u059f\u05a3\u05a8\u05ab\u05b2\u05b6\u05bb\u05bd\u05c1\u05c4\u05c7"+
		"\u05d0\u05d7\u05dc\u05e1\u05e5\u05ea\u05ee\u05f4\u05f6\u0603\u061b\u0625"+
		"\u062f\u0634\u063c\u0647\u0651\u065a\u0662";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}