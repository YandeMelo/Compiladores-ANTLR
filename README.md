# Projeto de Compiladores com ANTLR

Grupo: 
- Lucas Romero Emílio Corrêa
- Yan Monteiro de Melo

## Descrição
O projeto tem como objetivo auxiliar no mapeamento de conexões de dispositivos e na avaliação das melhores conexões, baseadas nos pontos de acesso disponíveis, comparando suas distâncias. Assim como, na descoberta e mapeamento de todas as possíveis conexões que uma Torre de Rede consegue ter dentro de uma área. Esse tema foi definido com o objetivo de auxiliar e aumentar a eficiência de empresas de rede e pontos de acesso, na hora de simular e projetar as conexões de determinado local. O projeto tem como base a geração de Grafos em uma interface, para que uma melhor vizualização seja possível.

O projeto conta com 3 possibilidades: 

1 - Gerar um Grafo para uma possível simulação de pontos de acesso e conexões (Sejam elas: Modem, Switch, Repetidor ou até Torres de Rede), possibilitando a vizualização do resultado.

2 - Criação de um modelo mapeado, para conexões dentro de um ambiente (Casa, por exemplo), que, de acordo com a área do ambiente e as localizações dos dispositivos e pontos de acesso, automaticamente são calculadas a escala (comparando a resolução da tela) e as distâncias entre cada conexão de dispositivo. Quando o cálculo é feito, o programa avalia e decide as melhores conexões possíveis para cada dispositivo. Também é possível definir um tamanho máximo de Cabo de Rede para que o cálculo seja ainda mais específico. Caso o tamanho máximo do Cabo não seja informado, o programa irá considerar um tamanho máximo de 100 metros. Com isso, é possível simular e vizualizar as melhores conexões e localizações para cada ponto de acesso e dispositivo, auxiliando na eficiência na hora de instalar cada ponto em determinado local.

3- Criação de um modelo mapeado em larga escala, agora, para as conexões que uma Torre de Rede consegue ter, dentro de uma determinada área, assim como, dependendo do seu alcance. Nesse modelo, serão fornecidas a área, as localizações das casas e locais que desejam uma conexão, também, o alcance e localização de cada Torre de Rede. Após os dados fornecidos, o sistema será responsável por gerar o modelo, informando todas as casas que cada Torre de Rede conseguirá alcançar e se conectar, tratando também, de uma margem de erro de 10%, devido a possíveis questões climáticas, de relevo e interferências.

Observação: Como o projeto conta com uma Interface Gráfica, não será possível executar pelo Codespace, precisará ser baixado na máquina.
## Instalação e Configuração

- Java JDK (versão recomendada: 21)
- ANTLR (versão recomendada: 4.9.2)

1. **Configuração do ANTLR:**

Certifique-se de ter o ANTLR instalado e instalar as extensões do Java e ANTLR na sua IDE. 
```bash
pip install antlr4-tools
```

2. **Compilação do arquivo `.g4`:**

Execute o seguinte comando para compilar o arquivo `.g4`:
```bash
java -jar lib/antlr.jar -o src grammar/Expr.g4
```
Isso compilará o arquivo de gramática `Expr.g4`, localizado no diretório `grammar`, e colocará os arquivos gerados no diretório `src`.

3. **Gerar Visitors e Listeners:**

Para gerar os visitors e os listeners a partir do arquivo `.g4`, use o seguinte comando:
```bash
java -jar lib/antlr.jar -o src -listener -visitor grammar/Expr.g4
```
Isso criará classes de visitor e listener necessárias para percorrer a árvore de parsing gerada pelo ANTLR.

## Como utilizar
O projeto conta com 3 funções na linguagem, 1 para cada possibilidade citada acima. Para executar o código, basta escolher o nome do arquivo .txt a ser executado na Main e, em seguida, executar a Main.

```java
String filename = "NomeDoArquivo.txt";
```

*1- Para a geração de Grafos:*                                                                                                                                                                                                                                                 
Observação: 
- Coordenadas baseadas na resolução da tela.
- Exemplos de modelos estão nos arquivos .txt: grafo1.txt, grafo2.txt, grafo3.txt
```bash
Grafo {
    vertice NomeDoVertice CoordenadaX CoordenadaY,
    vertice NomeDoVertice CoordenadaX CoordenadaY,
    aresta NomeDaAresta VerticeInicial VerticeFinal,
}
```
Resultado de exemplo:

![Grafo](https://cdn.discordapp.com/attachments/931984117652946988/1267188347034402897/image.png?ex=66a7e09d&is=66a68f1d&hm=0bf8c52bc0fdb0516bce2b38e853cde97af5a8fb0837e3359e1d32df4a89ee87&)

*2- Para o mapeamento de Conexões:*                                                                                                                                                                                                                                            
Observação: 
- Coordenadas baseadas dentro da área definida.
- Exemplos de modelos estão nos arquivos .txt: Conexão1.txt, Conexão2.txt, Conexão3.txt
```bash
Conexão (ÁreaX x ÁreaY){
    Cabo TamanhoMáximo,
    Modem NomeDoModem CoordenadaX CoordenadaY,
    Switch NomeDoSwitch CoordenadaX CoordenadaY NomeDoModemASerConectado,
    Repetidor repetidor CoordenadaX CoordenadaY NomeDoModemASerConectado,
    Dispositivo NomeDoDispositivo CoordenadaX CoordenadaY,
}
```
Resultado de exemplo:

![Conexão](https://media.discordapp.net/attachments/931984117652946988/1267188486570512416/image.png?ex=66a7e0be&is=66a68f3e&hm=c8d79bc0ab1e6c95e64d35d274649c888f380d11c5c3bee881d3d207e1d28734&=&format=webp&quality=lossless)

*3- Para o mapeamento de Torres de Rede:*                                                                                                                                                                                                                                      
Observação: 
- Coordenadas baseadas dentro da área definida.
- Exemplos de modelos estão nos arquivos .txt: Rede1.txt, Rede2.txt
```bash
Rede (ÁreaX x ÁreaY){
    Casa NúmeroDaCasa CoordenadaX CoordenadaY,
    Torre NomeDaTorre AlcanceDaTorre CoordenadaX CoordenadaY,
}
```
Resultado de exemplo:

![Redes](https://cdn.discordapp.com/attachments/931984117652946988/1267188609585254452/image.png?ex=66a7e0db&is=66a68f5b&hm=2720ee553d1301f9af51396e6828da63265a7bdedfceb3508f0a72af7fe19ce5&)
