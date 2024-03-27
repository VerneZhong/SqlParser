package com.sql.parse;

import com.sql.parse.antlr.PlSqlLexer;
import com.sql.parse.antlr.PlSqlParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
/**
 * @author Mr.Zxb
 * @description
 * @date 2024/03/27 21:29
 */
public class PlSqlParserDemo {
    public static void main(String[] args) throws Exception {
        // 1. 从文件系统中读取PL/SQL文件
        String filePath = "/Users/verne.zhong/Downloads/sql/ZANDAKAKOUSHIN_SELECT001.sql";
        CharStream codeCharStream = CharStreams.fromFileName(filePath);

        // 2. 使用Lexer解析输入
        PlSqlLexer lexer = new PlSqlLexer(codeCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 3. 使用Parser解析tokens
        PlSqlParser parser = new PlSqlParser(tokens);
        ParseTree tree = parser.sql_script(); // 'sql_script'是PL/SQL语法的起始规则，根据你的实际情况可能需要调整

        // 4. （可选）使用Parse Tree Visitor或Listener来遍历解析树
        // 这里你可以实现自己的Visitor或Listener来处理解析树的具体节点，例如提取表结构信息

        // 示例：打印出解析树（用于调试）
        System.out.println(tree.toStringTree(parser)); // 将解析树以字符串形式打印出来
    }
}
