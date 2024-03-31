package com.sql.parse.seasar;

import com.sql.parse.seasar.gen.SeasarSqlBaseVisitor;
import com.sql.parse.seasar.gen.SeasarSqlLexer;
import com.sql.parse.seasar.gen.SeasarSqlParser;
import com.sql.parse.seasar.oracle.CustomPlSqlVisitor;
import com.sql.parse.seasar.oracle.gen.PlSqlLexer;
import com.sql.parse.seasar.oracle.gen.PlSqlParser;
import com.sql.parse.util.FileUtil;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author Mr.Zxb
 * @description
 * @date 2024/03/28 22:04
 */
public class SeasarSqlTest {
    public static void main(String[] args) {
        String sqlPath = "/Users/verne.zhong/IdeaProjects/SqlParser/src/main/resources/sql/AJAXNAME_TORIHIKISAKI_ALL.sql";
        String sql = FileUtil.readFileAsString(sqlPath);

        // 创建一个CharStream来读取SQL语句
        CharStream charStream = CharStreams.fromString(sql);

        // 创建词法分析器和语法分析器
//        CaseInsensitiveCharStream caseInsensitiveStream = new CaseInsensitiveCharStream(charStream);
//        SeasarSqlLexer lexer = new SeasarSqlLexer(charStream);
        PlSqlLexer lexer = new PlSqlLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        SeasarSqlParser parser = new SeasarSqlParser(tokens);
        PlSqlParser parser = new PlSqlParser(tokens);

        // 解析SQL语句
//        ParseTree tree = parser.query();
        PlSqlParser.Sql_statementContext statementContext = parser.sql_statement();

        // 使用自定义访问者
//        CustomSeasarSQLVisitor visitor = new CustomSeasarSQLVisitor();
        CustomPlSqlVisitor customPlSqlVisitor = new CustomPlSqlVisitor(tokens);
//        visitor.visit(statementContext);
        customPlSqlVisitor.visit(statementContext);

    }

    public static class CustomSeasarSQLVisitor extends SeasarSqlBaseVisitor<Void> {
        @Override
        public Void visitSelectClause(SeasarSqlParser.SelectClauseContext ctx) {
            // 当访问select子句时被调用
            System.out.println("Visiting select clause: " + ctx.getText());
            return visitChildren(ctx);
        }

        @Override
        public Void visitColumn(SeasarSqlParser.ColumnContext ctx) {
            // 当访问列名时被调用
            System.out.println("Visiting column: " + ctx.getText());
            return visitChildren(ctx); // 或者根据需要返回 visitChildren(ctx);
        }

        @Override
        public Void visitFunctionCall(SeasarSqlParser.FunctionCallContext ctx) {
            System.out.println("Visiting function call: " + ctx.getText());
            return visitChildren(ctx); // 继续访问子节点
        }

        @Override
        public Void visitWhereClause(SeasarSqlParser.WhereClauseContext ctx) {
            // 处理 WHERE 子句
            System.out.println("Visiting where call: " + ctx.getText());
            return visitChildren(ctx);
        }

        @Override
        public Void visitJoinClause(SeasarSqlParser.JoinClauseContext ctx) {
            // 处理 JOIN 子句
            // ...你的逻辑代码...
            System.out.println("Visiting join call: " + ctx.getText());
            return visitChildren(ctx);
        }

        @Override
        public Void visitFromClause(SeasarSqlParser.FromClauseContext ctx) {
            System.out.println("Visiting from call: " + ctx.getText());
            return visitChildren(ctx);
        }

        @Override
        public Void visitOrderByClause(SeasarSqlParser.OrderByClauseContext ctx) {
            System.out.println("Visiting order by clause: " + ctx.getText());
            return visitChildren(ctx);
        }

        @Override
        public Void visitGroupClause(SeasarSqlParser.GroupClauseContext ctx) {
            System.out.println("Visiting group by clause: " + ctx.getText());
            return visitChildren(ctx);
        }

        // 针对条件注释的处理
        @Override
        public Void visitConditionalStatement(SeasarSqlParser.ConditionalStatementContext ctx) {
            System.out.println("Visiting conditional statement: " + ctx.getText());
            return visitChildren(ctx);
        }

        // 处理子查询
        @Override
        public Void visitSubQuery(SeasarSqlParser.SubQueryContext ctx) {
            System.out.println("Visiting subquery: " + ctx.getText());
            return visitChildren(ctx);
        }

        // Assuming you have a placeholder rule and corresponding method
        @Override
        public Void visitPlaceholder(SeasarSqlParser.PlaceholderContext ctx) {
            System.out.println("Visiting placeholder: " + ctx.getText());
            return visitChildren(ctx);
        }

        // You might need to handle conditions specially if you want to include placeholders
        @Override
        public Void visitCondition(SeasarSqlParser.ConditionContext ctx) {
            System.out.println("Visiting condition: " + ctx.getText());
            // This should include logic to handle placeholders if they're not handled as normal IDENTIFIER tokens
            return visitChildren(ctx);
        }
    }
}
