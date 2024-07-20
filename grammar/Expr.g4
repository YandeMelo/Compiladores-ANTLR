grammar Expr;

program: com EOF;

com:  'Grafo' '{' e=grafoExpr ','? '}'                                                                                                      #Grafo
    | 'Conexão' '(' areaX=NUM 'x' areaY=NUM ')' '{' 'Cabo'? distanciaCabo=NUM? ','? e=conexaoExpr+ ',' d=conexaoDispositivo ','? '}'        #Conexao
    | 'Rede' '(' areaX=NUM 'x' areaY=NUM ')' '{' e=adicionarCasas+ ',' d=adicionarTorre ','? '}'                                            #Rede
    ;

// TORRE
adicionarCasas: 'Casa' numeroCasa=NUM x=NUM y=NUM                            #Casa
    |            e=adicionarCasas ',' e=adicionarCasas                       #GrupoCasas
    ;

adicionarTorre: 'Torre' nomeTorre=STRING alcance=NUM x=NUM y=NUM             #Torre
    |           e=adicionarTorre ',' e=adicionarTorre                        #GrupoTorre
    ;
////

// MODEM
conexaoExpr:  'Modem' nome=STRING x=NUM y=NUM                                #Modem
    |         'Switch' nome=STRING x=NUM y=NUM conectado=STRING              #Switch
    |         'Repetidor' nome=STRING x=NUM y=NUM conectado=STRING           #Repetidor
    |         e=conexaoExpr ',' e=conexaoExpr                                #GrupoConexao
    ;

conexaoDispositivo:  'Dispositivo' nome=STRING x=NUM y=NUM                   #Dispositivo
    |               d=conexaoDispositivo ',' d=conexaoDispositivo            #GrupoDispositivos
;
////

// GRAFO
grafoExpr: 'vertice' nome=STRING x=NUM y=NUM                                 #Vertice
    | 'aresta' nome=STRING verticeInicio=STRING verticeFinal=STRING          #Aresta
    |  e=grafoExpr ',' e=grafoExpr                                           #GrupoGrafo
    ;
////

STRING: [a-zA-Z]+[0-9]*;
NUM : [0-9]+ ;

SPACES: (' '|'\n'| '\r') -> skip ;