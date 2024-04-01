package com.sql.parse.seasar.oracle;

import com.sql.parse.seasar.mybatis.ColumnInfo;
import com.sql.parse.seasar.mybatis.TableInfo;
import com.sql.parse.seasar.oracle.gen.PlSqlParser;
import com.sql.parse.seasar.oracle.gen.PlSqlParserBaseVisitor;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Interval;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Mr.Zxb
 * @description
 * @date 2024/03/31 10:35
 */
public class CustomPlSqlVisitor extends PlSqlParserBaseVisitor<Void> {

    private int selectStatementDepth = 0;

    private Stack<String> tableNames = new Stack<>();

    CommonTokenStream tokens;

    public CustomPlSqlVisitor(CommonTokenStream tokens) {
        this.tokens = tokens;
    }

    @Override
    public Void visitSelect_statement(PlSqlParser.Select_statementContext ctx) {
        selectStatementDepth++; // 进入新的SELECT语句，深度加1
        if (selectStatementDepth == 1) {
            // 假设存在对应的方法来遍历列节点
            visitColumns(ctx);
        }
        visitChildren(ctx);
        selectStatementDepth--; // 离开当前SELECT语句，深度减1
        return null;
    }

    // 该方法应该根据你的ANTLR生成的解析器中具体的列节点上下文调整
    private void visitColumns(PlSqlParser.Select_statementContext ctx) {
        // 这里应该遍历列节点并提取列名，例如：
//        for (PlSqlParser.Column_nameContext columnCtx : ctx.column_name()) {
//            String columnName = columnCtx.getText();
//            System.out.println("Column name: " + columnName);
//            // 处理每个列名...
//        }
    }

    @Override
    public Void visitFrom_clause(PlSqlParser.From_clauseContext ctx) {
        // 直接提取表名可能需要根据你的SQL语法和ANTLR解析树的具体结构来定制逻辑
//        String tableName = ctx.table_name().getText(); // 假设存在表名上下文
//        System.out.println("Visiting from name: \n" + tableName);
//        tableNames.push(tableName);
        return visitChildren(ctx);
    }

    @Override
    public Void visitColumn_name(PlSqlParser.Column_nameContext ctx) {
        Interval interval = new Interval(ctx.start.getTokenIndex(), ctx.stop.getTokenIndex());
        String text = tokens.getText(interval);
        System.out.println("Visiting column name: \n" + text);
        return visitChildren(ctx);
    }

    @Override
    public Void visitWhere_clause(PlSqlParser.Where_clauseContext ctx) {
        Interval interval = new Interval(ctx.start.getTokenIndex(), ctx.stop.getTokenIndex());
        String text = tokens.getText(interval);
        System.out.println("Visiting WHERE clause: \n" + text);
        return visitChildren(ctx);
    }

}
