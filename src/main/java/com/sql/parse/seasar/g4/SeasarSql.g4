grammar SeasarSql;

@header {
package com.sql.parse.seasar.gen;
}
// 解析器规则
query: selectClause fromClause whereClause? orderByClause?;

selectClause
        : SELECT selectItem (',' selectItem )*
        ;
selectItem: column | functionCall | conditionalExpr | stringLiteral | '(' selectItem ')' alias?;
column: IDENTIFIER ('.' IDENTIFIER)?;
fromClause: FROM tableSource (joinClause | conditionalJoin)*;
tableSource: '(' subQuery ')' alias | subQuery
        | IDENTIFIER
        ;
alias: IDENTIFIER;
joinClause: LEFT JOIN tableSource ON condition
        | INNER JOIN tableSource ON condition
        ;
conditionalJoin: seasarConditional joinClause seasarEnd;
seasarConditional: '/*IF' condition '*/';
whereClause: WHERE condition;
orderByClause: ORDER BY orderItemList;
orderItemList: orderItem (',' orderItem)*;
orderItem: column | expression | functionCall | stringLiteral orderDirection?;
orderDirection: ASC | DESC;
seasarEnd: '/*END*/';
subQuery: SELECT column FROM DUAL;
//condition: IDENTIFIER ('!=' | '==') NULL
//         | IDENTIFIER '=' NUMBER
//         | STRING BETWEEN IDENTIFIER AND IDENTIFIER
//         | IDENTIFIER '=' IDENTIFIER
//         | IDENTIFIER '==' NUMBER;
functionCall: functionName '(' (expression (',' expression)*)? ')';
//functionCall: functionName '(' (expression (',' expression)*)? ')'
//           | nvlCall
//           ;
nvlCall
    : NVL '(' expression ',' expression ')'
    ;
nvlExpr
    : NVL '(' expression ',' expression ')'
    ;
placeholder: SEASAR_PLACEHOLDER;
SEASAR_PLACEHOLDER: '/*' IDENTIFIER '*/';
conditionalStatement
        : '/*IF' condition '*/' selectItem '/*END*/'
        | IF_CONDITION codeBlock END_CONDITION
        ;
condition: expression; // 你需要定义如何匹配条件表达式
codeBlock
    : (anyStatement)+
    ;
anyStatement
    : selectItem
    // 添加更多的SQL语句或片段
    ;
functionName: IDENTIFIER;
//conditionalExpr: ifNotNullExpr | ifNullExpr;
ifNotNullExpr: column;
ifNullExpr: nvlExpr;
expression: nvlExpr
          | column
          | STRING
          | NUMBER
          | timestamp
          | functionCall
          | stringLiteral
          | '(' expression ')'
          | date
          ;
timestamp: TIMESTAMP '(' stringLiteral ')';
date: DATE '(' stringLiteral ')';
stringLiteral: STRING;
conditionalExpr
    : '/*IF' condition '*/' selectItem '/*END*/'
    | '/*IF' condition '*/' functionCall '/*END*/'
    ;




// 词法分析器规则
SELECT: [sS][eE][lL][eE][cC][tT];
FROM: [fF][rR][oO][mM];
LEFT: [lL][eE][fF][tT];
INNER: [iI][nN][nN][eE][rR];
JOIN: [jJ][oO][iI][nN];
ON: [oO][nN];
NVL: [nN][vV][lL];
DUAL: [dD][uU][aA][lL];
ORDER: [oO][rR][dD][eE][rR];
WHERE: [wW][hH][eE][rR][eE];
BY: [bB][yY];
BETWEEN: [bB][eE][tT][wW][eE][eE][nN];
AND: [aA][nN][dD];
NULL: [nN][uU][lL][lL];
ASC: [aA][sS][cC];
DESC: [dD][eE][sS][cC];
TIMESTAMP: [tT][iI][mM][eE][sS][tT][aA][mM][pP];
DATE: [dD][aA][tT][eE];
LT  : '<' ;
GT  : '>' ;
SEMI: ';';
NUMBER: [0-9]+;
STRING: '\'' (~('\'') | '\\' .)* '\'';
WS: [ \t\r\n]+ -> skip;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
//SEASAR_PLACEHOLDER: '/*' IDENTIFIER '*/' -> skip;
IF_CONDITION
    : '/*IF' .*? '*/' -> channel(HIDDEN)
    ;
END_CONDITION
    : '/*END*/' -> channel(HIDDEN)
    ;
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;
