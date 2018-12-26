// Generated from phisco/streams/polimi/it/antlr4/RSPQL.g4 by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

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
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, VAR_SINGLE_CHAR=113, 
		NOT=114, DISTINCT=115, REDUCED=116, BOOL=117, STAR=118, UNDEF=119, TYPE=120, 
		COMMENT=121, DURATION=122, IRIREF=123, PNAME_NS=124, PNAME_LN=125, BLANK_NODE_LABEL=126, 
		LANGTAG=127, INTEGER=128, DECIMAL=129, DOUBLE=130, INTEGER_POSITIVE=131, 
		DECIMAL_POSITIVE=132, DOUBLE_POSITIVE=133, INTEGER_NEGATIVE=134, DECIMAL_NEGATIVE=135, 
		DOUBLE_NEGATIVE=136, EXPONENT=137, STRING_LITERAL1=138, STRING_LITERAL2=139, 
		STRING_LITERAL_LONG1=140, STRING_LITERAL_LONG2=141, BINARY_OPERATOR=142, 
		ECHAR=143, NIL=144, WS=145, ANON=146, PN_CHARS_BASE=147, PN_CHARS_U=148, 
		VARNAME=149, PN_CHARS=150, PN_PREFIX=151, PN_LOCAL=152, PLX=153, PERCENT=154, 
		HEX=155, PN_LOCAL_ESC=156, ANYCHAR=157;
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
		RULE_prefixedName = 83, RULE_blankNode = 84, RULE_var = 85, RULE_varname = 86;
	private static String[] makeRuleNames() {
		return new String[] {
			"queryUnit", "query", "prologue", "baseDecl", "prefixDecl", "registerClause", 
			"selectQuery", "selectClause", "selectModifier", "resultVar", "constructQuery", 
			"describeQuery", "askQuery", "datasetClause", "namedGraphClause", "namedWindowClause", 
			"windowDefinition", "physicalWindow", "physicalRange", "physicalStep", 
			"logicalWindow", "logicalRange", "logicalStep", "whereClause", "duration", 
			"solutionModifier", "groupClause", "groupCondition", "havingClause", 
			"havingCondition", "orderClause", "orderCondition", "limitOffsetClauses", 
			"limitClause", "offsetClause", "groupGraphPattern", "graphPatternSub", 
			"triplesSameSubject", "propertyListNotEmpty", "property", "verb", "objectList", 
			"object", "varOrTerm", "blankNodePropertyList", "graphPatternNotTriples", 
			"groupOrUnionGraphPattern", "optionalGraphPattern", "minusGraphPattern", 
			"graphGraphPattern", "windowGraphPattern", "filter", "bindPattern", "varOrIri", 
			"graphTerm", "expression", "conditionalAndExpression", "valueLogical", 
			"relationalExpression", "expressionList", "numericExpression", "multiplicativeExpression", 
			"unaryExpression", "primaryExpression", "brackettedExpression", "builtInCall", 
			"rdfliteral", "numericLiteral", "numericLiteralUnsigned", "numericLiteralPositive", 
			"numericLiteralNegative", "argList", "constraint", "aggregate", "unaryBuiltin", 
			"binaryBuiltin", "ternaryBuiltin", "ternaryOrBinaryBuiltin", "strReplaceExpression", 
			"boundExpression", "existsFunc", "string", "iri", "prefixedName", "blankNode", 
			"var", "varname"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'BASE'", "'PREFIX'", "'REGISTER'", "'ISTREAM'", "'RSTREAM'", 
			"'DSTREAM'", "'AS'", "'SELECT'", "'('", "')'", "'CONSTRUCT'", "'{'", 
			"'.'", "'}'", "'DESCRIBE'", "'ASK'", "'FROM'", "'NAMED'", "'WINDOW'", 
			"'ON'", "'['", "']'", "'ELEMENTS'", "'STEP'", "'RANGE'", "'WHERE'", "'GROUP'", 
			"'BY'", "'HAVING'", "'ORDER'", "'ASC'", "'DESC'", "'LIMIT'", "'OFFSET'", 
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
			"'EXISTS'", "'?'", "'$'", null, "'NOT'", "'DISTINCT'", "'REDUCED'", null, 
			"'*'", "'UNDEF'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "VAR_SINGLE_CHAR", "NOT", "DISTINCT", "REDUCED", 
			"BOOL", "STAR", "UNDEF", "TYPE", "COMMENT", "DURATION", "IRIREF", "PNAME_NS", 
			"PNAME_LN", "BLANK_NODE_LABEL", "LANGTAG", "INTEGER", "DECIMAL", "DOUBLE", 
			"INTEGER_POSITIVE", "DECIMAL_POSITIVE", "DOUBLE_POSITIVE", "INTEGER_NEGATIVE", 
			"DECIMAL_NEGATIVE", "DOUBLE_NEGATIVE", "EXPONENT", "STRING_LITERAL1", 
			"STRING_LITERAL2", "STRING_LITERAL_LONG1", "STRING_LITERAL_LONG2", "BINARY_OPERATOR", 
			"ECHAR", "NIL", "WS", "ANON", "PN_CHARS_BASE", "PN_CHARS_U", "VARNAME", 
			"PN_CHARS", "PN_PREFIX", "PN_LOCAL", "PLX", "PERCENT", "HEX", "PN_LOCAL_ESC", 
			"ANYCHAR"
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
			setState(174);
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
			setState(176);
			prologue();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(177);
				registerClause();
				}
			}

			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				setState(180);
				selectQuery();
				}
				break;
			case T__11:
				{
				setState(181);
				constructQuery();
				}
				break;
			case T__15:
				{
				setState(182);
				describeQuery();
				}
				break;
			case T__16:
				{
				setState(183);
				askQuery();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(186);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
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
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__2) {
				{
				setState(190);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(188);
					baseDecl();
					}
					break;
				case T__2:
					{
					setState(189);
					prefixDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(194);
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
			setState(195);
			match(T__1);
			setState(196);
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
			setState(198);
			match(T__2);
			setState(199);
			match(PNAME_NS);
			setState(200);
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
			setState(202);
			match(T__3);
			setState(203);
			((RegisterClauseContext)_localctx).streamType = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
				((RegisterClauseContext)_localctx).streamType = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(204);
			((RegisterClauseContext)_localctx).outputStream = iri();
			setState(205);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
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
			setState(207);
			selectClause();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(208);
				datasetClause();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			whereClause();
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(215);
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
			setState(218);
			match(T__8);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==REDUCED) {
				{
				setState(219);
				selectModifier();
				}
			}

			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__110:
			case T__111:
				{
				setState(223); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(222);
					resultVar();
					}
					}
					setState(225); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__9 || _la==T__110 || _la==T__111 );
				}
				break;
			case STAR:
				{
				setState(227);
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
			setState(230);
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
		enterRule(_localctx, 18, RULE_resultVar);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__110:
			case T__111:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				var();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(233);
				match(T__9);
				setState(234);
				expression();
				setState(235);
				match(T__7);
				setState(236);
				var();
				setState(237);
				match(T__10);
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
			setState(241);
			match(T__11);
			setState(242);
			match(T__12);
			setState(243);
			triplesSameSubject();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(244);
				match(T__13);
				}
			}

			setState(247);
			match(T__14);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(248);
				datasetClause();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			whereClause();
			setState(255);
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
			setState(257);
			match(T__15);
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__110:
			case T__111:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				{
				setState(259); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(258);
					varOrIri();
					}
					}
					setState(261); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (T__110 - 111)) | (1L << (T__111 - 111)) | (1L << (IRIREF - 111)) | (1L << (PNAME_NS - 111)) | (1L << (PNAME_LN - 111)))) != 0) );
				}
				break;
			case STAR:
				{
				setState(263);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(266);
				datasetClause();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(272);
				whereClause();
				}
			}

			setState(275);
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
			setState(277);
			match(T__16);
			setState(279); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(278);
				datasetClause();
				}
				}
				setState(281); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__17 );
			setState(283);
			whereClause();
			setState(284);
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
			setState(286);
			match(T__17);
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(287);
				((DatasetClauseContext)_localctx).anonymousGraph = iri();
				}
				break;
			case 2:
				{
				setState(288);
				namedGraphClause();
				}
				break;
			case 3:
				{
				setState(289);
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
			setState(292);
			match(T__18);
			setState(293);
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
			setState(295);
			match(T__18);
			setState(296);
			match(T__19);
			setState(297);
			((NamedWindowClauseContext)_localctx).windowIRI = iri();
			setState(298);
			match(T__20);
			setState(299);
			((NamedWindowClauseContext)_localctx).streamIRI = iri();
			setState(300);
			match(T__21);
			setState(301);
			windowDefinition();
			setState(302);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
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
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				physicalWindow();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
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
			setState(308);
			physicalRange();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(309);
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
			setState(312);
			match(T__23);
			setState(313);
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
			setState(315);
			match(T__24);
			setState(316);
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
			setState(318);
			logicalRange();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(319);
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
			setState(322);
			match(T__25);
			setState(323);
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
			setState(325);
			match(T__24);
			setState(326);
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
			setState(328);
			match(T__26);
			setState(329);
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
			setState(331);
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
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(333);
				groupClause();
				}
			}

			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(336);
				havingClause();
				}
			}

			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(339);
				orderClause();
				}
			}

			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__33 || _la==T__34) {
				{
				setState(342);
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
			setState(345);
			match(T__27);
			setState(346);
			match(T__28);
			setState(348); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(347);
				groupCondition();
				}
				}
				setState(350); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (NOT - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
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
			setState(362);
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
				setState(352);
				builtInCall();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				match(T__9);
				setState(354);
				expression();
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(355);
					match(T__7);
					setState(356);
					var();
					}
				}

				setState(359);
				match(T__10);
				}
				break;
			case T__110:
			case T__111:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				var();
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
			setState(364);
			match(T__29);
			setState(366); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(365);
				havingCondition();
				}
				}
				setState(368); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (NOT - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
			setState(370);
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
			setState(372);
			match(T__30);
			setState(373);
			match(T__28);
			setState(375); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(374);
				orderCondition();
				}
				}
				setState(377); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__31) | (1L << T__32) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (NOT - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
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
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(379);
				_la = _input.LA(1);
				if ( !(_la==T__31 || _la==T__32) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(380);
				brackettedExpression();
				}
				}
				break;
			case T__9:
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
			case T__110:
			case T__111:
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
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
					setState(381);
					constraint();
					}
					break;
				case T__110:
				case T__111:
					{
					setState(382);
					var();
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
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				limitClause();
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__34) {
					{
					setState(388);
					offsetClause();
					}
				}

				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				offsetClause();
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__33) {
					{
					setState(392);
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
			setState(397);
			match(T__33);
			setState(398);
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
			setState(400);
			match(T__34);
			setState(401);
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
			setState(403);
			match(T__12);
			setState(405); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(404);
				graphPatternSub();
				}
				}
				setState(407); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__19) | (1L << T__21) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (T__110 - 111)) | (1L << (T__111 - 111)) | (1L << (BOOL - 111)) | (1L << (IRIREF - 111)) | (1L << (PNAME_NS - 111)) | (1L << (PNAME_LN - 111)) | (1L << (BLANK_NODE_LABEL - 111)) | (1L << (INTEGER - 111)) | (1L << (DECIMAL - 111)) | (1L << (DOUBLE - 111)) | (1L << (INTEGER_POSITIVE - 111)) | (1L << (DECIMAL_POSITIVE - 111)) | (1L << (DOUBLE_POSITIVE - 111)) | (1L << (INTEGER_NEGATIVE - 111)) | (1L << (DECIMAL_NEGATIVE - 111)) | (1L << (DOUBLE_NEGATIVE - 111)) | (1L << (STRING_LITERAL1 - 111)) | (1L << (STRING_LITERAL2 - 111)) | (1L << (STRING_LITERAL_LONG1 - 111)) | (1L << (STRING_LITERAL_LONG2 - 111)) | (1L << (NIL - 111)) | (1L << (ANON - 111)))) != 0) );
			setState(409);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
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
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__110:
			case T__111:
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
				{
				setState(411);
				triplesSameSubject();
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(412);
					match(T__13);
					}
				}

				}
				break;
			case T__12:
			case T__19:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
				{
				setState(415);
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
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__110:
			case T__111:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				varOrTerm();
				setState(419);
				propertyListNotEmpty();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				blankNodePropertyList();
				setState(423);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(422);
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
			setState(427);
			property();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(428);
				match(T__0);
				setState(430);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(429);
					property();
					}
					break;
				}
				}
				}
				setState(436);
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
			setState(437);
			verb();
			setState(438);
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
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__110:
			case T__111:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				varOrIri();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
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
			setState(444);
			object();
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35) {
				{
				{
				setState(445);
				match(T__35);
				setState(446);
				object();
				}
				}
				setState(451);
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
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__110:
			case T__111:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				varOrTerm();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
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
		enterRule(_localctx, 86, RULE_varOrTerm);
		try {
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__110:
			case T__111:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				var();
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
				setState(457);
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
		enterRule(_localctx, 88, RULE_blankNodePropertyList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(T__21);
			setState(461);
			propertyListNotEmpty();
			setState(462);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 90, RULE_graphPatternNotTriples);
		try {
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				groupOrUnionGraphPattern();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				optionalGraphPattern();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				minusGraphPattern();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 4);
				{
				setState(467);
				graphGraphPattern();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 5);
				{
				setState(468);
				windowGraphPattern();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 6);
				{
				setState(469);
				filter();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 7);
				{
				setState(470);
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
		enterRule(_localctx, 92, RULE_groupOrUnionGraphPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			groupGraphPattern();
			setState(476); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(474);
				match(T__36);
				setState(475);
				groupGraphPattern();
				}
				}
				setState(478); 
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
		enterRule(_localctx, 94, RULE_optionalGraphPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(T__37);
			setState(481);
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
		enterRule(_localctx, 96, RULE_minusGraphPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(T__38);
			setState(484);
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
		enterRule(_localctx, 98, RULE_graphGraphPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(T__39);
			setState(487);
			varOrIri();
			setState(488);
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
		enterRule(_localctx, 100, RULE_windowGraphPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(T__19);
			setState(491);
			varOrIri();
			setState(492);
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
			setState(494);
			match(T__40);
			setState(495);
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
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
			setState(497);
			match(T__41);
			setState(498);
			match(T__9);
			setState(499);
			expression();
			setState(500);
			match(T__7);
			setState(501);
			var();
			setState(502);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 106, RULE_varOrIri);
		try {
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__110:
			case T__111:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				var();
				}
				break;
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
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
		enterRule(_localctx, 108, RULE_graphTerm);
		try {
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				iri();
				}
				break;
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
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
				setState(510);
				numericLiteral();
				}
				break;
			case BLANK_NODE_LABEL:
			case ANON:
				enterOuterAlt(_localctx, 4);
				{
				setState(511);
				blankNode();
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 5);
				{
				setState(512);
				match(NIL);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(513);
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
		enterRule(_localctx, 110, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			conditionalAndExpression();
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(517);
				match(T__42);
				setState(518);
				conditionalAndExpression();
				}
				}
				setState(523);
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
		enterRule(_localctx, 112, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			valueLogical();
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__43) {
				{
				{
				setState(525);
				match(T__43);
				setState(526);
				valueLogical();
				}
				}
				setState(531);
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
		enterRule(_localctx, 114, RULE_valueLogical);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
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
		enterRule(_localctx, 116, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			numericExpression();
			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY_OPERATOR:
				{
				setState(535);
				match(BINARY_OPERATOR);
				setState(536);
				numericExpression();
				}
				break;
			case T__44:
			case NOT:
				{
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(537);
					match(NOT);
					}
				}

				setState(540);
				match(T__44);
				setState(541);
				expressionList();
				}
				break;
			case T__0:
			case T__7:
			case T__10:
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
		enterRule(_localctx, 118, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(T__9);
			setState(545);
			expression();
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35) {
				{
				{
				setState(546);
				match(T__35);
				setState(547);
				expression();
				}
				}
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(553);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 120, RULE_numericExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			multiplicativeExpression();
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45 || _la==T__46) {
				{
				{
				setState(556);
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
				setState(557);
				multiplicativeExpression();
				}
				}
				setState(562);
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
		public List<TerminalNode> STAR() { return getTokens(RSPQLParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(RSPQLParser.STAR, i);
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
		enterRule(_localctx, 122, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			unaryExpression();
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__47 || _la==STAR) {
				{
				{
				setState(564);
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
				setState(565);
				unaryExpression();
				}
				}
				setState(570);
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
		enterRule(_localctx, 124, RULE_unaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__46) | (1L << T__48))) != 0)) {
				{
				setState(571);
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

			setState(574);
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
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
		enterRule(_localctx, 126, RULE_primaryExpression);
		try {
			setState(582);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
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
				setState(577);
				builtInCall();
				}
				break;
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
				enterOuterAlt(_localctx, 3);
				{
				setState(578);
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
				setState(579);
				numericLiteral();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(580);
				match(BOOL);
				}
				break;
			case T__110:
			case T__111:
				enterOuterAlt(_localctx, 6);
				{
				setState(581);
				var();
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
		enterRule(_localctx, 128, RULE_brackettedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(T__9);
			setState(585);
			expression();
			setState(586);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 130, RULE_builtInCall);
		int _la;
		try {
			setState(599);
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
				setState(588);
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
				setState(589);
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
				setState(590);
				binaryBuiltin();
				}
				break;
			case T__104:
				enterOuterAlt(_localctx, 4);
				{
				setState(591);
				ternaryBuiltin();
				}
				break;
			case T__105:
			case T__106:
				enterOuterAlt(_localctx, 5);
				{
				setState(592);
				ternaryOrBinaryBuiltin();
				}
				break;
			case T__107:
				enterOuterAlt(_localctx, 6);
				{
				setState(593);
				strReplaceExpression();
				}
				break;
			case T__108:
				enterOuterAlt(_localctx, 7);
				{
				setState(594);
				boundExpression();
				}
				break;
			case T__109:
			case NOT:
				enterOuterAlt(_localctx, 8);
				{
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(595);
					match(NOT);
					}
				}

				setState(598);
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
		enterRule(_localctx, 132, RULE_rdfliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			string();
			setState(605);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LANGTAG:
				{
				setState(602);
				match(LANGTAG);
				}
				break;
			case T__49:
				{
				{
				setState(603);
				match(T__49);
				setState(604);
				iri();
				}
				}
				break;
			case T__0:
			case T__7:
			case T__10:
			case T__12:
			case T__13:
			case T__14:
			case T__19:
			case T__21:
			case T__22:
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
			case T__110:
			case T__111:
			case NOT:
			case BOOL:
			case STAR:
			case TYPE:
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
		enterRule(_localctx, 134, RULE_numericLiteral);
		try {
			setState(610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				numericLiteralUnsigned();
				}
				break;
			case INTEGER_POSITIVE:
			case DECIMAL_POSITIVE:
			case DOUBLE_POSITIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				numericLiteralPositive();
				}
				break;
			case INTEGER_NEGATIVE:
			case DECIMAL_NEGATIVE:
			case DOUBLE_NEGATIVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(609);
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
		enterRule(_localctx, 136, RULE_numericLiteralUnsigned);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			_la = _input.LA(1);
			if ( !(((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (INTEGER - 128)) | (1L << (DECIMAL - 128)) | (1L << (DOUBLE - 128)))) != 0)) ) {
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
		enterRule(_localctx, 138, RULE_numericLiteralPositive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			_la = _input.LA(1);
			if ( !(((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (INTEGER_POSITIVE - 131)) | (1L << (DECIMAL_POSITIVE - 131)) | (1L << (DOUBLE_POSITIVE - 131)))) != 0)) ) {
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
		enterRule(_localctx, 140, RULE_numericLiteralNegative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			_la = _input.LA(1);
			if ( !(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (INTEGER_NEGATIVE - 134)) | (1L << (DECIMAL_NEGATIVE - 134)) | (1L << (DOUBLE_NEGATIVE - 134)))) != 0)) ) {
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
		enterRule(_localctx, 142, RULE_argList);
		int _la;
		try {
			setState(633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NIL:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				match(NIL);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
				match(T__9);
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(620);
					match(DISTINCT);
					}
				}

				setState(623);
				expression();
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__35) {
					{
					{
					setState(624);
					match(T__35);
					setState(625);
					expression();
					}
					}
					setState(630);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(631);
				match(T__10);
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
		enterRule(_localctx, 144, RULE_constraint);
		try {
			setState(637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(635);
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
				setState(636);
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
		public TerminalNode STAR() { return getToken(RSPQLParser.STAR, 0); }
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
		enterRule(_localctx, 146, RULE_aggregate);
		int _la;
		try {
			setState(671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__50:
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				((AggregateContext)_localctx).f = match(T__50);
				setState(640);
				match(T__9);
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(641);
					match(DISTINCT);
					}
				}

				setState(646);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(644);
					match(STAR);
					}
					break;
				case T__9:
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
				case T__110:
				case T__111:
				case NOT:
				case BOOL:
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
					setState(645);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(648);
				match(T__10);
				}
				break;
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
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
				setState(650);
				match(T__9);
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(651);
					match(DISTINCT);
					}
				}

				setState(654);
				expression();
				setState(655);
				match(T__10);
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 3);
				{
				setState(657);
				((AggregateContext)_localctx).f = match(T__56);
				setState(658);
				match(T__9);
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(659);
					match(DISTINCT);
					}
				}

				setState(662);
				expression();
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(663);
					match(T__0);
					setState(664);
					match(T__57);
					setState(665);
					match(T__58);
					setState(666);
					string();
					}
				}

				setState(669);
				match(T__10);
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
		enterRule(_localctx, 148, RULE_unaryBuiltin);
		int _la;
		try {
			setState(688);
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
				setState(673);
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
				setState(674);
				match(T__9);
				setState(675);
				expression();
				setState(676);
				match(T__10);
				}
				break;
			case T__90:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				((UnaryBuiltinContext)_localctx).f = match(T__90);
				setState(684);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(679);
					match(T__9);
					setState(680);
					expression();
					setState(681);
					match(T__10);
					}
					break;
				case NIL:
					{
					setState(683);
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
				setState(686);
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
				setState(687);
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
		enterRule(_localctx, 150, RULE_binaryBuiltin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
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
			setState(691);
			match(T__9);
			setState(692);
			expression();
			setState(693);
			match(T__35);
			setState(694);
			expression();
			setState(695);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 152, RULE_ternaryBuiltin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(T__104);
			setState(698);
			match(T__9);
			setState(699);
			expression();
			setState(700);
			match(T__35);
			setState(701);
			expression();
			setState(702);
			match(T__35);
			setState(703);
			expression();
			setState(704);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 154, RULE_ternaryOrBinaryBuiltin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
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
			setState(707);
			match(T__9);
			setState(708);
			expression();
			setState(709);
			match(T__35);
			setState(710);
			expression();
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(711);
				match(T__35);
				setState(712);
				expression();
				}
			}

			setState(715);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 156, RULE_strReplaceExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(T__107);
			setState(718);
			match(T__9);
			setState(719);
			expression();
			setState(720);
			match(T__35);
			setState(721);
			expression();
			setState(722);
			match(T__35);
			setState(723);
			expression();
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(724);
				match(T__35);
				setState(725);
				expression();
				}
			}

			setState(728);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
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
		enterRule(_localctx, 158, RULE_boundExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(T__108);
			setState(731);
			match(T__9);
			setState(732);
			var();
			setState(733);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 160, RULE_existsFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(T__109);
			setState(736);
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
		enterRule(_localctx, 162, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			_la = _input.LA(1);
			if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (STRING_LITERAL1 - 138)) | (1L << (STRING_LITERAL2 - 138)) | (1L << (STRING_LITERAL_LONG1 - 138)) | (1L << (STRING_LITERAL_LONG2 - 138)))) != 0)) ) {
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
		enterRule(_localctx, 164, RULE_iri);
		try {
			setState(742);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
				enterOuterAlt(_localctx, 1);
				{
				setState(740);
				match(IRIREF);
				}
				break;
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
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
		enterRule(_localctx, 166, RULE_prefixedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
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
		enterRule(_localctx, 168, RULE_blankNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
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

	public static class VarContext extends ParserRuleContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
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
		enterRule(_localctx, 170, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			_la = _input.LA(1);
			if ( !(_la==T__110 || _la==T__111) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(749);
			varname();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarnameContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(RSPQLParser.VARNAME, 0); }
		public TerminalNode VAR_SINGLE_CHAR() { return getToken(RSPQLParser.VAR_SINGLE_CHAR, 0); }
		public VarnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).enterVarname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RSPQLListener ) ((RSPQLListener)listener).exitVarname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSPQLVisitor ) return ((RSPQLVisitor<? extends T>)visitor).visitVarname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarnameContext varname() throws RecognitionException {
		VarnameContext _localctx = new VarnameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_varname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			_la = _input.LA(1);
			if ( !(_la==VAR_SINGLE_CHAR || _la==VARNAME) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u009f\u02f4\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\3\2\3\2\3\3\3\3\5\3\u00b5\n\3\3\3\3\3\3\3\3\3"+
		"\5\3\u00bb\n\3\3\3\3\3\3\4\3\4\7\4\u00c1\n\4\f\4\16\4\u00c4\13\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\7\b\u00d4\n\b\f\b\16"+
		"\b\u00d7\13\b\3\b\3\b\5\b\u00db\n\b\3\t\3\t\5\t\u00df\n\t\3\t\6\t\u00e2"+
		"\n\t\r\t\16\t\u00e3\3\t\5\t\u00e7\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00f2\n\13\3\f\3\f\3\f\3\f\5\f\u00f8\n\f\3\f\3\f\7\f\u00fc"+
		"\n\f\f\f\16\f\u00ff\13\f\3\f\3\f\3\f\3\r\3\r\6\r\u0106\n\r\r\r\16\r\u0107"+
		"\3\r\5\r\u010b\n\r\3\r\7\r\u010e\n\r\f\r\16\r\u0111\13\r\3\r\5\r\u0114"+
		"\n\r\3\r\3\r\3\16\3\16\6\16\u011a\n\16\r\16\16\16\u011b\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\5\17\u0125\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u0135\n\22\3\23\3\23\5\23\u0139"+
		"\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\5\26\u0143\n\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\5\33\u0151\n\33\3\33"+
		"\5\33\u0154\n\33\3\33\5\33\u0157\n\33\3\33\5\33\u015a\n\33\3\34\3\34\3"+
		"\34\6\34\u015f\n\34\r\34\16\34\u0160\3\35\3\35\3\35\3\35\3\35\5\35\u0168"+
		"\n\35\3\35\3\35\3\35\5\35\u016d\n\35\3\36\3\36\6\36\u0171\n\36\r\36\16"+
		"\36\u0172\3\37\3\37\3 \3 \3 \6 \u017a\n \r \16 \u017b\3!\3!\3!\3!\5!\u0182"+
		"\n!\5!\u0184\n!\3\"\3\"\5\"\u0188\n\"\3\"\3\"\5\"\u018c\n\"\5\"\u018e"+
		"\n\"\3#\3#\3#\3$\3$\3$\3%\3%\6%\u0198\n%\r%\16%\u0199\3%\3%\3&\3&\5&\u01a0"+
		"\n&\3&\5&\u01a3\n&\3\'\3\'\3\'\3\'\3\'\5\'\u01aa\n\'\5\'\u01ac\n\'\3("+
		"\3(\3(\5(\u01b1\n(\7(\u01b3\n(\f(\16(\u01b6\13(\3)\3)\3)\3*\3*\5*\u01bd"+
		"\n*\3+\3+\3+\7+\u01c2\n+\f+\16+\u01c5\13+\3,\3,\5,\u01c9\n,\3-\3-\5-\u01cd"+
		"\n-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\5/\u01da\n/\3\60\3\60\3\60\6\60\u01df"+
		"\n\60\r\60\16\60\u01e0\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3"+
		"\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\67\3\67\5\67\u01fd\n\67\38\38\38\38\38\38\58\u0205\n8\39\39\39\7"+
		"9\u020a\n9\f9\169\u020d\139\3:\3:\3:\7:\u0212\n:\f:\16:\u0215\13:\3;\3"+
		";\3<\3<\3<\3<\5<\u021d\n<\3<\3<\5<\u0221\n<\3=\3=\3=\3=\7=\u0227\n=\f"+
		"=\16=\u022a\13=\3=\3=\3>\3>\3>\7>\u0231\n>\f>\16>\u0234\13>\3?\3?\3?\7"+
		"?\u0239\n?\f?\16?\u023c\13?\3@\5@\u023f\n@\3@\3@\3A\3A\3A\3A\3A\3A\5A"+
		"\u0249\nA\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\5C\u0257\nC\3C\5C\u025a"+
		"\nC\3D\3D\3D\3D\5D\u0260\nD\3E\3E\3E\5E\u0265\nE\3F\3F\3G\3G\3H\3H\3I"+
		"\3I\3I\5I\u0270\nI\3I\3I\3I\7I\u0275\nI\fI\16I\u0278\13I\3I\3I\5I\u027c"+
		"\nI\3J\3J\5J\u0280\nJ\3K\3K\3K\5K\u0285\nK\3K\3K\5K\u0289\nK\3K\3K\3K"+
		"\3K\5K\u028f\nK\3K\3K\3K\3K\3K\3K\5K\u0297\nK\3K\3K\3K\3K\3K\5K\u029e"+
		"\nK\3K\3K\5K\u02a2\nK\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u02af\nL\3L"+
		"\3L\5L\u02b3\nL\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3N\3O\3O"+
		"\3O\3O\3O\3O\3O\5O\u02cc\nO\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u02d9"+
		"\nP\3P\3P\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3S\3S\3T\3T\5T\u02e9\nT\3U\3U\3V\3V"+
		"\3W\3W\3W\3X\3X\3X\2\2Y\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\2\25\3\2\7\t\3"+
		"\2uv\3\2\"#\3\2\60\61\4\2\62\62xx\4\2\60\61\63\63\3\2\u0082\u0084\3\2"+
		"\u0085\u0087\3\2\u0088\u008a\3\2\66:\3\2>\\\3\2^a\3\2bj\3\2lm\3\2\u008c"+
		"\u008f\3\2~\177\4\2\u0080\u0080\u0094\u0094\3\2qr\4\2ss\u0097\u0097\2"+
		"\u0306\2\u00b0\3\2\2\2\4\u00b2\3\2\2\2\6\u00c2\3\2\2\2\b\u00c5\3\2\2\2"+
		"\n\u00c8\3\2\2\2\f\u00cc\3\2\2\2\16\u00d1\3\2\2\2\20\u00dc\3\2\2\2\22"+
		"\u00e8\3\2\2\2\24\u00f1\3\2\2\2\26\u00f3\3\2\2\2\30\u0103\3\2\2\2\32\u0117"+
		"\3\2\2\2\34\u0120\3\2\2\2\36\u0126\3\2\2\2 \u0129\3\2\2\2\"\u0134\3\2"+
		"\2\2$\u0136\3\2\2\2&\u013a\3\2\2\2(\u013d\3\2\2\2*\u0140\3\2\2\2,\u0144"+
		"\3\2\2\2.\u0147\3\2\2\2\60\u014a\3\2\2\2\62\u014d\3\2\2\2\64\u0150\3\2"+
		"\2\2\66\u015b\3\2\2\28\u016c\3\2\2\2:\u016e\3\2\2\2<\u0174\3\2\2\2>\u0176"+
		"\3\2\2\2@\u0183\3\2\2\2B\u018d\3\2\2\2D\u018f\3\2\2\2F\u0192\3\2\2\2H"+
		"\u0195\3\2\2\2J\u01a2\3\2\2\2L\u01ab\3\2\2\2N\u01ad\3\2\2\2P\u01b7\3\2"+
		"\2\2R\u01bc\3\2\2\2T\u01be\3\2\2\2V\u01c8\3\2\2\2X\u01cc\3\2\2\2Z\u01ce"+
		"\3\2\2\2\\\u01d9\3\2\2\2^\u01db\3\2\2\2`\u01e2\3\2\2\2b\u01e5\3\2\2\2"+
		"d\u01e8\3\2\2\2f\u01ec\3\2\2\2h\u01f0\3\2\2\2j\u01f3\3\2\2\2l\u01fc\3"+
		"\2\2\2n\u0204\3\2\2\2p\u0206\3\2\2\2r\u020e\3\2\2\2t\u0216\3\2\2\2v\u0218"+
		"\3\2\2\2x\u0222\3\2\2\2z\u022d\3\2\2\2|\u0235\3\2\2\2~\u023e\3\2\2\2\u0080"+
		"\u0248\3\2\2\2\u0082\u024a\3\2\2\2\u0084\u0259\3\2\2\2\u0086\u025b\3\2"+
		"\2\2\u0088\u0264\3\2\2\2\u008a\u0266\3\2\2\2\u008c\u0268\3\2\2\2\u008e"+
		"\u026a\3\2\2\2\u0090\u027b\3\2\2\2\u0092\u027f\3\2\2\2\u0094\u02a1\3\2"+
		"\2\2\u0096\u02b2\3\2\2\2\u0098\u02b4\3\2\2\2\u009a\u02bb\3\2\2\2\u009c"+
		"\u02c4\3\2\2\2\u009e\u02cf\3\2\2\2\u00a0\u02dc\3\2\2\2\u00a2\u02e1\3\2"+
		"\2\2\u00a4\u02e4\3\2\2\2\u00a6\u02e8\3\2\2\2\u00a8\u02ea\3\2\2\2\u00aa"+
		"\u02ec\3\2\2\2\u00ac\u02ee\3\2\2\2\u00ae\u02f1\3\2\2\2\u00b0\u00b1\5\4"+
		"\3\2\u00b1\3\3\2\2\2\u00b2\u00b4\5\6\4\2\u00b3\u00b5\5\f\7\2\u00b4\u00b3"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00ba\3\2\2\2\u00b6\u00bb\5\16\b\2"+
		"\u00b7\u00bb\5\26\f\2\u00b8\u00bb\5\30\r\2\u00b9\u00bb\5\32\16\2\u00ba"+
		"\u00b6\3\2\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7\3\2\2\u00bd\5\3\2\2\2\u00be\u00c1"+
		"\5\b\5\2\u00bf\u00c1\5\n\6\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\7\3\2\2\2"+
		"\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\4\2\2\u00c6\u00c7\7}\2\2\u00c7\t\3"+
		"\2\2\2\u00c8\u00c9\7\5\2\2\u00c9\u00ca\7~\2\2\u00ca\u00cb\7}\2\2\u00cb"+
		"\13\3\2\2\2\u00cc\u00cd\7\6\2\2\u00cd\u00ce\t\2\2\2\u00ce\u00cf\5\u00a6"+
		"T\2\u00cf\u00d0\7\n\2\2\u00d0\r\3\2\2\2\u00d1\u00d5\5\20\t\2\u00d2\u00d4"+
		"\5\34\17\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2"+
		"\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00da"+
		"\5\60\31\2\u00d9\u00db\5\64\33\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2"+
		"\2\u00db\17\3\2\2\2\u00dc\u00de\7\13\2\2\u00dd\u00df\5\22\n\2\u00de\u00dd"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e6\3\2\2\2\u00e0\u00e2\5\24\13\2"+
		"\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e7\7x\2\2\u00e6\u00e1\3\2\2\2\u00e6"+
		"\u00e5\3\2\2\2\u00e7\21\3\2\2\2\u00e8\u00e9\t\3\2\2\u00e9\23\3\2\2\2\u00ea"+
		"\u00f2\5\u00acW\2\u00eb\u00ec\7\f\2\2\u00ec\u00ed\5p9\2\u00ed\u00ee\7"+
		"\n\2\2\u00ee\u00ef\5\u00acW\2\u00ef\u00f0\7\r\2\2\u00f0\u00f2\3\2\2\2"+
		"\u00f1\u00ea\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f2\25\3\2\2\2\u00f3\u00f4"+
		"\7\16\2\2\u00f4\u00f5\7\17\2\2\u00f5\u00f7\5L\'\2\u00f6\u00f8\7\20\2\2"+
		"\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fd"+
		"\7\21\2\2\u00fa\u00fc\5\34\17\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2"+
		"\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u0100\u0101\5\60\31\2\u0101\u0102\5\64\33\2\u0102\27\3\2\2\2"+
		"\u0103\u010a\7\22\2\2\u0104\u0106\5l\67\2\u0105\u0104\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u010b\7x\2\2\u010a\u0105\3\2\2\2\u010a\u0109\3\2\2\2\u010b\u010f\3\2"+
		"\2\2\u010c\u010e\5\34\17\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0112\u0114\5\60\31\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0116\5\64\33\2\u0116\31\3\2\2\2\u0117\u0119\7\23"+
		"\2\2\u0118\u011a\5\34\17\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\5\60"+
		"\31\2\u011e\u011f\5\64\33\2\u011f\33\3\2\2\2\u0120\u0124\7\24\2\2\u0121"+
		"\u0125\5\u00a6T\2\u0122\u0125\5\36\20\2\u0123\u0125\5 \21\2\u0124\u0121"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125\35\3\2\2\2\u0126"+
		"\u0127\7\25\2\2\u0127\u0128\5\u00a6T\2\u0128\37\3\2\2\2\u0129\u012a\7"+
		"\25\2\2\u012a\u012b\7\26\2\2\u012b\u012c\5\u00a6T\2\u012c\u012d\7\27\2"+
		"\2\u012d\u012e\5\u00a6T\2\u012e\u012f\7\30\2\2\u012f\u0130\5\"\22\2\u0130"+
		"\u0131\7\31\2\2\u0131!\3\2\2\2\u0132\u0135\5$\23\2\u0133\u0135\5*\26\2"+
		"\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135#\3\2\2\2\u0136\u0138\5"+
		"&\24\2\u0137\u0139\5(\25\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"%\3\2\2\2\u013a\u013b\7\32\2\2\u013b\u013c\7\u0082\2\2\u013c\'\3\2\2\2"+
		"\u013d\u013e\7\33\2\2\u013e\u013f\7\u0082\2\2\u013f)\3\2\2\2\u0140\u0142"+
		"\5,\27\2\u0141\u0143\5.\30\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"+\3\2\2\2\u0144\u0145\7\34\2\2\u0145\u0146\5\62\32\2\u0146-\3\2\2\2\u0147"+
		"\u0148\7\33\2\2\u0148\u0149\5\62\32\2\u0149/\3\2\2\2\u014a\u014b\7\35"+
		"\2\2\u014b\u014c\5H%\2\u014c\61\3\2\2\2\u014d\u014e\7|\2\2\u014e\63\3"+
		"\2\2\2\u014f\u0151\5\66\34\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0153\3\2\2\2\u0152\u0154\5:\36\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0156\3\2\2\2\u0155\u0157\5> \2\u0156\u0155\3\2\2\2\u0156\u0157"+
		"\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u015a\5B\"\2\u0159\u0158\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\65\3\2\2\2\u015b\u015c\7\36\2\2\u015c\u015e\7\37"+
		"\2\2\u015d\u015f\58\35\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\67\3\2\2\2\u0162\u016d\5\u0084"+
		"C\2\u0163\u0164\7\f\2\2\u0164\u0167\5p9\2\u0165\u0166\7\n\2\2\u0166\u0168"+
		"\5\u00acW\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2"+
		"\2\u0169\u016a\7\r\2\2\u016a\u016d\3\2\2\2\u016b\u016d\5\u00acW\2\u016c"+
		"\u0162\3\2\2\2\u016c\u0163\3\2\2\2\u016c\u016b\3\2\2\2\u016d9\3\2\2\2"+
		"\u016e\u0170\7 \2\2\u016f\u0171\5<\37\2\u0170\u016f\3\2\2\2\u0171\u0172"+
		"\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173;\3\2\2\2\u0174"+
		"\u0175\5\u0092J\2\u0175=\3\2\2\2\u0176\u0177\7!\2\2\u0177\u0179\7\37\2"+
		"\2\u0178\u017a\5@!\2\u0179\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0179"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c?\3\2\2\2\u017d\u017e\t\4\2\2\u017e"+
		"\u0184\5\u0082B\2\u017f\u0182\5\u0092J\2\u0180\u0182\5\u00acW\2\u0181"+
		"\u017f\3\2\2\2\u0181\u0180\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u017d\3\2"+
		"\2\2\u0183\u0181\3\2\2\2\u0184A\3\2\2\2\u0185\u0187\5D#\2\u0186\u0188"+
		"\5F$\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018e\3\2\2\2\u0189"+
		"\u018b\5F$\2\u018a\u018c\5D#\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2"+
		"\u018c\u018e\3\2\2\2\u018d\u0185\3\2\2\2\u018d\u0189\3\2\2\2\u018eC\3"+
		"\2\2\2\u018f\u0190\7$\2\2\u0190\u0191\7\u0082\2\2\u0191E\3\2\2\2\u0192"+
		"\u0193\7%\2\2\u0193\u0194\7\u0082\2\2\u0194G\3\2\2\2\u0195\u0197\7\17"+
		"\2\2\u0196\u0198\5J&\2\u0197\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u0197"+
		"\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\7\21\2\2"+
		"\u019cI\3\2\2\2\u019d\u019f\5L\'\2\u019e\u01a0\7\20\2\2\u019f\u019e\3"+
		"\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u01a3\5\\/\2\u01a2"+
		"\u019d\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3K\3\2\2\2\u01a4\u01a5\5X-\2\u01a5"+
		"\u01a6\5N(\2\u01a6\u01ac\3\2\2\2\u01a7\u01a9\5Z.\2\u01a8\u01aa\5N(\2\u01a9"+
		"\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a4\3\2"+
		"\2\2\u01ab\u01a7\3\2\2\2\u01acM\3\2\2\2\u01ad\u01b4\5P)\2\u01ae\u01b0"+
		"\7\3\2\2\u01af\u01b1\5P)\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b3\3\2\2\2\u01b2\u01ae\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2"+
		"\2\2\u01b4\u01b5\3\2\2\2\u01b5O\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b8"+
		"\5R*\2\u01b8\u01b9\5T+\2\u01b9Q\3\2\2\2\u01ba\u01bd\5l\67\2\u01bb\u01bd"+
		"\7z\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bb\3\2\2\2\u01bdS\3\2\2\2\u01be\u01c3"+
		"\5V,\2\u01bf\u01c0\7&\2\2\u01c0\u01c2\5V,\2\u01c1\u01bf\3\2\2\2\u01c2"+
		"\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4U\3\2\2\2"+
		"\u01c5\u01c3\3\2\2\2\u01c6\u01c9\5X-\2\u01c7\u01c9\5Z.\2\u01c8\u01c6\3"+
		"\2\2\2\u01c8\u01c7\3\2\2\2\u01c9W\3\2\2\2\u01ca\u01cd\5\u00acW\2\u01cb"+
		"\u01cd\5n8\2\u01cc\u01ca\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cdY\3\2\2\2\u01ce"+
		"\u01cf\7\30\2\2\u01cf\u01d0\5N(\2\u01d0\u01d1\7\31\2\2\u01d1[\3\2\2\2"+
		"\u01d2\u01da\5^\60\2\u01d3\u01da\5`\61\2\u01d4\u01da\5b\62\2\u01d5\u01da"+
		"\5d\63\2\u01d6\u01da\5f\64\2\u01d7\u01da\5h\65\2\u01d8\u01da\5j\66\2\u01d9"+
		"\u01d2\3\2\2\2\u01d9\u01d3\3\2\2\2\u01d9\u01d4\3\2\2\2\u01d9\u01d5\3\2"+
		"\2\2\u01d9\u01d6\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01d8\3\2\2\2\u01da"+
		"]\3\2\2\2\u01db\u01de\5H%\2\u01dc\u01dd\7\'\2\2\u01dd\u01df\5H%\2\u01de"+
		"\u01dc\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2"+
		"\2\2\u01e1_\3\2\2\2\u01e2\u01e3\7(\2\2\u01e3\u01e4\5H%\2\u01e4a\3\2\2"+
		"\2\u01e5\u01e6\7)\2\2\u01e6\u01e7\5H%\2\u01e7c\3\2\2\2\u01e8\u01e9\7*"+
		"\2\2\u01e9\u01ea\5l\67\2\u01ea\u01eb\5H%\2\u01ebe\3\2\2\2\u01ec\u01ed"+
		"\7\26\2\2\u01ed\u01ee\5l\67\2\u01ee\u01ef\5H%\2\u01efg\3\2\2\2\u01f0\u01f1"+
		"\7+\2\2\u01f1\u01f2\5\u0092J\2\u01f2i\3\2\2\2\u01f3\u01f4\7,\2\2\u01f4"+
		"\u01f5\7\f\2\2\u01f5\u01f6\5p9\2\u01f6\u01f7\7\n\2\2\u01f7\u01f8\5\u00ac"+
		"W\2\u01f8\u01f9\7\r\2\2\u01f9k\3\2\2\2\u01fa\u01fd\5\u00acW\2\u01fb\u01fd"+
		"\5\u00a6T\2\u01fc\u01fa\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fdm\3\2\2\2\u01fe"+
		"\u0205\5\u00a6T\2\u01ff\u0205\5\u0086D\2\u0200\u0205\5\u0088E\2\u0201"+
		"\u0205\5\u00aaV\2\u0202\u0205\7\u0092\2\2\u0203\u0205\7w\2\2\u0204\u01fe"+
		"\3\2\2\2\u0204\u01ff\3\2\2\2\u0204\u0200\3\2\2\2\u0204\u0201\3\2\2\2\u0204"+
		"\u0202\3\2\2\2\u0204\u0203\3\2\2\2\u0205o\3\2\2\2\u0206\u020b\5r:\2\u0207"+
		"\u0208\7-\2\2\u0208\u020a\5r:\2\u0209\u0207\3\2\2\2\u020a\u020d\3\2\2"+
		"\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020cq\3\2\2\2\u020d\u020b"+
		"\3\2\2\2\u020e\u0213\5t;\2\u020f\u0210\7.\2\2\u0210\u0212\5t;\2\u0211"+
		"\u020f\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2"+
		"\2\2\u0214s\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0217\5v<\2\u0217u\3\2\2"+
		"\2\u0218\u0220\5z>\2\u0219\u021a\7\u0090\2\2\u021a\u0221\5z>\2\u021b\u021d"+
		"\7t\2\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u021f\7/\2\2\u021f\u0221\5x=\2\u0220\u0219\3\2\2\2\u0220\u021c\3\2\2"+
		"\2\u0220\u0221\3\2\2\2\u0221w\3\2\2\2\u0222\u0223\7\f\2\2\u0223\u0228"+
		"\5p9\2\u0224\u0225\7&\2\2\u0225\u0227\5p9\2\u0226\u0224\3\2\2\2\u0227"+
		"\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2"+
		"\2\2\u022a\u0228\3\2\2\2\u022b\u022c\7\r\2\2\u022cy\3\2\2\2\u022d\u0232"+
		"\5|?\2\u022e\u022f\t\5\2\2\u022f\u0231\5|?\2\u0230\u022e\3\2\2\2\u0231"+
		"\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233{\3\2\2\2"+
		"\u0234\u0232\3\2\2\2\u0235\u023a\5~@\2\u0236\u0237\t\6\2\2\u0237\u0239"+
		"\5~@\2\u0238\u0236\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a"+
		"\u023b\3\2\2\2\u023b}\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u023f\t\7\2\2"+
		"\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241"+
		"\5\u0080A\2\u0241\177\3\2\2\2\u0242\u0249\5\u0082B\2\u0243\u0249\5\u0084"+
		"C\2\u0244\u0249\5\u0086D\2\u0245\u0249\5\u0088E\2\u0246\u0249\7w\2\2\u0247"+
		"\u0249\5\u00acW\2\u0248\u0242\3\2\2\2\u0248\u0243\3\2\2\2\u0248\u0244"+
		"\3\2\2\2\u0248\u0245\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0247\3\2\2\2\u0249"+
		"\u0081\3\2\2\2\u024a\u024b\7\f\2\2\u024b\u024c\5p9\2\u024c\u024d\7\r\2"+
		"\2\u024d\u0083\3\2\2\2\u024e\u025a\5\u0094K\2\u024f\u025a\5\u0096L\2\u0250"+
		"\u025a\5\u0098M\2\u0251\u025a\5\u009aN\2\u0252\u025a\5\u009cO\2\u0253"+
		"\u025a\5\u009eP\2\u0254\u025a\5\u00a0Q\2\u0255\u0257\7t\2\2\u0256\u0255"+
		"\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025a\5\u00a2R"+
		"\2\u0259\u024e\3\2\2\2\u0259\u024f\3\2\2\2\u0259\u0250\3\2\2\2\u0259\u0251"+
		"\3\2\2\2\u0259\u0252\3\2\2\2\u0259\u0253\3\2\2\2\u0259\u0254\3\2\2\2\u0259"+
		"\u0256\3\2\2\2\u025a\u0085\3\2\2\2\u025b\u025f\5\u00a4S\2\u025c\u0260"+
		"\7\u0081\2\2\u025d\u025e\7\64\2\2\u025e\u0260\5\u00a6T\2\u025f\u025c\3"+
		"\2\2\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0087\3\2\2\2\u0261"+
		"\u0265\5\u008aF\2\u0262\u0265\5\u008cG\2\u0263\u0265\5\u008eH\2\u0264"+
		"\u0261\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0263\3\2\2\2\u0265\u0089\3\2"+
		"\2\2\u0266\u0267\t\b\2\2\u0267\u008b\3\2\2\2\u0268\u0269\t\t\2\2\u0269"+
		"\u008d\3\2\2\2\u026a\u026b\t\n\2\2\u026b\u008f\3\2\2\2\u026c\u027c\7\u0092"+
		"\2\2\u026d\u026f\7\f\2\2\u026e\u0270\7u\2\2\u026f\u026e\3\2\2\2\u026f"+
		"\u0270\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0276\5p9\2\u0272\u0273\7&\2"+
		"\2\u0273\u0275\5p9\2\u0274\u0272\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274"+
		"\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0279\3\2\2\2\u0278\u0276\3\2\2\2\u0279"+
		"\u027a\7\r\2\2\u027a\u027c\3\2\2\2\u027b\u026c\3\2\2\2\u027b\u026d\3\2"+
		"\2\2\u027c\u0091\3\2\2\2\u027d\u0280\5\u0082B\2\u027e\u0280\5\u0084C\2"+
		"\u027f\u027d\3\2\2\2\u027f\u027e\3\2\2\2\u0280\u0093\3\2\2\2\u0281\u0282"+
		"\7\65\2\2\u0282\u0284\7\f\2\2\u0283\u0285\7u\2\2\u0284\u0283\3\2\2\2\u0284"+
		"\u0285\3\2\2\2\u0285\u0288\3\2\2\2\u0286\u0289\7x\2\2\u0287\u0289\5p9"+
		"\2\u0288\u0286\3\2\2\2\u0288\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u02a2"+
		"\7\r\2\2\u028b\u028c\t\13\2\2\u028c\u028e\7\f\2\2\u028d\u028f\7u\2\2\u028e"+
		"\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\5p"+
		"9\2\u0291\u0292\7\r\2\2\u0292\u02a2\3\2\2\2\u0293\u0294\7;\2\2\u0294\u0296"+
		"\7\f\2\2\u0295\u0297\7u\2\2\u0296\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297"+
		"\u0298\3\2\2\2\u0298\u029d\5p9\2\u0299\u029a\7\3\2\2\u029a\u029b\7<\2"+
		"\2\u029b\u029c\7=\2\2\u029c\u029e\5\u00a4S\2\u029d\u0299\3\2\2\2\u029d"+
		"\u029e\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\7\r\2\2\u02a0\u02a2\3\2"+
		"\2\2\u02a1\u0281\3\2\2\2\u02a1\u028b\3\2\2\2\u02a1\u0293\3\2\2\2\u02a2"+
		"\u0095\3\2\2\2\u02a3\u02a4\t\f\2\2\u02a4\u02a5\7\f\2\2\u02a5\u02a6\5p"+
		"9\2\u02a6\u02a7\7\r\2\2\u02a7\u02b3\3\2\2\2\u02a8\u02ae\7]\2\2\u02a9\u02aa"+
		"\7\f\2\2\u02aa\u02ab\5p9\2\u02ab\u02ac\7\r\2\2\u02ac\u02af\3\2\2\2\u02ad"+
		"\u02af\7\u0092\2\2\u02ae\u02a9\3\2\2\2\u02ae\u02ad\3\2\2\2\u02af\u02b3"+
		"\3\2\2\2\u02b0\u02b1\t\r\2\2\u02b1\u02b3\7\u0092\2\2\u02b2\u02a3\3\2\2"+
		"\2\u02b2\u02a8\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b3\u0097\3\2\2\2\u02b4\u02b5"+
		"\t\16\2\2\u02b5\u02b6\7\f\2\2\u02b6\u02b7\5p9\2\u02b7\u02b8\7&\2\2\u02b8"+
		"\u02b9\5p9\2\u02b9\u02ba\7\r\2\2\u02ba\u0099\3\2\2\2\u02bb\u02bc\7k\2"+
		"\2\u02bc\u02bd\7\f\2\2\u02bd\u02be\5p9\2\u02be\u02bf\7&\2\2\u02bf\u02c0"+
		"\5p9\2\u02c0\u02c1\7&\2\2\u02c1\u02c2\5p9\2\u02c2\u02c3\7\r\2\2\u02c3"+
		"\u009b\3\2\2\2\u02c4\u02c5\t\17\2\2\u02c5\u02c6\7\f\2\2\u02c6\u02c7\5"+
		"p9\2\u02c7\u02c8\7&\2\2\u02c8\u02cb\5p9\2\u02c9\u02ca\7&\2\2\u02ca\u02cc"+
		"\5p9\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd"+
		"\u02ce\7\r\2\2\u02ce\u009d\3\2\2\2\u02cf\u02d0\7n\2\2\u02d0\u02d1\7\f"+
		"\2\2\u02d1\u02d2\5p9\2\u02d2\u02d3\7&\2\2\u02d3\u02d4\5p9\2\u02d4\u02d5"+
		"\7&\2\2\u02d5\u02d8\5p9\2\u02d6\u02d7\7&\2\2\u02d7\u02d9\5p9\2\u02d8\u02d6"+
		"\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02db\7\r\2\2\u02db"+
		"\u009f\3\2\2\2\u02dc\u02dd\7o\2\2\u02dd\u02de\7\f\2\2\u02de\u02df\5\u00ac"+
		"W\2\u02df\u02e0\7\r\2\2\u02e0\u00a1\3\2\2\2\u02e1\u02e2\7p\2\2\u02e2\u02e3"+
		"\5H%\2\u02e3\u00a3\3\2\2\2\u02e4\u02e5\t\20\2\2\u02e5\u00a5\3\2\2\2\u02e6"+
		"\u02e9\7}\2\2\u02e7\u02e9\5\u00a8U\2\u02e8\u02e6\3\2\2\2\u02e8\u02e7\3"+
		"\2\2\2\u02e9\u00a7\3\2\2\2\u02ea\u02eb\t\21\2\2\u02eb\u00a9\3\2\2\2\u02ec"+
		"\u02ed\t\22\2\2\u02ed\u00ab\3\2\2\2\u02ee\u02ef\t\23\2\2\u02ef\u02f0\5"+
		"\u00aeX\2\u02f0\u00ad\3\2\2\2\u02f1\u02f2\t\24\2\2\u02f2\u00af\3\2\2\2"+
		"P\u00b4\u00ba\u00c0\u00c2\u00d5\u00da\u00de\u00e3\u00e6\u00f1\u00f7\u00fd"+
		"\u0107\u010a\u010f\u0113\u011b\u0124\u0134\u0138\u0142\u0150\u0153\u0156"+
		"\u0159\u0160\u0167\u016c\u0172\u017b\u0181\u0183\u0187\u018b\u018d\u0199"+
		"\u019f\u01a2\u01a9\u01ab\u01b0\u01b4\u01bc\u01c3\u01c8\u01cc\u01d9\u01e0"+
		"\u01fc\u0204\u020b\u0213\u021c\u0220\u0228\u0232\u023a\u023e\u0248\u0256"+
		"\u0259\u025f\u0264\u026f\u0276\u027b\u027f\u0284\u0288\u028e\u0296\u029d"+
		"\u02a1\u02ae\u02b2\u02cb\u02d8\u02e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}