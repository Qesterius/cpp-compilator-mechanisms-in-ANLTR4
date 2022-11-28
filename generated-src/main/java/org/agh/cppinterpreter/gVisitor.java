// Generated from g.g4 by ANTLR 4.9.3
package org.agh.cppinterpreter;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(gParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(gParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#idExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpression(gParser.IdExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#unqualifiedId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnqualifiedId(gParser.UnqualifiedIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#qualifiedId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedId(gParser.QualifiedIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#nestedNameSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedNameSpecifier(gParser.NestedNameSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(gParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#lambdaIntroducer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaIntroducer(gParser.LambdaIntroducerContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#lambdaCapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaCapture(gParser.LambdaCaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#captureDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaptureDefault(gParser.CaptureDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#captureList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaptureList(gParser.CaptureListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture(gParser.CaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#simpleCapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCapture(gParser.SimpleCaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#initcapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitcapture(gParser.InitcaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#lambdaDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaDeclarator(gParser.LambdaDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(gParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#typeIdOfTheTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdOfTheTypeId(gParser.TypeIdOfTheTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(gParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#pseudoDestructorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoDestructorName(gParser.PseudoDestructorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(gParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(gParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#newExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(gParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#newPlacement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewPlacement(gParser.NewPlacementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#newTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewTypeId(gParser.NewTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#newDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewDeclarator(gParser.NewDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#noPointerNewDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPointerNewDeclarator(gParser.NoPointerNewDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#newInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewInitializer(gParser.NewInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#deleteExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteExpression(gParser.DeleteExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#noExceptExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoExceptExpression(gParser.NoExceptExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(gParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#pointerMemberExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerMemberExpression(gParser.PointerMemberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(gParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(gParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(gParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#shiftOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftOperator(gParser.ShiftOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(gParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(gParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(gParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(gParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(gParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(gParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(gParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(gParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(gParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(gParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(gParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(gParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(gParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(gParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(gParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(gParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#statementSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSeq(gParser.StatementSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(gParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(gParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(gParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#forInitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitStatement(gParser.ForInitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#forRangeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForRangeDeclaration(gParser.ForRangeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#forRangeInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForRangeInitializer(gParser.ForRangeInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(gParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(gParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declarationseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationseq(gParser.DeclarationseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(gParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#blockDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockDeclaration(gParser.BlockDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#aliasDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasDeclaration(gParser.AliasDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#simpleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDeclaration(gParser.SimpleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticAssertDeclaration(gParser.StaticAssertDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#emptyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyDeclaration(gParser.EmptyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#attributeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeDeclaration(gParser.AttributeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclSpecifier(gParser.DeclSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclSpecifierSeq(gParser.DeclSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(gParser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpecifier(gParser.FunctionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(gParser.TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(gParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#trailingTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingTypeSpecifier(gParser.TrailingTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#typeSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifierSeq(gParser.TypeSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#trailingTypeSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingTypeSpecifierSeq(gParser.TrailingTypeSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#simpleTypeLengthModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeLengthModifier(gParser.SimpleTypeLengthModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#simpleTypeSignednessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeSignednessModifier(gParser.SimpleTypeSignednessModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#simpleTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeSpecifier(gParser.SimpleTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#theTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheTypeName(gParser.TheTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#decltypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecltypeSpecifier(gParser.DecltypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#elaboratedTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElaboratedTypeSpecifier(gParser.ElaboratedTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#enumName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumName(gParser.EnumNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(gParser.EnumSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#enumHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumHead(gParser.EnumHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#opaqueEnumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpaqueEnumDeclaration(gParser.OpaqueEnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#enumkey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumkey(gParser.EnumkeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#enumbase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumbase(gParser.EnumbaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(gParser.EnumeratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#enumeratorDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorDefinition(gParser.EnumeratorDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(gParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#namespaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceName(gParser.NamespaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#originalNamespaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOriginalNamespaceName(gParser.OriginalNamespaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#namespaceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceDefinition(gParser.NamespaceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#namespaceAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceAlias(gParser.NamespaceAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#namespaceAliasDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceAliasDefinition(gParser.NamespaceAliasDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiednamespacespecifier(gParser.QualifiednamespacespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#usingDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingDeclaration(gParser.UsingDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#usingDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingDirective(gParser.UsingDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#asmDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsmDefinition(gParser.AsmDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#linkageSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkageSpecification(gParser.LinkageSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#attributeSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSpecifierSeq(gParser.AttributeSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#attributeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSpecifier(gParser.AttributeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#alignmentspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignmentspecifier(gParser.AlignmentspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#attributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeList(gParser.AttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(gParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#attributeNamespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeNamespace(gParser.AttributeNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#attributeArgumentClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeArgumentClause(gParser.AttributeArgumentClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#balancedTokenSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalancedTokenSeq(gParser.BalancedTokenSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#balancedtoken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalancedtoken(gParser.BalancedtokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(gParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(gParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(gParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#pointerDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerDeclarator(gParser.PointerDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#noPointerDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPointerDeclarator(gParser.NoPointerDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#parametersAndQualifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersAndQualifiers(gParser.ParametersAndQualifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#trailingReturnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingReturnType(gParser.TrailingReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#pointerOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerOperator(gParser.PointerOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#cvqualifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCvqualifierseq(gParser.CvqualifierseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#cvQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCvQualifier(gParser.CvQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#refqualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefqualifier(gParser.RefqualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declaratorid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaratorid(gParser.DeclaratoridContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#theTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheTypeId(gParser.TheTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclarator(gParser.AbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#pointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerAbstractDeclarator(gParser.PointerAbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#noPointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPointerAbstractDeclarator(gParser.NoPointerAbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#abstractPackDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractPackDeclarator(gParser.AbstractPackDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#noPointerAbstractPackDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPointerAbstractPackDeclarator(gParser.NoPointerAbstractPackDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#parameterDeclarationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarationClause(gParser.ParameterDeclarationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarationList(gParser.ParameterDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(gParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(gParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(gParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(gParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#braceOrEqualInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraceOrEqualInitializer(gParser.BraceOrEqualInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#initializerClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerClause(gParser.InitializerClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(gParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#bracedInitList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedInitList(gParser.BracedInitListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#meminitializerid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeminitializerid(gParser.MeminitializeridContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#operatorFunctionId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorFunctionId(gParser.OperatorFunctionIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#literalOperatorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralOperatorId(gParser.LiteralOperatorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#theOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheOperator(gParser.TheOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(gParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#matrix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrix(gParser.MatrixContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(gParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#shortquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortquery(gParser.ShortqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#sqlbase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlbase(gParser.SqlbaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#sqlwhere}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlwhere(gParser.SqlwhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#querydatajoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerydatajoin(gParser.QuerydatajoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(gParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#askingquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAskingquery(gParser.AskingqueryContext ctx);
}