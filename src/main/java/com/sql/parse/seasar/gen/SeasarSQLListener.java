// Generated from /Users/verne.zhong/IdeaProjects/SqlParser/src/main/java/com/sql/parse/seasar/g4/SeasarSQL.g4 by ANTLR 4.13.1
package com.sql.parse.seasar.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SeasarSQLParser}.
 */
public interface SeasarSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SeasarSQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SeasarSQLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SeasarSQLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSQLParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(SeasarSQLParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSQLParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(SeasarSQLParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSQLParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(SeasarSQLParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSQLParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(SeasarSQLParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(SeasarSQLParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(SeasarSQLParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSQLParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterTableSource(SeasarSQLParser.TableSourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSQLParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitTableSource(SeasarSQLParser.TableSourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(SeasarSQLParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(SeasarSQLParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSQLParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinClause(SeasarSQLParser.JoinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSQLParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinClause(SeasarSQLParser.JoinClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSQLParser#conditionalJoin}.
	 * @param ctx the parse tree
	 */
	void enterConditionalJoin(SeasarSQLParser.ConditionalJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSQLParser#conditionalJoin}.
	 * @param ctx the parse tree
	 */
	void exitConditionalJoin(SeasarSQLParser.ConditionalJoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSQLParser#subQuery}.
	 * @param ctx the parse tree
	 */
	void enterSubQuery(SeasarSQLParser.SubQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSQLParser#subQuery}.
	 * @param ctx the parse tree
	 */
	void exitSubQuery(SeasarSQLParser.SubQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSQLParser#conditionalBlock}.
	 * @param ctx the parse tree
	 */
	void enterConditionalBlock(SeasarSQLParser.ConditionalBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSQLParser#conditionalBlock}.
	 * @param ctx the parse tree
	 */
	void exitConditionalBlock(SeasarSQLParser.ConditionalBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SeasarSQLParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SeasarSQLParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSQLParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectItem(SeasarSQLParser.SelectItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSQLParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectItem(SeasarSQLParser.SelectItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SeasarSQLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SeasarSQLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSQLParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(SeasarSQLParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSQLParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(SeasarSQLParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSQLParser#conditionalExpr}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpr(SeasarSQLParser.ConditionalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSQLParser#conditionalExpr}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpr(SeasarSQLParser.ConditionalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSQLParser#ifNotNullExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfNotNullExpr(SeasarSQLParser.IfNotNullExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSQLParser#ifNotNullExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfNotNullExpr(SeasarSQLParser.IfNotNullExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSQLParser#ifNullExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfNullExpr(SeasarSQLParser.IfNullExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSQLParser#ifNullExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfNullExpr(SeasarSQLParser.IfNullExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SeasarSQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SeasarSQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeasarSQLParser#nvlExpr}.
	 * @param ctx the parse tree
	 */
	void enterNvlExpr(SeasarSQLParser.NvlExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeasarSQLParser#nvlExpr}.
	 * @param ctx the parse tree
	 */
	void exitNvlExpr(SeasarSQLParser.NvlExprContext ctx);
}