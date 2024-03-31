package com.sql.parse.seasar.oracle.gen;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.ATN;

/**
 * @author Mr.Zxb
 * @description
 * @date 2024/03/30 18:48
 */
public class PlSqlLexerBase extends Lexer {
    public PlSqlLexerBase self;

    public PlSqlLexerBase(CharStream input) {
        super(input);
        self = this;
    }

    protected boolean IsNewlineAtPos(int pos) {
        int la = _input.LA(pos);
        return la == -1 || la == '\n';
    }

    @Override
    public String[] getRuleNames() {
        // 假设你的语法中有几个词法规则，这里只是示例
        // 实际上，这些名称应该与你的.g4文件中定义的词法规则名称一致
        return new String[] {"RULE_1", "RULE_2", "RULE_3"};
    }

    @Override
    public String getGrammarFileName() {
        // 返回你的.g4文件的名称
        return "PlSqlParser.g4";
    }

    @Override
    public ATN getATN() {
        // 这个方法的实现通常是自动生成的，并且比较复杂
        // 如果你手动创建Lexer，你可能需要通过ANTLR工具生成这部分代码
        // 对于自定义LexerBase类，你可能不需要提供这个方法的具体实现
        // 如果确实需要，可能需要查阅ANTLR的文档或寻求社区的帮助
        throw new UnsupportedOperationException("The method getATN() is not implemented.");
    }
}
