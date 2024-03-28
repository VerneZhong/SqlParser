// Generated from /Users/verne.zhong/IdeaProjects/SqlParser/src/main/java/com/sql/parse/seasar/g4/SeasarSQL.g4 by ANTLR 4.13.1
package com.sql.parse.seasar.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SeasarSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SeasarSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SeasarSQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(SeasarSQLParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSQLParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(SeasarSQLParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSQLParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(SeasarSQLParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSQLParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(SeasarSQLParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSQLParser#tableSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSource(SeasarSQLParser.TableSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSQLParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(SeasarSQLParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSQLParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinClause(SeasarSQLParser.JoinClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSQLParser#conditionalJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalJoin(SeasarSQLParser.ConditionalJoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSQLParser#subQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubQuery(SeasarSQLParser.SubQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSQLParser#conditionalBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalBlock(SeasarSQLParser.ConditionalBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSQLParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(SeasarSQLParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSQLParser#selectItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectItem(SeasarSQLParser.SelectItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSQLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SeasarSQLParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSQLParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(SeasarSQLParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSQLParser#conditionalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpr(SeasarSQLParser.ConditionalExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSQLParser#ifNotNullExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNotNullExpr(SeasarSQLParser.IfNotNullExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSQLParser#ifNullExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNullExpr(SeasarSQLParser.IfNullExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SeasarSQLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeasarSQLParser#nvlExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNvlExpr(SeasarSQLParser.NvlExprContext ctx);
}