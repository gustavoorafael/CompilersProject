grammar Calc2;
program : cmd+ EOF ;

cmd
    : input                        #InputCmd
    | print                        #PrintCmd
    | assign                       #AssignCmd
    ;

input   : 'input' '(' ID ')' ';' ;
print   : 'print' '(' expr ')' ';' ;
assign : ID ':=' expr ';' ;

expr : relExpr ;

relExpr
    : arithExpr relOp arithExpr   #RelationalExpr
    | arithExpr                   #SingleExpr
    ;
relOp : LT | GT | LE | GE | EQ | NE ;

arithExpr : term (ADD term | SUB term)* ;
term      : factor (MUL factor | DIV factor)* ;

factor
    : NUM                         #NumberFactor
    | ID                          #IdFactor
    | '(' expr ')'                #ParenFactor
    ;

//Tokens
ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;

LT  : '<' ;
GT  : '>' ;
LE  : '<=' ;
GE  : '>=' ;
EQ  : '==' ;
NE  : '!=' ;

ID  : [a-zA-Z_][a-zA-Z0-9_]* ;
NUM : [0-9]+('.'[0-9]+)? ;

WS  : [ \t\r\n]+ -> skip ;
