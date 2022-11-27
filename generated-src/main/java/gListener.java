// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(gParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(gParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(gParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(gParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#idExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpression(gParser.IdExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#idExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpression(gParser.IdExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#unqualifiedId}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedId(gParser.UnqualifiedIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#unqualifiedId}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedId(gParser.UnqualifiedIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#qualifiedId}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedId(gParser.QualifiedIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#qualifiedId}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedId(gParser.QualifiedIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#nestedNameSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterNestedNameSpecifier(gParser.NestedNameSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#nestedNameSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitNestedNameSpecifier(gParser.NestedNameSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(gParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(gParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#lambdaIntroducer}.
	 * @param ctx the parse tree
	 */
	void enterLambdaIntroducer(gParser.LambdaIntroducerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#lambdaIntroducer}.
	 * @param ctx the parse tree
	 */
	void exitLambdaIntroducer(gParser.LambdaIntroducerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#lambdaCapture}.
	 * @param ctx the parse tree
	 */
	void enterLambdaCapture(gParser.LambdaCaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#lambdaCapture}.
	 * @param ctx the parse tree
	 */
	void exitLambdaCapture(gParser.LambdaCaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#captureDefault}.
	 * @param ctx the parse tree
	 */
	void enterCaptureDefault(gParser.CaptureDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#captureDefault}.
	 * @param ctx the parse tree
	 */
	void exitCaptureDefault(gParser.CaptureDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#captureList}.
	 * @param ctx the parse tree
	 */
	void enterCaptureList(gParser.CaptureListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#captureList}.
	 * @param ctx the parse tree
	 */
	void exitCaptureList(gParser.CaptureListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#capture}.
	 * @param ctx the parse tree
	 */
	void enterCapture(gParser.CaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#capture}.
	 * @param ctx the parse tree
	 */
	void exitCapture(gParser.CaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#simpleCapture}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCapture(gParser.SimpleCaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#simpleCapture}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCapture(gParser.SimpleCaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#initcapture}.
	 * @param ctx the parse tree
	 */
	void enterInitcapture(gParser.InitcaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#initcapture}.
	 * @param ctx the parse tree
	 */
	void exitInitcapture(gParser.InitcaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#lambdaDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterLambdaDeclarator(gParser.LambdaDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#lambdaDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitLambdaDeclarator(gParser.LambdaDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(gParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(gParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#typeIdOfTheTypeId}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdOfTheTypeId(gParser.TypeIdOfTheTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#typeIdOfTheTypeId}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdOfTheTypeId(gParser.TypeIdOfTheTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(gParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(gParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#pseudoDestructorName}.
	 * @param ctx the parse tree
	 */
	void enterPseudoDestructorName(gParser.PseudoDestructorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#pseudoDestructorName}.
	 * @param ctx the parse tree
	 */
	void exitPseudoDestructorName(gParser.PseudoDestructorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(gParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(gParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(gParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(gParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(gParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(gParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#newPlacement}.
	 * @param ctx the parse tree
	 */
	void enterNewPlacement(gParser.NewPlacementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#newPlacement}.
	 * @param ctx the parse tree
	 */
	void exitNewPlacement(gParser.NewPlacementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#newTypeId}.
	 * @param ctx the parse tree
	 */
	void enterNewTypeId(gParser.NewTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#newTypeId}.
	 * @param ctx the parse tree
	 */
	void exitNewTypeId(gParser.NewTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#newDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNewDeclarator(gParser.NewDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#newDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNewDeclarator(gParser.NewDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#noPointerNewDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoPointerNewDeclarator(gParser.NoPointerNewDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#noPointerNewDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoPointerNewDeclarator(gParser.NoPointerNewDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#newInitializer}.
	 * @param ctx the parse tree
	 */
	void enterNewInitializer(gParser.NewInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#newInitializer}.
	 * @param ctx the parse tree
	 */
	void exitNewInitializer(gParser.NewInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#deleteExpression}.
	 * @param ctx the parse tree
	 */
	void enterDeleteExpression(gParser.DeleteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#deleteExpression}.
	 * @param ctx the parse tree
	 */
	void exitDeleteExpression(gParser.DeleteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#noExceptExpression}.
	 * @param ctx the parse tree
	 */
	void enterNoExceptExpression(gParser.NoExceptExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#noExceptExpression}.
	 * @param ctx the parse tree
	 */
	void exitNoExceptExpression(gParser.NoExceptExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(gParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(gParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#pointerMemberExpression}.
	 * @param ctx the parse tree
	 */
	void enterPointerMemberExpression(gParser.PointerMemberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#pointerMemberExpression}.
	 * @param ctx the parse tree
	 */
	void exitPointerMemberExpression(gParser.PointerMemberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(gParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(gParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(gParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(gParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(gParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(gParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void enterShiftOperator(gParser.ShiftOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void exitShiftOperator(gParser.ShiftOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(gParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(gParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(gParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(gParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(gParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(gParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(gParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(gParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(gParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(gParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(gParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(gParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(gParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(gParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(gParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(gParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(gParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(gParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(gParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(gParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(gParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(gParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(gParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(gParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(gParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(gParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(gParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(gParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(gParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(gParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(gParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(gParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#statementSeq}.
	 * @param ctx the parse tree
	 */
	void enterStatementSeq(gParser.StatementSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#statementSeq}.
	 * @param ctx the parse tree
	 */
	void exitStatementSeq(gParser.StatementSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(gParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(gParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(gParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(gParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(gParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(gParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#forInitStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInitStatement(gParser.ForInitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#forInitStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInitStatement(gParser.ForInitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#forRangeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForRangeDeclaration(gParser.ForRangeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#forRangeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForRangeDeclaration(gParser.ForRangeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#forRangeInitializer}.
	 * @param ctx the parse tree
	 */
	void enterForRangeInitializer(gParser.ForRangeInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#forRangeInitializer}.
	 * @param ctx the parse tree
	 */
	void exitForRangeInitializer(gParser.ForRangeInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(gParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(gParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(gParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(gParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationseq(gParser.DeclarationseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationseq(gParser.DeclarationseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(gParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(gParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#blockDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBlockDeclaration(gParser.BlockDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#blockDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBlockDeclaration(gParser.BlockDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#aliasDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAliasDeclaration(gParser.AliasDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#aliasDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAliasDeclaration(gParser.AliasDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#simpleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDeclaration(gParser.SimpleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#simpleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDeclaration(gParser.SimpleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(gParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(gParser.StaticAssertDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#emptyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEmptyDeclaration(gParser.EmptyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#emptyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEmptyDeclaration(gParser.EmptyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#attributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAttributeDeclaration(gParser.AttributeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#attributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAttributeDeclaration(gParser.AttributeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclSpecifier(gParser.DeclSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclSpecifier(gParser.DeclSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterDeclSpecifierSeq(gParser.DeclSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitDeclSpecifierSeq(gParser.DeclSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(gParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(gParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(gParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(gParser.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(gParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(gParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(gParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(gParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#trailingTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTrailingTypeSpecifier(gParser.TrailingTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#trailingTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTrailingTypeSpecifier(gParser.TrailingTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#typeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifierSeq(gParser.TypeSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#typeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifierSeq(gParser.TypeSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#trailingTypeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterTrailingTypeSpecifierSeq(gParser.TrailingTypeSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#trailingTypeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitTrailingTypeSpecifierSeq(gParser.TrailingTypeSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#simpleTypeLengthModifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeLengthModifier(gParser.SimpleTypeLengthModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#simpleTypeLengthModifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeLengthModifier(gParser.SimpleTypeLengthModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#simpleTypeSignednessModifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeSignednessModifier(gParser.SimpleTypeSignednessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#simpleTypeSignednessModifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeSignednessModifier(gParser.SimpleTypeSignednessModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#simpleTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeSpecifier(gParser.SimpleTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#simpleTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeSpecifier(gParser.SimpleTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#theTypeName}.
	 * @param ctx the parse tree
	 */
	void enterTheTypeName(gParser.TheTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#theTypeName}.
	 * @param ctx the parse tree
	 */
	void exitTheTypeName(gParser.TheTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#decltypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDecltypeSpecifier(gParser.DecltypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#decltypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDecltypeSpecifier(gParser.DecltypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#elaboratedTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterElaboratedTypeSpecifier(gParser.ElaboratedTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#elaboratedTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitElaboratedTypeSpecifier(gParser.ElaboratedTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#enumName}.
	 * @param ctx the parse tree
	 */
	void enterEnumName(gParser.EnumNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#enumName}.
	 * @param ctx the parse tree
	 */
	void exitEnumName(gParser.EnumNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(gParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(gParser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#enumHead}.
	 * @param ctx the parse tree
	 */
	void enterEnumHead(gParser.EnumHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#enumHead}.
	 * @param ctx the parse tree
	 */
	void exitEnumHead(gParser.EnumHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#opaqueEnumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOpaqueEnumDeclaration(gParser.OpaqueEnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#opaqueEnumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOpaqueEnumDeclaration(gParser.OpaqueEnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#enumkey}.
	 * @param ctx the parse tree
	 */
	void enterEnumkey(gParser.EnumkeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#enumkey}.
	 * @param ctx the parse tree
	 */
	void exitEnumkey(gParser.EnumkeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#enumbase}.
	 * @param ctx the parse tree
	 */
	void enterEnumbase(gParser.EnumbaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#enumbase}.
	 * @param ctx the parse tree
	 */
	void exitEnumbase(gParser.EnumbaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(gParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(gParser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#enumeratorDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorDefinition(gParser.EnumeratorDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#enumeratorDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorDefinition(gParser.EnumeratorDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(gParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(gParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#namespaceName}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceName(gParser.NamespaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#namespaceName}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceName(gParser.NamespaceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#originalNamespaceName}.
	 * @param ctx the parse tree
	 */
	void enterOriginalNamespaceName(gParser.OriginalNamespaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#originalNamespaceName}.
	 * @param ctx the parse tree
	 */
	void exitOriginalNamespaceName(gParser.OriginalNamespaceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#namespaceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceDefinition(gParser.NamespaceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#namespaceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceDefinition(gParser.NamespaceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#namespaceAlias}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceAlias(gParser.NamespaceAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#namespaceAlias}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceAlias(gParser.NamespaceAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#namespaceAliasDefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceAliasDefinition(gParser.NamespaceAliasDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#namespaceAliasDefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceAliasDefinition(gParser.NamespaceAliasDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifiednamespacespecifier(gParser.QualifiednamespacespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifiednamespacespecifier(gParser.QualifiednamespacespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#usingDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUsingDeclaration(gParser.UsingDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#usingDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUsingDeclaration(gParser.UsingDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#usingDirective}.
	 * @param ctx the parse tree
	 */
	void enterUsingDirective(gParser.UsingDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#usingDirective}.
	 * @param ctx the parse tree
	 */
	void exitUsingDirective(gParser.UsingDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#asmDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAsmDefinition(gParser.AsmDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#asmDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAsmDefinition(gParser.AsmDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#linkageSpecification}.
	 * @param ctx the parse tree
	 */
	void enterLinkageSpecification(gParser.LinkageSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#linkageSpecification}.
	 * @param ctx the parse tree
	 */
	void exitLinkageSpecification(gParser.LinkageSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#attributeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSpecifierSeq(gParser.AttributeSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#attributeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSpecifierSeq(gParser.AttributeSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#attributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSpecifier(gParser.AttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#attributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSpecifier(gParser.AttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#alignmentspecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentspecifier(gParser.AlignmentspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#alignmentspecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentspecifier(gParser.AlignmentspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#attributeList}.
	 * @param ctx the parse tree
	 */
	void enterAttributeList(gParser.AttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#attributeList}.
	 * @param ctx the parse tree
	 */
	void exitAttributeList(gParser.AttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(gParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(gParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#attributeNamespace}.
	 * @param ctx the parse tree
	 */
	void enterAttributeNamespace(gParser.AttributeNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#attributeNamespace}.
	 * @param ctx the parse tree
	 */
	void exitAttributeNamespace(gParser.AttributeNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#attributeArgumentClause}.
	 * @param ctx the parse tree
	 */
	void enterAttributeArgumentClause(gParser.AttributeArgumentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#attributeArgumentClause}.
	 * @param ctx the parse tree
	 */
	void exitAttributeArgumentClause(gParser.AttributeArgumentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#balancedTokenSeq}.
	 * @param ctx the parse tree
	 */
	void enterBalancedTokenSeq(gParser.BalancedTokenSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#balancedTokenSeq}.
	 * @param ctx the parse tree
	 */
	void exitBalancedTokenSeq(gParser.BalancedTokenSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#balancedtoken}.
	 * @param ctx the parse tree
	 */
	void enterBalancedtoken(gParser.BalancedtokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#balancedtoken}.
	 * @param ctx the parse tree
	 */
	void exitBalancedtoken(gParser.BalancedtokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(gParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(gParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(gParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(gParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(gParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(gParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#pointerDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPointerDeclarator(gParser.PointerDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#pointerDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPointerDeclarator(gParser.PointerDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#noPointerDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoPointerDeclarator(gParser.NoPointerDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#noPointerDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoPointerDeclarator(gParser.NoPointerDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#parametersAndQualifiers}.
	 * @param ctx the parse tree
	 */
	void enterParametersAndQualifiers(gParser.ParametersAndQualifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#parametersAndQualifiers}.
	 * @param ctx the parse tree
	 */
	void exitParametersAndQualifiers(gParser.ParametersAndQualifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#trailingReturnType}.
	 * @param ctx the parse tree
	 */
	void enterTrailingReturnType(gParser.TrailingReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#trailingReturnType}.
	 * @param ctx the parse tree
	 */
	void exitTrailingReturnType(gParser.TrailingReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#pointerOperator}.
	 * @param ctx the parse tree
	 */
	void enterPointerOperator(gParser.PointerOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#pointerOperator}.
	 * @param ctx the parse tree
	 */
	void exitPointerOperator(gParser.PointerOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	void enterCvqualifierseq(gParser.CvqualifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	void exitCvqualifierseq(gParser.CvqualifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#cvQualifier}.
	 * @param ctx the parse tree
	 */
	void enterCvQualifier(gParser.CvQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#cvQualifier}.
	 * @param ctx the parse tree
	 */
	void exitCvQualifier(gParser.CvQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#refqualifier}.
	 * @param ctx the parse tree
	 */
	void enterRefqualifier(gParser.RefqualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#refqualifier}.
	 * @param ctx the parse tree
	 */
	void exitRefqualifier(gParser.RefqualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declaratorid}.
	 * @param ctx the parse tree
	 */
	void enterDeclaratorid(gParser.DeclaratoridContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declaratorid}.
	 * @param ctx the parse tree
	 */
	void exitDeclaratorid(gParser.DeclaratoridContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#theTypeId}.
	 * @param ctx the parse tree
	 */
	void enterTheTypeId(gParser.TheTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#theTypeId}.
	 * @param ctx the parse tree
	 */
	void exitTheTypeId(gParser.TheTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(gParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(gParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#pointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPointerAbstractDeclarator(gParser.PointerAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#pointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPointerAbstractDeclarator(gParser.PointerAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#noPointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoPointerAbstractDeclarator(gParser.NoPointerAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#noPointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoPointerAbstractDeclarator(gParser.NoPointerAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#abstractPackDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractPackDeclarator(gParser.AbstractPackDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#abstractPackDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractPackDeclarator(gParser.AbstractPackDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#noPointerAbstractPackDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoPointerAbstractPackDeclarator(gParser.NoPointerAbstractPackDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#noPointerAbstractPackDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoPointerAbstractPackDeclarator(gParser.NoPointerAbstractPackDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#parameterDeclarationClause}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclarationClause(gParser.ParameterDeclarationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#parameterDeclarationClause}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclarationClause(gParser.ParameterDeclarationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclarationList(gParser.ParameterDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclarationList(gParser.ParameterDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(gParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(gParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(gParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(gParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(gParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(gParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(gParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(gParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#braceOrEqualInitializer}.
	 * @param ctx the parse tree
	 */
	void enterBraceOrEqualInitializer(gParser.BraceOrEqualInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#braceOrEqualInitializer}.
	 * @param ctx the parse tree
	 */
	void exitBraceOrEqualInitializer(gParser.BraceOrEqualInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#initializerClause}.
	 * @param ctx the parse tree
	 */
	void enterInitializerClause(gParser.InitializerClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#initializerClause}.
	 * @param ctx the parse tree
	 */
	void exitInitializerClause(gParser.InitializerClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(gParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(gParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#bracedInitList}.
	 * @param ctx the parse tree
	 */
	void enterBracedInitList(gParser.BracedInitListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#bracedInitList}.
	 * @param ctx the parse tree
	 */
	void exitBracedInitList(gParser.BracedInitListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void enterMeminitializerid(gParser.MeminitializeridContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void exitMeminitializerid(gParser.MeminitializeridContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#operatorFunctionId}.
	 * @param ctx the parse tree
	 */
	void enterOperatorFunctionId(gParser.OperatorFunctionIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#operatorFunctionId}.
	 * @param ctx the parse tree
	 */
	void exitOperatorFunctionId(gParser.OperatorFunctionIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#literalOperatorId}.
	 * @param ctx the parse tree
	 */
	void enterLiteralOperatorId(gParser.LiteralOperatorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#literalOperatorId}.
	 * @param ctx the parse tree
	 */
	void exitLiteralOperatorId(gParser.LiteralOperatorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#theOperator}.
	 * @param ctx the parse tree
	 */
	void enterTheOperator(gParser.TheOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#theOperator}.
	 * @param ctx the parse tree
	 */
	void exitTheOperator(gParser.TheOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(gParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(gParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#matrix}.
	 * @param ctx the parse tree
	 */
	void enterMatrix(gParser.MatrixContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#matrix}.
	 * @param ctx the parse tree
	 */
	void exitMatrix(gParser.MatrixContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(gParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(gParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#shortquery}.
	 * @param ctx the parse tree
	 */
	void enterShortquery(gParser.ShortqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#shortquery}.
	 * @param ctx the parse tree
	 */
	void exitShortquery(gParser.ShortqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#sqlbase}.
	 * @param ctx the parse tree
	 */
	void enterSqlbase(gParser.SqlbaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#sqlbase}.
	 * @param ctx the parse tree
	 */
	void exitSqlbase(gParser.SqlbaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#sqlwhere}.
	 * @param ctx the parse tree
	 */
	void enterSqlwhere(gParser.SqlwhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#sqlwhere}.
	 * @param ctx the parse tree
	 */
	void exitSqlwhere(gParser.SqlwhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#querydatajoin}.
	 * @param ctx the parse tree
	 */
	void enterQuerydatajoin(gParser.QuerydatajoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#querydatajoin}.
	 * @param ctx the parse tree
	 */
	void exitQuerydatajoin(gParser.QuerydatajoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(gParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(gParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#askingquery}.
	 * @param ctx the parse tree
	 */
	void enterAskingquery(gParser.AskingqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#askingquery}.
	 * @param ctx the parse tree
	 */
	void exitAskingquery(gParser.AskingqueryContext ctx);
}