// Generated from /Users/verne.zhong/IdeaProjects/SqlParser/src/main/java/com/sql/parse/seasar/g4/SeasarSql.g4 by ANTLR 4.13.1

package com.sql.parse.seasar.gen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SeasarSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SeasarSqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(SeasarSqlParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(SeasarSqlParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#selectItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectItem(SeasarSqlParser.SelectItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(SeasarSqlParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(SeasarSqlParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#tableSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSource(SeasarSqlParser.TableSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(SeasarSqlParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinClause(SeasarSqlParser.JoinClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#conditionalJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalJoin(SeasarSqlParser.ConditionalJoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#seasarConditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeasarConditional(SeasarSqlParser.SeasarConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(SeasarSqlParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(SeasarSqlParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#orderItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderItemList(SeasarSqlParser.OrderItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#orderItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderItem(SeasarSqlParser.OrderItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#orderDirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderDirection(SeasarSqlParser.OrderDirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#seasarEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeasarEnd(SeasarSqlParser.SeasarEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#subQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubQuery(SeasarSqlParser.SubQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SeasarSqlParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#nvlCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNvlCall(SeasarSqlParser.NvlCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#nvlExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNvlExpr(SeasarSqlParser.NvlExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#placeholder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlaceholder(SeasarSqlParser.PlaceholderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(SeasarSqlParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(SeasarSqlParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#codeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(SeasarSqlParser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#anyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyStatement(SeasarSqlParser.AnyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(SeasarSqlParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#ifNotNullExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNotNullExpr(SeasarSqlParser.IfNotNullExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#ifNullExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNullExpr(SeasarSqlParser.IfNullExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SeasarSqlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#timestamp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp(SeasarSqlParser.TimestampContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(SeasarSqlParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(SeasarSqlParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSqlParser#conditionalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpr(SeasarSqlParser.ConditionalExprContext ctx);
}