package com.sql.parse.seasar.oracle;

import com.sql.parse.seasar.mybatis.ColumnInfo;
import com.sql.parse.seasar.mybatis.MybatisGenerator;
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
            // 使用Interval来获取特定范围的tokens
            Interval interval = new Interval(ctx.start.getTokenIndex(), ctx.stop.getTokenIndex());
            String columnName = tokens.getText(interval);
            String tableName = getCurrentTableName();

            List<ColumnInfo> columnInfoList = new ArrayList<>();
            ColumnInfo columnInfo = new ColumnInfo();
            columnInfo.setName(columnName);
            columnInfo.setType("varchar");
            columnInfoList.add(columnInfo);

            TableInfo tableInfo = new TableInfo();
            tableInfo.setColumns(columnInfoList);
            tableInfo.setName(tableName);
//            MybatisGenerator.generator(tableInfo);
            System.out.println("Visiting SELECT statement: \n" + columnName);
        }

        visitChildren(ctx);
        selectStatementDepth--; // 离开当前SELECT语句，深度减1
        return null;
    }

    @Override
    public Void visitFrom_clause(PlSqlParser.From_clauseContext ctx) {
        try {
            Interval interval = new Interval(ctx.start.getTokenIndex(), ctx.stop.getTokenIndex());
            String tableName = tokens.getText(interval);
            System.out.println("Visiting from name: \n" + tableName);
            // 将当前表名推入栈
            tableNames.push(tableName);
            return visitChildren(ctx);
        } finally {
            // 确保在离开方法时清理表名状态
            if (!tableNames.isEmpty()) {
                tableNames.pop();
            }
        }
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

    public String getCurrentTableName() {
        return tableNames.isEmpty() ? null : tableNames.peek();
    }
}
