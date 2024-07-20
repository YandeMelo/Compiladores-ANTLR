// Generated from grammar/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, STRING=16, 
		NUM=17, SPACES=18;
	public static final int
		RULE_program = 0, RULE_com = 1, RULE_conexaoExpr = 2, RULE_conexaoDispositivo = 3, 
		RULE_grafoExpr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "com", "conexaoExpr", "conexaoDispositivo", "grafoExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Grafo'", "'{'", "'}'", "'Conex\\u00E3o'", "'('", "'x'", "')'", 
			"'Cabo'", "','", "'Modem'", "'Switch'", "'Repetidor'", "'Dispositivo'", 
			"'vertice'", "'aresta'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "STRING", "NUM", "SPACES"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			com();
			setState(11);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComContext extends ParserRuleContext {
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
	 
		public ComContext() { }
		public void copyFrom(ComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GrafoContext extends ComContext {
		public GrafoExprContext e;
		public GrafoExprContext grafoExpr() {
			return getRuleContext(GrafoExprContext.class,0);
		}
		public GrafoContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterGrafo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitGrafo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitGrafo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConexaoContext extends ComContext {
		public Token areaX;
		public Token areaY;
		public Token distanciaCabo;
		public ConexaoExprContext e;
		public ConexaoDispositivoContext d;
		public List<TerminalNode> NUM() { return getTokens(ExprParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ExprParser.NUM, i);
		}
		public ConexaoDispositivoContext conexaoDispositivo() {
			return getRuleContext(ConexaoDispositivoContext.class,0);
		}
		public List<ConexaoExprContext> conexaoExpr() {
			return getRuleContexts(ConexaoExprContext.class);
		}
		public ConexaoExprContext conexaoExpr(int i) {
			return getRuleContext(ConexaoExprContext.class,i);
		}
		public ConexaoContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterConexao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitConexao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitConexao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_com);
		int _la;
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new GrafoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				match(T__0);
				setState(14);
				match(T__1);
				setState(15);
				((GrafoContext)_localctx).e = grafoExpr(0);
				setState(16);
				match(T__2);
				}
				break;
			case T__3:
				_localctx = new ConexaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				match(T__3);
				setState(19);
				match(T__4);
				setState(20);
				((ConexaoContext)_localctx).areaX = match(NUM);
				setState(21);
				match(T__5);
				setState(22);
				((ConexaoContext)_localctx).areaY = match(NUM);
				setState(23);
				match(T__6);
				setState(24);
				match(T__1);
				setState(25);
				match(T__7);
				setState(26);
				((ConexaoContext)_localctx).distanciaCabo = match(NUM);
				setState(27);
				match(T__8);
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(28);
					((ConexaoContext)_localctx).e = conexaoExpr(0);
					}
					}
					setState(31); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0) );
				setState(33);
				match(T__8);
				setState(34);
				((ConexaoContext)_localctx).d = conexaoDispositivo(0);
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(35);
					match(T__8);
					}
				}

				setState(38);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConexaoExprContext extends ParserRuleContext {
		public ConexaoExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conexaoExpr; }
	 
		public ConexaoExprContext() { }
		public void copyFrom(ConexaoExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepetidorContext extends ConexaoExprContext {
		public Token nome;
		public Token x;
		public Token y;
		public Token conectado;
		public List<TerminalNode> STRING() { return getTokens(ExprParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ExprParser.STRING, i);
		}
		public List<TerminalNode> NUM() { return getTokens(ExprParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ExprParser.NUM, i);
		}
		public RepetidorContext(ConexaoExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterRepetidor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitRepetidor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitRepetidor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GrupoConexaoContext extends ConexaoExprContext {
		public ConexaoExprContext e;
		public List<ConexaoExprContext> conexaoExpr() {
			return getRuleContexts(ConexaoExprContext.class);
		}
		public ConexaoExprContext conexaoExpr(int i) {
			return getRuleContext(ConexaoExprContext.class,i);
		}
		public GrupoConexaoContext(ConexaoExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterGrupoConexao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitGrupoConexao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitGrupoConexao(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchContext extends ConexaoExprContext {
		public Token nome;
		public Token x;
		public Token y;
		public Token conectado;
		public List<TerminalNode> STRING() { return getTokens(ExprParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ExprParser.STRING, i);
		}
		public List<TerminalNode> NUM() { return getTokens(ExprParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ExprParser.NUM, i);
		}
		public SwitchContext(ConexaoExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitSwitch(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModemContext extends ConexaoExprContext {
		public Token nome;
		public Token x;
		public Token y;
		public TerminalNode STRING() { return getToken(ExprParser.STRING, 0); }
		public List<TerminalNode> NUM() { return getTokens(ExprParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ExprParser.NUM, i);
		}
		public ModemContext(ConexaoExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterModem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitModem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitModem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConexaoExprContext conexaoExpr() throws RecognitionException {
		return conexaoExpr(0);
	}

	private ConexaoExprContext conexaoExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConexaoExprContext _localctx = new ConexaoExprContext(_ctx, _parentState);
		ConexaoExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_conexaoExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				{
				_localctx = new ModemContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(43);
				match(T__9);
				setState(44);
				((ModemContext)_localctx).nome = match(STRING);
				setState(45);
				((ModemContext)_localctx).x = match(NUM);
				setState(46);
				((ModemContext)_localctx).y = match(NUM);
				}
				break;
			case T__10:
				{
				_localctx = new SwitchContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				match(T__10);
				setState(48);
				((SwitchContext)_localctx).nome = match(STRING);
				setState(49);
				((SwitchContext)_localctx).x = match(NUM);
				setState(50);
				((SwitchContext)_localctx).y = match(NUM);
				setState(51);
				((SwitchContext)_localctx).conectado = match(STRING);
				}
				break;
			case T__11:
				{
				_localctx = new RepetidorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(T__11);
				setState(53);
				((RepetidorContext)_localctx).nome = match(STRING);
				setState(54);
				((RepetidorContext)_localctx).x = match(NUM);
				setState(55);
				((RepetidorContext)_localctx).y = match(NUM);
				setState(56);
				((RepetidorContext)_localctx).conectado = match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GrupoConexaoContext(new ConexaoExprContext(_parentctx, _parentState));
					((GrupoConexaoContext)_localctx).e = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_conexaoExpr);
					setState(59);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(60);
					match(T__8);
					setState(61);
					((GrupoConexaoContext)_localctx).e = conexaoExpr(2);
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConexaoDispositivoContext extends ParserRuleContext {
		public ConexaoDispositivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conexaoDispositivo; }
	 
		public ConexaoDispositivoContext() { }
		public void copyFrom(ConexaoDispositivoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GrupoDispositivosContext extends ConexaoDispositivoContext {
		public ConexaoDispositivoContext d;
		public List<ConexaoDispositivoContext> conexaoDispositivo() {
			return getRuleContexts(ConexaoDispositivoContext.class);
		}
		public ConexaoDispositivoContext conexaoDispositivo(int i) {
			return getRuleContext(ConexaoDispositivoContext.class,i);
		}
		public GrupoDispositivosContext(ConexaoDispositivoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterGrupoDispositivos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitGrupoDispositivos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitGrupoDispositivos(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DispositivoContext extends ConexaoDispositivoContext {
		public Token nome;
		public Token x;
		public Token y;
		public TerminalNode STRING() { return getToken(ExprParser.STRING, 0); }
		public List<TerminalNode> NUM() { return getTokens(ExprParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ExprParser.NUM, i);
		}
		public DispositivoContext(ConexaoDispositivoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDispositivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDispositivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitDispositivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConexaoDispositivoContext conexaoDispositivo() throws RecognitionException {
		return conexaoDispositivo(0);
	}

	private ConexaoDispositivoContext conexaoDispositivo(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConexaoDispositivoContext _localctx = new ConexaoDispositivoContext(_ctx, _parentState);
		ConexaoDispositivoContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_conexaoDispositivo, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new DispositivoContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(68);
			match(T__12);
			setState(69);
			((DispositivoContext)_localctx).nome = match(STRING);
			setState(70);
			((DispositivoContext)_localctx).x = match(NUM);
			setState(71);
			((DispositivoContext)_localctx).y = match(NUM);
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GrupoDispositivosContext(new ConexaoDispositivoContext(_parentctx, _parentState));
					((GrupoDispositivosContext)_localctx).d = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_conexaoDispositivo);
					setState(73);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(74);
					match(T__8);
					setState(75);
					((GrupoDispositivosContext)_localctx).d = conexaoDispositivo(2);
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GrafoExprContext extends ParserRuleContext {
		public GrafoExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grafoExpr; }
	 
		public GrafoExprContext() { }
		public void copyFrom(GrafoExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VerticeContext extends GrafoExprContext {
		public Token nome;
		public Token x;
		public Token y;
		public TerminalNode STRING() { return getToken(ExprParser.STRING, 0); }
		public List<TerminalNode> NUM() { return getTokens(ExprParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ExprParser.NUM, i);
		}
		public VerticeContext(GrafoExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterVertice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitVertice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitVertice(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GrupoGrafoContext extends GrafoExprContext {
		public GrafoExprContext e;
		public List<GrafoExprContext> grafoExpr() {
			return getRuleContexts(GrafoExprContext.class);
		}
		public GrafoExprContext grafoExpr(int i) {
			return getRuleContext(GrafoExprContext.class,i);
		}
		public GrupoGrafoContext(GrafoExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterGrupoGrafo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitGrupoGrafo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitGrupoGrafo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArestaContext extends GrafoExprContext {
		public Token nome;
		public Token verticeInicio;
		public Token verticeFinal;
		public List<TerminalNode> STRING() { return getTokens(ExprParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ExprParser.STRING, i);
		}
		public ArestaContext(GrafoExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAresta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAresta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAresta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrafoExprContext grafoExpr() throws RecognitionException {
		return grafoExpr(0);
	}

	private GrafoExprContext grafoExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GrafoExprContext _localctx = new GrafoExprContext(_ctx, _parentState);
		GrafoExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_grafoExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				_localctx = new VerticeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(82);
				match(T__13);
				setState(83);
				((VerticeContext)_localctx).nome = match(STRING);
				setState(84);
				((VerticeContext)_localctx).x = match(NUM);
				setState(85);
				((VerticeContext)_localctx).y = match(NUM);
				}
				break;
			case T__14:
				{
				_localctx = new ArestaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				match(T__14);
				setState(87);
				((ArestaContext)_localctx).nome = match(STRING);
				setState(88);
				((ArestaContext)_localctx).verticeInicio = match(STRING);
				setState(89);
				((ArestaContext)_localctx).verticeFinal = match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GrupoGrafoContext(new GrafoExprContext(_parentctx, _parentState));
					((GrupoGrafoContext)_localctx).e = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_grafoExpr);
					setState(92);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(93);
					match(T__8);
					setState(94);
					((GrupoGrafoContext)_localctx).e = grafoExpr(2);
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return conexaoExpr_sempred((ConexaoExprContext)_localctx, predIndex);
		case 3:
			return conexaoDispositivo_sempred((ConexaoDispositivoContext)_localctx, predIndex);
		case 4:
			return grafoExpr_sempred((GrafoExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean conexaoExpr_sempred(ConexaoExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conexaoDispositivo_sempred(ConexaoDispositivoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean grafoExpr_sempred(GrafoExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0012e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0004\u0001\u001e\b\u0001\u000b\u0001\f\u0001\u001f\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001%\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001)\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		":\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002?\b\u0002\n\u0002"+
		"\f\u0002B\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003M\b"+
		"\u0003\n\u0003\f\u0003P\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004[\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004`\b\u0004"+
		"\n\u0004\f\u0004c\t\u0004\u0001\u0004\u0000\u0003\u0004\u0006\b\u0005"+
		"\u0000\u0002\u0004\u0006\b\u0000\u0000h\u0000\n\u0001\u0000\u0000\u0000"+
		"\u0002(\u0001\u0000\u0000\u0000\u00049\u0001\u0000\u0000\u0000\u0006C"+
		"\u0001\u0000\u0000\u0000\bZ\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002"+
		"\u0001\u0000\u000b\f\u0005\u0000\u0000\u0001\f\u0001\u0001\u0000\u0000"+
		"\u0000\r\u000e\u0005\u0001\u0000\u0000\u000e\u000f\u0005\u0002\u0000\u0000"+
		"\u000f\u0010\u0003\b\u0004\u0000\u0010\u0011\u0005\u0003\u0000\u0000\u0011"+
		")\u0001\u0000\u0000\u0000\u0012\u0013\u0005\u0004\u0000\u0000\u0013\u0014"+
		"\u0005\u0005\u0000\u0000\u0014\u0015\u0005\u0011\u0000\u0000\u0015\u0016"+
		"\u0005\u0006\u0000\u0000\u0016\u0017\u0005\u0011\u0000\u0000\u0017\u0018"+
		"\u0005\u0007\u0000\u0000\u0018\u0019\u0005\u0002\u0000\u0000\u0019\u001a"+
		"\u0005\b\u0000\u0000\u001a\u001b\u0005\u0011\u0000\u0000\u001b\u001d\u0005"+
		"\t\u0000\u0000\u001c\u001e\u0003\u0004\u0002\u0000\u001d\u001c\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000"+
		"\u0000\u0000\u001f \u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000"+
		"!\"\u0005\t\u0000\u0000\"$\u0003\u0006\u0003\u0000#%\u0005\t\u0000\u0000"+
		"$#\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000"+
		"\u0000&\'\u0005\u0003\u0000\u0000\')\u0001\u0000\u0000\u0000(\r\u0001"+
		"\u0000\u0000\u0000(\u0012\u0001\u0000\u0000\u0000)\u0003\u0001\u0000\u0000"+
		"\u0000*+\u0006\u0002\uffff\uffff\u0000+,\u0005\n\u0000\u0000,-\u0005\u0010"+
		"\u0000\u0000-.\u0005\u0011\u0000\u0000.:\u0005\u0011\u0000\u0000/0\u0005"+
		"\u000b\u0000\u000001\u0005\u0010\u0000\u000012\u0005\u0011\u0000\u0000"+
		"23\u0005\u0011\u0000\u00003:\u0005\u0010\u0000\u000045\u0005\f\u0000\u0000"+
		"56\u0005\u0010\u0000\u000067\u0005\u0011\u0000\u000078\u0005\u0011\u0000"+
		"\u00008:\u0005\u0010\u0000\u00009*\u0001\u0000\u0000\u00009/\u0001\u0000"+
		"\u0000\u000094\u0001\u0000\u0000\u0000:@\u0001\u0000\u0000\u0000;<\n\u0001"+
		"\u0000\u0000<=\u0005\t\u0000\u0000=?\u0003\u0004\u0002\u0002>;\u0001\u0000"+
		"\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001"+
		"\u0000\u0000\u0000A\u0005\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000"+
		"\u0000CD\u0006\u0003\uffff\uffff\u0000DE\u0005\r\u0000\u0000EF\u0005\u0010"+
		"\u0000\u0000FG\u0005\u0011\u0000\u0000GH\u0005\u0011\u0000\u0000HN\u0001"+
		"\u0000\u0000\u0000IJ\n\u0001\u0000\u0000JK\u0005\t\u0000\u0000KM\u0003"+
		"\u0006\u0003\u0002LI\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\u0007\u0001\u0000"+
		"\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0006\u0004\uffff\uffff\u0000"+
		"RS\u0005\u000e\u0000\u0000ST\u0005\u0010\u0000\u0000TU\u0005\u0011\u0000"+
		"\u0000U[\u0005\u0011\u0000\u0000VW\u0005\u000f\u0000\u0000WX\u0005\u0010"+
		"\u0000\u0000XY\u0005\u0010\u0000\u0000Y[\u0005\u0010\u0000\u0000ZQ\u0001"+
		"\u0000\u0000\u0000ZV\u0001\u0000\u0000\u0000[a\u0001\u0000\u0000\u0000"+
		"\\]\n\u0001\u0000\u0000]^\u0005\t\u0000\u0000^`\u0003\b\u0004\u0002_\\"+
		"\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000b\t\u0001\u0000\u0000\u0000ca\u0001\u0000"+
		"\u0000\u0000\b\u001f$(9@NZa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}