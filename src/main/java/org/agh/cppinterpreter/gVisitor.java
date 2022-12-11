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
	 * Visit a parse tree produced by {@link gParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(gParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(gParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(gParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(gParser.ArgumentExpressionListContext ctx);
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
	 * Visit a parse tree produced by {@link gParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(gParser.CastExpressionContext ctx);
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
	 * Visit a parse tree produced by {@link gParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(gParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers(gParser.DeclarationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers2(gParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifier(gParser.DeclarationSpecifierContext ctx);
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
	 * Visit a parse tree produced by {@link gParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(gParser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(gParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnionSpecifier(gParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#structOrUnion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnion(gParser.StructOrUnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#structDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarationList(gParser.StructDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(gParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifierQualifierList(gParser.SpecifierQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaratorList(gParser.StructDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#structDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarator(gParser.StructDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(gParser.EnumSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(gParser.EnumeratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(gParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#enumerationConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationConstant(gParser.EnumerationConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicTypeSpecifier(gParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(gParser.TypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignmentSpecifier(gParser.AlignmentSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(gParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator(gParser.DirectDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedParenthesesBlock(gParser.NestedParenthesesBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(gParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#typeQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifierList(gParser.TypeQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#parameterTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterTypeList(gParser.ParameterTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(gParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(gParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(gParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(gParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(gParser.TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(gParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(gParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#matrixInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixInitializerList(gParser.MatrixInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#designation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignation(gParser.DesignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#designatorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignatorList(gParser.DesignatorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(gParser.DesignatorContext ctx);
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
	 * Visit a parse tree produced by {@link gParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(gParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(gParser.BlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(gParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(gParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(gParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(gParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(gParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#forDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDeclaration(gParser.ForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression(gParser.ForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(gParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(gParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(gParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalDeclaration(gParser.ExternalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(gParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(gParser.DeclarationListContext ctx);
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