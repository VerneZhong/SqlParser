package com.sql.parse.seasar;

import com.sql.parse.seasar.gen.SeasarSQLBaseVisitor;
import com.sql.parse.seasar.gen.SeasarSQLLexer;
import com.sql.parse.seasar.gen.SeasarSQLParser;
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
        String sqlPath = "/Users/verne.zhong/IdeaProjects/SqlParser/src/main/resources/sql/AJAXNAME_RIYOCLSNAME.sql";
        String sql = FileUtil.readFileAsString(sqlPath);

        // 创建一个CharStream来读取SQL语句
        CharStream charStream = CharStreams.fromString(sql);

        // 创建词法分析器和语法分析器
        SeasarSQLLexer lexer = new SeasarSQLLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SeasarSQLParser parser = new SeasarSQLParser(tokens);

        // 解析SQL语句
        ParseTree tree = parser.query();

        // 使用自定义访问者
        CustomSeasarSQLVisitor visitor = new CustomSeasarSQLVisitor();
        visitor.visit(tree);
    }

    public static class CustomSeasarSQLVisitor extends SeasarSQLBaseVisitor<Void> {
        @Override
        public Void visitSelectClause(SeasarSQLParser.SelectClauseContext ctx) {
            // 当访问select子句时被调用
            System.out.println("Visiting select clause: " + ctx.getText());
            return visitChildren(ctx);
        }

        @Override
        public Void visitColumn(SeasarSQLParser.ColumnContext ctx) {
            // 当访问列名时被调用
            System.out.println("Visiting column: " + ctx.getText());
            return null; // 或者根据需要返回 visitChildren(ctx);
        }

        @Override
        public Void visitFunctionCall(SeasarSQLParser.FunctionCallContext ctx) {
            System.out.println("Visiting function call: " + ctx.getText());
            return visitChildren(ctx); // 继续访问子节点
        }
    }

}
