// Generated from phisco/streams/polimi/it/antlr4/RSPQL.g4 by ANTLR 4.3
package phisco.streams.polimi.it.antlr4;
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
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__111=1, T__110=2, T__109=3, T__108=4, T__107=5, T__106=6, T__105=7, 
		T__104=8, T__103=9, T__102=10, T__101=11, T__100=12, T__99=13, T__98=14, 
		T__97=15, T__96=16, T__95=17, T__94=18, T__93=19, T__92=20, T__91=21, 
		T__90=22, T__89=23, T__88=24, T__87=25, T__86=26, T__85=27, T__84=28, 
		T__83=29, T__82=30, T__81=31, T__80=32, T__79=33, T__78=34, T__77=35, 
		T__76=36, T__75=37, T__74=38, T__73=39, T__72=40, T__71=41, T__70=42, 
		T__69=43, T__68=44, T__67=45, T__66=46, T__65=47, T__64=48, T__63=49, 
		T__62=50, T__61=51, T__60=52, T__59=53, T__58=54, T__57=55, T__56=56, 
		T__55=57, T__54=58, T__53=59, T__52=60, T__51=61, T__50=62, T__49=63, 
		T__48=64, T__47=65, T__46=66, T__45=67, T__44=68, T__43=69, T__42=70, 
		T__41=71, T__40=72, T__39=73, T__38=74, T__37=75, T__36=76, T__35=77, 
		T__34=78, T__33=79, T__32=80, T__31=81, T__30=82, T__29=83, T__28=84, 
		T__27=85, T__26=86, T__25=87, T__24=88, T__23=89, T__22=90, T__21=91, 
		T__20=92, T__19=93, T__18=94, T__17=95, T__16=96, T__15=97, T__14=98, 
		T__13=99, T__12=100, T__11=101, T__10=102, T__9=103, T__8=104, T__7=105, 
		T__6=106, T__5=107, T__4=108, T__3=109, T__2=110, T__1=111, T__0=112, 
		NOT=113, DISTINCT=114, REDUCED=115, BOOL=116, STAR=117, UNDEF=118, TYPE=119, 
		COMMENT=120, DURATION=121, IRIREF=122, PNAME_NS=123, PNAME_LN=124, BLANK_NODE_LABEL=125, 
		VAR=126, LANGTAG=127, INTEGER=128, DECIMAL=129, DOUBLE=130, INTEGER_POSITIVE=131, 
		DECIMAL_POSITIVE=132, DOUBLE_POSITIVE=133, INTEGER_NEGATIVE=134, DECIMAL_NEGATIVE=135, 
		DOUBLE_NEGATIVE=136, EXPONENT=137, STRING_LITERAL1=138, STRING_LITERAL2=139, 
		STRING_LITERAL_LONG1=140, STRING_LITERAL_LONG2=141, BINARY_OPERATOR=142, 
		ECHAR=143, NIL=144, WS=145, ANON=146, PN_CHARS_BASE=147, PN_CHARS_U=148, 
		VARNAME=149, PN_CHARS=150, PN_PREFIX=151, PN_LOCAL=152, PLX=153, PERCENT=154, 
		HEX=155, PN_LOCAL_ESC=156, ANYCHAR=157;
	public static final String[] tokenNames = {
		"<INVALID>", "'SEPARATOR'", "'ABS'", "'SAMPLE'", "'EXISTS'", "'TIMEZONE'", 
		"'RAND'", "'^^'", "'&&'", "'='", "'NAMED'", "'STRBEFORE'", "'LANG'", "','", 
		"'BASE'", "'ROUND'", "'STRSTARTS'", "'DESCRIBE'", "'ASC'", "'ENCODE_FOR_URI'", 
		"'DSTREAM'", "'PREFIX'", "'MINUTES'", "']'", "'ASK'", "'ISLITERAL'", "'TZ'", 
		"'OPTIONAL'", "'IRI'", "'CONSTRUCT'", "'+'", "'SHA256'", "'SILENT'", "'AS'", 
		"'WINDOW'", "'WHERE'", "'STRDT'", "'DATATYPE'", "'UNION'", "';'", "'ON'", 
		"'}'", "'STRLEN'", "'CEIL'", "'SELECT'", "'ISIRI'", "'STRLANG'", "'SHA1'", 
		"'DAY'", "'MIN'", "'['", "'NOW'", "'BIND'", "'STR'", "'HOURS'", "'!'", 
		"'SUBSTR'", "'GROUP_CONCAT'", "')'", "'DESC'", "'FILTER'", "'SECONDS'", 
		"'LCASE'", "'GRAPH'", "'FROM'", "'FLOOR'", "'{'", "'LANGMATCHES'", "'ISBLANK'", 
		"'GROUP'", "'REGISTER'", "'CONTAINS'", "'BNODE'", "'UUID'", "'SHA384'", 
		"'('", "'MD5'", "'MONTH'", "'REPLACE'", "'STEP'", "'YEAR'", "'URI'", "'SUM'", 
		"'HAVING'", "'UCASE'", "'BOUND'", "'MAX'", "'/'", "'LIMIT'", "'STRUUID'", 
		"'STRENDS'", "'BY'", "'ISNUMERIC'", "'||'", "'ISURI'", "'IF'", "'SHA512'", 
		"'REGEX'", "'RANGE'", "'ISTREAM'", "'ORDER'", "'OFFSET'", "'.'", "'MINUS'", 
		"'SERVICE'", "'STRAFTER'", "'AVG'", "'COUNT'", "'ELEMENTS'", "'RSTREAM'", 
		"'IN'", "'SAMETERM'", "'-'", "'NOT'", "'DISTINCT'", "'REDUCED'", "BOOL", 
		"'*'", "'UNDEF'", "TYPE", "COMMENT", "DURATION", "IRIREF", "PNAME_NS", 
		"PNAME_LN", "BLANK_NODE_LABEL", "VAR", "LANGTAG", "INTEGER", "DECIMAL", 
		"DOUBLE", "INTEGER_POSITIVE", "DECIMAL_POSITIVE", "DOUBLE_POSITIVE", "INTEGER_NEGATIVE", 
		"DECIMAL_NEGATIVE", "DOUBLE_NEGATIVE", "EXPONENT", "STRING_LITERAL1", 
		"STRING_LITERAL2", "STRING_LITERAL_LONG1", "STRING_LITERAL_LONG2", "BINARY_OPERATOR", 
		"ECHAR", "NIL", "WS", "ANON", "PN_CHARS_BASE", "PN_CHARS_U", "VARNAME", 
		"PN_CHARS", "PN_PREFIX", "PN_LOCAL", "PLX", "PERCENT", "HEX", "PN_LOCAL_ESC", 
		"ANYCHAR"
	};
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
		RULE_object = 42, RULE_blankNodePropertyList = 43, RULE_graphPatternNotTriples = 44, 
		RULE_groupOrUnionGraphPattern = 45, RULE_optionalGraphPattern = 46, RULE_minusGraphPattern = 47, 
		RULE_graphGraphPattern = 48, RULE_windowGraphPattern = 49, RULE_serviceGraphPattern = 50, 
		RULE_filter = 51, RULE_bindPattern = 52, RULE_varOrTerm = 53, RULE_varOrIri = 54, 
		RULE_graphTerm = 55, RULE_expression = 56, RULE_conditionalAndExpression = 57, 
		RULE_valueLogical = 58, RULE_relationalExpression = 59, RULE_expressionList = 60, 
		RULE_numericExpression = 61, RULE_multiplicativeExpression = 62, RULE_unaryExpression = 63, 
		RULE_primaryExpression = 64, RULE_brackettedExpression = 65, RULE_builtInCall = 66, 
		RULE_rdfliteral = 67, RULE_numericLiteral = 68, RULE_numericLiteralUnsigned = 69, 
		RULE_numericLiteralPositive = 70, RULE_numericLiteralNegative = 71, RULE_argList = 72, 
		RULE_constraint = 73, RULE_aggregate = 74, RULE_unaryBuiltin = 75, RULE_binaryBuiltin = 76, 
		RULE_ternaryBuiltin = 77, RULE_ternaryOrBinaryBuiltin = 78, RULE_strReplaceExpression = 79, 
		RULE_boundExpression = 80, RULE_existsFunc = 81, RULE_string = 82, RULE_iri = 83, 
		RULE_prefixedName = 84, RULE_blankNode = 85;
	public static final String[] ruleNames = {
		"queryUnit", "query", "prologue", "baseDecl", "prefixDecl", "registerClause", 
		"selectQuery", "selectClause", "selectModifier", "resultVar", "constructQuery", 
		"describeQuery", "askQuery", "datasetClause", "namedGraphClause", "namedWindowClause", 
		"windowDefinition", "physicalWindow", "physicalRange", "physicalStep", 
		"logicalWindow", "logicalRange", "logicalStep", "whereClause", "duration", 
		"solutionModifier", "groupClause", "groupCondition", "havingClause", "havingCondition", 
		"orderClause", "orderCondition", "limitOffsetClauses", "limitClause", 
		"offsetClause", "groupGraphPattern", "graphPatternSub", "triplesSameSubject", 
		"propertyListNotEmpty", "property", "verb", "objectList", "object", "blankNodePropertyList", 
		"graphPatternNotTriples", "groupOrUnionGraphPattern", "optionalGraphPattern", 
		"minusGraphPattern", "graphGraphPattern", "windowGraphPattern", "serviceGraphPattern", 
		"filter", "bindPattern", "varOrTerm", "varOrIri", "graphTerm", "expression", 
		"conditionalAndExpression", "valueLogical", "relationalExpression", "expressionList", 
		"numericExpression", "multiplicativeExpression", "unaryExpression", "primaryExpression", 
		"brackettedExpression", "builtInCall", "rdfliteral", "numericLiteral", 
		"numericLiteralUnsigned", "numericLiteralPositive", "numericLiteralNegative", 
		"argList", "constraint", "aggregate", "unaryBuiltin", "binaryBuiltin", 
		"ternaryBuiltin", "ternaryOrBinaryBuiltin", "strReplaceExpression", "boundExpression", 
		"existsFunc", "string", "iri", "prefixedName", "blankNode"
	};

	@Override
	public String getGrammarFileName() { return "RSPQL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterQueryUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitQueryUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitQueryUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryUnitContext queryUnit() throws RecognitionException {
		QueryUnitContext _localctx = new QueryUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_queryUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); query();
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
		public DescribeQueryContext describeQuery() {
			return getRuleContext(DescribeQueryContext.class,0);
		}
		public SelectQueryContext selectQuery() {
			return getRuleContext(SelectQueryContext.class,0);
		}
		public ConstructQueryContext constructQuery() {
			return getRuleContext(ConstructQueryContext.class,0);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); prologue();
			setState(176);
			_la = _input.LA(1);
			if (_la==T__42) {
				{
				setState(175); registerClause();
				}
			}

			setState(182);
			switch (_input.LA(1)) {
			case T__68:
				{
				setState(178); selectQuery();
				}
				break;
			case T__83:
				{
				setState(179); constructQuery();
				}
				break;
			case T__95:
				{
				setState(180); describeQuery();
				}
				break;
			case T__88:
				{
				setState(181); askQuery();
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
		public PrefixDeclContext prefixDecl(int i) {
			return getRuleContext(PrefixDeclContext.class,i);
		}
		public List<BaseDeclContext> baseDecl() {
			return getRuleContexts(BaseDeclContext.class);
		}
		public List<PrefixDeclContext> prefixDecl() {
			return getRuleContexts(PrefixDeclContext.class);
		}
		public BaseDeclContext baseDecl(int i) {
			return getRuleContext(BaseDeclContext.class,i);
		}
		public PrologueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prologue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterPrologue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitPrologue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitPrologue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrologueContext prologue() throws RecognitionException {
		PrologueContext _localctx = new PrologueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prologue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__98 || _la==T__91) {
				{
				setState(186);
				switch (_input.LA(1)) {
				case T__98:
					{
					setState(184); baseDecl();
					}
					break;
				case T__91:
					{
					setState(185); prefixDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(190);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterBaseDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitBaseDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitBaseDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseDeclContext baseDecl() throws RecognitionException {
		BaseDeclContext _localctx = new BaseDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_baseDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191); match(T__98);
			setState(192); match(IRIREF);
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
		public TerminalNode IRIREF() { return getToken(RSPQLParser.IRIREF, 0); }
		public TerminalNode PNAME_NS() { return getToken(RSPQLParser.PNAME_NS, 0); }
		public PrefixDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterPrefixDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitPrefixDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitPrefixDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixDeclContext prefixDecl() throws RecognitionException {
		PrefixDeclContext _localctx = new PrefixDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_prefixDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); match(T__91);
			setState(195); match(PNAME_NS);
			setState(196); match(IRIREF);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterRegisterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitRegisterClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitRegisterClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegisterClauseContext registerClause() throws RecognitionException {
		RegisterClauseContext _localctx = new RegisterClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_registerClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198); match(T__42);
			setState(199);
			((RegisterClauseContext)_localctx).streamType = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__92 || _la==T__13 || _la==T__3) ) {
				((RegisterClauseContext)_localctx).streamType = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(200); ((RegisterClauseContext)_localctx).outputStream = iri();
			setState(201); match(T__79);
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
		public DatasetClauseContext datasetClause(int i) {
			return getRuleContext(DatasetClauseContext.class,i);
		}
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public SolutionModifierContext solutionModifier() {
			return getRuleContext(SolutionModifierContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public List<DatasetClauseContext> datasetClause() {
			return getRuleContexts(DatasetClauseContext.class);
		}
		public SelectQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterSelectQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitSelectQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitSelectQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectQueryContext selectQuery() throws RecognitionException {
		SelectQueryContext _localctx = new SelectQueryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selectQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); selectClause();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__48) {
				{
				{
				setState(204); datasetClause();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210); whereClause();
			setState(211); solutionModifier();
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
		public List<ResultVarContext> resultVar() {
			return getRuleContexts(ResultVarContext.class);
		}
		public ResultVarContext resultVar(int i) {
			return getRuleContext(ResultVarContext.class,i);
		}
		public TerminalNode STAR() { return getToken(RSPQLParser.STAR, 0); }
		public SelectModifierContext selectModifier() {
			return getRuleContext(SelectModifierContext.class,0);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); match(T__68);
			setState(215);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==REDUCED) {
				{
				setState(214); selectModifier();
				}
			}

			setState(223);
			switch (_input.LA(1)) {
			case T__37:
			case VAR:
				{
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(217); resultVar();
					}
					}
					setState(220); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__37 || _la==VAR );
				}
				break;
			case STAR:
				{
				setState(222); match(STAR);
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
		public TerminalNode REDUCED() { return getToken(RSPQLParser.REDUCED, 0); }
		public TerminalNode DISTINCT() { return getToken(RSPQLParser.DISTINCT, 0); }
		public SelectModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterSelectModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitSelectModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitSelectModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectModifierContext selectModifier() throws RecognitionException {
		SelectModifierContext _localctx = new SelectModifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_selectModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !(_la==DISTINCT || _la==REDUCED) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterResultVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitResultVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitResultVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultVarContext resultVar() throws RecognitionException {
		ResultVarContext _localctx = new ResultVarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_resultVar);
		try {
			setState(234);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(227); match(VAR);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(228); match(T__37);
				setState(229); expression();
				setState(230); match(T__79);
				setState(231); match(VAR);
				setState(232); match(T__54);
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
		public DatasetClauseContext datasetClause(int i) {
			return getRuleContext(DatasetClauseContext.class,i);
		}
		public SolutionModifierContext solutionModifier() {
			return getRuleContext(SolutionModifierContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public List<DatasetClauseContext> datasetClause() {
			return getRuleContexts(DatasetClauseContext.class);
		}
		public ConstructQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterConstructQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitConstructQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitConstructQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructQueryContext constructQuery() throws RecognitionException {
		ConstructQueryContext _localctx = new ConstructQueryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constructQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236); match(T__83);
			setState(237); match(T__46);
			setState(238); triplesSameSubject();
			setState(240);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(239); match(T__10);
				}
			}

			setState(242); match(T__71);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__48) {
				{
				{
				setState(243); datasetClause();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249); whereClause();
			setState(250); solutionModifier();
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
		public VarOrIriContext varOrIri(int i) {
			return getRuleContext(VarOrIriContext.class,i);
		}
		public DatasetClauseContext datasetClause(int i) {
			return getRuleContext(DatasetClauseContext.class,i);
		}
		public SolutionModifierContext solutionModifier() {
			return getRuleContext(SolutionModifierContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TerminalNode STAR() { return getToken(RSPQLParser.STAR, 0); }
		public List<DatasetClauseContext> datasetClause() {
			return getRuleContexts(DatasetClauseContext.class);
		}
		public List<VarOrIriContext> varOrIri() {
			return getRuleContexts(VarOrIriContext.class);
		}
		public DescribeQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterDescribeQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitDescribeQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitDescribeQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeQueryContext describeQuery() throws RecognitionException {
		DescribeQueryContext _localctx = new DescribeQueryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_describeQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); match(T__95);
			setState(259);
			switch (_input.LA(1)) {
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case VAR:
				{
				setState(254); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(253); varOrIri();
					}
					}
					setState(256); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (IRIREF - 122)) | (1L << (PNAME_NS - 122)) | (1L << (PNAME_LN - 122)) | (1L << (VAR - 122)))) != 0) );
				}
				break;
			case STAR:
				{
				setState(258); match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__48) {
				{
				{
				setState(261); datasetClause();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			_la = _input.LA(1);
			if (_la==T__77) {
				{
				setState(267); whereClause();
				}
			}

			setState(270); solutionModifier();
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
		public DatasetClauseContext datasetClause(int i) {
			return getRuleContext(DatasetClauseContext.class,i);
		}
		public SolutionModifierContext solutionModifier() {
			return getRuleContext(SolutionModifierContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public List<DatasetClauseContext> datasetClause() {
			return getRuleContexts(DatasetClauseContext.class);
		}
		public AskQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_askQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterAskQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitAskQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitAskQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AskQueryContext askQuery() throws RecognitionException {
		AskQueryContext _localctx = new AskQueryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_askQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); match(T__88);
			setState(274); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(273); datasetClause();
				}
				}
				setState(276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__48 );
			setState(278); whereClause();
			setState(279); solutionModifier();
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
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public NamedWindowClauseContext namedWindowClause() {
			return getRuleContext(NamedWindowClauseContext.class,0);
		}
		public DatasetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datasetClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterDatasetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitDatasetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitDatasetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatasetClauseContext datasetClause() throws RecognitionException {
		DatasetClauseContext _localctx = new DatasetClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_datasetClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); match(T__48);
			setState(285);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(282); ((DatasetClauseContext)_localctx).anonymousGraph = iri();
				}
				break;

			case 2:
				{
				setState(283); namedGraphClause();
				}
				break;

			case 3:
				{
				setState(284); namedWindowClause();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterNamedGraphClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitNamedGraphClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitNamedGraphClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedGraphClauseContext namedGraphClause() throws RecognitionException {
		NamedGraphClauseContext _localctx = new NamedGraphClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_namedGraphClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); match(T__102);
			setState(288); ((NamedGraphClauseContext)_localctx).graphIRI = iri();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterNamedWindowClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitNamedWindowClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitNamedWindowClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowClauseContext namedWindowClause() throws RecognitionException {
		NamedWindowClauseContext _localctx = new NamedWindowClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_namedWindowClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290); match(T__102);
			setState(291); match(T__78);
			setState(292); ((NamedWindowClauseContext)_localctx).windowIRI = iri();
			setState(293); match(T__72);
			setState(294); ((NamedWindowClauseContext)_localctx).streamIRI = iri();
			setState(295); match(T__62);
			setState(296); windowDefinition();
			setState(297); match(T__89);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterWindowDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitWindowDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitWindowDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowDefinitionContext windowDefinition() throws RecognitionException {
		WindowDefinitionContext _localctx = new WindowDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_windowDefinition);
		try {
			setState(301);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(299); physicalWindow();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(300); logicalWindow();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterPhysicalWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitPhysicalWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitPhysicalWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhysicalWindowContext physicalWindow() throws RecognitionException {
		PhysicalWindowContext _localctx = new PhysicalWindowContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_physicalWindow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303); physicalRange();
			setState(305);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(304); physicalStep();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterPhysicalRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitPhysicalRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitPhysicalRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhysicalRangeContext physicalRange() throws RecognitionException {
		PhysicalRangeContext _localctx = new PhysicalRangeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_physicalRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307); match(T__4);
			setState(308); match(INTEGER);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterPhysicalStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitPhysicalStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitPhysicalStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhysicalStepContext physicalStep() throws RecognitionException {
		PhysicalStepContext _localctx = new PhysicalStepContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_physicalStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310); match(T__33);
			setState(311); match(INTEGER);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterLogicalWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitLogicalWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitLogicalWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalWindowContext logicalWindow() throws RecognitionException {
		LogicalWindowContext _localctx = new LogicalWindowContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logicalWindow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); logicalRange();
			setState(315);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(314); logicalStep();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterLogicalRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitLogicalRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitLogicalRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalRangeContext logicalRange() throws RecognitionException {
		LogicalRangeContext _localctx = new LogicalRangeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_logicalRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317); match(T__14);
			setState(318); duration();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterLogicalStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitLogicalStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitLogicalStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalStepContext logicalStep() throws RecognitionException {
		LogicalStepContext _localctx = new LogicalStepContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_logicalStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320); match(T__33);
			setState(321); duration();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323); match(T__77);
			setState(324); groupGraphPattern();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitDuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitDuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DurationContext duration() throws RecognitionException {
		DurationContext _localctx = new DurationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_duration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326); match(DURATION);
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
		public LimitOffsetClausesContext limitOffsetClauses() {
			return getRuleContext(LimitOffsetClausesContext.class,0);
		}
		public OrderClauseContext orderClause() {
			return getRuleContext(OrderClauseContext.class,0);
		}
		public SolutionModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solutionModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterSolutionModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitSolutionModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitSolutionModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SolutionModifierContext solutionModifier() throws RecognitionException {
		SolutionModifierContext _localctx = new SolutionModifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_solutionModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_la = _input.LA(1);
			if (_la==T__43) {
				{
				setState(328); groupClause();
				}
			}

			setState(332);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(331); havingClause();
				}
			}

			setState(335);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(334); orderClause();
				}
			}

			setState(338);
			_la = _input.LA(1);
			if (_la==T__24 || _la==T__11) {
				{
				setState(337); limitOffsetClauses();
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
		public GroupConditionContext groupCondition(int i) {
			return getRuleContext(GroupConditionContext.class,i);
		}
		public List<GroupConditionContext> groupCondition() {
			return getRuleContexts(GroupConditionContext.class);
		}
		public GroupClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterGroupClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitGroupClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitGroupClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupClauseContext groupClause() throws RecognitionException {
		GroupClauseContext _localctx = new GroupClauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_groupClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340); match(T__43);
			setState(341); match(T__21);
			setState(343); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(342); groupCondition();
				}
				}
				setState(345); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__107) | (1L << T__106) | (1L << T__101) | (1L << T__100) | (1L << T__97) | (1L << T__96) | (1L << T__93) | (1L << T__90) | (1L << T__87) | (1L << T__86) | (1L << T__84) | (1L << T__81) | (1L << T__76) | (1L << T__75) | (1L << T__70) | (1L << T__69) | (1L << T__67) | (1L << T__66) | (1L << T__65) | (1L << T__64) | (1L << T__63) | (1L << T__61) | (1L << T__59) | (1L << T__58) | (1L << T__56) | (1L << T__55) | (1L << T__51) | (1L << T__50))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__47 - 65)) | (1L << (T__45 - 65)) | (1L << (T__44 - 65)) | (1L << (T__41 - 65)) | (1L << (T__40 - 65)) | (1L << (T__39 - 65)) | (1L << (T__38 - 65)) | (1L << (T__37 - 65)) | (1L << (T__36 - 65)) | (1L << (T__35 - 65)) | (1L << (T__34 - 65)) | (1L << (T__32 - 65)) | (1L << (T__31 - 65)) | (1L << (T__30 - 65)) | (1L << (T__28 - 65)) | (1L << (T__27 - 65)) | (1L << (T__26 - 65)) | (1L << (T__23 - 65)) | (1L << (T__22 - 65)) | (1L << (T__20 - 65)) | (1L << (T__18 - 65)) | (1L << (T__17 - 65)) | (1L << (T__16 - 65)) | (1L << (T__15 - 65)) | (1L << (T__7 - 65)) | (1L << (T__6 - 65)) | (1L << (T__5 - 65)) | (1L << (T__1 - 65)) | (1L << (NOT - 65)) | (1L << (VAR - 65)))) != 0) );
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
		public TerminalNode VAR() { return getToken(RSPQLParser.VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BuiltInCallContext builtInCall() {
			return getRuleContext(BuiltInCallContext.class,0);
		}
		public GroupConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterGroupCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitGroupCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitGroupCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupConditionContext groupCondition() throws RecognitionException {
		GroupConditionContext _localctx = new GroupConditionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_groupCondition);
		int _la;
		try {
			setState(357);
			switch (_input.LA(1)) {
			case T__110:
			case T__109:
			case T__108:
			case T__107:
			case T__106:
			case T__101:
			case T__100:
			case T__97:
			case T__96:
			case T__93:
			case T__90:
			case T__87:
			case T__86:
			case T__84:
			case T__81:
			case T__76:
			case T__75:
			case T__70:
			case T__69:
			case T__67:
			case T__66:
			case T__65:
			case T__64:
			case T__63:
			case T__61:
			case T__59:
			case T__58:
			case T__56:
			case T__55:
			case T__51:
			case T__50:
			case T__47:
			case T__45:
			case T__44:
			case T__41:
			case T__40:
			case T__39:
			case T__38:
			case T__36:
			case T__35:
			case T__34:
			case T__32:
			case T__31:
			case T__30:
			case T__28:
			case T__27:
			case T__26:
			case T__23:
			case T__22:
			case T__20:
			case T__18:
			case T__17:
			case T__16:
			case T__15:
			case T__7:
			case T__6:
			case T__5:
			case T__1:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(347); builtInCall();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(348); match(T__37);
				setState(349); expression();
				setState(352);
				_la = _input.LA(1);
				if (_la==T__79) {
					{
					setState(350); match(T__79);
					setState(351); match(VAR);
					}
				}

				setState(354); match(T__54);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(356); match(VAR);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_havingClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359); match(T__29);
			setState(361); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(360); havingCondition();
				}
				}
				setState(363); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__107) | (1L << T__106) | (1L << T__101) | (1L << T__100) | (1L << T__97) | (1L << T__96) | (1L << T__93) | (1L << T__90) | (1L << T__87) | (1L << T__86) | (1L << T__84) | (1L << T__81) | (1L << T__76) | (1L << T__75) | (1L << T__70) | (1L << T__69) | (1L << T__67) | (1L << T__66) | (1L << T__65) | (1L << T__64) | (1L << T__63) | (1L << T__61) | (1L << T__59) | (1L << T__58) | (1L << T__56) | (1L << T__55) | (1L << T__51) | (1L << T__50))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__47 - 65)) | (1L << (T__45 - 65)) | (1L << (T__44 - 65)) | (1L << (T__41 - 65)) | (1L << (T__40 - 65)) | (1L << (T__39 - 65)) | (1L << (T__38 - 65)) | (1L << (T__37 - 65)) | (1L << (T__36 - 65)) | (1L << (T__35 - 65)) | (1L << (T__34 - 65)) | (1L << (T__32 - 65)) | (1L << (T__31 - 65)) | (1L << (T__30 - 65)) | (1L << (T__28 - 65)) | (1L << (T__27 - 65)) | (1L << (T__26 - 65)) | (1L << (T__23 - 65)) | (1L << (T__22 - 65)) | (1L << (T__20 - 65)) | (1L << (T__18 - 65)) | (1L << (T__17 - 65)) | (1L << (T__16 - 65)) | (1L << (T__15 - 65)) | (1L << (T__7 - 65)) | (1L << (T__6 - 65)) | (1L << (T__5 - 65)) | (1L << (T__1 - 65)) | (1L << (NOT - 65)))) != 0) );
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterHavingCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitHavingCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitHavingCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingConditionContext havingCondition() throws RecognitionException {
		HavingConditionContext _localctx = new HavingConditionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_havingCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365); constraint();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterOrderClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitOrderClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitOrderClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderClauseContext orderClause() throws RecognitionException {
		OrderClauseContext _localctx = new OrderClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_orderClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367); match(T__12);
			setState(368); match(T__21);
			setState(370); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(369); orderCondition();
				}
				}
				setState(372); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__110) | (1L << T__109) | (1L << T__108) | (1L << T__107) | (1L << T__106) | (1L << T__101) | (1L << T__100) | (1L << T__97) | (1L << T__96) | (1L << T__94) | (1L << T__93) | (1L << T__90) | (1L << T__87) | (1L << T__86) | (1L << T__84) | (1L << T__81) | (1L << T__76) | (1L << T__75) | (1L << T__70) | (1L << T__69) | (1L << T__67) | (1L << T__66) | (1L << T__65) | (1L << T__64) | (1L << T__63) | (1L << T__61) | (1L << T__59) | (1L << T__58) | (1L << T__56) | (1L << T__55) | (1L << T__53) | (1L << T__51) | (1L << T__50))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__47 - 65)) | (1L << (T__45 - 65)) | (1L << (T__44 - 65)) | (1L << (T__41 - 65)) | (1L << (T__40 - 65)) | (1L << (T__39 - 65)) | (1L << (T__38 - 65)) | (1L << (T__37 - 65)) | (1L << (T__36 - 65)) | (1L << (T__35 - 65)) | (1L << (T__34 - 65)) | (1L << (T__32 - 65)) | (1L << (T__31 - 65)) | (1L << (T__30 - 65)) | (1L << (T__28 - 65)) | (1L << (T__27 - 65)) | (1L << (T__26 - 65)) | (1L << (T__23 - 65)) | (1L << (T__22 - 65)) | (1L << (T__20 - 65)) | (1L << (T__18 - 65)) | (1L << (T__17 - 65)) | (1L << (T__16 - 65)) | (1L << (T__15 - 65)) | (1L << (T__7 - 65)) | (1L << (T__6 - 65)) | (1L << (T__5 - 65)) | (1L << (T__1 - 65)) | (1L << (NOT - 65)) | (1L << (VAR - 65)))) != 0) );
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
		public TerminalNode VAR() { return getToken(RSPQLParser.VAR, 0); }
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public BrackettedExpressionContext brackettedExpression() {
			return getRuleContext(BrackettedExpressionContext.class,0);
		}
		public OrderConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterOrderCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitOrderCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitOrderCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderConditionContext orderCondition() throws RecognitionException {
		OrderConditionContext _localctx = new OrderConditionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_orderCondition);
		int _la;
		try {
			setState(380);
			switch (_input.LA(1)) {
			case T__94:
			case T__53:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(374);
				_la = _input.LA(1);
				if ( !(_la==T__94 || _la==T__53) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(375); brackettedExpression();
				}
				}
				break;
			case T__110:
			case T__109:
			case T__108:
			case T__107:
			case T__106:
			case T__101:
			case T__100:
			case T__97:
			case T__96:
			case T__93:
			case T__90:
			case T__87:
			case T__86:
			case T__84:
			case T__81:
			case T__76:
			case T__75:
			case T__70:
			case T__69:
			case T__67:
			case T__66:
			case T__65:
			case T__64:
			case T__63:
			case T__61:
			case T__59:
			case T__58:
			case T__56:
			case T__55:
			case T__51:
			case T__50:
			case T__47:
			case T__45:
			case T__44:
			case T__41:
			case T__40:
			case T__39:
			case T__38:
			case T__37:
			case T__36:
			case T__35:
			case T__34:
			case T__32:
			case T__31:
			case T__30:
			case T__28:
			case T__27:
			case T__26:
			case T__23:
			case T__22:
			case T__20:
			case T__18:
			case T__17:
			case T__16:
			case T__15:
			case T__7:
			case T__6:
			case T__5:
			case T__1:
			case NOT:
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				switch (_input.LA(1)) {
				case T__110:
				case T__109:
				case T__108:
				case T__107:
				case T__106:
				case T__101:
				case T__100:
				case T__97:
				case T__96:
				case T__93:
				case T__90:
				case T__87:
				case T__86:
				case T__84:
				case T__81:
				case T__76:
				case T__75:
				case T__70:
				case T__69:
				case T__67:
				case T__66:
				case T__65:
				case T__64:
				case T__63:
				case T__61:
				case T__59:
				case T__58:
				case T__56:
				case T__55:
				case T__51:
				case T__50:
				case T__47:
				case T__45:
				case T__44:
				case T__41:
				case T__40:
				case T__39:
				case T__38:
				case T__37:
				case T__36:
				case T__35:
				case T__34:
				case T__32:
				case T__31:
				case T__30:
				case T__28:
				case T__27:
				case T__26:
				case T__23:
				case T__22:
				case T__20:
				case T__18:
				case T__17:
				case T__16:
				case T__15:
				case T__7:
				case T__6:
				case T__5:
				case T__1:
				case NOT:
					{
					setState(376); constraint();
					}
					break;
				case VAR:
					{
					setState(377); match(VAR);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterLimitOffsetClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitLimitOffsetClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitLimitOffsetClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitOffsetClausesContext limitOffsetClauses() throws RecognitionException {
		LimitOffsetClausesContext _localctx = new LimitOffsetClausesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_limitOffsetClauses);
		int _la;
		try {
			setState(390);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(382); limitClause();
				setState(384);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(383); offsetClause();
					}
				}

				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(386); offsetClause();
				setState(388);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(387); limitClause();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392); match(T__24);
			setState(393); match(INTEGER);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterOffsetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitOffsetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitOffsetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetClauseContext offsetClause() throws RecognitionException {
		OffsetClauseContext _localctx = new OffsetClauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_offsetClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395); match(T__11);
			setState(396); match(INTEGER);
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
		public GraphPatternSubContext graphPatternSub(int i) {
			return getRuleContext(GraphPatternSubContext.class,i);
		}
		public List<GraphPatternSubContext> graphPatternSub() {
			return getRuleContexts(GraphPatternSubContext.class);
		}
		public GroupGraphPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupGraphPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterGroupGraphPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitGroupGraphPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitGroupGraphPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupGraphPatternContext groupGraphPattern() throws RecognitionException {
		GroupGraphPatternContext _localctx = new GroupGraphPatternContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_groupGraphPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398); match(T__46);
			setState(400); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(399); graphPatternSub();
				}
				}
				setState(402); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (T__85 - 27)) | (1L << (T__78 - 27)) | (1L << (T__62 - 27)) | (1L << (T__60 - 27)) | (1L << (T__52 - 27)) | (1L << (T__49 - 27)) | (1L << (T__46 - 27)))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (T__9 - 103)) | (1L << (T__8 - 103)) | (1L << (BOOL - 103)) | (1L << (IRIREF - 103)) | (1L << (PNAME_NS - 103)) | (1L << (PNAME_LN - 103)) | (1L << (BLANK_NODE_LABEL - 103)) | (1L << (VAR - 103)) | (1L << (INTEGER - 103)) | (1L << (DECIMAL - 103)) | (1L << (DOUBLE - 103)) | (1L << (INTEGER_POSITIVE - 103)) | (1L << (DECIMAL_POSITIVE - 103)) | (1L << (DOUBLE_POSITIVE - 103)) | (1L << (INTEGER_NEGATIVE - 103)) | (1L << (DECIMAL_NEGATIVE - 103)) | (1L << (DOUBLE_NEGATIVE - 103)) | (1L << (STRING_LITERAL1 - 103)) | (1L << (STRING_LITERAL2 - 103)) | (1L << (STRING_LITERAL_LONG1 - 103)) | (1L << (STRING_LITERAL_LONG2 - 103)) | (1L << (NIL - 103)) | (1L << (ANON - 103)))) != 0) );
			setState(404); match(T__71);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterGraphPatternSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitGraphPatternSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitGraphPatternSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GraphPatternSubContext graphPatternSub() throws RecognitionException {
		GraphPatternSubContext _localctx = new GraphPatternSubContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_graphPatternSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			switch (_input.LA(1)) {
			case T__62:
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
				setState(406); triplesSameSubject();
				setState(408);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(407); match(T__10);
					}
				}

				}
				break;
			case T__85:
			case T__78:
			case T__60:
			case T__52:
			case T__49:
			case T__46:
			case T__9:
			case T__8:
				{
				setState(410); graphPatternNotTriples();
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
		public PropertyListNotEmptyContext propertyListNotEmpty() {
			return getRuleContext(PropertyListNotEmptyContext.class,0);
		}
		public VarOrTermContext varOrTerm() {
			return getRuleContext(VarOrTermContext.class,0);
		}
		public BlankNodePropertyListContext blankNodePropertyList() {
			return getRuleContext(BlankNodePropertyListContext.class,0);
		}
		public TriplesSameSubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triplesSameSubject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterTriplesSameSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitTriplesSameSubject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitTriplesSameSubject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriplesSameSubjectContext triplesSameSubject() throws RecognitionException {
		TriplesSameSubjectContext _localctx = new TriplesSameSubjectContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_triplesSameSubject);
		try {
			setState(420);
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
				setState(413); varOrTerm();
				setState(414); propertyListNotEmpty();
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 2);
				{
				setState(416); blankNodePropertyList();
				setState(418);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(417); propertyListNotEmpty();
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
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyListNotEmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyListNotEmpty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterPropertyListNotEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitPropertyListNotEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitPropertyListNotEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyListNotEmptyContext propertyListNotEmpty() throws RecognitionException {
		PropertyListNotEmptyContext _localctx = new PropertyListNotEmptyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_propertyListNotEmpty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422); property();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__73) {
				{
				{
				setState(423); match(T__73);
				setState(425);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(424); property();
					}
					break;
				}
				}
				}
				setState(431);
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
		public ObjectListContext objectList() {
			return getRuleContext(ObjectListContext.class,0);
		}
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432); verb();
			setState(433); objectList();
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
		public TerminalNode TYPE() { return getToken(RSPQLParser.TYPE, 0); }
		public VarOrIriContext varOrIri() {
			return getRuleContext(VarOrIriContext.class,0);
		}
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitVerb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitVerb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_verb);
		try {
			setState(437);
			switch (_input.LA(1)) {
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(435); varOrIri();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(436); match(TYPE);
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
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterObjectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitObjectList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitObjectList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectListContext objectList() throws RecognitionException {
		ObjectListContext _localctx = new ObjectListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_objectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439); object();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__99) {
				{
				{
				setState(440); match(T__99);
				setState(441); object();
				}
				}
				setState(446);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_object);
		try {
			setState(449);
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
				setState(447); varOrTerm();
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 2);
				{
				setState(448); blankNodePropertyList();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterBlankNodePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitBlankNodePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitBlankNodePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlankNodePropertyListContext blankNodePropertyList() throws RecognitionException {
		BlankNodePropertyListContext _localctx = new BlankNodePropertyListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_blankNodePropertyList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451); match(T__62);
			setState(452); propertyListNotEmpty();
			setState(453); match(T__89);
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
		public WindowGraphPatternContext windowGraphPattern() {
			return getRuleContext(WindowGraphPatternContext.class,0);
		}
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public MinusGraphPatternContext minusGraphPattern() {
			return getRuleContext(MinusGraphPatternContext.class,0);
		}
		public OptionalGraphPatternContext optionalGraphPattern() {
			return getRuleContext(OptionalGraphPatternContext.class,0);
		}
		public GroupOrUnionGraphPatternContext groupOrUnionGraphPattern() {
			return getRuleContext(GroupOrUnionGraphPatternContext.class,0);
		}
		public ServiceGraphPatternContext serviceGraphPattern() {
			return getRuleContext(ServiceGraphPatternContext.class,0);
		}
		public BindPatternContext bindPattern() {
			return getRuleContext(BindPatternContext.class,0);
		}
		public GraphGraphPatternContext graphGraphPattern() {
			return getRuleContext(GraphGraphPatternContext.class,0);
		}
		public GraphPatternNotTriplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphPatternNotTriples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterGraphPatternNotTriples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitGraphPatternNotTriples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitGraphPatternNotTriples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GraphPatternNotTriplesContext graphPatternNotTriples() throws RecognitionException {
		GraphPatternNotTriplesContext _localctx = new GraphPatternNotTriplesContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_graphPatternNotTriples);
		try {
			setState(463);
			switch (_input.LA(1)) {
			case T__46:
				enterOuterAlt(_localctx, 1);
				{
				setState(455); groupOrUnionGraphPattern();
				}
				break;
			case T__85:
				enterOuterAlt(_localctx, 2);
				{
				setState(456); optionalGraphPattern();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(457); minusGraphPattern();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 4);
				{
				setState(458); graphGraphPattern();
				}
				break;
			case T__78:
				enterOuterAlt(_localctx, 5);
				{
				setState(459); windowGraphPattern();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(460); serviceGraphPattern();
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 7);
				{
				setState(461); filter();
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 8);
				{
				setState(462); bindPattern();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterGroupOrUnionGraphPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitGroupOrUnionGraphPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitGroupOrUnionGraphPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupOrUnionGraphPatternContext groupOrUnionGraphPattern() throws RecognitionException {
		GroupOrUnionGraphPatternContext _localctx = new GroupOrUnionGraphPatternContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_groupOrUnionGraphPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465); groupGraphPattern();
			setState(468); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(466); match(T__74);
				setState(467); groupGraphPattern();
				}
				}
				setState(470); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__74 );
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterOptionalGraphPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitOptionalGraphPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitOptionalGraphPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalGraphPatternContext optionalGraphPattern() throws RecognitionException {
		OptionalGraphPatternContext _localctx = new OptionalGraphPatternContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_optionalGraphPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472); match(T__85);
			setState(473); groupGraphPattern();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterMinusGraphPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitMinusGraphPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitMinusGraphPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinusGraphPatternContext minusGraphPattern() throws RecognitionException {
		MinusGraphPatternContext _localctx = new MinusGraphPatternContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_minusGraphPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475); match(T__9);
			setState(476); groupGraphPattern();
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
		public GroupGraphPatternContext groupGraphPattern() {
			return getRuleContext(GroupGraphPatternContext.class,0);
		}
		public VarOrIriContext varOrIri() {
			return getRuleContext(VarOrIriContext.class,0);
		}
		public GraphGraphPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphGraphPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterGraphGraphPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitGraphGraphPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitGraphGraphPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GraphGraphPatternContext graphGraphPattern() throws RecognitionException {
		GraphGraphPatternContext _localctx = new GraphGraphPatternContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_graphGraphPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478); match(T__49);
			setState(479); varOrIri();
			setState(480); groupGraphPattern();
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
		public GroupGraphPatternContext groupGraphPattern() {
			return getRuleContext(GroupGraphPatternContext.class,0);
		}
		public VarOrIriContext varOrIri() {
			return getRuleContext(VarOrIriContext.class,0);
		}
		public WindowGraphPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowGraphPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterWindowGraphPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitWindowGraphPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitWindowGraphPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowGraphPatternContext windowGraphPattern() throws RecognitionException {
		WindowGraphPatternContext _localctx = new WindowGraphPatternContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_windowGraphPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482); match(T__78);
			setState(483); varOrIri();
			setState(484); groupGraphPattern();
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

	public static class ServiceGraphPatternContext extends ParserRuleContext {
		public GroupGraphPatternContext groupGraphPattern() {
			return getRuleContext(GroupGraphPatternContext.class,0);
		}
		public VarOrIriContext varOrIri() {
			return getRuleContext(VarOrIriContext.class,0);
		}
		public ServiceGraphPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceGraphPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterServiceGraphPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitServiceGraphPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitServiceGraphPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceGraphPatternContext serviceGraphPattern() throws RecognitionException {
		ServiceGraphPatternContext _localctx = new ServiceGraphPatternContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_serviceGraphPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486); match(T__8);
			setState(488);
			_la = _input.LA(1);
			if (_la==T__80) {
				{
				setState(487); match(T__80);
				}
			}

			setState(490); varOrIri();
			setState(491); groupGraphPattern();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493); match(T__52);
			setState(494); constraint();
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
		public TerminalNode VAR() { return getToken(RSPQLParser.VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BindPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterBindPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitBindPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitBindPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindPatternContext bindPattern() throws RecognitionException {
		BindPatternContext _localctx = new BindPatternContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_bindPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496); match(T__60);
			setState(497); match(T__37);
			setState(498); expression();
			setState(499); match(T__79);
			setState(500); match(VAR);
			setState(501); match(T__54);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterVarOrTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitVarOrTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitVarOrTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarOrTermContext varOrTerm() throws RecognitionException {
		VarOrTermContext _localctx = new VarOrTermContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_varOrTerm);
		try {
			setState(505);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(503); match(VAR);
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
				setState(504); graphTerm();
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

	public static class VarOrIriContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(RSPQLParser.VAR, 0); }
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public VarOrIriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varOrIri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterVarOrIri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitVarOrIri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitVarOrIri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarOrIriContext varOrIri() throws RecognitionException {
		VarOrIriContext _localctx = new VarOrIriContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_varOrIri);
		try {
			setState(509);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(507); match(VAR);
				}
				break;
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(508); iri();
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
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public BlankNodeContext blankNode() {
			return getRuleContext(BlankNodeContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(RSPQLParser.BOOL, 0); }
		public RdfliteralContext rdfliteral() {
			return getRuleContext(RdfliteralContext.class,0);
		}
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public TerminalNode NIL() { return getToken(RSPQLParser.NIL, 0); }
		public GraphTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterGraphTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitGraphTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitGraphTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GraphTermContext graphTerm() throws RecognitionException {
		GraphTermContext _localctx = new GraphTermContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_graphTerm);
		try {
			setState(517);
			switch (_input.LA(1)) {
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(511); iri();
				}
				break;
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
				enterOuterAlt(_localctx, 2);
				{
				setState(512); rdfliteral();
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
				setState(513); numericLiteral();
				}
				break;
			case BLANK_NODE_LABEL:
			case ANON:
				enterOuterAlt(_localctx, 4);
				{
				setState(514); blankNode();
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 5);
				{
				setState(515); match(NIL);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(516); match(BOOL);
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
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public List<ConditionalAndExpressionContext> conditionalAndExpression() {
			return getRuleContexts(ConditionalAndExpressionContext.class);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519); conditionalAndExpression();
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(520); match(T__19);
				setState(521); conditionalAndExpression();
				}
				}
				setState(526);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527); valueLogical();
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__104) {
				{
				{
				setState(528); match(T__104);
				setState(529); valueLogical();
				}
				}
				setState(534);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterValueLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitValueLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitValueLogical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueLogicalContext valueLogical() throws RecognitionException {
		ValueLogicalContext _localctx = new ValueLogicalContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_valueLogical);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535); relationalExpression();
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
		public TerminalNode NOT() { return getToken(RSPQLParser.NOT, 0); }
		public NumericExpressionContext numericExpression(int i) {
			return getRuleContext(NumericExpressionContext.class,i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public List<NumericExpressionContext> numericExpression() {
			return getRuleContexts(NumericExpressionContext.class);
		}
		public TerminalNode BINARY_OPERATOR() { return getToken(RSPQLParser.BINARY_OPERATOR, 0); }
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537); numericExpression();
			setState(545);
			switch (_input.LA(1)) {
			case BINARY_OPERATOR:
				{
				setState(538); match(BINARY_OPERATOR);
				setState(539); numericExpression();
				}
				break;
			case T__2:
			case NOT:
				{
				setState(541);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(540); match(NOT);
					}
				}

				setState(543); match(T__2);
				setState(544); expressionList();
				}
				break;
			case T__104:
			case T__99:
			case T__79:
			case T__73:
			case T__54:
			case T__19:
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547); match(T__37);
			setState(548); expression();
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__99) {
				{
				{
				setState(549); match(T__99);
				setState(550); expression();
				}
				}
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(556); match(T__54);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterNumericExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitNumericExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitNumericExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericExpressionContext numericExpression() throws RecognitionException {
		NumericExpressionContext _localctx = new NumericExpressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_numericExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558); multiplicativeExpression();
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__82 || _la==T__0) {
				{
				{
				setState(559);
				((NumericExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__82 || _la==T__0) ) {
					((NumericExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(560); multiplicativeExpression();
				}
				}
				setState(565);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566); unaryExpression();
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25 || _la==STAR) {
				{
				{
				setState(567);
				((MultiplicativeExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==STAR) ) {
					((MultiplicativeExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(568); unaryExpression();
				}
				}
				setState(573);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_unaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			_la = _input.LA(1);
			if (_la==T__82 || _la==T__57 || _la==T__0) {
				{
				setState(574);
				((UnaryExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__82 || _la==T__57 || _la==T__0) ) {
					((UnaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(577); primaryExpression();
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
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(RSPQLParser.BOOL, 0); }
		public TerminalNode VAR() { return getToken(RSPQLParser.VAR, 0); }
		public RdfliteralContext rdfliteral() {
			return getRuleContext(RdfliteralContext.class,0);
		}
		public BrackettedExpressionContext brackettedExpression() {
			return getRuleContext(BrackettedExpressionContext.class,0);
		}
		public BuiltInCallContext builtInCall() {
			return getRuleContext(BuiltInCallContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_primaryExpression);
		try {
			setState(585);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(579); brackettedExpression();
				}
				break;
			case T__110:
			case T__109:
			case T__108:
			case T__107:
			case T__106:
			case T__101:
			case T__100:
			case T__97:
			case T__96:
			case T__93:
			case T__90:
			case T__87:
			case T__86:
			case T__84:
			case T__81:
			case T__76:
			case T__75:
			case T__70:
			case T__69:
			case T__67:
			case T__66:
			case T__65:
			case T__64:
			case T__63:
			case T__61:
			case T__59:
			case T__58:
			case T__56:
			case T__55:
			case T__51:
			case T__50:
			case T__47:
			case T__45:
			case T__44:
			case T__41:
			case T__40:
			case T__39:
			case T__38:
			case T__36:
			case T__35:
			case T__34:
			case T__32:
			case T__31:
			case T__30:
			case T__28:
			case T__27:
			case T__26:
			case T__23:
			case T__22:
			case T__20:
			case T__18:
			case T__17:
			case T__16:
			case T__15:
			case T__7:
			case T__6:
			case T__5:
			case T__1:
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(580); builtInCall();
				}
				break;
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
				enterOuterAlt(_localctx, 3);
				{
				setState(581); rdfliteral();
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
				setState(582); numericLiteral();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(583); match(BOOL);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(584); match(VAR);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterBrackettedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitBrackettedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitBrackettedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BrackettedExpressionContext brackettedExpression() throws RecognitionException {
		BrackettedExpressionContext _localctx = new BrackettedExpressionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_brackettedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587); match(T__37);
			setState(588); expression();
			setState(589); match(T__54);
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
		public TerminalNode NOT() { return getToken(RSPQLParser.NOT, 0); }
		public TernaryOrBinaryBuiltinContext ternaryOrBinaryBuiltin() {
			return getRuleContext(TernaryOrBinaryBuiltinContext.class,0);
		}
		public UnaryBuiltinContext unaryBuiltin() {
			return getRuleContext(UnaryBuiltinContext.class,0);
		}
		public TernaryBuiltinContext ternaryBuiltin() {
			return getRuleContext(TernaryBuiltinContext.class,0);
		}
		public StrReplaceExpressionContext strReplaceExpression() {
			return getRuleContext(StrReplaceExpressionContext.class,0);
		}
		public BoundExpressionContext boundExpression() {
			return getRuleContext(BoundExpressionContext.class,0);
		}
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public BinaryBuiltinContext binaryBuiltin() {
			return getRuleContext(BinaryBuiltinContext.class,0);
		}
		public ExistsFuncContext existsFunc() {
			return getRuleContext(ExistsFuncContext.class,0);
		}
		public BuiltInCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterBuiltInCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitBuiltInCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitBuiltInCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltInCallContext builtInCall() throws RecognitionException {
		BuiltInCallContext _localctx = new BuiltInCallContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_builtInCall);
		int _la;
		try {
			setState(602);
			switch (_input.LA(1)) {
			case T__109:
			case T__63:
			case T__55:
			case T__30:
			case T__26:
			case T__6:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(591); aggregate();
				}
				break;
			case T__110:
			case T__107:
			case T__106:
			case T__100:
			case T__97:
			case T__93:
			case T__90:
			case T__87:
			case T__86:
			case T__84:
			case T__81:
			case T__75:
			case T__70:
			case T__69:
			case T__67:
			case T__65:
			case T__64:
			case T__61:
			case T__59:
			case T__58:
			case T__51:
			case T__50:
			case T__47:
			case T__44:
			case T__40:
			case T__39:
			case T__38:
			case T__36:
			case T__35:
			case T__32:
			case T__31:
			case T__28:
			case T__23:
			case T__20:
			case T__18:
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(592); unaryBuiltin();
				}
				break;
			case T__101:
			case T__96:
			case T__76:
			case T__66:
			case T__45:
			case T__41:
			case T__22:
			case T__7:
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(593); binaryBuiltin();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(594); ternaryBuiltin();
				}
				break;
			case T__56:
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(595); ternaryOrBinaryBuiltin();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 6);
				{
				setState(596); strReplaceExpression();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 7);
				{
				setState(597); boundExpression();
				}
				break;
			case T__108:
			case NOT:
				enterOuterAlt(_localctx, 8);
				{
				setState(599);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(598); match(NOT);
					}
				}

				setState(601); existsFunc();
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
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public TerminalNode LANGTAG() { return getToken(RSPQLParser.LANGTAG, 0); }
		public RdfliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rdfliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterRdfliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitRdfliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitRdfliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RdfliteralContext rdfliteral() throws RecognitionException {
		RdfliteralContext _localctx = new RdfliteralContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_rdfliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604); string();
			setState(608);
			switch (_input.LA(1)) {
			case LANGTAG:
				{
				setState(605); match(LANGTAG);
				}
				break;
			case T__105:
				{
				{
				setState(606); match(T__105);
				setState(607); iri();
				}
				}
				break;
			case T__104:
			case T__99:
			case T__89:
			case T__85:
			case T__82:
			case T__79:
			case T__78:
			case T__73:
			case T__71:
			case T__62:
			case T__60:
			case T__54:
			case T__52:
			case T__49:
			case T__46:
			case T__25:
			case T__19:
			case T__10:
			case T__9:
			case T__8:
			case T__2:
			case T__0:
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

	public static class NumericLiteralContext extends ParserRuleContext {
		public NumericLiteralNegativeContext numericLiteralNegative() {
			return getRuleContext(NumericLiteralNegativeContext.class,0);
		}
		public NumericLiteralUnsignedContext numericLiteralUnsigned() {
			return getRuleContext(NumericLiteralUnsignedContext.class,0);
		}
		public NumericLiteralPositiveContext numericLiteralPositive() {
			return getRuleContext(NumericLiteralPositiveContext.class,0);
		}
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_numericLiteral);
		try {
			setState(613);
			switch (_input.LA(1)) {
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(610); numericLiteralUnsigned();
				}
				break;
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(611); numericLiteralPositive();
				}
				break;
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(612); numericLiteralNegative();
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
		public TerminalNode DECIMAL() { return getToken(RSPQLParser.DECIMAL, 0); }
		public TerminalNode INTEGER() { return getToken(RSPQLParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(RSPQLParser.DOUBLE, 0); }
		public NumericLiteralUnsignedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteralUnsigned; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterNumericLiteralUnsigned(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitNumericLiteralUnsigned(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitNumericLiteralUnsigned(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericLiteralUnsignedContext numericLiteralUnsigned() throws RecognitionException {
		NumericLiteralUnsignedContext _localctx = new NumericLiteralUnsignedContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_numericLiteralUnsigned);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			_la = _input.LA(1);
			if ( !(((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (INTEGER - 128)) | (1L << (DECIMAL - 128)) | (1L << (DOUBLE - 128)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public TerminalNode DECIMAL_POSITIVE() { return getToken(RSPQLParser.DECIMAL_POSITIVE, 0); }
		public TerminalNode DOUBLE_POSITIVE() { return getToken(RSPQLParser.DOUBLE_POSITIVE, 0); }
		public TerminalNode INTEGER_POSITIVE() { return getToken(RSPQLParser.INTEGER_POSITIVE, 0); }
		public NumericLiteralPositiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteralPositive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterNumericLiteralPositive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitNumericLiteralPositive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitNumericLiteralPositive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericLiteralPositiveContext numericLiteralPositive() throws RecognitionException {
		NumericLiteralPositiveContext _localctx = new NumericLiteralPositiveContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_numericLiteralPositive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			_la = _input.LA(1);
			if ( !(((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (INTEGER_POSITIVE - 131)) | (1L << (DECIMAL_POSITIVE - 131)) | (1L << (DOUBLE_POSITIVE - 131)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterNumericLiteralNegative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitNumericLiteralNegative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitNumericLiteralNegative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericLiteralNegativeContext numericLiteralNegative() throws RecognitionException {
		NumericLiteralNegativeContext _localctx = new NumericLiteralNegativeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_numericLiteralNegative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			_la = _input.LA(1);
			if ( !(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (INTEGER_NEGATIVE - 134)) | (1L << (DECIMAL_NEGATIVE - 134)) | (1L << (DOUBLE_NEGATIVE - 134)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DISTINCT() { return getToken(RSPQLParser.DISTINCT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode NIL() { return getToken(RSPQLParser.NIL, 0); }
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_argList);
		int _la;
		try {
			setState(636);
			switch (_input.LA(1)) {
			case NIL:
				enterOuterAlt(_localctx, 1);
				{
				setState(621); match(NIL);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(622); match(T__37);
				setState(624);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(623); match(DISTINCT);
					}
				}

				setState(626); expression();
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__99) {
					{
					{
					setState(627); match(T__99);
					setState(628); expression();
					}
					}
					setState(633);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(634); match(T__54);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_constraint);
		try {
			setState(640);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(638); brackettedExpression();
				}
				break;
			case T__110:
			case T__109:
			case T__108:
			case T__107:
			case T__106:
			case T__101:
			case T__100:
			case T__97:
			case T__96:
			case T__93:
			case T__90:
			case T__87:
			case T__86:
			case T__84:
			case T__81:
			case T__76:
			case T__75:
			case T__70:
			case T__69:
			case T__67:
			case T__66:
			case T__65:
			case T__64:
			case T__63:
			case T__61:
			case T__59:
			case T__58:
			case T__56:
			case T__55:
			case T__51:
			case T__50:
			case T__47:
			case T__45:
			case T__44:
			case T__41:
			case T__40:
			case T__39:
			case T__38:
			case T__36:
			case T__35:
			case T__34:
			case T__32:
			case T__31:
			case T__30:
			case T__28:
			case T__27:
			case T__26:
			case T__23:
			case T__22:
			case T__20:
			case T__18:
			case T__17:
			case T__16:
			case T__15:
			case T__7:
			case T__6:
			case T__5:
			case T__1:
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(639); builtInCall();
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(RSPQLParser.DISTINCT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AggregateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterAggregate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitAggregate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitAggregate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateContext aggregate() throws RecognitionException {
		AggregateContext _localctx = new AggregateContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_aggregate);
		int _la;
		try {
			setState(674);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(642); ((AggregateContext)_localctx).f = match(T__5);
				setState(643); match(T__37);
				setState(645);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(644); match(DISTINCT);
					}
				}

				setState(649);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(647); match(STAR);
					}
					break;
				case T__110:
				case T__109:
				case T__108:
				case T__107:
				case T__106:
				case T__101:
				case T__100:
				case T__97:
				case T__96:
				case T__93:
				case T__90:
				case T__87:
				case T__86:
				case T__84:
				case T__82:
				case T__81:
				case T__76:
				case T__75:
				case T__70:
				case T__69:
				case T__67:
				case T__66:
				case T__65:
				case T__64:
				case T__63:
				case T__61:
				case T__59:
				case T__58:
				case T__57:
				case T__56:
				case T__55:
				case T__51:
				case T__50:
				case T__47:
				case T__45:
				case T__44:
				case T__41:
				case T__40:
				case T__39:
				case T__38:
				case T__37:
				case T__36:
				case T__35:
				case T__34:
				case T__32:
				case T__31:
				case T__30:
				case T__28:
				case T__27:
				case T__26:
				case T__23:
				case T__22:
				case T__20:
				case T__18:
				case T__17:
				case T__16:
				case T__15:
				case T__7:
				case T__6:
				case T__5:
				case T__1:
				case T__0:
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
					setState(648); expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(651); match(T__54);
				}
				break;
			case T__109:
			case T__63:
			case T__30:
			case T__26:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(652);
				((AggregateContext)_localctx).f = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__109 || _la==T__63 || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (T__30 - 82)) | (1L << (T__26 - 82)) | (1L << (T__6 - 82)))) != 0)) ) {
					((AggregateContext)_localctx).f = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(653); match(T__37);
				setState(655);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(654); match(DISTINCT);
					}
				}

				setState(657); expression();
				setState(658); match(T__54);
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 3);
				{
				setState(660); ((AggregateContext)_localctx).f = match(T__55);
				setState(661); match(T__37);
				setState(663);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(662); match(DISTINCT);
					}
				}

				setState(665); expression();
				setState(670);
				_la = _input.LA(1);
				if (_la==T__73) {
					{
					setState(666); match(T__73);
					setState(667); match(T__111);
					setState(668); match(T__103);
					setState(669); string();
					}
				}

				setState(672); match(T__54);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterUnaryBuiltin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitUnaryBuiltin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitUnaryBuiltin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryBuiltinContext unaryBuiltin() throws RecognitionException {
		UnaryBuiltinContext _localctx = new UnaryBuiltinContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_unaryBuiltin);
		int _la;
		try {
			setState(691);
			switch (_input.LA(1)) {
			case T__110:
			case T__107:
			case T__100:
			case T__97:
			case T__93:
			case T__90:
			case T__87:
			case T__86:
			case T__84:
			case T__81:
			case T__75:
			case T__70:
			case T__69:
			case T__67:
			case T__65:
			case T__64:
			case T__59:
			case T__58:
			case T__51:
			case T__50:
			case T__47:
			case T__44:
			case T__38:
			case T__36:
			case T__35:
			case T__32:
			case T__31:
			case T__28:
			case T__20:
			case T__18:
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				((UnaryBuiltinContext)_localctx).f = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__110) | (1L << T__107) | (1L << T__100) | (1L << T__97) | (1L << T__93) | (1L << T__90) | (1L << T__87) | (1L << T__86) | (1L << T__84) | (1L << T__81) | (1L << T__75) | (1L << T__70) | (1L << T__69) | (1L << T__67) | (1L << T__65) | (1L << T__64) | (1L << T__59) | (1L << T__58) | (1L << T__51) | (1L << T__50))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__47 - 65)) | (1L << (T__44 - 65)) | (1L << (T__38 - 65)) | (1L << (T__36 - 65)) | (1L << (T__35 - 65)) | (1L << (T__32 - 65)) | (1L << (T__31 - 65)) | (1L << (T__28 - 65)) | (1L << (T__20 - 65)) | (1L << (T__18 - 65)) | (1L << (T__16 - 65)))) != 0)) ) {
					((UnaryBuiltinContext)_localctx).f = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(677); match(T__37);
				setState(678); expression();
				setState(679); match(T__54);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(681); ((UnaryBuiltinContext)_localctx).f = match(T__40);
				setState(687);
				switch (_input.LA(1)) {
				case T__37:
					{
					setState(682); match(T__37);
					setState(683); expression();
					setState(684); match(T__54);
					}
					break;
				case NIL:
					{
					setState(686); match(NIL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__106:
			case T__61:
			case T__39:
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(689);
				((UnaryBuiltinContext)_localctx).f = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__106 || _la==T__61 || _la==T__39 || _la==T__23) ) {
					((UnaryBuiltinContext)_localctx).f = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(690); match(NIL);
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BinaryBuiltinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryBuiltin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterBinaryBuiltin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitBinaryBuiltin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitBinaryBuiltin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryBuiltinContext binaryBuiltin() throws RecognitionException {
		BinaryBuiltinContext _localctx = new BinaryBuiltinContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_binaryBuiltin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			((BinaryBuiltinContext)_localctx).f = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__101) | (1L << T__96) | (1L << T__76) | (1L << T__66))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__45 - 67)) | (1L << (T__41 - 67)) | (1L << (T__22 - 67)) | (1L << (T__7 - 67)) | (1L << (T__1 - 67)))) != 0)) ) {
				((BinaryBuiltinContext)_localctx).f = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(694); match(T__37);
			setState(695); expression();
			setState(696); match(T__99);
			setState(697); expression();
			setState(698); match(T__54);
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TernaryBuiltinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryBuiltin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterTernaryBuiltin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitTernaryBuiltin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitTernaryBuiltin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryBuiltinContext ternaryBuiltin() throws RecognitionException {
		TernaryBuiltinContext _localctx = new TernaryBuiltinContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_ternaryBuiltin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700); match(T__17);
			setState(701); match(T__37);
			setState(702); expression();
			setState(703); match(T__99);
			setState(704); expression();
			setState(705); match(T__99);
			setState(706); expression();
			setState(707); match(T__54);
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TernaryOrBinaryBuiltinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryOrBinaryBuiltin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterTernaryOrBinaryBuiltin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitTernaryOrBinaryBuiltin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitTernaryOrBinaryBuiltin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryOrBinaryBuiltinContext ternaryOrBinaryBuiltin() throws RecognitionException {
		TernaryOrBinaryBuiltinContext _localctx = new TernaryOrBinaryBuiltinContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_ternaryOrBinaryBuiltin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			((TernaryOrBinaryBuiltinContext)_localctx).f = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__56 || _la==T__15) ) {
				((TernaryOrBinaryBuiltinContext)_localctx).f = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(710); match(T__37);
			setState(711); expression();
			setState(712); match(T__99);
			setState(713); expression();
			setState(716);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(714); match(T__99);
				setState(715); expression();
				}
			}

			setState(718); match(T__54);
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public StrReplaceExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strReplaceExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterStrReplaceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitStrReplaceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitStrReplaceExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrReplaceExpressionContext strReplaceExpression() throws RecognitionException {
		StrReplaceExpressionContext _localctx = new StrReplaceExpressionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_strReplaceExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720); match(T__34);
			setState(721); match(T__37);
			setState(722); expression();
			setState(723); match(T__99);
			setState(724); expression();
			setState(725); match(T__99);
			setState(726); expression();
			setState(729);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(727); match(T__99);
				setState(728); expression();
				}
			}

			setState(731); match(T__54);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterBoundExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitBoundExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitBoundExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoundExpressionContext boundExpression() throws RecognitionException {
		BoundExpressionContext _localctx = new BoundExpressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_boundExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733); match(T__27);
			setState(734); match(T__37);
			setState(735); match(VAR);
			setState(736); match(T__54);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterExistsFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitExistsFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitExistsFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistsFuncContext existsFunc() throws RecognitionException {
		ExistsFuncContext _localctx = new ExistsFuncContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_existsFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738); match(T__108);
			setState(739); groupGraphPattern();
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
		public TerminalNode STRING_LITERAL_LONG1() { return getToken(RSPQLParser.STRING_LITERAL_LONG1, 0); }
		public TerminalNode STRING_LITERAL2() { return getToken(RSPQLParser.STRING_LITERAL2, 0); }
		public TerminalNode STRING_LITERAL1() { return getToken(RSPQLParser.STRING_LITERAL1, 0); }
		public TerminalNode STRING_LITERAL_LONG2() { return getToken(RSPQLParser.STRING_LITERAL_LONG2, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			_la = _input.LA(1);
			if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (STRING_LITERAL1 - 138)) | (1L << (STRING_LITERAL2 - 138)) | (1L << (STRING_LITERAL_LONG1 - 138)) | (1L << (STRING_LITERAL_LONG2 - 138)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterIri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitIri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitIri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IriContext iri() throws RecognitionException {
		IriContext _localctx = new IriContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_iri);
		try {
			setState(745);
			switch (_input.LA(1)) {
			case IRIREF:
				enterOuterAlt(_localctx, 1);
				{
				setState(743); match(IRIREF);
				}
				break;
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(744); prefixedName();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterPrefixedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitPrefixedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitPrefixedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixedNameContext prefixedName() throws RecognitionException {
		PrefixedNameContext _localctx = new PrefixedNameContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_prefixedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			_la = _input.LA(1);
			if ( !(_la==PNAME_NS || _la==PNAME_LN) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterBlankNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitBlankNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitBlankNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlankNodeContext blankNode() throws RecognitionException {
		BlankNodeContext _localctx = new BlankNodeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_blankNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			_la = _input.LA(1);
			if ( !(_la==BLANK_NODE_LABEL || _la==ANON) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u009f\u02f2\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\3\3\3\5\3\u00b3\n\3\3\3\3\3\3\3\3\3\5\3\u00b9"+
		"\n\3\3\4\3\4\7\4\u00bd\n\4\f\4\16\4\u00c0\13\4\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\7\b\u00d0\n\b\f\b\16\b\u00d3\13\b\3\b"+
		"\3\b\3\b\3\t\3\t\5\t\u00da\n\t\3\t\6\t\u00dd\n\t\r\t\16\t\u00de\3\t\5"+
		"\t\u00e2\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ed\n\13"+
		"\3\f\3\f\3\f\3\f\5\f\u00f3\n\f\3\f\3\f\7\f\u00f7\n\f\f\f\16\f\u00fa\13"+
		"\f\3\f\3\f\3\f\3\r\3\r\6\r\u0101\n\r\r\r\16\r\u0102\3\r\5\r\u0106\n\r"+
		"\3\r\7\r\u0109\n\r\f\r\16\r\u010c\13\r\3\r\5\r\u010f\n\r\3\r\3\r\3\16"+
		"\3\16\6\16\u0115\n\16\r\16\16\16\u0116\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\5\17\u0120\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\5\22\u0130\n\22\3\23\3\23\5\23\u0134\n\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\3\26\5\26\u013e\n\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\5\33\u014c\n\33\3\33\5\33\u014f"+
		"\n\33\3\33\5\33\u0152\n\33\3\33\5\33\u0155\n\33\3\34\3\34\3\34\6\34\u015a"+
		"\n\34\r\34\16\34\u015b\3\35\3\35\3\35\3\35\3\35\5\35\u0163\n\35\3\35\3"+
		"\35\3\35\5\35\u0168\n\35\3\36\3\36\6\36\u016c\n\36\r\36\16\36\u016d\3"+
		"\37\3\37\3 \3 \3 \6 \u0175\n \r \16 \u0176\3!\3!\3!\3!\5!\u017d\n!\5!"+
		"\u017f\n!\3\"\3\"\5\"\u0183\n\"\3\"\3\"\5\"\u0187\n\"\5\"\u0189\n\"\3"+
		"#\3#\3#\3$\3$\3$\3%\3%\6%\u0193\n%\r%\16%\u0194\3%\3%\3&\3&\5&\u019b\n"+
		"&\3&\5&\u019e\n&\3\'\3\'\3\'\3\'\3\'\5\'\u01a5\n\'\5\'\u01a7\n\'\3(\3"+
		"(\3(\5(\u01ac\n(\7(\u01ae\n(\f(\16(\u01b1\13(\3)\3)\3)\3*\3*\5*\u01b8"+
		"\n*\3+\3+\3+\7+\u01bd\n+\f+\16+\u01c0\13+\3,\3,\5,\u01c4\n,\3-\3-\3-\3"+
		"-\3.\3.\3.\3.\3.\3.\3.\3.\5.\u01d2\n.\3/\3/\3/\6/\u01d7\n/\r/\16/\u01d8"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\5\64\u01eb\n\64\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\5\67\u01fc\n\67\38\38\58\u0200\n8\39\3"+
		"9\39\39\39\39\59\u0208\n9\3:\3:\3:\7:\u020d\n:\f:\16:\u0210\13:\3;\3;"+
		"\3;\7;\u0215\n;\f;\16;\u0218\13;\3<\3<\3=\3=\3=\3=\5=\u0220\n=\3=\3=\5"+
		"=\u0224\n=\3>\3>\3>\3>\7>\u022a\n>\f>\16>\u022d\13>\3>\3>\3?\3?\3?\7?"+
		"\u0234\n?\f?\16?\u0237\13?\3@\3@\3@\7@\u023c\n@\f@\16@\u023f\13@\3A\5"+
		"A\u0242\nA\3A\3A\3B\3B\3B\3B\3B\3B\5B\u024c\nB\3C\3C\3C\3C\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\5D\u025a\nD\3D\5D\u025d\nD\3E\3E\3E\3E\5E\u0263\nE\3F\3"+
		"F\3F\5F\u0268\nF\3G\3G\3H\3H\3I\3I\3J\3J\3J\5J\u0273\nJ\3J\3J\3J\7J\u0278"+
		"\nJ\fJ\16J\u027b\13J\3J\3J\5J\u027f\nJ\3K\3K\5K\u0283\nK\3L\3L\3L\5L\u0288"+
		"\nL\3L\3L\5L\u028c\nL\3L\3L\3L\3L\5L\u0292\nL\3L\3L\3L\3L\3L\3L\5L\u029a"+
		"\nL\3L\3L\3L\3L\3L\5L\u02a1\nL\3L\3L\5L\u02a5\nL\3M\3M\3M\3M\3M\3M\3M"+
		"\3M\3M\3M\3M\5M\u02b2\nM\3M\3M\5M\u02b6\nM\3N\3N\3N\3N\3N\3N\3N\3O\3O"+
		"\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\5P\u02cf\nP\3P\3P\3Q\3Q\3Q"+
		"\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u02dc\nQ\3Q\3Q\3R\3R\3R\3R\3R\3S\3S\3S\3T\3T\3U"+
		"\3U\5U\u02ec\nU\3V\3V\3W\3W\3W\2\2X\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\2\23\5\2\26\26"+
		"eeoo\3\2tu\4\2\24\24==\4\2  rr\4\2YYww\5\2  99rr\3\2\u0082\u0084\3\2\u0085"+
		"\u0087\3\2\u0088\u008a\7\2\5\5\63\63TTXXll\32\2\4\4\7\7\16\16\21\21\25"+
		"\25\30\30\33\34\36\36!!\'\',-//\61\62\678?@CCFFLLNORSVV^^``bb\6\2\b\b"+
		"\65\65KK[[\13\2\r\r\22\22&&\60\60EEII\\\\kkqq\4\2::cc\3\2\u008c\u008f"+
		"\3\2}~\4\2\177\177\u0094\u0094\u0306\2\u00ae\3\2\2\2\4\u00b0\3\2\2\2\6"+
		"\u00be\3\2\2\2\b\u00c1\3\2\2\2\n\u00c4\3\2\2\2\f\u00c8\3\2\2\2\16\u00cd"+
		"\3\2\2\2\20\u00d7\3\2\2\2\22\u00e3\3\2\2\2\24\u00ec\3\2\2\2\26\u00ee\3"+
		"\2\2\2\30\u00fe\3\2\2\2\32\u0112\3\2\2\2\34\u011b\3\2\2\2\36\u0121\3\2"+
		"\2\2 \u0124\3\2\2\2\"\u012f\3\2\2\2$\u0131\3\2\2\2&\u0135\3\2\2\2(\u0138"+
		"\3\2\2\2*\u013b\3\2\2\2,\u013f\3\2\2\2.\u0142\3\2\2\2\60\u0145\3\2\2\2"+
		"\62\u0148\3\2\2\2\64\u014b\3\2\2\2\66\u0156\3\2\2\28\u0167\3\2\2\2:\u0169"+
		"\3\2\2\2<\u016f\3\2\2\2>\u0171\3\2\2\2@\u017e\3\2\2\2B\u0188\3\2\2\2D"+
		"\u018a\3\2\2\2F\u018d\3\2\2\2H\u0190\3\2\2\2J\u019d\3\2\2\2L\u01a6\3\2"+
		"\2\2N\u01a8\3\2\2\2P\u01b2\3\2\2\2R\u01b7\3\2\2\2T\u01b9\3\2\2\2V\u01c3"+
		"\3\2\2\2X\u01c5\3\2\2\2Z\u01d1\3\2\2\2\\\u01d3\3\2\2\2^\u01da\3\2\2\2"+
		"`\u01dd\3\2\2\2b\u01e0\3\2\2\2d\u01e4\3\2\2\2f\u01e8\3\2\2\2h\u01ef\3"+
		"\2\2\2j\u01f2\3\2\2\2l\u01fb\3\2\2\2n\u01ff\3\2\2\2p\u0207\3\2\2\2r\u0209"+
		"\3\2\2\2t\u0211\3\2\2\2v\u0219\3\2\2\2x\u021b\3\2\2\2z\u0225\3\2\2\2|"+
		"\u0230\3\2\2\2~\u0238\3\2\2\2\u0080\u0241\3\2\2\2\u0082\u024b\3\2\2\2"+
		"\u0084\u024d\3\2\2\2\u0086\u025c\3\2\2\2\u0088\u025e\3\2\2\2\u008a\u0267"+
		"\3\2\2\2\u008c\u0269\3\2\2\2\u008e\u026b\3\2\2\2\u0090\u026d\3\2\2\2\u0092"+
		"\u027e\3\2\2\2\u0094\u0282\3\2\2\2\u0096\u02a4\3\2\2\2\u0098\u02b5\3\2"+
		"\2\2\u009a\u02b7\3\2\2\2\u009c\u02be\3\2\2\2\u009e\u02c7\3\2\2\2\u00a0"+
		"\u02d2\3\2\2\2\u00a2\u02df\3\2\2\2\u00a4\u02e4\3\2\2\2\u00a6\u02e7\3\2"+
		"\2\2\u00a8\u02eb\3\2\2\2\u00aa\u02ed\3\2\2\2\u00ac\u02ef\3\2\2\2\u00ae"+
		"\u00af\5\4\3\2\u00af\3\3\2\2\2\u00b0\u00b2\5\6\4\2\u00b1\u00b3\5\f\7\2"+
		"\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b8\3\2\2\2\u00b4\u00b9"+
		"\5\16\b\2\u00b5\u00b9\5\26\f\2\u00b6\u00b9\5\30\r\2\u00b7\u00b9\5\32\16"+
		"\2\u00b8\u00b4\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7"+
		"\3\2\2\2\u00b9\5\3\2\2\2\u00ba\u00bd\5\b\5\2\u00bb\u00bd\5\n\6\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\7\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2"+
		"\7\20\2\2\u00c2\u00c3\7|\2\2\u00c3\t\3\2\2\2\u00c4\u00c5\7\27\2\2\u00c5"+
		"\u00c6\7}\2\2\u00c6\u00c7\7|\2\2\u00c7\13\3\2\2\2\u00c8\u00c9\7H\2\2\u00c9"+
		"\u00ca\t\2\2\2\u00ca\u00cb\5\u00a8U\2\u00cb\u00cc\7#\2\2\u00cc\r\3\2\2"+
		"\2\u00cd\u00d1\5\20\t\2\u00ce\u00d0\5\34\17\2\u00cf\u00ce\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2"+
		"\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\5\60\31\2\u00d5\u00d6\5\64\33\2\u00d6"+
		"\17\3\2\2\2\u00d7\u00d9\7.\2\2\u00d8\u00da\5\22\n\2\u00d9\u00d8\3\2\2"+
		"\2\u00d9\u00da\3\2\2\2\u00da\u00e1\3\2\2\2\u00db\u00dd\5\24\13\2\u00dc"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00e2\3\2\2\2\u00e0\u00e2\7w\2\2\u00e1\u00dc\3\2\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2\21\3\2\2\2\u00e3\u00e4\t\3\2\2\u00e4\23\3\2\2\2\u00e5"+
		"\u00ed\7\u0080\2\2\u00e6\u00e7\7M\2\2\u00e7\u00e8\5r:\2\u00e8\u00e9\7"+
		"#\2\2\u00e9\u00ea\7\u0080\2\2\u00ea\u00eb\7<\2\2\u00eb\u00ed\3\2\2\2\u00ec"+
		"\u00e5\3\2\2\2\u00ec\u00e6\3\2\2\2\u00ed\25\3\2\2\2\u00ee\u00ef\7\37\2"+
		"\2\u00ef\u00f0\7D\2\2\u00f0\u00f2\5L\'\2\u00f1\u00f3\7h\2\2\u00f2\u00f1"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f8\7+\2\2\u00f5"+
		"\u00f7\5\34\17\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3"+
		"\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u00fc\5\60\31\2\u00fc\u00fd\5\64\33\2\u00fd\27\3\2\2\2\u00fe\u0105\7"+
		"\23\2\2\u00ff\u0101\5n8\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0106\7w"+
		"\2\2\u0105\u0100\3\2\2\2\u0105\u0104\3\2\2\2\u0106\u010a\3\2\2\2\u0107"+
		"\u0109\5\34\17\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3"+
		"\2\2\2\u010a\u010b\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		"\u010f\5\60\31\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3"+
		"\2\2\2\u0110\u0111\5\64\33\2\u0111\31\3\2\2\2\u0112\u0114\7\32\2\2\u0113"+
		"\u0115\5\34\17\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3"+
		"\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\5\60\31\2\u0119"+
		"\u011a\5\64\33\2\u011a\33\3\2\2\2\u011b\u011f\7B\2\2\u011c\u0120\5\u00a8"+
		"U\2\u011d\u0120\5\36\20\2\u011e\u0120\5 \21\2\u011f\u011c\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120\35\3\2\2\2\u0121\u0122\7\f\2"+
		"\2\u0122\u0123\5\u00a8U\2\u0123\37\3\2\2\2\u0124\u0125\7\f\2\2\u0125\u0126"+
		"\7$\2\2\u0126\u0127\5\u00a8U\2\u0127\u0128\7*\2\2\u0128\u0129\5\u00a8"+
		"U\2\u0129\u012a\7\64\2\2\u012a\u012b\5\"\22\2\u012b\u012c\7\31\2\2\u012c"+
		"!\3\2\2\2\u012d\u0130\5$\23\2\u012e\u0130\5*\26\2\u012f\u012d\3\2\2\2"+
		"\u012f\u012e\3\2\2\2\u0130#\3\2\2\2\u0131\u0133\5&\24\2\u0132\u0134\5"+
		"(\25\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134%\3\2\2\2\u0135\u0136"+
		"\7n\2\2\u0136\u0137\7\u0082\2\2\u0137\'\3\2\2\2\u0138\u0139\7Q\2\2\u0139"+
		"\u013a\7\u0082\2\2\u013a)\3\2\2\2\u013b\u013d\5,\27\2\u013c\u013e\5.\30"+
		"\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e+\3\2\2\2\u013f\u0140"+
		"\7d\2\2\u0140\u0141\5\62\32\2\u0141-\3\2\2\2\u0142\u0143\7Q\2\2\u0143"+
		"\u0144\5\62\32\2\u0144/\3\2\2\2\u0145\u0146\7%\2\2\u0146\u0147\5H%\2\u0147"+
		"\61\3\2\2\2\u0148\u0149\7{\2\2\u0149\63\3\2\2\2\u014a\u014c\5\66\34\2"+
		"\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014f"+
		"\5:\36\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150"+
		"\u0152\5> \2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2"+
		"\2\u0153\u0155\5B\"\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\65"+
		"\3\2\2\2\u0156\u0157\7G\2\2\u0157\u0159\7]\2\2\u0158\u015a\58\35\2\u0159"+
		"\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2"+
		"\2\2\u015c\67\3\2\2\2\u015d\u0168\5\u0086D\2\u015e\u015f\7M\2\2\u015f"+
		"\u0162\5r:\2\u0160\u0161\7#\2\2\u0161\u0163\7\u0080\2\2\u0162\u0160\3"+
		"\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\7<\2\2\u0165"+
		"\u0168\3\2\2\2\u0166\u0168\7\u0080\2\2\u0167\u015d\3\2\2\2\u0167\u015e"+
		"\3\2\2\2\u0167\u0166\3\2\2\2\u01689\3\2\2\2\u0169\u016b\7U\2\2\u016a\u016c"+
		"\5<\37\2\u016b\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e;\3\2\2\2\u016f\u0170\5\u0094K\2\u0170=\3\2\2\2\u0171"+
		"\u0172\7f\2\2\u0172\u0174\7]\2\2\u0173\u0175\5@!\2\u0174\u0173\3\2\2\2"+
		"\u0175\u0176\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177?\3"+
		"\2\2\2\u0178\u0179\t\4\2\2\u0179\u017f\5\u0084C\2\u017a\u017d\5\u0094"+
		"K\2\u017b\u017d\7\u0080\2\2\u017c\u017a\3\2\2\2\u017c\u017b\3\2\2\2\u017d"+
		"\u017f\3\2\2\2\u017e\u0178\3\2\2\2\u017e\u017c\3\2\2\2\u017fA\3\2\2\2"+
		"\u0180\u0182\5D#\2\u0181\u0183\5F$\2\u0182\u0181\3\2\2\2\u0182\u0183\3"+
		"\2\2\2\u0183\u0189\3\2\2\2\u0184\u0186\5F$\2\u0185\u0187\5D#\2\u0186\u0185"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u0180\3\2\2\2\u0188"+
		"\u0184\3\2\2\2\u0189C\3\2\2\2\u018a\u018b\7Z\2\2\u018b\u018c\7\u0082\2"+
		"\2\u018cE\3\2\2\2\u018d\u018e\7g\2\2\u018e\u018f\7\u0082\2\2\u018fG\3"+
		"\2\2\2\u0190\u0192\7D\2\2\u0191\u0193\5J&\2\u0192\u0191\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\u0197\7+\2\2\u0197I\3\2\2\2\u0198\u019a\5L\'\2\u0199\u019b"+
		"\7h\2\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019e\3\2\2\2\u019c"+
		"\u019e\5Z.\2\u019d\u0198\3\2\2\2\u019d\u019c\3\2\2\2\u019eK\3\2\2\2\u019f"+
		"\u01a0\5l\67\2\u01a0\u01a1\5N(\2\u01a1\u01a7\3\2\2\2\u01a2\u01a4\5X-\2"+
		"\u01a3\u01a5\5N(\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7"+
		"\3\2\2\2\u01a6\u019f\3\2\2\2\u01a6\u01a2\3\2\2\2\u01a7M\3\2\2\2\u01a8"+
		"\u01af\5P)\2\u01a9\u01ab\7)\2\2\u01aa\u01ac\5P)\2\u01ab\u01aa\3\2\2\2"+
		"\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01a9\3\2\2\2\u01ae\u01b1"+
		"\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0O\3\2\2\2\u01b1"+
		"\u01af\3\2\2\2\u01b2\u01b3\5R*\2\u01b3\u01b4\5T+\2\u01b4Q\3\2\2\2\u01b5"+
		"\u01b8\5n8\2\u01b6\u01b8\7y\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b6\3\2\2"+
		"\2\u01b8S\3\2\2\2\u01b9\u01be\5V,\2\u01ba\u01bb\7\17\2\2\u01bb\u01bd\5"+
		"V,\2\u01bc\u01ba\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bfU\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c4\5l\67\2"+
		"\u01c2\u01c4\5X-\2\u01c3\u01c1\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4W\3\2"+
		"\2\2\u01c5\u01c6\7\64\2\2\u01c6\u01c7\5N(\2\u01c7\u01c8\7\31\2\2\u01c8"+
		"Y\3\2\2\2\u01c9\u01d2\5\\/\2\u01ca\u01d2\5^\60\2\u01cb\u01d2\5`\61\2\u01cc"+
		"\u01d2\5b\62\2\u01cd\u01d2\5d\63\2\u01ce\u01d2\5f\64\2\u01cf\u01d2\5h"+
		"\65\2\u01d0\u01d2\5j\66\2\u01d1\u01c9\3\2\2\2\u01d1\u01ca\3\2\2\2\u01d1"+
		"\u01cb\3\2\2\2\u01d1\u01cc\3\2\2\2\u01d1\u01cd\3\2\2\2\u01d1\u01ce\3\2"+
		"\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2[\3\2\2\2\u01d3\u01d6"+
		"\5H%\2\u01d4\u01d5\7(\2\2\u01d5\u01d7\5H%\2\u01d6\u01d4\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9]\3\2\2\2"+
		"\u01da\u01db\7\35\2\2\u01db\u01dc\5H%\2\u01dc_\3\2\2\2\u01dd\u01de\7i"+
		"\2\2\u01de\u01df\5H%\2\u01dfa\3\2\2\2\u01e0\u01e1\7A\2\2\u01e1\u01e2\5"+
		"n8\2\u01e2\u01e3\5H%\2\u01e3c\3\2\2\2\u01e4\u01e5\7$\2\2\u01e5\u01e6\5"+
		"n8\2\u01e6\u01e7\5H%\2\u01e7e\3\2\2\2\u01e8\u01ea\7j\2\2\u01e9\u01eb\7"+
		"\"\2\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u01ed\5n8\2\u01ed\u01ee\5H%\2\u01eeg\3\2\2\2\u01ef\u01f0\7>\2\2\u01f0"+
		"\u01f1\5\u0094K\2\u01f1i\3\2\2\2\u01f2\u01f3\7\66\2\2\u01f3\u01f4\7M\2"+
		"\2\u01f4\u01f5\5r:\2\u01f5\u01f6\7#\2\2\u01f6\u01f7\7\u0080\2\2\u01f7"+
		"\u01f8\7<\2\2\u01f8k\3\2\2\2\u01f9\u01fc\7\u0080\2\2\u01fa\u01fc\5p9\2"+
		"\u01fb\u01f9\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fcm\3\2\2\2\u01fd\u0200\7"+
		"\u0080\2\2\u01fe\u0200\5\u00a8U\2\u01ff\u01fd\3\2\2\2\u01ff\u01fe\3\2"+
		"\2\2\u0200o\3\2\2\2\u0201\u0208\5\u00a8U\2\u0202\u0208\5\u0088E\2\u0203"+
		"\u0208\5\u008aF\2\u0204\u0208\5\u00acW\2\u0205\u0208\7\u0092\2\2\u0206"+
		"\u0208\7v\2\2\u0207\u0201\3\2\2\2\u0207\u0202\3\2\2\2\u0207\u0203\3\2"+
		"\2\2\u0207\u0204\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0206\3\2\2\2\u0208"+
		"q\3\2\2\2\u0209\u020e\5t;\2\u020a\u020b\7_\2\2\u020b\u020d\5t;\2\u020c"+
		"\u020a\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2"+
		"\2\2\u020fs\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0216\5v<\2\u0212\u0213"+
		"\7\n\2\2\u0213\u0215\5v<\2\u0214\u0212\3\2\2\2\u0215\u0218\3\2\2\2\u0216"+
		"\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217u\3\2\2\2\u0218\u0216\3\2\2\2"+
		"\u0219\u021a\5x=\2\u021aw\3\2\2\2\u021b\u0223\5|?\2\u021c\u021d\7\u0090"+
		"\2\2\u021d\u0224\5|?\2\u021e\u0220\7s\2\2\u021f\u021e\3\2\2\2\u021f\u0220"+
		"\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0222\7p\2\2\u0222\u0224\5z>\2\u0223"+
		"\u021c\3\2\2\2\u0223\u021f\3\2\2\2\u0223\u0224\3\2\2\2\u0224y\3\2\2\2"+
		"\u0225\u0226\7M\2\2\u0226\u022b\5r:\2\u0227\u0228\7\17\2\2\u0228\u022a"+
		"\5r:\2\u0229\u0227\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022b"+
		"\u022c\3\2\2\2\u022c\u022e\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u022f\7<"+
		"\2\2\u022f{\3\2\2\2\u0230\u0235\5~@\2\u0231\u0232\t\5\2\2\u0232\u0234"+
		"\5~@\2\u0233\u0231\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233\3\2\2\2\u0235"+
		"\u0236\3\2\2\2\u0236}\3\2\2\2\u0237\u0235\3\2\2\2\u0238\u023d\5\u0080"+
		"A\2\u0239\u023a\t\6\2\2\u023a\u023c\5\u0080A\2\u023b\u0239\3\2\2\2\u023c"+
		"\u023f\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\177\3\2\2"+
		"\2\u023f\u023d\3\2\2\2\u0240\u0242\t\7\2\2\u0241\u0240\3\2\2\2\u0241\u0242"+
		"\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\5\u0082B\2\u0244\u0081\3\2\2"+
		"\2\u0245\u024c\5\u0084C\2\u0246\u024c\5\u0086D\2\u0247\u024c\5\u0088E"+
		"\2\u0248\u024c\5\u008aF\2\u0249\u024c\7v\2\2\u024a\u024c\7\u0080\2\2\u024b"+
		"\u0245\3\2\2\2\u024b\u0246\3\2\2\2\u024b\u0247\3\2\2\2\u024b\u0248\3\2"+
		"\2\2\u024b\u0249\3\2\2\2\u024b\u024a\3\2\2\2\u024c\u0083\3\2\2\2\u024d"+
		"\u024e\7M\2\2\u024e\u024f\5r:\2\u024f\u0250\7<\2\2\u0250\u0085\3\2\2\2"+
		"\u0251\u025d\5\u0096L\2\u0252\u025d\5\u0098M\2\u0253\u025d\5\u009aN\2"+
		"\u0254\u025d\5\u009cO\2\u0255\u025d\5\u009eP\2\u0256\u025d\5\u00a0Q\2"+
		"\u0257\u025d\5\u00a2R\2\u0258\u025a\7s\2\2\u0259\u0258\3\2\2\2\u0259\u025a"+
		"\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025d\5\u00a4S\2\u025c\u0251\3\2\2"+
		"\2\u025c\u0252\3\2\2\2\u025c\u0253\3\2\2\2\u025c\u0254\3\2\2\2\u025c\u0255"+
		"\3\2\2\2\u025c\u0256\3\2\2\2\u025c\u0257\3\2\2\2\u025c\u0259\3\2\2\2\u025d"+
		"\u0087\3\2\2\2\u025e\u0262\5\u00a6T\2\u025f\u0263\7\u0081\2\2\u0260\u0261"+
		"\7\t\2\2\u0261\u0263\5\u00a8U\2\u0262\u025f\3\2\2\2\u0262\u0260\3\2\2"+
		"\2\u0262\u0263\3\2\2\2\u0263\u0089\3\2\2\2\u0264\u0268\5\u008cG\2\u0265"+
		"\u0268\5\u008eH\2\u0266\u0268\5\u0090I\2\u0267\u0264\3\2\2\2\u0267\u0265"+
		"\3\2\2\2\u0267\u0266\3\2\2\2\u0268\u008b\3\2\2\2\u0269\u026a\t\b\2\2\u026a"+
		"\u008d\3\2\2\2\u026b\u026c\t\t\2\2\u026c\u008f\3\2\2\2\u026d\u026e\t\n"+
		"\2\2\u026e\u0091\3\2\2\2\u026f\u027f\7\u0092\2\2\u0270\u0272\7M\2\2\u0271"+
		"\u0273\7t\2\2\u0272\u0271\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\3\2"+
		"\2\2\u0274\u0279\5r:\2\u0275\u0276\7\17\2\2\u0276\u0278\5r:\2\u0277\u0275"+
		"\3\2\2\2\u0278\u027b\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a"+
		"\u027c\3\2\2\2\u027b\u0279\3\2\2\2\u027c\u027d\7<\2\2\u027d\u027f\3\2"+
		"\2\2\u027e\u026f\3\2\2\2\u027e\u0270\3\2\2\2\u027f\u0093\3\2\2\2\u0280"+
		"\u0283\5\u0084C\2\u0281\u0283\5\u0086D\2\u0282\u0280\3\2\2\2\u0282\u0281"+
		"\3\2\2\2\u0283\u0095\3\2\2\2\u0284\u0285\7m\2\2\u0285\u0287\7M\2\2\u0286"+
		"\u0288\7t\2\2\u0287\u0286\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u028b\3\2"+
		"\2\2\u0289\u028c\7w\2\2\u028a\u028c\5r:\2\u028b\u0289\3\2\2\2\u028b\u028a"+
		"\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u02a5\7<\2\2\u028e\u028f\t\13\2\2\u028f"+
		"\u0291\7M\2\2\u0290\u0292\7t\2\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2"+
		"\2\u0292\u0293\3\2\2\2\u0293\u0294\5r:\2\u0294\u0295\7<\2\2\u0295\u02a5"+
		"\3\2\2\2\u0296\u0297\7;\2\2\u0297\u0299\7M\2\2\u0298\u029a\7t\2\2\u0299"+
		"\u0298\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u02a0\5r"+
		":\2\u029c\u029d\7)\2\2\u029d\u029e\7\3\2\2\u029e\u029f\7\13\2\2\u029f"+
		"\u02a1\5\u00a6T\2\u02a0\u029c\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2"+
		"\3\2\2\2\u02a2\u02a3\7<\2\2\u02a3\u02a5\3\2\2\2\u02a4\u0284\3\2\2\2\u02a4"+
		"\u028e\3\2\2\2\u02a4\u0296\3\2\2\2\u02a5\u0097\3\2\2\2\u02a6\u02a7\t\f"+
		"\2\2\u02a7\u02a8\7M\2\2\u02a8\u02a9\5r:\2\u02a9\u02aa\7<\2\2\u02aa\u02b6"+
		"\3\2\2\2\u02ab\u02b1\7J\2\2\u02ac\u02ad\7M\2\2\u02ad\u02ae\5r:\2\u02ae"+
		"\u02af\7<\2\2\u02af\u02b2\3\2\2\2\u02b0\u02b2\7\u0092\2\2\u02b1\u02ac"+
		"\3\2\2\2\u02b1\u02b0\3\2\2\2\u02b2\u02b6\3\2\2\2\u02b3\u02b4\t\r\2\2\u02b4"+
		"\u02b6\7\u0092\2\2\u02b5\u02a6\3\2\2\2\u02b5\u02ab\3\2\2\2\u02b5\u02b3"+
		"\3\2\2\2\u02b6\u0099\3\2\2\2\u02b7\u02b8\t\16\2\2\u02b8\u02b9\7M\2\2\u02b9"+
		"\u02ba\5r:\2\u02ba\u02bb\7\17\2\2\u02bb\u02bc\5r:\2\u02bc\u02bd\7<\2\2"+
		"\u02bd\u009b\3\2\2\2\u02be\u02bf\7a\2\2\u02bf\u02c0\7M\2\2\u02c0\u02c1"+
		"\5r:\2\u02c1\u02c2\7\17\2\2\u02c2\u02c3\5r:\2\u02c3\u02c4\7\17\2\2\u02c4"+
		"\u02c5\5r:\2\u02c5\u02c6\7<\2\2\u02c6\u009d\3\2\2\2\u02c7\u02c8\t\17\2"+
		"\2\u02c8\u02c9\7M\2\2\u02c9\u02ca\5r:\2\u02ca\u02cb\7\17\2\2\u02cb\u02ce"+
		"\5r:\2\u02cc\u02cd\7\17\2\2\u02cd\u02cf\5r:\2\u02ce\u02cc\3\2\2\2\u02ce"+
		"\u02cf\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1\7<\2\2\u02d1\u009f\3\2"+
		"\2\2\u02d2\u02d3\7P\2\2\u02d3\u02d4\7M\2\2\u02d4\u02d5\5r:\2\u02d5\u02d6"+
		"\7\17\2\2\u02d6\u02d7\5r:\2\u02d7\u02d8\7\17\2\2\u02d8\u02db\5r:\2\u02d9"+
		"\u02da\7\17\2\2\u02da\u02dc\5r:\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2"+
		"\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de\7<\2\2\u02de\u00a1\3\2\2\2\u02df"+
		"\u02e0\7W\2\2\u02e0\u02e1\7M\2\2\u02e1\u02e2\7\u0080\2\2\u02e2\u02e3\7"+
		"<\2\2\u02e3\u00a3\3\2\2\2\u02e4\u02e5\7\6\2\2\u02e5\u02e6\5H%\2\u02e6"+
		"\u00a5\3\2\2\2\u02e7\u02e8\t\20\2\2\u02e8\u00a7\3\2\2\2\u02e9\u02ec\7"+
		"|\2\2\u02ea\u02ec\5\u00aaV\2\u02eb\u02e9\3\2\2\2\u02eb\u02ea\3\2\2\2\u02ec"+
		"\u00a9\3\2\2\2\u02ed\u02ee\t\21\2\2\u02ee\u00ab\3\2\2\2\u02ef\u02f0\t"+
		"\22\2\2\u02f0\u00ad\3\2\2\2P\u00b2\u00b8\u00bc\u00be\u00d1\u00d9\u00de"+
		"\u00e1\u00ec\u00f2\u00f8\u0102\u0105\u010a\u010e\u0116\u011f\u012f\u0133"+
		"\u013d\u014b\u014e\u0151\u0154\u015b\u0162\u0167\u016d\u0176\u017c\u017e"+
		"\u0182\u0186\u0188\u0194\u019a\u019d\u01a4\u01a6\u01ab\u01af\u01b7\u01be"+
		"\u01c3\u01d1\u01d8\u01ea\u01fb\u01ff\u0207\u020e\u0216\u021f\u0223\u022b"+
		"\u0235\u023d\u0241\u024b\u0259\u025c\u0262\u0267\u0272\u0279\u027e\u0282"+
		"\u0287\u028b\u0291\u0299\u02a0\u02a4\u02b1\u02b5\u02ce\u02db\u02eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}