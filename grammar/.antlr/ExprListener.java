// Generated from c:/Users/Hylzk/Desktop/Outras Coisas/Programas Aulas/Códigos e Projetos/Compiladores/ProjetoCompiladores/grammar/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ExprParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Vertice}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVertice(ExprParser.VerticeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Vertice}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVertice(ExprParser.VerticeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Grupo}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGrupo(ExprParser.GrupoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Grupo}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGrupo(ExprParser.GrupoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Aresta}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAresta(ExprParser.ArestaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Aresta}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAresta(ExprParser.ArestaContext ctx);
}