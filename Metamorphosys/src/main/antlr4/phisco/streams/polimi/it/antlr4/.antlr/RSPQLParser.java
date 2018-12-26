// Generated from /home/phisco/thesis/thesis/Metamorphosys/src/main/antlr4/phisco/streams/polimi/it/antlr4/RSPQL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RSPQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, NOT=111, DISTINCT=112, REDUCED=113, 
		BOOL=114, STAR=115, UNDEF=116, TYPE=117, COMMENT=118, DURATION=119, IRIREF=120, 
		PNAME_NS=121, PNAME_LN=122, BLANK_NODE_LABEL=123, VAR=124, LANGTAG=125, 
		INTEGER=126, DECIMAL=127, DOUBLE=128, INTEGER_POSITIVE=129, DECIMAL_POSITIVE=130, 
		DOUBLE_POSITIVE=131, INTEGER_NEGATIVE=132, DECIMAL_NEGATIVE=133, DOUBLE_NEGATIVE=134, 
		EXPONENT=135, STRING_LITERAL1=136, STRING_LITERAL2=137, STRING_LITERAL_LONG1=138, 
		STRING_LITERAL_LONG2=139, BINARY_OPERATOR=140, ECHAR=141, NIL=142, WS=143, 
		ANON=144, PN_CHARS_BASE=145, PN_CHARS_U=146, VARNAME=147, PN_CHARS=148, 
		PN_PREFIX=149, PN_LOCAL=150, PLX=151, PERCENT=152, HEX=153, PN_LOCAL_ESC=154, 
		ANYCHAR=155;
	public static final int
		RULE_queryUnit = 0, RULE_query = 1, RULE_prologue = 2, RULE_baseDecl = 3, 
		RULE_prefixDecl = 4, RULE_registerClause = 5, RULE_selectQuery = 6, RULE_selectClause = 7, 
		RULE_selectModifier = 8, RULE_resultVar = 9, RULE_constructQuery = 10, 
		RULE_describeQuery = 11, RULE_askQuery = 12, RULE_datasetClause = 13, 
		RULE_namedGraphClause = 14, RULE_namedWindowClause = 15, RULE_windowDefinition = 16, 
		RULE_physicalWindow = 17, RULE_physicalRange = 18, RULE_physicalStep = 19, 
		RULE_logicalWindow = 20, RULE_logicalRange = 21, RULE_logicalStep = 22, 
		RULE_whereClause = 23, RULE_duration = 24, RULE_solutionModifier = 25, 
		RULE_groupClause = 26, RULE_groupCondition = 27, RULE_havingClause = 28, 
		RULE_havingCondition = 29, RULE_orderClause = 30, RULE_orderCondition = 31, 
		RULE_limitOffsetClauses = 32, RULE_limitClause = 33, RULE_offsetClause = 34, 
		RULE_groupGraphPattern = 35, RULE_graphPatternSub = 36, RULE_triplesSameSubject = 37, 
		RULE_propertyListNotEmpty = 38, RULE_property = 39, RULE_verb = 40, RULE_objectList = 41, 
		RULE_object = 42, RULE_varOrTerm = 43, RULE_blankNodePropertyList = 44, 
		RULE_graphPatternNotTriples = 45, RULE_groupOrUnionGraphPattern = 46, 
		RULE_optionalGraphPattern = 47, RULE_minusGraphPattern = 48, RULE_graphGraphPattern = 49, 
		RULE_windowGraphPattern = 50, RULE_filter = 51, RULE_bindPattern = 52, 
		RULE_varOrIri = 53, RULE_graphTerm = 54, RULE_expression = 55, RULE_conditionalAndExpression = 56, 
		RULE_valueLogical = 57, RULE_relationalExpression = 58, RULE_expressionList = 59, 
		RULE_numericExpression = 60, RULE_multiplicativeExpression = 61, RULE_unaryExpression = 62, 
		RULE_primaryExpression = 63, RULE_brackettedExpression = 64, RULE_builtInCall = 65, 
		RULE_rdfliteral = 66, RULE_numericLiteral = 67, RULE_numericLiteralUnsigned = 68, 
		RULE_numericLiteralPositive = 69, RULE_numericLiteralNegative = 70, RULE_argList = 71, 
		RULE_constraint = 72, RULE_aggregate = 73, RULE_unaryBuiltin = 74, RULE_binaryBuiltin = 75, 
		RULE_ternaryBuiltin = 76, RULE_ternaryOrBinaryBuiltin = 77, RULE_strReplaceExpression = 78, 
		RULE_boundExpression = 79, RULE_existsFunc = 80, RULE_string = 81, RULE_iri = 82, 
		RULE_prefixedName = 83, RULE_blankNode = 84;
	public static final String[] ruleNames = {
		"queryUnit", "query", "prologue", "baseDecl", "prefixDecl", "registerClause", 
		"selectQuery", "selectClause", "selectModifier", "resultVar", "constructQuery", 
		"describeQuery", "askQuery", "datasetClause", "namedGraphClause", "namedWindowClause", 
		"windowDefinition", "physicalWindow", "physicalRange", "physicalStep", 
		"logicalWindow", "logicalRange", "logicalStep", "whereClause", "duration", 
		"solutionModifier", "groupClause", "groupCondition", "havingClause", "havingCondition", 
		"orderClause", "orderCondition", "limitOffsetClauses", "limitClause", 
		"offsetClause", "groupGraphPattern", "graphPatternSub", "triplesSameSubject", 
		"propertyListNotEmpty", "property", "verb", "objectList", "object", "varOrTerm", 
		"blankNodePropertyList", "graphPatternNotTriples", "groupOrUnionGraphPattern", 
		"optionalGraphPattern", "minusGraphPattern", "graphGraphPattern", "windowGraphPattern", 
		"filter", "bindPattern", "varOrIri", "graphTerm", "expression", "conditionalAndExpression", 
		"valueLogical", "relationalExpression", "expressionList", "numericExpression", 
		"multiplicativeExpression", "unaryExpression", "primaryExpression", "brackettedExpression", 
		"builtInCall", "rdfliteral", "numericLiteral", "numericLiteralUnsigned", 
		"numericLiteralPositive", "numericLiteralNegative", "argList", "constraint", 
		"aggregate", "unaryBuiltin", "binaryBuiltin", "ternaryBuiltin", "ternaryOrBinaryBuiltin", 
		"strReplaceExpression", "boundExpression", "existsFunc", "string", "iri", 
		"prefixedName", "blankNode"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'BASE'", "'PREFIX'", "'REGISTER'", "'ISTREAM'", "'RSTREAM'", "'DSTREAM'", 
		"'AS'", "'SELECT'", "'('", "')'", "'CONSTRUCT'", "'{'", "'.'", "'}'", 
		"'DESCRIBE'", "'ASK'", "'FROM'", "'NAMED'", "'WINDOW'", "'ON'", "'['", 
		"']'", "'ELEMENTS'", "'STEP'", "'RANGE'", "'WHERE'", "'GROUP'", "'BY'", 
		"'HAVING'", "'ORDER'", "'ASC'", "'DESC'", "'LIMIT'", "'OFFSET'", "';'", 
		"','", "'UNION'", "'OPTIONAL'", "'MINUS'", "'GRAPH'", "'FILTER'", "'BIND'", 
		"'||'", "'&&'", "'IN'", "'+'", "'-'", "'/'", "'!'", "'^^'", "'COUNT'", 
		"'SUM'", "'MIN'", "'MAX'", "'AVG'", "'SAMPLE'", "'GROUP_CONCAT'", "'SEPARATOR'", 
		"'='", "'STR'", "'LANG'", "'DATATYPE'", "'IRI'", "'URI'", "'ABS'", "'CEIL'", 
		"'FLOOR'", "'ROUND'", "'UCASE'", "'LCASE'", "'YEAR'", "'MONTH'", "'DAY'", 
		"'HOURS'", "'MINUTES'", "'SECONDS'", "'TIMEZONE'", "'TZ'", "'MD5'", "'SHA1'", 
		"'SHA256'", "'SHA384'", "'SHA512'", "'ISIRI'", "'ISURI'", "'ISBLANK'", 
		"'ISLITERAL'", "'ISNUMERIC'", "'STRLEN'", "'ENCODE_FOR_URI'", "'BNODE'", 
		"'NOW'", "'UUID'", "'STRUUID'", "'RAND'", "'CONTAINS'", "'STRSTARTS'", 
		"'STRENDS'", "'STRBEFORE'", "'STRAFTER'", "'STRLANG'", "'STRDT'", "'SAMETERM'", 
		"'LANGMATCHES'", "'IF'", "'REGEX'", "'SUBSTR'", "'REPLACE'", "'BOUND'", 
		"'EXISTS'", "'NOT'", "'DISTINCT'", "'REDUCED'", null, "'*'", "'UNDEF'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "NOT", "DISTINCT", "REDUCED", "BOOL", "STAR", "UNDEF", 
		"TYPE", "COMMENT", "DURATION", "IRIREF", "PNAME_NS", "PNAME_LN", "BLANK_NODE_LABEL", 
		"VAR", "LANGTAG", "INTEGER", "DECIMAL", "DOUBLE", "INTEGER_POSITIVE", 
		"DECIMAL_POSITIVE", "DOUBLE_POSITIVE", "INTEGER_NEGATIVE", "DECIMAL_NEGATIVE", 
		"DOUBLE_NEGATIVE", "EXPONENT", "STRING_LITERAL1", "STRING_LITERAL2", "STRING_LITERAL_LONG1", 
		"STRING_LITERAL_LONG2", "BINARY_OPERATOR", "ECHAR", "NIL", "WS", "ANON", 
		"PN_CHARS_BASE", "PN_CHARS_U", "VARNAME", "PN_CHARS", "PN_PREFIX", "PN_LOCAL", 
		"PLX", "PERCENT", "HEX", "PN_LOCAL_ESC", "ANYCHAR"
	};
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
	public String getGrammarFileName() { return "RSPQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RSPQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryUnitContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public QueryUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryUnit; }
	}

	public final QueryUnitContext queryUnit() throws RecognitionException {
		QueryUnitContext _localctx = new QueryUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_queryUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			query();
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

	public static class QueryContext extends ParserRuleContext {
		public PrologueContext prologue() {
			return getRuleContext(PrologueContext.class,0);
		}
		public SelectQueryContext selectQuery() {
			return getRuleContext(SelectQueryContext.class,0);
		}
		public ConstructQueryContext constructQuery() {
			return getRuleContext(ConstructQueryContext.class,0);
		}
		public DescribeQueryContext describeQuery() {
			return getRuleContext(DescribeQueryContext.class,0);
		}
		public AskQueryContext askQuery() {
			return getRuleContext(AskQueryContext.class,0);
		}
		public RegisterClauseContext registerClause() {
			return getRuleContext(RegisterClauseContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			prologue();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(173);
				registerClause();
				}
			}

			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(176);
				selectQuery();
				}
				break;
			case T__10:
				{
				setState(177);
				constructQuery();
				}
				break;
			case T__14:
				{
				setState(178);
				describeQuery();
				}
				break;
			case T__15:
				{
				setState(179);
				askQuery();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PrologueContext extends ParserRuleContext {
		public List<BaseDeclContext> baseDecl() {
			return getRuleContexts(BaseDeclContext.class);
		}
		public BaseDeclContext baseDecl(int i) {
			return getRuleContext(BaseDeclContext.class,i);
		}
		public List<PrefixDeclContext> prefixDecl() {
			return getRuleContexts(PrefixDeclContext.class);
		}
		public PrefixDeclContext prefixDecl(int i) {
			return getRuleContext(PrefixDeclContext.class,i);
		}
		public PrologueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prologue; }
	}

	public final PrologueContext prologue() throws RecognitionException {
		PrologueContext _localctx = new PrologueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prologue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				setState(184);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(182);
					baseDecl();
					}
					break;
				case T__1:
					{
					setState(183);
					prefixDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class BaseDeclContext extends ParserRuleContext {
		public TerminalNode IRIREF() { return getToken(RSPQLParser.IRIREF, 0); }
		public BaseDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseDecl; }
	}

	public final BaseDeclContext baseDecl() throws RecognitionException {
		BaseDeclContext _localctx = new BaseDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_baseDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__0);
			setState(190);
			match(IRIREF);
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

	public static class PrefixDeclContext extends ParserRuleContext {
		public TerminalNode PNAME_NS() { return getToken(RSPQLParser.PNAME_NS, 0); }
		public TerminalNode IRIREF() { return getToken(RSPQLParser.IRIREF, 0); }
		public PrefixDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixDecl; }
	}

	public final PrefixDeclContext prefixDecl() throws RecognitionException {
		PrefixDeclContext _localctx = new PrefixDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_prefixDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__1);
			setState(193);
			match(PNAME_NS);
			setState(194);
			match(IRIREF);
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

	public static class RegisterClauseContext extends ParserRuleContext {
		public Token streamType;
		public IriContext outputStream;
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public RegisterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registerClause; }
	}

	public final RegisterClauseContext registerClause() throws RecognitionException {
		RegisterClauseContext _localctx = new RegisterClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_registerClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__2);
			setState(197);
			((RegisterClauseContext)_localctx).streamType = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
				((RegisterClauseContext)_localctx).streamType = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(198);
			((RegisterClauseContext)_localctx).outputStream = iri();
			setState(199);
			match(T__6);
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

	public static class SelectQueryContext extends ParserRuleContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public List<DatasetClauseContext> datasetClause() {
			return getRuleContexts(DatasetClauseContext.class);
		}
		public DatasetClauseContext datasetClause(int i) {
			return getRuleContext(DatasetClauseContext.class,i);
		}
		public SolutionModifierContext solutionModifier() {
			return getRuleContext(SolutionModifierContext.class,0);
		}
		public SelectQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectQuery; }
	}

	public final SelectQueryContext selectQuery() throws RecognitionException {
		SelectQueryContext _localctx = new SelectQueryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selectQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			selectClause();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(202);
				datasetClause();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			whereClause();
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(209);
				solutionModifier();
				}
				break;
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

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(RSPQLParser.STAR, 0); }
		public SelectModifierContext selectModifier() {
			return getRuleContext(SelectModifierContext.class,0);
		}
		public List<ResultVarContext> resultVar() {
			return getRuleContexts(ResultVarContext.class);
		}
		public ResultVarContext resultVar(int i) {
			return getRuleContext(ResultVarContext.class,i);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__7);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==REDUCED) {
				{
				setState(213);
				selectModifier();
				}
			}

			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case VAR:
				{
				setState(217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(216);
					resultVar();
					}
					}
					setState(219); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__8 || _la==VAR );
				}
				break;
			case STAR:
				{
				setState(221);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SelectModifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(RSPQLParser.DISTINCT, 0); }
		public TerminalNode REDUCED() { return getToken(RSPQLParser.REDUCED, 0); }
		public SelectModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectModifier; }
	}

	public final SelectModifierContext selectModifier() throws RecognitionException {
		SelectModifierContext _localctx = new SelectModifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_selectModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_la = _input.LA(1);
			if ( !(_la==DISTINCT || _la==REDUCED) ) {
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

	public static class ResultVarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(RSPQLParser.VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ResultVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultVar; }
	}

	public final ResultVarContext resultVar() throws RecognitionException {
		ResultVarContext _localctx = new ResultVarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_resultVar);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(VAR);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(227);
				match(T__8);
				setState(228);
				expression();
				setState(229);
				match(T__6);
				setState(230);
				match(VAR);
				setState(231);
				match(T__9);
				}
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

	public static class ConstructQueryContext extends ParserRuleContext {
		public TriplesSameSubjectContext triplesSameSubject() {
			return getRuleContext(TriplesSameSubjectContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SolutionModifierContext solutionModifier() {
			return getRuleContext(SolutionModifierContext.class,0);
		}
		public List<DatasetClauseContext> datasetClause() {
			return getRuleContexts(DatasetClauseContext.class);
		}
		public DatasetClauseContext datasetClause(int i) {
			return getRuleContext(DatasetClauseContext.class,i);
		}
		public ConstructQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructQuery; }
	}

	public final ConstructQueryContext constructQuery() throws RecognitionException {
		ConstructQueryContext _localctx = new ConstructQueryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constructQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__10);
			setState(236);
			match(T__11);
			setState(237);
			triplesSameSubject();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(238);
				match(T__12);
				}
			}

			setState(241);
			match(T__13);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(242);
				datasetClause();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			whereClause();
			setState(249);
			solutionModifier();
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

	public static class DescribeQueryContext extends ParserRuleContext {
		public SolutionModifierContext solutionModifier() {
			return getRuleContext(SolutionModifierContext.class,0);
		}
		public TerminalNode STAR() { return getToken(RSPQLParser.STAR, 0); }
		public List<DatasetClauseContext> datasetClause() {
			return getRuleContexts(DatasetClauseContext.class);
		}
		public DatasetClauseContext datasetClause(int i) {
			return getRuleContext(DatasetClauseContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public List<VarOrIriContext> varOrIri() {
			return getRuleContexts(VarOrIriContext.class);
		}
		public VarOrIriContext varOrIri(int i) {
			return getRuleContext(VarOrIriContext.class,i);
		}
		public DescribeQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeQuery; }
	}

	public final DescribeQueryContext describeQuery() throws RecognitionException {
		DescribeQueryContext _localctx = new DescribeQueryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_describeQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__14);
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case VAR:
				{
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(252);
					varOrIri();
					}
					}
					setState(255); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & ((1L << (IRIREF - 120)) | (1L << (PNAME_NS - 120)) | (1L << (PNAME_LN - 120)) | (1L << (VAR - 120)))) != 0) );
				}
				break;
			case STAR:
				{
				setState(257);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(260);
				datasetClause();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(266);
				whereClause();
				}
			}

			setState(269);
			solutionModifier();
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

	public static class AskQueryContext extends ParserRuleContext {
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SolutionModifierContext solutionModifier() {
			return getRuleContext(SolutionModifierContext.class,0);
		}
		public List<DatasetClauseContext> datasetClause() {
			return getRuleContexts(DatasetClauseContext.class);
		}
		public DatasetClauseContext datasetClause(int i) {
			return getRuleContext(DatasetClauseContext.class,i);
		}
		public AskQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_askQuery; }
	}

	public final AskQueryContext askQuery() throws RecognitionException {
		AskQueryContext _localctx = new AskQueryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_askQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__15);
			setState(273); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(272);
				datasetClause();
				}
				}
				setState(275); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__16 );
			setState(277);
			whereClause();
			setState(278);
			solutionModifier();
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

	public static class DatasetClauseContext extends ParserRuleContext {
		public IriContext anonymousGraph;
		public NamedGraphClauseContext namedGraphClause() {
			return getRuleContext(NamedGraphClauseContext.class,0);
		}
		public NamedWindowClauseContext namedWindowClause() {
			return getRuleContext(NamedWindowClauseContext.class,0);
		}
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public DatasetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datasetClause; }
	}

	public final DatasetClauseContext datasetClause() throws RecognitionException {
		DatasetClauseContext _localctx = new DatasetClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_datasetClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__16);
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(281);
				((DatasetClauseContext)_localctx).anonymousGraph = iri();
				}
				break;
			case 2:
				{
				setState(282);
				namedGraphClause();
				}
				break;
			case 3:
				{
				setState(283);
				namedWindowClause();
				}
				break;
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

	public static class NamedGraphClauseContext extends ParserRuleContext {
		public IriContext graphIRI;
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public NamedGraphClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedGraphClause; }
	}

	public final NamedGraphClauseContext namedGraphClause() throws RecognitionException {
		NamedGraphClauseContext _localctx = new NamedGraphClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_namedGraphClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__17);
			setState(287);
			((NamedGraphClauseContext)_localctx).graphIRI = iri();
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

	public static class NamedWindowClauseContext extends ParserRuleContext {
		public IriContext windowIRI;
		public IriContext streamIRI;
		public WindowDefinitionContext windowDefinition() {
			return getRuleContext(WindowDefinitionContext.class,0);
		}
		public List<IriContext> iri() {
			return getRuleContexts(IriContext.class);
		}
		public IriContext iri(int i) {
			return getRuleContext(IriContext.class,i);
		}
		public NamedWindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindowClause; }
	}

	public final NamedWindowClauseContext namedWindowClause() throws RecognitionException {
		NamedWindowClauseContext _localctx = new NamedWindowClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_namedWindowClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(T__17);
			setState(290);
			match(T__18);
			setState(291);
			((NamedWindowClauseContext)_localctx).windowIRI = iri();
			setState(292);
			match(T__19);
			setState(293);
			((NamedWindowClauseContext)_localctx).streamIRI = iri();
			setState(294);
			match(T__20);
			setState(295);
			windowDefinition();
			setState(296);
			match(T__21);
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

	public static class WindowDefinitionContext extends ParserRuleContext {
		public PhysicalWindowContext physicalWindow() {
			return getRuleContext(PhysicalWindowContext.class,0);
		}
		public LogicalWindowContext logicalWindow() {
			return getRuleContext(LogicalWindowContext.class,0);
		}
		public WindowDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowDefinition; }
	}

	public final WindowDefinitionContext windowDefinition() throws RecognitionException {
		WindowDefinitionContext _localctx = new WindowDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_windowDefinition);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				physicalWindow();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				logicalWindow();
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

	public static class PhysicalWindowContext extends ParserRuleContext {
		public PhysicalRangeContext physicalRange() {
			return getRuleContext(PhysicalRangeContext.class,0);
		}
		public PhysicalStepContext physicalStep() {
			return getRuleContext(PhysicalStepContext.class,0);
		}
		public PhysicalWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_physicalWindow; }
	}

	public final PhysicalWindowContext physicalWindow() throws RecognitionException {
		PhysicalWindowContext _localctx = new PhysicalWindowContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_physicalWindow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			physicalRange();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(303);
				physicalStep();
				}
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

	public static class PhysicalRangeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(RSPQLParser.INTEGER, 0); }
		public PhysicalRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_physicalRange; }
	}

	public final PhysicalRangeContext physicalRange() throws RecognitionException {
		PhysicalRangeContext _localctx = new PhysicalRangeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_physicalRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(T__22);
			setState(307);
			match(INTEGER);
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

	public static class PhysicalStepContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(RSPQLParser.INTEGER, 0); }
		public PhysicalStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_physicalStep; }
	}

	public final PhysicalStepContext physicalStep() throws RecognitionException {
		PhysicalStepContext _localctx = new PhysicalStepContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_physicalStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(T__23);
			setState(310);
			match(INTEGER);
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

	public static class LogicalWindowContext extends ParserRuleContext {
		public LogicalRangeContext logicalRange() {
			return getRuleContext(LogicalRangeContext.class,0);
		}
		public LogicalStepContext logicalStep() {
			return getRuleContext(LogicalStepContext.class,0);
		}
		public LogicalWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalWindow; }
	}

	public final LogicalWindowContext logicalWindow() throws RecognitionException {
		LogicalWindowContext _localctx = new LogicalWindowContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logicalWindow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			logicalRange();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(313);
				logicalStep();
				}
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

	public static class LogicalRangeContext extends ParserRuleContext {
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public LogicalRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalRange; }
	}

	public final LogicalRangeContext logicalRange() throws RecognitionException {
		LogicalRangeContext _localctx = new LogicalRangeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_logicalRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(T__24);
			setState(317);
			duration();
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

	public static class LogicalStepContext extends ParserRuleContext {
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public LogicalStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalStep; }
	}

	public final LogicalStepContext logicalStep() throws RecognitionException {
		LogicalStepContext _localctx = new LogicalStepContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_logicalStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(T__23);
			setState(320);
			duration();
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

	public static class WhereClauseContext extends ParserRuleContext {
		public GroupGraphPatternContext groupGraphPattern() {
			return getRuleContext(GroupGraphPatternContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(T__25);
			setState(323);
			groupGraphPattern();
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

	public static class DurationContext extends ParserRuleContext {
		public TerminalNode DURATION() { return getToken(RSPQLParser.DURATION, 0); }
		public DurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duration; }
	}

	public final DurationContext duration() throws RecognitionException {
		DurationContext _localctx = new DurationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_duration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(DURATION);
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

	public static class SolutionModifierContext extends ParserRuleContext {
		public GroupClauseContext groupClause() {
			return getRuleContext(GroupClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderClauseContext orderClause() {
			return getRuleContext(OrderClauseContext.class,0);
		}
		public LimitOffsetClausesContext limitOffsetClauses() {
			return getRuleContext(LimitOffsetClausesContext.class,0);
		}
		public SolutionModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solutionModifier; }
	}

	public final SolutionModifierContext solutionModifier() throws RecognitionException {
		SolutionModifierContext _localctx = new SolutionModifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_solutionModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(327);
				groupClause();
				}
			}

			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(330);
				havingClause();
				}
			}

			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(333);
				orderClause();
				}
			}

			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__32 || _la==T__33) {
				{
				setState(336);
				limitOffsetClauses();
				}
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

	public static class GroupClauseContext extends ParserRuleContext {
		public List<GroupConditionContext> groupCondition() {
			return getRuleContexts(GroupConditionContext.class);
		}
		public GroupConditionContext groupCondition(int i) {
			return getRuleContext(GroupConditionContext.class,i);
		}
		public GroupClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupClause; }
	}

	public final GroupClauseContext groupClause() throws RecognitionException {
		GroupClauseContext _localctx = new GroupClauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_groupClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(T__26);
			setState(340);
			match(T__27);
			setState(342); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(341);
				groupCondition();
				}
				}
				setState(344); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (NOT - 64)) | (1L << (VAR - 64)))) != 0) );
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

	public static class GroupConditionContext extends ParserRuleContext {
		public BuiltInCallContext builtInCall() {
			return getRuleContext(BuiltInCallContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VAR() { return getToken(RSPQLParser.VAR, 0); }
		public GroupConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupCondition; }
	}

	public final GroupConditionContext groupCondition() throws RecognitionException {
		GroupConditionContext _localctx = new GroupConditionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_groupCondition);
		int _la;
		try {
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case T__103:
			case T__104:
			case T__105:
			case T__106:
			case T__107:
			case T__108:
			case T__109:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				builtInCall();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(T__8);
				setState(348);
				expression();
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(349);
					match(T__6);
					setState(350);
					match(VAR);
					}
				}

				setState(353);
				match(T__9);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				match(VAR);
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

	public static class HavingClauseContext extends ParserRuleContext {
		public List<HavingConditionContext> havingCondition() {
			return getRuleContexts(HavingConditionContext.class);
		}
		public HavingConditionContext havingCondition(int i) {
			return getRuleContext(HavingConditionContext.class,i);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_havingClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(T__28);
			setState(360); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(359);
				havingCondition();
				}
				}
				setState(362); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (NOT - 64)))) != 0) );
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

	public static class HavingConditionContext extends ParserRuleContext {
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public HavingConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingCondition; }
	}

	public final HavingConditionContext havingCondition() throws RecognitionException {
		HavingConditionContext _localctx = new HavingConditionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_havingCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			constraint();
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

	public static class OrderClauseContext extends ParserRuleContext {
		public List<OrderConditionContext> orderCondition() {
			return getRuleContexts(OrderConditionContext.class);
		}
		public OrderConditionContext orderCondition(int i) {
			return getRuleContext(OrderConditionContext.class,i);
		}
		public OrderClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderClause; }
	}

	public final OrderClauseContext orderClause() throws RecognitionException {
		OrderClauseContext _localctx = new OrderClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_orderClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(T__29);
			setState(367);
			match(T__27);
			setState(369); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(368);
				orderCondition();
				}
				}
				setState(371); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__30) | (1L << T__31) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (NOT - 64)) | (1L << (VAR - 64)))) != 0) );
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

	public static class OrderConditionContext extends ParserRuleContext {
		public BrackettedExpressionContext brackettedExpression() {
			return getRuleContext(BrackettedExpressionContext.class,0);
		}
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public TerminalNode VAR() { return getToken(RSPQLParser.VAR, 0); }
		public OrderConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderCondition; }
	}

	public final OrderConditionContext orderCondition() throws RecognitionException {
		OrderConditionContext _localctx = new OrderConditionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_orderCondition);
		int _la;
		try {
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(373);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__31) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(374);
				brackettedExpression();
				}
				}
				break;
			case T__8:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case T__103:
			case T__104:
			case T__105:
			case T__106:
			case T__107:
			case T__108:
			case T__109:
			case NOT:
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
				case T__54:
				case T__55:
				case T__56:
				case T__59:
				case T__60:
				case T__61:
				case T__62:
				case T__63:
				case T__64:
				case T__65:
				case T__66:
				case T__67:
				case T__68:
				case T__69:
				case T__70:
				case T__71:
				case T__72:
				case T__73:
				case T__74:
				case T__75:
				case T__76:
				case T__77:
				case T__78:
				case T__79:
				case T__80:
				case T__81:
				case T__82:
				case T__83:
				case T__84:
				case T__85:
				case T__86:
				case T__87:
				case T__88:
				case T__89:
				case T__90:
				case T__91:
				case T__92:
				case T__93:
				case T__94:
				case T__95:
				case T__96:
				case T__97:
				case T__98:
				case T__99:
				case T__100:
				case T__101:
				case T__102:
				case T__103:
				case T__104:
				case T__105:
				case T__106:
				case T__107:
				case T__108:
				case T__109:
				case NOT:
					{
					setState(375);
					constraint();
					}
					break;
				case VAR:
					{
					setState(376);
					match(VAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class LimitOffsetClausesContext extends ParserRuleContext {
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public OffsetClauseContext offsetClause() {
			return getRuleContext(OffsetClauseContext.class,0);
		}
		public LimitOffsetClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitOffsetClauses; }
	}

	public final LimitOffsetClausesContext limitOffsetClauses() throws RecognitionException {
		LimitOffsetClausesContext _localctx = new LimitOffsetClausesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_limitOffsetClauses);
		int _la;
		try {
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				limitClause();
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__33) {
					{
					setState(382);
					offsetClause();
					}
				}

				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				offsetClause();
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__32) {
					{
					setState(386);
					limitClause();
					}
				}

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

	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(RSPQLParser.INTEGER, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(T__32);
			setState(392);
			match(INTEGER);
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

	public static class OffsetClauseContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(RSPQLParser.INTEGER, 0); }
		public OffsetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offsetClause; }
	}

	public final OffsetClauseContext offsetClause() throws RecognitionException {
		OffsetClauseContext _localctx = new OffsetClauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_offsetClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(T__33);
			setState(395);
			match(INTEGER);
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

	public static class GroupGraphPatternContext extends ParserRuleContext {
		public List<GraphPatternSubContext> graphPatternSub() {
			return getRuleContexts(GraphPatternSubContext.class);
		}
		public GraphPatternSubContext graphPatternSub(int i) {
			return getRuleContext(GraphPatternSubContext.class,i);
		}
		public GroupGraphPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupGraphPattern; }
	}

	public final GroupGraphPatternContext groupGraphPattern() throws RecognitionException {
		GroupGraphPatternContext _localctx = new GroupGraphPatternContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_groupGraphPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(T__11);
			setState(399); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(398);
				graphPatternSub();
				}
				}
				setState(401); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__18) | (1L << T__20) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (BOOL - 114)) | (1L << (IRIREF - 114)) | (1L << (PNAME_NS - 114)) | (1L << (PNAME_LN - 114)) | (1L << (BLANK_NODE_LABEL - 114)) | (1L << (VAR - 114)) | (1L << (INTEGER - 114)) | (1L << (DECIMAL - 114)) | (1L << (DOUBLE - 114)) | (1L << (INTEGER_POSITIVE - 114)) | (1L << (DECIMAL_POSITIVE - 114)) | (1L << (DOUBLE_POSITIVE - 114)) | (1L << (INTEGER_NEGATIVE - 114)) | (1L << (DECIMAL_NEGATIVE - 114)) | (1L << (DOUBLE_NEGATIVE - 114)) | (1L << (STRING_LITERAL1 - 114)) | (1L << (STRING_LITERAL2 - 114)) | (1L << (STRING_LITERAL_LONG1 - 114)) | (1L << (STRING_LITERAL_LONG2 - 114)) | (1L << (NIL - 114)) | (1L << (ANON - 114)))) != 0) );
			setState(403);
			match(T__13);
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

	public static class GraphPatternSubContext extends ParserRuleContext {
		public TriplesSameSubjectContext triplesSameSubject() {
			return getRuleContext(TriplesSameSubjectContext.class,0);
		}
		public GraphPatternNotTriplesContext graphPatternNotTriples() {
			return getRuleContext(GraphPatternNotTriplesContext.class,0);
		}
		public GraphPatternSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphPatternSub; }
	}

	public final GraphPatternSubContext graphPatternSub() throws RecognitionException {
		GraphPatternSubContext _localctx = new GraphPatternSubContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_graphPatternSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
			case BOOL:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
			case VAR:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
			case NIL:
			case ANON:
				{
				setState(405);
				triplesSameSubject();
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(406);
					match(T__12);
					}
				}

				}
				break;
			case T__11:
			case T__18:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
				{
				setState(409);
				graphPatternNotTriples();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TriplesSameSubjectContext extends ParserRuleContext {
		public VarOrTermContext varOrTerm() {
			return getRuleContext(VarOrTermContext.class,0);
		}
		public PropertyListNotEmptyContext propertyListNotEmpty() {
			return getRuleContext(PropertyListNotEmptyContext.class,0);
		}
		public BlankNodePropertyListContext blankNodePropertyList() {
			return getRuleContext(BlankNodePropertyListContext.class,0);
		}
		public TriplesSameSubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triplesSameSubject; }
	}

	public final TriplesSameSubjectContext triplesSameSubject() throws RecognitionException {
		TriplesSameSubjectContext _localctx = new TriplesSameSubjectContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_triplesSameSubject);
		try {
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
			case VAR:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
			case NIL:
			case ANON:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				varOrTerm();
				setState(413);
				propertyListNotEmpty();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				blankNodePropertyList();
				setState(417);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(416);
					propertyListNotEmpty();
					}
					break;
				}
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

	public static class PropertyListNotEmptyContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public PropertyListNotEmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyListNotEmpty; }
	}

	public final PropertyListNotEmptyContext propertyListNotEmpty() throws RecognitionException {
		PropertyListNotEmptyContext _localctx = new PropertyListNotEmptyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_propertyListNotEmpty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			property();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__34) {
				{
				{
				setState(422);
				match(T__34);
				setState(424);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(423);
					property();
					}
					break;
				}
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PropertyContext extends ParserRuleContext {
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public ObjectListContext objectList() {
			return getRuleContext(ObjectListContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			verb();
			setState(432);
			objectList();
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

	public static class VerbContext extends ParserRuleContext {
		public VarOrIriContext varOrIri() {
			return getRuleContext(VarOrIriContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(RSPQLParser.TYPE, 0); }
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_verb);
		try {
			setState(436);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				varOrIri();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				match(TYPE);
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

	public static class ObjectListContext extends ParserRuleContext {
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public ObjectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectList; }
	}

	public final ObjectListContext objectList() throws RecognitionException {
		ObjectListContext _localctx = new ObjectListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_objectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			object();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35) {
				{
				{
				setState(439);
				match(T__35);
				setState(440);
				object();
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ObjectContext extends ParserRuleContext {
		public VarOrTermContext varOrTerm() {
			return getRuleContext(VarOrTermContext.class,0);
		}
		public BlankNodePropertyListContext blankNodePropertyList() {
			return getRuleContext(BlankNodePropertyListContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_object);
		try {
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
			case VAR:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
			case NIL:
			case ANON:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				varOrTerm();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				blankNodePropertyList();
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

	public static class VarOrTermContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(RSPQLParser.VAR, 0); }
		public GraphTermContext graphTerm() {
			return getRuleContext(GraphTermContext.class,0);
		}
		public VarOrTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varOrTerm; }
	}

	public final VarOrTermContext varOrTerm() throws RecognitionException {
		VarOrTermContext _localctx = new VarOrTermContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_varOrTerm);
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				match(VAR);
				}
				break;
			case BOOL:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
			case NIL:
			case ANON:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				graphTerm();
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

	public static class BlankNodePropertyListContext extends ParserRuleContext {
		public PropertyListNotEmptyContext propertyListNotEmpty() {
			return getRuleContext(PropertyListNotEmptyContext.class,0);
		}
		public BlankNodePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blankNodePropertyList; }
	}

	public final BlankNodePropertyListContext blankNodePropertyList() throws RecognitionException {
		BlankNodePropertyListContext _localctx = new BlankNodePropertyListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_blankNodePropertyList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(T__20);
			setState(455);
			propertyListNotEmpty();
			setState(456);
			match(T__21);
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

	public static class GraphPatternNotTriplesContext extends ParserRuleContext {
		public GroupOrUnionGraphPatternContext groupOrUnionGraphPattern() {
			return getRuleContext(GroupOrUnionGraphPatternContext.class,0);
		}
		public OptionalGraphPatternContext optionalGraphPattern() {
			return getRuleContext(OptionalGraphPatternContext.class,0);
		}
		public MinusGraphPatternContext minusGraphPattern() {
			return getRuleContext(MinusGraphPatternContext.class,0);
		}
		public GraphGraphPatternContext graphGraphPattern() {
			return getRuleContext(GraphGraphPatternContext.class,0);
		}
		public WindowGraphPatternContext windowGraphPattern() {
			return getRuleContext(WindowGraphPatternContext.class,0);
		}
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public BindPatternContext bindPattern() {
			return getRuleContext(BindPatternContext.class,0);
		}
		public GraphPatternNotTriplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphPatternNotTriples; }
	}

	public final GraphPatternNotTriplesContext graphPatternNotTriples() throws RecognitionException {
		GraphPatternNotTriplesContext _localctx = new GraphPatternNotTriplesContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_graphPatternNotTriples);
		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				groupOrUnionGraphPattern();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				optionalGraphPattern();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 3);
				{
				setState(460);
				minusGraphPattern();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 4);
				{
				setState(461);
				graphGraphPattern();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(462);
				windowGraphPattern();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 6);
				{
				setState(463);
				filter();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 7);
				{
				setState(464);
				bindPattern();
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

	public static class GroupOrUnionGraphPatternContext extends ParserRuleContext {
		public List<GroupGraphPatternContext> groupGraphPattern() {
			return getRuleContexts(GroupGraphPatternContext.class);
		}
		public GroupGraphPatternContext groupGraphPattern(int i) {
			return getRuleContext(GroupGraphPatternContext.class,i);
		}
		public GroupOrUnionGraphPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupOrUnionGraphPattern; }
	}

	public final GroupOrUnionGraphPatternContext groupOrUnionGraphPattern() throws RecognitionException {
		GroupOrUnionGraphPatternContext _localctx = new GroupOrUnionGraphPatternContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_groupOrUnionGraphPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			groupGraphPattern();
			setState(470); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(468);
				match(T__36);
				setState(469);
				groupGraphPattern();
				}
				}
				setState(472); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__36 );
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

	public static class OptionalGraphPatternContext extends ParserRuleContext {
		public GroupGraphPatternContext groupGraphPattern() {
			return getRuleContext(GroupGraphPatternContext.class,0);
		}
		public OptionalGraphPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalGraphPattern; }
	}

	public final OptionalGraphPatternContext optionalGraphPattern() throws RecognitionException {
		OptionalGraphPatternContext _localctx = new OptionalGraphPatternContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_optionalGraphPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(T__37);
			setState(475);
			groupGraphPattern();
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

	public static class MinusGraphPatternContext extends ParserRuleContext {
		public GroupGraphPatternContext groupGraphPattern() {
			return getRuleContext(GroupGraphPatternContext.class,0);
		}
		public MinusGraphPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minusGraphPattern; }
	}

	public final MinusGraphPatternContext minusGraphPattern() throws RecognitionException {
		MinusGraphPatternContext _localctx = new MinusGraphPatternContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_minusGraphPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(T__38);
			setState(478);
			groupGraphPattern();
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

	public static class GraphGraphPatternContext extends ParserRuleContext {
		public VarOrIriContext varOrIri() {
			return getRuleContext(VarOrIriContext.class,0);
		}
		public GroupGraphPatternContext groupGraphPattern() {
			return getRuleContext(GroupGraphPatternContext.class,0);
		}
		public GraphGraphPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphGraphPattern; }
	}

	public final GraphGraphPatternContext graphGraphPattern() throws RecognitionException {
		GraphGraphPatternContext _localctx = new GraphGraphPatternContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_graphGraphPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(T__39);
			setState(481);
			varOrIri();
			setState(482);
			groupGraphPattern();
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

	public static class WindowGraphPatternContext extends ParserRuleContext {
		public VarOrIriContext varOrIri() {
			return getRuleContext(VarOrIriContext.class,0);
		}
		public GroupGraphPatternContext groupGraphPattern() {
			return getRuleContext(GroupGraphPatternContext.class,0);
		}
		public WindowGraphPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowGraphPattern; }
	}

	public final WindowGraphPatternContext windowGraphPattern() throws RecognitionException {
		WindowGraphPatternContext _localctx = new WindowGraphPatternContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_windowGraphPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(T__18);
			setState(485);
			varOrIri();
			setState(486);
			groupGraphPattern();
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

	public static class FilterContext extends ParserRuleContext {
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(T__40);
			setState(489);
			constraint();
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

	public static class BindPatternContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VAR() { return getToken(RSPQLParser.VAR, 0); }
		public BindPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindPattern; }
	}

	public final BindPatternContext bindPattern() throws RecognitionException {
		BindPatternContext _localctx = new BindPatternContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_bindPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(T__41);
			setState(492);
			match(T__8);
			setState(493);
			expression();
			setState(494);
			match(T__6);
			setState(495);
			match(VAR);
			setState(496);
			match(T__9);
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

	public static class VarOrIriContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(RSPQLParser.VAR, 0); }
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public VarOrIriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varOrIri; }
	}

	public final VarOrIriContext varOrIri() throws RecognitionException {
		VarOrIriContext _localctx = new VarOrIriContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_varOrIri);
		try {
			setState(500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				match(VAR);
				}
				break;
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				iri();
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

	public static class GraphTermContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public RdfliteralContext rdfliteral() {
			return getRuleContext(RdfliteralContext.class,0);
		}
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public BlankNodeContext blankNode() {
			return getRuleContext(BlankNodeContext.class,0);
		}
		public TerminalNode NIL() { return getToken(RSPQLParser.NIL, 0); }
		public TerminalNode BOOL() { return getToken(RSPQLParser.BOOL, 0); }
		public GraphTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphTerm; }
	}

	public final GraphTermContext graphTerm() throws RecognitionException {
		GraphTermContext _localctx = new GraphTermContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_graphTerm);
		try {
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				iri();
				}
				break;
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				rdfliteral();
				}
				break;
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				numericLiteral();
				}
				break;
			case BLANK_NODE_LABEL:
			case ANON:
				enterOuterAlt(_localctx, 4);
				{
				setState(505);
				blankNode();
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 5);
				{
				setState(506);
				match(NIL);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(507);
				match(BOOL);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<ConditionalAndExpressionContext> conditionalAndExpression() {
			return getRuleContexts(ConditionalAndExpressionContext.class);
		}
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			conditionalAndExpression();
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(511);
				match(T__42);
				setState(512);
				conditionalAndExpression();
				}
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public List<ValueLogicalContext> valueLogical() {
			return getRuleContexts(ValueLogicalContext.class);
		}
		public ValueLogicalContext valueLogical(int i) {
			return getRuleContext(ValueLogicalContext.class,i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			valueLogical();
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__43) {
				{
				{
				setState(519);
				match(T__43);
				setState(520);
				valueLogical();
				}
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ValueLogicalContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ValueLogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueLogical; }
	}

	public final ValueLogicalContext valueLogical() throws RecognitionException {
		ValueLogicalContext _localctx = new ValueLogicalContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_valueLogical);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			relationalExpression();
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<NumericExpressionContext> numericExpression() {
			return getRuleContexts(NumericExpressionContext.class);
		}
		public NumericExpressionContext numericExpression(int i) {
			return getRuleContext(NumericExpressionContext.class,i);
		}
		public TerminalNode BINARY_OPERATOR() { return getToken(RSPQLParser.BINARY_OPERATOR, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode NOT() { return getToken(RSPQLParser.NOT, 0); }
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			numericExpression();
			setState(536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY_OPERATOR:
				{
				setState(529);
				match(BINARY_OPERATOR);
				setState(530);
				numericExpression();
				}
				break;
			case T__44:
			case NOT:
				{
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(531);
					match(NOT);
					}
				}

				setState(534);
				match(T__44);
				setState(535);
				expressionList();
				}
				break;
			case T__6:
			case T__9:
			case T__34:
			case T__35:
			case T__42:
			case T__43:
				break;
			default:
				break;
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(T__8);
			setState(539);
			expression();
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35) {
				{
				{
				setState(540);
				match(T__35);
				setState(541);
				expression();
				}
				}
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(547);
			match(T__9);
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

	public static class NumericExpressionContext extends ParserRuleContext {
		public Token op;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public NumericExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericExpression; }
	}

	public final NumericExpressionContext numericExpression() throws RecognitionException {
		NumericExpressionContext _localctx = new NumericExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_numericExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			multiplicativeExpression();
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45 || _la==T__46) {
				{
				{
				setState(550);
				((NumericExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__45 || _la==T__46) ) {
					((NumericExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(551);
				multiplicativeExpression();
				}
				}
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Token op;
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			unaryExpression();
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__47 || _la==STAR) {
				{
				{
				setState(558);
				((MultiplicativeExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__47 || _la==STAR) ) {
					((MultiplicativeExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(559);
				unaryExpression();
				}
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public Token op;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_unaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__46) | (1L << T__48))) != 0)) {
				{
				setState(565);
				((UnaryExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__46) | (1L << T__48))) != 0)) ) {
					((UnaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(568);
			primaryExpression();
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public BrackettedExpressionContext brackettedExpression() {
			return getRuleContext(BrackettedExpressionContext.class,0);
		}
		public BuiltInCallContext builtInCall() {
			return getRuleContext(BuiltInCallContext.class,0);
		}
		public RdfliteralContext rdfliteral() {
			return getRuleContext(RdfliteralContext.class,0);
		}
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(RSPQLParser.BOOL, 0); }
		public TerminalNode VAR() { return getToken(RSPQLParser.VAR, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_primaryExpression);
		try {
			setState(576);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				brackettedExpression();
				}
				break;
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case T__103:
			case T__104:
			case T__105:
			case T__106:
			case T__107:
			case T__108:
			case T__109:
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				builtInCall();
				}
				break;
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
				enterOuterAlt(_localctx, 3);
				{
				setState(572);
				rdfliteral();
				}
				break;
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(573);
				numericLiteral();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(574);
				match(BOOL);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(575);
				match(VAR);
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

	public static class BrackettedExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BrackettedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brackettedExpression; }
	}

	public final BrackettedExpressionContext brackettedExpression() throws RecognitionException {
		BrackettedExpressionContext _localctx = new BrackettedExpressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_brackettedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(T__8);
			setState(579);
			expression();
			setState(580);
			match(T__9);
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

	public static class BuiltInCallContext extends ParserRuleContext {
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public UnaryBuiltinContext unaryBuiltin() {
			return getRuleContext(UnaryBuiltinContext.class,0);
		}
		public BinaryBuiltinContext binaryBuiltin() {
			return getRuleContext(BinaryBuiltinContext.class,0);
		}
		public TernaryBuiltinContext ternaryBuiltin() {
			return getRuleContext(TernaryBuiltinContext.class,0);
		}
		public TernaryOrBinaryBuiltinContext ternaryOrBinaryBuiltin() {
			return getRuleContext(TernaryOrBinaryBuiltinContext.class,0);
		}
		public StrReplaceExpressionContext strReplaceExpression() {
			return getRuleContext(StrReplaceExpressionContext.class,0);
		}
		public BoundExpressionContext boundExpression() {
			return getRuleContext(BoundExpressionContext.class,0);
		}
		public ExistsFuncContext existsFunc() {
			return getRuleContext(ExistsFuncContext.class,0);
		}
		public TerminalNode NOT() { return getToken(RSPQLParser.NOT, 0); }
		public BuiltInCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInCall; }
	}

	public final BuiltInCallContext builtInCall() throws RecognitionException {
		BuiltInCallContext _localctx = new BuiltInCallContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_builtInCall);
		int _la;
		try {
			setState(593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				aggregate();
				}
				break;
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				unaryBuiltin();
				}
				break;
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case T__103:
				enterOuterAlt(_localctx, 3);
				{
				setState(584);
				binaryBuiltin();
				}
				break;
			case T__104:
				enterOuterAlt(_localctx, 4);
				{
				setState(585);
				ternaryBuiltin();
				}
				break;
			case T__105:
			case T__106:
				enterOuterAlt(_localctx, 5);
				{
				setState(586);
				ternaryOrBinaryBuiltin();
				}
				break;
			case T__107:
				enterOuterAlt(_localctx, 6);
				{
				setState(587);
				strReplaceExpression();
				}
				break;
			case T__108:
				enterOuterAlt(_localctx, 7);
				{
				setState(588);
				boundExpression();
				}
				break;
			case T__109:
			case NOT:
				enterOuterAlt(_localctx, 8);
				{
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(589);
					match(NOT);
					}
				}

				setState(592);
				existsFunc();
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

	public static class RdfliteralContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode LANGTAG() { return getToken(RSPQLParser.LANGTAG, 0); }
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public RdfliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rdfliteral; }
	}

	public final RdfliteralContext rdfliteral() throws RecognitionException {
		RdfliteralContext _localctx = new RdfliteralContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_rdfliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			string();
			setState(599);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LANGTAG:
				{
				setState(596);
				match(LANGTAG);
				}
				break;
			case T__49:
				{
				{
				setState(597);
				match(T__49);
				setState(598);
				iri();
				}
				}
				break;
			case T__6:
			case T__9:
			case T__11:
			case T__12:
			case T__13:
			case T__18:
			case T__20:
			case T__21:
			case T__34:
			case T__35:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case NOT:
			case BOOL:
			case STAR:
			case TYPE:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
			case VAR:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
			case BINARY_OPERATOR:
			case NIL:
			case ANON:
				break;
			default:
				break;
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

	public static class NumericLiteralContext extends ParserRuleContext {
		public NumericLiteralUnsignedContext numericLiteralUnsigned() {
			return getRuleContext(NumericLiteralUnsignedContext.class,0);
		}
		public NumericLiteralPositiveContext numericLiteralPositive() {
			return getRuleContext(NumericLiteralPositiveContext.class,0);
		}
		public NumericLiteralNegativeContext numericLiteralNegative() {
			return getRuleContext(NumericLiteralNegativeContext.class,0);
		}
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_numericLiteral);
		try {
			setState(604);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
				numericLiteralUnsigned();
				}
				break;
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
				numericLiteralPositive();
				}
				break;
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(603);
				numericLiteralNegative();
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

	public static class NumericLiteralUnsignedContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(RSPQLParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(RSPQLParser.DECIMAL, 0); }
		public TerminalNode DOUBLE() { return getToken(RSPQLParser.DOUBLE, 0); }
		public NumericLiteralUnsignedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteralUnsigned; }
	}

	public final NumericLiteralUnsignedContext numericLiteralUnsigned() throws RecognitionException {
		NumericLiteralUnsignedContext _localctx = new NumericLiteralUnsignedContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_numericLiteralUnsigned);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			_la = _input.LA(1);
			if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (INTEGER - 126)) | (1L << (DECIMAL - 126)) | (1L << (DOUBLE - 126)))) != 0)) ) {
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

	public static class NumericLiteralPositiveContext extends ParserRuleContext {
		public TerminalNode INTEGER_POSITIVE() { return getToken(RSPQLParser.INTEGER_POSITIVE, 0); }
		public TerminalNode DECIMAL_POSITIVE() { return getToken(RSPQLParser.DECIMAL_POSITIVE, 0); }
		public TerminalNode DOUBLE_POSITIVE() { return getToken(RSPQLParser.DOUBLE_POSITIVE, 0); }
		public NumericLiteralPositiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteralPositive; }
	}

	public final NumericLiteralPositiveContext numericLiteralPositive() throws RecognitionException {
		NumericLiteralPositiveContext _localctx = new NumericLiteralPositiveContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_numericLiteralPositive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			_la = _input.LA(1);
			if ( !(((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (INTEGER_POSITIVE - 129)) | (1L << (DECIMAL_POSITIVE - 129)) | (1L << (DOUBLE_POSITIVE - 129)))) != 0)) ) {
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

	public static class NumericLiteralNegativeContext extends ParserRuleContext {
		public TerminalNode INTEGER_NEGATIVE() { return getToken(RSPQLParser.INTEGER_NEGATIVE, 0); }
		public TerminalNode DECIMAL_NEGATIVE() { return getToken(RSPQLParser.DECIMAL_NEGATIVE, 0); }
		public TerminalNode DOUBLE_NEGATIVE() { return getToken(RSPQLParser.DOUBLE_NEGATIVE, 0); }
		public NumericLiteralNegativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteralNegative; }
	}

	public final NumericLiteralNegativeContext numericLiteralNegative() throws RecognitionException {
		NumericLiteralNegativeContext _localctx = new NumericLiteralNegativeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_numericLiteralNegative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			_la = _input.LA(1);
			if ( !(((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (INTEGER_NEGATIVE - 132)) | (1L << (DECIMAL_NEGATIVE - 132)) | (1L << (DOUBLE_NEGATIVE - 132)))) != 0)) ) {
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

	public static class ArgListContext extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(RSPQLParser.NIL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DISTINCT() { return getToken(RSPQLParser.DISTINCT, 0); }
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_argList);
		int _la;
		try {
			setState(627);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NIL:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				match(NIL);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				match(T__8);
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(614);
					match(DISTINCT);
					}
				}

				setState(617);
				expression();
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__35) {
					{
					{
					setState(618);
					match(T__35);
					setState(619);
					expression();
					}
					}
					setState(624);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(625);
				match(T__9);
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

	public static class ConstraintContext extends ParserRuleContext {
		public BrackettedExpressionContext brackettedExpression() {
			return getRuleContext(BrackettedExpressionContext.class,0);
		}
		public BuiltInCallContext builtInCall() {
			return getRuleContext(BuiltInCallContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_constraint);
		try {
			setState(631);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				brackettedExpression();
				}
				break;
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case T__103:
			case T__104:
			case T__105:
			case T__106:
			case T__107:
			case T__108:
			case T__109:
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				builtInCall();
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

	public static class AggregateContext extends ParserRuleContext {
		public Token f;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(RSPQLParser.DISTINCT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public AggregateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate; }
	}

	public final AggregateContext aggregate() throws RecognitionException {
		AggregateContext _localctx = new AggregateContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_aggregate);
		int _la;
		try {
			setState(665);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__50:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				((AggregateContext)_localctx).f = match(T__50);
				setState(634);
				match(T__8);
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(635);
					match(DISTINCT);
					}
				}

				setState(640);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(638);
					match(STAR);
					}
					break;
				case T__8:
				case T__45:
				case T__46:
				case T__48:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
				case T__54:
				case T__55:
				case T__56:
				case T__59:
				case T__60:
				case T__61:
				case T__62:
				case T__63:
				case T__64:
				case T__65:
				case T__66:
				case T__67:
				case T__68:
				case T__69:
				case T__70:
				case T__71:
				case T__72:
				case T__73:
				case T__74:
				case T__75:
				case T__76:
				case T__77:
				case T__78:
				case T__79:
				case T__80:
				case T__81:
				case T__82:
				case T__83:
				case T__84:
				case T__85:
				case T__86:
				case T__87:
				case T__88:
				case T__89:
				case T__90:
				case T__91:
				case T__92:
				case T__93:
				case T__94:
				case T__95:
				case T__96:
				case T__97:
				case T__98:
				case T__99:
				case T__100:
				case T__101:
				case T__102:
				case T__103:
				case T__104:
				case T__105:
				case T__106:
				case T__107:
				case T__108:
				case T__109:
				case NOT:
				case BOOL:
				case VAR:
				case INTEGER:
				case DECIMAL:
				case DOUBLE:
				case INTEGER_POSITIVE:
				case DECIMAL_POSITIVE:
				case DOUBLE_POSITIVE:
				case INTEGER_NEGATIVE:
				case DECIMAL_NEGATIVE:
				case DOUBLE_NEGATIVE:
				case STRING_LITERAL1:
				case STRING_LITERAL2:
				case STRING_LITERAL_LONG1:
				case STRING_LITERAL_LONG2:
					{
					setState(639);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(642);
				match(T__9);
				}
				break;
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				((AggregateContext)_localctx).f = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55))) != 0)) ) {
					((AggregateContext)_localctx).f = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(644);
				match(T__8);
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(645);
					match(DISTINCT);
					}
				}

				setState(648);
				expression();
				setState(649);
				match(T__9);
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 3);
				{
				setState(651);
				((AggregateContext)_localctx).f = match(T__56);
				setState(652);
				match(T__8);
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(653);
					match(DISTINCT);
					}
				}

				setState(656);
				expression();
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__34) {
					{
					setState(657);
					match(T__34);
					setState(658);
					match(T__57);
					setState(659);
					match(T__58);
					setState(660);
					string();
					}
				}

				setState(663);
				match(T__9);
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

	public static class UnaryBuiltinContext extends ParserRuleContext {
		public Token f;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NIL() { return getToken(RSPQLParser.NIL, 0); }
		public UnaryBuiltinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryBuiltin; }
	}

	public final UnaryBuiltinContext unaryBuiltin() throws RecognitionException {
		UnaryBuiltinContext _localctx = new UnaryBuiltinContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_unaryBuiltin);
		int _la;
		try {
			setState(682);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
				((UnaryBuiltinContext)_localctx).f = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (T__59 - 60)) | (1L << (T__60 - 60)) | (1L << (T__61 - 60)) | (1L << (T__62 - 60)) | (1L << (T__63 - 60)) | (1L << (T__64 - 60)) | (1L << (T__65 - 60)) | (1L << (T__66 - 60)) | (1L << (T__67 - 60)) | (1L << (T__68 - 60)) | (1L << (T__69 - 60)) | (1L << (T__70 - 60)) | (1L << (T__71 - 60)) | (1L << (T__72 - 60)) | (1L << (T__73 - 60)) | (1L << (T__74 - 60)) | (1L << (T__75 - 60)) | (1L << (T__76 - 60)) | (1L << (T__77 - 60)) | (1L << (T__78 - 60)) | (1L << (T__79 - 60)) | (1L << (T__80 - 60)) | (1L << (T__81 - 60)) | (1L << (T__82 - 60)) | (1L << (T__83 - 60)) | (1L << (T__84 - 60)) | (1L << (T__85 - 60)) | (1L << (T__86 - 60)) | (1L << (T__87 - 60)) | (1L << (T__88 - 60)) | (1L << (T__89 - 60)))) != 0)) ) {
					((UnaryBuiltinContext)_localctx).f = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(668);
				match(T__8);
				setState(669);
				expression();
				setState(670);
				match(T__9);
				}
				break;
			case T__90:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				((UnaryBuiltinContext)_localctx).f = match(T__90);
				setState(678);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(673);
					match(T__8);
					setState(674);
					expression();
					setState(675);
					match(T__9);
					}
					break;
				case NIL:
					{
					setState(677);
					match(NIL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__91:
			case T__92:
			case T__93:
			case T__94:
				enterOuterAlt(_localctx, 3);
				{
				setState(680);
				((UnaryBuiltinContext)_localctx).f = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (T__91 - 92)) | (1L << (T__92 - 92)) | (1L << (T__93 - 92)) | (1L << (T__94 - 92)))) != 0)) ) {
					((UnaryBuiltinContext)_localctx).f = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(681);
				match(NIL);
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

	public static class BinaryBuiltinContext extends ParserRuleContext {
		public Token f;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinaryBuiltinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryBuiltin; }
	}

	public final BinaryBuiltinContext binaryBuiltin() throws RecognitionException {
		BinaryBuiltinContext _localctx = new BinaryBuiltinContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_binaryBuiltin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			((BinaryBuiltinContext)_localctx).f = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (T__96 - 96)) | (1L << (T__97 - 96)) | (1L << (T__98 - 96)) | (1L << (T__99 - 96)) | (1L << (T__100 - 96)) | (1L << (T__101 - 96)) | (1L << (T__102 - 96)) | (1L << (T__103 - 96)))) != 0)) ) {
				((BinaryBuiltinContext)_localctx).f = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(685);
			match(T__8);
			setState(686);
			expression();
			setState(687);
			match(T__35);
			setState(688);
			expression();
			setState(689);
			match(T__9);
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

	public static class TernaryBuiltinContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TernaryBuiltinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryBuiltin; }
	}

	public final TernaryBuiltinContext ternaryBuiltin() throws RecognitionException {
		TernaryBuiltinContext _localctx = new TernaryBuiltinContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_ternaryBuiltin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(T__104);
			setState(692);
			match(T__8);
			setState(693);
			expression();
			setState(694);
			match(T__35);
			setState(695);
			expression();
			setState(696);
			match(T__35);
			setState(697);
			expression();
			setState(698);
			match(T__9);
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

	public static class TernaryOrBinaryBuiltinContext extends ParserRuleContext {
		public Token f;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TernaryOrBinaryBuiltinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryOrBinaryBuiltin; }
	}

	public final TernaryOrBinaryBuiltinContext ternaryOrBinaryBuiltin() throws RecognitionException {
		TernaryOrBinaryBuiltinContext _localctx = new TernaryOrBinaryBuiltinContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_ternaryOrBinaryBuiltin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			((TernaryOrBinaryBuiltinContext)_localctx).f = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__105 || _la==T__106) ) {
				((TernaryOrBinaryBuiltinContext)_localctx).f = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(701);
			match(T__8);
			setState(702);
			expression();
			setState(703);
			match(T__35);
			setState(704);
			expression();
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(705);
				match(T__35);
				setState(706);
				expression();
				}
			}

			setState(709);
			match(T__9);
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

	public static class StrReplaceExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StrReplaceExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strReplaceExpression; }
	}

	public final StrReplaceExpressionContext strReplaceExpression() throws RecognitionException {
		StrReplaceExpressionContext _localctx = new StrReplaceExpressionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_strReplaceExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(T__107);
			setState(712);
			match(T__8);
			setState(713);
			expression();
			setState(714);
			match(T__35);
			setState(715);
			expression();
			setState(716);
			match(T__35);
			setState(717);
			expression();
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(718);
				match(T__35);
				setState(719);
				expression();
				}
			}

			setState(722);
			match(T__9);
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

	public static class BoundExpressionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(RSPQLParser.VAR, 0); }
		public BoundExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundExpression; }
	}

	public final BoundExpressionContext boundExpression() throws RecognitionException {
		BoundExpressionContext _localctx = new BoundExpressionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_boundExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(T__108);
			setState(725);
			match(T__8);
			setState(726);
			match(VAR);
			setState(727);
			match(T__9);
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

	public static class ExistsFuncContext extends ParserRuleContext {
		public GroupGraphPatternContext groupGraphPattern() {
			return getRuleContext(GroupGraphPatternContext.class,0);
		}
		public ExistsFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existsFunc; }
	}

	public final ExistsFuncContext existsFunc() throws RecognitionException {
		ExistsFuncContext _localctx = new ExistsFuncContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_existsFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(T__109);
			setState(730);
			groupGraphPattern();
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL1() { return getToken(RSPQLParser.STRING_LITERAL1, 0); }
		public TerminalNode STRING_LITERAL2() { return getToken(RSPQLParser.STRING_LITERAL2, 0); }
		public TerminalNode STRING_LITERAL_LONG1() { return getToken(RSPQLParser.STRING_LITERAL_LONG1, 0); }
		public TerminalNode STRING_LITERAL_LONG2() { return getToken(RSPQLParser.STRING_LITERAL_LONG2, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			_la = _input.LA(1);
			if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (STRING_LITERAL1 - 136)) | (1L << (STRING_LITERAL2 - 136)) | (1L << (STRING_LITERAL_LONG1 - 136)) | (1L << (STRING_LITERAL_LONG2 - 136)))) != 0)) ) {
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

	public static class IriContext extends ParserRuleContext {
		public TerminalNode IRIREF() { return getToken(RSPQLParser.IRIREF, 0); }
		public PrefixedNameContext prefixedName() {
			return getRuleContext(PrefixedNameContext.class,0);
		}
		public IriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iri; }
	}

	public final IriContext iri() throws RecognitionException {
		IriContext _localctx = new IriContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_iri);
		try {
			setState(736);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				match(IRIREF);
				}
				break;
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(735);
				prefixedName();
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

	public static class PrefixedNameContext extends ParserRuleContext {
		public TerminalNode PNAME_LN() { return getToken(RSPQLParser.PNAME_LN, 0); }
		public TerminalNode PNAME_NS() { return getToken(RSPQLParser.PNAME_NS, 0); }
		public PrefixedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixedName; }
	}

	public final PrefixedNameContext prefixedName() throws RecognitionException {
		PrefixedNameContext _localctx = new PrefixedNameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_prefixedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			_la = _input.LA(1);
			if ( !(_la==PNAME_NS || _la==PNAME_LN) ) {
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

	public static class BlankNodeContext extends ParserRuleContext {
		public TerminalNode BLANK_NODE_LABEL() { return getToken(RSPQLParser.BLANK_NODE_LABEL, 0); }
		public TerminalNode ANON() { return getToken(RSPQLParser.ANON, 0); }
		public BlankNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blankNode; }
	}

	public final BlankNodeContext blankNode() throws RecognitionException {
		BlankNodeContext _localctx = new BlankNodeContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_blankNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			_la = _input.LA(1);
			if ( !(_la==BLANK_NODE_LABEL || _la==ANON) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u009d\u02e9\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\3\2\3\2\3\3\3\3\5\3\u00b1\n\3\3\3\3\3\3\3\3\3\5\3\u00b7\n"+
		"\3\3\4\3\4\7\4\u00bb\n\4\f\4\16\4\u00be\13\4\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\7\b\u00ce\n\b\f\b\16\b\u00d1\13\b\3\b\3"+
		"\b\5\b\u00d5\n\b\3\t\3\t\5\t\u00d9\n\t\3\t\6\t\u00dc\n\t\r\t\16\t\u00dd"+
		"\3\t\5\t\u00e1\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ec"+
		"\n\13\3\f\3\f\3\f\3\f\5\f\u00f2\n\f\3\f\3\f\7\f\u00f6\n\f\f\f\16\f\u00f9"+
		"\13\f\3\f\3\f\3\f\3\r\3\r\6\r\u0100\n\r\r\r\16\r\u0101\3\r\5\r\u0105\n"+
		"\r\3\r\7\r\u0108\n\r\f\r\16\r\u010b\13\r\3\r\5\r\u010e\n\r\3\r\3\r\3\16"+
		"\3\16\6\16\u0114\n\16\r\16\16\16\u0115\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\5\17\u011f\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\5\22\u012f\n\22\3\23\3\23\5\23\u0133\n\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\3\26\5\26\u013d\n\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\5\33\u014b\n\33\3\33\5\33\u014e"+
		"\n\33\3\33\5\33\u0151\n\33\3\33\5\33\u0154\n\33\3\34\3\34\3\34\6\34\u0159"+
		"\n\34\r\34\16\34\u015a\3\35\3\35\3\35\3\35\3\35\5\35\u0162\n\35\3\35\3"+
		"\35\3\35\5\35\u0167\n\35\3\36\3\36\6\36\u016b\n\36\r\36\16\36\u016c\3"+
		"\37\3\37\3 \3 \3 \6 \u0174\n \r \16 \u0175\3!\3!\3!\3!\5!\u017c\n!\5!"+
		"\u017e\n!\3\"\3\"\5\"\u0182\n\"\3\"\3\"\5\"\u0186\n\"\5\"\u0188\n\"\3"+
		"#\3#\3#\3$\3$\3$\3%\3%\6%\u0192\n%\r%\16%\u0193\3%\3%\3&\3&\5&\u019a\n"+
		"&\3&\5&\u019d\n&\3\'\3\'\3\'\3\'\3\'\5\'\u01a4\n\'\5\'\u01a6\n\'\3(\3"+
		"(\3(\5(\u01ab\n(\7(\u01ad\n(\f(\16(\u01b0\13(\3)\3)\3)\3*\3*\5*\u01b7"+
		"\n*\3+\3+\3+\7+\u01bc\n+\f+\16+\u01bf\13+\3,\3,\5,\u01c3\n,\3-\3-\5-\u01c7"+
		"\n-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\5/\u01d4\n/\3\60\3\60\3\60\6\60\u01d9"+
		"\n\60\r\60\16\60\u01da\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3"+
		"\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\67\3\67\5\67\u01f7\n\67\38\38\38\38\38\38\58\u01ff\n8\39\39\39\7"+
		"9\u0204\n9\f9\169\u0207\139\3:\3:\3:\7:\u020c\n:\f:\16:\u020f\13:\3;\3"+
		";\3<\3<\3<\3<\5<\u0217\n<\3<\3<\5<\u021b\n<\3=\3=\3=\3=\7=\u0221\n=\f"+
		"=\16=\u0224\13=\3=\3=\3>\3>\3>\7>\u022b\n>\f>\16>\u022e\13>\3?\3?\3?\7"+
		"?\u0233\n?\f?\16?\u0236\13?\3@\5@\u0239\n@\3@\3@\3A\3A\3A\3A\3A\3A\5A"+
		"\u0243\nA\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\5C\u0251\nC\3C\5C\u0254"+
		"\nC\3D\3D\3D\3D\5D\u025a\nD\3E\3E\3E\5E\u025f\nE\3F\3F\3G\3G\3H\3H\3I"+
		"\3I\3I\5I\u026a\nI\3I\3I\3I\7I\u026f\nI\fI\16I\u0272\13I\3I\3I\5I\u0276"+
		"\nI\3J\3J\5J\u027a\nJ\3K\3K\3K\5K\u027f\nK\3K\3K\5K\u0283\nK\3K\3K\3K"+
		"\3K\5K\u0289\nK\3K\3K\3K\3K\3K\3K\5K\u0291\nK\3K\3K\3K\3K\3K\5K\u0298"+
		"\nK\3K\3K\5K\u029c\nK\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u02a9\nL\3L"+
		"\3L\5L\u02ad\nL\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3N\3O\3O"+
		"\3O\3O\3O\3O\3O\5O\u02c6\nO\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u02d3"+
		"\nP\3P\3P\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3S\3S\3T\3T\5T\u02e3\nT\3U\3U\3V\3V"+
		"\3V\2\2W\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\2\23\3\2\6\b\3\2rs\3\2!\"\3\2\60\61\4\2\62\62"+
		"uu\4\2\60\61\63\63\3\2\u0080\u0082\3\2\u0083\u0085\3\2\u0086\u0088\3\2"+
		"\66:\3\2>\\\3\2^a\3\2bj\3\2lm\3\2\u008a\u008d\3\2{|\4\2}}\u0092\u0092"+
		"\2\u02fd\2\u00ac\3\2\2\2\4\u00ae\3\2\2\2\6\u00bc\3\2\2\2\b\u00bf\3\2\2"+
		"\2\n\u00c2\3\2\2\2\f\u00c6\3\2\2\2\16\u00cb\3\2\2\2\20\u00d6\3\2\2\2\22"+
		"\u00e2\3\2\2\2\24\u00eb\3\2\2\2\26\u00ed\3\2\2\2\30\u00fd\3\2\2\2\32\u0111"+
		"\3\2\2\2\34\u011a\3\2\2\2\36\u0120\3\2\2\2 \u0123\3\2\2\2\"\u012e\3\2"+
		"\2\2$\u0130\3\2\2\2&\u0134\3\2\2\2(\u0137\3\2\2\2*\u013a\3\2\2\2,\u013e"+
		"\3\2\2\2.\u0141\3\2\2\2\60\u0144\3\2\2\2\62\u0147\3\2\2\2\64\u014a\3\2"+
		"\2\2\66\u0155\3\2\2\28\u0166\3\2\2\2:\u0168\3\2\2\2<\u016e\3\2\2\2>\u0170"+
		"\3\2\2\2@\u017d\3\2\2\2B\u0187\3\2\2\2D\u0189\3\2\2\2F\u018c\3\2\2\2H"+
		"\u018f\3\2\2\2J\u019c\3\2\2\2L\u01a5\3\2\2\2N\u01a7\3\2\2\2P\u01b1\3\2"+
		"\2\2R\u01b6\3\2\2\2T\u01b8\3\2\2\2V\u01c2\3\2\2\2X\u01c6\3\2\2\2Z\u01c8"+
		"\3\2\2\2\\\u01d3\3\2\2\2^\u01d5\3\2\2\2`\u01dc\3\2\2\2b\u01df\3\2\2\2"+
		"d\u01e2\3\2\2\2f\u01e6\3\2\2\2h\u01ea\3\2\2\2j\u01ed\3\2\2\2l\u01f6\3"+
		"\2\2\2n\u01fe\3\2\2\2p\u0200\3\2\2\2r\u0208\3\2\2\2t\u0210\3\2\2\2v\u0212"+
		"\3\2\2\2x\u021c\3\2\2\2z\u0227\3\2\2\2|\u022f\3\2\2\2~\u0238\3\2\2\2\u0080"+
		"\u0242\3\2\2\2\u0082\u0244\3\2\2\2\u0084\u0253\3\2\2\2\u0086\u0255\3\2"+
		"\2\2\u0088\u025e\3\2\2\2\u008a\u0260\3\2\2\2\u008c\u0262\3\2\2\2\u008e"+
		"\u0264\3\2\2\2\u0090\u0275\3\2\2\2\u0092\u0279\3\2\2\2\u0094\u029b\3\2"+
		"\2\2\u0096\u02ac\3\2\2\2\u0098\u02ae\3\2\2\2\u009a\u02b5\3\2\2\2\u009c"+
		"\u02be\3\2\2\2\u009e\u02c9\3\2\2\2\u00a0\u02d6\3\2\2\2\u00a2\u02db\3\2"+
		"\2\2\u00a4\u02de\3\2\2\2\u00a6\u02e2\3\2\2\2\u00a8\u02e4\3\2\2\2\u00aa"+
		"\u02e6\3\2\2\2\u00ac\u00ad\5\4\3\2\u00ad\3\3\2\2\2\u00ae\u00b0\5\6\4\2"+
		"\u00af\u00b1\5\f\7\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b6"+
		"\3\2\2\2\u00b2\u00b7\5\16\b\2\u00b3\u00b7\5\26\f\2\u00b4\u00b7\5\30\r"+
		"\2\u00b5\u00b7\5\32\16\2\u00b6\u00b2\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\5\3\2\2\2\u00b8\u00bb\5\b\5\2"+
		"\u00b9\u00bb\5\n\6\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\7\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00c0\7\3\2\2\u00c0\u00c1\7z\2\2\u00c1\t\3\2\2\2"+
		"\u00c2\u00c3\7\4\2\2\u00c3\u00c4\7{\2\2\u00c4\u00c5\7z\2\2\u00c5\13\3"+
		"\2\2\2\u00c6\u00c7\7\5\2\2\u00c7\u00c8\t\2\2\2\u00c8\u00c9\5\u00a6T\2"+
		"\u00c9\u00ca\7\t\2\2\u00ca\r\3\2\2\2\u00cb\u00cf\5\20\t\2\u00cc\u00ce"+
		"\5\34\17\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2"+
		"\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d4"+
		"\5\60\31\2\u00d3\u00d5\5\64\33\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2"+
		"\2\u00d5\17\3\2\2\2\u00d6\u00d8\7\n\2\2\u00d7\u00d9\5\22\n\2\u00d8\u00d7"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00e0\3\2\2\2\u00da\u00dc\5\24\13\2"+
		"\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00e1\7u\2\2\u00e0\u00db\3\2\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\21\3\2\2\2\u00e2\u00e3\t\3\2\2\u00e3\23\3\2\2\2\u00e4"+
		"\u00ec\7~\2\2\u00e5\u00e6\7\13\2\2\u00e6\u00e7\5p9\2\u00e7\u00e8\7\t\2"+
		"\2\u00e8\u00e9\7~\2\2\u00e9\u00ea\7\f\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e4"+
		"\3\2\2\2\u00eb\u00e5\3\2\2\2\u00ec\25\3\2\2\2\u00ed\u00ee\7\r\2\2\u00ee"+
		"\u00ef\7\16\2\2\u00ef\u00f1\5L\'\2\u00f0\u00f2\7\17\2\2\u00f1\u00f0\3"+
		"\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f7\7\20\2\2\u00f4"+
		"\u00f6\5\34\17\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3"+
		"\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00fb\5\60\31\2\u00fb\u00fc\5\64\33\2\u00fc\27\3\2\2\2\u00fd\u0104\7"+
		"\21\2\2\u00fe\u0100\5l\67\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0105\7u"+
		"\2\2\u0104\u00ff\3\2\2\2\u0104\u0103\3\2\2\2\u0105\u0109\3\2\2\2\u0106"+
		"\u0108\5\34\17\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3"+
		"\2\2\2\u0109\u010a\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010c"+
		"\u010e\5\60\31\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3"+
		"\2\2\2\u010f\u0110\5\64\33\2\u0110\31\3\2\2\2\u0111\u0113\7\22\2\2\u0112"+
		"\u0114\5\34\17\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3"+
		"\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\5\60\31\2\u0118"+
		"\u0119\5\64\33\2\u0119\33\3\2\2\2\u011a\u011e\7\23\2\2\u011b\u011f\5\u00a6"+
		"T\2\u011c\u011f\5\36\20\2\u011d\u011f\5 \21\2\u011e\u011b\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f\35\3\2\2\2\u0120\u0121\7\24\2"+
		"\2\u0121\u0122\5\u00a6T\2\u0122\37\3\2\2\2\u0123\u0124\7\24\2\2\u0124"+
		"\u0125\7\25\2\2\u0125\u0126\5\u00a6T\2\u0126\u0127\7\26\2\2\u0127\u0128"+
		"\5\u00a6T\2\u0128\u0129\7\27\2\2\u0129\u012a\5\"\22\2\u012a\u012b\7\30"+
		"\2\2\u012b!\3\2\2\2\u012c\u012f\5$\23\2\u012d\u012f\5*\26\2\u012e\u012c"+
		"\3\2\2\2\u012e\u012d\3\2\2\2\u012f#\3\2\2\2\u0130\u0132\5&\24\2\u0131"+
		"\u0133\5(\25\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133%\3\2\2\2"+
		"\u0134\u0135\7\31\2\2\u0135\u0136\7\u0080\2\2\u0136\'\3\2\2\2\u0137\u0138"+
		"\7\32\2\2\u0138\u0139\7\u0080\2\2\u0139)\3\2\2\2\u013a\u013c\5,\27\2\u013b"+
		"\u013d\5.\30\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d+\3\2\2\2"+
		"\u013e\u013f\7\33\2\2\u013f\u0140\5\62\32\2\u0140-\3\2\2\2\u0141\u0142"+
		"\7\32\2\2\u0142\u0143\5\62\32\2\u0143/\3\2\2\2\u0144\u0145\7\34\2\2\u0145"+
		"\u0146\5H%\2\u0146\61\3\2\2\2\u0147\u0148\7y\2\2\u0148\63\3\2\2\2\u0149"+
		"\u014b\5\66\34\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3"+
		"\2\2\2\u014c\u014e\5:\36\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u0150\3\2\2\2\u014f\u0151\5> \2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2"+
		"\2\u0151\u0153\3\2\2\2\u0152\u0154\5B\"\2\u0153\u0152\3\2\2\2\u0153\u0154"+
		"\3\2\2\2\u0154\65\3\2\2\2\u0155\u0156\7\35\2\2\u0156\u0158\7\36\2\2\u0157"+
		"\u0159\58\35\2\u0158\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158\3\2"+
		"\2\2\u015a\u015b\3\2\2\2\u015b\67\3\2\2\2\u015c\u0167\5\u0084C\2\u015d"+
		"\u015e\7\13\2\2\u015e\u0161\5p9\2\u015f\u0160\7\t\2\2\u0160\u0162\7~\2"+
		"\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164"+
		"\7\f\2\2\u0164\u0167\3\2\2\2\u0165\u0167\7~\2\2\u0166\u015c\3\2\2\2\u0166"+
		"\u015d\3\2\2\2\u0166\u0165\3\2\2\2\u01679\3\2\2\2\u0168\u016a\7\37\2\2"+
		"\u0169\u016b\5<\37\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016a"+
		"\3\2\2\2\u016c\u016d\3\2\2\2\u016d;\3\2\2\2\u016e\u016f\5\u0092J\2\u016f"+
		"=\3\2\2\2\u0170\u0171\7 \2\2\u0171\u0173\7\36\2\2\u0172\u0174\5@!\2\u0173"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176?\3\2\2\2\u0177\u0178\t\4\2\2\u0178\u017e\5\u0082B\2\u0179\u017c"+
		"\5\u0092J\2\u017a\u017c\7~\2\2\u017b\u0179\3\2\2\2\u017b\u017a\3\2\2\2"+
		"\u017c\u017e\3\2\2\2\u017d\u0177\3\2\2\2\u017d\u017b\3\2\2\2\u017eA\3"+
		"\2\2\2\u017f\u0181\5D#\2\u0180\u0182\5F$\2\u0181\u0180\3\2\2\2\u0181\u0182"+
		"\3\2\2\2\u0182\u0188\3\2\2\2\u0183\u0185\5F$\2\u0184\u0186\5D#\2\u0185"+
		"\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u017f\3\2"+
		"\2\2\u0187\u0183\3\2\2\2\u0188C\3\2\2\2\u0189\u018a\7#\2\2\u018a\u018b"+
		"\7\u0080\2\2\u018bE\3\2\2\2\u018c\u018d\7$\2\2\u018d\u018e\7\u0080\2\2"+
		"\u018eG\3\2\2\2\u018f\u0191\7\16\2\2\u0190\u0192\5J&\2\u0191\u0190\3\2"+
		"\2\2\u0192\u0193\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u0196\7\20\2\2\u0196I\3\2\2\2\u0197\u0199\5L\'\2"+
		"\u0198\u019a\7\17\2\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019d"+
		"\3\2\2\2\u019b\u019d\5\\/\2\u019c\u0197\3\2\2\2\u019c\u019b\3\2\2\2\u019d"+
		"K\3\2\2\2\u019e\u019f\5X-\2\u019f\u01a0\5N(\2\u01a0\u01a6\3\2\2\2\u01a1"+
		"\u01a3\5Z.\2\u01a2\u01a4\5N(\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2"+
		"\u01a4\u01a6\3\2\2\2\u01a5\u019e\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a6M\3"+
		"\2\2\2\u01a7\u01ae\5P)\2\u01a8\u01aa\7%\2\2\u01a9\u01ab\5P)\2\u01aa\u01a9"+
		"\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01a8\3\2\2\2\u01ad"+
		"\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01afO\3\2\2\2"+
		"\u01b0\u01ae\3\2\2\2\u01b1\u01b2\5R*\2\u01b2\u01b3\5T+\2\u01b3Q\3\2\2"+
		"\2\u01b4\u01b7\5l\67\2\u01b5\u01b7\7w\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b5"+
		"\3\2\2\2\u01b7S\3\2\2\2\u01b8\u01bd\5V,\2\u01b9\u01ba\7&\2\2\u01ba\u01bc"+
		"\5V,\2\u01bb\u01b9\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01beU\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c3\5X-\2\u01c1"+
		"\u01c3\5Z.\2\u01c2\u01c0\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3W\3\2\2\2\u01c4"+
		"\u01c7\7~\2\2\u01c5\u01c7\5n8\2\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2\2"+
		"\2\u01c7Y\3\2\2\2\u01c8\u01c9\7\27\2\2\u01c9\u01ca\5N(\2\u01ca\u01cb\7"+
		"\30\2\2\u01cb[\3\2\2\2\u01cc\u01d4\5^\60\2\u01cd\u01d4\5`\61\2\u01ce\u01d4"+
		"\5b\62\2\u01cf\u01d4\5d\63\2\u01d0\u01d4\5f\64\2\u01d1\u01d4\5h\65\2\u01d2"+
		"\u01d4\5j\66\2\u01d3\u01cc\3\2\2\2\u01d3\u01cd\3\2\2\2\u01d3\u01ce\3\2"+
		"\2\2\u01d3\u01cf\3\2\2\2\u01d3\u01d0\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3"+
		"\u01d2\3\2\2\2\u01d4]\3\2\2\2\u01d5\u01d8\5H%\2\u01d6\u01d7\7\'\2\2\u01d7"+
		"\u01d9\5H%\2\u01d8\u01d6\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01d8\3\2\2"+
		"\2\u01da\u01db\3\2\2\2\u01db_\3\2\2\2\u01dc\u01dd\7(\2\2\u01dd\u01de\5"+
		"H%\2\u01dea\3\2\2\2\u01df\u01e0\7)\2\2\u01e0\u01e1\5H%\2\u01e1c\3\2\2"+
		"\2\u01e2\u01e3\7*\2\2\u01e3\u01e4\5l\67\2\u01e4\u01e5\5H%\2\u01e5e\3\2"+
		"\2\2\u01e6\u01e7\7\25\2\2\u01e7\u01e8\5l\67\2\u01e8\u01e9\5H%\2\u01e9"+
		"g\3\2\2\2\u01ea\u01eb\7+\2\2\u01eb\u01ec\5\u0092J\2\u01eci\3\2\2\2\u01ed"+
		"\u01ee\7,\2\2\u01ee\u01ef\7\13\2\2\u01ef\u01f0\5p9\2\u01f0\u01f1\7\t\2"+
		"\2\u01f1\u01f2\7~\2\2\u01f2\u01f3\7\f\2\2\u01f3k\3\2\2\2\u01f4\u01f7\7"+
		"~\2\2\u01f5\u01f7\5\u00a6T\2\u01f6\u01f4\3\2\2\2\u01f6\u01f5\3\2\2\2\u01f7"+
		"m\3\2\2\2\u01f8\u01ff\5\u00a6T\2\u01f9\u01ff\5\u0086D\2\u01fa\u01ff\5"+
		"\u0088E\2\u01fb\u01ff\5\u00aaV\2\u01fc\u01ff\7\u0090\2\2\u01fd\u01ff\7"+
		"t\2\2\u01fe\u01f8\3\2\2\2\u01fe\u01f9\3\2\2\2\u01fe\u01fa\3\2\2\2\u01fe"+
		"\u01fb\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ffo\3\2\2\2"+
		"\u0200\u0205\5r:\2\u0201\u0202\7-\2\2\u0202\u0204\5r:\2\u0203\u0201\3"+
		"\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"q\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u020d\5t;\2\u0209\u020a\7.\2\2\u020a"+
		"\u020c\5t;\2\u020b\u0209\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2"+
		"\2\u020d\u020e\3\2\2\2\u020es\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211"+
		"\5v<\2\u0211u\3\2\2\2\u0212\u021a\5z>\2\u0213\u0214\7\u008e\2\2\u0214"+
		"\u021b\5z>\2\u0215\u0217\7q\2\2\u0216\u0215\3\2\2\2\u0216\u0217\3\2\2"+
		"\2\u0217\u0218\3\2\2\2\u0218\u0219\7/\2\2\u0219\u021b\5x=\2\u021a\u0213"+
		"\3\2\2\2\u021a\u0216\3\2\2\2\u021a\u021b\3\2\2\2\u021bw\3\2\2\2\u021c"+
		"\u021d\7\13\2\2\u021d\u0222\5p9\2\u021e\u021f\7&\2\2\u021f\u0221\5p9\2"+
		"\u0220\u021e\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223"+
		"\3\2\2\2\u0223\u0225\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u0226\7\f\2\2\u0226"+
		"y\3\2\2\2\u0227\u022c\5|?\2\u0228\u0229\t\5\2\2\u0229\u022b\5|?\2\u022a"+
		"\u0228\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2"+
		"\2\2\u022d{\3\2\2\2\u022e\u022c\3\2\2\2\u022f\u0234\5~@\2\u0230\u0231"+
		"\t\6\2\2\u0231\u0233\5~@\2\u0232\u0230\3\2\2\2\u0233\u0236\3\2\2\2\u0234"+
		"\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235}\3\2\2\2\u0236\u0234\3\2\2\2"+
		"\u0237\u0239\t\7\2\2\u0238\u0237\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a"+
		"\3\2\2\2\u023a\u023b\5\u0080A\2\u023b\177\3\2\2\2\u023c\u0243\5\u0082"+
		"B\2\u023d\u0243\5\u0084C\2\u023e\u0243\5\u0086D\2\u023f\u0243\5\u0088"+
		"E\2\u0240\u0243\7t\2\2\u0241\u0243\7~\2\2\u0242\u023c\3\2\2\2\u0242\u023d"+
		"\3\2\2\2\u0242\u023e\3\2\2\2\u0242\u023f\3\2\2\2\u0242\u0240\3\2\2\2\u0242"+
		"\u0241\3\2\2\2\u0243\u0081\3\2\2\2\u0244\u0245\7\13\2\2\u0245\u0246\5"+
		"p9\2\u0246\u0247\7\f\2\2\u0247\u0083\3\2\2\2\u0248\u0254\5\u0094K\2\u0249"+
		"\u0254\5\u0096L\2\u024a\u0254\5\u0098M\2\u024b\u0254\5\u009aN\2\u024c"+
		"\u0254\5\u009cO\2\u024d\u0254\5\u009eP\2\u024e\u0254\5\u00a0Q\2\u024f"+
		"\u0251\7q\2\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2"+
		"\2\2\u0252\u0254\5\u00a2R\2\u0253\u0248\3\2\2\2\u0253\u0249\3\2\2\2\u0253"+
		"\u024a\3\2\2\2\u0253\u024b\3\2\2\2\u0253\u024c\3\2\2\2\u0253\u024d\3\2"+
		"\2\2\u0253\u024e\3\2\2\2\u0253\u0250\3\2\2\2\u0254\u0085\3\2\2\2\u0255"+
		"\u0259\5\u00a4S\2\u0256\u025a\7\177\2\2\u0257\u0258\7\64\2\2\u0258\u025a"+
		"\5\u00a6T\2\u0259\u0256\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2"+
		"\2\u025a\u0087\3\2\2\2\u025b\u025f\5\u008aF\2\u025c\u025f\5\u008cG\2\u025d"+
		"\u025f\5\u008eH\2\u025e\u025b\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025d"+
		"\3\2\2\2\u025f\u0089\3\2\2\2\u0260\u0261\t\b\2\2\u0261\u008b\3\2\2\2\u0262"+
		"\u0263\t\t\2\2\u0263\u008d\3\2\2\2\u0264\u0265\t\n\2\2\u0265\u008f\3\2"+
		"\2\2\u0266\u0276\7\u0090\2\2\u0267\u0269\7\13\2\2\u0268\u026a\7r\2\2\u0269"+
		"\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u0270\5p"+
		"9\2\u026c\u026d\7&\2\2\u026d\u026f\5p9\2\u026e\u026c\3\2\2\2\u026f\u0272"+
		"\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0273\3\2\2\2\u0272"+
		"\u0270\3\2\2\2\u0273\u0274\7\f\2\2\u0274\u0276\3\2\2\2\u0275\u0266\3\2"+
		"\2\2\u0275\u0267\3\2\2\2\u0276\u0091\3\2\2\2\u0277\u027a\5\u0082B\2\u0278"+
		"\u027a\5\u0084C\2\u0279\u0277\3\2\2\2\u0279\u0278\3\2\2\2\u027a\u0093"+
		"\3\2\2\2\u027b\u027c\7\65\2\2\u027c\u027e\7\13\2\2\u027d\u027f\7r\2\2"+
		"\u027e\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0282\3\2\2\2\u0280\u0283"+
		"\7u\2\2\u0281\u0283\5p9\2\u0282\u0280\3\2\2\2\u0282\u0281\3\2\2\2\u0283"+
		"\u0284\3\2\2\2\u0284\u029c\7\f\2\2\u0285\u0286\t\13\2\2\u0286\u0288\7"+
		"\13\2\2\u0287\u0289\7r\2\2\u0288\u0287\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"\u028a\3\2\2\2\u028a\u028b\5p9\2\u028b\u028c\7\f\2\2\u028c\u029c\3\2\2"+
		"\2\u028d\u028e\7;\2\2\u028e\u0290\7\13\2\2\u028f\u0291\7r\2\2\u0290\u028f"+
		"\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0297\5p9\2\u0293"+
		"\u0294\7%\2\2\u0294\u0295\7<\2\2\u0295\u0296\7=\2\2\u0296\u0298\5\u00a4"+
		"S\2\u0297\u0293\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"\u029a\7\f\2\2\u029a\u029c\3\2\2\2\u029b\u027b\3\2\2\2\u029b\u0285\3\2"+
		"\2\2\u029b\u028d\3\2\2\2\u029c\u0095\3\2\2\2\u029d\u029e\t\f\2\2\u029e"+
		"\u029f\7\13\2\2\u029f\u02a0\5p9\2\u02a0\u02a1\7\f\2\2\u02a1\u02ad\3\2"+
		"\2\2\u02a2\u02a8\7]\2\2\u02a3\u02a4\7\13\2\2\u02a4\u02a5\5p9\2\u02a5\u02a6"+
		"\7\f\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02a9\7\u0090\2\2\u02a8\u02a3\3\2\2"+
		"\2\u02a8\u02a7\3\2\2\2\u02a9\u02ad\3\2\2\2\u02aa\u02ab\t\r\2\2\u02ab\u02ad"+
		"\7\u0090\2\2\u02ac\u029d\3\2\2\2\u02ac\u02a2\3\2\2\2\u02ac\u02aa\3\2\2"+
		"\2\u02ad\u0097\3\2\2\2\u02ae\u02af\t\16\2\2\u02af\u02b0\7\13\2\2\u02b0"+
		"\u02b1\5p9\2\u02b1\u02b2\7&\2\2\u02b2\u02b3\5p9\2\u02b3\u02b4\7\f\2\2"+
		"\u02b4\u0099\3\2\2\2\u02b5\u02b6\7k\2\2\u02b6\u02b7\7\13\2\2\u02b7\u02b8"+
		"\5p9\2\u02b8\u02b9\7&\2\2\u02b9\u02ba\5p9\2\u02ba\u02bb\7&\2\2\u02bb\u02bc"+
		"\5p9\2\u02bc\u02bd\7\f\2\2\u02bd\u009b\3\2\2\2\u02be\u02bf\t\17\2\2\u02bf"+
		"\u02c0\7\13\2\2\u02c0\u02c1\5p9\2\u02c1\u02c2\7&\2\2\u02c2\u02c5\5p9\2"+
		"\u02c3\u02c4\7&\2\2\u02c4\u02c6\5p9\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6"+
		"\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\7\f\2\2\u02c8\u009d\3\2\2\2\u02c9"+
		"\u02ca\7n\2\2\u02ca\u02cb\7\13\2\2\u02cb\u02cc\5p9\2\u02cc\u02cd\7&\2"+
		"\2\u02cd\u02ce\5p9\2\u02ce\u02cf\7&\2\2\u02cf\u02d2\5p9\2\u02d0\u02d1"+
		"\7&\2\2\u02d1\u02d3\5p9\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3"+
		"\u02d4\3\2\2\2\u02d4\u02d5\7\f\2\2\u02d5\u009f\3\2\2\2\u02d6\u02d7\7o"+
		"\2\2\u02d7\u02d8\7\13\2\2\u02d8\u02d9\7~\2\2\u02d9\u02da\7\f\2\2\u02da"+
		"\u00a1\3\2\2\2\u02db\u02dc\7p\2\2\u02dc\u02dd\5H%\2\u02dd\u00a3\3\2\2"+
		"\2\u02de\u02df\t\20\2\2\u02df\u00a5\3\2\2\2\u02e0\u02e3\7z\2\2\u02e1\u02e3"+
		"\5\u00a8U\2\u02e2\u02e0\3\2\2\2\u02e2\u02e1\3\2\2\2\u02e3\u00a7\3\2\2"+
		"\2\u02e4\u02e5\t\21\2\2\u02e5\u00a9\3\2\2\2\u02e6\u02e7\t\22\2\2\u02e7"+
		"\u00ab\3\2\2\2P\u00b0\u00b6\u00ba\u00bc\u00cf\u00d4\u00d8\u00dd\u00e0"+
		"\u00eb\u00f1\u00f7\u0101\u0104\u0109\u010d\u0115\u011e\u012e\u0132\u013c"+
		"\u014a\u014d\u0150\u0153\u015a\u0161\u0166\u016c\u0175\u017b\u017d\u0181"+
		"\u0185\u0187\u0193\u0199\u019c\u01a3\u01a5\u01aa\u01ae\u01b6\u01bd\u01c2"+
		"\u01c6\u01d3\u01da\u01f6\u01fe\u0205\u020d\u0216\u021a\u0222\u022c\u0234"+
		"\u0238\u0242\u0250\u0253\u0259\u025e\u0269\u0270\u0275\u0279\u027e\u0282"+
		"\u0288\u0290\u0297\u029b\u02a8\u02ac\u02c5\u02d2\u02e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}