// Generated from cal.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Variable=1, Constant=2, Return=3, TypeInteger=4, TypeBoolean=5, TypeVoid=6, 
		Main=7, If=8, Else=9, True=10, False=11, While=12, Begin=13, End=14, Is=15, 
		Skipp=16, COMMA=17, SEMI=18, COLON=19, ASSIGN=20, LBR=21, RBR=22, PLUS=23, 
		MINUS=24, TILDE=25, NOTEQUAL=26, OR=27, AND=28, EQUAL=29, LESSEQUAL=30, 
		LESS=31, GREATER=32, GREATEREQUAL=33, Number=34, Identifier=35, COMMENT=36, 
		LINE_COMMENT=37, WS=38;
	public static final int
		RULE_prog = 0, RULE_decl_list = 1, RULE_decl = 2, RULE_var_decl = 3, RULE_const_decl = 4, 
		RULE_function_list = 5, RULE_function = 6, RULE_type = 7, RULE_parameter_list = 8, 
		RULE_nemp_parameter_list = 9, RULE_main = 10, RULE_statement_block = 11, 
		RULE_statement = 12, RULE_expression = 13, RULE_binary_arith_op = 14, 
		RULE_bit = 15, RULE_condition = 16, RULE_comp_op = 17, RULE_arg_list = 18, 
		RULE_nemp_arg_list = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl_list", "decl", "var_decl", "const_decl", "function_list", 
			"function", "type", "parameter_list", "nemp_parameter_list", "main", 
			"statement_block", "statement", "expression", "binary_arith_op", "bit", 
			"condition", "comp_op", "arg_list", "nemp_arg_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "','", "';'", "':'", "':='", "'('", "')'", 
			"'+'", "'-'", "'~'", "'!='", "'|'", "'&'", "'='", "'<='", "'<'", "'>'", 
			"'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Variable", "Constant", "Return", "TypeInteger", "TypeBoolean", 
			"TypeVoid", "Main", "If", "Else", "True", "False", "While", "Begin", 
			"End", "Is", "Skipp", "COMMA", "SEMI", "COLON", "ASSIGN", "LBR", "RBR", 
			"PLUS", "MINUS", "TILDE", "NOTEQUAL", "OR", "AND", "EQUAL", "LESSEQUAL", 
			"LESS", "GREATER", "GREATEREQUAL", "Number", "Identifier", "COMMENT", 
			"LINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "cal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public calParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Function_listContext function_list() {
			return getRuleContext(Function_listContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			decl_list();
			setState(41);
			function_list();
			setState(42);
			main();
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

	public static class Decl_listContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(calParser.SEMI, 0); }
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterDecl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitDecl_list(this);
		}
	}

	public final Decl_listContext decl_list() throws RecognitionException {
		Decl_listContext _localctx = new Decl_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl_list);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Variable:
			case Constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				decl();
				setState(45);
				match(SEMI);
				setState(46);
				decl_list();
				}
				break;
			case TypeInteger:
			case TypeBoolean:
			case TypeVoid:
			case Main:
			case If:
			case While:
			case Begin:
			case End:
			case Skipp:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DeclContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Const_declContext const_decl() {
			return getRuleContext(Const_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Variable:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				var_decl();
				}
				break;
			case Constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				const_decl();
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

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode Variable() { return getToken(calParser.Variable, 0); }
		public TerminalNode Identifier() { return getToken(calParser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(calParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(Variable);
			setState(56);
			match(Identifier);
			setState(57);
			match(COLON);
			setState(58);
			type();
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

	public static class Const_declContext extends ParserRuleContext {
		public TerminalNode Constant() { return getToken(calParser.Constant, 0); }
		public TerminalNode Identifier() { return getToken(calParser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(calParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(calParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Const_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterConst_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitConst_decl(this);
		}
	}

	public final Const_declContext const_decl() throws RecognitionException {
		Const_declContext _localctx = new Const_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_const_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(Constant);
			setState(61);
			match(Identifier);
			setState(62);
			match(COLON);
			setState(63);
			type();
			setState(64);
			match(ASSIGN);
			setState(65);
			expression();
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

	public static class Function_listContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Function_listContext function_list() {
			return getRuleContext(Function_listContext.class,0);
		}
		public Function_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterFunction_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitFunction_list(this);
		}
	}

	public final Function_listContext function_list() throws RecognitionException {
		Function_listContext _localctx = new Function_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_list);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TypeInteger:
			case TypeBoolean:
			case TypeVoid:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				function();
				setState(68);
				function_list();
				}
				break;
			case Main:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(calParser.Identifier, 0); }
		public List<TerminalNode> LBR() { return getTokens(calParser.LBR); }
		public TerminalNode LBR(int i) {
			return getToken(calParser.LBR, i);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public List<TerminalNode> RBR() { return getTokens(calParser.RBR); }
		public TerminalNode RBR(int i) {
			return getToken(calParser.RBR, i);
		}
		public TerminalNode Is() { return getToken(calParser.Is, 0); }
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public TerminalNode Begin() { return getToken(calParser.Begin, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode Return() { return getToken(calParser.Return, 0); }
		public TerminalNode SEMI() { return getToken(calParser.SEMI, 0); }
		public TerminalNode End() { return getToken(calParser.End, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			type();
			setState(74);
			match(Identifier);
			setState(75);
			match(LBR);
			setState(76);
			parameter_list();
			setState(77);
			match(RBR);
			setState(78);
			match(Is);
			setState(79);
			decl_list();
			setState(80);
			match(Begin);
			setState(81);
			statement_block();
			setState(82);
			match(Return);
			setState(83);
			match(LBR);
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case True:
			case False:
			case LBR:
			case MINUS:
			case Number:
			case Identifier:
				{
				setState(84);
				expression();
				}
				break;
			case RBR:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(88);
			match(RBR);
			setState(89);
			match(SEMI);
			setState(90);
			match(End);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TypeInteger() { return getToken(calParser.TypeInteger, 0); }
		public TerminalNode TypeBoolean() { return getToken(calParser.TypeBoolean, 0); }
		public TerminalNode TypeVoid() { return getToken(calParser.TypeVoid, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TypeInteger) | (1L << TypeBoolean) | (1L << TypeVoid))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Parameter_listContext extends ParserRuleContext {
		public Nemp_parameter_listContext nemp_parameter_list() {
			return getRuleContext(Nemp_parameter_listContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitParameter_list(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter_list);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				nemp_parameter_list();
				}
				break;
			case RBR:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Nemp_parameter_listContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(calParser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(calParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(calParser.COMMA, 0); }
		public Nemp_parameter_listContext nemp_parameter_list() {
			return getRuleContext(Nemp_parameter_listContext.class,0);
		}
		public Nemp_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemp_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterNemp_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitNemp_parameter_list(this);
		}
	}

	public final Nemp_parameter_listContext nemp_parameter_list() throws RecognitionException {
		Nemp_parameter_listContext _localctx = new Nemp_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nemp_parameter_list);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(Identifier);
				setState(99);
				match(COLON);
				setState(100);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(Identifier);
				setState(102);
				match(COLON);
				setState(103);
				type();
				setState(104);
				match(COMMA);
				setState(105);
				nemp_parameter_list();
				}
				break;
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode Main() { return getToken(calParser.Main, 0); }
		public TerminalNode Begin() { return getToken(calParser.Begin, 0); }
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode End() { return getToken(calParser.End, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(Main);
			setState(110);
			match(Begin);
			setState(111);
			decl_list();
			setState(112);
			statement_block();
			setState(113);
			match(End);
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

	public static class Statement_blockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public Statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterStatement_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitStatement_block(this);
		}
	}

	public final Statement_blockContext statement_block() throws RecognitionException {
		Statement_blockContext _localctx = new Statement_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement_block);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
			case While:
			case Begin:
			case Skipp:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(115);
				statement();
				setState(116);
				statement_block();
				}
				}
				break;
			case Return:
			case End:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(calParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(calParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(calParser.SEMI, 0); }
		public TerminalNode LBR() { return getToken(calParser.LBR, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public TerminalNode RBR() { return getToken(calParser.RBR, 0); }
		public List<TerminalNode> Begin() { return getTokens(calParser.Begin); }
		public TerminalNode Begin(int i) {
			return getToken(calParser.Begin, i);
		}
		public List<Statement_blockContext> statement_block() {
			return getRuleContexts(Statement_blockContext.class);
		}
		public Statement_blockContext statement_block(int i) {
			return getRuleContext(Statement_blockContext.class,i);
		}
		public List<TerminalNode> End() { return getTokens(calParser.End); }
		public TerminalNode End(int i) {
			return getToken(calParser.End, i);
		}
		public TerminalNode If() { return getToken(calParser.If, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode Else() { return getToken(calParser.Else, 0); }
		public TerminalNode While() { return getToken(calParser.While, 0); }
		public TerminalNode Skipp() { return getToken(calParser.Skipp, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(Identifier);
				setState(122);
				match(ASSIGN);
				setState(123);
				expression();
				setState(124);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(Identifier);
				setState(127);
				match(LBR);
				setState(128);
				arg_list();
				setState(129);
				match(RBR);
				setState(130);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(Begin);
				setState(133);
				statement_block();
				setState(134);
				match(End);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				match(If);
				setState(137);
				condition(0);
				setState(138);
				match(Begin);
				setState(139);
				statement_block();
				setState(140);
				match(End);
				setState(141);
				match(Else);
				setState(142);
				match(Begin);
				setState(143);
				statement_block();
				setState(144);
				match(End);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				match(While);
				setState(147);
				condition(0);
				setState(148);
				match(Begin);
				setState(149);
				statement_block();
				setState(150);
				match(End);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				match(Skipp);
				setState(153);
				match(SEMI);
				}
				break;
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<BitContext> bit() {
			return getRuleContexts(BitContext.class);
		}
		public BitContext bit(int i) {
			return getRuleContext(BitContext.class,i);
		}
		public Binary_arith_opContext binary_arith_op() {
			return getRuleContext(Binary_arith_opContext.class,0);
		}
		public TerminalNode LBR() { return getToken(calParser.LBR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBR() { return getToken(calParser.RBR, 0); }
		public TerminalNode Identifier() { return getToken(calParser.Identifier, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				bit();
				setState(157);
				binary_arith_op();
				setState(158);
				bit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(LBR);
				setState(161);
				expression();
				setState(162);
				match(RBR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(Identifier);
				setState(165);
				match(LBR);
				setState(166);
				arg_list();
				setState(167);
				match(RBR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				bit();
				}
				break;
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

	public static class Binary_arith_opContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(calParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(calParser.MINUS, 0); }
		public Binary_arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_arith_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterBinary_arith_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitBinary_arith_op(this);
		}
	}

	public final Binary_arith_opContext binary_arith_op() throws RecognitionException {
		Binary_arith_opContext _localctx = new Binary_arith_opContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_binary_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class BitContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(calParser.Identifier, 0); }
		public TerminalNode MINUS() { return getToken(calParser.MINUS, 0); }
		public TerminalNode Number() { return getToken(calParser.Number, 0); }
		public TerminalNode True() { return getToken(calParser.True, 0); }
		public TerminalNode False() { return getToken(calParser.False, 0); }
		public BitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterBit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitBit(this);
		}
	}

	public final BitContext bit() throws RecognitionException {
		BitContext _localctx = new BitContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bit);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(Identifier);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(MINUS);
				setState(176);
				match(Identifier);
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				match(Number);
				}
				break;
			case True:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				match(True);
				}
				break;
			case False:
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				match(False);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode TILDE() { return getToken(calParser.TILDE, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode LBR() { return getToken(calParser.LBR, 0); }
		public TerminalNode RBR() { return getToken(calParser.RBR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Comp_opContext comp_op() {
			return getRuleContext(Comp_opContext.class,0);
		}
		public TerminalNode OR() { return getToken(calParser.OR, 0); }
		public TerminalNode AND() { return getToken(calParser.AND, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(183);
				match(TILDE);
				setState(184);
				condition(4);
				}
				break;
			case 2:
				{
				setState(185);
				match(LBR);
				setState(186);
				condition(0);
				setState(187);
				match(RBR);
				}
				break;
			case 3:
				{
				setState(189);
				expression();
				setState(190);
				comp_op();
				setState(191);
				expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(195);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(196);
					_la = _input.LA(1);
					if ( !(_la==OR || _la==AND) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(197);
					condition(2);
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(calParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(calParser.NOTEQUAL, 0); }
		public TerminalNode LESS() { return getToken(calParser.LESS, 0); }
		public TerminalNode LESSEQUAL() { return getToken(calParser.LESSEQUAL, 0); }
		public TerminalNode GREATER() { return getToken(calParser.GREATER, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(calParser.GREATEREQUAL, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterComp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitComp_op(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTEQUAL) | (1L << EQUAL) | (1L << LESSEQUAL) | (1L << LESS) | (1L << GREATER) | (1L << GREATEREQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Arg_listContext extends ParserRuleContext {
		public Nemp_arg_listContext nemp_arg_list() {
			return getRuleContext(Nemp_arg_listContext.class,0);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterArg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitArg_list(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arg_list);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				nemp_arg_list();
				}
				break;
			case RBR:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Nemp_arg_listContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(calParser.Identifier, 0); }
		public TerminalNode COMMA() { return getToken(calParser.COMMA, 0); }
		public Nemp_arg_listContext nemp_arg_list() {
			return getRuleContext(Nemp_arg_listContext.class,0);
		}
		public Nemp_arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemp_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterNemp_arg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitNemp_arg_list(this);
		}
	}

	public final Nemp_arg_listContext nemp_arg_list() throws RecognitionException {
		Nemp_arg_listContext _localctx = new Nemp_arg_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nemp_arg_list);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(Identifier);
				setState(211);
				match(COMMA);
				setState(212);
				nemp_arg_list();
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\64\n\3\3\4\3\4\5\48\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\5\7J\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\bY\n\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\5\nc\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13n\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\5\rz\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009d\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00ad\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b7\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c4\n\22"+
		"\3\22\3\22\3\22\7\22\u00c9\n\22\f\22\16\22\u00cc\13\22\3\23\3\23\3\24"+
		"\3\24\5\24\u00d2\n\24\3\25\3\25\3\25\3\25\5\25\u00d8\n\25\3\25\2\3\"\26"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\6\3\2\6\b\3\2\31\32\3"+
		"\2\35\36\4\2\34\34\37#\2\u00dd\2*\3\2\2\2\4\63\3\2\2\2\6\67\3\2\2\2\b"+
		"9\3\2\2\2\n>\3\2\2\2\fI\3\2\2\2\16K\3\2\2\2\20^\3\2\2\2\22b\3\2\2\2\24"+
		"m\3\2\2\2\26o\3\2\2\2\30y\3\2\2\2\32\u009c\3\2\2\2\34\u00ac\3\2\2\2\36"+
		"\u00ae\3\2\2\2 \u00b6\3\2\2\2\"\u00c3\3\2\2\2$\u00cd\3\2\2\2&\u00d1\3"+
		"\2\2\2(\u00d7\3\2\2\2*+\5\4\3\2+,\5\f\7\2,-\5\26\f\2-\3\3\2\2\2./\5\6"+
		"\4\2/\60\7\24\2\2\60\61\5\4\3\2\61\64\3\2\2\2\62\64\3\2\2\2\63.\3\2\2"+
		"\2\63\62\3\2\2\2\64\5\3\2\2\2\658\5\b\5\2\668\5\n\6\2\67\65\3\2\2\2\67"+
		"\66\3\2\2\28\7\3\2\2\29:\7\3\2\2:;\7%\2\2;<\7\25\2\2<=\5\20\t\2=\t\3\2"+
		"\2\2>?\7\4\2\2?@\7%\2\2@A\7\25\2\2AB\5\20\t\2BC\7\26\2\2CD\5\34\17\2D"+
		"\13\3\2\2\2EF\5\16\b\2FG\5\f\7\2GJ\3\2\2\2HJ\3\2\2\2IE\3\2\2\2IH\3\2\2"+
		"\2J\r\3\2\2\2KL\5\20\t\2LM\7%\2\2MN\7\27\2\2NO\5\22\n\2OP\7\30\2\2PQ\7"+
		"\21\2\2QR\5\4\3\2RS\7\17\2\2ST\5\30\r\2TU\7\5\2\2UX\7\27\2\2VY\5\34\17"+
		"\2WY\3\2\2\2XV\3\2\2\2XW\3\2\2\2YZ\3\2\2\2Z[\7\30\2\2[\\\7\24\2\2\\]\7"+
		"\20\2\2]\17\3\2\2\2^_\t\2\2\2_\21\3\2\2\2`c\5\24\13\2ac\3\2\2\2b`\3\2"+
		"\2\2ba\3\2\2\2c\23\3\2\2\2de\7%\2\2ef\7\25\2\2fn\5\20\t\2gh\7%\2\2hi\7"+
		"\25\2\2ij\5\20\t\2jk\7\23\2\2kl\5\24\13\2ln\3\2\2\2md\3\2\2\2mg\3\2\2"+
		"\2n\25\3\2\2\2op\7\t\2\2pq\7\17\2\2qr\5\4\3\2rs\5\30\r\2st\7\20\2\2t\27"+
		"\3\2\2\2uv\5\32\16\2vw\5\30\r\2wz\3\2\2\2xz\3\2\2\2yu\3\2\2\2yx\3\2\2"+
		"\2z\31\3\2\2\2{|\7%\2\2|}\7\26\2\2}~\5\34\17\2~\177\7\24\2\2\177\u009d"+
		"\3\2\2\2\u0080\u0081\7%\2\2\u0081\u0082\7\27\2\2\u0082\u0083\5&\24\2\u0083"+
		"\u0084\7\30\2\2\u0084\u0085\7\24\2\2\u0085\u009d\3\2\2\2\u0086\u0087\7"+
		"\17\2\2\u0087\u0088\5\30\r\2\u0088\u0089\7\20\2\2\u0089\u009d\3\2\2\2"+
		"\u008a\u008b\7\n\2\2\u008b\u008c\5\"\22\2\u008c\u008d\7\17\2\2\u008d\u008e"+
		"\5\30\r\2\u008e\u008f\7\20\2\2\u008f\u0090\7\13\2\2\u0090\u0091\7\17\2"+
		"\2\u0091\u0092\5\30\r\2\u0092\u0093\7\20\2\2\u0093\u009d\3\2\2\2\u0094"+
		"\u0095\7\16\2\2\u0095\u0096\5\"\22\2\u0096\u0097\7\17\2\2\u0097\u0098"+
		"\5\30\r\2\u0098\u0099\7\20\2\2\u0099\u009d\3\2\2\2\u009a\u009b\7\22\2"+
		"\2\u009b\u009d\7\24\2\2\u009c{\3\2\2\2\u009c\u0080\3\2\2\2\u009c\u0086"+
		"\3\2\2\2\u009c\u008a\3\2\2\2\u009c\u0094\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\33\3\2\2\2\u009e\u009f\5 \21\2\u009f\u00a0\5\36\20\2\u00a0\u00a1\5 \21"+
		"\2\u00a1\u00ad\3\2\2\2\u00a2\u00a3\7\27\2\2\u00a3\u00a4\5\34\17\2\u00a4"+
		"\u00a5\7\30\2\2\u00a5\u00ad\3\2\2\2\u00a6\u00a7\7%\2\2\u00a7\u00a8\7\27"+
		"\2\2\u00a8\u00a9\5&\24\2\u00a9\u00aa\7\30\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00ad\5 \21\2\u00ac\u009e\3\2\2\2\u00ac\u00a2\3\2\2\2\u00ac\u00a6\3\2"+
		"\2\2\u00ac\u00ab\3\2\2\2\u00ad\35\3\2\2\2\u00ae\u00af\t\3\2\2\u00af\37"+
		"\3\2\2\2\u00b0\u00b7\7%\2\2\u00b1\u00b2\7\32\2\2\u00b2\u00b7\7%\2\2\u00b3"+
		"\u00b7\7$\2\2\u00b4\u00b7\7\f\2\2\u00b5\u00b7\7\r\2\2\u00b6\u00b0\3\2"+
		"\2\2\u00b6\u00b1\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7!\3\2\2\2\u00b8\u00b9\b\22\1\2\u00b9\u00ba\7\33\2"+
		"\2\u00ba\u00c4\5\"\22\6\u00bb\u00bc\7\27\2\2\u00bc\u00bd\5\"\22\2\u00bd"+
		"\u00be\7\30\2\2\u00be\u00c4\3\2\2\2\u00bf\u00c0\5\34\17\2\u00c0\u00c1"+
		"\5$\23\2\u00c1\u00c2\5\34\17\2\u00c2\u00c4\3\2\2\2\u00c3\u00b8\3\2\2\2"+
		"\u00c3\u00bb\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c4\u00ca\3\2\2\2\u00c5\u00c6"+
		"\f\3\2\2\u00c6\u00c7\t\4\2\2\u00c7\u00c9\5\"\22\4\u00c8\u00c5\3\2\2\2"+
		"\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb#\3"+
		"\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\t\5\2\2\u00ce%\3\2\2\2\u00cf\u00d2"+
		"\5(\25\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2"+
		"\'\3\2\2\2\u00d3\u00d8\7%\2\2\u00d4\u00d5\7%\2\2\u00d5\u00d6\7\23\2\2"+
		"\u00d6\u00d8\5(\25\2\u00d7\u00d3\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d8)\3"+
		"\2\2\2\20\63\67IXbmy\u009c\u00ac\u00b6\u00c3\u00ca\u00d1\u00d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}