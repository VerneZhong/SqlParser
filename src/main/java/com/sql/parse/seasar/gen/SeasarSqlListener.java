// Generated from /Users/verne.zhong/IdeaProjects/SqlParser/src/main/java/com/sql/parse/seasar/g4/SeasarSql.g4 by ANTLR 4.13.1

package com.sql.parse.seasar.gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SeasarSqlParser}.
 */
public interface SeasarSqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SeasarSqlParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SeasarSqlParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(SeasarSqlParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(SeasarSqlParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectItem(SeasarSqlParser.SelectItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectItem(SeasarSqlParser.SelectItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(SeasarSqlParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(SeasarSqlParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(SeasarSqlParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(SeasarSqlParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterTableSource(SeasarSqlParser.TableSourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitTableSource(SeasarSqlParser.TableSourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(SeasarSqlParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(SeasarSqlParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinClause(SeasarSqlParser.JoinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinClause(SeasarSqlParser.JoinClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#conditionalJoin}.
	 * @param ctx the parse tree
	 */
	void enterConditionalJoin(SeasarSqlParser.ConditionalJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#conditionalJoin}.
	 * @param ctx the parse tree
	 */
	void exitConditionalJoin(SeasarSqlParser.ConditionalJoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#seasarConditional}.
	 * @param ctx the parse tree
	 */
	void enterSeasarConditional(SeasarSqlParser.SeasarConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#seasarConditional}.
	 * @param ctx the parse tree
	 */
	void exitSeasarConditional(SeasarSqlParser.SeasarConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(SeasarSqlParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(SeasarSqlParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(SeasarSqlParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(SeasarSqlParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#orderItemList}.
	 * @param ctx the parse tree
	 */
	void enterOrderItemList(SeasarSqlParser.OrderItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#orderItemList}.
	 * @param ctx the parse tree
	 */
	void exitOrderItemList(SeasarSqlParser.OrderItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#orderItem}.
	 * @param ctx the parse tree
	 */
	void enterOrderItem(SeasarSqlParser.OrderItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#orderItem}.
	 * @param ctx the parse tree
	 */
	void exitOrderItem(SeasarSqlParser.OrderItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#orderDirection}.
	 * @param ctx the parse tree
	 */
	void enterOrderDirection(SeasarSqlParser.OrderDirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#orderDirection}.
	 * @param ctx the parse tree
	 */
	void exitOrderDirection(SeasarSqlParser.OrderDirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#seasarEnd}.
	 * @param ctx the parse tree
	 */
	void enterSeasarEnd(SeasarSqlParser.SeasarEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#seasarEnd}.
	 * @param ctx the parse tree
	 */
	void exitSeasarEnd(SeasarSqlParser.SeasarEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#subQuery}.
	 * @param ctx the parse tree
	 */
	void enterSubQuery(SeasarSqlParser.SubQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#subQuery}.
	 * @param ctx the parse tree
	 */
	void exitSubQuery(SeasarSqlParser.SubQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SeasarSqlParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SeasarSqlParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#nvlCall}.
	 * @param ctx the parse tree
	 */
	void enterNvlCall(SeasarSqlParser.NvlCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#nvlCall}.
	 * @param ctx the parse tree
	 */
	void exitNvlCall(SeasarSqlParser.NvlCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#nvlExpr}.
	 * @param ctx the parse tree
	 */
	void enterNvlExpr(SeasarSqlParser.NvlExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#nvlExpr}.
	 * @param ctx the parse tree
	 */
	void exitNvlExpr(SeasarSqlParser.NvlExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#placeholder}.
	 * @param ctx the parse tree
	 */
	void enterPlaceholder(SeasarSqlParser.PlaceholderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#placeholder}.
	 * @param ctx the parse tree
	 */
	void exitPlaceholder(SeasarSqlParser.PlaceholderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(SeasarSqlParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(SeasarSqlParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SeasarSqlParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SeasarSqlParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(SeasarSqlParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(SeasarSqlParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#anyStatement}.
	 * @param ctx the parse tree
	 */
	void enterAnyStatement(SeasarSqlParser.AnyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#anyStatement}.
	 * @param ctx the parse tree
	 */
	void exitAnyStatement(SeasarSqlParser.AnyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(SeasarSqlParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(SeasarSqlParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#ifNotNullExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfNotNullExpr(SeasarSqlParser.IfNotNullExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#ifNotNullExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfNotNullExpr(SeasarSqlParser.IfNotNullExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#ifNullExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfNullExpr(SeasarSqlParser.IfNullExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#ifNullExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfNullExpr(SeasarSqlParser.IfNullExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SeasarSqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SeasarSqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#timestamp}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp(SeasarSqlParser.TimestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#timestamp}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp(SeasarSqlParser.TimestampContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(SeasarSqlParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(SeasarSqlParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(SeasarSqlParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(SeasarSqlParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSqlParser#conditionalExpr}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpr(SeasarSqlParser.ConditionalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSqlParser#conditionalExpr}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpr(SeasarSqlParser.ConditionalExprContext ctx);
}