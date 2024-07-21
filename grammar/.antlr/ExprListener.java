// Generated from c:/Users/romer.LUCASROMERO/OneDrive/Documentos/FACULDADE/7 PERIODO/compiladores/projeto/ProjetoCompiladores/Compiladores-ANTLR/Compiladores-ANTLR/Compiladores-ANTLR/grammar/Expr.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by the {@code Grafo}
	 * labeled alternative in {@link ExprParser#com}.
	 * @param ctx the parse tree
	 */
	void enterGrafo(ExprParser.GrafoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Grafo}
	 * labeled alternative in {@link ExprParser#com}.
	 * @param ctx the parse tree
	 */
	void exitGrafo(ExprParser.GrafoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Conexao}
	 * labeled alternative in {@link ExprParser#com}.
	 * @param ctx the parse tree
	 */
	void enterConexao(ExprParser.ConexaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Conexao}
	 * labeled alternative in {@link ExprParser#com}.
	 * @param ctx the parse tree
	 */
	void exitConexao(ExprParser.ConexaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rede}
	 * labeled alternative in {@link ExprParser#com}.
	 * @param ctx the parse tree
	 */
	void enterRede(ExprParser.RedeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rede}
	 * labeled alternative in {@link ExprParser#com}.
	 * @param ctx the parse tree
	 */
	void exitRede(ExprParser.RedeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Casa}
	 * labeled alternative in {@link ExprParser#adicionarCasas}.
	 * @param ctx the parse tree
	 */
	void enterCasa(ExprParser.CasaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Casa}
	 * labeled alternative in {@link ExprParser#adicionarCasas}.
	 * @param ctx the parse tree
	 */
	void exitCasa(ExprParser.CasaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GrupoCasas}
	 * labeled alternative in {@link ExprParser#adicionarCasas}.
	 * @param ctx the parse tree
	 */
	void enterGrupoCasas(ExprParser.GrupoCasasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GrupoCasas}
	 * labeled alternative in {@link ExprParser#adicionarCasas}.
	 * @param ctx the parse tree
	 */
	void exitGrupoCasas(ExprParser.GrupoCasasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GrupoTorre}
	 * labeled alternative in {@link ExprParser#adicionarTorre}.
	 * @param ctx the parse tree
	 */
	void enterGrupoTorre(ExprParser.GrupoTorreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GrupoTorre}
	 * labeled alternative in {@link ExprParser#adicionarTorre}.
	 * @param ctx the parse tree
	 */
	void exitGrupoTorre(ExprParser.GrupoTorreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Torre}
	 * labeled alternative in {@link ExprParser#adicionarTorre}.
	 * @param ctx the parse tree
	 */
	void enterTorre(ExprParser.TorreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Torre}
	 * labeled alternative in {@link ExprParser#adicionarTorre}.
	 * @param ctx the parse tree
	 */
	void exitTorre(ExprParser.TorreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Repetidor}
	 * labeled alternative in {@link ExprParser#conexaoExpr}.
	 * @param ctx the parse tree
	 */
	void enterRepetidor(ExprParser.RepetidorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Repetidor}
	 * labeled alternative in {@link ExprParser#conexaoExpr}.
	 * @param ctx the parse tree
	 */
	void exitRepetidor(ExprParser.RepetidorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GrupoConexao}
	 * labeled alternative in {@link ExprParser#conexaoExpr}.
	 * @param ctx the parse tree
	 */
	void enterGrupoConexao(ExprParser.GrupoConexaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GrupoConexao}
	 * labeled alternative in {@link ExprParser#conexaoExpr}.
	 * @param ctx the parse tree
	 */
	void exitGrupoConexao(ExprParser.GrupoConexaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Switch}
	 * labeled alternative in {@link ExprParser#conexaoExpr}.
	 * @param ctx the parse tree
	 */
	void enterSwitch(ExprParser.SwitchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Switch}
	 * labeled alternative in {@link ExprParser#conexaoExpr}.
	 * @param ctx the parse tree
	 */
	void exitSwitch(ExprParser.SwitchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Modem}
	 * labeled alternative in {@link ExprParser#conexaoExpr}.
	 * @param ctx the parse tree
	 */
	void enterModem(ExprParser.ModemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Modem}
	 * labeled alternative in {@link ExprParser#conexaoExpr}.
	 * @param ctx the parse tree
	 */
	void exitModem(ExprParser.ModemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GrupoDispositivos}
	 * labeled alternative in {@link ExprParser#conexaoDispositivo}.
	 * @param ctx the parse tree
	 */
	void enterGrupoDispositivos(ExprParser.GrupoDispositivosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GrupoDispositivos}
	 * labeled alternative in {@link ExprParser#conexaoDispositivo}.
	 * @param ctx the parse tree
	 */
	void exitGrupoDispositivos(ExprParser.GrupoDispositivosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Dispositivo}
	 * labeled alternative in {@link ExprParser#conexaoDispositivo}.
	 * @param ctx the parse tree
	 */
	void enterDispositivo(ExprParser.DispositivoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Dispositivo}
	 * labeled alternative in {@link ExprParser#conexaoDispositivo}.
	 * @param ctx the parse tree
	 */
	void exitDispositivo(ExprParser.DispositivoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Vertice}
	 * labeled alternative in {@link ExprParser#grafoExpr}.
	 * @param ctx the parse tree
	 */
	void enterVertice(ExprParser.VerticeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Vertice}
	 * labeled alternative in {@link ExprParser#grafoExpr}.
	 * @param ctx the parse tree
	 */
	void exitVertice(ExprParser.VerticeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GrupoGrafo}
	 * labeled alternative in {@link ExprParser#grafoExpr}.
	 * @param ctx the parse tree
	 */
	void enterGrupoGrafo(ExprParser.GrupoGrafoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GrupoGrafo}
	 * labeled alternative in {@link ExprParser#grafoExpr}.
	 * @param ctx the parse tree
	 */
	void exitGrupoGrafo(ExprParser.GrupoGrafoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Aresta}
	 * labeled alternative in {@link ExprParser#grafoExpr}.
	 * @param ctx the parse tree
	 */
	void enterAresta(ExprParser.ArestaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Aresta}
	 * labeled alternative in {@link ExprParser#grafoExpr}.
	 * @param ctx the parse tree
	 */
	void exitAresta(ExprParser.ArestaContext ctx);
}