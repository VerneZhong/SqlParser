grammar SeasarSql;

@header {
package com.sql.parse.seasar.gen;
}
// 解析器规则
query: selectClause fromClause whereClause? groupClause? orderByClause?;

selectClause
        : SELECT selectItem (',' selectItem )*
        ;
selectItem: column | functionCall | conditionalExpr | stringLiteral | '(' selectItem ')' alias?;
column: IDENTIFIER ('.' IDENTIFIER)?;
fromClause: FROM tableSource (joinClause | conditionalJoin)*;
tableSource: '(' subQuery ')' alias | subQuery
        | IDENTIFIER
        ;
alias
    : IDENTIFIER
    | AS? IDENTIFIER
    ;
joinClause: LEFT JOIN tableSource ON condition
        | INNER JOIN tableSource ON condition
        ;
conditionalJoin: seasarConditional | joinClause | seasarEnd;
seasarConditional: '/*IF' condition '*/';
whereClause: WHERE condition;
groupClause: GROUP BY groupItemList;
groupItemList: groupItem (',' groupItem)*;
groupItem: column | expression;
orderByClause: ORDER BY orderItemList;
orderItemList: orderItem (',' orderItem)*;
orderItem: column | expression | functionCall | stringLiteral orderDirection?;
orderDirection: ASC | DESC;
seasarEnd: '/*END*/';
subQuery: SELECT column FROM DUAL;
functionCall
    : functionName '(' (expression (',' expression)*)? ')'
    | functionName '(' expression ')' alias?
    | nvlCall
    | ifNotNullExpr
    | ifNullExpr
    ;

nvlCall
    : NVL '(' expression ',' expression ')'
    ;
nvlExpr
    : NVL '(' expression ',' expression ')'
    ;
condition
    : expression (EQ expression)?
    | expression BETWEEN expression AND expression
    | placeholder
    | conditionalStatement
    ;
conditionalStatement
        : '/*IF' condition '*/' selectItem '/*END*/'
        | IF_CONDITION codeBlock END_CONDITION
        | IF_CONDITION selectItem END_CONDITION
        ;
placeholder
    : '/*' IDENTIFIER '*/'
    ;
codeBlock
    : (anyStatement)+
    ;
anyStatement
    : selectItem
    ;
functionName: IDENTIFIER;
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
    | expression EQ expression
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
GROUP : [gG][rR][oO][uU][pP];
AS : [aA][sS];
LT  : '<' ;
GT  : '>' ;
EQ : '=';
SEMI: ';';
NUMBER: [0-9]+;
STRING: '\'' (~('\'') | '\\' .)* '\'';
WS: [ \t\r\n]+ -> skip;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
IF_CONDITION
    : '/*IF' .*? '*/' -> channel(HIDDEN)
    ;
END_CONDITION
    : '/*END*/' -> channel(HIDDEN)
    ;
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;
