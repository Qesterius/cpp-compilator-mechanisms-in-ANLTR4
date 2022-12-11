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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Float) | (1L << Matrix) | (1L << Int) | (1L << Void) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Star) | (1L << And) | (1L << Tilde) | (1L << AndAnd))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Semi - 65)) | (1L << (Ellipsis - 65)) | (1L << (Identifier - 65)) | (1L << (Doublecolon - 65)) | (1L << (Mutable - 65)) | (1L << (Using - 65)) | (1L << (Static_assert - 65)) | (1L << (Friend - 65)) | (1L << (Typedef - 65)) | (1L << (Constexpr - 65)) | (1L << (Register - 65)) | (1L << (Static - 65)) | (1L << (Thread_local - 65)) | (1L << (Extern - 65)) | (1L << (Inline - 65)) | (1L << (Virtual - 65)) | (1L << (Explicit - 65)) | (1L << (Short - 65)) | (1L << (Long - 65)) | (1L << (Unsigned - 65)) | (1L << (Signed - 65)) | (1L << (Char - 65)) | (1L << (Char16 - 65)) | (1L << (Char32 - 65)) | (1L << (Wchar - 65)) | (1L << (Double - 65)) | (1L << (Auto - 65)) | (1L << (Decltype - 65)) | (1L << (Enum - 65)) | (1L << (Namespace - 65)) | (1L << (Asm - 65)) | (1L << (Alignas - 65)) | (1L << (Const - 65)) | (1L << (Volatile - 65)) | (1L << (Operator - 65)))) != 0)) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIdExpression(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitUnqualifiedId(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitQualifiedId(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNestedNameSpecifier(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLambdaIntroducer(this);
			else return visitor.visitChildren(this);
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
			if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (And - 36)) | (1L << (Assign - 36)) | (1L << (Identifier - 36)) | (1L << (This - 36)))) != 0)) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLambdaCapture(this);
			else return visitor.visitChildren(this);
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

	public static class CaptureDefaultContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(gParser.And, 0); }
		public TerminalNode Assign() { return getToken(gParser.Assign, 0); }
		public CaptureDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureDefault; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCaptureDefault(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCaptureList(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCapture(this);
			else return visitor.visitChildren(this);
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

	public static class SimpleCaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public TerminalNode And() { return getToken(gParser.And, 0); }
		public TerminalNode This() { return getToken(gParser.This, 0); }
		public SimpleCaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCapture; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSimpleCapture(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInitcapture(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLambdaDeclarator(this);
			else return visitor.visitChildren(this);
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Float) | (1L << Matrix) | (1L << Int) | (1L << Void) | (1L << LeftBracket))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Identifier - 69)) | (1L << (Doublecolon - 69)) | (1L << (Mutable - 69)) | (1L << (Friend - 69)) | (1L << (Typedef - 69)) | (1L << (Constexpr - 69)) | (1L << (Register - 69)) | (1L << (Static - 69)) | (1L << (Thread_local - 69)) | (1L << (Extern - 69)) | (1L << (Inline - 69)) | (1L << (Virtual - 69)) | (1L << (Explicit - 69)) | (1L << (Short - 69)) | (1L << (Long - 69)) | (1L << (Unsigned - 69)) | (1L << (Signed - 69)) | (1L << (Char - 69)) | (1L << (Char16 - 69)) | (1L << (Char32 - 69)) | (1L << (Wchar - 69)) | (1L << (Double - 69)) | (1L << (Auto - 69)) | (1L << (Decltype - 69)) | (1L << (Enum - 69)) | (1L << (Alignas - 69)) | (1L << (Const - 69)) | (1L << (Volatile - 69)))) != 0)) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
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
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IntegerLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Bool) | (1L << Float) | (1L << Matrix) | (1L << Int) | (1L << Void) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Tilde) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Identifier - 69)) | (1L << (Doublecolon - 69)) | (1L << (Dynamic_cast - 69)) | (1L << (Static_cast - 69)) | (1L << (Reinterpret_cast - 69)) | (1L << (Const_cast - 69)) | (1L << (Typeid_ - 69)) | (1L << (Sizeof - 69)) | (1L << (Alignof - 69)) | (1L << (Or - 69)) | (1L << (New - 69)) | (1L << (Delete - 69)) | (1L << (Noexcept - 69)) | (1L << (Short - 69)) | (1L << (Long - 69)) | (1L << (Unsigned - 69)) | (1L << (Signed - 69)) | (1L << (Char - 69)) | (1L << (Char16 - 69)) | (1L << (Char32 - 69)) | (1L << (Wchar - 69)) | (1L << (Double - 69)) | (1L << (Auto - 69)) | (1L << (Decltype - 69)) | (1L << (Operator - 69)) | (1L << (MatrixLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (FloatingLiteral - 69)) | (1L << (PointerLiteral - 69)))) != 0) || _la==UserDefinedLiteral) {
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
				if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (Dynamic_cast - 78)) | (1L << (Static_cast - 78)) | (1L << (Reinterpret_cast - 78)) | (1L << (Const_cast - 78)))) != 0)) ) {
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
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IntegerLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Bool) | (1L << Float) | (1L << Matrix) | (1L << Int) | (1L << Void) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Tilde) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Identifier - 69)) | (1L << (Doublecolon - 69)) | (1L << (Dynamic_cast - 69)) | (1L << (Static_cast - 69)) | (1L << (Reinterpret_cast - 69)) | (1L << (Const_cast - 69)) | (1L << (Typeid_ - 69)) | (1L << (Sizeof - 69)) | (1L << (Alignof - 69)) | (1L << (Or - 69)) | (1L << (New - 69)) | (1L << (Delete - 69)) | (1L << (Noexcept - 69)) | (1L << (Short - 69)) | (1L << (Long - 69)) | (1L << (Unsigned - 69)) | (1L << (Signed - 69)) | (1L << (Char - 69)) | (1L << (Char16 - 69)) | (1L << (Char32 - 69)) | (1L << (Wchar - 69)) | (1L << (Double - 69)) | (1L << (Auto - 69)) | (1L << (Decltype - 69)) | (1L << (Operator - 69)) | (1L << (MatrixLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (FloatingLiteral - 69)) | (1L << (PointerLiteral - 69)))) != 0) || _la==UserDefinedLiteral) {
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

	public static class TypeIdOfTheTypeIdContext extends ParserRuleContext {
		public TerminalNode Typeid_() { return getToken(gParser.Typeid_, 0); }
		public TypeIdOfTheTypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdOfTheTypeId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTypeIdOfTheTypeId(this);
			else return visitor.visitChildren(this);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPseudoDestructorName(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
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
			if ( !(((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (Plus - 30)) | (1L << (Minus - 30)) | (1L << (Star - 30)) | (1L << (And - 30)) | (1L << (Tilde - 30)) | (1L << (Not - 30)) | (1L << (Or - 30)))) != 0)) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNewPlacement(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNewTypeId(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNewDeclarator(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNoPointerNewDeclarator(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNewInitializer(this);
			else return visitor.visitChildren(this);
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IntegerLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Bool) | (1L << Float) | (1L << Matrix) | (1L << Int) | (1L << Void) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Tilde) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Identifier - 69)) | (1L << (Doublecolon - 69)) | (1L << (Dynamic_cast - 69)) | (1L << (Static_cast - 69)) | (1L << (Reinterpret_cast - 69)) | (1L << (Const_cast - 69)) | (1L << (Typeid_ - 69)) | (1L << (Sizeof - 69)) | (1L << (Alignof - 69)) | (1L << (Or - 69)) | (1L << (New - 69)) | (1L << (Delete - 69)) | (1L << (Noexcept - 69)) | (1L << (Short - 69)) | (1L << (Long - 69)) | (1L << (Unsigned - 69)) | (1L << (Signed - 69)) | (1L << (Char - 69)) | (1L << (Char16 - 69)) | (1L << (Char32 - 69)) | (1L << (Wchar - 69)) | (1L << (Double - 69)) | (1L << (Auto - 69)) | (1L << (Decltype - 69)) | (1L << (Operator - 69)) | (1L << (MatrixLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (FloatingLiteral - 69)) | (1L << (PointerLiteral - 69)))) != 0) || _la==UserDefinedLiteral) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeleteExpression(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNoExceptExpression(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPointerMemberExpression(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Div) | (1L << Mod))) != 0)) {
				{
				{
				setState(616);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Div) | (1L << Mod))) != 0)) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitShiftOperator(this);
			else return visitor.visitChildren(this);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << Greater) | (1L << LessEqual) | (1L << GreaterEqual))) != 0)) {
				{
				{
				setState(647);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << Greater) | (1L << LessEqual) | (1L << GreaterEqual))) != 0)) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << XorAssign) | (1L << AndAssign) | (1L << OrAssign) | (1L << LeftShiftAssign) | (1L << RightShiftAssign))) != 0)) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
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
		enterRule(_localctx, 98, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IntegerLiteral - 6)) | (1L << (StringLiteral - 6)) | (1L << (BooleanLiteral - 6)) | (1L << (Bool - 6)) | (1L << (Float - 6)) | (1L << (Matrix - 6)) | (1L << (Int - 6)) | (1L << (Void - 6)) | (1L << (LeftParen - 6)) | (1L << (LeftBracket - 6)) | (1L << (Plus - 6)) | (1L << (Minus - 6)) | (1L << (Star - 6)) | (1L << (And - 6)) | (1L << (Tilde - 6)) | (1L << (Not - 6)) | (1L << (PlusPlus - 6)) | (1L << (MinusMinus - 6)) | (1L << (Identifier - 6)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Doublecolon - 75)) | (1L << (Dynamic_cast - 75)) | (1L << (Static_cast - 75)) | (1L << (Reinterpret_cast - 75)) | (1L << (Const_cast - 75)) | (1L << (Typeid_ - 75)) | (1L << (Sizeof - 75)) | (1L << (Alignof - 75)) | (1L << (Or - 75)) | (1L << (New - 75)) | (1L << (Delete - 75)) | (1L << (Noexcept - 75)) | (1L << (Short - 75)) | (1L << (Long - 75)) | (1L << (Unsigned - 75)) | (1L << (Signed - 75)) | (1L << (Char - 75)) | (1L << (Char16 - 75)) | (1L << (Char32 - 75)) | (1L << (Wchar - 75)) | (1L << (Double - 75)) | (1L << (Auto - 75)) | (1L << (Decltype - 75)) | (1L << (Operator - 75)) | (1L << (MatrixLiteral - 75)) | (1L << (CharacterLiteral - 75)) | (1L << (FloatingLiteral - 75)) | (1L << (PointerLiteral - 75)) | (1L << (UserDefinedLiteral - 75)))) != 0)) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
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
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IntegerLiteral - 6)) | (1L << (StringLiteral - 6)) | (1L << (BooleanLiteral - 6)) | (1L << (Bool - 6)) | (1L << (Break - 6)) | (1L << (Continue - 6)) | (1L << (Float - 6)) | (1L << (For - 6)) | (1L << (If - 6)) | (1L << (Matrix - 6)) | (1L << (Int - 6)) | (1L << (Return - 6)) | (1L << (Void - 6)) | (1L << (While - 6)) | (1L << (LeftParen - 6)) | (1L << (LeftBracket - 6)) | (1L << (LeftBrace - 6)) | (1L << (Plus - 6)) | (1L << (Minus - 6)) | (1L << (Star - 6)) | (1L << (And - 6)) | (1L << (Tilde - 6)) | (1L << (Not - 6)) | (1L << (AndAnd - 6)) | (1L << (PlusPlus - 6)) | (1L << (MinusMinus - 6)) | (1L << (Semi - 6)) | (1L << (Ellipsis - 6)) | (1L << (Identifier - 6)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Doublecolon - 75)) | (1L << (Mutable - 75)) | (1L << (Dynamic_cast - 75)) | (1L << (Static_cast - 75)) | (1L << (Reinterpret_cast - 75)) | (1L << (Const_cast - 75)) | (1L << (Typeid_ - 75)) | (1L << (Sizeof - 75)) | (1L << (Alignof - 75)) | (1L << (Or - 75)) | (1L << (New - 75)) | (1L << (Delete - 75)) | (1L << (Noexcept - 75)) | (1L << (Case - 75)) | (1L << (Default - 75)) | (1L << (Switch - 75)) | (1L << (Do - 75)) | (1L << (Goto - 75)) | (1L << (Using - 75)) | (1L << (Static_assert - 75)) | (1L << (Friend - 75)) | (1L << (Typedef - 75)) | (1L << (Constexpr - 75)) | (1L << (Register - 75)) | (1L << (Static - 75)) | (1L << (Thread_local - 75)) | (1L << (Extern - 75)) | (1L << (Inline - 75)) | (1L << (Virtual - 75)) | (1L << (Explicit - 75)) | (1L << (Short - 75)) | (1L << (Long - 75)) | (1L << (Unsigned - 75)) | (1L << (Signed - 75)) | (1L << (Char - 75)) | (1L << (Char16 - 75)) | (1L << (Char32 - 75)) | (1L << (Wchar - 75)) | (1L << (Double - 75)) | (1L << (Auto - 75)) | (1L << (Decltype - 75)) | (1L << (Enum - 75)) | (1L << (Namespace - 75)) | (1L << (Asm - 75)) | (1L << (Alignas - 75)) | (1L << (Const - 75)) | (1L << (Volatile - 75)) | (1L << (Operator - 75)) | (1L << (MatrixLiteral - 75)) | (1L << (CharacterLiteral - 75)) | (1L << (FloatingLiteral - 75)) | (1L << (PointerLiteral - 75)) | (1L << (UserDefinedLiteral - 75)))) != 0)) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStatementSeq(this);
			else return visitor.visitChildren(this);
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
			} while ( ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IntegerLiteral - 6)) | (1L << (StringLiteral - 6)) | (1L << (BooleanLiteral - 6)) | (1L << (Bool - 6)) | (1L << (Break - 6)) | (1L << (Continue - 6)) | (1L << (Float - 6)) | (1L << (For - 6)) | (1L << (If - 6)) | (1L << (Matrix - 6)) | (1L << (Int - 6)) | (1L << (Return - 6)) | (1L << (Void - 6)) | (1L << (While - 6)) | (1L << (LeftParen - 6)) | (1L << (LeftBracket - 6)) | (1L << (LeftBrace - 6)) | (1L << (Plus - 6)) | (1L << (Minus - 6)) | (1L << (Star - 6)) | (1L << (And - 6)) | (1L << (Tilde - 6)) | (1L << (Not - 6)) | (1L << (AndAnd - 6)) | (1L << (PlusPlus - 6)) | (1L << (MinusMinus - 6)) | (1L << (Semi - 6)) | (1L << (Ellipsis - 6)) | (1L << (Identifier - 6)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Doublecolon - 75)) | (1L << (Mutable - 75)) | (1L << (Dynamic_cast - 75)) | (1L << (Static_cast - 75)) | (1L << (Reinterpret_cast - 75)) | (1L << (Const_cast - 75)) | (1L << (Typeid_ - 75)) | (1L << (Sizeof - 75)) | (1L << (Alignof - 75)) | (1L << (Or - 75)) | (1L << (New - 75)) | (1L << (Delete - 75)) | (1L << (Noexcept - 75)) | (1L << (Case - 75)) | (1L << (Default - 75)) | (1L << (Switch - 75)) | (1L << (Do - 75)) | (1L << (Goto - 75)) | (1L << (Using - 75)) | (1L << (Static_assert - 75)) | (1L << (Friend - 75)) | (1L << (Typedef - 75)) | (1L << (Constexpr - 75)) | (1L << (Register - 75)) | (1L << (Static - 75)) | (1L << (Thread_local - 75)) | (1L << (Extern - 75)) | (1L << (Inline - 75)) | (1L << (Virtual - 75)) | (1L << (Explicit - 75)) | (1L << (Short - 75)) | (1L << (Long - 75)) | (1L << (Unsigned - 75)) | (1L << (Signed - 75)) | (1L << (Char - 75)) | (1L << (Char16 - 75)) | (1L << (Char32 - 75)) | (1L << (Wchar - 75)) | (1L << (Double - 75)) | (1L << (Auto - 75)) | (1L << (Decltype - 75)) | (1L << (Enum - 75)) | (1L << (Namespace - 75)) | (1L << (Asm - 75)) | (1L << (Alignas - 75)) | (1L << (Const - 75)) | (1L << (Volatile - 75)) | (1L << (Operator - 75)) | (1L << (MatrixLiteral - 75)) | (1L << (CharacterLiteral - 75)) | (1L << (FloatingLiteral - 75)) | (1L << (PointerLiteral - 75)) | (1L << (UserDefinedLiteral - 75)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
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
					if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IntegerLiteral - 6)) | (1L << (StringLiteral - 6)) | (1L << (BooleanLiteral - 6)) | (1L << (Bool - 6)) | (1L << (Float - 6)) | (1L << (Matrix - 6)) | (1L << (Int - 6)) | (1L << (Void - 6)) | (1L << (LeftParen - 6)) | (1L << (LeftBracket - 6)) | (1L << (Plus - 6)) | (1L << (Minus - 6)) | (1L << (Star - 6)) | (1L << (And - 6)) | (1L << (Tilde - 6)) | (1L << (Not - 6)) | (1L << (PlusPlus - 6)) | (1L << (MinusMinus - 6)) | (1L << (Identifier - 6)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Doublecolon - 75)) | (1L << (Mutable - 75)) | (1L << (Dynamic_cast - 75)) | (1L << (Static_cast - 75)) | (1L << (Reinterpret_cast - 75)) | (1L << (Const_cast - 75)) | (1L << (Typeid_ - 75)) | (1L << (Sizeof - 75)) | (1L << (Alignof - 75)) | (1L << (Or - 75)) | (1L << (New - 75)) | (1L << (Delete - 75)) | (1L << (Noexcept - 75)) | (1L << (Friend - 75)) | (1L << (Typedef - 75)) | (1L << (Constexpr - 75)) | (1L << (Register - 75)) | (1L << (Static - 75)) | (1L << (Thread_local - 75)) | (1L << (Extern - 75)) | (1L << (Inline - 75)) | (1L << (Virtual - 75)) | (1L << (Explicit - 75)) | (1L << (Short - 75)) | (1L << (Long - 75)) | (1L << (Unsigned - 75)) | (1L << (Signed - 75)) | (1L << (Char - 75)) | (1L << (Char16 - 75)) | (1L << (Char32 - 75)) | (1L << (Wchar - 75)) | (1L << (Double - 75)) | (1L << (Auto - 75)) | (1L << (Decltype - 75)) | (1L << (Enum - 75)) | (1L << (Alignas - 75)) | (1L << (Const - 75)) | (1L << (Volatile - 75)) | (1L << (Operator - 75)) | (1L << (MatrixLiteral - 75)) | (1L << (CharacterLiteral - 75)) | (1L << (FloatingLiteral - 75)) | (1L << (PointerLiteral - 75)) | (1L << (UserDefinedLiteral - 75)))) != 0)) {
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
					if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IntegerLiteral - 6)) | (1L << (StringLiteral - 6)) | (1L << (BooleanLiteral - 6)) | (1L << (Bool - 6)) | (1L << (Float - 6)) | (1L << (Matrix - 6)) | (1L << (Int - 6)) | (1L << (Void - 6)) | (1L << (LeftParen - 6)) | (1L << (LeftBracket - 6)) | (1L << (Plus - 6)) | (1L << (Minus - 6)) | (1L << (Star - 6)) | (1L << (And - 6)) | (1L << (Tilde - 6)) | (1L << (Not - 6)) | (1L << (PlusPlus - 6)) | (1L << (MinusMinus - 6)) | (1L << (Identifier - 6)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Doublecolon - 75)) | (1L << (Dynamic_cast - 75)) | (1L << (Static_cast - 75)) | (1L << (Reinterpret_cast - 75)) | (1L << (Const_cast - 75)) | (1L << (Typeid_ - 75)) | (1L << (Sizeof - 75)) | (1L << (Alignof - 75)) | (1L << (Or - 75)) | (1L << (New - 75)) | (1L << (Delete - 75)) | (1L << (Noexcept - 75)) | (1L << (Short - 75)) | (1L << (Long - 75)) | (1L << (Unsigned - 75)) | (1L << (Signed - 75)) | (1L << (Char - 75)) | (1L << (Char16 - 75)) | (1L << (Char32 - 75)) | (1L << (Wchar - 75)) | (1L << (Double - 75)) | (1L << (Auto - 75)) | (1L << (Decltype - 75)) | (1L << (Operator - 75)) | (1L << (MatrixLiteral - 75)) | (1L << (CharacterLiteral - 75)) | (1L << (FloatingLiteral - 75)) | (1L << (PointerLiteral - 75)) | (1L << (UserDefinedLiteral - 75)))) != 0)) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitForInitStatement(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitForRangeDeclaration(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitForRangeInitializer(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
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

	public static class DeclarationStatementContext extends ParserRuleContext {
		public BlockDeclarationContext blockDeclaration() {
			return getRuleContext(BlockDeclarationContext.class,0);
		}
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclarationseq(this);
			else return visitor.visitChildren(this);
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Float) | (1L << Matrix) | (1L << Int) | (1L << Void) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Star) | (1L << And) | (1L << Tilde) | (1L << AndAnd))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Semi - 65)) | (1L << (Ellipsis - 65)) | (1L << (Identifier - 65)) | (1L << (Doublecolon - 65)) | (1L << (Mutable - 65)) | (1L << (Using - 65)) | (1L << (Static_assert - 65)) | (1L << (Friend - 65)) | (1L << (Typedef - 65)) | (1L << (Constexpr - 65)) | (1L << (Register - 65)) | (1L << (Static - 65)) | (1L << (Thread_local - 65)) | (1L << (Extern - 65)) | (1L << (Inline - 65)) | (1L << (Virtual - 65)) | (1L << (Explicit - 65)) | (1L << (Short - 65)) | (1L << (Long - 65)) | (1L << (Unsigned - 65)) | (1L << (Signed - 65)) | (1L << (Char - 65)) | (1L << (Char16 - 65)) | (1L << (Char32 - 65)) | (1L << (Wchar - 65)) | (1L << (Double - 65)) | (1L << (Auto - 65)) | (1L << (Decltype - 65)) | (1L << (Enum - 65)) | (1L << (Namespace - 65)) | (1L << (Asm - 65)) | (1L << (Alignas - 65)) | (1L << (Const - 65)) | (1L << (Volatile - 65)) | (1L << (Operator - 65)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBlockDeclaration(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAliasDeclaration(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSimpleDeclaration(this);
			else return visitor.visitChildren(this);
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Star) | (1L << And) | (1L << Tilde) | (1L << AndAnd))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Ellipsis - 68)) | (1L << (Identifier - 68)) | (1L << (Doublecolon - 68)) | (1L << (Decltype - 68)) | (1L << (Operator - 68)))) != 0)) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStaticAssertDeclaration(this);
			else return visitor.visitChildren(this);
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

	public static class EmptyDeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(gParser.Semi, 0); }
		public EmptyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitEmptyDeclaration(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAttributeDeclaration(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclSpecifier(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclSpecifierSeq(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStorageClassSpecifier(this);
			else return visitor.visitChildren(this);
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
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Mutable - 77)) | (1L << (Register - 77)) | (1L << (Static - 77)) | (1L << (Thread_local - 77)) | (1L << (Extern - 77)))) != 0)) ) {
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

	public static class FunctionSpecifierContext extends ParserRuleContext {
		public TerminalNode Inline() { return getToken(gParser.Inline, 0); }
		public TerminalNode Virtual() { return getToken(gParser.Virtual, 0); }
		public TerminalNode Explicit() { return getToken(gParser.Explicit, 0); }
		public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunctionSpecifier(this);
			else return visitor.visitChildren(this);
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
			if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Inline - 104)) | (1L << (Virtual - 104)) | (1L << (Explicit - 104)))) != 0)) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTrailingTypeSpecifier(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTypeSpecifierSeq(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTrailingTypeSpecifierSeq(this);
			else return visitor.visitChildren(this);
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

	public static class SimpleTypeLengthModifierContext extends ParserRuleContext {
		public TerminalNode Short() { return getToken(gParser.Short, 0); }
		public TerminalNode Long() { return getToken(gParser.Long, 0); }
		public SimpleTypeLengthModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeLengthModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSimpleTypeLengthModifier(this);
			else return visitor.visitChildren(this);
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

	public static class SimpleTypeSignednessModifierContext extends ParserRuleContext {
		public TerminalNode Unsigned() { return getToken(gParser.Unsigned, 0); }
		public TerminalNode Signed() { return getToken(gParser.Signed, 0); }
		public SimpleTypeSignednessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeSignednessModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSimpleTypeSignednessModifier(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSimpleTypeSpecifier(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTheTypeName(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDecltypeSpecifier(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitElaboratedTypeSpecifier(this);
			else return visitor.visitChildren(this);
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

	public static class EnumNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public EnumNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitEnumName(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitEnumSpecifier(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitEnumHead(this);
			else return visitor.visitChildren(this);
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
			if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Identifier - 69)) | (1L << (Doublecolon - 69)) | (1L << (Decltype - 69)))) != 0)) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitOpaqueEnumDeclaration(this);
			else return visitor.visitChildren(this);
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

	public static class EnumkeyContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(gParser.Enum, 0); }
		public TerminalNode Class() { return getToken(gParser.Class, 0); }
		public TerminalNode Struct() { return getToken(gParser.Struct, 0); }
		public EnumkeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumkey; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitEnumkey(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitEnumbase(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitEnumeratorList(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitEnumeratorDefinition(this);
			else return visitor.visitChildren(this);
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

	public static class EnumeratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNamespaceName(this);
			else return visitor.visitChildren(this);
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

	public static class OriginalNamespaceNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public OriginalNamespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalNamespaceName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitOriginalNamespaceName(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNamespaceDefinition(this);
			else return visitor.visitChildren(this);
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Float) | (1L << Matrix) | (1L << Int) | (1L << Void) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Star) | (1L << And) | (1L << Tilde) | (1L << AndAnd))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Semi - 65)) | (1L << (Ellipsis - 65)) | (1L << (Identifier - 65)) | (1L << (Doublecolon - 65)) | (1L << (Mutable - 65)) | (1L << (Using - 65)) | (1L << (Static_assert - 65)) | (1L << (Friend - 65)) | (1L << (Typedef - 65)) | (1L << (Constexpr - 65)) | (1L << (Register - 65)) | (1L << (Static - 65)) | (1L << (Thread_local - 65)) | (1L << (Extern - 65)) | (1L << (Inline - 65)) | (1L << (Virtual - 65)) | (1L << (Explicit - 65)) | (1L << (Short - 65)) | (1L << (Long - 65)) | (1L << (Unsigned - 65)) | (1L << (Signed - 65)) | (1L << (Char - 65)) | (1L << (Char16 - 65)) | (1L << (Char32 - 65)) | (1L << (Wchar - 65)) | (1L << (Double - 65)) | (1L << (Auto - 65)) | (1L << (Decltype - 65)) | (1L << (Enum - 65)) | (1L << (Namespace - 65)) | (1L << (Asm - 65)) | (1L << (Alignas - 65)) | (1L << (Const - 65)) | (1L << (Volatile - 65)) | (1L << (Operator - 65)))) != 0)) {
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

	public static class NamespaceAliasContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public NamespaceAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceAlias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNamespaceAlias(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNamespaceAliasDefinition(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitQualifiednamespacespecifier(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitUsingDeclaration(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitUsingDirective(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAsmDefinition(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLinkageSpecification(this);
			else return visitor.visitChildren(this);
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Float) | (1L << Matrix) | (1L << Int) | (1L << Void) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Star) | (1L << And) | (1L << Tilde) | (1L << AndAnd))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Semi - 65)) | (1L << (Ellipsis - 65)) | (1L << (Identifier - 65)) | (1L << (Doublecolon - 65)) | (1L << (Mutable - 65)) | (1L << (Using - 65)) | (1L << (Static_assert - 65)) | (1L << (Friend - 65)) | (1L << (Typedef - 65)) | (1L << (Constexpr - 65)) | (1L << (Register - 65)) | (1L << (Static - 65)) | (1L << (Thread_local - 65)) | (1L << (Extern - 65)) | (1L << (Inline - 65)) | (1L << (Virtual - 65)) | (1L << (Explicit - 65)) | (1L << (Short - 65)) | (1L << (Long - 65)) | (1L << (Unsigned - 65)) | (1L << (Signed - 65)) | (1L << (Char - 65)) | (1L << (Char16 - 65)) | (1L << (Char32 - 65)) | (1L << (Wchar - 65)) | (1L << (Double - 65)) | (1L << (Auto - 65)) | (1L << (Decltype - 65)) | (1L << (Enum - 65)) | (1L << (Namespace - 65)) | (1L << (Asm - 65)) | (1L << (Alignas - 65)) | (1L << (Const - 65)) | (1L << (Volatile - 65)) | (1L << (Operator - 65)))) != 0)) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAttributeSpecifierSeq(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAttributeSpecifier(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAlignmentspecifier(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAttributeList(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
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

	public static class AttributeNamespaceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public AttributeNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeNamespace; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAttributeNamespace(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAttributeArgumentClause(this);
			else return visitor.visitChildren(this);
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << IntegerLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Directive) | (1L << Bool) | (1L << Break) | (1L << Continue) | (1L << Else) | (1L << False_) | (1L << True_) | (1L << Float) | (1L << For) | (1L << If) | (1L << Matrix) | (1L << Int) | (1L << Return) | (1L << Void) | (1L << While) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Caret) | (1L << And) | (1L << Tilde) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << XorAssign) | (1L << AndAssign) | (1L << OrAssign) | (1L << LeftShiftAssign) | (1L << RightShiftAssign) | (1L << Equal) | (1L << NotEqual) | (1L << LessEqual) | (1L << GreaterEqual) | (1L << AndAnd) | (1L << OrOr) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Comma) | (1L << ArrowStar) | (1L << Arrow) | (1L << Question))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Dot - 64)) | (1L << (DotStar - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (DecimalLiteral - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)) | (1L << (Doublecolon - 64)) | (1L << (This - 64)) | (1L << (Mutable - 64)) | (1L << (Dynamic_cast - 64)) | (1L << (Static_cast - 64)) | (1L << (Reinterpret_cast - 64)) | (1L << (Const_cast - 64)) | (1L << (Template - 64)) | (1L << (Typeid_ - 64)) | (1L << (Sizeof - 64)) | (1L << (Alignof - 64)) | (1L << (Or - 64)) | (1L << (New - 64)) | (1L << (Delete - 64)) | (1L << (Noexcept - 64)) | (1L << (Case - 64)) | (1L << (Default - 64)) | (1L << (Switch - 64)) | (1L << (Do - 64)) | (1L << (Goto - 64)) | (1L << (Using - 64)) | (1L << (Static_assert - 64)) | (1L << (Friend - 64)) | (1L << (Typedef - 64)) | (1L << (Constexpr - 64)) | (1L << (Register - 64)) | (1L << (Static - 64)) | (1L << (Thread_local - 64)) | (1L << (Extern - 64)) | (1L << (Inline - 64)) | (1L << (Virtual - 64)) | (1L << (Explicit - 64)) | (1L << (Short - 64)) | (1L << (Long - 64)) | (1L << (Unsigned - 64)) | (1L << (Signed - 64)) | (1L << (Char - 64)) | (1L << (Char16 - 64)) | (1L << (Char32 - 64)) | (1L << (Wchar - 64)) | (1L << (Double - 64)) | (1L << (Auto - 64)) | (1L << (Decltype - 64)) | (1L << (Enum - 64)) | (1L << (Class - 64)) | (1L << (Struct - 64)) | (1L << (Namespace - 64)) | (1L << (Typename_ - 64)) | (1L << (Asm - 64)) | (1L << (Alignas - 64)) | (1L << (Const - 64)) | (1L << (Volatile - 64)) | (1L << (Operator - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (UserDefinedStringLiteral - 128)) | (1L << (MatrixLiteral - 128)) | (1L << (CharacterLiteral - 128)) | (1L << (FloatingLiteral - 128)) | (1L << (PointerLiteral - 128)) | (1L << (UserDefinedLiteral - 128)))) != 0)) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBalancedTokenSeq(this);
			else return visitor.visitChildren(this);
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << IntegerLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Directive) | (1L << Bool) | (1L << Break) | (1L << Continue) | (1L << Else) | (1L << False_) | (1L << True_) | (1L << Float) | (1L << For) | (1L << If) | (1L << Matrix) | (1L << Int) | (1L << Return) | (1L << Void) | (1L << While) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Caret) | (1L << And) | (1L << Tilde) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << XorAssign) | (1L << AndAssign) | (1L << OrAssign) | (1L << LeftShiftAssign) | (1L << RightShiftAssign) | (1L << Equal) | (1L << NotEqual) | (1L << LessEqual) | (1L << GreaterEqual) | (1L << AndAnd) | (1L << OrOr) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Comma) | (1L << ArrowStar) | (1L << Arrow) | (1L << Question))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Dot - 64)) | (1L << (DotStar - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (DecimalLiteral - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)) | (1L << (Doublecolon - 64)) | (1L << (This - 64)) | (1L << (Mutable - 64)) | (1L << (Dynamic_cast - 64)) | (1L << (Static_cast - 64)) | (1L << (Reinterpret_cast - 64)) | (1L << (Const_cast - 64)) | (1L << (Template - 64)) | (1L << (Typeid_ - 64)) | (1L << (Sizeof - 64)) | (1L << (Alignof - 64)) | (1L << (Or - 64)) | (1L << (New - 64)) | (1L << (Delete - 64)) | (1L << (Noexcept - 64)) | (1L << (Case - 64)) | (1L << (Default - 64)) | (1L << (Switch - 64)) | (1L << (Do - 64)) | (1L << (Goto - 64)) | (1L << (Using - 64)) | (1L << (Static_assert - 64)) | (1L << (Friend - 64)) | (1L << (Typedef - 64)) | (1L << (Constexpr - 64)) | (1L << (Register - 64)) | (1L << (Static - 64)) | (1L << (Thread_local - 64)) | (1L << (Extern - 64)) | (1L << (Inline - 64)) | (1L << (Virtual - 64)) | (1L << (Explicit - 64)) | (1L << (Short - 64)) | (1L << (Long - 64)) | (1L << (Unsigned - 64)) | (1L << (Signed - 64)) | (1L << (Char - 64)) | (1L << (Char16 - 64)) | (1L << (Char32 - 64)) | (1L << (Wchar - 64)) | (1L << (Double - 64)) | (1L << (Auto - 64)) | (1L << (Decltype - 64)) | (1L << (Enum - 64)) | (1L << (Class - 64)) | (1L << (Struct - 64)) | (1L << (Namespace - 64)) | (1L << (Typename_ - 64)) | (1L << (Asm - 64)) | (1L << (Alignas - 64)) | (1L << (Const - 64)) | (1L << (Volatile - 64)) | (1L << (Operator - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (UserDefinedStringLiteral - 128)) | (1L << (MatrixLiteral - 128)) | (1L << (CharacterLiteral - 128)) | (1L << (FloatingLiteral - 128)) | (1L << (PointerLiteral - 128)) | (1L << (UserDefinedLiteral - 128)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBalancedtoken(this);
			else return visitor.visitChildren(this);
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
						if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << LeftBrace) | (1L << RightBrace))) != 0)) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << LeftBrace) | (1L << Assign))) != 0)) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPointerDeclarator(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNoPointerDeclarator(this);
			else return visitor.visitChildren(this);
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
						if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IntegerLiteral - 6)) | (1L << (StringLiteral - 6)) | (1L << (BooleanLiteral - 6)) | (1L << (Bool - 6)) | (1L << (Float - 6)) | (1L << (Matrix - 6)) | (1L << (Int - 6)) | (1L << (Void - 6)) | (1L << (LeftParen - 6)) | (1L << (LeftBracket - 6)) | (1L << (Plus - 6)) | (1L << (Minus - 6)) | (1L << (Star - 6)) | (1L << (And - 6)) | (1L << (Tilde - 6)) | (1L << (Not - 6)) | (1L << (PlusPlus - 6)) | (1L << (MinusMinus - 6)) | (1L << (Identifier - 6)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Doublecolon - 75)) | (1L << (Dynamic_cast - 75)) | (1L << (Static_cast - 75)) | (1L << (Reinterpret_cast - 75)) | (1L << (Const_cast - 75)) | (1L << (Typeid_ - 75)) | (1L << (Sizeof - 75)) | (1L << (Alignof - 75)) | (1L << (Or - 75)) | (1L << (New - 75)) | (1L << (Delete - 75)) | (1L << (Noexcept - 75)) | (1L << (Short - 75)) | (1L << (Long - 75)) | (1L << (Unsigned - 75)) | (1L << (Signed - 75)) | (1L << (Char - 75)) | (1L << (Char16 - 75)) | (1L << (Char32 - 75)) | (1L << (Wchar - 75)) | (1L << (Double - 75)) | (1L << (Auto - 75)) | (1L << (Decltype - 75)) | (1L << (Operator - 75)) | (1L << (MatrixLiteral - 75)) | (1L << (CharacterLiteral - 75)) | (1L << (FloatingLiteral - 75)) | (1L << (PointerLiteral - 75)) | (1L << (UserDefinedLiteral - 75)))) != 0)) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitParametersAndQualifiers(this);
			else return visitor.visitChildren(this);
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Float) | (1L << Matrix) | (1L << Int) | (1L << Void) | (1L << LeftBracket))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Identifier - 69)) | (1L << (Doublecolon - 69)) | (1L << (Mutable - 69)) | (1L << (Friend - 69)) | (1L << (Typedef - 69)) | (1L << (Constexpr - 69)) | (1L << (Register - 69)) | (1L << (Static - 69)) | (1L << (Thread_local - 69)) | (1L << (Extern - 69)) | (1L << (Inline - 69)) | (1L << (Virtual - 69)) | (1L << (Explicit - 69)) | (1L << (Short - 69)) | (1L << (Long - 69)) | (1L << (Unsigned - 69)) | (1L << (Signed - 69)) | (1L << (Char - 69)) | (1L << (Char16 - 69)) | (1L << (Char32 - 69)) | (1L << (Wchar - 69)) | (1L << (Double - 69)) | (1L << (Auto - 69)) | (1L << (Decltype - 69)) | (1L << (Enum - 69)) | (1L << (Alignas - 69)) | (1L << (Const - 69)) | (1L << (Volatile - 69)))) != 0)) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTrailingReturnType(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPointerOperator(this);
			else return visitor.visitChildren(this);
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
				if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Identifier - 69)) | (1L << (Doublecolon - 69)) | (1L << (Decltype - 69)))) != 0)) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCvqualifierseq(this);
			else return visitor.visitChildren(this);
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

	public static class CvQualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(gParser.Const, 0); }
		public TerminalNode Volatile() { return getToken(gParser.Volatile, 0); }
		public CvQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvQualifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCvQualifier(this);
			else return visitor.visitChildren(this);
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

	public static class RefqualifierContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(gParser.And, 0); }
		public TerminalNode AndAnd() { return getToken(gParser.AndAnd, 0); }
		public RefqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refqualifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitRefqualifier(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclaratorid(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTheTypeId(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAbstractDeclarator(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPointerAbstractDeclarator(this);
			else return visitor.visitChildren(this);
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << And) | (1L << AndAnd))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Identifier - 69)) | (1L << (Doublecolon - 69)) | (1L << (Decltype - 69)))) != 0) );
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNoPointerAbstractDeclarator(this);
			else return visitor.visitChildren(this);
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
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IntegerLiteral - 6)) | (1L << (StringLiteral - 6)) | (1L << (BooleanLiteral - 6)) | (1L << (Bool - 6)) | (1L << (Float - 6)) | (1L << (Matrix - 6)) | (1L << (Int - 6)) | (1L << (Void - 6)) | (1L << (LeftParen - 6)) | (1L << (LeftBracket - 6)) | (1L << (Plus - 6)) | (1L << (Minus - 6)) | (1L << (Star - 6)) | (1L << (And - 6)) | (1L << (Tilde - 6)) | (1L << (Not - 6)) | (1L << (PlusPlus - 6)) | (1L << (MinusMinus - 6)) | (1L << (Identifier - 6)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Doublecolon - 75)) | (1L << (Dynamic_cast - 75)) | (1L << (Static_cast - 75)) | (1L << (Reinterpret_cast - 75)) | (1L << (Const_cast - 75)) | (1L << (Typeid_ - 75)) | (1L << (Sizeof - 75)) | (1L << (Alignof - 75)) | (1L << (Or - 75)) | (1L << (New - 75)) | (1L << (Delete - 75)) | (1L << (Noexcept - 75)) | (1L << (Short - 75)) | (1L << (Long - 75)) | (1L << (Unsigned - 75)) | (1L << (Signed - 75)) | (1L << (Char - 75)) | (1L << (Char16 - 75)) | (1L << (Char32 - 75)) | (1L << (Wchar - 75)) | (1L << (Double - 75)) | (1L << (Auto - 75)) | (1L << (Decltype - 75)) | (1L << (Operator - 75)) | (1L << (MatrixLiteral - 75)) | (1L << (CharacterLiteral - 75)) | (1L << (FloatingLiteral - 75)) | (1L << (PointerLiteral - 75)) | (1L << (UserDefinedLiteral - 75)))) != 0)) {
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
						if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IntegerLiteral - 6)) | (1L << (StringLiteral - 6)) | (1L << (BooleanLiteral - 6)) | (1L << (Bool - 6)) | (1L << (Float - 6)) | (1L << (Matrix - 6)) | (1L << (Int - 6)) | (1L << (Void - 6)) | (1L << (LeftParen - 6)) | (1L << (LeftBracket - 6)) | (1L << (Plus - 6)) | (1L << (Minus - 6)) | (1L << (Star - 6)) | (1L << (And - 6)) | (1L << (Tilde - 6)) | (1L << (Not - 6)) | (1L << (PlusPlus - 6)) | (1L << (MinusMinus - 6)) | (1L << (Identifier - 6)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Doublecolon - 75)) | (1L << (Dynamic_cast - 75)) | (1L << (Static_cast - 75)) | (1L << (Reinterpret_cast - 75)) | (1L << (Const_cast - 75)) | (1L << (Typeid_ - 75)) | (1L << (Sizeof - 75)) | (1L << (Alignof - 75)) | (1L << (Or - 75)) | (1L << (New - 75)) | (1L << (Delete - 75)) | (1L << (Noexcept - 75)) | (1L << (Short - 75)) | (1L << (Long - 75)) | (1L << (Unsigned - 75)) | (1L << (Signed - 75)) | (1L << (Char - 75)) | (1L << (Char16 - 75)) | (1L << (Char32 - 75)) | (1L << (Wchar - 75)) | (1L << (Double - 75)) | (1L << (Auto - 75)) | (1L << (Decltype - 75)) | (1L << (Operator - 75)) | (1L << (MatrixLiteral - 75)) | (1L << (CharacterLiteral - 75)) | (1L << (FloatingLiteral - 75)) | (1L << (PointerLiteral - 75)) | (1L << (UserDefinedLiteral - 75)))) != 0)) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAbstractPackDeclarator(this);
			else return visitor.visitChildren(this);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << And) | (1L << AndAnd))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Identifier - 69)) | (1L << (Doublecolon - 69)) | (1L << (Decltype - 69)))) != 0)) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNoPointerAbstractPackDeclarator(this);
			else return visitor.visitChildren(this);
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
						if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IntegerLiteral - 6)) | (1L << (StringLiteral - 6)) | (1L << (BooleanLiteral - 6)) | (1L << (Bool - 6)) | (1L << (Float - 6)) | (1L << (Matrix - 6)) | (1L << (Int - 6)) | (1L << (Void - 6)) | (1L << (LeftParen - 6)) | (1L << (LeftBracket - 6)) | (1L << (Plus - 6)) | (1L << (Minus - 6)) | (1L << (Star - 6)) | (1L << (And - 6)) | (1L << (Tilde - 6)) | (1L << (Not - 6)) | (1L << (PlusPlus - 6)) | (1L << (MinusMinus - 6)) | (1L << (Identifier - 6)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Doublecolon - 75)) | (1L << (Dynamic_cast - 75)) | (1L << (Static_cast - 75)) | (1L << (Reinterpret_cast - 75)) | (1L << (Const_cast - 75)) | (1L << (Typeid_ - 75)) | (1L << (Sizeof - 75)) | (1L << (Alignof - 75)) | (1L << (Or - 75)) | (1L << (New - 75)) | (1L << (Delete - 75)) | (1L << (Noexcept - 75)) | (1L << (Short - 75)) | (1L << (Long - 75)) | (1L << (Unsigned - 75)) | (1L << (Signed - 75)) | (1L << (Char - 75)) | (1L << (Char16 - 75)) | (1L << (Char32 - 75)) | (1L << (Wchar - 75)) | (1L << (Double - 75)) | (1L << (Auto - 75)) | (1L << (Decltype - 75)) | (1L << (Operator - 75)) | (1L << (MatrixLiteral - 75)) | (1L << (CharacterLiteral - 75)) | (1L << (FloatingLiteral - 75)) | (1L << (PointerLiteral - 75)) | (1L << (UserDefinedLiteral - 75)))) != 0)) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitParameterDeclarationClause(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitParameterDeclarationList(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBraceOrEqualInitializer(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInitializerClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerClauseContext initializerClause() throws RecognitionException {
		InitializerClauseContext _localctx = new InitializerClauseContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_initializerClause);
		try {
			setState(1505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1502);
				assignmentExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1503);
				bracedInitList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1504);
				matrix();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInitializerList(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBracedInitList(this);
			else return visitor.visitChildren(this);
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IntegerLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Bool) | (1L << Float) | (1L << Matrix) | (1L << Int) | (1L << Void) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Tilde) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Identifier - 69)) | (1L << (Doublecolon - 69)) | (1L << (Dynamic_cast - 69)) | (1L << (Static_cast - 69)) | (1L << (Reinterpret_cast - 69)) | (1L << (Const_cast - 69)) | (1L << (Typeid_ - 69)) | (1L << (Sizeof - 69)) | (1L << (Alignof - 69)) | (1L << (Or - 69)) | (1L << (New - 69)) | (1L << (Delete - 69)) | (1L << (Noexcept - 69)) | (1L << (Short - 69)) | (1L << (Long - 69)) | (1L << (Unsigned - 69)) | (1L << (Signed - 69)) | (1L << (Char - 69)) | (1L << (Char16 - 69)) | (1L << (Char32 - 69)) | (1L << (Wchar - 69)) | (1L << (Double - 69)) | (1L << (Auto - 69)) | (1L << (Decltype - 69)) | (1L << (Operator - 69)) | (1L << (MatrixLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (FloatingLiteral - 69)) | (1L << (PointerLiteral - 69)))) != 0) || _la==UserDefinedLiteral) {
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

	public static class MeminitializeridContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(gParser.Identifier, 0); }
		public MeminitializeridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMeminitializerid(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitOperatorFunctionId(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLiteralOperatorId(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTheOperator(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (MatrixLiteral - 129)) | (1L << (CharacterLiteral - 129)) | (1L << (FloatingLiteral - 129)) | (1L << (PointerLiteral - 129)) | (1L << (UserDefinedLiteral - 129)))) != 0)) ) {
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
		enterRule(_localctx, 288, RULE_matrix);
		int _la;
		try {
			setState(1579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
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
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1578);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1581);
			literal();
			setState(1586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1582);
				match(T__3);
				setState(1583);
				literal();
				}
				}
				setState(1588);
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
		enterRule(_localctx, 292, RULE_shortquery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1589);
			sqlbase();
			setState(1591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket) {
				{
				setState(1590);
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
		enterRule(_localctx, 294, RULE_sqlbase);
		int _la;
		try {
			setState(1605);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1593);
				match(LeftBracket);
				setState(1594);
				querydatajoin();
				setState(1599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(1595);
					match(Comma);
					setState(1596);
					querydatajoin();
					}
					}
					setState(1601);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1602);
				match(RightBracket);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1604);
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
		enterRule(_localctx, 296, RULE_sqlwhere);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1607);
			match(LeftBracket);
			setState(1608);
			conditionalExpression();
			setState(1613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1609);
				match(Comma);
				setState(1610);
				conditionalExpression();
				}
				}
				setState(1615);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1616);
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
		enterRule(_localctx, 298, RULE_querydatajoin);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1618);
			match(Identifier);
			setState(1623);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1619);
					_la = _input.LA(1);
					if ( !(_la==Comma || _la==Dot) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1620);
					match(Identifier);
					}
					} 
				}
				setState(1625);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			}
			setState(1636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Colon) {
				{
				{
				setState(1626);
				match(Colon);
				setState(1627);
				match(Identifier);
				setState(1630); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1628);
						match(Comma);
						setState(1629);
						match(Identifier);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1632); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(1638);
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
		enterRule(_localctx, 300, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1639);
			match(LeftBracket);
			setState(1640);
			match(Identifier);
			setState(1643); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1641);
				match(T__3);
				setState(1642);
				match(Identifier);
				}
				}
				setState(1645); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(1647);
			match(T__4);
			setState(1648);
			shortquery();
			setState(1649);
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
		enterRule(_localctx, 302, RULE_askingquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1651);
			match(Identifier);
			setState(1652);
			match(Question);
			setState(1653);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0087\u067a\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\3\2\5\2\u0134\n\2\3\2\3\2\3\3"+
		"\6\3\u0139\n\3\r\3\16\3\u013a\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0144\n"+
		"\3\3\4\3\4\5\4\u0148\n\4\3\5\3\5\3\5\3\5\3\5\5\5\u014f\n\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\5\7\u0158\n\7\3\7\3\7\3\7\3\7\3\7\7\7\u015f\n\7\f\7\16"+
		"\7\u0162\13\7\3\b\3\b\5\b\u0166\n\b\3\b\3\b\3\t\3\t\5\t\u016c\n\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\5\n\u0174\n\n\5\n\u0176\n\n\3\13\3\13\3\f\3\f\3\f"+
		"\7\f\u017d\n\f\f\f\16\f\u0180\13\f\3\f\5\f\u0183\n\f\3\r\3\r\5\r\u0187"+
		"\n\r\3\16\5\16\u018a\n\16\3\16\3\16\5\16\u018e\n\16\3\17\5\17\u0191\n"+
		"\17\3\17\3\17\3\17\3\20\3\20\5\20\u0198\n\20\3\20\3\20\5\20\u019c\n\20"+
		"\3\20\5\20\u019f\n\20\3\20\5\20\u01a2\n\20\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u01a9\n\21\3\21\3\21\5\21\u01ad\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u01bb\n\21\3\21\3\21\5\21\u01bf\n"+
		"\21\3\21\3\21\3\21\3\21\5\21\u01c5\n\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u01cc\n\21\3\21\3\21\3\21\3\21\5\21\u01d2\n\21\3\21\3\21\5\21\u01d6\n"+
		"\21\3\21\3\21\7\21\u01da\n\21\f\21\16\21\u01dd\13\21\3\22\3\22\3\23\3"+
		"\23\3\24\5\24\u01e4\n\24\3\24\3\24\3\24\5\24\u01e9\n\24\3\24\3\24\3\24"+
		"\3\24\5\24\u01ef\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u01f6\n\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0202\n\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u020c\n\25\3\26\3\26\3\27\5\27\u0211"+
		"\n\27\3\27\3\27\5\27\u0215\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u021c\n"+
		"\27\3\27\5\27\u021f\n\27\3\30\3\30\3\30\3\30\3\31\3\31\5\31\u0227\n\31"+
		"\3\32\3\32\5\32\u022b\n\32\3\32\5\32\u022e\n\32\3\33\3\33\3\33\3\33\3"+
		"\33\5\33\u0235\n\33\3\33\3\33\3\33\3\33\3\33\5\33\u023c\n\33\7\33\u023e"+
		"\n\33\f\33\16\33\u0241\13\33\3\34\3\34\5\34\u0245\n\34\3\34\3\34\5\34"+
		"\u0249\n\34\3\35\5\35\u024c\n\35\3\35\3\35\3\35\5\35\u0251\n\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0260"+
		"\n\37\3 \3 \3 \7 \u0265\n \f \16 \u0268\13 \3!\3!\3!\7!\u026d\n!\f!\16"+
		"!\u0270\13!\3\"\3\"\3\"\7\"\u0275\n\"\f\"\16\"\u0278\13\"\3#\3#\3#\3#"+
		"\7#\u027e\n#\f#\16#\u0281\13#\3$\3$\3$\3$\5$\u0287\n$\3%\3%\3%\7%\u028c"+
		"\n%\f%\16%\u028f\13%\3&\3&\3&\7&\u0294\n&\f&\16&\u0297\13&\3\'\3\'\3\'"+
		"\7\'\u029c\n\'\f\'\16\'\u029f\13\'\3(\3(\3(\7(\u02a4\n(\f(\16(\u02a7\13"+
		"(\3)\3)\3)\7)\u02ac\n)\f)\16)\u02af\13)\3*\3*\3*\7*\u02b4\n*\f*\16*\u02b7"+
		"\13*\3+\3+\3+\7+\u02bc\n+\f+\16+\u02bf\13+\3,\3,\3,\3,\3,\3,\5,\u02c7"+
		"\n,\3-\3-\3-\3-\3-\5-\u02ce\n-\3.\3.\3/\3/\3/\7/\u02d5\n/\f/\16/\u02d8"+
		"\13/\3\60\3\60\3\61\3\61\3\61\5\61\u02df\n\61\3\61\3\61\3\61\3\61\3\61"+
		"\5\61\u02e6\n\61\5\61\u02e8\n\61\3\62\5\62\u02eb\n\62\3\62\3\62\3\62\3"+
		"\62\5\62\u02f1\n\62\3\62\3\62\3\62\3\63\5\63\u02f7\n\63\3\63\3\63\3\64"+
		"\3\64\5\64\u02fd\n\64\3\64\3\64\3\65\6\65\u0302\n\65\r\65\16\65\u0303"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u030d\n\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\5\66\u0315\n\66\3\67\3\67\5\67\u0319\n\67\3\67\3\67\3\67\3"+
		"\67\3\67\5\67\u0320\n\67\5\67\u0322\n\67\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\58\u0336\n8\38\38\58\u033a\n8\38\38\38\38\5"+
		"8\u0340\n8\38\38\38\58\u0345\n8\39\39\59\u0349\n9\3:\5:\u034c\n:\3:\3"+
		":\3:\3;\3;\5;\u0353\n;\3<\3<\3<\3<\3<\5<\u035a\n<\3<\3<\5<\u035e\n<\3"+
		"<\3<\3=\3=\3>\6>\u0365\n>\r>\16>\u0366\3?\3?\3?\3?\3?\3?\5?\u036f\n?\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\5@\u0379\n@\3A\3A\3A\5A\u037e\nA\3A\3A\3A\3A\3"+
		"B\5B\u0385\nB\3B\5B\u0388\nB\3B\3B\3B\5B\u038d\nB\3B\3B\3B\5B\u0392\n"+
		"B\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3E\3E\3E\3F\3F\3F\3F\3F\3F\5F\u03a7\n"+
		"F\3G\6G\u03aa\nG\rG\16G\u03ab\3G\5G\u03af\nG\3H\3H\3I\3I\3J\3J\3K\3K\5"+
		"K\u03b9\nK\3L\3L\3L\5L\u03be\nL\3M\6M\u03c1\nM\rM\16M\u03c2\3M\5M\u03c6"+
		"\nM\3N\6N\u03c9\nN\rN\16N\u03ca\3N\5N\u03ce\nN\3O\3O\3P\3P\3Q\5Q\u03d5"+
		"\nQ\3Q\3Q\3Q\5Q\u03da\nQ\3Q\6Q\u03dd\nQ\rQ\16Q\u03de\3Q\5Q\u03e2\nQ\3"+
		"Q\3Q\5Q\u03e6\nQ\3Q\3Q\5Q\u03ea\nQ\3Q\3Q\5Q\u03ee\nQ\3Q\3Q\3Q\3Q\5Q\u03f4"+
		"\nQ\3Q\7Q\u03f7\nQ\fQ\16Q\u03fa\13Q\3Q\3Q\3Q\5Q\u03ff\nQ\3Q\3Q\3Q\3Q\5"+
		"Q\u0405\nQ\3R\3R\5R\u0409\nR\3S\3S\3S\3S\5S\u040f\nS\3S\3S\3T\3T\5T\u0415"+
		"\nT\3T\3T\3U\3U\3V\3V\3V\3V\5V\u041f\nV\5V\u0421\nV\3V\3V\3W\3W\5W\u0427"+
		"\nW\3W\5W\u042a\nW\3W\5W\u042d\nW\3W\5W\u0430\nW\3X\3X\5X\u0434\nX\3X"+
		"\3X\5X\u0438\nX\3X\3X\3Y\3Y\5Y\u043e\nY\3Z\3Z\3Z\3[\3[\3[\7[\u0446\n["+
		"\f[\16[\u0449\13[\3\\\3\\\3\\\5\\\u044e\n\\\3]\3]\3^\3^\5^\u0454\n^\3"+
		"_\3_\3`\5`\u0459\n`\3`\3`\3`\5`\u045e\n`\3`\3`\5`\u0462\n`\3`\3`\3a\3"+
		"a\3b\3b\3b\3b\3b\3b\3c\5c\u046f\nc\3c\3c\3d\3d\5d\u0475\nd\3d\3d\5d\u0479"+
		"\nd\3d\3d\3d\3e\5e\u047f\ne\3e\3e\3e\5e\u0484\ne\3e\3e\3e\3f\3f\3f\3f"+
		"\3f\3f\3g\3g\3g\3g\5g\u0493\ng\3g\3g\5g\u0497\ng\3h\6h\u049a\nh\rh\16"+
		"h\u049b\3i\3i\3i\5i\u04a1\ni\3i\3i\3i\5i\u04a6\ni\3j\3j\3j\3j\5j\u04ac"+
		"\nj\3j\5j\u04af\nj\3j\3j\3k\3k\3k\7k\u04b6\nk\fk\16k\u04b9\13k\3k\5k\u04bc"+
		"\nk\3l\3l\3l\5l\u04c1\nl\3l\3l\5l\u04c5\nl\3m\3m\3n\3n\5n\u04cb\nn\3n"+
		"\3n\3o\6o\u04d0\no\ro\16o\u04d1\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3"+
		"p\6p\u04e1\np\rp\16p\u04e2\5p\u04e5\np\3q\3q\3q\7q\u04ea\nq\fq\16q\u04ed"+
		"\13q\3r\3r\5r\u04f1\nr\3s\3s\3s\3s\3s\5s\u04f8\ns\3t\3t\5t\u04fc\nt\7"+
		"t\u04fe\nt\ft\16t\u0501\13t\3t\3t\3u\3u\3u\5u\u0508\nu\3u\3u\3u\3u\5u"+
		"\u050e\nu\3u\3u\3u\3u\5u\u0514\nu\3u\3u\5u\u0518\nu\5u\u051a\nu\7u\u051c"+
		"\nu\fu\16u\u051f\13u\3v\3v\5v\u0523\nv\3v\3v\5v\u0527\nv\3v\5v\u052a\n"+
		"v\3v\5v\u052d\nv\3w\3w\3w\5w\u0532\nw\3x\3x\5x\u0536\nx\3x\5x\u0539\n"+
		"x\3x\3x\5x\u053d\nx\3x\5x\u0540\nx\5x\u0542\nx\3y\6y\u0545\ny\ry\16y\u0546"+
		"\3z\3z\3{\3{\3|\5|\u054e\n|\3|\3|\3}\3}\5}\u0554\n}\3~\3~\5~\u0558\n~"+
		"\3~\3~\3~\3~\5~\u055e\n~\3\177\3\177\6\177\u0562\n\177\r\177\16\177\u0563"+
		"\3\177\5\177\u0567\n\177\5\177\u0569\n\177\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\5\u0080\u056f\n\u0080\3\u0080\3\u0080\5\u0080\u0573\n\u0080\3\u0080\3"+
		"\u0080\3\u0080\3\u0080\5\u0080\u0579\n\u0080\3\u0080\3\u0080\3\u0080\3"+
		"\u0080\3\u0080\5\u0080\u0580\n\u0080\3\u0080\3\u0080\5\u0080\u0584\n\u0080"+
		"\5\u0080\u0586\n\u0080\7\u0080\u0588\n\u0080\f\u0080\16\u0080\u058b\13"+
		"\u0080\3\u0081\7\u0081\u058e\n\u0081\f\u0081\16\u0081\u0591\13\u0081\3"+
		"\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\5\u0082\u059c\n\u0082\3\u0082\3\u0082\5\u0082\u05a0\n\u0082\5\u0082\u05a2"+
		"\n\u0082\7\u0082\u05a4\n\u0082\f\u0082\16\u0082\u05a7\13\u0082\3\u0083"+
		"\3\u0083\5\u0083\u05ab\n\u0083\3\u0083\5\u0083\u05ae\n\u0083\3\u0084\3"+
		"\u0084\3\u0084\7\u0084\u05b3\n\u0084\f\u0084\16\u0084\u05b6\13\u0084\3"+
		"\u0085\5\u0085\u05b9\n\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u05be\n\u0085"+
		"\5\u0085\u05c0\n\u0085\3\u0085\3\u0085\5\u0085\u05c4\n\u0085\3\u0086\5"+
		"\u0086\u05c7\n\u0086\3\u0086\5\u0086\u05ca\n\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u05d3\n\u0087\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\5\u0088\u05da\n\u0088\3\u0089\3\u0089\3\u0089"+
		"\5\u0089\u05df\n\u0089\3\u008a\3\u008a\3\u008a\5\u008a\u05e4\n\u008a\3"+
		"\u008b\3\u008b\5\u008b\u05e8\n\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u05ed"+
		"\n\u008b\7\u008b\u05ef\n\u008b\f\u008b\16\u008b\u05f2\13\u008b\3\u008c"+
		"\3\u008c\3\u008c\5\u008c\u05f7\n\u008c\5\u008c\u05f9\n\u008c\3\u008c\3"+
		"\u008c\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\5\u008f\u0606\n\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090"+
		"\u061e\n\u0090\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\7\u0092"+
		"\u0626\n\u0092\f\u0092\16\u0092\u0629\13\u0092\3\u0092\3\u0092\3\u0092"+
		"\5\u0092\u062e\n\u0092\3\u0093\3\u0093\3\u0093\7\u0093\u0633\n\u0093\f"+
		"\u0093\16\u0093\u0636\13\u0093\3\u0094\3\u0094\5\u0094\u063a\n\u0094\3"+
		"\u0095\3\u0095\3\u0095\3\u0095\7\u0095\u0640\n\u0095\f\u0095\16\u0095"+
		"\u0643\13\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u0648\n\u0095\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\7\u0096\u064e\n\u0096\f\u0096\16\u0096\u0651"+
		"\13\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\7\u0097\u0658\n\u0097"+
		"\f\u0097\16\u0097\u065b\13\u0097\3\u0097\3\u0097\3\u0097\3\u0097\6\u0097"+
		"\u0661\n\u0097\r\u0097\16\u0097\u0662\7\u0097\u0665\n\u0097\f\u0097\16"+
		"\u0097\u0668\13\u0097\3\u0098\3\u0098\3\u0098\3\u0098\6\u0098\u066e\n"+
		"\u0098\r\u0098\16\u0098\u066f\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u03ab\b\f \64\u00e8\u00fe\u0102\u009a"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c"+
		"\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\2\30\4\2"+
		"&&))\3\2PS\4\2@@DD\3\2<=\5\2 \"&(XX\4\2??EE\3\2\"$\3\2 !\4\2*+89\3\2\66"+
		"\67\4\2)),\65\4\2OOfi\3\2jl\3\2mn\3\2op\3\2yz\3\2\32\37\4\2&&::\3\2\177"+
		"\u0080\4\2ZZ]]\4\2\b\n\u0083\u0087\4\2>>DD\2\u0713\2\u0133\3\2\2\2\4\u0143"+
		"\3\2\2\2\6\u0147\3\2\2\2\b\u014e\3\2\2\2\n\u0150\3\2\2\2\f\u0153\3\2\2"+
		"\2\16\u0163\3\2\2\2\20\u0169\3\2\2\2\22\u0175\3\2\2\2\24\u0177\3\2\2\2"+
		"\26\u0179\3\2\2\2\30\u0186\3\2\2\2\32\u018d\3\2\2\2\34\u0190\3\2\2\2\36"+
		"\u0195\3\2\2\2 \u01be\3\2\2\2\"\u01de\3\2\2\2$\u01e0\3\2\2\2&\u01ee\3"+
		"\2\2\2(\u020b\3\2\2\2*\u020d\3\2\2\2,\u0210\3\2\2\2.\u0220\3\2\2\2\60"+
		"\u0224\3\2\2\2\62\u022d\3\2\2\2\64\u022f\3\2\2\2\66\u0248\3\2\2\28\u024b"+
		"\3\2\2\2:\u0254\3\2\2\2<\u025f\3\2\2\2>\u0261\3\2\2\2@\u0269\3\2\2\2B"+
		"\u0271\3\2\2\2D\u0279\3\2\2\2F\u0286\3\2\2\2H\u0288\3\2\2\2J\u0290\3\2"+
		"\2\2L\u0298\3\2\2\2N\u02a0\3\2\2\2P\u02a8\3\2\2\2R\u02b0\3\2\2\2T\u02b8"+
		"\3\2\2\2V\u02c0\3\2\2\2X\u02cd\3\2\2\2Z\u02cf\3\2\2\2\\\u02d1\3\2\2\2"+
		"^\u02d9\3\2\2\2`\u02e7\3\2\2\2b\u02ea\3\2\2\2d\u02f6\3\2\2\2f\u02fa\3"+
		"\2\2\2h\u0301\3\2\2\2j\u0314\3\2\2\2l\u0321\3\2\2\2n\u0344\3\2\2\2p\u0348"+
		"\3\2\2\2r\u034b\3\2\2\2t\u0352\3\2\2\2v\u035d\3\2\2\2x\u0361\3\2\2\2z"+
		"\u0364\3\2\2\2|\u036e\3\2\2\2~\u0378\3\2\2\2\u0080\u037a\3\2\2\2\u0082"+
		"\u0391\3\2\2\2\u0084\u0393\3\2\2\2\u0086\u039b\3\2\2\2\u0088\u039d\3\2"+
		"\2\2\u008a\u03a6\3\2\2\2\u008c\u03a9\3\2\2\2\u008e\u03b0\3\2\2\2\u0090"+
		"\u03b2\3\2\2\2\u0092\u03b4\3\2\2\2\u0094\u03b8\3\2\2\2\u0096\u03bd\3\2"+
		"\2\2\u0098\u03c0\3\2\2\2\u009a\u03c8\3\2\2\2\u009c\u03cf\3\2\2\2\u009e"+
		"\u03d1\3\2\2\2\u00a0\u0404\3\2\2\2\u00a2\u0408\3\2\2\2\u00a4\u040a\3\2"+
		"\2\2\u00a6\u0412\3\2\2\2\u00a8\u0418\3\2\2\2\u00aa\u041a\3\2\2\2\u00ac"+
		"\u0424\3\2\2\2\u00ae\u0431\3\2\2\2\u00b0\u043b\3\2\2\2\u00b2\u043f\3\2"+
		"\2\2\u00b4\u0442\3\2\2\2\u00b6\u044a\3\2\2\2\u00b8\u044f\3\2\2\2\u00ba"+
		"\u0453\3\2\2\2\u00bc\u0455\3\2\2\2\u00be\u0458\3\2\2\2\u00c0\u0465\3\2"+
		"\2\2\u00c2\u0467\3\2\2\2\u00c4\u046e\3\2\2\2\u00c6\u0472\3\2\2\2\u00c8"+
		"\u047e\3\2\2\2\u00ca\u0488\3\2\2\2\u00cc\u048e\3\2\2\2\u00ce\u0499\3\2"+
		"\2\2\u00d0\u04a5\3\2\2\2\u00d2\u04a7\3\2\2\2\u00d4\u04b2\3\2\2\2\u00d6"+
		"\u04c0\3\2\2\2\u00d8\u04c6\3\2\2\2\u00da\u04c8\3\2\2\2\u00dc\u04cf\3\2"+
		"\2\2\u00de\u04e4\3\2\2\2\u00e0\u04e6\3\2\2\2\u00e2\u04ee\3\2\2\2\u00e4"+
		"\u04f7\3\2\2\2\u00e6\u04ff\3\2\2\2\u00e8\u050d\3\2\2\2\u00ea\u0520\3\2"+
		"\2\2\u00ec\u052e\3\2\2\2\u00ee\u0541\3\2\2\2\u00f0\u0544\3\2\2\2\u00f2"+
		"\u0548\3\2\2\2\u00f4\u054a\3\2\2\2\u00f6\u054d\3\2\2\2\u00f8\u0551\3\2"+
		"\2\2\u00fa\u055d\3\2\2\2\u00fc\u0568\3\2\2\2\u00fe\u0578\3\2\2\2\u0100"+
		"\u058f\3\2\2\2\u0102\u0594\3\2\2\2\u0104\u05a8\3\2\2\2\u0106\u05af\3\2"+
		"\2\2\u0108\u05b8\3\2\2\2\u010a\u05c6\3\2\2\2\u010c\u05d2\3\2\2\2\u010e"+
		"\u05d9\3\2\2\2\u0110\u05de\3\2\2\2\u0112\u05e3\3\2\2\2\u0114\u05e5\3\2"+
		"\2\2\u0116\u05f3\3\2\2\2\u0118\u05fc\3\2\2\2\u011a\u05fe\3\2\2\2\u011c"+
		"\u0601\3\2\2\2\u011e\u061d\3\2\2\2\u0120\u061f\3\2\2\2\u0122\u062d\3\2"+
		"\2\2\u0124\u062f\3\2\2\2\u0126\u0637\3\2\2\2\u0128\u0647\3\2\2\2\u012a"+
		"\u0649\3\2\2\2\u012c\u0654\3\2\2\2\u012e\u0669\3\2\2\2\u0130\u0675\3\2"+
		"\2\2\u0132\u0134\5z>\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135"+
		"\3\2\2\2\u0135\u0136\7\2\2\3\u0136\3\3\2\2\2\u0137\u0139\5\u0120\u0091"+
		"\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b"+
		"\3\2\2\2\u013b\u0144\3\2\2\2\u013c\u013d\7\32\2\2\u013d\u013e\5\\/\2\u013e"+
		"\u013f\7\33\2\2\u013f\u0144\3\2\2\2\u0140\u0144\5\6\4\2\u0141\u0144\5"+
		"\16\b\2\u0142\u0144\5\u012e\u0098\2\u0143\u0138\3\2\2\2\u0143\u013c\3"+
		"\2\2\2\u0143\u0140\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144"+
		"\5\3\2\2\2\u0145\u0148\5\b\5\2\u0146\u0148\5\n\6\2\u0147\u0145\3\2\2\2"+
		"\u0147\u0146\3\2\2\2\u0148\7\3\2\2\2\u0149\u014f\7G\2\2\u014a\u014f\5"+
		"\u011a\u008e\2\u014b\u014f\5\u011c\u008f\2\u014c\u014d\7\'\2\2\u014d\u014f"+
		"\5\u00a4S\2\u014e\u0149\3\2\2\2\u014e\u014a\3\2\2\2\u014e\u014b\3\2\2"+
		"\2\u014e\u014c\3\2\2\2\u014f\t\3\2\2\2\u0150\u0151\5\f\7\2\u0151\u0152"+
		"\5\b\5\2\u0152\13\3\2\2\2\u0153\u0157\b\7\1\2\u0154\u0158\5\u00a2R\2\u0155"+
		"\u0158\5\u00ba^\2\u0156\u0158\5\u00a4S\2\u0157\u0154\3\2\2\2\u0157\u0155"+
		"\3\2\2\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015a\7M\2\2\u015a\u0160\3\2\2\2\u015b\u015c\f\3\2\2\u015c\u015d\7G\2"+
		"\2\u015d\u015f\7M\2\2\u015e\u015b\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\r\3\2\2\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0165\5\20\t\2\u0164\u0166\5\36\20\2\u0165\u0164\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\5f\64\2\u0168\17\3\2\2\2\u0169"+
		"\u016b\7\34\2\2\u016a\u016c\5\22\n\2\u016b\u016a\3\2\2\2\u016b\u016c\3"+
		"\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\7\35\2\2\u016e\21\3\2\2\2\u016f"+
		"\u0176\5\26\f\2\u0170\u0173\5\24\13\2\u0171\u0172\7>\2\2\u0172\u0174\5"+
		"\26\f\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175"+
		"\u016f\3\2\2\2\u0175\u0170\3\2\2\2\u0176\23\3\2\2\2\u0177\u0178\t\2\2"+
		"\2\u0178\25\3\2\2\2\u0179\u017e\5\30\r\2\u017a\u017b\7>\2\2\u017b\u017d"+
		"\5\30\r\2\u017c\u017a\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2"+
		"\u017e\u017f\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0183"+
		"\7F\2\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\27\3\2\2\2\u0184"+
		"\u0187\5\32\16\2\u0185\u0187\5\34\17\2\u0186\u0184\3\2\2\2\u0186\u0185"+
		"\3\2\2\2\u0187\31\3\2\2\2\u0188\u018a\7&\2\2\u0189\u0188\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018e\7G\2\2\u018c\u018e\7N\2"+
		"\2\u018d\u0189\3\2\2\2\u018d\u018c\3\2\2\2\u018e\33\3\2\2\2\u018f\u0191"+
		"\7&\2\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0193\7G\2\2\u0193\u0194\5\u010e\u0088\2\u0194\35\3\2\2\2\u0195\u0197"+
		"\7\32\2\2\u0196\u0198\5\u0104\u0083\2\u0197\u0196\3\2\2\2\u0197\u0198"+
		"\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\7\33\2\2\u019a\u019c\7O\2\2\u019b"+
		"\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u019f\5\u00ce"+
		"h\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0"+
		"\u01a2\5\u00ecw\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\37\3\2"+
		"\2\2\u01a3\u01a4\b\21\1\2\u01a4\u01bf\5\4\3\2\u01a5\u01ac\5\u00a0Q\2\u01a6"+
		"\u01a8\7\32\2\2\u01a7\u01a9\5$\23\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3"+
		"\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ad\7\33\2\2\u01ab\u01ad\5\u0116\u008c"+
		"\2\u01ac\u01a6\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01bf\3\2\2\2\u01ae\u01af"+
		"\t\3\2\2\u01af\u01b0\7*\2\2\u01b0\u01b1\5\u00f8}\2\u01b1\u01b2\7+\2\2"+
		"\u01b2\u01b3\7\32\2\2\u01b3\u01b4\5\\/\2\u01b4\u01b5\7\33\2\2\u01b5\u01bf"+
		"\3\2\2\2\u01b6\u01b7\5\"\22\2\u01b7\u01ba\7\32\2\2\u01b8\u01bb\5\\/\2"+
		"\u01b9\u01bb\5\u00f8}\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01bd\7\33\2\2\u01bd\u01bf\3\2\2\2\u01be\u01a3\3"+
		"\2\2\2\u01be\u01a5\3\2\2\2\u01be\u01ae\3\2\2\2\u01be\u01b6\3\2\2\2\u01bf"+
		"\u01db\3\2\2\2\u01c0\u01c1\f\t\2\2\u01c1\u01c4\7\34\2\2\u01c2\u01c5\5"+
		"\\/\2\u01c3\u01c5\5\u0116\u008c\2\u01c4\u01c2\3\2\2\2\u01c4\u01c3\3\2"+
		"\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\7\35\2\2\u01c7\u01da\3\2\2\2\u01c8"+
		"\u01c9\f\b\2\2\u01c9\u01cb\7\32\2\2\u01ca\u01cc\5$\23\2\u01cb\u01ca\3"+
		"\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01da\7\33\2\2\u01ce"+
		"\u01cf\f\6\2\2\u01cf\u01d5\t\4\2\2\u01d0\u01d2\7T\2\2\u01d1\u01d0\3\2"+
		"\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d6\5\6\4\2\u01d4"+
		"\u01d6\5&\24\2\u01d5\u01d1\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d6\u01da\3\2"+
		"\2\2\u01d7\u01d8\f\5\2\2\u01d8\u01da\t\5\2\2\u01d9\u01c0\3\2\2\2\u01d9"+
		"\u01c8\3\2\2\2\u01d9\u01ce\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01dd\3\2"+
		"\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc!\3\2\2\2\u01dd\u01db"+
		"\3\2\2\2\u01de\u01df\7U\2\2\u01df#\3\2\2\2\u01e0\u01e1\5\u0114\u008b\2"+
		"\u01e1%\3\2\2\2\u01e2\u01e4\5\f\7\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3"+
		"\2\2\2\u01e4\u01e8\3\2\2\2\u01e5\u01e6\5\u00a2R\2\u01e6\u01e7\7M\2\2\u01e7"+
		"\u01e9\3\2\2\2\u01e8\u01e5\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2"+
		"\2\2\u01ea\u01eb\7\'\2\2\u01eb\u01ef\5\u00a2R\2\u01ec\u01ed\7\'\2\2\u01ed"+
		"\u01ef\5\u00a4S\2\u01ee\u01e3\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\'\3\2"+
		"\2\2\u01f0\u020c\5 \21\2\u01f1\u01f6\7<\2\2\u01f2\u01f6\7=\2\2\u01f3\u01f6"+
		"\5*\26\2\u01f4\u01f6\7V\2\2\u01f5\u01f1\3\2\2\2\u01f5\u01f2\3\2\2\2\u01f5"+
		"\u01f3\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u020c\5("+
		"\25\2\u01f8\u0201\7V\2\2\u01f9\u01fa\7\32\2\2\u01fa\u01fb\5\u00f8}\2\u01fb"+
		"\u01fc\7\33\2\2\u01fc\u0202\3\2\2\2\u01fd\u01fe\7F\2\2\u01fe\u01ff\7\32"+
		"\2\2\u01ff\u0200\7G\2\2\u0200\u0202\7\33\2\2\u0201\u01f9\3\2\2\2\u0201"+
		"\u01fd\3\2\2\2\u0202\u020c\3\2\2\2\u0203\u0204\7W\2\2\u0204\u0205\7\32"+
		"\2\2\u0205\u0206\5\u00f8}\2\u0206\u0207\7\33\2\2\u0207\u020c\3\2\2\2\u0208"+
		"\u020c\5:\36\2\u0209\u020c\5,\27\2\u020a\u020c\58\35\2\u020b\u01f0\3\2"+
		"\2\2\u020b\u01f5\3\2\2\2\u020b\u01f8\3\2\2\2\u020b\u0203\3\2\2\2\u020b"+
		"\u0208\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020a\3\2\2\2\u020c)\3\2\2\2"+
		"\u020d\u020e\t\6\2\2\u020e+\3\2\2\2\u020f\u0211\7M\2\2\u0210\u020f\3\2"+
		"\2\2\u0210\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0214\7Y\2\2\u0213"+
		"\u0215\5.\30\2\u0214\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u021b\3\2"+
		"\2\2\u0216\u021c\5\60\31\2\u0217\u0218\7\32\2\2\u0218\u0219\5\u00f8}\2"+
		"\u0219\u021a\7\33\2\2\u021a\u021c\3\2\2\2\u021b\u0216\3\2\2\2\u021b\u0217"+
		"\3\2\2\2\u021c\u021e\3\2\2\2\u021d\u021f\5\66\34\2\u021e\u021d\3\2\2\2"+
		"\u021e\u021f\3\2\2\2\u021f-\3\2\2\2\u0220\u0221\7\32\2\2\u0221\u0222\5"+
		"$\23\2\u0222\u0223\7\33\2\2\u0223/\3\2\2\2\u0224\u0226\5\u0098M\2\u0225"+
		"\u0227\5\62\32\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227\61\3\2"+
		"\2\2\u0228\u022a\5\u00eex\2\u0229\u022b\5\62\32\2\u022a\u0229\3\2\2\2"+
		"\u022a\u022b\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022e\5\64\33\2\u022d\u0228"+
		"\3\2\2\2\u022d\u022c\3\2\2\2\u022e\63\3\2\2\2\u022f\u0230\b\33\1\2\u0230"+
		"\u0231\7\34\2\2\u0231\u0232\5\\/\2\u0232\u0234\7\35\2\2\u0233\u0235\5"+
		"\u00ceh\2\u0234\u0233\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u023f\3\2\2\2"+
		"\u0236\u0237\f\3\2\2\u0237\u0238\7\34\2\2\u0238\u0239\5^\60\2\u0239\u023b"+
		"\7\35\2\2\u023a\u023c\5\u00ceh\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2"+
		"\2\u023c\u023e\3\2\2\2\u023d\u0236\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d"+
		"\3\2\2\2\u023f\u0240\3\2\2\2\u0240\65\3\2\2\2\u0241\u023f\3\2\2\2\u0242"+
		"\u0244\7\32\2\2\u0243\u0245\5$\23\2\u0244\u0243\3\2\2\2\u0244\u0245\3"+
		"\2\2\2\u0245\u0246\3\2\2\2\u0246\u0249\7\33\2\2\u0247\u0249\5\u0116\u008c"+
		"\2\u0248\u0242\3\2\2\2\u0248\u0247\3\2\2\2\u0249\67\3\2\2\2\u024a\u024c"+
		"\7M\2\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d"+
		"\u0250\7Z\2\2\u024e\u024f\7\34\2\2\u024f\u0251\7\35\2\2\u0250\u024e\3"+
		"\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\5<\37\2\u0253"+
		"9\3\2\2\2\u0254\u0255\7[\2\2\u0255\u0256\7\32\2\2\u0256\u0257\5\\/\2\u0257"+
		"\u0258\7\33\2\2\u0258;\3\2\2\2\u0259\u0260\5(\25\2\u025a\u025b\7\32\2"+
		"\2\u025b\u025c\5\u00f8}\2\u025c\u025d\7\33\2\2\u025d\u025e\5<\37\2\u025e"+
		"\u0260\3\2\2\2\u025f\u0259\3\2\2\2\u025f\u025a\3\2\2\2\u0260=\3\2\2\2"+
		"\u0261\u0266\5<\37\2\u0262\u0263\t\7\2\2\u0263\u0265\5<\37\2\u0264\u0262"+
		"\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267"+
		"?\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u026e\5> \2\u026a\u026b\t\b\2\2\u026b"+
		"\u026d\5> \2\u026c\u026a\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2"+
		"\2\u026e\u026f\3\2\2\2\u026fA\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0276"+
		"\5@!\2\u0272\u0273\t\t\2\2\u0273\u0275\5@!\2\u0274\u0272\3\2\2\2\u0275"+
		"\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277C\3\2\2\2"+
		"\u0278\u0276\3\2\2\2\u0279\u027f\5B\"\2\u027a\u027b\5F$\2\u027b\u027c"+
		"\5B\"\2\u027c\u027e\3\2\2\2\u027d\u027a\3\2\2\2\u027e\u0281\3\2\2\2\u027f"+
		"\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280E\3\2\2\2\u0281\u027f\3\2\2\2"+
		"\u0282\u0283\7+\2\2\u0283\u0287\7+\2\2\u0284\u0285\7*\2\2\u0285\u0287"+
		"\7*\2\2\u0286\u0282\3\2\2\2\u0286\u0284\3\2\2\2\u0287G\3\2\2\2\u0288\u028d"+
		"\5D#\2\u0289\u028a\t\n\2\2\u028a\u028c\5D#\2\u028b\u0289\3\2\2\2\u028c"+
		"\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028eI\3\2\2\2"+
		"\u028f\u028d\3\2\2\2\u0290\u0295\5H%\2\u0291\u0292\t\13\2\2\u0292\u0294"+
		"\5H%\2\u0293\u0291\3\2\2\2\u0294\u0297\3\2\2\2\u0295\u0293\3\2\2\2\u0295"+
		"\u0296\3\2\2\2\u0296K\3\2\2\2\u0297\u0295\3\2\2\2\u0298\u029d\5J&\2\u0299"+
		"\u029a\7&\2\2\u029a\u029c\5J&\2\u029b\u0299\3\2\2\2\u029c\u029f\3\2\2"+
		"\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029eM\3\2\2\2\u029f\u029d"+
		"\3\2\2\2\u02a0\u02a5\5L\'\2\u02a1\u02a2\7%\2\2\u02a2\u02a4\5L\'\2\u02a3"+
		"\u02a1\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2"+
		"\2\2\u02a6O\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02ad\5N(\2\u02a9\u02aa"+
		"\7X\2\2\u02aa\u02ac\5N(\2\u02ab\u02a9\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad"+
		"\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02aeQ\3\2\2\2\u02af\u02ad\3\2\2\2"+
		"\u02b0\u02b5\5P)\2\u02b1\u02b2\7:\2\2\u02b2\u02b4\5P)\2\u02b3\u02b1\3"+
		"\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6"+
		"S\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8\u02bd\5R*\2\u02b9\u02ba\7;\2\2\u02ba"+
		"\u02bc\5R*\2\u02bb\u02b9\3\2\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2"+
		"\2\u02bd\u02be\3\2\2\2\u02beU\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02c6"+
		"\5T+\2\u02c1\u02c2\7A\2\2\u02c2\u02c3\5\\/\2\u02c3\u02c4\7B\2\2\u02c4"+
		"\u02c5\5X-\2\u02c5\u02c7\3\2\2\2\u02c6\u02c1\3\2\2\2\u02c6\u02c7\3\2\2"+
		"\2\u02c7W\3\2\2\2\u02c8\u02ce\5V,\2\u02c9\u02ca\5T+\2\u02ca\u02cb\5Z."+
		"\2\u02cb\u02cc\5\u0112\u008a\2\u02cc\u02ce\3\2\2\2\u02cd\u02c8\3\2\2\2"+
		"\u02cd\u02c9\3\2\2\2\u02ceY\3\2\2\2\u02cf\u02d0\t\f\2\2\u02d0[\3\2\2\2"+
		"\u02d1\u02d6\5X-\2\u02d2\u02d3\7>\2\2\u02d3\u02d5\5X-\2\u02d4\u02d2\3"+
		"\2\2\2\u02d5\u02d8\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7"+
		"]\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d9\u02da\5V,\2\u02da_\3\2\2\2\u02db\u02e8"+
		"\5b\62\2\u02dc\u02e8\5x=\2\u02dd\u02df\5\u00ceh\2\u02de\u02dd\3\2\2\2"+
		"\u02de\u02df\3\2\2\2\u02df\u02e5\3\2\2\2\u02e0\u02e6\5d\63\2\u02e1\u02e6"+
		"\5f\64\2\u02e2\u02e6\5j\66\2\u02e3\u02e6\5n8\2\u02e4\u02e6\5v<\2\u02e5"+
		"\u02e0\3\2\2\2\u02e5\u02e1\3\2\2\2\u02e5\u02e2\3\2\2\2\u02e5\u02e3\3\2"+
		"\2\2\u02e5\u02e4\3\2\2\2\u02e6\u02e8\3\2\2\2\u02e7\u02db\3\2\2\2\u02e7"+
		"\u02dc\3\2\2\2\u02e7\u02de\3\2\2\2\u02e8a\3\2\2\2\u02e9\u02eb\5\u00ce"+
		"h\2\u02ea\u02e9\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02f0\3\2\2\2\u02ec"+
		"\u02f1\7G\2\2\u02ed\u02ee\7\\\2\2\u02ee\u02f1\5^\60\2\u02ef\u02f1\7]\2"+
		"\2\u02f0\u02ec\3\2\2\2\u02f0\u02ed\3\2\2\2\u02f0\u02ef\3\2\2\2\u02f1\u02f2"+
		"\3\2\2\2\u02f2\u02f3\7B\2\2\u02f3\u02f4\5`\61\2\u02f4c\3\2\2\2\u02f5\u02f7"+
		"\5\\/\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8"+
		"\u02f9\7C\2\2\u02f9e\3\2\2\2\u02fa\u02fc\7\36\2\2\u02fb\u02fd\5h\65\2"+
		"\u02fc\u02fb\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff"+
		"\7\37\2\2\u02ffg\3\2\2\2\u0300\u0302\5`\61\2\u0301\u0300\3\2\2\2\u0302"+
		"\u0303\3\2\2\2\u0303\u0301\3\2\2\2\u0303\u0304\3\2\2\2\u0304i\3\2\2\2"+
		"\u0305\u0306\7\24\2\2\u0306\u0307\7\32\2\2\u0307\u0308\5l\67\2\u0308\u0309"+
		"\7\33\2\2\u0309\u030c\5`\61\2\u030a\u030b\7\17\2\2\u030b\u030d\5`\61\2"+
		"\u030c\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u0315\3\2\2\2\u030e\u030f"+
		"\7^\2\2\u030f\u0310\7\32\2\2\u0310\u0311\5l\67\2\u0311\u0312\7\33\2\2"+
		"\u0312\u0313\5`\61\2\u0313\u0315\3\2\2\2\u0314\u0305\3\2\2\2\u0314\u030e"+
		"\3\2\2\2\u0315k\3\2\2\2\u0316\u0322\5\\/\2\u0317\u0319\5\u00ceh\2\u0318"+
		"\u0317\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031b\5\u008c"+
		"G\2\u031b\u031f\5\u00e4s\2\u031c\u031d\7)\2\2\u031d\u0320\5\u0112\u008a"+
		"\2\u031e\u0320\5\u0116\u008c\2\u031f\u031c\3\2\2\2\u031f\u031e\3\2\2\2"+
		"\u0320\u0322\3\2\2\2\u0321\u0316\3\2\2\2\u0321\u0318\3\2\2\2\u0322m\3"+
		"\2\2\2\u0323\u0324\7\31\2\2\u0324\u0325\7\32\2\2\u0325\u0326\5l\67\2\u0326"+
		"\u0327\7\33\2\2\u0327\u0328\5`\61\2\u0328\u0345\3\2\2\2\u0329\u032a\7"+
		"_\2\2\u032a\u032b\5`\61\2\u032b\u032c\7\31\2\2\u032c\u032d\7\32\2\2\u032d"+
		"\u032e\5\\/\2\u032e\u032f\7\33\2\2\u032f\u0330\7C\2\2\u0330\u0345\3\2"+
		"\2\2\u0331\u0332\7\23\2\2\u0332\u033f\7\32\2\2\u0333\u0335\5p9\2\u0334"+
		"\u0336\5l\67\2\u0335\u0334\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0337\3\2"+
		"\2\2\u0337\u0339\7C\2\2\u0338\u033a\5\\/\2\u0339\u0338\3\2\2\2\u0339\u033a"+
		"\3\2\2\2\u033a\u0340\3\2\2\2\u033b\u033c\5r:\2\u033c\u033d\7B\2\2\u033d"+
		"\u033e\5t;\2\u033e\u0340\3\2\2\2\u033f\u0333\3\2\2\2\u033f\u033b\3\2\2"+
		"\2\u0340\u0341\3\2\2\2\u0341\u0342\7\33\2\2\u0342\u0343\5`\61\2\u0343"+
		"\u0345\3\2\2\2\u0344\u0323\3\2\2\2\u0344\u0329\3\2\2\2\u0344\u0331\3\2"+
		"\2\2\u0345o\3\2\2\2\u0346\u0349\5d\63\2\u0347\u0349\5\u0082B\2\u0348\u0346"+
		"\3\2\2\2\u0348\u0347\3\2\2\2\u0349q\3\2\2\2\u034a\u034c\5\u00ceh\2\u034b"+
		"\u034a\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\5\u008c"+
		"G\2\u034e\u034f\5\u00e4s\2\u034fs\3\2\2\2\u0350\u0353\5\\/\2\u0351\u0353"+
		"\5\u0116\u008c\2\u0352\u0350\3\2\2\2\u0352\u0351\3\2\2\2\u0353u\3\2\2"+
		"\2\u0354\u035e\7\r\2\2\u0355\u035e\7\16\2\2\u0356\u0359\7\27\2\2\u0357"+
		"\u035a\5\\/\2\u0358\u035a\5\u0116\u008c\2\u0359\u0357\3\2\2\2\u0359\u0358"+
		"\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035e\3\2\2\2\u035b\u035c\7`\2\2\u035c"+
		"\u035e\7G\2\2\u035d\u0354\3\2\2\2\u035d\u0355\3\2\2\2\u035d\u0356\3\2"+
		"\2\2\u035d\u035b\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0360\7C\2\2\u0360"+
		"w\3\2\2\2\u0361\u0362\5~@\2\u0362y\3\2\2\2\u0363\u0365\5|?\2\u0364\u0363"+
		"\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0364\3\2\2\2\u0366\u0367\3\2\2\2\u0367"+
		"{\3\2\2\2\u0368\u036f\5~@\2\u0369\u036f\5\u010a\u0086\2\u036a\u036f\5"+
		"\u00ccg\2\u036b\u036f\5\u00be`\2\u036c\u036f\5\u0086D\2\u036d\u036f\5"+
		"\u0088E\2\u036e\u0368\3\2\2\2\u036e\u0369\3\2\2\2\u036e\u036a\3\2\2\2"+
		"\u036e\u036b\3\2\2\2\u036e\u036c\3\2\2\2\u036e\u036d\3\2\2\2\u036f}\3"+
		"\2\2\2\u0370\u0379\5\u0082B\2\u0371\u0379\5\u00caf\2\u0372\u0379\5\u00c2"+
		"b\2\u0373\u0379\5\u00c6d\2\u0374\u0379\5\u00c8e\2\u0375\u0379\5\u0084"+
		"C\2\u0376\u0379\5\u0080A\2\u0377\u0379\5\u00aeX\2\u0378\u0370\3\2\2\2"+
		"\u0378\u0371\3\2\2\2\u0378\u0372\3\2\2\2\u0378\u0373\3\2\2\2\u0378\u0374"+
		"\3\2\2\2\u0378\u0375\3\2\2\2\u0378\u0376\3\2\2\2\u0378\u0377\3\2\2\2\u0379"+
		"\177\3\2\2\2\u037a\u037b\7a\2\2\u037b\u037d\7G\2\2\u037c\u037e\5\u00ce"+
		"h\2\u037d\u037c\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u037f\3\2\2\2\u037f"+
		"\u0380\7)\2\2\u0380\u0381\5\u00f8}\2\u0381\u0382\7C\2\2\u0382\u0081\3"+
		"\2\2\2\u0383\u0385\5\u008cG\2\u0384\u0383\3\2\2\2\u0384\u0385\3\2\2\2"+
		"\u0385\u0387\3\2\2\2\u0386\u0388\5\u00e0q\2\u0387\u0386\3\2\2\2\u0387"+
		"\u0388\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u0392\7C\2\2\u038a\u038c\5\u00ce"+
		"h\2\u038b\u038d\5\u008cG\2\u038c\u038b\3\2\2\2\u038c\u038d\3\2\2\2\u038d"+
		"\u038e\3\2\2\2\u038e\u038f\5\u00e0q\2\u038f\u0390\7C\2\2\u0390\u0392\3"+
		"\2\2\2\u0391\u0384\3\2\2\2\u0391\u038a\3\2\2\2\u0392\u0083\3\2\2\2\u0393"+
		"\u0394\7b\2\2\u0394\u0395\7\32\2\2\u0395\u0396\5^\60\2\u0396\u0397\7>"+
		"\2\2\u0397\u0398\7\t\2\2\u0398\u0399\7\33\2\2\u0399\u039a\7C\2\2\u039a"+
		"\u0085\3\2\2\2\u039b\u039c\7C\2\2\u039c\u0087\3\2\2\2\u039d\u039e\5\u00ce"+
		"h\2\u039e\u039f\7C\2\2\u039f\u0089\3\2\2\2\u03a0\u03a7\5\u008eH\2\u03a1"+
		"\u03a7\5\u0094K\2\u03a2\u03a7\5\u0090I\2\u03a3\u03a7\7c\2\2\u03a4\u03a7"+
		"\7d\2\2\u03a5\u03a7\7e\2\2\u03a6\u03a0\3\2\2\2\u03a6\u03a1\3\2\2\2\u03a6"+
		"\u03a2\3\2\2\2\u03a6\u03a3\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6\u03a5\3\2"+
		"\2\2\u03a7\u008b\3\2\2\2\u03a8\u03aa\5\u008aF\2\u03a9\u03a8\3\2\2\2\u03aa"+
		"\u03ab\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ac\u03ae\3\2"+
		"\2\2\u03ad\u03af\5\u00ceh\2\u03ae\u03ad\3\2\2\2\u03ae\u03af\3\2\2\2\u03af"+
		"\u008d\3\2\2\2\u03b0\u03b1\t\r\2\2\u03b1\u008f\3\2\2\2\u03b2\u03b3\t\16"+
		"\2\2\u03b3\u0091\3\2\2\2\u03b4\u03b5\7G\2\2\u03b5\u0093\3\2\2\2\u03b6"+
		"\u03b9\5\u0096L\2\u03b7\u03b9\5\u00aaV\2\u03b8\u03b6\3\2\2\2\u03b8\u03b7"+
		"\3\2\2\2\u03b9\u0095\3\2\2\2\u03ba\u03be\5\u00a0Q\2\u03bb\u03be\5\u00a6"+
		"T\2\u03bc\u03be\5\u00f2z\2\u03bd\u03ba\3\2\2\2\u03bd\u03bb\3\2\2\2\u03bd"+
		"\u03bc\3\2\2\2\u03be\u0097\3\2\2\2\u03bf\u03c1\5\u0094K\2\u03c0\u03bf"+
		"\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3"+
		"\u03c5\3\2\2\2\u03c4\u03c6\5\u00ceh\2\u03c5\u03c4\3\2\2\2\u03c5\u03c6"+
		"\3\2\2\2\u03c6\u0099\3\2\2\2\u03c7\u03c9\5\u0096L\2\u03c8\u03c7\3\2\2"+
		"\2\u03c9\u03ca\3\2\2\2\u03ca\u03c8\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cd"+
		"\3\2\2\2\u03cc\u03ce\5\u00ceh\2\u03cd\u03cc\3\2\2\2\u03cd\u03ce\3\2\2"+
		"\2\u03ce\u009b\3\2\2\2\u03cf\u03d0\t\17\2\2\u03d0\u009d\3\2\2\2\u03d1"+
		"\u03d2\t\20\2\2\u03d2\u009f\3\2\2\2\u03d3\u03d5\5\f\7\2\u03d4\u03d3\3"+
		"\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u0405\5\u00a2R\2"+
		"\u03d7\u0405\5\u009eP\2\u03d8\u03da\5\u009eP\2\u03d9\u03d8\3\2\2\2\u03d9"+
		"\u03da\3\2\2\2\u03da\u03dc\3\2\2\2\u03db\u03dd\5\u009cO\2\u03dc\u03db"+
		"\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03dc\3\2\2\2\u03de\u03df\3\2\2\2\u03df"+
		"\u0405\3\2\2\2\u03e0\u03e2\5\u009eP\2\u03e1\u03e0\3\2\2\2\u03e1\u03e2"+
		"\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u0405\7q\2\2\u03e4\u03e6\5\u009eP\2"+
		"\u03e5\u03e4\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u0405"+
		"\7r\2\2\u03e8\u03ea\5\u009eP\2\u03e9\u03e8\3\2\2\2\u03e9\u03ea\3\2\2\2"+
		"\u03ea\u03eb\3\2\2\2\u03eb\u0405\7s\2\2\u03ec\u03ee\5\u009eP\2\u03ed\u03ec"+
		"\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u0405\7t\2\2\u03f0"+
		"\u0405\7\25\2\2\u03f1\u0405\7\f\2\2\u03f2\u03f4\5\u009eP\2\u03f3\u03f2"+
		"\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f8\3\2\2\2\u03f5\u03f7\5\u009cO"+
		"\2\u03f6\u03f5\3\2\2\2\u03f7\u03fa\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f8\u03f9"+
		"\3\2\2\2\u03f9\u03fb\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fb\u0405\7\26\2\2"+
		"\u03fc\u0405\7\22\2\2\u03fd\u03ff\5\u009cO\2\u03fe\u03fd\3\2\2\2\u03fe"+
		"\u03ff\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0405\7u\2\2\u0401\u0405\7\30"+
		"\2\2\u0402\u0405\7v\2\2\u0403\u0405\5\u00a4S\2\u0404\u03d4\3\2\2\2\u0404"+
		"\u03d7\3\2\2\2\u0404\u03d9\3\2\2\2\u0404\u03e1\3\2\2\2\u0404\u03e5\3\2"+
		"\2\2\u0404\u03e9\3\2\2\2\u0404\u03ed\3\2\2\2\u0404\u03f0\3\2\2\2\u0404"+
		"\u03f1\3\2\2\2\u0404\u03f3\3\2\2\2\u0404\u03fc\3\2\2\2\u0404\u03fe\3\2"+
		"\2\2\u0404\u0401\3\2\2\2\u0404\u0402\3\2\2\2\u0404\u0403\3\2\2\2\u0405"+
		"\u00a1\3\2\2\2\u0406\u0409\5\u00a8U\2\u0407\u0409\5\u0092J\2\u0408\u0406"+
		"\3\2\2\2\u0408\u0407\3\2\2\2\u0409\u00a3\3\2\2\2\u040a\u040b\7w\2\2\u040b"+
		"\u040e\7\32\2\2\u040c\u040f\5\\/\2\u040d\u040f\7v\2\2\u040e\u040c\3\2"+
		"\2\2\u040e\u040d\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0411\7\33\2\2\u0411"+
		"\u00a5\3\2\2\2\u0412\u0414\7x\2\2\u0413\u0415\5\f\7\2\u0414\u0413\3\2"+
		"\2\2\u0414\u0415\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0417\7G\2\2\u0417"+
		"\u00a7\3\2\2\2\u0418\u0419\7G\2\2\u0419\u00a9\3\2\2\2\u041a\u041b\5\u00ac"+
		"W\2\u041b\u0420\7\36\2\2\u041c\u041e\5\u00b4[\2\u041d\u041f\7>\2\2\u041e"+
		"\u041d\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0421\3\2\2\2\u0420\u041c\3\2"+
		"\2\2\u0420\u0421\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0423\7\37\2\2\u0423"+
		"\u00ab\3\2\2\2\u0424\u0426\5\u00b0Y\2\u0425\u0427\5\u00ceh\2\u0426\u0425"+
		"\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u042c\3\2\2\2\u0428\u042a\5\f\7\2\u0429"+
		"\u0428\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042d\7G"+
		"\2\2\u042c\u0429\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u042f\3\2\2\2\u042e"+
		"\u0430\5\u00b2Z\2\u042f\u042e\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u00ad"+
		"\3\2\2\2\u0431\u0433\5\u00b0Y\2\u0432\u0434\5\u00ceh\2\u0433\u0432\3\2"+
		"\2\2\u0433\u0434\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0437\7G\2\2\u0436"+
		"\u0438\5\u00b2Z\2\u0437\u0436\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u0439"+
		"\3\2\2\2\u0439\u043a\7C\2\2\u043a\u00af\3\2\2\2\u043b\u043d\7x\2\2\u043c"+
		"\u043e\t\21\2\2\u043d\u043c\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u00b1\3"+
		"\2\2\2\u043f\u0440\7B\2\2\u0440\u0441\5\u0098M\2\u0441\u00b3\3\2\2\2\u0442"+
		"\u0447\5\u00b6\\\2\u0443\u0444\7>\2\2\u0444\u0446\5\u00b6\\\2\u0445\u0443"+
		"\3\2\2\2\u0446\u0449\3\2\2\2\u0447\u0445\3\2\2\2\u0447\u0448\3\2\2\2\u0448"+
		"\u00b5\3\2\2\2\u0449\u0447\3\2\2\2\u044a\u044d\5\u00b8]\2\u044b\u044c"+
		"\7)\2\2\u044c\u044e\5^\60\2\u044d\u044b\3\2\2\2\u044d\u044e\3\2\2\2\u044e"+
		"\u00b7\3\2\2\2\u044f\u0450\7G\2\2\u0450\u00b9\3\2\2\2\u0451\u0454\5\u00bc"+
		"_\2\u0452\u0454\5\u00c0a\2\u0453\u0451\3\2\2\2\u0453\u0452\3\2\2\2\u0454"+
		"\u00bb\3\2\2\2\u0455\u0456\7G\2\2\u0456\u00bd\3\2\2\2\u0457\u0459\7j\2"+
		"\2\u0458\u0457\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045d"+
		"\7{\2\2\u045b\u045e\7G\2\2\u045c\u045e\5\u00bc_\2\u045d\u045b\3\2\2\2"+
		"\u045d\u045c\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0461"+
		"\7\36\2\2\u0460\u0462\5z>\2\u0461\u0460\3\2\2\2\u0461\u0462\3\2\2\2\u0462"+
		"\u0463\3\2\2\2\u0463\u0464\7\37\2\2\u0464\u00bf\3\2\2\2\u0465\u0466\7"+
		"G\2\2\u0466\u00c1\3\2\2\2\u0467\u0468\7{\2\2\u0468\u0469\7G\2\2\u0469"+
		"\u046a\7)\2\2\u046a\u046b\5\u00c4c\2\u046b\u046c\7C\2\2\u046c\u00c3\3"+
		"\2\2\2\u046d\u046f\5\f\7\2\u046e\u046d\3\2\2\2\u046e\u046f\3\2\2\2\u046f"+
		"\u0470\3\2\2\2\u0470\u0471\5\u00ba^\2\u0471\u00c5\3\2\2\2\u0472\u0478"+
		"\7a\2\2\u0473\u0475\7|\2\2\u0474\u0473\3\2\2\2\u0474\u0475\3\2\2\2\u0475"+
		"\u0476\3\2\2\2\u0476\u0479\5\f\7\2\u0477\u0479\7M\2\2\u0478\u0474\3\2"+
		"\2\2\u0478\u0477\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047b\5\b\5\2\u047b"+
		"\u047c\7C\2\2\u047c\u00c7\3\2\2\2\u047d\u047f\5\u00ceh\2\u047e\u047d\3"+
		"\2\2\2\u047e\u047f\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u0481\7a\2\2\u0481"+
		"\u0483\7{\2\2\u0482\u0484\5\f\7\2\u0483\u0482\3\2\2\2\u0483\u0484\3\2"+
		"\2\2\u0484\u0485\3\2\2\2\u0485\u0486\5\u00ba^\2\u0486\u0487\7C\2\2\u0487"+
		"\u00c9\3\2\2\2\u0488\u0489\7}\2\2\u0489\u048a\7\32\2\2\u048a\u048b\7\t"+
		"\2\2\u048b\u048c\7\33\2\2\u048c\u048d\7C\2\2\u048d\u00cb\3\2\2\2\u048e"+
		"\u048f\7i\2\2\u048f\u0496\7\t\2\2\u0490\u0492\7\36\2\2\u0491\u0493\5z"+
		">\2\u0492\u0491\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0494\3\2\2\2\u0494"+
		"\u0497\7\37\2\2\u0495\u0497\5|?\2\u0496\u0490\3\2\2\2\u0496\u0495\3\2"+
		"\2\2\u0497\u00cd\3\2\2\2\u0498\u049a\5\u00d0i\2\u0499\u0498\3\2\2\2\u049a"+
		"\u049b\3\2\2\2\u049b\u0499\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u00cf\3\2"+
		"\2\2\u049d\u049e\7\34\2\2\u049e\u04a0\7\34\2\2\u049f\u04a1\5\u00d4k\2"+
		"\u04a0\u049f\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a3"+
		"\7\35\2\2\u04a3\u04a6\7\35\2\2\u04a4\u04a6\5\u00d2j\2\u04a5\u049d\3\2"+
		"\2\2\u04a5\u04a4\3\2\2\2\u04a6\u00d1\3\2\2\2\u04a7\u04a8\7~\2\2\u04a8"+
		"\u04ab\7\32\2\2\u04a9\u04ac\5\u00f8}\2\u04aa\u04ac\5^\60\2\u04ab\u04a9"+
		"\3\2\2\2\u04ab\u04aa\3\2\2\2\u04ac\u04ae\3\2\2\2\u04ad\u04af\7F\2\2\u04ae"+
		"\u04ad\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b1\7\33"+
		"\2\2\u04b1\u00d3\3\2\2\2\u04b2\u04b7\5\u00d6l\2\u04b3\u04b4\7>\2\2\u04b4"+
		"\u04b6\5\u00d6l\2\u04b5\u04b3\3\2\2\2\u04b6\u04b9\3\2\2\2\u04b7\u04b5"+
		"\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04bb\3\2\2\2\u04b9\u04b7\3\2\2\2\u04ba"+
		"\u04bc\7F\2\2\u04bb\u04ba\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u00d5\3\2"+
		"\2\2\u04bd\u04be\5\u00d8m\2\u04be\u04bf\7M\2\2\u04bf\u04c1\3\2\2\2\u04c0"+
		"\u04bd\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c4\7G"+
		"\2\2\u04c3\u04c5\5\u00dan\2\u04c4\u04c3\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5"+
		"\u00d7\3\2\2\2\u04c6\u04c7\7G\2\2\u04c7\u00d9\3\2\2\2\u04c8\u04ca\7\32"+
		"\2\2\u04c9\u04cb\5\u00dco\2\u04ca\u04c9\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb"+
		"\u04cc\3\2\2\2\u04cc\u04cd\7\33\2\2\u04cd\u00db\3\2\2\2\u04ce\u04d0\5"+
		"\u00dep\2\u04cf\u04ce\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04cf\3\2\2\2"+
		"\u04d1\u04d2\3\2\2\2\u04d2\u00dd\3\2\2\2\u04d3\u04d4\7\32\2\2\u04d4\u04d5"+
		"\5\u00dco\2\u04d5\u04d6\7\33\2\2\u04d6\u04e5\3\2\2\2\u04d7\u04d8\7\34"+
		"\2\2\u04d8\u04d9\5\u00dco\2\u04d9\u04da\7\35\2\2\u04da\u04e5\3\2\2\2\u04db"+
		"\u04dc\7\36\2\2\u04dc\u04dd\5\u00dco\2\u04dd\u04de\7\37\2\2\u04de\u04e5"+
		"\3\2\2\2\u04df\u04e1\n\22\2\2\u04e0\u04df\3\2\2\2\u04e1\u04e2\3\2\2\2"+
		"\u04e2\u04e0\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e5\3\2\2\2\u04e4\u04d3"+
		"\3\2\2\2\u04e4\u04d7\3\2\2\2\u04e4\u04db\3\2\2\2\u04e4\u04e0\3\2\2\2\u04e5"+
		"\u00df\3\2\2\2\u04e6\u04eb\5\u00e2r\2\u04e7\u04e8\7>\2\2\u04e8\u04ea\5"+
		"\u00e2r\2\u04e9\u04e7\3\2\2\2\u04ea\u04ed\3\2\2\2\u04eb\u04e9\3\2\2\2"+
		"\u04eb\u04ec\3\2\2\2\u04ec\u00e1\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ee\u04f0"+
		"\5\u00e4s\2\u04ef\u04f1\5\u010e\u0088\2\u04f0\u04ef\3\2\2\2\u04f0\u04f1"+
		"\3\2\2\2\u04f1\u00e3\3\2\2\2\u04f2\u04f8\5\u00e6t\2\u04f3\u04f4\5\u00e8"+
		"u\2\u04f4\u04f5\5\u00eav\2\u04f5\u04f6\5\u00ecw\2\u04f6\u04f8\3\2\2\2"+
		"\u04f7\u04f2\3\2\2\2\u04f7\u04f3\3\2\2\2\u04f8\u00e5\3\2\2\2\u04f9\u04fb"+
		"\5\u00eex\2\u04fa\u04fc\7\177\2\2\u04fb\u04fa\3\2\2\2\u04fb\u04fc\3\2"+
		"\2\2\u04fc\u04fe\3\2\2\2\u04fd\u04f9\3\2\2\2\u04fe\u0501\3\2\2\2\u04ff"+
		"\u04fd\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0502\3\2\2\2\u0501\u04ff\3\2"+
		"\2\2\u0502\u0503\5\u00e8u\2\u0503\u00e7\3\2\2\2\u0504\u0505\bu\1\2\u0505"+
		"\u0507\5\u00f6|\2\u0506\u0508\5\u00ceh\2\u0507\u0506\3\2\2\2\u0507\u0508"+
		"\3\2\2\2\u0508\u050e\3\2\2\2\u0509\u050a\7\32\2\2\u050a\u050b\5\u00e6"+
		"t\2\u050b\u050c\7\33\2\2\u050c\u050e\3\2\2\2\u050d\u0504\3\2\2\2\u050d"+
		"\u0509\3\2\2\2\u050e\u051d\3\2\2\2\u050f\u0519\f\4\2\2\u0510\u051a\5\u00ea"+
		"v\2\u0511\u0513\7\34\2\2\u0512\u0514\5^\60\2\u0513\u0512\3\2\2\2\u0513"+
		"\u0514\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0517\7\35\2\2\u0516\u0518\5"+
		"\u00ceh\2\u0517\u0516\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u051a\3\2\2\2"+
		"\u0519\u0510\3\2\2\2\u0519\u0511\3\2\2\2\u051a\u051c\3\2\2\2\u051b\u050f"+
		"\3\2\2\2\u051c\u051f\3\2\2\2\u051d\u051b\3\2\2\2\u051d\u051e\3\2\2\2\u051e"+
		"\u00e9\3\2\2\2\u051f\u051d\3\2\2\2\u0520\u0522\7\32\2\2\u0521\u0523\5"+
		"\u0104\u0083\2\u0522\u0521\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0524\3\2"+
		"\2\2\u0524\u0526\7\33\2\2\u0525\u0527\5\u00f0y\2\u0526\u0525\3\2\2\2\u0526"+
		"\u0527\3\2\2\2\u0527\u0529\3\2\2\2\u0528\u052a\5\u00f4{\2\u0529\u0528"+
		"\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u052c\3\2\2\2\u052b\u052d\5\u00ceh"+
		"\2\u052c\u052b\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u00eb\3\2\2\2\u052e\u052f"+
		"\7@\2\2\u052f\u0531\5\u009aN\2\u0530\u0532\5\u00fa~\2\u0531\u0530\3\2"+
		"\2\2\u0531\u0532\3\2\2\2\u0532\u00ed\3\2\2\2\u0533\u0535\t\23\2\2\u0534"+
		"\u0536\5\u00ceh\2\u0535\u0534\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0542"+
		"\3\2\2\2\u0537\u0539\5\f\7\2\u0538\u0537\3\2\2\2\u0538\u0539\3\2\2\2\u0539"+
		"\u053a\3\2\2\2\u053a\u053c\7\"\2\2\u053b\u053d\5\u00ceh\2\u053c\u053b"+
		"\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u053f\3\2\2\2\u053e\u0540\5\u00f0y"+
		"\2\u053f\u053e\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0542\3\2\2\2\u0541\u0533"+
		"\3\2\2\2\u0541\u0538\3\2\2\2\u0542\u00ef\3\2\2\2\u0543\u0545\5\u00f2z"+
		"\2\u0544\u0543\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0544\3\2\2\2\u0546\u0547"+
		"\3\2\2\2\u0547\u00f1\3\2\2\2\u0548\u0549\t\24\2\2\u0549\u00f3\3\2\2\2"+
		"\u054a\u054b\t\23\2\2\u054b\u00f5\3\2\2\2\u054c\u054e\7F\2\2\u054d\u054c"+
		"\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0550\5\6\4\2\u0550"+
		"\u00f7\3\2\2\2\u0551\u0553\5\u0098M\2\u0552\u0554\5\u00fa~\2\u0553\u0552"+
		"\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u00f9\3\2\2\2\u0555\u055e\5\u00fc\177"+
		"\2\u0556\u0558\5\u00fe\u0080\2\u0557\u0556\3\2\2\2\u0557\u0558\3\2\2\2"+
		"\u0558\u0559\3\2\2\2\u0559\u055a\5\u00eav\2\u055a\u055b\5\u00ecw\2\u055b"+
		"\u055e\3\2\2\2\u055c\u055e\5\u0100\u0081\2\u055d\u0555\3\2\2\2\u055d\u0557"+
		"\3\2\2\2\u055d\u055c\3\2\2\2\u055e\u00fb\3\2\2\2\u055f\u0569\5\u00fe\u0080"+
		"\2\u0560\u0562\5\u00eex\2\u0561\u0560\3\2\2\2\u0562\u0563\3\2\2\2\u0563"+
		"\u0561\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0566\3\2\2\2\u0565\u0567\5\u00fe"+
		"\u0080\2\u0566\u0565\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0569\3\2\2\2\u0568"+
		"\u055f\3\2\2\2\u0568\u0561\3\2\2\2\u0569\u00fd\3\2\2\2\u056a\u056b\b\u0080"+
		"\1\2\u056b\u0579\5\u00eav\2\u056c\u056e\7\34\2\2\u056d\u056f\5^\60\2\u056e"+
		"\u056d\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0572\7\35"+
		"\2\2\u0571\u0573\5\u00ceh\2\u0572\u0571\3\2\2\2\u0572\u0573\3\2\2\2\u0573"+
		"\u0579\3\2\2\2\u0574\u0575\7\32\2\2\u0575\u0576\5\u00fc\177\2\u0576\u0577"+
		"\7\33\2\2\u0577\u0579\3\2\2\2\u0578\u056a\3\2\2\2\u0578\u056c\3\2\2\2"+
		"\u0578\u0574\3\2\2\2\u0579\u0589\3\2\2\2\u057a\u0585\f\6\2\2\u057b\u0586"+
		"\5\u00eav\2\u057c\u057d\5\u00fe\u0080\2\u057d\u057f\7\34\2\2\u057e\u0580"+
		"\5^\60\2\u057f\u057e\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0581\3\2\2\2\u0581"+
		"\u0583\7\35\2\2\u0582\u0584\5\u00ceh\2\u0583\u0582\3\2\2\2\u0583\u0584"+
		"\3\2\2\2\u0584\u0586\3\2\2\2\u0585\u057b\3\2\2\2\u0585\u057c\3\2\2\2\u0586"+
		"\u0588\3\2\2\2\u0587\u057a\3\2\2\2\u0588\u058b\3\2\2\2\u0589\u0587\3\2"+
		"\2\2\u0589\u058a\3\2\2\2\u058a\u00ff\3\2\2\2\u058b\u0589\3\2\2\2\u058c"+
		"\u058e\5\u00eex\2\u058d\u058c\3\2\2\2\u058e\u0591\3\2\2\2\u058f\u058d"+
		"\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u0592\3\2\2\2\u0591\u058f\3\2\2\2\u0592"+
		"\u0593\5\u0102\u0082\2\u0593\u0101\3\2\2\2\u0594\u0595\b\u0082\1\2\u0595"+
		"\u0596\7F\2\2\u0596\u05a5\3\2\2\2\u0597\u05a1\f\4\2\2\u0598\u05a2\5\u00ea"+
		"v\2\u0599\u059b\7\34\2\2\u059a\u059c\5^\60\2\u059b\u059a\3\2\2\2\u059b"+
		"\u059c\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u059f\7\35\2\2\u059e\u05a0\5"+
		"\u00ceh\2\u059f\u059e\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a2\3\2\2\2"+
		"\u05a1\u0598\3\2\2\2\u05a1\u0599\3\2\2\2\u05a2\u05a4\3\2\2\2\u05a3\u0597"+
		"\3\2\2\2\u05a4\u05a7\3\2\2\2\u05a5\u05a3\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6"+
		"\u0103\3\2\2\2\u05a7\u05a5\3\2\2\2\u05a8\u05ad\5\u0106\u0084\2\u05a9\u05ab"+
		"\7>\2\2\u05aa\u05a9\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac"+
		"\u05ae\7F\2\2\u05ad\u05aa\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u0105\3\2"+
		"\2\2\u05af\u05b4\5\u0108\u0085\2\u05b0\u05b1\7>\2\2\u05b1\u05b3\5\u0108"+
		"\u0085\2\u05b2\u05b0\3\2\2\2\u05b3\u05b6\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b4"+
		"\u05b5\3\2\2\2\u05b5\u0107\3\2\2\2\u05b6\u05b4\3\2\2\2\u05b7\u05b9\5\u00ce"+
		"h\2\u05b8\u05b7\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba"+
		"\u05bf\5\u008cG\2\u05bb\u05c0\5\u00e4s\2\u05bc\u05be\5\u00fa~\2\u05bd"+
		"\u05bc\3\2\2\2\u05bd\u05be\3\2\2\2\u05be\u05c0\3\2\2\2\u05bf\u05bb\3\2"+
		"\2\2\u05bf\u05bd\3\2\2\2\u05c0\u05c3\3\2\2\2\u05c1\u05c2\7)\2\2\u05c2"+
		"\u05c4\5\u0112\u008a\2\u05c3\u05c1\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u0109"+
		"\3\2\2\2\u05c5\u05c7\5\u00ceh\2\u05c6\u05c5\3\2\2\2\u05c6\u05c7\3\2\2"+
		"\2\u05c7\u05c9\3\2\2\2\u05c8\u05ca\5\u008cG\2\u05c9\u05c8\3\2\2\2\u05c9"+
		"\u05ca\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cc\5\u00e4s\2\u05cc\u05cd"+
		"\5\u010c\u0087\2\u05cd\u010b\3\2\2\2\u05ce\u05d3\5f\64\2\u05cf\u05d0\7"+
		")\2\2\u05d0\u05d1\t\25\2\2\u05d1\u05d3\7C\2\2\u05d2\u05ce\3\2\2\2\u05d2"+
		"\u05cf\3\2\2\2\u05d3\u010d\3\2\2\2\u05d4\u05da\5\u0110\u0089\2\u05d5\u05d6"+
		"\7\32\2\2\u05d6\u05d7\5$\23\2\u05d7\u05d8\7\33\2\2\u05d8\u05da\3\2\2\2"+
		"\u05d9\u05d4\3\2\2\2\u05d9\u05d5\3\2\2\2\u05da\u010f\3\2\2\2\u05db\u05dc"+
		"\7)\2\2\u05dc\u05df\5\u0112\u008a\2\u05dd\u05df\5\u0116\u008c\2\u05de"+
		"\u05db\3\2\2\2\u05de\u05dd\3\2\2\2\u05df\u0111\3\2\2\2\u05e0\u05e4\5X"+
		"-\2\u05e1\u05e4\5\u0116\u008c\2\u05e2\u05e4\5\u0122\u0092\2\u05e3\u05e0"+
		"\3\2\2\2\u05e3\u05e1\3\2\2\2\u05e3\u05e2\3\2\2\2\u05e4\u0113\3\2\2\2\u05e5"+
		"\u05e7\5\u0112\u008a\2\u05e6\u05e8\7F\2\2\u05e7\u05e6\3\2\2\2\u05e7\u05e8"+
		"\3\2\2\2\u05e8\u05f0\3\2\2\2\u05e9\u05ea\7>\2\2\u05ea\u05ec\5\u0112\u008a"+
		"\2\u05eb\u05ed\7F\2\2\u05ec\u05eb\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05ef"+
		"\3\2\2\2\u05ee\u05e9\3\2\2\2\u05ef\u05f2\3\2\2\2\u05f0\u05ee\3\2\2\2\u05f0"+
		"\u05f1\3\2\2\2\u05f1\u0115\3\2\2\2\u05f2\u05f0\3\2\2\2\u05f3\u05f8\7\36"+
		"\2\2\u05f4\u05f6\5\u0114\u008b\2\u05f5\u05f7\7>\2\2\u05f6\u05f5\3\2\2"+
		"\2\u05f6\u05f7\3\2\2\2\u05f7\u05f9\3\2\2\2\u05f8\u05f4\3\2\2\2\u05f8\u05f9"+
		"\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u05fb\7\37\2\2\u05fb\u0117\3\2\2\2"+
		"\u05fc\u05fd\7G\2\2\u05fd\u0119\3\2\2\2\u05fe\u05ff\7\u0081\2\2\u05ff"+
		"\u0600\5\u011e\u0090\2\u0600\u011b\3\2\2\2\u0601\u0605\7\u0081\2\2\u0602"+
		"\u0603\7\t\2\2\u0603\u0606\7G\2\2\u0604\u0606\7\u0082\2\2\u0605\u0602"+
		"\3\2\2\2\u0605\u0604\3\2\2\2\u0606\u011d\3\2\2\2\u0607\u061e\3\2\2\2\u0608"+
		"\u061e\7 \2\2\u0609\u061e\7!\2\2\u060a\u061e\7#\2\2\u060b\u061e\7$\2\2"+
		"\u060c\u061e\7&\2\2\u060d\u061e\7X\2\2\u060e\u061e\7(\2\2\u060f\u061e"+
		"\7)\2\2\u0610\u061e\7+\2\2\u0611\u061e\7*\2\2\u0612\u061e\79\2\2\u0613"+
		"\u061e\7\66\2\2\u0614\u061e\7\67\2\2\u0615\u061e\78\2\2\u0616\u061e\7"+
		":\2\2\u0617\u061e\7;\2\2\u0618\u061e\7>\2\2\u0619\u061a\7\32\2\2\u061a"+
		"\u061e\7\33\2\2\u061b\u061c\7\34\2\2\u061c\u061e\7\35\2\2\u061d\u0607"+
		"\3\2\2\2\u061d\u0608\3\2\2\2\u061d\u0609\3\2\2\2\u061d\u060a\3\2\2\2\u061d"+
		"\u060b\3\2\2\2\u061d\u060c\3\2\2\2\u061d\u060d\3\2\2\2\u061d\u060e\3\2"+
		"\2\2\u061d\u060f\3\2\2\2\u061d\u0610\3\2\2\2\u061d\u0611\3\2\2\2\u061d"+
		"\u0612\3\2\2\2\u061d\u0613\3\2\2\2\u061d\u0614\3\2\2\2\u061d\u0615\3\2"+
		"\2\2\u061d\u0616\3\2\2\2\u061d\u0617\3\2\2\2\u061d\u0618\3\2\2\2\u061d"+
		"\u0619\3\2\2\2\u061d\u061b\3\2\2\2\u061e\u011f\3\2\2\2\u061f\u0620\t\26"+
		"\2\2\u0620\u0121\3\2\2\2\u0621\u0622\7\3\2\2\u0622\u0627\5\u0124\u0093"+
		"\2\u0623\u0624\7\4\2\2\u0624\u0626\5\u0124\u0093\2\u0625\u0623\3\2\2\2"+
		"\u0626\u0629\3\2\2\2\u0627\u0625\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u062a"+
		"\3\2\2\2\u0629\u0627\3\2\2\2\u062a\u062b\7\5\2\2\u062b\u062e\3\2\2\2\u062c"+
		"\u062e\5\u012e\u0098\2\u062d\u0621\3\2\2\2\u062d\u062c\3\2\2\2\u062e\u0123"+
		"\3\2\2\2\u062f\u0634\5\u0120\u0091\2\u0630\u0631\7\6\2\2\u0631\u0633\5"+
		"\u0120\u0091\2\u0632\u0630\3\2\2\2\u0633\u0636\3\2\2\2\u0634\u0632\3\2"+
		"\2\2\u0634\u0635\3\2\2\2\u0635\u0125\3\2\2\2\u0636\u0634\3\2\2\2\u0637"+
		"\u0639\5\u0128\u0095\2\u0638\u063a\5\u012a\u0096\2\u0639\u0638\3\2\2\2"+
		"\u0639\u063a\3\2\2\2\u063a\u0127\3\2\2\2\u063b\u063c\7\34\2\2\u063c\u0641"+
		"\5\u012c\u0097\2\u063d\u063e\7>\2\2\u063e\u0640\5\u012c\u0097\2\u063f"+
		"\u063d\3\2\2\2\u0640\u0643\3\2\2\2\u0641\u063f\3\2\2\2\u0641\u0642\3\2"+
		"\2\2\u0642\u0644\3\2\2\2\u0643\u0641\3\2\2\2\u0644\u0645\7\35\2\2\u0645"+
		"\u0648\3\2\2\2\u0646\u0648\7G\2\2\u0647\u063b\3\2\2\2\u0647\u0646\3\2"+
		"\2\2\u0648\u0129\3\2\2\2\u0649\u064a\7\34\2\2\u064a\u064f\5V,\2\u064b"+
		"\u064c\7>\2\2\u064c\u064e\5V,\2\u064d\u064b\3\2\2\2\u064e\u0651\3\2\2"+
		"\2\u064f\u064d\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u0652\3\2\2\2\u0651\u064f"+
		"\3\2\2\2\u0652\u0653\7\35\2\2\u0653\u012b\3\2\2\2\u0654\u0659\7G\2\2\u0655"+
		"\u0656\t\27\2\2\u0656\u0658\7G\2\2\u0657\u0655\3\2\2\2\u0658\u065b\3\2"+
		"\2\2\u0659\u0657\3\2\2\2\u0659\u065a\3\2\2\2\u065a\u0666\3\2\2\2\u065b"+
		"\u0659\3\2\2\2\u065c\u065d\7B\2\2\u065d\u0660\7G\2\2\u065e\u065f\7>\2"+
		"\2\u065f\u0661\7G\2\2\u0660\u065e\3\2\2\2\u0661\u0662\3\2\2\2\u0662\u0660"+
		"\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u0665\3\2\2\2\u0664\u065c\3\2\2\2\u0665"+
		"\u0668\3\2\2\2\u0666\u0664\3\2\2\2\u0666\u0667\3\2\2\2\u0667\u012d\3\2"+
		"\2\2\u0668\u0666\3\2\2\2\u0669\u066a\7\34\2\2\u066a\u066d\7G\2\2\u066b"+
		"\u066c\7\6\2\2\u066c\u066e\7G\2\2\u066d\u066b\3\2\2\2\u066e\u066f\3\2"+
		"\2\2\u066f\u066d\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u0671\3\2\2\2\u0671"+
		"\u0672\7\7\2\2\u0672\u0673\5\u0126\u0094\2\u0673\u0674\7\35\2\2\u0674"+
		"\u012f\3\2\2\2\u0675\u0676\7G\2\2\u0676\u0677\7A\2\2\u0677\u0678\5\u012a"+
		"\u0096\2\u0678\u0131\3\2\2\2\u00e5\u0133\u013a\u0143\u0147\u014e\u0157"+
		"\u0160\u0165\u016b\u0173\u0175\u017e\u0182\u0186\u0189\u018d\u0190\u0197"+
		"\u019b\u019e\u01a1\u01a8\u01ac\u01ba\u01be\u01c4\u01cb\u01d1\u01d5\u01d9"+
		"\u01db\u01e3\u01e8\u01ee\u01f5\u0201\u020b\u0210\u0214\u021b\u021e\u0226"+
		"\u022a\u022d\u0234\u023b\u023f\u0244\u0248\u024b\u0250\u025f\u0266\u026e"+
		"\u0276\u027f\u0286\u028d\u0295\u029d\u02a5\u02ad\u02b5\u02bd\u02c6\u02cd"+
		"\u02d6\u02de\u02e5\u02e7\u02ea\u02f0\u02f6\u02fc\u0303\u030c\u0314\u0318"+
		"\u031f\u0321\u0335\u0339\u033f\u0344\u0348\u034b\u0352\u0359\u035d\u0366"+
		"\u036e\u0378\u037d\u0384\u0387\u038c\u0391\u03a6\u03ab\u03ae\u03b8\u03bd"+
		"\u03c2\u03c5\u03ca\u03cd\u03d4\u03d9\u03de\u03e1\u03e5\u03e9\u03ed\u03f3"+
		"\u03f8\u03fe\u0404\u0408\u040e\u0414\u041e\u0420\u0426\u0429\u042c\u042f"+
		"\u0433\u0437\u043d\u0447\u044d\u0453\u0458\u045d\u0461\u046e\u0474\u0478"+
		"\u047e\u0483\u0492\u0496\u049b\u04a0\u04a5\u04ab\u04ae\u04b7\u04bb\u04c0"+
		"\u04c4\u04ca\u04d1\u04e2\u04e4\u04eb\u04f0\u04f7\u04fb\u04ff\u0507\u050d"+
		"\u0513\u0517\u0519\u051d\u0522\u0526\u0529\u052c\u0531\u0535\u0538\u053c"+
		"\u053f\u0541\u0546\u054d\u0553\u0557\u055d\u0563\u0566\u0568\u056e\u0572"+
		"\u0578\u057f\u0583\u0585\u0589\u058f\u059b\u059f\u05a1\u05a5\u05aa\u05ad"+
		"\u05b4\u05b8\u05bd\u05bf\u05c3\u05c6\u05c9\u05d2\u05d9\u05de\u05e3\u05e7"+
		"\u05ec\u05f0\u05f6\u05f8\u0605\u061d\u0627\u062d\u0634\u0639\u0641\u0647"+
		"\u064f\u0659\u0662\u0666\u066f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}