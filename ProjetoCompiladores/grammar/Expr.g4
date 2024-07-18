grammar Expr;

program: expr EOF;

expr: 'vertice' nome=STRING x=NUM y=NUM                                 #Vertice
    | 'aresta' nome=STRING verticeInicio=STRING verticeFinal=STRING     #Aresta
    | e=expr '+' d=expr                                                 #Grupo
    ;  

STRING: [a-zA-Z]+[0-9]*;
NUM : [0-9]+ ;

SPACES: (' '|'\n') -> skip ;