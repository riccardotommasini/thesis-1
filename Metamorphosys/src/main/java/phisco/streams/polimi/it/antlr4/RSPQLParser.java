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
		T__122=1, T__121=2, T__120=3, T__119=4, T__118=5, T__117=6, T__116=7, 
		T__115=8, T__114=9, T__113=10, T__112=11, T__111=12, T__110=13, T__109=14, 
		T__108=15, T__107=16, T__106=17, T__105=18, T__104=19, T__103=20, T__102=21, 
		T__101=22, T__100=23, T__99=24, T__98=25, T__97=26, T__96=27, T__95=28, 
		T__94=29, T__93=30, T__92=31, T__91=32, T__90=33, T__89=34, T__88=35, 
		T__87=36, T__86=37, T__85=38, T__84=39, T__83=40, T__82=41, T__81=42, 
		T__80=43, T__79=44, T__78=45, T__77=46, T__76=47, T__75=48, T__74=49, 
		T__73=50, T__72=51, T__71=52, T__70=53, T__69=54, T__68=55, T__67=56, 
		T__66=57, T__65=58, T__64=59, T__63=60, T__62=61, T__61=62, T__60=63, 
		T__59=64, T__58=65, T__57=66, T__56=67, T__55=68, T__54=69, T__53=70, 
		T__52=71, T__51=72, T__50=73, T__49=74, T__48=75, T__47=76, T__46=77, 
		T__45=78, T__44=79, T__43=80, T__42=81, T__41=82, T__40=83, T__39=84, 
		T__38=85, T__37=86, T__36=87, T__35=88, T__34=89, T__33=90, T__32=91, 
		T__31=92, T__30=93, T__29=94, T__28=95, T__27=96, T__26=97, T__25=98, 
		T__24=99, T__23=100, T__22=101, T__21=102, T__20=103, T__19=104, T__18=105, 
		T__17=106, T__16=107, T__15=108, T__14=109, T__13=110, T__12=111, T__11=112, 
		T__10=113, T__9=114, T__8=115, T__7=116, T__6=117, T__5=118, T__4=119, 
		T__3=120, T__2=121, T__1=122, T__0=123, TYPE=124, COMMENT=125, DURATION=126, 
		IRIREF=127, PNAME_NS=128, PNAME_LN=129, BLANK_NODE_LABEL=130, VAR1=131, 
		VAR2=132, LANGTAG=133, INTEGER=134, DECIMAL=135, DOUBLE=136, INTEGER_POSITIVE=137, 
		DECIMAL_POSITIVE=138, DOUBLE_POSITIVE=139, INTEGER_NEGATIVE=140, DECIMAL_NEGATIVE=141, 
		DOUBLE_NEGATIVE=142, EXPONENT=143, STRING_LITERAL1=144, STRING_LITERAL2=145, 
		STRING_LITERAL_LONG1=146, STRING_LITERAL_LONG2=147, BINARY_OPERATOR=148, 
		ECHAR=149, NIL=150, WS=151, ANON=152, PN_CHARS_BASE=153, PN_CHARS_U=154, 
		VARNAME=155, PN_CHARS=156, PN_PREFIX=157, PN_LOCAL=158, PLX=159, PERCENT=160, 
		HEX=161, PN_LOCAL_ESC=162, ANYCHAR=163;
	public static final String[] tokenNames = {
		"<INVALID>", "'SEPARATOR'", "'ABS'", "'SAMPLE'", "'EXISTS'", "'TIMEZONE'", 
		"'RAND'", "'^^'", "'&&'", "'='", "'NAMED'", "'STRBEFORE'", "'LANG'", "','", 
		"'BASE'", "'ROUND'", "'STRSTARTS'", "'DISTINCT'", "'DESCRIBE'", "'VALUES'", 
		"'ASC'", "'ENCODE_FOR_URI'", "'DSTREAM'", "'PREFIX'", "'MINUTES'", "']'", 
		"'ASK'", "'ISLITERAL'", "'TZ'", "'OPTIONAL'", "'IRI'", "'CONSTRUCT'", 
		"'+'", "'SHA256'", "'TRUE'", "'SILENT'", "'AS'", "'WINDOW'", "'WHERE'", 
		"'COALESCE'", "'STRDT'", "'DATATYPE'", "';'", "'UNION'", "'ON'", "'}'", 
		"'STRLEN'", "'CEIL'", "'*'", "'SELECT'", "'ISIRI'", "'STRLANG'", "'SHA1'", 
		"'DAY'", "'MIN'", "'['", "'NOW'", "'BIND'", "'STR'", "'HOURS'", "'!'", 
		"'SUBSTR'", "'GROUP_CONCAT'", "')'", "'DESC'", "'FILTER'", "'SECONDS'", 
		"'LCASE'", "'GRAPH'", "'FROM'", "'FLOOR'", "'{'", "'ISBLANK'", "'LANGMATCHES'", 
		"'GROUP'", "'REGISTER'", "'CONTAINS'", "'BNODE'", "'UNDEF'", "'UUID'", 
		"'SHA384'", "'('", "'MD5'", "'MONTH'", "'REPLACE'", "'FALSE'", "'STEP'", 
		"'YEAR'", "'SUM'", "'URI'", "'HAVING'", "'UCASE'", "'CONCAT'", "'MAX'", 
		"'BOUND'", "'/'", "'LIMIT'", "'STRUUID'", "'STRENDS'", "'BY'", "'ISNUMERIC'", 
		"'DEFAULT'", "'||'", "'ISURI'", "'IF'", "'NOT'", "'SHA512'", "'REGEX'", 
		"'RANGE'", "'ISTREAM'", "'ORDER'", "'OFFSET'", "'.'", "'MINUS'", "'SERVICE'", 
		"'STRAFTER'", "'AVG'", "'COUNT'", "'ELEMENTS'", "'RSTREAM'", "'IN'", "'SAMETERM'", 
		"'REDUCED'", "'-'", "TYPE", "COMMENT", "DURATION", "IRIREF", "PNAME_NS", 
		"PNAME_LN", "BLANK_NODE_LABEL", "VAR1", "VAR2", "LANGTAG", "INTEGER", 
		"DECIMAL", "DOUBLE", "INTEGER_POSITIVE", "DECIMAL_POSITIVE", "DOUBLE_POSITIVE", 
		"INTEGER_NEGATIVE", "DECIMAL_NEGATIVE", "DOUBLE_NEGATIVE", "EXPONENT", 
		"STRING_LITERAL1", "STRING_LITERAL2", "STRING_LITERAL_LONG1", "STRING_LITERAL_LONG2", 
		"BINARY_OPERATOR", "ECHAR", "NIL", "WS", "ANON", "PN_CHARS_BASE", "PN_CHARS_U", 
		"VARNAME", "PN_CHARS", "PN_PREFIX", "PN_LOCAL", "PLX", "PERCENT", "HEX", 
		"PN_LOCAL_ESC", "ANYCHAR"
	};
	public static final int
		RULE_queryUnit = 0, RULE_query = 1, RULE_prologue = 2, RULE_baseDecl = 3, 
		RULE_prefixDecl = 4, RULE_registerClause = 5, RULE_outputStreamType = 6, 
		RULE_outputStream = 7, RULE_selectQuery = 8, RULE_selectClause = 9, RULE_resultStar = 10, 
		RULE_resultVar = 11, RULE_distinct = 12, RULE_reduced = 13, RULE_constructQuery = 14, 
		RULE_describeQuery = 15, RULE_askQuery = 16, RULE_datasetClause = 17, 
		RULE_defaultGraphClause = 18, RULE_namedGraphClause = 19, RULE_namedWindowClause = 20, 
		RULE_windowUri = 21, RULE_streamUri = 22, RULE_window = 23, RULE_physicalWindow = 24, 
		RULE_physicalRange = 25, RULE_physicalStep = 26, RULE_logicalWindow = 27, 
		RULE_logicalRange = 28, RULE_logicalStep = 29, RULE_duration = 30, RULE_sourceSelector = 31, 
		RULE_whereClause = 32, RULE_solutionModifier = 33, RULE_groupClause = 34, 
		RULE_groupCondition = 35, RULE_havingClause = 36, RULE_havingCondition = 37, 
		RULE_orderClause = 38, RULE_orderCondition = 39, RULE_limitOffsetClauses = 40, 
		RULE_limitClause = 41, RULE_offsetClause = 42, RULE_valuesClause = 43, 
		RULE_graphOrDefault = 44, RULE_graphRef = 45, RULE_quadPattern = 46, RULE_quads = 47, 
		RULE_quadsNotTriples = 48, RULE_triplesTemplate = 49, RULE_groupGraphPattern = 50, 
		RULE_triplesBlock = 51, RULE_graphPatternNotTriples = 52, RULE_optionalGraphPattern = 53, 
		RULE_graphGraphPattern = 54, RULE_windowGraphPattern = 55, RULE_serviceGraphPattern = 56, 
		RULE_bind = 57, RULE_inlineData = 58, RULE_dataBlock = 59, RULE_inlineDataOneVar = 60, 
		RULE_inlineDataFull = 61, RULE_dataBlockValues = 62, RULE_dataBlockValue = 63, 
		RULE_undef = 64, RULE_minusGraphPattern = 65, RULE_groupOrUnionGraphPattern = 66, 
		RULE_filter = 67, RULE_constraint = 68, RULE_functionCall = 69, RULE_argList = 70, 
		RULE_expressionList = 71, RULE_constructTemplate = 72, RULE_constructTriples = 73, 
		RULE_triplesSameSubject = 74, RULE_propertyListNotEmpty = 75, RULE_propertyList = 76, 
		RULE_verb = 77, RULE_type = 78, RULE_objectList = 79, RULE_object = 80, 
		RULE_triplesSameSubjectPath = 81, RULE_propertyListPathNotEmpty = 82, 
		RULE_propertyListPath = 83, RULE_verbSimple = 84, RULE_objectListPath = 85, 
		RULE_objectPath = 86, RULE_integer = 87, RULE_triplesNode = 88, RULE_blankNodePropertyList = 89, 
		RULE_triplesNodePath = 90, RULE_blankNodePropertyListPath = 91, RULE_collection = 92, 
		RULE_collectionPath = 93, RULE_graphNode = 94, RULE_graphNodePath = 95, 
		RULE_varOrTerm = 96, RULE_varOrIri = 97, RULE_var = 98, RULE_graphTerm = 99, 
		RULE_expression = 100, RULE_conditionalOrExpression = 101, RULE_conditionalAndExpression = 102, 
		RULE_valueLogical = 103, RULE_relationalExpression = 104, RULE_numericExpression = 105, 
		RULE_multiExpr = 106, RULE_multiplicativeExpression = 107, RULE_unaryExpression = 108, 
		RULE_primaryExpression = 109, RULE_brackettedExpression = 110, RULE_builtInCall = 111, 
		RULE_regexExpression = 112, RULE_substringExpression = 113, RULE_strReplaceExpression = 114, 
		RULE_existsFunc = 115, RULE_notExistsFunc = 116, RULE_aggregate = 117, 
		RULE_iriOrFunction = 118, RULE_rdfliteral = 119, RULE_numericLiteral = 120, 
		RULE_numericLiteralUnsigned = 121, RULE_numericLiteralPositive = 122, 
		RULE_numericLiteralNegative = 123, RULE_booleanLiteral = 124, RULE_string = 125, 
		RULE_iri = 126, RULE_prefixedName = 127, RULE_blankNode = 128;
	public static final String[] ruleNames = {
		"queryUnit", "query", "prologue", "baseDecl", "prefixDecl", "registerClause", 
		"outputStreamType", "outputStream", "selectQuery", "selectClause", "resultStar", 
		"resultVar", "distinct", "reduced", "constructQuery", "describeQuery", 
		"askQuery", "datasetClause", "defaultGraphClause", "namedGraphClause", 
		"namedWindowClause", "windowUri", "streamUri", "window", "physicalWindow", 
		"physicalRange", "physicalStep", "logicalWindow", "logicalRange", "logicalStep", 
		"duration", "sourceSelector", "whereClause", "solutionModifier", "groupClause", 
		"groupCondition", "havingClause", "havingCondition", "orderClause", "orderCondition", 
		"limitOffsetClauses", "limitClause", "offsetClause", "valuesClause", "graphOrDefault", 
		"graphRef", "quadPattern", "quads", "quadsNotTriples", "triplesTemplate", 
		"groupGraphPattern", "triplesBlock", "graphPatternNotTriples", "optionalGraphPattern", 
		"graphGraphPattern", "windowGraphPattern", "serviceGraphPattern", "bind", 
		"inlineData", "dataBlock", "inlineDataOneVar", "inlineDataFull", "dataBlockValues", 
		"dataBlockValue", "undef", "minusGraphPattern", "groupOrUnionGraphPattern", 
		"filter", "constraint", "functionCall", "argList", "expressionList", "constructTemplate", 
		"constructTriples", "triplesSameSubject", "propertyListNotEmpty", "propertyList", 
		"verb", "type", "objectList", "object", "triplesSameSubjectPath", "propertyListPathNotEmpty", 
		"propertyListPath", "verbSimple", "objectListPath", "objectPath", "integer", 
		"triplesNode", "blankNodePropertyList", "triplesNodePath", "blankNodePropertyListPath", 
		"collection", "collectionPath", "graphNode", "graphNodePath", "varOrTerm", 
		"varOrIri", "var", "graphTerm", "expression", "conditionalOrExpression", 
		"conditionalAndExpression", "valueLogical", "relationalExpression", "numericExpression", 
		"multiExpr", "multiplicativeExpression", "unaryExpression", "primaryExpression", 
		"brackettedExpression", "builtInCall", "regexExpression", "substringExpression", 
		"strReplaceExpression", "existsFunc", "notExistsFunc", "aggregate", "iriOrFunction", 
		"rdfliteral", "numericLiteral", "numericLiteralUnsigned", "numericLiteralPositive", 
		"numericLiteralNegative", "booleanLiteral", "string", "iri", "prefixedName", 
		"blankNode"
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
			setState(258); query();
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
		public ValuesClauseContext valuesClause() {
			return getRuleContext(ValuesClauseContext.class,0);
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
			setState(260); prologue();
			setState(262);
			_la = _input.LA(1);
			if (_la==T__48) {
				{
				setState(261); registerClause();
				}
			}

			setState(268);
			switch (_input.LA(1)) {
			case T__74:
				{
				setState(264); selectQuery();
				}
				break;
			case T__92:
				{
				setState(265); constructQuery();
				}
				break;
			case T__105:
				{
				setState(266); describeQuery();
				}
				break;
			case T__97:
				{
				setState(267); askQuery();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(270); valuesClause();
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
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__109 || _la==T__100) {
				{
				setState(274);
				switch (_input.LA(1)) {
				case T__109:
					{
					setState(272); baseDecl();
					}
					break;
				case T__100:
					{
					setState(273); prefixDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(278);
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
			setState(279); match(T__109);
			setState(280); match(IRIREF);
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
			setState(282); match(T__100);
			setState(283); match(PNAME_NS);
			setState(284); match(IRIREF);
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
		public OutputStreamContext outputStream() {
			return getRuleContext(OutputStreamContext.class,0);
		}
		public OutputStreamTypeContext outputStreamType() {
			return getRuleContext(OutputStreamTypeContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286); match(T__48);
			setState(287); outputStreamType();
			setState(288); outputStream();
			setState(289); match(T__87);
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

	public static class OutputStreamTypeContext extends ParserRuleContext {
		public OutputStreamTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputStreamType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterOutputStreamType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitOutputStreamType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitOutputStreamType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputStreamTypeContext outputStreamType() throws RecognitionException {
		OutputStreamTypeContext _localctx = new OutputStreamTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_outputStreamType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_la = _input.LA(1);
			if ( !(_la==T__101 || _la==T__14 || _la==T__4) ) {
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

	public static class OutputStreamContext extends ParserRuleContext {
		public SourceSelectorContext sourceSelector() {
			return getRuleContext(SourceSelectorContext.class,0);
		}
		public OutputStreamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputStream; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterOutputStream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitOutputStream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitOutputStream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputStreamContext outputStream() throws RecognitionException {
		OutputStreamContext _localctx = new OutputStreamContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_outputStream);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293); sourceSelector();
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
		enterRule(_localctx, 16, RULE_selectQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295); selectClause();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__54) {
				{
				{
				setState(296); datasetClause();
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(302); whereClause();
			setState(303); solutionModifier();
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
		public ReducedContext reduced() {
			return getRuleContext(ReducedContext.class,0);
		}
		public ResultVarContext resultVar(int i) {
			return getRuleContext(ResultVarContext.class,i);
		}
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public ResultStarContext resultStar() {
			return getRuleContext(ResultStarContext.class,0);
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
		enterRule(_localctx, 18, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305); match(T__74);
			setState(308);
			switch (_input.LA(1)) {
			case T__106:
				{
				setState(306); distinct();
				}
				break;
			case T__1:
				{
				setState(307); reduced();
				}
				break;
			case T__75:
			case T__42:
			case VAR1:
			case VAR2:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(316);
			switch (_input.LA(1)) {
			case T__42:
			case VAR1:
			case VAR2:
				{
				setState(311); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(310); resultVar();
					}
					}
					setState(313); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__42 - 81)) | (1L << (VAR1 - 81)) | (1L << (VAR2 - 81)))) != 0) );
				}
				break;
			case T__75:
				{
				setState(315); resultStar();
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

	public static class ResultStarContext extends ParserRuleContext {
		public ResultStarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultStar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterResultStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitResultStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitResultStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultStarContext resultStar() throws RecognitionException {
		ResultStarContext _localctx = new ResultStarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_resultStar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318); match(T__75);
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_resultVar);
		try {
			setState(327);
			switch (_input.LA(1)) {
			case VAR1:
			case VAR2:
				enterOuterAlt(_localctx, 1);
				{
				setState(320); var();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(321); match(T__42);
				setState(322); expression();
				setState(323); match(T__87);
				setState(324); var();
				setState(325); match(T__60);
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

	public static class DistinctContext extends ParserRuleContext {
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterDistinct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitDistinct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitDistinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329); match(T__106);
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

	public static class ReducedContext extends ParserRuleContext {
		public ReducedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reduced; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterReduced(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitReduced(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitReduced(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReducedContext reduced() throws RecognitionException {
		ReducedContext _localctx = new ReducedContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_reduced);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331); match(T__1);
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
		public TriplesTemplateContext triplesTemplate() {
			return getRuleContext(TriplesTemplateContext.class,0);
		}
		public ConstructTemplateContext constructTemplate() {
			return getRuleContext(ConstructTemplateContext.class,0);
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
		enterRule(_localctx, 28, RULE_constructQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333); match(T__92);
			setState(357);
			switch (_input.LA(1)) {
			case T__52:
				{
				setState(334); constructTemplate();
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__54) {
					{
					{
					setState(335); datasetClause();
					}
					}
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(341); whereClause();
				setState(342); solutionModifier();
				}
				break;
			case T__85:
			case T__54:
				{
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__54) {
					{
					{
					setState(344); datasetClause();
					}
					}
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(350); match(T__85);
				setState(351); match(T__52);
				setState(353);
				_la = _input.LA(1);
				if (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (T__89 - 34)) | (1L << (T__68 - 34)) | (1L << (T__42 - 34)) | (1L << (T__38 - 34)))) != 0) || ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (IRIREF - 127)) | (1L << (PNAME_NS - 127)) | (1L << (PNAME_LN - 127)) | (1L << (BLANK_NODE_LABEL - 127)) | (1L << (VAR1 - 127)) | (1L << (VAR2 - 127)) | (1L << (INTEGER - 127)) | (1L << (DECIMAL - 127)) | (1L << (DOUBLE - 127)) | (1L << (INTEGER_POSITIVE - 127)) | (1L << (DECIMAL_POSITIVE - 127)) | (1L << (DOUBLE_POSITIVE - 127)) | (1L << (INTEGER_NEGATIVE - 127)) | (1L << (DECIMAL_NEGATIVE - 127)) | (1L << (DOUBLE_NEGATIVE - 127)) | (1L << (STRING_LITERAL1 - 127)) | (1L << (STRING_LITERAL2 - 127)) | (1L << (STRING_LITERAL_LONG1 - 127)) | (1L << (STRING_LITERAL_LONG2 - 127)) | (1L << (NIL - 127)) | (1L << (ANON - 127)))) != 0)) {
					{
					setState(352); triplesTemplate();
					}
				}

				setState(355); match(T__78);
				setState(356); solutionModifier();
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
		public List<DatasetClauseContext> datasetClause() {
			return getRuleContexts(DatasetClauseContext.class);
		}
		public ResultStarContext resultStar() {
			return getRuleContext(ResultStarContext.class,0);
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
		enterRule(_localctx, 30, RULE_describeQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359); match(T__105);
			setState(366);
			switch (_input.LA(1)) {
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case VAR1:
			case VAR2:
				{
				setState(361); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(360); varOrIri();
					}
					}
					setState(363); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (IRIREF - 127)) | (1L << (PNAME_NS - 127)) | (1L << (PNAME_LN - 127)) | (1L << (VAR1 - 127)) | (1L << (VAR2 - 127)))) != 0) );
				}
				break;
			case T__75:
				{
				setState(365); resultStar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__54) {
				{
				{
				setState(368); datasetClause();
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375);
			_la = _input.LA(1);
			if (_la==T__85 || _la==T__52) {
				{
				setState(374); whereClause();
				}
			}

			setState(377); solutionModifier();
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
		enterRule(_localctx, 32, RULE_askQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); match(T__97);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__54) {
				{
				{
				setState(380); datasetClause();
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386); whereClause();
			setState(387); solutionModifier();
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
		public DefaultGraphClauseContext defaultGraphClause() {
			return getRuleContext(DefaultGraphClauseContext.class,0);
		}
		public NamedGraphClauseContext namedGraphClause() {
			return getRuleContext(NamedGraphClauseContext.class,0);
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
		enterRule(_localctx, 34, RULE_datasetClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389); match(T__54);
			setState(393);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(390); defaultGraphClause();
				}
				break;

			case 2:
				{
				setState(391); namedGraphClause();
				}
				break;

			case 3:
				{
				setState(392); namedWindowClause();
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

	public static class DefaultGraphClauseContext extends ParserRuleContext {
		public SourceSelectorContext sourceSelector() {
			return getRuleContext(SourceSelectorContext.class,0);
		}
		public DefaultGraphClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultGraphClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterDefaultGraphClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitDefaultGraphClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitDefaultGraphClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultGraphClauseContext defaultGraphClause() throws RecognitionException {
		DefaultGraphClauseContext _localctx = new DefaultGraphClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_defaultGraphClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395); sourceSelector();
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
		public SourceSelectorContext sourceSelector() {
			return getRuleContext(SourceSelectorContext.class,0);
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
		enterRule(_localctx, 38, RULE_namedGraphClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397); match(T__113);
			setState(398); sourceSelector();
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
		public WindowContext window() {
			return getRuleContext(WindowContext.class,0);
		}
		public StreamUriContext streamUri() {
			return getRuleContext(StreamUriContext.class,0);
		}
		public WindowUriContext windowUri() {
			return getRuleContext(WindowUriContext.class,0);
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
		enterRule(_localctx, 40, RULE_namedWindowClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400); match(T__113);
			setState(401); match(T__86);
			setState(402); windowUri();
			setState(403); match(T__79);
			setState(404); streamUri();
			setState(405); match(T__68);
			setState(406); window();
			setState(407); match(T__98);
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

	public static class WindowUriContext extends ParserRuleContext {
		public SourceSelectorContext sourceSelector() {
			return getRuleContext(SourceSelectorContext.class,0);
		}
		public WindowUriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowUri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterWindowUri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitWindowUri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitWindowUri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowUriContext windowUri() throws RecognitionException {
		WindowUriContext _localctx = new WindowUriContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_windowUri);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409); sourceSelector();
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

	public static class StreamUriContext extends ParserRuleContext {
		public SourceSelectorContext sourceSelector() {
			return getRuleContext(SourceSelectorContext.class,0);
		}
		public StreamUriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_streamUri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterStreamUri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitStreamUri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitStreamUri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StreamUriContext streamUri() throws RecognitionException {
		StreamUriContext _localctx = new StreamUriContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_streamUri);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411); sourceSelector();
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

	public static class WindowContext extends ParserRuleContext {
		public PhysicalWindowContext physicalWindow() {
			return getRuleContext(PhysicalWindowContext.class,0);
		}
		public LogicalWindowContext logicalWindow() {
			return getRuleContext(LogicalWindowContext.class,0);
		}
		public WindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowContext window() throws RecognitionException {
		WindowContext _localctx = new WindowContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_window);
		try {
			setState(415);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(413); physicalWindow();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(414); logicalWindow();
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
		enterRule(_localctx, 48, RULE_physicalWindow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417); physicalRange();
			setState(419);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(418); physicalStep();
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
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_physicalRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421); match(T__5);
			setState(422); integer();
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
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
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
		enterRule(_localctx, 52, RULE_physicalStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424); match(T__37);
			setState(425); integer();
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
		enterRule(_localctx, 54, RULE_logicalWindow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427); logicalRange();
			setState(429);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(428); logicalStep();
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
		enterRule(_localctx, 56, RULE_logicalRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431); match(T__15);
			setState(432); duration();
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
		enterRule(_localctx, 58, RULE_logicalStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434); match(T__37);
			setState(435); duration();
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
		enterRule(_localctx, 60, RULE_duration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437); match(DURATION);
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

	public static class SourceSelectorContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public SourceSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterSourceSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitSourceSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitSourceSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceSelectorContext sourceSelector() throws RecognitionException {
		SourceSelectorContext _localctx = new SourceSelectorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_sourceSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439); iri();
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
		enterRule(_localctx, 64, RULE_whereClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_la = _input.LA(1);
			if (_la==T__85) {
				{
				setState(441); match(T__85);
				}
			}

			setState(444); groupGraphPattern();
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
		enterRule(_localctx, 66, RULE_solutionModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_la = _input.LA(1);
			if (_la==T__49) {
				{
				setState(446); groupClause();
				}
			}

			setState(450);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(449); havingClause();
				}
			}

			setState(453);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(452); orderClause();
				}
			}

			setState(456);
			_la = _input.LA(1);
			if (_la==T__27 || _la==T__12) {
				{
				setState(455); limitOffsetClauses();
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
		enterRule(_localctx, 68, RULE_groupClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458); match(T__49);
			setState(459); match(T__24);
			setState(461); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(460); groupCondition();
				}
				}
				setState(463); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__121) | (1L << T__120) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__112) | (1L << T__111) | (1L << T__108) | (1L << T__107) | (1L << T__102) | (1L << T__99) | (1L << T__96) | (1L << T__95) | (1L << T__93) | (1L << T__90) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__77) | (1L << T__76) | (1L << T__73) | (1L << T__72) | (1L << T__71) | (1L << T__70) | (1L << T__69) | (1L << T__67) | (1L << T__65) | (1L << T__64) | (1L << T__62) | (1L << T__61))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__57 - 66)) | (1L << (T__56 - 66)) | (1L << (T__53 - 66)) | (1L << (T__51 - 66)) | (1L << (T__50 - 66)) | (1L << (T__47 - 66)) | (1L << (T__46 - 66)) | (1L << (T__44 - 66)) | (1L << (T__43 - 66)) | (1L << (T__42 - 66)) | (1L << (T__41 - 66)) | (1L << (T__40 - 66)) | (1L << (T__39 - 66)) | (1L << (T__36 - 66)) | (1L << (T__35 - 66)) | (1L << (T__34 - 66)) | (1L << (T__32 - 66)) | (1L << (T__31 - 66)) | (1L << (T__30 - 66)) | (1L << (T__29 - 66)) | (1L << (T__26 - 66)) | (1L << (T__25 - 66)) | (1L << (T__23 - 66)) | (1L << (T__20 - 66)) | (1L << (T__19 - 66)) | (1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__16 - 66)) | (1L << (T__8 - 66)) | (1L << (T__7 - 66)) | (1L << (T__6 - 66)) | (1L << (T__2 - 66)) | (1L << (IRIREF - 66)) | (1L << (PNAME_NS - 66)) | (1L << (PNAME_LN - 66)))) != 0) || _la==VAR1 || _la==VAR2 );
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
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
		enterRule(_localctx, 70, RULE_groupCondition);
		int _la;
		try {
			setState(476);
			switch (_input.LA(1)) {
			case T__121:
			case T__120:
			case T__119:
			case T__118:
			case T__117:
			case T__112:
			case T__111:
			case T__108:
			case T__107:
			case T__102:
			case T__99:
			case T__96:
			case T__95:
			case T__93:
			case T__90:
			case T__84:
			case T__83:
			case T__82:
			case T__77:
			case T__76:
			case T__73:
			case T__72:
			case T__71:
			case T__70:
			case T__69:
			case T__67:
			case T__65:
			case T__64:
			case T__62:
			case T__61:
			case T__57:
			case T__56:
			case T__53:
			case T__51:
			case T__50:
			case T__47:
			case T__46:
			case T__44:
			case T__43:
			case T__41:
			case T__40:
			case T__39:
			case T__36:
			case T__35:
			case T__34:
			case T__32:
			case T__31:
			case T__30:
			case T__29:
			case T__26:
			case T__25:
			case T__23:
			case T__20:
			case T__19:
			case T__18:
			case T__17:
			case T__16:
			case T__8:
			case T__7:
			case T__6:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(465); builtInCall();
				}
				break;
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(466); functionCall();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 3);
				{
				setState(467); match(T__42);
				setState(468); expression();
				setState(471);
				_la = _input.LA(1);
				if (_la==T__87) {
					{
					setState(469); match(T__87);
					setState(470); var();
					}
				}

				setState(473); match(T__60);
				}
				break;
			case VAR1:
			case VAR2:
				enterOuterAlt(_localctx, 4);
				{
				setState(475); var();
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
		enterRule(_localctx, 72, RULE_havingClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478); match(T__33);
			setState(480); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(479); havingCondition();
				}
				}
				setState(482); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__121) | (1L << T__120) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__112) | (1L << T__111) | (1L << T__108) | (1L << T__107) | (1L << T__102) | (1L << T__99) | (1L << T__96) | (1L << T__95) | (1L << T__93) | (1L << T__90) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__77) | (1L << T__76) | (1L << T__73) | (1L << T__72) | (1L << T__71) | (1L << T__70) | (1L << T__69) | (1L << T__67) | (1L << T__65) | (1L << T__64) | (1L << T__62) | (1L << T__61))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__57 - 66)) | (1L << (T__56 - 66)) | (1L << (T__53 - 66)) | (1L << (T__51 - 66)) | (1L << (T__50 - 66)) | (1L << (T__47 - 66)) | (1L << (T__46 - 66)) | (1L << (T__44 - 66)) | (1L << (T__43 - 66)) | (1L << (T__42 - 66)) | (1L << (T__41 - 66)) | (1L << (T__40 - 66)) | (1L << (T__39 - 66)) | (1L << (T__36 - 66)) | (1L << (T__35 - 66)) | (1L << (T__34 - 66)) | (1L << (T__32 - 66)) | (1L << (T__31 - 66)) | (1L << (T__30 - 66)) | (1L << (T__29 - 66)) | (1L << (T__26 - 66)) | (1L << (T__25 - 66)) | (1L << (T__23 - 66)) | (1L << (T__20 - 66)) | (1L << (T__19 - 66)) | (1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__16 - 66)) | (1L << (T__8 - 66)) | (1L << (T__7 - 66)) | (1L << (T__6 - 66)) | (1L << (T__2 - 66)) | (1L << (IRIREF - 66)) | (1L << (PNAME_NS - 66)) | (1L << (PNAME_LN - 66)))) != 0) );
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
		enterRule(_localctx, 74, RULE_havingCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484); constraint();
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
		enterRule(_localctx, 76, RULE_orderClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486); match(T__13);
			setState(487); match(T__24);
			setState(489); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(488); orderCondition();
				}
				}
				setState(491); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__121) | (1L << T__120) | (1L << T__119) | (1L << T__118) | (1L << T__117) | (1L << T__112) | (1L << T__111) | (1L << T__108) | (1L << T__107) | (1L << T__103) | (1L << T__102) | (1L << T__99) | (1L << T__96) | (1L << T__95) | (1L << T__93) | (1L << T__90) | (1L << T__84) | (1L << T__83) | (1L << T__82) | (1L << T__77) | (1L << T__76) | (1L << T__73) | (1L << T__72) | (1L << T__71) | (1L << T__70) | (1L << T__69) | (1L << T__67) | (1L << T__65) | (1L << T__64) | (1L << T__62) | (1L << T__61))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__59 - 64)) | (1L << (T__57 - 64)) | (1L << (T__56 - 64)) | (1L << (T__53 - 64)) | (1L << (T__51 - 64)) | (1L << (T__50 - 64)) | (1L << (T__47 - 64)) | (1L << (T__46 - 64)) | (1L << (T__44 - 64)) | (1L << (T__43 - 64)) | (1L << (T__42 - 64)) | (1L << (T__41 - 64)) | (1L << (T__40 - 64)) | (1L << (T__39 - 64)) | (1L << (T__36 - 64)) | (1L << (T__35 - 64)) | (1L << (T__34 - 64)) | (1L << (T__32 - 64)) | (1L << (T__31 - 64)) | (1L << (T__30 - 64)) | (1L << (T__29 - 64)) | (1L << (T__26 - 64)) | (1L << (T__25 - 64)) | (1L << (T__23 - 64)) | (1L << (T__20 - 64)) | (1L << (T__19 - 64)) | (1L << (T__18 - 64)) | (1L << (T__17 - 64)) | (1L << (T__16 - 64)) | (1L << (T__8 - 64)) | (1L << (T__7 - 64)) | (1L << (T__6 - 64)) | (1L << (T__2 - 64)) | (1L << (IRIREF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (PNAME_NS - 128)) | (1L << (PNAME_LN - 128)) | (1L << (VAR1 - 128)) | (1L << (VAR2 - 128)))) != 0) );
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
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
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
		enterRule(_localctx, 78, RULE_orderCondition);
		int _la;
		try {
			setState(499);
			switch (_input.LA(1)) {
			case T__103:
			case T__59:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(493);
				_la = _input.LA(1);
				if ( !(_la==T__103 || _la==T__59) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(494); brackettedExpression();
				}
				}
				break;
			case T__121:
			case T__120:
			case T__119:
			case T__118:
			case T__117:
			case T__112:
			case T__111:
			case T__108:
			case T__107:
			case T__102:
			case T__99:
			case T__96:
			case T__95:
			case T__93:
			case T__90:
			case T__84:
			case T__83:
			case T__82:
			case T__77:
			case T__76:
			case T__73:
			case T__72:
			case T__71:
			case T__70:
			case T__69:
			case T__67:
			case T__65:
			case T__64:
			case T__62:
			case T__61:
			case T__57:
			case T__56:
			case T__53:
			case T__51:
			case T__50:
			case T__47:
			case T__46:
			case T__44:
			case T__43:
			case T__42:
			case T__41:
			case T__40:
			case T__39:
			case T__36:
			case T__35:
			case T__34:
			case T__32:
			case T__31:
			case T__30:
			case T__29:
			case T__26:
			case T__25:
			case T__23:
			case T__20:
			case T__19:
			case T__18:
			case T__17:
			case T__16:
			case T__8:
			case T__7:
			case T__6:
			case T__2:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case VAR1:
			case VAR2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				switch (_input.LA(1)) {
				case T__121:
				case T__120:
				case T__119:
				case T__118:
				case T__117:
				case T__112:
				case T__111:
				case T__108:
				case T__107:
				case T__102:
				case T__99:
				case T__96:
				case T__95:
				case T__93:
				case T__90:
				case T__84:
				case T__83:
				case T__82:
				case T__77:
				case T__76:
				case T__73:
				case T__72:
				case T__71:
				case T__70:
				case T__69:
				case T__67:
				case T__65:
				case T__64:
				case T__62:
				case T__61:
				case T__57:
				case T__56:
				case T__53:
				case T__51:
				case T__50:
				case T__47:
				case T__46:
				case T__44:
				case T__43:
				case T__42:
				case T__41:
				case T__40:
				case T__39:
				case T__36:
				case T__35:
				case T__34:
				case T__32:
				case T__31:
				case T__30:
				case T__29:
				case T__26:
				case T__25:
				case T__23:
				case T__20:
				case T__19:
				case T__18:
				case T__17:
				case T__16:
				case T__8:
				case T__7:
				case T__6:
				case T__2:
				case IRIREF:
				case PNAME_NS:
				case PNAME_LN:
					{
					setState(495); constraint();
					}
					break;
				case VAR1:
				case VAR2:
					{
					setState(496); var();
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
		enterRule(_localctx, 80, RULE_limitOffsetClauses);
		int _la;
		try {
			setState(509);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(501); limitClause();
				setState(503);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(502); offsetClause();
					}
				}

				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(505); offsetClause();
				setState(507);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(506); limitClause();
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
		enterRule(_localctx, 82, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511); match(T__27);
			setState(512); match(INTEGER);
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
		enterRule(_localctx, 84, RULE_offsetClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514); match(T__12);
			setState(515); match(INTEGER);
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

	public static class ValuesClauseContext extends ParserRuleContext {
		public DataBlockContext dataBlock() {
			return getRuleContext(DataBlockContext.class,0);
		}
		public ValuesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterValuesClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitValuesClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitValuesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesClauseContext valuesClause() throws RecognitionException {
		ValuesClauseContext _localctx = new ValuesClauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_valuesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			_la = _input.LA(1);
			if (_la==T__104) {
				{
				setState(517); match(T__104);
				setState(518); dataBlock();
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

	public static class GraphOrDefaultContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public GraphOrDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphOrDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterGraphOrDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitGraphOrDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitGraphOrDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GraphOrDefaultContext graphOrDefault() throws RecognitionException {
		GraphOrDefaultContext _localctx = new GraphOrDefaultContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_graphOrDefault);
		int _la;
		try {
			setState(526);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(521); match(T__22);
				}
				break;
			case T__55:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				_la = _input.LA(1);
				if (_la==T__55) {
					{
					setState(522); match(T__55);
					}
				}

				setState(525); iri();
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

	public static class GraphRefContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public GraphRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterGraphRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitGraphRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitGraphRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GraphRefContext graphRef() throws RecognitionException {
		GraphRefContext _localctx = new GraphRefContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_graphRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528); match(T__55);
			setState(529); iri();
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

	public static class QuadPatternContext extends ParserRuleContext {
		public QuadsContext quads() {
			return getRuleContext(QuadsContext.class,0);
		}
		public QuadPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quadPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterQuadPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitQuadPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitQuadPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuadPatternContext quadPattern() throws RecognitionException {
		QuadPatternContext _localctx = new QuadPatternContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_quadPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531); match(T__52);
			setState(532); quads();
			setState(533); match(T__78);
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

	public static class QuadsContext extends ParserRuleContext {
		public TriplesTemplateContext triplesTemplate(int i) {
			return getRuleContext(TriplesTemplateContext.class,i);
		}
		public List<TriplesTemplateContext> triplesTemplate() {
			return getRuleContexts(TriplesTemplateContext.class);
		}
		public List<QuadsNotTriplesContext> quadsNotTriples() {
			return getRuleContexts(QuadsNotTriplesContext.class);
		}
		public QuadsNotTriplesContext quadsNotTriples(int i) {
			return getRuleContext(QuadsNotTriplesContext.class,i);
		}
		public QuadsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quads; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterQuads(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitQuads(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitQuads(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuadsContext quads() throws RecognitionException {
		QuadsContext _localctx = new QuadsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_quads);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			_la = _input.LA(1);
			if (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (T__89 - 34)) | (1L << (T__68 - 34)) | (1L << (T__42 - 34)) | (1L << (T__38 - 34)))) != 0) || ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (IRIREF - 127)) | (1L << (PNAME_NS - 127)) | (1L << (PNAME_LN - 127)) | (1L << (BLANK_NODE_LABEL - 127)) | (1L << (VAR1 - 127)) | (1L << (VAR2 - 127)) | (1L << (INTEGER - 127)) | (1L << (DECIMAL - 127)) | (1L << (DOUBLE - 127)) | (1L << (INTEGER_POSITIVE - 127)) | (1L << (DECIMAL_POSITIVE - 127)) | (1L << (DOUBLE_POSITIVE - 127)) | (1L << (INTEGER_NEGATIVE - 127)) | (1L << (DECIMAL_NEGATIVE - 127)) | (1L << (DOUBLE_NEGATIVE - 127)) | (1L << (STRING_LITERAL1 - 127)) | (1L << (STRING_LITERAL2 - 127)) | (1L << (STRING_LITERAL_LONG1 - 127)) | (1L << (STRING_LITERAL_LONG2 - 127)) | (1L << (NIL - 127)) | (1L << (ANON - 127)))) != 0)) {
				{
				setState(535); triplesTemplate();
				}
			}

			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__55) {
				{
				{
				setState(538); quadsNotTriples();
				setState(540);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(539); match(T__11);
					}
				}

				setState(543);
				_la = _input.LA(1);
				if (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (T__89 - 34)) | (1L << (T__68 - 34)) | (1L << (T__42 - 34)) | (1L << (T__38 - 34)))) != 0) || ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (IRIREF - 127)) | (1L << (PNAME_NS - 127)) | (1L << (PNAME_LN - 127)) | (1L << (BLANK_NODE_LABEL - 127)) | (1L << (VAR1 - 127)) | (1L << (VAR2 - 127)) | (1L << (INTEGER - 127)) | (1L << (DECIMAL - 127)) | (1L << (DOUBLE - 127)) | (1L << (INTEGER_POSITIVE - 127)) | (1L << (DECIMAL_POSITIVE - 127)) | (1L << (DOUBLE_POSITIVE - 127)) | (1L << (INTEGER_NEGATIVE - 127)) | (1L << (DECIMAL_NEGATIVE - 127)) | (1L << (DOUBLE_NEGATIVE - 127)) | (1L << (STRING_LITERAL1 - 127)) | (1L << (STRING_LITERAL2 - 127)) | (1L << (STRING_LITERAL_LONG1 - 127)) | (1L << (STRING_LITERAL_LONG2 - 127)) | (1L << (NIL - 127)) | (1L << (ANON - 127)))) != 0)) {
					{
					setState(542); triplesTemplate();
					}
				}

				}
				}
				setState(549);
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

	public static class QuadsNotTriplesContext extends ParserRuleContext {
		public TriplesTemplateContext triplesTemplate() {
			return getRuleContext(TriplesTemplateContext.class,0);
		}
		public VarOrIriContext varOrIri() {
			return getRuleContext(VarOrIriContext.class,0);
		}
		public QuadsNotTriplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quadsNotTriples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterQuadsNotTriples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitQuadsNotTriples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitQuadsNotTriples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuadsNotTriplesContext quadsNotTriples() throws RecognitionException {
		QuadsNotTriplesContext _localctx = new QuadsNotTriplesContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_quadsNotTriples);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550); match(T__55);
			setState(551); varOrIri();
			setState(552); match(T__52);
			setState(554);
			_la = _input.LA(1);
			if (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (T__89 - 34)) | (1L << (T__68 - 34)) | (1L << (T__42 - 34)) | (1L << (T__38 - 34)))) != 0) || ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (IRIREF - 127)) | (1L << (PNAME_NS - 127)) | (1L << (PNAME_LN - 127)) | (1L << (BLANK_NODE_LABEL - 127)) | (1L << (VAR1 - 127)) | (1L << (VAR2 - 127)) | (1L << (INTEGER - 127)) | (1L << (DECIMAL - 127)) | (1L << (DOUBLE - 127)) | (1L << (INTEGER_POSITIVE - 127)) | (1L << (DECIMAL_POSITIVE - 127)) | (1L << (DOUBLE_POSITIVE - 127)) | (1L << (INTEGER_NEGATIVE - 127)) | (1L << (DECIMAL_NEGATIVE - 127)) | (1L << (DOUBLE_NEGATIVE - 127)) | (1L << (STRING_LITERAL1 - 127)) | (1L << (STRING_LITERAL2 - 127)) | (1L << (STRING_LITERAL_LONG1 - 127)) | (1L << (STRING_LITERAL_LONG2 - 127)) | (1L << (NIL - 127)) | (1L << (ANON - 127)))) != 0)) {
				{
				setState(553); triplesTemplate();
				}
			}

			setState(556); match(T__78);
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

	public static class TriplesTemplateContext extends ParserRuleContext {
		public TriplesSameSubjectContext triplesSameSubject() {
			return getRuleContext(TriplesSameSubjectContext.class,0);
		}
		public TriplesTemplateContext triplesTemplate() {
			return getRuleContext(TriplesTemplateContext.class,0);
		}
		public TriplesTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triplesTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterTriplesTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitTriplesTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitTriplesTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriplesTemplateContext triplesTemplate() throws RecognitionException {
		TriplesTemplateContext _localctx = new TriplesTemplateContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_triplesTemplate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558); triplesSameSubject();
			setState(563);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(559); match(T__11);
				setState(561);
				_la = _input.LA(1);
				if (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (T__89 - 34)) | (1L << (T__68 - 34)) | (1L << (T__42 - 34)) | (1L << (T__38 - 34)))) != 0) || ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (IRIREF - 127)) | (1L << (PNAME_NS - 127)) | (1L << (PNAME_LN - 127)) | (1L << (BLANK_NODE_LABEL - 127)) | (1L << (VAR1 - 127)) | (1L << (VAR2 - 127)) | (1L << (INTEGER - 127)) | (1L << (DECIMAL - 127)) | (1L << (DOUBLE - 127)) | (1L << (INTEGER_POSITIVE - 127)) | (1L << (DECIMAL_POSITIVE - 127)) | (1L << (DOUBLE_POSITIVE - 127)) | (1L << (INTEGER_NEGATIVE - 127)) | (1L << (DECIMAL_NEGATIVE - 127)) | (1L << (DOUBLE_NEGATIVE - 127)) | (1L << (STRING_LITERAL1 - 127)) | (1L << (STRING_LITERAL2 - 127)) | (1L << (STRING_LITERAL_LONG1 - 127)) | (1L << (STRING_LITERAL_LONG2 - 127)) | (1L << (NIL - 127)) | (1L << (ANON - 127)))) != 0)) {
					{
					setState(560); triplesTemplate();
					}
				}

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

	public static class GroupGraphPatternContext extends ParserRuleContext {
		public TriplesBlockContext triplesBlock(int i) {
			return getRuleContext(TriplesBlockContext.class,i);
		}
		public GraphPatternNotTriplesContext graphPatternNotTriples(int i) {
			return getRuleContext(GraphPatternNotTriplesContext.class,i);
		}
		public List<GraphPatternNotTriplesContext> graphPatternNotTriples() {
			return getRuleContexts(GraphPatternNotTriplesContext.class);
		}
		public List<TriplesBlockContext> triplesBlock() {
			return getRuleContexts(TriplesBlockContext.class);
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
		enterRule(_localctx, 100, RULE_groupGraphPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565); match(T__52);
			setState(567);
			_la = _input.LA(1);
			if (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (T__89 - 34)) | (1L << (T__68 - 34)) | (1L << (T__42 - 34)) | (1L << (T__38 - 34)))) != 0) || ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (IRIREF - 127)) | (1L << (PNAME_NS - 127)) | (1L << (PNAME_LN - 127)) | (1L << (BLANK_NODE_LABEL - 127)) | (1L << (VAR1 - 127)) | (1L << (VAR2 - 127)) | (1L << (INTEGER - 127)) | (1L << (DECIMAL - 127)) | (1L << (DOUBLE - 127)) | (1L << (INTEGER_POSITIVE - 127)) | (1L << (DECIMAL_POSITIVE - 127)) | (1L << (DOUBLE_POSITIVE - 127)) | (1L << (INTEGER_NEGATIVE - 127)) | (1L << (DECIMAL_NEGATIVE - 127)) | (1L << (DOUBLE_NEGATIVE - 127)) | (1L << (STRING_LITERAL1 - 127)) | (1L << (STRING_LITERAL2 - 127)) | (1L << (STRING_LITERAL_LONG1 - 127)) | (1L << (STRING_LITERAL_LONG2 - 127)) | (1L << (NIL - 127)) | (1L << (ANON - 127)))) != 0)) {
				{
				setState(566); triplesBlock();
				}
			}

			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__104) | (1L << T__94) | (1L << T__86) | (1L << T__66))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__58 - 65)) | (1L << (T__55 - 65)) | (1L << (T__52 - 65)) | (1L << (T__10 - 65)) | (1L << (T__9 - 65)))) != 0)) {
				{
				{
				setState(569); graphPatternNotTriples();
				setState(571);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(570); match(T__11);
					}
				}

				setState(574);
				_la = _input.LA(1);
				if (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (T__89 - 34)) | (1L << (T__68 - 34)) | (1L << (T__42 - 34)) | (1L << (T__38 - 34)))) != 0) || ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (IRIREF - 127)) | (1L << (PNAME_NS - 127)) | (1L << (PNAME_LN - 127)) | (1L << (BLANK_NODE_LABEL - 127)) | (1L << (VAR1 - 127)) | (1L << (VAR2 - 127)) | (1L << (INTEGER - 127)) | (1L << (DECIMAL - 127)) | (1L << (DOUBLE - 127)) | (1L << (INTEGER_POSITIVE - 127)) | (1L << (DECIMAL_POSITIVE - 127)) | (1L << (DOUBLE_POSITIVE - 127)) | (1L << (INTEGER_NEGATIVE - 127)) | (1L << (DECIMAL_NEGATIVE - 127)) | (1L << (DOUBLE_NEGATIVE - 127)) | (1L << (STRING_LITERAL1 - 127)) | (1L << (STRING_LITERAL2 - 127)) | (1L << (STRING_LITERAL_LONG1 - 127)) | (1L << (STRING_LITERAL_LONG2 - 127)) | (1L << (NIL - 127)) | (1L << (ANON - 127)))) != 0)) {
					{
					setState(573); triplesBlock();
					}
				}

				}
				}
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(581); match(T__78);
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

	public static class TriplesBlockContext extends ParserRuleContext {
		public TriplesSameSubjectPathContext triplesSameSubjectPath() {
			return getRuleContext(TriplesSameSubjectPathContext.class,0);
		}
		public TriplesBlockContext triplesBlock() {
			return getRuleContext(TriplesBlockContext.class,0);
		}
		public TriplesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triplesBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterTriplesBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitTriplesBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitTriplesBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriplesBlockContext triplesBlock() throws RecognitionException {
		TriplesBlockContext _localctx = new TriplesBlockContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_triplesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583); triplesSameSubjectPath();
			setState(588);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(584); match(T__11);
				setState(586);
				_la = _input.LA(1);
				if (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (T__89 - 34)) | (1L << (T__68 - 34)) | (1L << (T__42 - 34)) | (1L << (T__38 - 34)))) != 0) || ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (IRIREF - 127)) | (1L << (PNAME_NS - 127)) | (1L << (PNAME_LN - 127)) | (1L << (BLANK_NODE_LABEL - 127)) | (1L << (VAR1 - 127)) | (1L << (VAR2 - 127)) | (1L << (INTEGER - 127)) | (1L << (DECIMAL - 127)) | (1L << (DOUBLE - 127)) | (1L << (INTEGER_POSITIVE - 127)) | (1L << (DECIMAL_POSITIVE - 127)) | (1L << (DOUBLE_POSITIVE - 127)) | (1L << (INTEGER_NEGATIVE - 127)) | (1L << (DECIMAL_NEGATIVE - 127)) | (1L << (DOUBLE_NEGATIVE - 127)) | (1L << (STRING_LITERAL1 - 127)) | (1L << (STRING_LITERAL2 - 127)) | (1L << (STRING_LITERAL_LONG1 - 127)) | (1L << (STRING_LITERAL_LONG2 - 127)) | (1L << (NIL - 127)) | (1L << (ANON - 127)))) != 0)) {
					{
					setState(585); triplesBlock();
					}
				}

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
		public BindContext bind() {
			return getRuleContext(BindContext.class,0);
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
		public InlineDataContext inlineData() {
			return getRuleContext(InlineDataContext.class,0);
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
		enterRule(_localctx, 104, RULE_graphPatternNotTriples);
		try {
			setState(599);
			switch (_input.LA(1)) {
			case T__52:
				enterOuterAlt(_localctx, 1);
				{
				setState(590); groupOrUnionGraphPattern();
				}
				break;
			case T__94:
				enterOuterAlt(_localctx, 2);
				{
				setState(591); optionalGraphPattern();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(592); minusGraphPattern();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 4);
				{
				setState(593); graphGraphPattern();
				}
				break;
			case T__86:
				enterOuterAlt(_localctx, 5);
				{
				setState(594); windowGraphPattern();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(595); serviceGraphPattern();
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 7);
				{
				setState(596); filter();
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 8);
				{
				setState(597); bind();
				}
				break;
			case T__104:
				enterOuterAlt(_localctx, 9);
				{
				setState(598); inlineData();
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
		enterRule(_localctx, 106, RULE_optionalGraphPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601); match(T__94);
			setState(602); groupGraphPattern();
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
		enterRule(_localctx, 108, RULE_graphGraphPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604); match(T__55);
			setState(605); varOrIri();
			setState(606); groupGraphPattern();
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
		enterRule(_localctx, 110, RULE_windowGraphPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608); match(T__86);
			setState(609); varOrIri();
			setState(610); groupGraphPattern();
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
		enterRule(_localctx, 112, RULE_serviceGraphPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612); match(T__9);
			setState(614);
			_la = _input.LA(1);
			if (_la==T__88) {
				{
				setState(613); match(T__88);
				}
			}

			setState(616); varOrIri();
			setState(617); groupGraphPattern();
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

	public static class BindContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterBind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitBind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitBind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindContext bind() throws RecognitionException {
		BindContext _localctx = new BindContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_bind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619); match(T__66);
			setState(620); match(T__42);
			setState(621); expression();
			setState(622); match(T__87);
			setState(623); var();
			setState(624); match(T__60);
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

	public static class InlineDataContext extends ParserRuleContext {
		public DataBlockContext dataBlock() {
			return getRuleContext(DataBlockContext.class,0);
		}
		public InlineDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterInlineData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitInlineData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitInlineData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineDataContext inlineData() throws RecognitionException {
		InlineDataContext _localctx = new InlineDataContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_inlineData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626); match(T__104);
			setState(627); dataBlock();
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

	public static class DataBlockContext extends ParserRuleContext {
		public InlineDataFullContext inlineDataFull() {
			return getRuleContext(InlineDataFullContext.class,0);
		}
		public InlineDataOneVarContext inlineDataOneVar() {
			return getRuleContext(InlineDataOneVarContext.class,0);
		}
		public DataBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterDataBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitDataBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitDataBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataBlockContext dataBlock() throws RecognitionException {
		DataBlockContext _localctx = new DataBlockContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_dataBlock);
		try {
			setState(631);
			switch (_input.LA(1)) {
			case VAR1:
			case VAR2:
				enterOuterAlt(_localctx, 1);
				{
				setState(629); inlineDataOneVar();
				}
				break;
			case T__42:
			case NIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(630); inlineDataFull();
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

	public static class InlineDataOneVarContext extends ParserRuleContext {
		public DataBlockValueContext dataBlockValue(int i) {
			return getRuleContext(DataBlockValueContext.class,i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<DataBlockValueContext> dataBlockValue() {
			return getRuleContexts(DataBlockValueContext.class);
		}
		public InlineDataOneVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineDataOneVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterInlineDataOneVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitInlineDataOneVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitInlineDataOneVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineDataOneVarContext inlineDataOneVar() throws RecognitionException {
		InlineDataOneVarContext _localctx = new InlineDataOneVarContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_inlineDataOneVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633); var();
			setState(634); match(T__52);
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (T__89 - 34)) | (1L << (T__45 - 34)) | (1L << (T__38 - 34)))) != 0) || ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (IRIREF - 127)) | (1L << (PNAME_NS - 127)) | (1L << (PNAME_LN - 127)) | (1L << (INTEGER - 127)) | (1L << (DECIMAL - 127)) | (1L << (DOUBLE - 127)) | (1L << (INTEGER_POSITIVE - 127)) | (1L << (DECIMAL_POSITIVE - 127)) | (1L << (DOUBLE_POSITIVE - 127)) | (1L << (INTEGER_NEGATIVE - 127)) | (1L << (DECIMAL_NEGATIVE - 127)) | (1L << (DOUBLE_NEGATIVE - 127)) | (1L << (STRING_LITERAL1 - 127)) | (1L << (STRING_LITERAL2 - 127)) | (1L << (STRING_LITERAL_LONG1 - 127)) | (1L << (STRING_LITERAL_LONG2 - 127)))) != 0)) {
				{
				{
				setState(635); dataBlockValue();
				}
				}
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(641); match(T__78);
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

	public static class InlineDataFullContext extends ParserRuleContext {
		public TerminalNode NIL(int i) {
			return getToken(RSPQLParser.NIL, i);
		}
		public List<DataBlockValuesContext> dataBlockValues() {
			return getRuleContexts(DataBlockValuesContext.class);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public DataBlockValuesContext dataBlockValues(int i) {
			return getRuleContext(DataBlockValuesContext.class,i);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> NIL() { return getTokens(RSPQLParser.NIL); }
		public InlineDataFullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineDataFull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterInlineDataFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitInlineDataFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitInlineDataFull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineDataFullContext inlineDataFull() throws RecognitionException {
		InlineDataFullContext _localctx = new InlineDataFullContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_inlineDataFull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			switch (_input.LA(1)) {
			case NIL:
				{
				setState(643); match(NIL);
				}
				break;
			case T__42:
				{
				setState(644); match(T__42);
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VAR1 || _la==VAR2) {
					{
					{
					setState(645); var();
					}
					}
					setState(650);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(651); match(T__60);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(654); match(T__52);
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42 || _la==NIL) {
				{
				setState(657);
				switch (_input.LA(1)) {
				case T__42:
					{
					setState(655); dataBlockValues();
					}
					break;
				case NIL:
					{
					setState(656); match(NIL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(662); match(T__78);
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

	public static class DataBlockValuesContext extends ParserRuleContext {
		public DataBlockValueContext dataBlockValue(int i) {
			return getRuleContext(DataBlockValueContext.class,i);
		}
		public List<DataBlockValueContext> dataBlockValue() {
			return getRuleContexts(DataBlockValueContext.class);
		}
		public DataBlockValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataBlockValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterDataBlockValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitDataBlockValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitDataBlockValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataBlockValuesContext dataBlockValues() throws RecognitionException {
		DataBlockValuesContext _localctx = new DataBlockValuesContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_dataBlockValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664); match(T__42);
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (T__89 - 34)) | (1L << (T__45 - 34)) | (1L << (T__38 - 34)))) != 0) || ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (IRIREF - 127)) | (1L << (PNAME_NS - 127)) | (1L << (PNAME_LN - 127)) | (1L << (INTEGER - 127)) | (1L << (DECIMAL - 127)) | (1L << (DOUBLE - 127)) | (1L << (INTEGER_POSITIVE - 127)) | (1L << (DECIMAL_POSITIVE - 127)) | (1L << (DOUBLE_POSITIVE - 127)) | (1L << (INTEGER_NEGATIVE - 127)) | (1L << (DECIMAL_NEGATIVE - 127)) | (1L << (DOUBLE_NEGATIVE - 127)) | (1L << (STRING_LITERAL1 - 127)) | (1L << (STRING_LITERAL2 - 127)) | (1L << (STRING_LITERAL_LONG1 - 127)) | (1L << (STRING_LITERAL_LONG2 - 127)))) != 0)) {
				{
				{
				setState(665); dataBlockValue();
				}
				}
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(671); match(T__60);
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

	public static class DataBlockValueContext extends ParserRuleContext {
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public RdfliteralContext rdfliteral() {
			return getRuleContext(RdfliteralContext.class,0);
		}
		public UndefContext undef() {
			return getRuleContext(UndefContext.class,0);
		}
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public DataBlockValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataBlockValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterDataBlockValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitDataBlockValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitDataBlockValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataBlockValueContext dataBlockValue() throws RecognitionException {
		DataBlockValueContext _localctx = new DataBlockValueContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_dataBlockValue);
		try {
			setState(678);
			switch (_input.LA(1)) {
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(673); iri();
				}
				break;
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
				enterOuterAlt(_localctx, 2);
				{
				setState(674); rdfliteral();
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
				setState(675); numericLiteral();
				}
				break;
			case T__89:
			case T__38:
				enterOuterAlt(_localctx, 4);
				{
				setState(676); booleanLiteral();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 5);
				{
				setState(677); undef();
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

	public static class UndefContext extends ParserRuleContext {
		public UndefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterUndef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitUndef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitUndef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UndefContext undef() throws RecognitionException {
		UndefContext _localctx = new UndefContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_undef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680); match(T__45);
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
		enterRule(_localctx, 130, RULE_minusGraphPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682); match(T__10);
			setState(683); groupGraphPattern();
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
		enterRule(_localctx, 132, RULE_groupOrUnionGraphPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685); groupGraphPattern();
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__80) {
				{
				{
				setState(686); match(T__80);
				setState(687); groupGraphPattern();
				}
				}
				setState(692);
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
		enterRule(_localctx, 134, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693); match(T__58);
			setState(694); constraint();
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
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
		enterRule(_localctx, 136, RULE_constraint);
		try {
			setState(699);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(696); brackettedExpression();
				}
				break;
			case T__121:
			case T__120:
			case T__119:
			case T__118:
			case T__117:
			case T__112:
			case T__111:
			case T__108:
			case T__107:
			case T__102:
			case T__99:
			case T__96:
			case T__95:
			case T__93:
			case T__90:
			case T__84:
			case T__83:
			case T__82:
			case T__77:
			case T__76:
			case T__73:
			case T__72:
			case T__71:
			case T__70:
			case T__69:
			case T__67:
			case T__65:
			case T__64:
			case T__62:
			case T__61:
			case T__57:
			case T__56:
			case T__53:
			case T__51:
			case T__50:
			case T__47:
			case T__46:
			case T__44:
			case T__43:
			case T__41:
			case T__40:
			case T__39:
			case T__36:
			case T__35:
			case T__34:
			case T__32:
			case T__31:
			case T__30:
			case T__29:
			case T__26:
			case T__25:
			case T__23:
			case T__20:
			case T__19:
			case T__18:
			case T__17:
			case T__16:
			case T__8:
			case T__7:
			case T__6:
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(697); builtInCall();
				}
				break;
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 3);
				{
				setState(698); functionCall();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701); iri();
			setState(702); argList();
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
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
		enterRule(_localctx, 140, RULE_argList);
		int _la;
		try {
			setState(719);
			switch (_input.LA(1)) {
			case NIL:
				enterOuterAlt(_localctx, 1);
				{
				setState(704); match(NIL);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(705); match(T__42);
				setState(707);
				_la = _input.LA(1);
				if (_la==T__106) {
					{
					setState(706); distinct();
					}
				}

				setState(709); expression();
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__110) {
					{
					{
					setState(710); match(T__110);
					setState(711); expression();
					}
					}
					setState(716);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(717); match(T__60);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode NIL() { return getToken(RSPQLParser.NIL, 0); }
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
		enterRule(_localctx, 142, RULE_expressionList);
		int _la;
		try {
			setState(733);
			switch (_input.LA(1)) {
			case NIL:
				enterOuterAlt(_localctx, 1);
				{
				setState(721); match(NIL);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(722); match(T__42);
				setState(723); expression();
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__110) {
					{
					{
					setState(724); match(T__110);
					setState(725); expression();
					}
					}
					setState(730);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(731); match(T__60);
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

	public static class ConstructTemplateContext extends ParserRuleContext {
		public QuadsContext quads() {
			return getRuleContext(QuadsContext.class,0);
		}
		public ConstructTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterConstructTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitConstructTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitConstructTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructTemplateContext constructTemplate() throws RecognitionException {
		ConstructTemplateContext _localctx = new ConstructTemplateContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_constructTemplate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735); match(T__52);
			setState(736); quads();
			setState(737); match(T__78);
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

	public static class ConstructTriplesContext extends ParserRuleContext {
		public TriplesSameSubjectContext triplesSameSubject() {
			return getRuleContext(TriplesSameSubjectContext.class,0);
		}
		public ConstructTriplesContext constructTriples() {
			return getRuleContext(ConstructTriplesContext.class,0);
		}
		public ConstructTriplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructTriples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterConstructTriples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitConstructTriples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitConstructTriples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructTriplesContext constructTriples() throws RecognitionException {
		ConstructTriplesContext _localctx = new ConstructTriplesContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_constructTriples);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739); triplesSameSubject();
			setState(744);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(740); match(T__11);
				setState(742);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(741); constructTriples();
					}
					break;
				}
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

	public static class TriplesSameSubjectContext extends ParserRuleContext {
		public PropertyListNotEmptyContext propertyListNotEmpty() {
			return getRuleContext(PropertyListNotEmptyContext.class,0);
		}
		public TriplesNodeContext triplesNode() {
			return getRuleContext(TriplesNodeContext.class,0);
		}
		public VarOrTermContext varOrTerm() {
			return getRuleContext(VarOrTermContext.class,0);
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
		enterRule(_localctx, 148, RULE_triplesSameSubject);
		int _la;
		try {
			setState(753);
			switch (_input.LA(1)) {
			case T__89:
			case T__38:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
			case VAR1:
			case VAR2:
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
				setState(746); varOrTerm();
				setState(747); propertyListNotEmpty();
				}
				break;
			case T__68:
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(749); triplesNode();
				setState(751);
				_la = _input.LA(1);
				if (((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & ((1L << (TYPE - 124)) | (1L << (IRIREF - 124)) | (1L << (PNAME_NS - 124)) | (1L << (PNAME_LN - 124)) | (1L << (VAR1 - 124)) | (1L << (VAR2 - 124)))) != 0)) {
					{
					setState(750); propertyListNotEmpty();
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

	public static class PropertyListNotEmptyContext extends ParserRuleContext {
		public List<PropertyListContext> propertyList() {
			return getRuleContexts(PropertyListContext.class);
		}
		public PropertyListContext propertyList(int i) {
			return getRuleContext(PropertyListContext.class,i);
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
		enterRule(_localctx, 150, RULE_propertyListNotEmpty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755); propertyList();
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__81) {
				{
				{
				setState(756); match(T__81);
				setState(758);
				_la = _input.LA(1);
				if (((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & ((1L << (TYPE - 124)) | (1L << (IRIREF - 124)) | (1L << (PNAME_NS - 124)) | (1L << (PNAME_LN - 124)) | (1L << (VAR1 - 124)) | (1L << (VAR2 - 124)))) != 0)) {
					{
					setState(757); propertyList();
					}
				}

				}
				}
				setState(764);
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

	public static class PropertyListContext extends ParserRuleContext {
		public ObjectListContext objectList() {
			return getRuleContext(ObjectListContext.class,0);
		}
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public PropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitPropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyListContext propertyList() throws RecognitionException {
		PropertyListContext _localctx = new PropertyListContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_propertyList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765); verb();
			setState(766); objectList();
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
		enterRule(_localctx, 154, RULE_verb);
		try {
			setState(770);
			switch (_input.LA(1)) {
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case VAR1:
			case VAR2:
				enterOuterAlt(_localctx, 1);
				{
				setState(768); varOrIri();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(769); type();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(RSPQLParser.TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772); match(TYPE);
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
		enterRule(_localctx, 158, RULE_objectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774); object();
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__110) {
				{
				{
				setState(775); match(T__110);
				setState(776); object();
				}
				}
				setState(781);
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
		public GraphNodeContext graphNode() {
			return getRuleContext(GraphNodeContext.class,0);
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
		enterRule(_localctx, 160, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782); graphNode();
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

	public static class TriplesSameSubjectPathContext extends ParserRuleContext {
		public PropertyListPathNotEmptyContext propertyListPathNotEmpty() {
			return getRuleContext(PropertyListPathNotEmptyContext.class,0);
		}
		public TriplesNodePathContext triplesNodePath() {
			return getRuleContext(TriplesNodePathContext.class,0);
		}
		public VarOrTermContext varOrTerm() {
			return getRuleContext(VarOrTermContext.class,0);
		}
		public TriplesSameSubjectPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triplesSameSubjectPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterTriplesSameSubjectPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitTriplesSameSubjectPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitTriplesSameSubjectPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriplesSameSubjectPathContext triplesSameSubjectPath() throws RecognitionException {
		TriplesSameSubjectPathContext _localctx = new TriplesSameSubjectPathContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_triplesSameSubjectPath);
		int _la;
		try {
			setState(791);
			switch (_input.LA(1)) {
			case T__89:
			case T__38:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
			case VAR1:
			case VAR2:
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
				setState(784); varOrTerm();
				setState(785); propertyListPathNotEmpty();
				}
				break;
			case T__68:
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(787); triplesNodePath();
				setState(789);
				_la = _input.LA(1);
				if (((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & ((1L << (TYPE - 124)) | (1L << (VAR1 - 124)) | (1L << (VAR2 - 124)))) != 0)) {
					{
					setState(788); propertyListPathNotEmpty();
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

	public static class PropertyListPathNotEmptyContext extends ParserRuleContext {
		public List<PropertyListPathContext> propertyListPath() {
			return getRuleContexts(PropertyListPathContext.class);
		}
		public PropertyListPathContext propertyListPath(int i) {
			return getRuleContext(PropertyListPathContext.class,i);
		}
		public PropertyListPathNotEmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyListPathNotEmpty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterPropertyListPathNotEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitPropertyListPathNotEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitPropertyListPathNotEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyListPathNotEmptyContext propertyListPathNotEmpty() throws RecognitionException {
		PropertyListPathNotEmptyContext _localctx = new PropertyListPathNotEmptyContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_propertyListPathNotEmpty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793); propertyListPath();
			setState(798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__81) {
				{
				{
				setState(794); match(T__81);
				setState(795); propertyListPath();
				}
				}
				setState(800);
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

	public static class PropertyListPathContext extends ParserRuleContext {
		public ObjectListPathContext objectListPath() {
			return getRuleContext(ObjectListPathContext.class,0);
		}
		public VerbSimpleContext verbSimple() {
			return getRuleContext(VerbSimpleContext.class,0);
		}
		public PropertyListPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyListPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterPropertyListPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitPropertyListPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitPropertyListPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyListPathContext propertyListPath() throws RecognitionException {
		PropertyListPathContext _localctx = new PropertyListPathContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_propertyListPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801); verbSimple();
			setState(802); objectListPath();
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

	public static class VerbSimpleContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VerbSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbSimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterVerbSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitVerbSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitVerbSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbSimpleContext verbSimple() throws RecognitionException {
		VerbSimpleContext _localctx = new VerbSimpleContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_verbSimple);
		try {
			setState(806);
			switch (_input.LA(1)) {
			case VAR1:
			case VAR2:
				enterOuterAlt(_localctx, 1);
				{
				setState(804); var();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(805); type();
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

	public static class ObjectListPathContext extends ParserRuleContext {
		public ObjectPathContext objectPath(int i) {
			return getRuleContext(ObjectPathContext.class,i);
		}
		public List<ObjectPathContext> objectPath() {
			return getRuleContexts(ObjectPathContext.class);
		}
		public ObjectListPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectListPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterObjectListPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitObjectListPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitObjectListPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectListPathContext objectListPath() throws RecognitionException {
		ObjectListPathContext _localctx = new ObjectListPathContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_objectListPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808); objectPath();
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__110) {
				{
				{
				setState(809); match(T__110);
				setState(810); objectPath();
				}
				}
				setState(815);
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

	public static class ObjectPathContext extends ParserRuleContext {
		public GraphNodePathContext graphNodePath() {
			return getRuleContext(GraphNodePathContext.class,0);
		}
		public ObjectPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterObjectPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitObjectPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitObjectPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPathContext objectPath() throws RecognitionException {
		ObjectPathContext _localctx = new ObjectPathContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_objectPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816); graphNodePath();
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(RSPQLParser.INTEGER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818); match(INTEGER);
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

	public static class TriplesNodeContext extends ParserRuleContext {
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public BlankNodePropertyListContext blankNodePropertyList() {
			return getRuleContext(BlankNodePropertyListContext.class,0);
		}
		public TriplesNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triplesNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterTriplesNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitTriplesNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitTriplesNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriplesNodeContext triplesNode() throws RecognitionException {
		TriplesNodeContext _localctx = new TriplesNodeContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_triplesNode);
		try {
			setState(822);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(820); collection();
				}
				break;
			case T__68:
				enterOuterAlt(_localctx, 2);
				{
				setState(821); blankNodePropertyList();
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
		enterRule(_localctx, 178, RULE_blankNodePropertyList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824); match(T__68);
			setState(825); propertyListNotEmpty();
			setState(826); match(T__98);
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

	public static class TriplesNodePathContext extends ParserRuleContext {
		public BlankNodePropertyListPathContext blankNodePropertyListPath() {
			return getRuleContext(BlankNodePropertyListPathContext.class,0);
		}
		public CollectionPathContext collectionPath() {
			return getRuleContext(CollectionPathContext.class,0);
		}
		public TriplesNodePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triplesNodePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterTriplesNodePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitTriplesNodePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitTriplesNodePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriplesNodePathContext triplesNodePath() throws RecognitionException {
		TriplesNodePathContext _localctx = new TriplesNodePathContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_triplesNodePath);
		try {
			setState(830);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(828); collectionPath();
				}
				break;
			case T__68:
				enterOuterAlt(_localctx, 2);
				{
				setState(829); blankNodePropertyListPath();
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

	public static class BlankNodePropertyListPathContext extends ParserRuleContext {
		public PropertyListPathNotEmptyContext propertyListPathNotEmpty() {
			return getRuleContext(PropertyListPathNotEmptyContext.class,0);
		}
		public BlankNodePropertyListPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blankNodePropertyListPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterBlankNodePropertyListPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitBlankNodePropertyListPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitBlankNodePropertyListPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlankNodePropertyListPathContext blankNodePropertyListPath() throws RecognitionException {
		BlankNodePropertyListPathContext _localctx = new BlankNodePropertyListPathContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_blankNodePropertyListPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832); match(T__68);
			setState(833); propertyListPathNotEmpty();
			setState(834); match(T__98);
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

	public static class CollectionContext extends ParserRuleContext {
		public List<GraphNodeContext> graphNode() {
			return getRuleContexts(GraphNodeContext.class);
		}
		public GraphNodeContext graphNode(int i) {
			return getRuleContext(GraphNodeContext.class,i);
		}
		public CollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterCollection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitCollection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitCollection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionContext collection() throws RecognitionException {
		CollectionContext _localctx = new CollectionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_collection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836); match(T__42);
			setState(838); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(837); graphNode();
				}
				}
				setState(840); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (T__89 - 34)) | (1L << (T__68 - 34)) | (1L << (T__42 - 34)) | (1L << (T__38 - 34)))) != 0) || ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (IRIREF - 127)) | (1L << (PNAME_NS - 127)) | (1L << (PNAME_LN - 127)) | (1L << (BLANK_NODE_LABEL - 127)) | (1L << (VAR1 - 127)) | (1L << (VAR2 - 127)) | (1L << (INTEGER - 127)) | (1L << (DECIMAL - 127)) | (1L << (DOUBLE - 127)) | (1L << (INTEGER_POSITIVE - 127)) | (1L << (DECIMAL_POSITIVE - 127)) | (1L << (DOUBLE_POSITIVE - 127)) | (1L << (INTEGER_NEGATIVE - 127)) | (1L << (DECIMAL_NEGATIVE - 127)) | (1L << (DOUBLE_NEGATIVE - 127)) | (1L << (STRING_LITERAL1 - 127)) | (1L << (STRING_LITERAL2 - 127)) | (1L << (STRING_LITERAL_LONG1 - 127)) | (1L << (STRING_LITERAL_LONG2 - 127)) | (1L << (NIL - 127)) | (1L << (ANON - 127)))) != 0) );
			setState(842); match(T__60);
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

	public static class CollectionPathContext extends ParserRuleContext {
		public List<GraphNodePathContext> graphNodePath() {
			return getRuleContexts(GraphNodePathContext.class);
		}
		public GraphNodePathContext graphNodePath(int i) {
			return getRuleContext(GraphNodePathContext.class,i);
		}
		public CollectionPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterCollectionPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitCollectionPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitCollectionPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionPathContext collectionPath() throws RecognitionException {
		CollectionPathContext _localctx = new CollectionPathContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_collectionPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844); match(T__42);
			setState(846); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(845); graphNodePath();
				}
				}
				setState(848); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (T__89 - 34)) | (1L << (T__68 - 34)) | (1L << (T__42 - 34)) | (1L << (T__38 - 34)))) != 0) || ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (IRIREF - 127)) | (1L << (PNAME_NS - 127)) | (1L << (PNAME_LN - 127)) | (1L << (BLANK_NODE_LABEL - 127)) | (1L << (VAR1 - 127)) | (1L << (VAR2 - 127)) | (1L << (INTEGER - 127)) | (1L << (DECIMAL - 127)) | (1L << (DOUBLE - 127)) | (1L << (INTEGER_POSITIVE - 127)) | (1L << (DECIMAL_POSITIVE - 127)) | (1L << (DOUBLE_POSITIVE - 127)) | (1L << (INTEGER_NEGATIVE - 127)) | (1L << (DECIMAL_NEGATIVE - 127)) | (1L << (DOUBLE_NEGATIVE - 127)) | (1L << (STRING_LITERAL1 - 127)) | (1L << (STRING_LITERAL2 - 127)) | (1L << (STRING_LITERAL_LONG1 - 127)) | (1L << (STRING_LITERAL_LONG2 - 127)) | (1L << (NIL - 127)) | (1L << (ANON - 127)))) != 0) );
			setState(850); match(T__60);
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

	public static class GraphNodeContext extends ParserRuleContext {
		public TriplesNodeContext triplesNode() {
			return getRuleContext(TriplesNodeContext.class,0);
		}
		public VarOrTermContext varOrTerm() {
			return getRuleContext(VarOrTermContext.class,0);
		}
		public GraphNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterGraphNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitGraphNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitGraphNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GraphNodeContext graphNode() throws RecognitionException {
		GraphNodeContext _localctx = new GraphNodeContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_graphNode);
		try {
			setState(854);
			switch (_input.LA(1)) {
			case T__89:
			case T__38:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
			case VAR1:
			case VAR2:
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
				setState(852); varOrTerm();
				}
				break;
			case T__68:
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(853); triplesNode();
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

	public static class GraphNodePathContext extends ParserRuleContext {
		public TriplesNodePathContext triplesNodePath() {
			return getRuleContext(TriplesNodePathContext.class,0);
		}
		public VarOrTermContext varOrTerm() {
			return getRuleContext(VarOrTermContext.class,0);
		}
		public GraphNodePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphNodePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterGraphNodePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitGraphNodePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitGraphNodePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GraphNodePathContext graphNodePath() throws RecognitionException {
		GraphNodePathContext _localctx = new GraphNodePathContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_graphNodePath);
		try {
			setState(858);
			switch (_input.LA(1)) {
			case T__89:
			case T__38:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
			case VAR1:
			case VAR2:
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
				setState(856); varOrTerm();
				}
				break;
			case T__68:
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(857); triplesNodePath();
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
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
		enterRule(_localctx, 192, RULE_varOrTerm);
		try {
			setState(862);
			switch (_input.LA(1)) {
			case VAR1:
			case VAR2:
				enterOuterAlt(_localctx, 1);
				{
				setState(860); var();
				}
				break;
			case T__89:
			case T__38:
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
				setState(861); graphTerm();
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
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
		enterRule(_localctx, 194, RULE_varOrIri);
		try {
			setState(866);
			switch (_input.LA(1)) {
			case VAR1:
			case VAR2:
				enterOuterAlt(_localctx, 1);
				{
				setState(864); var();
				}
				break;
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(865); iri();
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode VAR1() { return getToken(RSPQLParser.VAR1, 0); }
		public TerminalNode VAR2() { return getToken(RSPQLParser.VAR2, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			_la = _input.LA(1);
			if ( !(_la==VAR1 || _la==VAR2) ) {
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

	public static class GraphTermContext extends ParserRuleContext {
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public BlankNodeContext blankNode() {
			return getRuleContext(BlankNodeContext.class,0);
		}
		public RdfliteralContext rdfliteral() {
			return getRuleContext(RdfliteralContext.class,0);
		}
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
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
		enterRule(_localctx, 198, RULE_graphTerm);
		try {
			setState(876);
			switch (_input.LA(1)) {
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(870); iri();
				}
				break;
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
				enterOuterAlt(_localctx, 2);
				{
				setState(871); rdfliteral();
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
				setState(872); numericLiteral();
				}
				break;
			case T__89:
			case T__38:
				enterOuterAlt(_localctx, 4);
				{
				setState(873); booleanLiteral();
				}
				break;
			case BLANK_NODE_LABEL:
			case ANON:
				enterOuterAlt(_localctx, 5);
				{
				setState(874); blankNode();
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 6);
				{
				setState(875); match(NIL);
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
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
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
		enterRule(_localctx, 200, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878); conditionalOrExpression();
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

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public List<ConditionalAndExpressionContext> conditionalAndExpression() {
			return getRuleContexts(ConditionalAndExpressionContext.class);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitConditionalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_conditionalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880); conditionalAndExpression();
			setState(885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(881); match(T__21);
				setState(882); conditionalAndExpression();
				}
				}
				setState(887);
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
		enterRule(_localctx, 204, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888); valueLogical();
			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__115) {
				{
				{
				setState(889); match(T__115);
				setState(890); valueLogical();
				}
				}
				setState(895);
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
		enterRule(_localctx, 206, RULE_valueLogical);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896); relationalExpression();
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
		enterRule(_localctx, 208, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898); numericExpression();
			setState(906);
			switch (_input.LA(1)) {
			case BINARY_OPERATOR:
				{
				setState(899); match(BINARY_OPERATOR);
				setState(900); numericExpression();
				}
				break;
			case T__18:
			case T__3:
				{
				setState(902);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(901); match(T__18);
					}
				}

				setState(904); match(T__3);
				setState(905); expressionList();
				}
				break;
			case T__115:
			case T__110:
			case T__87:
			case T__81:
			case T__60:
			case T__21:
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

	public static class NumericExpressionContext extends ParserRuleContext {
		public List<MultiExprContext> multiExpr() {
			return getRuleContexts(MultiExprContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiExprContext multiExpr(int i) {
			return getRuleContext(MultiExprContext.class,i);
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
		enterRule(_localctx, 210, RULE_numericExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908); multiplicativeExpression();
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__91 || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (T__0 - 123)) | (1L << (INTEGER_POSITIVE - 123)) | (1L << (DECIMAL_POSITIVE - 123)) | (1L << (DOUBLE_POSITIVE - 123)) | (1L << (INTEGER_NEGATIVE - 123)) | (1L << (DECIMAL_NEGATIVE - 123)) | (1L << (DOUBLE_NEGATIVE - 123)))) != 0)) {
				{
				{
				setState(909); multiExpr();
				}
				}
				setState(914);
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

	public static class MultiExprContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public NumericLiteralNegativeContext numericLiteralNegative() {
			return getRuleContext(NumericLiteralNegativeContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public NumericLiteralPositiveContext numericLiteralPositive() {
			return getRuleContext(NumericLiteralPositiveContext.class,0);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public MultiExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterMultiExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitMultiExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitMultiExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiExprContext multiExpr() throws RecognitionException {
		MultiExprContext _localctx = new MultiExprContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_multiExpr);
		int _la;
		try {
			setState(932);
			switch (_input.LA(1)) {
			case T__91:
				enterOuterAlt(_localctx, 1);
				{
				setState(915); match(T__91);
				setState(916); multiplicativeExpression();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(917); match(T__0);
				setState(918); multiplicativeExpression();
				}
				break;
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(921);
				switch (_input.LA(1)) {
				case INTEGER_POSITIVE:
				case DECIMAL_POSITIVE:
				case DOUBLE_POSITIVE:
					{
					setState(919); numericLiteralPositive();
					}
					break;
				case INTEGER_NEGATIVE:
				case DECIMAL_NEGATIVE:
				case DOUBLE_NEGATIVE:
					{
					setState(920); numericLiteralNegative();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__75 || _la==T__28) {
					{
					setState(927);
					switch (_input.LA(1)) {
					case T__75:
						{
						setState(923); match(T__75);
						setState(924); unaryExpression();
						}
						break;
					case T__28:
						{
						setState(925); match(T__28);
						setState(926); unaryExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(931);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
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
		enterRule(_localctx, 214, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934); unaryExpression();
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__75 || _la==T__28) {
				{
				setState(939);
				switch (_input.LA(1)) {
				case T__75:
					{
					setState(935); match(T__75);
					setState(936); unaryExpression();
					}
					break;
				case T__28:
					{
					setState(937); match(T__28);
					setState(938); unaryExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(943);
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
		enterRule(_localctx, 216, RULE_unaryExpression);
		try {
			setState(951);
			switch (_input.LA(1)) {
			case T__63:
				enterOuterAlt(_localctx, 1);
				{
				setState(944); match(T__63);
				setState(945); primaryExpression();
				}
				break;
			case T__91:
				enterOuterAlt(_localctx, 2);
				{
				setState(946); match(T__91);
				setState(947); primaryExpression();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(948); match(T__0);
				setState(949); primaryExpression();
				}
				break;
			case T__121:
			case T__120:
			case T__119:
			case T__118:
			case T__117:
			case T__112:
			case T__111:
			case T__108:
			case T__107:
			case T__102:
			case T__99:
			case T__96:
			case T__95:
			case T__93:
			case T__90:
			case T__89:
			case T__84:
			case T__83:
			case T__82:
			case T__77:
			case T__76:
			case T__73:
			case T__72:
			case T__71:
			case T__70:
			case T__69:
			case T__67:
			case T__65:
			case T__64:
			case T__62:
			case T__61:
			case T__57:
			case T__56:
			case T__53:
			case T__51:
			case T__50:
			case T__47:
			case T__46:
			case T__44:
			case T__43:
			case T__42:
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
			case T__29:
			case T__26:
			case T__25:
			case T__23:
			case T__20:
			case T__19:
			case T__18:
			case T__17:
			case T__16:
			case T__8:
			case T__7:
			case T__6:
			case T__2:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case VAR1:
			case VAR2:
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
				enterOuterAlt(_localctx, 4);
				{
				setState(950); primaryExpression();
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public IriOrFunctionContext iriOrFunction() {
			return getRuleContext(IriOrFunctionContext.class,0);
		}
		public RdfliteralContext rdfliteral() {
			return getRuleContext(RdfliteralContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public BrackettedExpressionContext brackettedExpression() {
			return getRuleContext(BrackettedExpressionContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
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
		enterRule(_localctx, 218, RULE_primaryExpression);
		try {
			setState(960);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(953); brackettedExpression();
				}
				break;
			case T__121:
			case T__120:
			case T__119:
			case T__118:
			case T__117:
			case T__112:
			case T__111:
			case T__108:
			case T__107:
			case T__102:
			case T__99:
			case T__96:
			case T__95:
			case T__93:
			case T__90:
			case T__84:
			case T__83:
			case T__82:
			case T__77:
			case T__76:
			case T__73:
			case T__72:
			case T__71:
			case T__70:
			case T__69:
			case T__67:
			case T__65:
			case T__64:
			case T__62:
			case T__61:
			case T__57:
			case T__56:
			case T__53:
			case T__51:
			case T__50:
			case T__47:
			case T__46:
			case T__44:
			case T__43:
			case T__41:
			case T__40:
			case T__39:
			case T__36:
			case T__35:
			case T__34:
			case T__32:
			case T__31:
			case T__30:
			case T__29:
			case T__26:
			case T__25:
			case T__23:
			case T__20:
			case T__19:
			case T__18:
			case T__17:
			case T__16:
			case T__8:
			case T__7:
			case T__6:
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(954); builtInCall();
				}
				break;
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 3);
				{
				setState(955); iriOrFunction();
				}
				break;
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
				enterOuterAlt(_localctx, 4);
				{
				setState(956); rdfliteral();
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
				enterOuterAlt(_localctx, 5);
				{
				setState(957); numericLiteral();
				}
				break;
			case T__89:
			case T__38:
				enterOuterAlt(_localctx, 6);
				{
				setState(958); booleanLiteral();
				}
				break;
			case VAR1:
			case VAR2:
				enterOuterAlt(_localctx, 7);
				{
				setState(959); var();
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
		enterRule(_localctx, 220, RULE_brackettedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962); match(T__42);
			setState(963); expression();
			setState(964); match(T__60);
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
		public NotExistsFuncContext notExistsFunc() {
			return getRuleContext(NotExistsFuncContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SubstringExpressionContext substringExpression() {
			return getRuleContext(SubstringExpressionContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public StrReplaceExpressionContext strReplaceExpression() {
			return getRuleContext(StrReplaceExpressionContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public RegexExpressionContext regexExpression() {
			return getRuleContext(RegexExpressionContext.class,0);
		}
		public ExistsFuncContext existsFunc() {
			return getRuleContext(ExistsFuncContext.class,0);
		}
		public TerminalNode NIL() { return getToken(RSPQLParser.NIL, 0); }
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
		enterRule(_localctx, 222, RULE_builtInCall);
		try {
			setState(1224);
			switch (_input.LA(1)) {
			case T__120:
			case T__69:
			case T__61:
			case T__35:
			case T__30:
			case T__7:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(966); aggregate();
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 2);
				{
				setState(967); match(T__65);
				setState(968); match(T__42);
				setState(969); expression();
				setState(970); match(T__60);
				}
				break;
			case T__111:
				enterOuterAlt(_localctx, 3);
				{
				setState(972); match(T__111);
				setState(973); match(T__42);
				setState(974); expression();
				setState(975); match(T__60);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 4);
				{
				setState(977); match(T__50);
				setState(978); match(T__42);
				setState(979); expression();
				setState(980); match(T__110);
				setState(981); expression();
				setState(982); match(T__60);
				}
				break;
			case T__82:
				enterOuterAlt(_localctx, 5);
				{
				setState(984); match(T__82);
				setState(985); match(T__42);
				setState(986); expression();
				setState(987); match(T__60);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 6);
				{
				setState(989); match(T__29);
				setState(990); match(T__42);
				setState(991); var();
				setState(992); match(T__60);
				}
				break;
			case T__93:
				enterOuterAlt(_localctx, 7);
				{
				setState(994); match(T__93);
				setState(995); match(T__42);
				setState(996); expression();
				setState(997); match(T__60);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 8);
				{
				setState(999); match(T__34);
				setState(1000); match(T__42);
				setState(1001); expression();
				setState(1002); match(T__60);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 9);
				{
				setState(1004); match(T__46);
				setState(1010);
				switch (_input.LA(1)) {
				case T__42:
					{
					setState(1005); match(T__42);
					setState(1006); expression();
					setState(1007); match(T__60);
					}
					break;
				case NIL:
					{
					setState(1009); match(NIL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__117:
				enterOuterAlt(_localctx, 10);
				{
				setState(1012); match(T__117);
				setState(1013); match(NIL);
				}
				break;
			case T__121:
				enterOuterAlt(_localctx, 11);
				{
				setState(1014); match(T__121);
				setState(1015); match(T__42);
				setState(1016); expression();
				setState(1017); match(T__60);
				}
				break;
			case T__76:
				enterOuterAlt(_localctx, 12);
				{
				setState(1019); match(T__76);
				setState(1020); match(T__42);
				setState(1021); expression();
				setState(1022); match(T__60);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 13);
				{
				setState(1024); match(T__53);
				setState(1025); match(T__42);
				setState(1026); expression();
				setState(1027); match(T__60);
				}
				break;
			case T__108:
				enterOuterAlt(_localctx, 14);
				{
				setState(1029); match(T__108);
				setState(1030); match(T__42);
				setState(1031); expression();
				setState(1032); match(T__60);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 15);
				{
				setState(1034); match(T__31);
				setState(1035); expressionList();
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 16);
				{
				setState(1036); substringExpression();
				}
				break;
			case T__77:
				enterOuterAlt(_localctx, 17);
				{
				setState(1037); match(T__77);
				setState(1038); match(T__42);
				setState(1039); expression();
				setState(1040); match(T__60);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 18);
				{
				setState(1042); strReplaceExpression();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 19);
				{
				setState(1043); match(T__32);
				setState(1044); match(T__42);
				setState(1045); expression();
				setState(1046); match(T__60);
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 20);
				{
				setState(1048); match(T__56);
				setState(1049); match(T__42);
				setState(1050); expression();
				setState(1051); match(T__60);
				}
				break;
			case T__102:
				enterOuterAlt(_localctx, 21);
				{
				setState(1053); match(T__102);
				setState(1054); match(T__42);
				setState(1055); expression();
				setState(1056); match(T__60);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 22);
				{
				setState(1058); match(T__47);
				setState(1059); match(T__42);
				setState(1060); expression();
				setState(1061); match(T__110);
				setState(1062); expression();
				setState(1063); match(T__60);
				}
				break;
			case T__107:
				enterOuterAlt(_localctx, 23);
				{
				setState(1065); match(T__107);
				setState(1066); match(T__42);
				setState(1067); expression();
				setState(1068); match(T__110);
				setState(1069); expression();
				setState(1070); match(T__60);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 24);
				{
				setState(1072); match(T__25);
				setState(1073); match(T__42);
				setState(1074); expression();
				setState(1075); match(T__110);
				setState(1076); expression();
				setState(1077); match(T__60);
				}
				break;
			case T__112:
				enterOuterAlt(_localctx, 25);
				{
				setState(1079); match(T__112);
				setState(1080); match(T__42);
				setState(1081); expression();
				setState(1082); match(T__110);
				setState(1083); expression();
				setState(1084); match(T__60);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 26);
				{
				setState(1086); match(T__8);
				setState(1087); match(T__42);
				setState(1088); expression();
				setState(1089); match(T__110);
				setState(1090); expression();
				setState(1091); match(T__60);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 27);
				{
				setState(1093); match(T__36);
				setState(1094); match(T__42);
				setState(1095); expression();
				setState(1096); match(T__60);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 28);
				{
				setState(1098); match(T__40);
				setState(1099); match(T__42);
				setState(1100); expression();
				setState(1101); match(T__60);
				}
				break;
			case T__70:
				enterOuterAlt(_localctx, 29);
				{
				setState(1103); match(T__70);
				setState(1104); match(T__42);
				setState(1105); expression();
				setState(1106); match(T__60);
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 30);
				{
				setState(1108); match(T__64);
				setState(1109); match(T__42);
				setState(1110); expression();
				setState(1111); match(T__60);
				}
				break;
			case T__99:
				enterOuterAlt(_localctx, 31);
				{
				setState(1113); match(T__99);
				setState(1114); match(T__42);
				setState(1115); expression();
				setState(1116); match(T__60);
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 32);
				{
				setState(1118); match(T__57);
				setState(1119); match(T__42);
				setState(1120); expression();
				setState(1121); match(T__60);
				}
				break;
			case T__118:
				enterOuterAlt(_localctx, 33);
				{
				setState(1123); match(T__118);
				setState(1124); match(T__42);
				setState(1125); expression();
				setState(1126); match(T__60);
				}
				break;
			case T__95:
				enterOuterAlt(_localctx, 34);
				{
				setState(1128); match(T__95);
				setState(1129); match(T__42);
				setState(1130); expression();
				setState(1131); match(T__60);
				}
				break;
			case T__67:
				enterOuterAlt(_localctx, 35);
				{
				setState(1133); match(T__67);
				setState(1134); match(NIL);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 36);
				{
				setState(1135); match(T__44);
				setState(1136); match(NIL);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 37);
				{
				setState(1137); match(T__26);
				setState(1138); match(NIL);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 38);
				{
				setState(1139); match(T__41);
				setState(1140); match(T__42);
				setState(1141); expression();
				setState(1142); match(T__60);
				}
				break;
			case T__71:
				enterOuterAlt(_localctx, 39);
				{
				setState(1144); match(T__71);
				setState(1145); match(T__42);
				setState(1146); expression();
				setState(1147); match(T__60);
				}
				break;
			case T__90:
				enterOuterAlt(_localctx, 40);
				{
				setState(1149); match(T__90);
				setState(1150); match(T__42);
				setState(1151); expression();
				setState(1152); match(T__60);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 41);
				{
				setState(1154); match(T__43);
				setState(1155); match(T__42);
				setState(1156); expression();
				setState(1157); match(T__60);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 42);
				{
				setState(1159); match(T__17);
				setState(1160); match(T__42);
				setState(1161); expression();
				setState(1162); match(T__60);
				}
				break;
			case T__84:
				enterOuterAlt(_localctx, 43);
				{
				setState(1164); match(T__84);
				setState(1165); expressionList();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 44);
				{
				setState(1166); match(T__19);
				setState(1167); match(T__42);
				setState(1168); expression();
				setState(1169); match(T__110);
				setState(1170); expression();
				setState(1171); match(T__110);
				setState(1172); expression();
				setState(1173); match(T__60);
				}
				break;
			case T__72:
				enterOuterAlt(_localctx, 45);
				{
				setState(1175); match(T__72);
				setState(1176); match(T__42);
				setState(1177); expression();
				setState(1178); match(T__110);
				setState(1179); expression();
				setState(1180); match(T__60);
				}
				break;
			case T__83:
				enterOuterAlt(_localctx, 46);
				{
				setState(1182); match(T__83);
				setState(1183); match(T__42);
				setState(1184); expression();
				setState(1185); match(T__110);
				setState(1186); expression();
				setState(1187); match(T__60);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 47);
				{
				setState(1189); match(T__2);
				setState(1190); match(T__42);
				setState(1191); expression();
				setState(1192); match(T__110);
				setState(1193); expression();
				setState(1194); match(T__60);
				}
				break;
			case T__73:
				enterOuterAlt(_localctx, 48);
				{
				setState(1196); match(T__73);
				setState(1197); match(T__42);
				setState(1198); expression();
				setState(1199); match(T__60);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 49);
				{
				setState(1201); match(T__20);
				setState(1202); match(T__42);
				setState(1203); expression();
				setState(1204); match(T__60);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 50);
				{
				setState(1206); match(T__51);
				setState(1207); match(T__42);
				setState(1208); expression();
				setState(1209); match(T__60);
				}
				break;
			case T__96:
				enterOuterAlt(_localctx, 51);
				{
				setState(1211); match(T__96);
				setState(1212); match(T__42);
				setState(1213); expression();
				setState(1214); match(T__60);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 52);
				{
				setState(1216); match(T__23);
				setState(1217); match(T__42);
				setState(1218); expression();
				setState(1219); match(T__60);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 53);
				{
				setState(1221); regexExpression();
				}
				break;
			case T__119:
				enterOuterAlt(_localctx, 54);
				{
				setState(1222); existsFunc();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 55);
				{
				setState(1223); notExistsFunc();
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

	public static class RegexExpressionContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public RegexExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterRegexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitRegexExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitRegexExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegexExpressionContext regexExpression() throws RecognitionException {
		RegexExpressionContext _localctx = new RegexExpressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_regexExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226); match(T__16);
			setState(1227); match(T__42);
			setState(1228); expression();
			setState(1229); match(T__110);
			setState(1230); expression();
			setState(1233);
			_la = _input.LA(1);
			if (_la==T__110) {
				{
				setState(1231); match(T__110);
				setState(1232); expression();
				}
			}

			setState(1235); match(T__60);
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

	public static class SubstringExpressionContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public SubstringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substringExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterSubstringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitSubstringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitSubstringExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubstringExpressionContext substringExpression() throws RecognitionException {
		SubstringExpressionContext _localctx = new SubstringExpressionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_substringExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237); match(T__62);
			setState(1238); match(T__42);
			setState(1239); expression();
			setState(1240); match(T__110);
			setState(1241); expression();
			setState(1244);
			_la = _input.LA(1);
			if (_la==T__110) {
				{
				setState(1242); match(T__110);
				setState(1243); expression();
				}
			}

			setState(1246); match(T__60);
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
		enterRule(_localctx, 228, RULE_strReplaceExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248); match(T__39);
			setState(1249); match(T__42);
			setState(1250); expression();
			setState(1251); match(T__110);
			setState(1252); expression();
			setState(1253); match(T__110);
			setState(1254); expression();
			setState(1257);
			_la = _input.LA(1);
			if (_la==T__110) {
				{
				setState(1255); match(T__110);
				setState(1256); expression();
				}
			}

			setState(1259); match(T__60);
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
		enterRule(_localctx, 230, RULE_existsFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1261); match(T__119);
			setState(1262); groupGraphPattern();
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

	public static class NotExistsFuncContext extends ParserRuleContext {
		public GroupGraphPatternContext groupGraphPattern() {
			return getRuleContext(GroupGraphPatternContext.class,0);
		}
		public NotExistsFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExistsFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterNotExistsFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitNotExistsFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitNotExistsFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExistsFuncContext notExistsFunc() throws RecognitionException {
		NotExistsFuncContext _localctx = new NotExistsFuncContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_notExistsFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264); match(T__18);
			setState(1265); match(T__119);
			setState(1266); groupGraphPattern();
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
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
		enterRule(_localctx, 234, RULE_aggregate);
		int _la;
		try {
			setState(1332);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(1268); match(T__6);
				setState(1269); match(T__42);
				setState(1271);
				_la = _input.LA(1);
				if (_la==T__106) {
					{
					setState(1270); distinct();
					}
				}

				setState(1275);
				switch (_input.LA(1)) {
				case T__75:
					{
					setState(1273); match(T__75);
					}
					break;
				case T__121:
				case T__120:
				case T__119:
				case T__118:
				case T__117:
				case T__112:
				case T__111:
				case T__108:
				case T__107:
				case T__102:
				case T__99:
				case T__96:
				case T__95:
				case T__93:
				case T__91:
				case T__90:
				case T__89:
				case T__84:
				case T__83:
				case T__82:
				case T__77:
				case T__76:
				case T__73:
				case T__72:
				case T__71:
				case T__70:
				case T__69:
				case T__67:
				case T__65:
				case T__64:
				case T__63:
				case T__62:
				case T__61:
				case T__57:
				case T__56:
				case T__53:
				case T__51:
				case T__50:
				case T__47:
				case T__46:
				case T__44:
				case T__43:
				case T__42:
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
				case T__29:
				case T__26:
				case T__25:
				case T__23:
				case T__20:
				case T__19:
				case T__18:
				case T__17:
				case T__16:
				case T__8:
				case T__7:
				case T__6:
				case T__2:
				case T__0:
				case IRIREF:
				case PNAME_NS:
				case PNAME_LN:
				case VAR1:
				case VAR2:
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
					setState(1274); expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1277); match(T__60);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(1278); match(T__35);
				setState(1279); match(T__42);
				setState(1281);
				_la = _input.LA(1);
				if (_la==T__106) {
					{
					setState(1280); distinct();
					}
				}

				setState(1283); expression();
				setState(1284); match(T__60);
				}
				break;
			case T__69:
				enterOuterAlt(_localctx, 3);
				{
				setState(1286); match(T__69);
				setState(1287); match(T__42);
				setState(1289);
				_la = _input.LA(1);
				if (_la==T__106) {
					{
					setState(1288); distinct();
					}
				}

				setState(1291); expression();
				setState(1292); match(T__60);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 4);
				{
				setState(1294); match(T__30);
				setState(1295); match(T__42);
				setState(1297);
				_la = _input.LA(1);
				if (_la==T__106) {
					{
					setState(1296); distinct();
					}
				}

				setState(1299); expression();
				setState(1300); match(T__60);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(1302); match(T__7);
				setState(1303); match(T__42);
				setState(1305);
				_la = _input.LA(1);
				if (_la==T__106) {
					{
					setState(1304); distinct();
					}
				}

				setState(1307); expression();
				setState(1308); match(T__60);
				}
				break;
			case T__120:
				enterOuterAlt(_localctx, 6);
				{
				setState(1310); match(T__120);
				setState(1311); match(T__42);
				setState(1313);
				_la = _input.LA(1);
				if (_la==T__106) {
					{
					setState(1312); distinct();
					}
				}

				setState(1315); expression();
				setState(1316); match(T__60);
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 7);
				{
				setState(1318); match(T__61);
				setState(1319); match(T__42);
				setState(1321);
				_la = _input.LA(1);
				if (_la==T__106) {
					{
					setState(1320); distinct();
					}
				}

				setState(1323); expression();
				setState(1328);
				_la = _input.LA(1);
				if (_la==T__81) {
					{
					setState(1324); match(T__81);
					setState(1325); match(T__122);
					setState(1326); match(T__114);
					setState(1327); string();
					}
				}

				setState(1330); match(T__60);
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

	public static class IriOrFunctionContext extends ParserRuleContext {
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public IriOrFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iriOrFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterIriOrFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitIriOrFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitIriOrFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IriOrFunctionContext iriOrFunction() throws RecognitionException {
		IriOrFunctionContext _localctx = new IriOrFunctionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_iriOrFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334); iri();
			setState(1336);
			_la = _input.LA(1);
			if (_la==T__42 || _la==NIL) {
				{
				setState(1335); argList();
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
		enterRule(_localctx, 238, RULE_rdfliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338); string();
			setState(1342);
			switch (_input.LA(1)) {
			case LANGTAG:
				{
				setState(1339); match(LANGTAG);
				}
				break;
			case T__116:
				{
				{
				setState(1340); match(T__116);
				setState(1341); iri();
				}
				}
				break;
			case T__115:
			case T__110:
			case T__104:
			case T__98:
			case T__94:
			case T__91:
			case T__89:
			case T__87:
			case T__86:
			case T__81:
			case T__78:
			case T__75:
			case T__68:
			case T__66:
			case T__60:
			case T__58:
			case T__55:
			case T__52:
			case T__45:
			case T__42:
			case T__38:
			case T__28:
			case T__21:
			case T__18:
			case T__11:
			case T__10:
			case T__9:
			case T__3:
			case T__0:
			case TYPE:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
			case VAR1:
			case VAR2:
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
		enterRule(_localctx, 240, RULE_numericLiteral);
		try {
			setState(1347);
			switch (_input.LA(1)) {
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1344); numericLiteralUnsigned();
				}
				break;
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1345); numericLiteralPositive();
				}
				break;
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1346); numericLiteralNegative();
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
		enterRule(_localctx, 242, RULE_numericLiteralUnsigned);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
			_la = _input.LA(1);
			if ( !(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (INTEGER - 134)) | (1L << (DECIMAL - 134)) | (1L << (DOUBLE - 134)))) != 0)) ) {
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
		enterRule(_localctx, 244, RULE_numericLiteralPositive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1351);
			_la = _input.LA(1);
			if ( !(((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (INTEGER_POSITIVE - 137)) | (1L << (DECIMAL_POSITIVE - 137)) | (1L << (DOUBLE_POSITIVE - 137)))) != 0)) ) {
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
		enterRule(_localctx, 246, RULE_numericLiteralNegative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1353);
			_la = _input.LA(1);
			if ( !(((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (INTEGER_NEGATIVE - 140)) | (1L << (DECIMAL_NEGATIVE - 140)) | (1L << (DOUBLE_NEGATIVE - 140)))) != 0)) ) {
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1355);
			_la = _input.LA(1);
			if ( !(_la==T__89 || _la==T__38) ) {
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
		enterRule(_localctx, 250, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
			_la = _input.LA(1);
			if ( !(((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (STRING_LITERAL1 - 144)) | (1L << (STRING_LITERAL2 - 144)) | (1L << (STRING_LITERAL_LONG1 - 144)) | (1L << (STRING_LITERAL_LONG2 - 144)))) != 0)) ) {
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
		enterRule(_localctx, 252, RULE_iri);
		try {
			setState(1361);
			switch (_input.LA(1)) {
			case IRIREF:
				enterOuterAlt(_localctx, 1);
				{
				setState(1359); match(IRIREF);
				}
				break;
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1360); prefixedName();
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
		enterRule(_localctx, 254, RULE_prefixedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
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
		enterRule(_localctx, 256, RULE_blankNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00a5\u055a\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\3\2\3\2\3\3\3\3\5\3\u0109\n\3\3\3\3\3"+
		"\3\3\3\3\5\3\u010f\n\3\3\3\3\3\3\4\3\4\7\4\u0115\n\4\f\4\16\4\u0118\13"+
		"\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\7\n\u012c\n\n\f\n\16\n\u012f\13\n\3\n\3\n\3\n\3\13\3\13\3\13\5\13"+
		"\u0137\n\13\3\13\6\13\u013a\n\13\r\13\16\13\u013b\3\13\5\13\u013f\n\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u014a\n\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\7\20\u0153\n\20\f\20\16\20\u0156\13\20\3\20\3\20\3\20"+
		"\3\20\7\20\u015c\n\20\f\20\16\20\u015f\13\20\3\20\3\20\3\20\5\20\u0164"+
		"\n\20\3\20\3\20\5\20\u0168\n\20\3\21\3\21\6\21\u016c\n\21\r\21\16\21\u016d"+
		"\3\21\5\21\u0171\n\21\3\21\7\21\u0174\n\21\f\21\16\21\u0177\13\21\3\21"+
		"\5\21\u017a\n\21\3\21\3\21\3\22\3\22\7\22\u0180\n\22\f\22\16\22\u0183"+
		"\13\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u018c\n\23\3\24\3\24\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\5\31\u01a2\n\31\3\32\3\32\5\32\u01a6\n\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\5\35\u01b0\n\35\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\5\"\u01bd\n\"\3\"\3\"\3#\5#\u01c2\n#\3#\5#\u01c5"+
		"\n#\3#\5#\u01c8\n#\3#\5#\u01cb\n#\3$\3$\3$\6$\u01d0\n$\r$\16$\u01d1\3"+
		"%\3%\3%\3%\3%\3%\5%\u01da\n%\3%\3%\3%\5%\u01df\n%\3&\3&\6&\u01e3\n&\r"+
		"&\16&\u01e4\3\'\3\'\3(\3(\3(\6(\u01ec\n(\r(\16(\u01ed\3)\3)\3)\3)\5)\u01f4"+
		"\n)\5)\u01f6\n)\3*\3*\5*\u01fa\n*\3*\3*\5*\u01fe\n*\5*\u0200\n*\3+\3+"+
		"\3+\3,\3,\3,\3-\3-\5-\u020a\n-\3.\3.\5.\u020e\n.\3.\5.\u0211\n.\3/\3/"+
		"\3/\3\60\3\60\3\60\3\60\3\61\5\61\u021b\n\61\3\61\3\61\5\61\u021f\n\61"+
		"\3\61\5\61\u0222\n\61\7\61\u0224\n\61\f\61\16\61\u0227\13\61\3\62\3\62"+
		"\3\62\3\62\5\62\u022d\n\62\3\62\3\62\3\63\3\63\3\63\5\63\u0234\n\63\5"+
		"\63\u0236\n\63\3\64\3\64\5\64\u023a\n\64\3\64\3\64\5\64\u023e\n\64\3\64"+
		"\5\64\u0241\n\64\7\64\u0243\n\64\f\64\16\64\u0246\13\64\3\64\3\64\3\65"+
		"\3\65\3\65\5\65\u024d\n\65\5\65\u024f\n\65\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\5\66\u025a\n\66\3\67\3\67\3\67\38\38\38\38\39\39\3"+
		"9\39\3:\3:\5:\u0269\n:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3=\3=\5"+
		"=\u027a\n=\3>\3>\3>\7>\u027f\n>\f>\16>\u0282\13>\3>\3>\3?\3?\3?\7?\u0289"+
		"\n?\f?\16?\u028c\13?\3?\5?\u028f\n?\3?\3?\3?\7?\u0294\n?\f?\16?\u0297"+
		"\13?\3?\3?\3@\3@\7@\u029d\n@\f@\16@\u02a0\13@\3@\3@\3A\3A\3A\3A\3A\5A"+
		"\u02a9\nA\3B\3B\3C\3C\3C\3D\3D\3D\7D\u02b3\nD\fD\16D\u02b6\13D\3E\3E\3"+
		"E\3F\3F\3F\5F\u02be\nF\3G\3G\3G\3H\3H\3H\5H\u02c6\nH\3H\3H\3H\7H\u02cb"+
		"\nH\fH\16H\u02ce\13H\3H\3H\5H\u02d2\nH\3I\3I\3I\3I\3I\7I\u02d9\nI\fI\16"+
		"I\u02dc\13I\3I\3I\5I\u02e0\nI\3J\3J\3J\3J\3K\3K\3K\5K\u02e9\nK\5K\u02eb"+
		"\nK\3L\3L\3L\3L\3L\5L\u02f2\nL\5L\u02f4\nL\3M\3M\3M\5M\u02f9\nM\7M\u02fb"+
		"\nM\fM\16M\u02fe\13M\3N\3N\3N\3O\3O\5O\u0305\nO\3P\3P\3Q\3Q\3Q\7Q\u030c"+
		"\nQ\fQ\16Q\u030f\13Q\3R\3R\3S\3S\3S\3S\3S\5S\u0318\nS\5S\u031a\nS\3T\3"+
		"T\3T\7T\u031f\nT\fT\16T\u0322\13T\3U\3U\3U\3V\3V\5V\u0329\nV\3W\3W\3W"+
		"\7W\u032e\nW\fW\16W\u0331\13W\3X\3X\3Y\3Y\3Z\3Z\5Z\u0339\nZ\3[\3[\3[\3"+
		"[\3\\\3\\\5\\\u0341\n\\\3]\3]\3]\3]\3^\3^\6^\u0349\n^\r^\16^\u034a\3^"+
		"\3^\3_\3_\6_\u0351\n_\r_\16_\u0352\3_\3_\3`\3`\5`\u0359\n`\3a\3a\5a\u035d"+
		"\na\3b\3b\5b\u0361\nb\3c\3c\5c\u0365\nc\3d\3d\3e\3e\3e\3e\3e\3e\5e\u036f"+
		"\ne\3f\3f\3g\3g\3g\7g\u0376\ng\fg\16g\u0379\13g\3h\3h\3h\7h\u037e\nh\f"+
		"h\16h\u0381\13h\3i\3i\3j\3j\3j\3j\5j\u0389\nj\3j\3j\5j\u038d\nj\3k\3k"+
		"\7k\u0391\nk\fk\16k\u0394\13k\3l\3l\3l\3l\3l\3l\5l\u039c\nl\3l\3l\3l\3"+
		"l\7l\u03a2\nl\fl\16l\u03a5\13l\5l\u03a7\nl\3m\3m\3m\3m\3m\7m\u03ae\nm"+
		"\fm\16m\u03b1\13m\3n\3n\3n\3n\3n\3n\3n\5n\u03ba\nn\3o\3o\3o\3o\3o\3o\3"+
		"o\5o\u03c3\no\3p\3p\3p\3p\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3"+
		"q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3"+
		"q\3q\3q\3q\3q\3q\3q\5q\u03f5\nq\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3"+
		"q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3"+
		"q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3"+
		"q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3"+
		"q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3"+
		"q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3"+
		"q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3"+
		"q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3"+
		"q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3"+
		"q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\5q\u04cb\nq\3r\3r\3r\3"+
		"r\3r\3r\3r\5r\u04d4\nr\3r\3r\3s\3s\3s\3s\3s\3s\3s\5s\u04df\ns\3s\3s\3"+
		"t\3t\3t\3t\3t\3t\3t\3t\3t\5t\u04ec\nt\3t\3t\3u\3u\3u\3v\3v\3v\3v\3w\3"+
		"w\3w\5w\u04fa\nw\3w\3w\5w\u04fe\nw\3w\3w\3w\3w\5w\u0504\nw\3w\3w\3w\3"+
		"w\3w\3w\5w\u050c\nw\3w\3w\3w\3w\3w\3w\5w\u0514\nw\3w\3w\3w\3w\3w\3w\5"+
		"w\u051c\nw\3w\3w\3w\3w\3w\3w\5w\u0524\nw\3w\3w\3w\3w\3w\3w\5w\u052c\n"+
		"w\3w\3w\3w\3w\3w\5w\u0533\nw\3w\3w\5w\u0537\nw\3x\3x\5x\u053b\nx\3y\3"+
		"y\3y\3y\5y\u0541\ny\3z\3z\3z\5z\u0546\nz\3{\3{\3|\3|\3}\3}\3~\3~\3\177"+
		"\3\177\3\u0080\3\u0080\5\u0080\u0554\n\u0080\3\u0081\3\u0081\3\u0082\3"+
		"\u0082\3\u0082\2\2\u0083\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\2\f\5\2\30\30ooyy\4\2\26\26BB\3\2\u0085\u0086\3\2\u0088"+
		"\u008a\3\2\u008b\u008d\3\2\u008e\u0090\4\2$$WW\3\2\u0092\u0095\3\2\u0082"+
		"\u0083\4\2\u0084\u0084\u009a\u009a\u05ae\2\u0104\3\2\2\2\4\u0106\3\2\2"+
		"\2\6\u0116\3\2\2\2\b\u0119\3\2\2\2\n\u011c\3\2\2\2\f\u0120\3\2\2\2\16"+
		"\u0125\3\2\2\2\20\u0127\3\2\2\2\22\u0129\3\2\2\2\24\u0133\3\2\2\2\26\u0140"+
		"\3\2\2\2\30\u0149\3\2\2\2\32\u014b\3\2\2\2\34\u014d\3\2\2\2\36\u014f\3"+
		"\2\2\2 \u0169\3\2\2\2\"\u017d\3\2\2\2$\u0187\3\2\2\2&\u018d\3\2\2\2(\u018f"+
		"\3\2\2\2*\u0192\3\2\2\2,\u019b\3\2\2\2.\u019d\3\2\2\2\60\u01a1\3\2\2\2"+
		"\62\u01a3\3\2\2\2\64\u01a7\3\2\2\2\66\u01aa\3\2\2\28\u01ad\3\2\2\2:\u01b1"+
		"\3\2\2\2<\u01b4\3\2\2\2>\u01b7\3\2\2\2@\u01b9\3\2\2\2B\u01bc\3\2\2\2D"+
		"\u01c1\3\2\2\2F\u01cc\3\2\2\2H\u01de\3\2\2\2J\u01e0\3\2\2\2L\u01e6\3\2"+
		"\2\2N\u01e8\3\2\2\2P\u01f5\3\2\2\2R\u01ff\3\2\2\2T\u0201\3\2\2\2V\u0204"+
		"\3\2\2\2X\u0209\3\2\2\2Z\u0210\3\2\2\2\\\u0212\3\2\2\2^\u0215\3\2\2\2"+
		"`\u021a\3\2\2\2b\u0228\3\2\2\2d\u0230\3\2\2\2f\u0237\3\2\2\2h\u0249\3"+
		"\2\2\2j\u0259\3\2\2\2l\u025b\3\2\2\2n\u025e\3\2\2\2p\u0262\3\2\2\2r\u0266"+
		"\3\2\2\2t\u026d\3\2\2\2v\u0274\3\2\2\2x\u0279\3\2\2\2z\u027b\3\2\2\2|"+
		"\u028e\3\2\2\2~\u029a\3\2\2\2\u0080\u02a8\3\2\2\2\u0082\u02aa\3\2\2\2"+
		"\u0084\u02ac\3\2\2\2\u0086\u02af\3\2\2\2\u0088\u02b7\3\2\2\2\u008a\u02bd"+
		"\3\2\2\2\u008c\u02bf\3\2\2\2\u008e\u02d1\3\2\2\2\u0090\u02df\3\2\2\2\u0092"+
		"\u02e1\3\2\2\2\u0094\u02e5\3\2\2\2\u0096\u02f3\3\2\2\2\u0098\u02f5\3\2"+
		"\2\2\u009a\u02ff\3\2\2\2\u009c\u0304\3\2\2\2\u009e\u0306\3\2\2\2\u00a0"+
		"\u0308\3\2\2\2\u00a2\u0310\3\2\2\2\u00a4\u0319\3\2\2\2\u00a6\u031b\3\2"+
		"\2\2\u00a8\u0323\3\2\2\2\u00aa\u0328\3\2\2\2\u00ac\u032a\3\2\2\2\u00ae"+
		"\u0332\3\2\2\2\u00b0\u0334\3\2\2\2\u00b2\u0338\3\2\2\2\u00b4\u033a\3\2"+
		"\2\2\u00b6\u0340\3\2\2\2\u00b8\u0342\3\2\2\2\u00ba\u0346\3\2\2\2\u00bc"+
		"\u034e\3\2\2\2\u00be\u0358\3\2\2\2\u00c0\u035c\3\2\2\2\u00c2\u0360\3\2"+
		"\2\2\u00c4\u0364\3\2\2\2\u00c6\u0366\3\2\2\2\u00c8\u036e\3\2\2\2\u00ca"+
		"\u0370\3\2\2\2\u00cc\u0372\3\2\2\2\u00ce\u037a\3\2\2\2\u00d0\u0382\3\2"+
		"\2\2\u00d2\u0384\3\2\2\2\u00d4\u038e\3\2\2\2\u00d6\u03a6\3\2\2\2\u00d8"+
		"\u03a8\3\2\2\2\u00da\u03b9\3\2\2\2\u00dc\u03c2\3\2\2\2\u00de\u03c4\3\2"+
		"\2\2\u00e0\u04ca\3\2\2\2\u00e2\u04cc\3\2\2\2\u00e4\u04d7\3\2\2\2\u00e6"+
		"\u04e2\3\2\2\2\u00e8\u04ef\3\2\2\2\u00ea\u04f2\3\2\2\2\u00ec\u0536\3\2"+
		"\2\2\u00ee\u0538\3\2\2\2\u00f0\u053c\3\2\2\2\u00f2\u0545\3\2\2\2\u00f4"+
		"\u0547\3\2\2\2\u00f6\u0549\3\2\2\2\u00f8\u054b\3\2\2\2\u00fa\u054d\3\2"+
		"\2\2\u00fc\u054f\3\2\2\2\u00fe\u0553\3\2\2\2\u0100\u0555\3\2\2\2\u0102"+
		"\u0557\3\2\2\2\u0104\u0105\5\4\3\2\u0105\3\3\2\2\2\u0106\u0108\5\6\4\2"+
		"\u0107\u0109\5\f\7\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010e"+
		"\3\2\2\2\u010a\u010f\5\22\n\2\u010b\u010f\5\36\20\2\u010c\u010f\5 \21"+
		"\2\u010d\u010f\5\"\22\2\u010e\u010a\3\2\2\2\u010e\u010b\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\5X"+
		"-\2\u0111\5\3\2\2\2\u0112\u0115\5\b\5\2\u0113\u0115\5\n\6\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\7\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7\20\2"+
		"\2\u011a\u011b\7\u0081\2\2\u011b\t\3\2\2\2\u011c\u011d\7\31\2\2\u011d"+
		"\u011e\7\u0082\2\2\u011e\u011f\7\u0081\2\2\u011f\13\3\2\2\2\u0120\u0121"+
		"\7M\2\2\u0121\u0122\5\16\b\2\u0122\u0123\5\20\t\2\u0123\u0124\7&\2\2\u0124"+
		"\r\3\2\2\2\u0125\u0126\t\2\2\2\u0126\17\3\2\2\2\u0127\u0128\5@!\2\u0128"+
		"\21\3\2\2\2\u0129\u012d\5\24\13\2\u012a\u012c\5$\23\2\u012b\u012a\3\2"+
		"\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\5B\"\2\u0131\u0132\5D#"+
		"\2\u0132\23\3\2\2\2\u0133\u0136\7\63\2\2\u0134\u0137\5\32\16\2\u0135\u0137"+
		"\5\34\17\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2"+
		"\u0137\u013e\3\2\2\2\u0138\u013a\5\30\r\2\u0139\u0138\3\2\2\2\u013a\u013b"+
		"\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013f\3\2\2\2\u013d"+
		"\u013f\5\26\f\2\u013e\u0139\3\2\2\2\u013e\u013d\3\2\2\2\u013f\25\3\2\2"+
		"\2\u0140\u0141\7\62\2\2\u0141\27\3\2\2\2\u0142\u014a\5\u00c6d\2\u0143"+
		"\u0144\7S\2\2\u0144\u0145\5\u00caf\2\u0145\u0146\7&\2\2\u0146\u0147\5"+
		"\u00c6d\2\u0147\u0148\7A\2\2\u0148\u014a\3\2\2\2\u0149\u0142\3\2\2\2\u0149"+
		"\u0143\3\2\2\2\u014a\31\3\2\2\2\u014b\u014c\7\23\2\2\u014c\33\3\2\2\2"+
		"\u014d\u014e\7|\2\2\u014e\35\3\2\2\2\u014f\u0167\7!\2\2\u0150\u0154\5"+
		"\u0092J\2\u0151\u0153\5$\23\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2"+
		"\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0154"+
		"\3\2\2\2\u0157\u0158\5B\"\2\u0158\u0159\5D#\2\u0159\u0168\3\2\2\2\u015a"+
		"\u015c\5$\23\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2"+
		"\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160"+
		"\u0161\7(\2\2\u0161\u0163\7I\2\2\u0162\u0164\5d\63\2\u0163\u0162\3\2\2"+
		"\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\7/\2\2\u0166\u0168"+
		"\5D#\2\u0167\u0150\3\2\2\2\u0167\u015d\3\2\2\2\u0168\37\3\2\2\2\u0169"+
		"\u0170\7\24\2\2\u016a\u016c\5\u00c4c\2\u016b\u016a\3\2\2\2\u016c\u016d"+
		"\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0171\3\2\2\2\u016f"+
		"\u0171\5\26\f\2\u0170\u016b\3\2\2\2\u0170\u016f\3\2\2\2\u0171\u0175\3"+
		"\2\2\2\u0172\u0174\5$\23\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2"+
		"\2\2\u0178\u017a\5B\"\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\u017c\5D#\2\u017c!\3\2\2\2\u017d\u0181\7\34\2\2\u017e"+
		"\u0180\5$\23\2\u017f\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2"+
		"\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184"+
		"\u0185\5B\"\2\u0185\u0186\5D#\2\u0186#\3\2\2\2\u0187\u018b\7G\2\2\u0188"+
		"\u018c\5&\24\2\u0189\u018c\5(\25\2\u018a\u018c\5*\26\2\u018b\u0188\3\2"+
		"\2\2\u018b\u0189\3\2\2\2\u018b\u018a\3\2\2\2\u018c%\3\2\2\2\u018d\u018e"+
		"\5@!\2\u018e\'\3\2\2\2\u018f\u0190\7\f\2\2\u0190\u0191\5@!\2\u0191)\3"+
		"\2\2\2\u0192\u0193\7\f\2\2\u0193\u0194\7\'\2\2\u0194\u0195\5,\27\2\u0195"+
		"\u0196\7.\2\2\u0196\u0197\5.\30\2\u0197\u0198\79\2\2\u0198\u0199\5\60"+
		"\31\2\u0199\u019a\7\33\2\2\u019a+\3\2\2\2\u019b\u019c\5@!\2\u019c-\3\2"+
		"\2\2\u019d\u019e\5@!\2\u019e/\3\2\2\2\u019f\u01a2\5\62\32\2\u01a0\u01a2"+
		"\58\35\2\u01a1\u019f\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2\61\3\2\2\2\u01a3"+
		"\u01a5\5\64\33\2\u01a4\u01a6\5\66\34\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6"+
		"\3\2\2\2\u01a6\63\3\2\2\2\u01a7\u01a8\7x\2\2\u01a8\u01a9\5\u00b0Y\2\u01a9"+
		"\65\3\2\2\2\u01aa\u01ab\7X\2\2\u01ab\u01ac\5\u00b0Y\2\u01ac\67\3\2\2\2"+
		"\u01ad\u01af\5:\36\2\u01ae\u01b0\5<\37\2\u01af\u01ae\3\2\2\2\u01af\u01b0"+
		"\3\2\2\2\u01b09\3\2\2\2\u01b1\u01b2\7n\2\2\u01b2\u01b3\5> \2\u01b3;\3"+
		"\2\2\2\u01b4\u01b5\7X\2\2\u01b5\u01b6\5> \2\u01b6=\3\2\2\2\u01b7\u01b8"+
		"\7\u0080\2\2\u01b8?\3\2\2\2\u01b9\u01ba\5\u00fe\u0080\2\u01baA\3\2\2\2"+
		"\u01bb\u01bd\7(\2\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be"+
		"\3\2\2\2\u01be\u01bf\5f\64\2\u01bfC\3\2\2\2\u01c0\u01c2\5F$\2\u01c1\u01c0"+
		"\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c5\5J&\2\u01c4"+
		"\u01c3\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c8\5N"+
		"(\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9"+
		"\u01cb\5R*\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cbE\3\2\2\2\u01cc"+
		"\u01cd\7L\2\2\u01cd\u01cf\7e\2\2\u01ce\u01d0\5H%\2\u01cf\u01ce\3\2\2\2"+
		"\u01d0\u01d1\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2G\3"+
		"\2\2\2\u01d3\u01df\5\u00e0q\2\u01d4\u01df\5\u008cG\2\u01d5\u01d6\7S\2"+
		"\2\u01d6\u01d9\5\u00caf\2\u01d7\u01d8\7&\2\2\u01d8\u01da\5\u00c6d\2\u01d9"+
		"\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\7A"+
		"\2\2\u01dc\u01df\3\2\2\2\u01dd\u01df\5\u00c6d\2\u01de\u01d3\3\2\2\2\u01de"+
		"\u01d4\3\2\2\2\u01de\u01d5\3\2\2\2\u01de\u01dd\3\2\2\2\u01dfI\3\2\2\2"+
		"\u01e0\u01e2\7\\\2\2\u01e1\u01e3\5L\'\2\u01e2\u01e1\3\2\2\2\u01e3\u01e4"+
		"\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5K\3\2\2\2\u01e6"+
		"\u01e7\5\u008aF\2\u01e7M\3\2\2\2\u01e8\u01e9\7p\2\2\u01e9\u01eb\7e\2\2"+
		"\u01ea\u01ec\5P)\2\u01eb\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01eb"+
		"\3\2\2\2\u01ed\u01ee\3\2\2\2\u01eeO\3\2\2\2\u01ef\u01f0\t\3\2\2\u01f0"+
		"\u01f6\5\u00dep\2\u01f1\u01f4\5\u008aF\2\u01f2\u01f4\5\u00c6d\2\u01f3"+
		"\u01f1\3\2\2\2\u01f3\u01f2\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01ef\3\2"+
		"\2\2\u01f5\u01f3\3\2\2\2\u01f6Q\3\2\2\2\u01f7\u01f9\5T+\2\u01f8\u01fa"+
		"\5V,\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u0200\3\2\2\2\u01fb"+
		"\u01fd\5V,\2\u01fc\u01fe\5T+\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2"+
		"\u01fe\u0200\3\2\2\2\u01ff\u01f7\3\2\2\2\u01ff\u01fb\3\2\2\2\u0200S\3"+
		"\2\2\2\u0201\u0202\7b\2\2\u0202\u0203\7\u0088\2\2\u0203U\3\2\2\2\u0204"+
		"\u0205\7q\2\2\u0205\u0206\7\u0088\2\2\u0206W\3\2\2\2\u0207\u0208\7\25"+
		"\2\2\u0208\u020a\5x=\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020aY"+
		"\3\2\2\2\u020b\u0211\7g\2\2\u020c\u020e\7F\2\2\u020d\u020c\3\2\2\2\u020d"+
		"\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211\5\u00fe\u0080\2\u0210\u020b"+
		"\3\2\2\2\u0210\u020d\3\2\2\2\u0211[\3\2\2\2\u0212\u0213\7F\2\2\u0213\u0214"+
		"\5\u00fe\u0080\2\u0214]\3\2\2\2\u0215\u0216\7I\2\2\u0216\u0217\5`\61\2"+
		"\u0217\u0218\7/\2\2\u0218_\3\2\2\2\u0219\u021b\5d\63\2\u021a\u0219\3\2"+
		"\2\2\u021a\u021b\3\2\2\2\u021b\u0225\3\2\2\2\u021c\u021e\5b\62\2\u021d"+
		"\u021f\7r\2\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221\3\2"+
		"\2\2\u0220\u0222\5d\63\2\u0221\u0220\3\2\2\2\u0221\u0222\3\2\2\2\u0222"+
		"\u0224\3\2\2\2\u0223\u021c\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2"+
		"\2\2\u0225\u0226\3\2\2\2\u0226a\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u0229"+
		"\7F\2\2\u0229\u022a\5\u00c4c\2\u022a\u022c\7I\2\2\u022b\u022d\5d\63\2"+
		"\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f"+
		"\7/\2\2\u022fc\3\2\2\2\u0230\u0235\5\u0096L\2\u0231\u0233\7r\2\2\u0232"+
		"\u0234\5d\63\2\u0233\u0232\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0236\3\2"+
		"\2\2\u0235\u0231\3\2\2\2\u0235\u0236\3\2\2\2\u0236e\3\2\2\2\u0237\u0239"+
		"\7I\2\2\u0238\u023a\5h\65\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a"+
		"\u0244\3\2\2\2\u023b\u023d\5j\66\2\u023c\u023e\7r\2\2\u023d\u023c\3\2"+
		"\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u0241\5h\65\2\u0240"+
		"\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0243\3\2\2\2\u0242\u023b\3\2"+
		"\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"\u0247\3\2\2\2\u0246\u0244\3\2\2\2\u0247\u0248\7/\2\2\u0248g\3\2\2\2\u0249"+
		"\u024e\5\u00a4S\2\u024a\u024c\7r\2\2\u024b\u024d\5h\65\2\u024c\u024b\3"+
		"\2\2\2\u024c\u024d\3\2\2\2\u024d\u024f\3\2\2\2\u024e\u024a\3\2\2\2\u024e"+
		"\u024f\3\2\2\2\u024fi\3\2\2\2\u0250\u025a\5\u0086D\2\u0251\u025a\5l\67"+
		"\2\u0252\u025a\5\u0084C\2\u0253\u025a\5n8\2\u0254\u025a\5p9\2\u0255\u025a"+
		"\5r:\2\u0256\u025a\5\u0088E\2\u0257\u025a\5t;\2\u0258\u025a\5v<\2\u0259"+
		"\u0250\3\2\2\2\u0259\u0251\3\2\2\2\u0259\u0252\3\2\2\2\u0259\u0253\3\2"+
		"\2\2\u0259\u0254\3\2\2\2\u0259\u0255\3\2\2\2\u0259\u0256\3\2\2\2\u0259"+
		"\u0257\3\2\2\2\u0259\u0258\3\2\2\2\u025ak\3\2\2\2\u025b\u025c\7\37\2\2"+
		"\u025c\u025d\5f\64\2\u025dm\3\2\2\2\u025e\u025f\7F\2\2\u025f\u0260\5\u00c4"+
		"c\2\u0260\u0261\5f\64\2\u0261o\3\2\2\2\u0262\u0263\7\'\2\2\u0263\u0264"+
		"\5\u00c4c\2\u0264\u0265\5f\64\2\u0265q\3\2\2\2\u0266\u0268\7t\2\2\u0267"+
		"\u0269\7%\2\2\u0268\u0267\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\3\2"+
		"\2\2\u026a\u026b\5\u00c4c\2\u026b\u026c\5f\64\2\u026cs\3\2\2\2\u026d\u026e"+
		"\7;\2\2\u026e\u026f\7S\2\2\u026f\u0270\5\u00caf\2\u0270\u0271\7&\2\2\u0271"+
		"\u0272\5\u00c6d\2\u0272\u0273\7A\2\2\u0273u\3\2\2\2\u0274\u0275\7\25\2"+
		"\2\u0275\u0276\5x=\2\u0276w\3\2\2\2\u0277\u027a\5z>\2\u0278\u027a\5|?"+
		"\2\u0279\u0277\3\2\2\2\u0279\u0278\3\2\2\2\u027ay\3\2\2\2\u027b\u027c"+
		"\5\u00c6d\2\u027c\u0280\7I\2\2\u027d\u027f\5\u0080A\2\u027e\u027d\3\2"+
		"\2\2\u027f\u0282\3\2\2\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281"+
		"\u0283\3\2\2\2\u0282\u0280\3\2\2\2\u0283\u0284\7/\2\2\u0284{\3\2\2\2\u0285"+
		"\u028f\7\u0098\2\2\u0286\u028a\7S\2\2\u0287\u0289\5\u00c6d\2\u0288\u0287"+
		"\3\2\2\2\u0289\u028c\3\2\2\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b"+
		"\u028d\3\2\2\2\u028c\u028a\3\2\2\2\u028d\u028f\7A\2\2\u028e\u0285\3\2"+
		"\2\2\u028e\u0286\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0295\7I\2\2\u0291"+
		"\u0294\5~@\2\u0292\u0294\7\u0098\2\2\u0293\u0291\3\2\2\2\u0293\u0292\3"+
		"\2\2\2\u0294\u0297\3\2\2\2\u0295\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296"+
		"\u0298\3\2\2\2\u0297\u0295\3\2\2\2\u0298\u0299\7/\2\2\u0299}\3\2\2\2\u029a"+
		"\u029e\7S\2\2\u029b\u029d\5\u0080A\2\u029c\u029b\3\2\2\2\u029d\u02a0\3"+
		"\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a1\3\2\2\2\u02a0"+
		"\u029e\3\2\2\2\u02a1\u02a2\7A\2\2\u02a2\177\3\2\2\2\u02a3\u02a9\5\u00fe"+
		"\u0080\2\u02a4\u02a9\5\u00f0y\2\u02a5\u02a9\5\u00f2z\2\u02a6\u02a9\5\u00fa"+
		"~\2\u02a7\u02a9\5\u0082B\2\u02a8\u02a3\3\2\2\2\u02a8\u02a4\3\2\2\2\u02a8"+
		"\u02a5\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a7\3\2\2\2\u02a9\u0081\3\2"+
		"\2\2\u02aa\u02ab\7P\2\2\u02ab\u0083\3\2\2\2\u02ac\u02ad\7s\2\2\u02ad\u02ae"+
		"\5f\64\2\u02ae\u0085\3\2\2\2\u02af\u02b4\5f\64\2\u02b0\u02b1\7-\2\2\u02b1"+
		"\u02b3\5f\64\2\u02b2\u02b0\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2"+
		"\2\2\u02b4\u02b5\3\2\2\2\u02b5\u0087\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7"+
		"\u02b8\7C\2\2\u02b8\u02b9\5\u008aF\2\u02b9\u0089\3\2\2\2\u02ba\u02be\5"+
		"\u00dep\2\u02bb\u02be\5\u00e0q\2\u02bc\u02be\5\u008cG\2\u02bd\u02ba\3"+
		"\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02bc\3\2\2\2\u02be\u008b\3\2\2\2\u02bf"+
		"\u02c0\5\u00fe\u0080\2\u02c0\u02c1\5\u008eH\2\u02c1\u008d\3\2\2\2\u02c2"+
		"\u02d2\7\u0098\2\2\u02c3\u02c5\7S\2\2\u02c4\u02c6\5\32\16\2\u02c5\u02c4"+
		"\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02cc\5\u00caf"+
		"\2\u02c8\u02c9\7\17\2\2\u02c9\u02cb\5\u00caf\2\u02ca\u02c8\3\2\2\2\u02cb"+
		"\u02ce\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02cf\3\2"+
		"\2\2\u02ce\u02cc\3\2\2\2\u02cf\u02d0\7A\2\2\u02d0\u02d2\3\2\2\2\u02d1"+
		"\u02c2\3\2\2\2\u02d1\u02c3\3\2\2\2\u02d2\u008f\3\2\2\2\u02d3\u02e0\7\u0098"+
		"\2\2\u02d4\u02d5\7S\2\2\u02d5\u02da\5\u00caf\2\u02d6\u02d7\7\17\2\2\u02d7"+
		"\u02d9\5\u00caf\2\u02d8\u02d6\3\2\2\2\u02d9\u02dc\3\2\2\2\u02da\u02d8"+
		"\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dd\3\2\2\2\u02dc\u02da\3\2\2\2\u02dd"+
		"\u02de\7A\2\2\u02de\u02e0\3\2\2\2\u02df\u02d3\3\2\2\2\u02df\u02d4\3\2"+
		"\2\2\u02e0\u0091\3\2\2\2\u02e1\u02e2\7I\2\2\u02e2\u02e3\5`\61\2\u02e3"+
		"\u02e4\7/\2\2\u02e4\u0093\3\2\2\2\u02e5\u02ea\5\u0096L\2\u02e6\u02e8\7"+
		"r\2\2\u02e7\u02e9\5\u0094K\2\u02e8\u02e7\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9"+
		"\u02eb\3\2\2\2\u02ea\u02e6\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u0095\3\2"+
		"\2\2\u02ec\u02ed\5\u00c2b\2\u02ed\u02ee\5\u0098M\2\u02ee\u02f4\3\2\2\2"+
		"\u02ef\u02f1\5\u00b2Z\2\u02f0\u02f2\5\u0098M\2\u02f1\u02f0\3\2\2\2\u02f1"+
		"\u02f2\3\2\2\2\u02f2\u02f4\3\2\2\2\u02f3\u02ec\3\2\2\2\u02f3\u02ef\3\2"+
		"\2\2\u02f4\u0097\3\2\2\2\u02f5\u02fc\5\u009aN\2\u02f6\u02f8\7,\2\2\u02f7"+
		"\u02f9\5\u009aN\2\u02f8\u02f7\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fb"+
		"\3\2\2\2\u02fa\u02f6\3\2\2\2\u02fb\u02fe\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fc"+
		"\u02fd\3\2\2\2\u02fd\u0099\3\2\2\2\u02fe\u02fc\3\2\2\2\u02ff\u0300\5\u009c"+
		"O\2\u0300\u0301\5\u00a0Q\2\u0301\u009b\3\2\2\2\u0302\u0305\5\u00c4c\2"+
		"\u0303\u0305\5\u009eP\2\u0304\u0302\3\2\2\2\u0304\u0303\3\2\2\2\u0305"+
		"\u009d\3\2\2\2\u0306\u0307\7~\2\2\u0307\u009f\3\2\2\2\u0308\u030d\5\u00a2"+
		"R\2\u0309\u030a\7\17\2\2\u030a\u030c\5\u00a2R\2\u030b\u0309\3\2\2\2\u030c"+
		"\u030f\3\2\2\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u00a1\3\2"+
		"\2\2\u030f\u030d\3\2\2\2\u0310\u0311\5\u00be`\2\u0311\u00a3\3\2\2\2\u0312"+
		"\u0313\5\u00c2b\2\u0313\u0314\5\u00a6T\2\u0314\u031a\3\2\2\2\u0315\u0317"+
		"\5\u00b6\\\2\u0316\u0318\5\u00a6T\2\u0317\u0316\3\2\2\2\u0317\u0318\3"+
		"\2\2\2\u0318\u031a\3\2\2\2\u0319\u0312\3\2\2\2\u0319\u0315\3\2\2\2\u031a"+
		"\u00a5\3\2\2\2\u031b\u0320\5\u00a8U\2\u031c\u031d\7,\2\2\u031d\u031f\5"+
		"\u00a8U\2\u031e\u031c\3\2\2\2\u031f\u0322\3\2\2\2\u0320\u031e\3\2\2\2"+
		"\u0320\u0321\3\2\2\2\u0321\u00a7\3\2\2\2\u0322\u0320\3\2\2\2\u0323\u0324"+
		"\5\u00aaV\2\u0324\u0325\5\u00acW\2\u0325\u00a9\3\2\2\2\u0326\u0329\5\u00c6"+
		"d\2\u0327\u0329\5\u009eP\2\u0328\u0326\3\2\2\2\u0328\u0327\3\2\2\2\u0329"+
		"\u00ab\3\2\2\2\u032a\u032f\5\u00aeX\2\u032b\u032c\7\17\2\2\u032c\u032e"+
		"\5\u00aeX\2\u032d\u032b\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2"+
		"\2\u032f\u0330\3\2\2\2\u0330\u00ad\3\2\2\2\u0331\u032f\3\2\2\2\u0332\u0333"+
		"\5\u00c0a\2\u0333\u00af\3\2\2\2\u0334\u0335\7\u0088\2\2\u0335\u00b1\3"+
		"\2\2\2\u0336\u0339\5\u00ba^\2\u0337\u0339\5\u00b4[\2\u0338\u0336\3\2\2"+
		"\2\u0338\u0337\3\2\2\2\u0339\u00b3\3\2\2\2\u033a\u033b\79\2\2\u033b\u033c"+
		"\5\u0098M\2\u033c\u033d\7\33\2\2\u033d\u00b5\3\2\2\2\u033e\u0341\5\u00bc"+
		"_\2\u033f\u0341\5\u00b8]\2\u0340\u033e\3\2\2\2\u0340\u033f\3\2\2\2\u0341"+
		"\u00b7\3\2\2\2\u0342\u0343\79\2\2\u0343\u0344\5\u00a6T\2\u0344\u0345\7"+
		"\33\2\2\u0345\u00b9\3\2\2\2\u0346\u0348\7S\2\2\u0347\u0349\5\u00be`\2"+
		"\u0348\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u0348\3\2\2\2\u034a\u034b"+
		"\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034d\7A\2\2\u034d\u00bb\3\2\2\2\u034e"+
		"\u0350\7S\2\2\u034f\u0351\5\u00c0a\2\u0350\u034f\3\2\2\2\u0351\u0352\3"+
		"\2\2\2\u0352\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354\3\2\2\2\u0354"+
		"\u0355\7A\2\2\u0355\u00bd\3\2\2\2\u0356\u0359\5\u00c2b\2\u0357\u0359\5"+
		"\u00b2Z\2\u0358\u0356\3\2\2\2\u0358\u0357\3\2\2\2\u0359\u00bf\3\2\2\2"+
		"\u035a\u035d\5\u00c2b\2\u035b\u035d\5\u00b6\\\2\u035c\u035a\3\2\2\2\u035c"+
		"\u035b\3\2\2\2\u035d\u00c1\3\2\2\2\u035e\u0361\5\u00c6d\2\u035f\u0361"+
		"\5\u00c8e\2\u0360\u035e\3\2\2\2\u0360\u035f\3\2\2\2\u0361\u00c3\3\2\2"+
		"\2\u0362\u0365\5\u00c6d\2\u0363\u0365\5\u00fe\u0080\2\u0364\u0362\3\2"+
		"\2\2\u0364\u0363\3\2\2\2\u0365\u00c5\3\2\2\2\u0366\u0367\t\4\2\2\u0367"+
		"\u00c7\3\2\2\2\u0368\u036f\5\u00fe\u0080\2\u0369\u036f\5\u00f0y\2\u036a"+
		"\u036f\5\u00f2z\2\u036b\u036f\5\u00fa~\2\u036c\u036f\5\u0102\u0082\2\u036d"+
		"\u036f\7\u0098\2\2\u036e\u0368\3\2\2\2\u036e\u0369\3\2\2\2\u036e\u036a"+
		"\3\2\2\2\u036e\u036b\3\2\2\2\u036e\u036c\3\2\2\2\u036e\u036d\3\2\2\2\u036f"+
		"\u00c9\3\2\2\2\u0370\u0371\5\u00ccg\2\u0371\u00cb\3\2\2\2\u0372\u0377"+
		"\5\u00ceh\2\u0373\u0374\7h\2\2\u0374\u0376\5\u00ceh\2\u0375\u0373\3\2"+
		"\2\2\u0376\u0379\3\2\2\2\u0377\u0375\3\2\2\2\u0377\u0378\3\2\2\2\u0378"+
		"\u00cd\3\2\2\2\u0379\u0377\3\2\2\2\u037a\u037f\5\u00d0i\2\u037b\u037c"+
		"\7\n\2\2\u037c\u037e\5\u00d0i\2\u037d\u037b\3\2\2\2\u037e\u0381\3\2\2"+
		"\2\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u00cf\3\2\2\2\u0381\u037f"+
		"\3\2\2\2\u0382\u0383\5\u00d2j\2\u0383\u00d1\3\2\2\2\u0384\u038c\5\u00d4"+
		"k\2\u0385\u0386\7\u0096\2\2\u0386\u038d\5\u00d4k\2\u0387\u0389\7k\2\2"+
		"\u0388\u0387\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038b"+
		"\7z\2\2\u038b\u038d\5\u0090I\2\u038c\u0385\3\2\2\2\u038c\u0388\3\2\2\2"+
		"\u038c\u038d\3\2\2\2\u038d\u00d3\3\2\2\2\u038e\u0392\5\u00d8m\2\u038f"+
		"\u0391\5\u00d6l\2\u0390\u038f\3\2\2\2\u0391\u0394\3\2\2\2\u0392\u0390"+
		"\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u00d5\3\2\2\2\u0394\u0392\3\2\2\2\u0395"+
		"\u0396\7\"\2\2\u0396\u03a7\5\u00d8m\2\u0397\u0398\7}\2\2\u0398\u03a7\5"+
		"\u00d8m\2\u0399\u039c\5\u00f6|\2\u039a\u039c\5\u00f8}\2\u039b\u0399\3"+
		"\2\2\2\u039b\u039a\3\2\2\2\u039c\u03a3\3\2\2\2\u039d\u039e\7\62\2\2\u039e"+
		"\u03a2\5\u00dan\2\u039f\u03a0\7a\2\2\u03a0\u03a2\5\u00dan\2\u03a1\u039d"+
		"\3\2\2\2\u03a1\u039f\3\2\2\2\u03a2\u03a5\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a3"+
		"\u03a4\3\2\2\2\u03a4\u03a7\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a6\u0395\3\2"+
		"\2\2\u03a6\u0397\3\2\2\2\u03a6\u039b\3\2\2\2\u03a7\u00d7\3\2\2\2\u03a8"+
		"\u03af\5\u00dan\2\u03a9\u03aa\7\62\2\2\u03aa\u03ae\5\u00dan\2\u03ab\u03ac"+
		"\7a\2\2\u03ac\u03ae\5\u00dan\2\u03ad\u03a9\3\2\2\2\u03ad\u03ab\3\2\2\2"+
		"\u03ae\u03b1\3\2\2\2\u03af\u03ad\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u00d9"+
		"\3\2\2\2\u03b1\u03af\3\2\2\2\u03b2\u03b3\7>\2\2\u03b3\u03ba\5\u00dco\2"+
		"\u03b4\u03b5\7\"\2\2\u03b5\u03ba\5\u00dco\2\u03b6\u03b7\7}\2\2\u03b7\u03ba"+
		"\5\u00dco\2\u03b8\u03ba\5\u00dco\2\u03b9\u03b2\3\2\2\2\u03b9\u03b4\3\2"+
		"\2\2\u03b9\u03b6\3\2\2\2\u03b9\u03b8\3\2\2\2\u03ba\u00db\3\2\2\2\u03bb"+
		"\u03c3\5\u00dep\2\u03bc\u03c3\5\u00e0q\2\u03bd\u03c3\5\u00eex\2\u03be"+
		"\u03c3\5\u00f0y\2\u03bf\u03c3\5\u00f2z\2\u03c0\u03c3\5\u00fa~\2\u03c1"+
		"\u03c3\5\u00c6d\2\u03c2\u03bb\3\2\2\2\u03c2\u03bc\3\2\2\2\u03c2\u03bd"+
		"\3\2\2\2\u03c2\u03be\3\2\2\2\u03c2\u03bf\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c2"+
		"\u03c1\3\2\2\2\u03c3\u00dd\3\2\2\2\u03c4\u03c5\7S\2\2\u03c5\u03c6\5\u00ca"+
		"f\2\u03c6\u03c7\7A\2\2\u03c7\u00df\3\2\2\2\u03c8\u04cb\5\u00ecw\2\u03c9"+
		"\u03ca\7<\2\2\u03ca\u03cb\7S\2\2\u03cb\u03cc\5\u00caf\2\u03cc\u03cd\7"+
		"A\2\2\u03cd\u04cb\3\2\2\2\u03ce\u03cf\7\16\2\2\u03cf\u03d0\7S\2\2\u03d0"+
		"\u03d1\5\u00caf\2\u03d1\u03d2\7A\2\2\u03d2\u04cb\3\2\2\2\u03d3\u03d4\7"+
		"K\2\2\u03d4\u03d5\7S\2\2\u03d5\u03d6\5\u00caf\2\u03d6\u03d7\7\17\2\2\u03d7"+
		"\u03d8\5\u00caf\2\u03d8\u03d9\7A\2\2\u03d9\u04cb\3\2\2\2\u03da\u03db\7"+
		"+\2\2\u03db\u03dc\7S\2\2\u03dc\u03dd\5\u00caf\2\u03dd\u03de\7A\2\2\u03de"+
		"\u04cb\3\2\2\2\u03df\u03e0\7`\2\2\u03e0\u03e1\7S\2\2\u03e1\u03e2\5\u00c6"+
		"d\2\u03e2\u03e3\7A\2\2\u03e3\u04cb\3\2\2\2\u03e4\u03e5\7 \2\2\u03e5\u03e6"+
		"\7S\2\2\u03e6\u03e7\5\u00caf\2\u03e7\u03e8\7A\2\2\u03e8\u04cb\3\2\2\2"+
		"\u03e9\u03ea\7[\2\2\u03ea\u03eb\7S\2\2\u03eb\u03ec\5\u00caf\2\u03ec\u03ed"+
		"\7A\2\2\u03ed\u04cb\3\2\2\2\u03ee\u03f4\7O\2\2\u03ef\u03f0\7S\2\2\u03f0"+
		"\u03f1\5\u00caf\2\u03f1\u03f2\7A\2\2\u03f2\u03f5\3\2\2\2\u03f3\u03f5\7"+
		"\u0098\2\2\u03f4\u03ef\3\2\2\2\u03f4\u03f3\3\2\2\2\u03f5\u04cb\3\2\2\2"+
		"\u03f6\u03f7\7\b\2\2\u03f7\u04cb\7\u0098\2\2\u03f8\u03f9\7\4\2\2\u03f9"+
		"\u03fa\7S\2\2\u03fa\u03fb\5\u00caf\2\u03fb\u03fc\7A\2\2\u03fc\u04cb\3"+
		"\2\2\2\u03fd\u03fe\7\61\2\2\u03fe\u03ff\7S\2\2\u03ff\u0400\5\u00caf\2"+
		"\u0400\u0401\7A\2\2\u0401\u04cb\3\2\2\2\u0402\u0403\7H\2\2\u0403\u0404"+
		"\7S\2\2\u0404\u0405\5\u00caf\2\u0405\u0406\7A\2\2\u0406\u04cb\3\2\2\2"+
		"\u0407\u0408\7\21\2\2\u0408\u0409\7S\2\2\u0409\u040a\5\u00caf\2\u040a"+
		"\u040b\7A\2\2\u040b\u04cb\3\2\2\2\u040c\u040d\7^\2\2\u040d\u04cb\5\u0090"+
		"I\2\u040e\u04cb\5\u00e4s\2\u040f\u0410\7\60\2\2\u0410\u0411\7S\2\2\u0411"+
		"\u0412\5\u00caf\2\u0412\u0413\7A\2\2\u0413\u04cb\3\2\2\2\u0414\u04cb\5"+
		"\u00e6t\2\u0415\u0416\7]\2\2\u0416\u0417\7S\2\2\u0417\u0418\5\u00caf\2"+
		"\u0418\u0419\7A\2\2\u0419\u04cb\3\2\2\2\u041a\u041b\7E\2\2\u041b\u041c"+
		"\7S\2\2\u041c\u041d\5\u00caf\2\u041d\u041e\7A\2\2\u041e\u04cb\3\2\2\2"+
		"\u041f\u0420\7\27\2\2\u0420\u0421\7S\2\2\u0421\u0422\5\u00caf\2\u0422"+
		"\u0423\7A\2\2\u0423\u04cb\3\2\2\2\u0424\u0425\7N\2\2\u0425\u0426\7S\2"+
		"\2\u0426\u0427\5\u00caf\2\u0427\u0428\7\17\2\2\u0428\u0429\5\u00caf\2"+
		"\u0429\u042a\7A\2\2\u042a\u04cb\3\2\2\2\u042b\u042c\7\22\2\2\u042c\u042d"+
		"\7S\2\2\u042d\u042e\5\u00caf\2\u042e\u042f\7\17\2\2\u042f\u0430\5\u00ca"+
		"f\2\u0430\u0431\7A\2\2\u0431\u04cb\3\2\2\2\u0432\u0433\7d\2\2\u0433\u0434"+
		"\7S\2\2\u0434\u0435\5\u00caf\2\u0435\u0436\7\17\2\2\u0436\u0437\5\u00ca"+
		"f\2\u0437\u0438\7A\2\2\u0438\u04cb\3\2\2\2\u0439\u043a\7\r\2\2\u043a\u043b"+
		"\7S\2\2\u043b\u043c\5\u00caf\2\u043c\u043d\7\17\2\2\u043d\u043e\5\u00ca"+
		"f\2\u043e\u043f\7A\2\2\u043f\u04cb\3\2\2\2\u0440\u0441\7u\2\2\u0441\u0442"+
		"\7S\2\2\u0442\u0443\5\u00caf\2\u0443\u0444\7\17\2\2\u0444\u0445\5\u00ca"+
		"f\2\u0445\u0446\7A\2\2\u0446\u04cb\3\2\2\2\u0447\u0448\7Y\2\2\u0448\u0449"+
		"\7S\2\2\u0449\u044a\5\u00caf\2\u044a\u044b\7A\2\2\u044b\u04cb\3\2\2\2"+
		"\u044c\u044d\7U\2\2\u044d\u044e\7S\2\2\u044e\u044f\5\u00caf\2\u044f\u0450"+
		"\7A\2\2\u0450\u04cb\3\2\2\2\u0451\u0452\7\67\2\2\u0452\u0453\7S\2\2\u0453"+
		"\u0454\5\u00caf\2\u0454\u0455\7A\2\2\u0455\u04cb\3\2\2\2\u0456\u0457\7"+
		"=\2\2\u0457\u0458\7S\2\2\u0458\u0459\5\u00caf\2\u0459\u045a\7A\2\2\u045a"+
		"\u04cb\3\2\2\2\u045b\u045c\7\32\2\2\u045c\u045d\7S\2\2\u045d\u045e\5\u00ca"+
		"f\2\u045e\u045f\7A\2\2\u045f\u04cb\3\2\2\2\u0460\u0461\7D\2\2\u0461\u0462"+
		"\7S\2\2\u0462\u0463\5\u00caf\2\u0463\u0464\7A\2\2\u0464\u04cb\3\2\2\2"+
		"\u0465\u0466\7\7\2\2\u0466\u0467\7S\2\2\u0467\u0468\5\u00caf\2\u0468\u0469"+
		"\7A\2\2\u0469\u04cb\3\2\2\2\u046a\u046b\7\36\2\2\u046b\u046c\7S\2\2\u046c"+
		"\u046d\5\u00caf\2\u046d\u046e\7A\2\2\u046e\u04cb\3\2\2\2\u046f\u0470\7"+
		":\2\2\u0470\u04cb\7\u0098\2\2\u0471\u0472\7Q\2\2\u0472\u04cb\7\u0098\2"+
		"\2\u0473\u0474\7c\2\2\u0474\u04cb\7\u0098\2\2\u0475\u0476\7T\2\2\u0476"+
		"\u0477\7S\2\2\u0477\u0478\5\u00caf\2\u0478\u0479\7A\2\2\u0479\u04cb\3"+
		"\2\2\2\u047a\u047b\7\66\2\2\u047b\u047c\7S\2\2\u047c\u047d\5\u00caf\2"+
		"\u047d\u047e\7A\2\2\u047e\u04cb\3\2\2\2\u047f\u0480\7#\2\2\u0480\u0481"+
		"\7S\2\2\u0481\u0482\5\u00caf\2\u0482\u0483\7A\2\2\u0483\u04cb\3\2\2\2"+
		"\u0484\u0485\7R\2\2\u0485\u0486\7S\2\2\u0486\u0487\5\u00caf\2\u0487\u0488"+
		"\7A\2\2\u0488\u04cb\3\2\2\2\u0489\u048a\7l\2\2\u048a\u048b\7S\2\2\u048b"+
		"\u048c\5\u00caf\2\u048c\u048d\7A\2\2\u048d\u04cb\3\2\2\2\u048e\u048f\7"+
		")\2\2\u048f\u04cb\5\u0090I\2\u0490\u0491\7j\2\2\u0491\u0492\7S\2\2\u0492"+
		"\u0493\5\u00caf\2\u0493\u0494\7\17\2\2\u0494\u0495\5\u00caf\2\u0495\u0496"+
		"\7\17\2\2\u0496\u0497\5\u00caf\2\u0497\u0498\7A\2\2\u0498\u04cb\3\2\2"+
		"\2\u0499\u049a\7\65\2\2\u049a\u049b\7S\2\2\u049b\u049c\5\u00caf\2\u049c"+
		"\u049d\7\17\2\2\u049d\u049e\5\u00caf\2\u049e\u049f\7A\2\2\u049f\u04cb"+
		"\3\2\2\2\u04a0\u04a1\7*\2\2\u04a1\u04a2\7S\2\2\u04a2\u04a3\5\u00caf\2"+
		"\u04a3\u04a4\7\17\2\2\u04a4\u04a5\5\u00caf\2\u04a5\u04a6\7A\2\2\u04a6"+
		"\u04cb\3\2\2\2\u04a7\u04a8\7{\2\2\u04a8\u04a9\7S\2\2\u04a9\u04aa\5\u00ca"+
		"f\2\u04aa\u04ab\7\17\2\2\u04ab\u04ac\5\u00caf\2\u04ac\u04ad\7A\2\2\u04ad"+
		"\u04cb\3\2\2\2\u04ae\u04af\7\64\2\2\u04af\u04b0\7S\2\2\u04b0\u04b1\5\u00ca"+
		"f\2\u04b1\u04b2\7A\2\2\u04b2\u04cb\3\2\2\2\u04b3\u04b4\7i\2\2\u04b4\u04b5"+
		"\7S\2\2\u04b5\u04b6\5\u00caf\2\u04b6\u04b7\7A\2\2\u04b7\u04cb\3\2\2\2"+
		"\u04b8\u04b9\7J\2\2\u04b9\u04ba\7S\2\2\u04ba\u04bb\5\u00caf\2\u04bb\u04bc"+
		"\7A\2\2\u04bc\u04cb\3\2\2\2\u04bd\u04be\7\35\2\2\u04be\u04bf\7S\2\2\u04bf"+
		"\u04c0\5\u00caf\2\u04c0\u04c1\7A\2\2\u04c1\u04cb\3\2\2\2\u04c2\u04c3\7"+
		"f\2\2\u04c3\u04c4\7S\2\2\u04c4\u04c5\5\u00caf\2\u04c5\u04c6\7A\2\2\u04c6"+
		"\u04cb\3\2\2\2\u04c7\u04cb\5\u00e2r\2\u04c8\u04cb\5\u00e8u\2\u04c9\u04cb"+
		"\5\u00eav\2\u04ca\u03c8\3\2\2\2\u04ca\u03c9\3\2\2\2\u04ca\u03ce\3\2\2"+
		"\2\u04ca\u03d3\3\2\2\2\u04ca\u03da\3\2\2\2\u04ca\u03df\3\2\2\2\u04ca\u03e4"+
		"\3\2\2\2\u04ca\u03e9\3\2\2\2\u04ca\u03ee\3\2\2\2\u04ca\u03f6\3\2\2\2\u04ca"+
		"\u03f8\3\2\2\2\u04ca\u03fd\3\2\2\2\u04ca\u0402\3\2\2\2\u04ca\u0407\3\2"+
		"\2\2\u04ca\u040c\3\2\2\2\u04ca\u040e\3\2\2\2\u04ca\u040f\3\2\2\2\u04ca"+
		"\u0414\3\2\2\2\u04ca\u0415\3\2\2\2\u04ca\u041a\3\2\2\2\u04ca\u041f\3\2"+
		"\2\2\u04ca\u0424\3\2\2\2\u04ca\u042b\3\2\2\2\u04ca\u0432\3\2\2\2\u04ca"+
		"\u0439\3\2\2\2\u04ca\u0440\3\2\2\2\u04ca\u0447\3\2\2\2\u04ca\u044c\3\2"+
		"\2\2\u04ca\u0451\3\2\2\2\u04ca\u0456\3\2\2\2\u04ca\u045b\3\2\2\2\u04ca"+
		"\u0460\3\2\2\2\u04ca\u0465\3\2\2\2\u04ca\u046a\3\2\2\2\u04ca\u046f\3\2"+
		"\2\2\u04ca\u0471\3\2\2\2\u04ca\u0473\3\2\2\2\u04ca\u0475\3\2\2\2\u04ca"+
		"\u047a\3\2\2\2\u04ca\u047f\3\2\2\2\u04ca\u0484\3\2\2\2\u04ca\u0489\3\2"+
		"\2\2\u04ca\u048e\3\2\2\2\u04ca\u0490\3\2\2\2\u04ca\u0499\3\2\2\2\u04ca"+
		"\u04a0\3\2\2\2\u04ca\u04a7\3\2\2\2\u04ca\u04ae\3\2\2\2\u04ca\u04b3\3\2"+
		"\2\2\u04ca\u04b8\3\2\2\2\u04ca\u04bd\3\2\2\2\u04ca\u04c2\3\2\2\2\u04ca"+
		"\u04c7\3\2\2\2\u04ca\u04c8\3\2\2\2\u04ca\u04c9\3\2\2\2\u04cb\u00e1\3\2"+
		"\2\2\u04cc\u04cd\7m\2\2\u04cd\u04ce\7S\2\2\u04ce\u04cf\5\u00caf\2\u04cf"+
		"\u04d0\7\17\2\2\u04d0\u04d3\5\u00caf\2\u04d1\u04d2\7\17\2\2\u04d2\u04d4"+
		"\5\u00caf\2\u04d3\u04d1\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d5\3\2\2"+
		"\2\u04d5\u04d6\7A\2\2\u04d6\u00e3\3\2\2\2\u04d7\u04d8\7?\2\2\u04d8\u04d9"+
		"\7S\2\2\u04d9\u04da\5\u00caf\2\u04da\u04db\7\17\2\2\u04db\u04de\5\u00ca"+
		"f\2\u04dc\u04dd\7\17\2\2\u04dd\u04df\5\u00caf\2\u04de\u04dc\3\2\2\2\u04de"+
		"\u04df\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1\7A\2\2\u04e1\u00e5\3\2"+
		"\2\2\u04e2\u04e3\7V\2\2\u04e3\u04e4\7S\2\2\u04e4\u04e5\5\u00caf\2\u04e5"+
		"\u04e6\7\17\2\2\u04e6\u04e7\5\u00caf\2\u04e7\u04e8\7\17\2\2\u04e8\u04eb"+
		"\5\u00caf\2\u04e9\u04ea\7\17\2\2\u04ea\u04ec\5\u00caf\2\u04eb\u04e9\3"+
		"\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04ee\7A\2\2\u04ee"+
		"\u00e7\3\2\2\2\u04ef\u04f0\7\6\2\2\u04f0\u04f1\5f\64\2\u04f1\u00e9\3\2"+
		"\2\2\u04f2\u04f3\7k\2\2\u04f3\u04f4\7\6\2\2\u04f4\u04f5\5f\64\2\u04f5"+
		"\u00eb\3\2\2\2\u04f6\u04f7\7w\2\2\u04f7\u04f9\7S\2\2\u04f8\u04fa\5\32"+
		"\16\2\u04f9\u04f8\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04fd\3\2\2\2\u04fb"+
		"\u04fe\7\62\2\2\u04fc\u04fe\5\u00caf\2\u04fd\u04fb\3\2\2\2\u04fd\u04fc"+
		"\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0537\7A\2\2\u0500\u0501\7Z\2\2\u0501"+
		"\u0503\7S\2\2\u0502\u0504\5\32\16\2\u0503\u0502\3\2\2\2\u0503\u0504\3"+
		"\2\2\2\u0504\u0505\3\2\2\2\u0505\u0506\5\u00caf\2\u0506\u0507\7A\2\2\u0507"+
		"\u0537\3\2\2\2\u0508\u0509\78\2\2\u0509\u050b\7S\2\2\u050a\u050c\5\32"+
		"\16\2\u050b\u050a\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u050d\3\2\2\2\u050d"+
		"\u050e\5\u00caf\2\u050e\u050f\7A\2\2\u050f\u0537\3\2\2\2\u0510\u0511\7"+
		"_\2\2\u0511\u0513\7S\2\2\u0512\u0514\5\32\16\2\u0513\u0512\3\2\2\2\u0513"+
		"\u0514\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0516\5\u00caf\2\u0516\u0517"+
		"\7A\2\2\u0517\u0537\3\2\2\2\u0518\u0519\7v\2\2\u0519\u051b\7S\2\2\u051a"+
		"\u051c\5\32\16\2\u051b\u051a\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051d\3"+
		"\2\2\2\u051d\u051e\5\u00caf\2\u051e\u051f\7A\2\2\u051f\u0537\3\2\2\2\u0520"+
		"\u0521\7\5\2\2\u0521\u0523\7S\2\2\u0522\u0524\5\32\16\2\u0523\u0522\3"+
		"\2\2\2\u0523\u0524\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0526\5\u00caf\2"+
		"\u0526\u0527\7A\2\2\u0527\u0537\3\2\2\2\u0528\u0529\7@\2\2\u0529\u052b"+
		"\7S\2\2\u052a\u052c\5\32\16\2\u052b\u052a\3\2\2\2\u052b\u052c\3\2\2\2"+
		"\u052c\u052d\3\2\2\2\u052d\u0532\5\u00caf\2\u052e\u052f\7,\2\2\u052f\u0530"+
		"\7\3\2\2\u0530\u0531\7\13\2\2\u0531\u0533\5\u00fc\177\2\u0532\u052e\3"+
		"\2\2\2\u0532\u0533\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0535\7A\2\2\u0535"+
		"\u0537\3\2\2\2\u0536\u04f6\3\2\2\2\u0536\u0500\3\2\2\2\u0536\u0508\3\2"+
		"\2\2\u0536\u0510\3\2\2\2\u0536\u0518\3\2\2\2\u0536\u0520\3\2\2\2\u0536"+
		"\u0528\3\2\2\2\u0537\u00ed\3\2\2\2\u0538\u053a\5\u00fe\u0080\2\u0539\u053b"+
		"\5\u008eH\2\u053a\u0539\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u00ef\3\2\2"+
		"\2\u053c\u0540\5\u00fc\177\2\u053d\u0541\7\u0087\2\2\u053e\u053f\7\t\2"+
		"\2\u053f\u0541\5\u00fe\u0080\2\u0540\u053d\3\2\2\2\u0540\u053e\3\2\2\2"+
		"\u0540\u0541\3\2\2\2\u0541\u00f1\3\2\2\2\u0542\u0546\5\u00f4{\2\u0543"+
		"\u0546\5\u00f6|\2\u0544\u0546\5\u00f8}\2\u0545\u0542\3\2\2\2\u0545\u0543"+
		"\3\2\2\2\u0545\u0544\3\2\2\2\u0546\u00f3\3\2\2\2\u0547\u0548\t\5\2\2\u0548"+
		"\u00f5\3\2\2\2\u0549\u054a\t\6\2\2\u054a\u00f7\3\2\2\2\u054b\u054c\t\7"+
		"\2\2\u054c\u00f9\3\2\2\2\u054d\u054e\t\b\2\2\u054e\u00fb\3\2\2\2\u054f"+
		"\u0550\t\t\2\2\u0550\u00fd\3\2\2\2\u0551\u0554\7\u0081\2\2\u0552\u0554"+
		"\5\u0100\u0081\2\u0553\u0551\3\2\2\2\u0553\u0552\3\2\2\2\u0554\u00ff\3"+
		"\2\2\2\u0555\u0556\t\n\2\2\u0556\u0101\3\2\2\2\u0557\u0558\t\13\2\2\u0558"+
		"\u0103\3\2\2\2~\u0108\u010e\u0114\u0116\u012d\u0136\u013b\u013e\u0149"+
		"\u0154\u015d\u0163\u0167\u016d\u0170\u0175\u0179\u0181\u018b\u01a1\u01a5"+
		"\u01af\u01bc\u01c1\u01c4\u01c7\u01ca\u01d1\u01d9\u01de\u01e4\u01ed\u01f3"+
		"\u01f5\u01f9\u01fd\u01ff\u0209\u020d\u0210\u021a\u021e\u0221\u0225\u022c"+
		"\u0233\u0235\u0239\u023d\u0240\u0244\u024c\u024e\u0259\u0268\u0279\u0280"+
		"\u028a\u028e\u0293\u0295\u029e\u02a8\u02b4\u02bd\u02c5\u02cc\u02d1\u02da"+
		"\u02df\u02e8\u02ea\u02f1\u02f3\u02f8\u02fc\u0304\u030d\u0317\u0319\u0320"+
		"\u0328\u032f\u0338\u0340\u034a\u0352\u0358\u035c\u0360\u0364\u036e\u0377"+
		"\u037f\u0388\u038c\u0392\u039b\u03a1\u03a3\u03a6\u03ad\u03af\u03b9\u03c2"+
		"\u03f4\u04ca\u04d3\u04de\u04eb\u04f9\u04fd\u0503\u050b\u0513\u051b\u0523"+
		"\u052b\u0532\u0536\u053a\u0540\u0545\u0553";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}