// Generated from grammar/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Grafo}
	 * labeled alternative in {@link ExprParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrafo(ExprParser.GrafoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Conexao}
	 * labeled alternative in {@link ExprParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConexao(ExprParser.ConexaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Repetidor}
	 * labeled alternative in {@link ExprParser#conexaoExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetidor(ExprParser.RepetidorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GrupoConexao}
	 * labeled alternative in {@link ExprParser#conexaoExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrupoConexao(ExprParser.GrupoConexaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Switch}
	 * labeled alternative in {@link ExprParser#conexaoExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch(ExprParser.SwitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Modem}
	 * labeled alternative in {@link ExprParser#conexaoExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModem(ExprParser.ModemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GrupoDispositivos}
	 * labeled alternative in {@link ExprParser#conexaoDispositivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrupoDispositivos(ExprParser.GrupoDispositivosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Dispositivo}
	 * labeled alternative in {@link ExprParser#conexaoDispositivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDispositivo(ExprParser.DispositivoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Vertice}
	 * labeled alternative in {@link ExprParser#grafoExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVertice(ExprParser.VerticeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GrupoGrafo}
	 * labeled alternative in {@link ExprParser#grafoExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrupoGrafo(ExprParser.GrupoGrafoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Aresta}
	 * labeled alternative in {@link ExprParser#grafoExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAresta(ExprParser.ArestaContext ctx);
}