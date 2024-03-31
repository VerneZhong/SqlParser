package com.sql.parse.seasar.oracle;

import com.sql.parse.seasar.oracle.gen.PlSqlLexer;
import com.sql.parse.seasar.oracle.gen.PlSqlParser;
import com.sql.parse.util.FileUtil;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * @author Mr.Zxb
 * @description
 * @date 2024/03/31 10:59
 */
public class PlSqlTest {
    public static void main(String[] args) {
        String sqlPath = "/Users/verne.zhong/IdeaProjects/SqlParser/src/main/resources/sql/AJAXNAME_TORIHIKISAKI_ALL.sql";
        String sql = FileUtil.readFileAsString(sqlPath);

        // 创建一个CharStream来读取SQL语句
        CharStream charStream = CharStreams.fromString(sql);

        // 创建词法分析器和语法分析器
        PlSqlLexer lexer = new PlSqlLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PlSqlParser parser = new PlSqlParser(tokens);

        // 解析SQL语句
        PlSqlParser.Sql_statementContext statementContext = parser.sql_statement();

        // 使用自定义访问者
        CustomPlSqlVisitor customPlSqlVisitor = new CustomPlSqlVisitor(tokens);
        customPlSqlVisitor.visit(statementContext);
    }
}
