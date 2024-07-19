grammar Expr;

program: com EOF;

com: 'Grafo' '{' e=expr '}'                                            #Grafo
    ;  

expr: 'vertice' nome=STRING x=NUM y=NUM                                 #Vertice
    | 'aresta' nome=STRING verticeInicio=STRING verticeFinal=STRING     #Aresta
    |  e=expr ',' e=expr                                                #Grupo
    ;

STRING: [a-zA-Z]+[0-9]*;
NUM : [0-9]+ ;

SPACES: (' '|'\n'| '\r') -> skip ;