package com.sql.parse.seasar;

import com.sql.parse.seasar.gen.SeasarSqlBaseVisitor;
import com.sql.parse.seasar.gen.SeasarSqlLexer;
import com.sql.parse.seasar.gen.SeasarSqlParser;
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
        CaseInsensitiveCharStream caseInsensitiveStream = new CaseInsensitiveCharStream(charStream);
        SeasarSqlLexer lexer = new SeasarSqlLexer(caseInsensitiveStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SeasarSqlParser parser = new SeasarSqlParser(tokens);

        // 解析SQL语句
        ParseTree tree = parser.query();

        // 使用自定义访问者
        CustomSeasarSQLVisitor visitor = new CustomSeasarSQLVisitor();
        visitor.visit(tree);
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
            return null; // 或者根据需要返回 visitChildren(ctx);
        }

        @Override
        public Void visitFunctionCall(SeasarSqlParser.FunctionCallContext ctx) {
            System.out.println("Visiting function call: " + ctx.getText());
            return visitChildren(ctx); // 继续访问子节点
        }

        @Override
        public Void visitCondition(SeasarSqlParser.ConditionContext ctx) {
            System.out.println("Visiting condition: " + ctx.getText());
            return super.visitCondition(ctx);
        }

        @Override
        public Void visitSeasarConditional(SeasarSqlParser.SeasarConditionalContext ctx) {
            System.out.println("Visiting Seasar condition: " + ctx.getText());
            return super.visitSeasarConditional(ctx);
        }
    }

}
