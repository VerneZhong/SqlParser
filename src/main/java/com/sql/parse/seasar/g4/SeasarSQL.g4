grammar SeasarSQL;

// 解析器规则
query: selectClause fromClause;

selectClause: 'select' selectItem (',' selectItem)*;
column: IDENTIFIER ('.' IDENTIFIER)?;

fromClause: 'from' tableSource (joinClause | conditionalJoin)*;
tableSource: '(' subQuery ')' alias | subQuery; // 加入对子查询和别名的处理
alias: IDENTIFIER; // 定义别名规则

joinClause: 'left join' tableSource 'on' condition;

conditionalJoin: /*IF condition*/ joinClause /*END*/; // 示意性表示，需要根据实际情况调整

subQuery: 'select' column 'from' 'dual'; // 简化的子查询规则定义

conditionalBlock: /*IF condition*/ selectClause /*END*/; // 示意性表示，需要根据实际情况调整

condition: IDENTIFIER ('!=' | '==') 'null'
         | IDENTIFIER '=' NUMBER
         | STRING 'between' IDENTIFIER 'and' IDENTIFIER;

selectItem
    : column
    | functionCall
    | conditionalExpr
    | conditionalBlock
    ;

functionCall
    : functionName '(' (expression (',' expression)*)? ')'
    ;

functionName
    : IDENTIFIER
    ;

conditionalExpr
    : ifNotNullExpr
    | ifNullExpr
    ;

ifNotNullExpr
    : column // 当 kijunbi != null 时
    ;

ifNullExpr
    : nvlExpr // 当 kijunbi == null 时
    ;

// 假设已有基础的表达式规则
expression
    : nvlExpr
    | column
    | STRING
    | NUMBER
    // 其他表达式类型
    ;
nvlExpr
    : 'nvl' '(' expression ',' expression ')'
    ;

// 词法分析器规则
LT  : '<' ;
GT  : '>' ;
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER: [0-9]+;
STRING: '\'' (~('\'') | '\\' .)* '\'';
WS: [ \t\r\n]+ -> skip;
COMMENT
    : '/*' .*? '*/' -> skip
    ;
CONDITIONAL_COMMENT
    : '/*IF' .*? '*/'
    ;
