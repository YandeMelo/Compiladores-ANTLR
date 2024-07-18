# Projeto de Exemplo com ANTLR

Este projeto demonstra o uso do ANTLR para análise léxica, sintática e avaliação de expressões matemáticas simples.

## Pré-requisitos

- Java JDK (versão recomendada: 21)
- ANTLR (versão recomendada: 4.9.2)

## Instalação e Configuração

1. **Configuração do ANTLR:**

Certifique-se de ter o ANTLR instalado. 
```bash
pip install antlr4-tools
```

2. **Compilação do arquivo `.g4`:**

Execute o seguinte comando para compilar o arquivo `.g4` e gerar os artefatos necessários:
```bash
java -jar lib/antlr.jar -o src grammar/Expr.g4
```
Isso compilará o arquivo de gramática `Expr.g4`, localizado no diretório `grammar`, e colocará os arquivos gerados no diretório `src`.

3. **Criação do Visitor:**

Para gerar o visitor a partir do arquivo `.g4`, use o seguinte comando:
```bash
java -jar lib/antlr.jar -o src -listener -visitor grammar/Expr.g4
```
Isso criará classes de visitor necessárias para percorrer a árvore de parsing gerada pelo ANTLR.

## Notas Adicionais

- Ajuste os comandos de compilação e execução conforme necessário para o seu ambiente de desenvolvimento.
- Para mais detalhes sobre o ANTLR, consulte a [documentação oficial](https://www.antlr.org/).
