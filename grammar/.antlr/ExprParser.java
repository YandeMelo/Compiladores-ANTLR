// Generated from c:/Users/romer.LUCASROMERO/OneDrive/Documentos/FACULDADE/7 PERIODO/compiladores/projeto/ProjetoCompiladores/Compiladores-ANTLR/Compiladores-ANTLR/Compiladores-ANTLR/grammar/Expr.g4 by ANTLR 4.13.1
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, STRING=19, NUM=20, SPACES=21;
	public static final int
		RULE_program = 0, RULE_com = 1, RULE_adicionarCasas = 2, RULE_adicionarTorre = 3, 
		RULE_conexaoExpr = 4, RULE_conexaoDispositivo = 5, RULE_grafoExpr = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "com", "adicionarCasas", "adicionarTorre", "conexaoExpr", 
			"conexaoDispositivo", "grafoExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Grafo'", "'{'", "','", "'}'", "'Conex\\u00E3o'", "'('", "'x'", 
			"')'", "'Cabo'", "'Rede'", "'Casa'", "'Torre'", "'Modem'", "'Switch'", 
			"'Repetidor'", "'Dispositivo'", "'vertice'", "'aresta'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "STRING", "NUM", "SPACES"
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			com();
			setState(15);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RedeContext extends ComContext {
		public Token areaX;
		public Token areaY;
		public AdicionarCasasContext e;
		public AdicionarTorreContext d;
		public List<TerminalNode> NUM() { return getTokens(ExprParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ExprParser.NUM, i);
		}
		public AdicionarTorreContext adicionarTorre() {
			return getRuleContext(AdicionarTorreContext.class,0);
		}
		public List<AdicionarCasasContext> adicionarCasas() {
			return getRuleContexts(AdicionarCasasContext.class);
		}
		public AdicionarCasasContext adicionarCasas(int i) {
			return getRuleContext(AdicionarCasasContext.class,i);
		}
		public RedeContext(ComContext ctx) { copyFrom(ctx); }
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
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_com);
		int _la;
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new GrafoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				match(T__0);
				setState(18);
				match(T__1);
				setState(19);
				((GrafoContext)_localctx).e = grafoExpr(0);
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(20);
					match(T__2);
					}
				}

				setState(23);
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new ConexaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				match(T__4);
				setState(26);
				match(T__5);
				setState(27);
				((ConexaoContext)_localctx).areaX = match(NUM);
				setState(28);
				match(T__6);
				setState(29);
				((ConexaoContext)_localctx).areaY = match(NUM);
				setState(30);
				match(T__7);
				setState(31);
				match(T__1);
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(32);
					match(T__8);
					}
				}

				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUM) {
					{
					setState(35);
					((ConexaoContext)_localctx).distanciaCabo = match(NUM);
					}
				}

				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(38);
					match(T__2);
					}
				}

				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(41);
					((ConexaoContext)_localctx).e = conexaoExpr(0);
					}
					}
					setState(44); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0) );
				setState(46);
				match(T__2);
				setState(47);
				((ConexaoContext)_localctx).d = conexaoDispositivo(0);
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(48);
					match(T__2);
					}
				}

				setState(51);
				match(T__3);
				}
				break;
			case T__9:
				_localctx = new RedeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				match(T__9);
				setState(54);
				match(T__5);
				setState(55);
				((RedeContext)_localctx).areaX = match(NUM);
				setState(56);
				match(T__6);
				setState(57);
				((RedeContext)_localctx).areaY = match(NUM);
				setState(58);
				match(T__7);
				setState(59);
				match(T__1);
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(60);
					((RedeContext)_localctx).e = adicionarCasas(0);
					}
					}
					setState(63); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__10 );
				setState(65);
				match(T__2);
				setState(66);
				((RedeContext)_localctx).d = adicionarTorre(0);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(67);
					match(T__2);
					}
				}

				setState(70);
				match(T__3);
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
	public static class AdicionarCasasContext extends ParserRuleContext {
		public AdicionarCasasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adicionarCasas; }
	 
		public AdicionarCasasContext() { }
		public void copyFrom(AdicionarCasasContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CasaContext extends AdicionarCasasContext {
		public Token numeroCasa;
		public Token x;
		public Token y;
		public List<TerminalNode> NUM() { return getTokens(ExprParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ExprParser.NUM, i);
		}
		public CasaContext(AdicionarCasasContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GrupoCasasContext extends AdicionarCasasContext {
		public AdicionarCasasContext e;
		public List<AdicionarCasasContext> adicionarCasas() {
			return getRuleContexts(AdicionarCasasContext.class);
		}
		public AdicionarCasasContext adicionarCasas(int i) {
			return getRuleContext(AdicionarCasasContext.class,i);
		}
		public GrupoCasasContext(AdicionarCasasContext ctx) { copyFrom(ctx); }
	}

	public final AdicionarCasasContext adicionarCasas() throws RecognitionException {
		return adicionarCasas(0);
	}

	private AdicionarCasasContext adicionarCasas(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdicionarCasasContext _localctx = new AdicionarCasasContext(_ctx, _parentState);
		AdicionarCasasContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_adicionarCasas, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CasaContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(75);
			match(T__10);
			setState(76);
			((CasaContext)_localctx).numeroCasa = match(NUM);
			setState(77);
			((CasaContext)_localctx).x = match(NUM);
			setState(78);
			((CasaContext)_localctx).y = match(NUM);
			}
			_ctx.stop = _input.LT(-1);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GrupoCasasContext(new AdicionarCasasContext(_parentctx, _parentState));
					((GrupoCasasContext)_localctx).e = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_adicionarCasas);
					setState(80);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(81);
					match(T__2);
					setState(82);
					((GrupoCasasContext)_localctx).e = adicionarCasas(2);
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
	public static class AdicionarTorreContext extends ParserRuleContext {
		public AdicionarTorreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adicionarTorre; }
	 
		public AdicionarTorreContext() { }
		public void copyFrom(AdicionarTorreContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GrupoTorreContext extends AdicionarTorreContext {
		public AdicionarTorreContext e;
		public List<AdicionarTorreContext> adicionarTorre() {
			return getRuleContexts(AdicionarTorreContext.class);
		}
		public AdicionarTorreContext adicionarTorre(int i) {
			return getRuleContext(AdicionarTorreContext.class,i);
		}
		public GrupoTorreContext(AdicionarTorreContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TorreContext extends AdicionarTorreContext {
		public Token nomeTorre;
		public Token alcance;
		public Token x;
		public Token y;
		public TerminalNode STRING() { return getToken(ExprParser.STRING, 0); }
		public List<TerminalNode> NUM() { return getTokens(ExprParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ExprParser.NUM, i);
		}
		public TorreContext(AdicionarTorreContext ctx) { copyFrom(ctx); }
	}

	public final AdicionarTorreContext adicionarTorre() throws RecognitionException {
		return adicionarTorre(0);
	}

	private AdicionarTorreContext adicionarTorre(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdicionarTorreContext _localctx = new AdicionarTorreContext(_ctx, _parentState);
		AdicionarTorreContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_adicionarTorre, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TorreContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(89);
			match(T__11);
			setState(90);
			((TorreContext)_localctx).nomeTorre = match(STRING);
			setState(91);
			((TorreContext)_localctx).alcance = match(NUM);
			setState(92);
			((TorreContext)_localctx).x = match(NUM);
			setState(93);
			((TorreContext)_localctx).y = match(NUM);
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GrupoTorreContext(new AdicionarTorreContext(_parentctx, _parentState));
					((GrupoTorreContext)_localctx).e = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_adicionarTorre);
					setState(95);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(96);
					match(T__2);
					setState(97);
					((GrupoTorreContext)_localctx).e = adicionarTorre(2);
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
	}

	public final ConexaoExprContext conexaoExpr() throws RecognitionException {
		return conexaoExpr(0);
	}

	private ConexaoExprContext conexaoExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConexaoExprContext _localctx = new ConexaoExprContext(_ctx, _parentState);
		ConexaoExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_conexaoExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				_localctx = new ModemContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(104);
				match(T__12);
				setState(105);
				((ModemContext)_localctx).nome = match(STRING);
				setState(106);
				((ModemContext)_localctx).x = match(NUM);
				setState(107);
				((ModemContext)_localctx).y = match(NUM);
				}
				break;
			case T__13:
				{
				_localctx = new SwitchContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				match(T__13);
				setState(109);
				((SwitchContext)_localctx).nome = match(STRING);
				setState(110);
				((SwitchContext)_localctx).x = match(NUM);
				setState(111);
				((SwitchContext)_localctx).y = match(NUM);
				setState(112);
				((SwitchContext)_localctx).conectado = match(STRING);
				}
				break;
			case T__14:
				{
				_localctx = new RepetidorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(T__14);
				setState(114);
				((RepetidorContext)_localctx).nome = match(STRING);
				setState(115);
				((RepetidorContext)_localctx).x = match(NUM);
				setState(116);
				((RepetidorContext)_localctx).y = match(NUM);
				setState(117);
				((RepetidorContext)_localctx).conectado = match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GrupoConexaoContext(new ConexaoExprContext(_parentctx, _parentState));
					((GrupoConexaoContext)_localctx).e = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_conexaoExpr);
					setState(120);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(121);
					match(T__2);
					setState(122);
					((GrupoConexaoContext)_localctx).e = conexaoExpr(2);
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
	}

	public final ConexaoDispositivoContext conexaoDispositivo() throws RecognitionException {
		return conexaoDispositivo(0);
	}

	private ConexaoDispositivoContext conexaoDispositivo(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConexaoDispositivoContext _localctx = new ConexaoDispositivoContext(_ctx, _parentState);
		ConexaoDispositivoContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_conexaoDispositivo, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new DispositivoContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(129);
			match(T__15);
			setState(130);
			((DispositivoContext)_localctx).nome = match(STRING);
			setState(131);
			((DispositivoContext)_localctx).x = match(NUM);
			setState(132);
			((DispositivoContext)_localctx).y = match(NUM);
			}
			_ctx.stop = _input.LT(-1);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GrupoDispositivosContext(new ConexaoDispositivoContext(_parentctx, _parentState));
					((GrupoDispositivosContext)_localctx).d = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_conexaoDispositivo);
					setState(134);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(135);
					match(T__2);
					setState(136);
					((GrupoDispositivosContext)_localctx).d = conexaoDispositivo(2);
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
	}

	public final GrafoExprContext grafoExpr() throws RecognitionException {
		return grafoExpr(0);
	}

	private GrafoExprContext grafoExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GrafoExprContext _localctx = new GrafoExprContext(_ctx, _parentState);
		GrafoExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_grafoExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				{
				_localctx = new VerticeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(143);
				match(T__16);
				setState(144);
				((VerticeContext)_localctx).nome = match(STRING);
				setState(145);
				((VerticeContext)_localctx).x = match(NUM);
				setState(146);
				((VerticeContext)_localctx).y = match(NUM);
				}
				break;
			case T__17:
				{
				_localctx = new ArestaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(T__17);
				setState(148);
				((ArestaContext)_localctx).nome = match(STRING);
				setState(149);
				((ArestaContext)_localctx).verticeInicio = match(STRING);
				setState(150);
				((ArestaContext)_localctx).verticeFinal = match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GrupoGrafoContext(new GrafoExprContext(_parentctx, _parentState));
					((GrupoGrafoContext)_localctx).e = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_grafoExpr);
					setState(153);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(154);
					match(T__2);
					setState(155);
					((GrupoGrafoContext)_localctx).e = grafoExpr(2);
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
			return adicionarCasas_sempred((AdicionarCasasContext)_localctx, predIndex);
		case 3:
			return adicionarTorre_sempred((AdicionarTorreContext)_localctx, predIndex);
		case 4:
			return conexaoExpr_sempred((ConexaoExprContext)_localctx, predIndex);
		case 5:
			return conexaoDispositivo_sempred((ConexaoDispositivoContext)_localctx, predIndex);
		case 6:
			return grafoExpr_sempred((GrafoExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean adicionarCasas_sempred(AdicionarCasasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean adicionarTorre_sempred(AdicionarTorreContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conexaoExpr_sempred(ConexaoExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conexaoDispositivo_sempred(ConexaoDispositivoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean grafoExpr_sempred(GrafoExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0015\u00a2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0016\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\"\b\u0001\u0001\u0001\u0003\u0001%\b\u0001\u0001\u0001\u0003\u0001(\b"+
		"\u0001\u0001\u0001\u0004\u0001+\b\u0001\u000b\u0001\f\u0001,\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u00012\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u0001>\b\u0001\u000b\u0001\f\u0001?\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001E\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001I\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002T\b\u0002\n\u0002\f\u0002W\t\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003c\b\u0003\n\u0003\f\u0003f\t\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004w\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004|\b\u0004\n\u0004\f\u0004\u007f\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u008a\b\u0005\n\u0005"+
		"\f\u0005\u008d\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0098\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u009d\b"+
		"\u0006\n\u0006\f\u0006\u00a0\t\u0006\u0001\u0006\u0000\u0005\u0004\u0006"+
		"\b\n\f\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0000\u00ac\u0000\u000e"+
		"\u0001\u0000\u0000\u0000\u0002H\u0001\u0000\u0000\u0000\u0004J\u0001\u0000"+
		"\u0000\u0000\u0006X\u0001\u0000\u0000\u0000\bv\u0001\u0000\u0000\u0000"+
		"\n\u0080\u0001\u0000\u0000\u0000\f\u0097\u0001\u0000\u0000\u0000\u000e"+
		"\u000f\u0003\u0002\u0001\u0000\u000f\u0010\u0005\u0000\u0000\u0001\u0010"+
		"\u0001\u0001\u0000\u0000\u0000\u0011\u0012\u0005\u0001\u0000\u0000\u0012"+
		"\u0013\u0005\u0002\u0000\u0000\u0013\u0015\u0003\f\u0006\u0000\u0014\u0016"+
		"\u0005\u0003\u0000\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0018"+
		"\u0005\u0004\u0000\u0000\u0018I\u0001\u0000\u0000\u0000\u0019\u001a\u0005"+
		"\u0005\u0000\u0000\u001a\u001b\u0005\u0006\u0000\u0000\u001b\u001c\u0005"+
		"\u0014\u0000\u0000\u001c\u001d\u0005\u0007\u0000\u0000\u001d\u001e\u0005"+
		"\u0014\u0000\u0000\u001e\u001f\u0005\b\u0000\u0000\u001f!\u0005\u0002"+
		"\u0000\u0000 \"\u0005\t\u0000\u0000! \u0001\u0000\u0000\u0000!\"\u0001"+
		"\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000#%\u0005\u0014\u0000\u0000"+
		"$#\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%\'\u0001\u0000\u0000"+
		"\u0000&(\u0005\u0003\u0000\u0000\'&\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000(*\u0001\u0000\u0000\u0000)+\u0003\b\u0004\u0000*)\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0005\u0003\u0000\u0000"+
		"/1\u0003\n\u0005\u000002\u0005\u0003\u0000\u000010\u0001\u0000\u0000\u0000"+
		"12\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0005\u0004\u0000"+
		"\u00004I\u0001\u0000\u0000\u000056\u0005\n\u0000\u000067\u0005\u0006\u0000"+
		"\u000078\u0005\u0014\u0000\u000089\u0005\u0007\u0000\u00009:\u0005\u0014"+
		"\u0000\u0000:;\u0005\b\u0000\u0000;=\u0005\u0002\u0000\u0000<>\u0003\u0004"+
		"\u0002\u0000=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?=\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000"+
		"AB\u0005\u0003\u0000\u0000BD\u0003\u0006\u0003\u0000CE\u0005\u0003\u0000"+
		"\u0000DC\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0001\u0000"+
		"\u0000\u0000FG\u0005\u0004\u0000\u0000GI\u0001\u0000\u0000\u0000H\u0011"+
		"\u0001\u0000\u0000\u0000H\u0019\u0001\u0000\u0000\u0000H5\u0001\u0000"+
		"\u0000\u0000I\u0003\u0001\u0000\u0000\u0000JK\u0006\u0002\uffff\uffff"+
		"\u0000KL\u0005\u000b\u0000\u0000LM\u0005\u0014\u0000\u0000MN\u0005\u0014"+
		"\u0000\u0000NO\u0005\u0014\u0000\u0000OU\u0001\u0000\u0000\u0000PQ\n\u0001"+
		"\u0000\u0000QR\u0005\u0003\u0000\u0000RT\u0003\u0004\u0002\u0002SP\u0001"+
		"\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000V\u0005\u0001\u0000\u0000\u0000WU\u0001\u0000"+
		"\u0000\u0000XY\u0006\u0003\uffff\uffff\u0000YZ\u0005\f\u0000\u0000Z[\u0005"+
		"\u0013\u0000\u0000[\\\u0005\u0014\u0000\u0000\\]\u0005\u0014\u0000\u0000"+
		"]^\u0005\u0014\u0000\u0000^d\u0001\u0000\u0000\u0000_`\n\u0001\u0000\u0000"+
		"`a\u0005\u0003\u0000\u0000ac\u0003\u0006\u0003\u0002b_\u0001\u0000\u0000"+
		"\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000e\u0007\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"gh\u0006\u0004\uffff\uffff\u0000hi\u0005\r\u0000\u0000ij\u0005\u0013\u0000"+
		"\u0000jk\u0005\u0014\u0000\u0000kw\u0005\u0014\u0000\u0000lm\u0005\u000e"+
		"\u0000\u0000mn\u0005\u0013\u0000\u0000no\u0005\u0014\u0000\u0000op\u0005"+
		"\u0014\u0000\u0000pw\u0005\u0013\u0000\u0000qr\u0005\u000f\u0000\u0000"+
		"rs\u0005\u0013\u0000\u0000st\u0005\u0014\u0000\u0000tu\u0005\u0014\u0000"+
		"\u0000uw\u0005\u0013\u0000\u0000vg\u0001\u0000\u0000\u0000vl\u0001\u0000"+
		"\u0000\u0000vq\u0001\u0000\u0000\u0000w}\u0001\u0000\u0000\u0000xy\n\u0001"+
		"\u0000\u0000yz\u0005\u0003\u0000\u0000z|\u0003\b\u0004\u0002{x\u0001\u0000"+
		"\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\t\u0001\u0000\u0000\u0000\u007f}\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0006\u0005\uffff\uffff\u0000\u0081\u0082\u0005"+
		"\u0010\u0000\u0000\u0082\u0083\u0005\u0013\u0000\u0000\u0083\u0084\u0005"+
		"\u0014\u0000\u0000\u0084\u0085\u0005\u0014\u0000\u0000\u0085\u008b\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\n\u0001\u0000\u0000\u0087\u0088\u0005\u0003"+
		"\u0000\u0000\u0088\u008a\u0003\n\u0005\u0002\u0089\u0086\u0001\u0000\u0000"+
		"\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u000b\u0001\u0000\u0000"+
		"\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u008f\u0006\u0006\uffff"+
		"\uffff\u0000\u008f\u0090\u0005\u0011\u0000\u0000\u0090\u0091\u0005\u0013"+
		"\u0000\u0000\u0091\u0092\u0005\u0014\u0000\u0000\u0092\u0098\u0005\u0014"+
		"\u0000\u0000\u0093\u0094\u0005\u0012\u0000\u0000\u0094\u0095\u0005\u0013"+
		"\u0000\u0000\u0095\u0096\u0005\u0013\u0000\u0000\u0096\u0098\u0005\u0013"+
		"\u0000\u0000\u0097\u008e\u0001\u0000\u0000\u0000\u0097\u0093\u0001\u0000"+
		"\u0000\u0000\u0098\u009e\u0001\u0000\u0000\u0000\u0099\u009a\n\u0001\u0000"+
		"\u0000\u009a\u009b\u0005\u0003\u0000\u0000\u009b\u009d\u0003\f\u0006\u0002"+
		"\u009c\u0099\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000"+
		"\u009f\r\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u0010"+
		"\u0015!$\',1?DHUdv}\u008b\u0097\u009e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}