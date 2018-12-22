// Generated from phisco/streams/polimi/it/antlr4/RSPQL.g4 by ANTLR 4.3
package phisco.streams.polimi.it.antlr4;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RSPQLParser}.
 */
public interface RSPQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#builtInCall}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInCall(@NotNull RSPQLParser.BuiltInCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#builtInCall}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInCall(@NotNull RSPQLParser.BuiltInCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#groupCondition}.
	 * @param ctx the parse tree
	 */
	void enterGroupCondition(@NotNull RSPQLParser.GroupConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#groupCondition}.
	 * @param ctx the parse tree
	 */
	void exitGroupCondition(@NotNull RSPQLParser.GroupConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#brackettedExpression}.
	 * @param ctx the parse tree
	 */
	void enterBrackettedExpression(@NotNull RSPQLParser.BrackettedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#brackettedExpression}.
	 * @param ctx the parse tree
	 */
	void exitBrackettedExpression(@NotNull RSPQLParser.BrackettedExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull RSPQLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull RSPQLParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#groupGraphPattern}.
	 * @param ctx the parse tree
	 */
	void enterGroupGraphPattern(@NotNull RSPQLParser.GroupGraphPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#groupGraphPattern}.
	 * @param ctx the parse tree
	 */
	void exitGroupGraphPattern(@NotNull RSPQLParser.GroupGraphPatternContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#graphPatternNotTriples}.
	 * @param ctx the parse tree
	 */
	void enterGraphPatternNotTriples(@NotNull RSPQLParser.GraphPatternNotTriplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#graphPatternNotTriples}.
	 * @param ctx the parse tree
	 */
	void exitGraphPatternNotTriples(@NotNull RSPQLParser.GraphPatternNotTriplesContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#bind}.
	 * @param ctx the parse tree
	 */
	void enterBind(@NotNull RSPQLParser.BindContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#bind}.
	 * @param ctx the parse tree
	 */
	void exitBind(@NotNull RSPQLParser.BindContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#inlineDataFull}.
	 * @param ctx the parse tree
	 */
	void enterInlineDataFull(@NotNull RSPQLParser.InlineDataFullContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#inlineDataFull}.
	 * @param ctx the parse tree
	 */
	void exitInlineDataFull(@NotNull RSPQLParser.InlineDataFullContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#valueLogical}.
	 * @param ctx the parse tree
	 */
	void enterValueLogical(@NotNull RSPQLParser.ValueLogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#valueLogical}.
	 * @param ctx the parse tree
	 */
	void exitValueLogical(@NotNull RSPQLParser.ValueLogicalContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(@NotNull RSPQLParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(@NotNull RSPQLParser.UnaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(@NotNull RSPQLParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(@NotNull RSPQLParser.NumericLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#substringExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubstringExpression(@NotNull RSPQLParser.SubstringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#substringExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubstringExpression(@NotNull RSPQLParser.SubstringExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#inlineDataOneVar}.
	 * @param ctx the parse tree
	 */
	void enterInlineDataOneVar(@NotNull RSPQLParser.InlineDataOneVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#inlineDataOneVar}.
	 * @param ctx the parse tree
	 */
	void exitInlineDataOneVar(@NotNull RSPQLParser.InlineDataOneVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#queryUnit}.
	 * @param ctx the parse tree
	 */
	void enterQueryUnit(@NotNull RSPQLParser.QueryUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#queryUnit}.
	 * @param ctx the parse tree
	 */
	void exitQueryUnit(@NotNull RSPQLParser.QueryUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#optionalGraphPattern}.
	 * @param ctx the parse tree
	 */
	void enterOptionalGraphPattern(@NotNull RSPQLParser.OptionalGraphPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#optionalGraphPattern}.
	 * @param ctx the parse tree
	 */
	void exitOptionalGraphPattern(@NotNull RSPQLParser.OptionalGraphPatternContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void enterOffsetClause(@NotNull RSPQLParser.OffsetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void exitOffsetClause(@NotNull RSPQLParser.OffsetClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#constructTemplate}.
	 * @param ctx the parse tree
	 */
	void enterConstructTemplate(@NotNull RSPQLParser.ConstructTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#constructTemplate}.
	 * @param ctx the parse tree
	 */
	void exitConstructTemplate(@NotNull RSPQLParser.ConstructTemplateContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull RSPQLParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull RSPQLParser.VarContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(@NotNull RSPQLParser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(@NotNull RSPQLParser.VerbContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#reduced}.
	 * @param ctx the parse tree
	 */
	void enterReduced(@NotNull RSPQLParser.ReducedContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#reduced}.
	 * @param ctx the parse tree
	 */
	void exitReduced(@NotNull RSPQLParser.ReducedContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#windowGraphPattern}.
	 * @param ctx the parse tree
	 */
	void enterWindowGraphPattern(@NotNull RSPQLParser.WindowGraphPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#windowGraphPattern}.
	 * @param ctx the parse tree
	 */
	void exitWindowGraphPattern(@NotNull RSPQLParser.WindowGraphPatternContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#havingCondition}.
	 * @param ctx the parse tree
	 */
	void enterHavingCondition(@NotNull RSPQLParser.HavingConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#havingCondition}.
	 * @param ctx the parse tree
	 */
	void exitHavingCondition(@NotNull RSPQLParser.HavingConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#quadPattern}.
	 * @param ctx the parse tree
	 */
	void enterQuadPattern(@NotNull RSPQLParser.QuadPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#quadPattern}.
	 * @param ctx the parse tree
	 */
	void exitQuadPattern(@NotNull RSPQLParser.QuadPatternContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull RSPQLParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull RSPQLParser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#orderClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderClause(@NotNull RSPQLParser.OrderClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#orderClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderClause(@NotNull RSPQLParser.OrderClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull RSPQLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull RSPQLParser.FunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#regexExpression}.
	 * @param ctx the parse tree
	 */
	void enterRegexExpression(@NotNull RSPQLParser.RegexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#regexExpression}.
	 * @param ctx the parse tree
	 */
	void exitRegexExpression(@NotNull RSPQLParser.RegexExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#selectQuery}.
	 * @param ctx the parse tree
	 */
	void enterSelectQuery(@NotNull RSPQLParser.SelectQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#selectQuery}.
	 * @param ctx the parse tree
	 */
	void exitSelectQuery(@NotNull RSPQLParser.SelectQueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(@NotNull RSPQLParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(@NotNull RSPQLParser.ObjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#resultVar}.
	 * @param ctx the parse tree
	 */
	void enterResultVar(@NotNull RSPQLParser.ResultVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#resultVar}.
	 * @param ctx the parse tree
	 */
	void exitResultVar(@NotNull RSPQLParser.ResultVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#dataBlockValue}.
	 * @param ctx the parse tree
	 */
	void enterDataBlockValue(@NotNull RSPQLParser.DataBlockValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#dataBlockValue}.
	 * @param ctx the parse tree
	 */
	void exitDataBlockValue(@NotNull RSPQLParser.DataBlockValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#propertyListPath}.
	 * @param ctx the parse tree
	 */
	void enterPropertyListPath(@NotNull RSPQLParser.PropertyListPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#propertyListPath}.
	 * @param ctx the parse tree
	 */
	void exitPropertyListPath(@NotNull RSPQLParser.PropertyListPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(@NotNull RSPQLParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(@NotNull RSPQLParser.RelationalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#baseDecl}.
	 * @param ctx the parse tree
	 */
	void enterBaseDecl(@NotNull RSPQLParser.BaseDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#baseDecl}.
	 * @param ctx the parse tree
	 */
	void exitBaseDecl(@NotNull RSPQLParser.BaseDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#prefixDecl}.
	 * @param ctx the parse tree
	 */
	void enterPrefixDecl(@NotNull RSPQLParser.PrefixDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#prefixDecl}.
	 * @param ctx the parse tree
	 */
	void exitPrefixDecl(@NotNull RSPQLParser.PrefixDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#datasetClause}.
	 * @param ctx the parse tree
	 */
	void enterDatasetClause(@NotNull RSPQLParser.DatasetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#datasetClause}.
	 * @param ctx the parse tree
	 */
	void exitDatasetClause(@NotNull RSPQLParser.DatasetClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#graphOrDefault}.
	 * @param ctx the parse tree
	 */
	void enterGraphOrDefault(@NotNull RSPQLParser.GraphOrDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#graphOrDefault}.
	 * @param ctx the parse tree
	 */
	void exitGraphOrDefault(@NotNull RSPQLParser.GraphOrDefaultContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#windowUri}.
	 * @param ctx the parse tree
	 */
	void enterWindowUri(@NotNull RSPQLParser.WindowUriContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#windowUri}.
	 * @param ctx the parse tree
	 */
	void exitWindowUri(@NotNull RSPQLParser.WindowUriContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#numericLiteralNegative}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteralNegative(@NotNull RSPQLParser.NumericLiteralNegativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#numericLiteralNegative}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteralNegative(@NotNull RSPQLParser.NumericLiteralNegativeContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(@NotNull RSPQLParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(@NotNull RSPQLParser.SelectClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#physicalRange}.
	 * @param ctx the parse tree
	 */
	void enterPhysicalRange(@NotNull RSPQLParser.PhysicalRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#physicalRange}.
	 * @param ctx the parse tree
	 */
	void exitPhysicalRange(@NotNull RSPQLParser.PhysicalRangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#varOrTerm}.
	 * @param ctx the parse tree
	 */
	void enterVarOrTerm(@NotNull RSPQLParser.VarOrTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#varOrTerm}.
	 * @param ctx the parse tree
	 */
	void exitVarOrTerm(@NotNull RSPQLParser.VarOrTermContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#physicalStep}.
	 * @param ctx the parse tree
	 */
	void enterPhysicalStep(@NotNull RSPQLParser.PhysicalStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#physicalStep}.
	 * @param ctx the parse tree
	 */
	void exitPhysicalStep(@NotNull RSPQLParser.PhysicalStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#blankNode}.
	 * @param ctx the parse tree
	 */
	void enterBlankNode(@NotNull RSPQLParser.BlankNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#blankNode}.
	 * @param ctx the parse tree
	 */
	void exitBlankNode(@NotNull RSPQLParser.BlankNodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(@NotNull RSPQLParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(@NotNull RSPQLParser.PrimaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#iri}.
	 * @param ctx the parse tree
	 */
	void enterIri(@NotNull RSPQLParser.IriContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#iri}.
	 * @param ctx the parse tree
	 */
	void exitIri(@NotNull RSPQLParser.IriContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(@NotNull RSPQLParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(@NotNull RSPQLParser.HavingClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#quads}.
	 * @param ctx the parse tree
	 */
	void enterQuads(@NotNull RSPQLParser.QuadsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#quads}.
	 * @param ctx the parse tree
	 */
	void exitQuads(@NotNull RSPQLParser.QuadsContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull RSPQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull RSPQLParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#collectionPath}.
	 * @param ctx the parse tree
	 */
	void enterCollectionPath(@NotNull RSPQLParser.CollectionPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#collectionPath}.
	 * @param ctx the parse tree
	 */
	void exitCollectionPath(@NotNull RSPQLParser.CollectionPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#graphRef}.
	 * @param ctx the parse tree
	 */
	void enterGraphRef(@NotNull RSPQLParser.GraphRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#graphRef}.
	 * @param ctx the parse tree
	 */
	void exitGraphRef(@NotNull RSPQLParser.GraphRefContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void enterPropertyList(@NotNull RSPQLParser.PropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void exitPropertyList(@NotNull RSPQLParser.PropertyListContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#undef}.
	 * @param ctx the parse tree
	 */
	void enterUndef(@NotNull RSPQLParser.UndefContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#undef}.
	 * @param ctx the parse tree
	 */
	void exitUndef(@NotNull RSPQLParser.UndefContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(@NotNull RSPQLParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(@NotNull RSPQLParser.ConditionalAndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(@NotNull RSPQLParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(@NotNull RSPQLParser.MultiplicativeExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#serviceGraphPattern}.
	 * @param ctx the parse tree
	 */
	void enterServiceGraphPattern(@NotNull RSPQLParser.ServiceGraphPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#serviceGraphPattern}.
	 * @param ctx the parse tree
	 */
	void exitServiceGraphPattern(@NotNull RSPQLParser.ServiceGraphPatternContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#verbSimple}.
	 * @param ctx the parse tree
	 */
	void enterVerbSimple(@NotNull RSPQLParser.VerbSimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#verbSimple}.
	 * @param ctx the parse tree
	 */
	void exitVerbSimple(@NotNull RSPQLParser.VerbSimpleContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(@NotNull RSPQLParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(@NotNull RSPQLParser.FilterContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#notExistsFunc}.
	 * @param ctx the parse tree
	 */
	void enterNotExistsFunc(@NotNull RSPQLParser.NotExistsFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#notExistsFunc}.
	 * @param ctx the parse tree
	 */
	void exitNotExistsFunc(@NotNull RSPQLParser.NotExistsFuncContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#graphNode}.
	 * @param ctx the parse tree
	 */
	void enterGraphNode(@NotNull RSPQLParser.GraphNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#graphNode}.
	 * @param ctx the parse tree
	 */
	void exitGraphNode(@NotNull RSPQLParser.GraphNodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(@NotNull RSPQLParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(@NotNull RSPQLParser.ConstraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#numericLiteralUnsigned}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteralUnsigned(@NotNull RSPQLParser.NumericLiteralUnsignedContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#numericLiteralUnsigned}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteralUnsigned(@NotNull RSPQLParser.NumericLiteralUnsignedContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#existsFunc}.
	 * @param ctx the parse tree
	 */
	void enterExistsFunc(@NotNull RSPQLParser.ExistsFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#existsFunc}.
	 * @param ctx the parse tree
	 */
	void exitExistsFunc(@NotNull RSPQLParser.ExistsFuncContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#outputStreamType}.
	 * @param ctx the parse tree
	 */
	void enterOutputStreamType(@NotNull RSPQLParser.OutputStreamTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#outputStreamType}.
	 * @param ctx the parse tree
	 */
	void exitOutputStreamType(@NotNull RSPQLParser.OutputStreamTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#registerClause}.
	 * @param ctx the parse tree
	 */
	void enterRegisterClause(@NotNull RSPQLParser.RegisterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#registerClause}.
	 * @param ctx the parse tree
	 */
	void exitRegisterClause(@NotNull RSPQLParser.RegisterClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(@NotNull RSPQLParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(@NotNull RSPQLParser.ArgListContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#namedGraphClause}.
	 * @param ctx the parse tree
	 */
	void enterNamedGraphClause(@NotNull RSPQLParser.NamedGraphClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#namedGraphClause}.
	 * @param ctx the parse tree
	 */
	void exitNamedGraphClause(@NotNull RSPQLParser.NamedGraphClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#triplesTemplate}.
	 * @param ctx the parse tree
	 */
	void enterTriplesTemplate(@NotNull RSPQLParser.TriplesTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#triplesTemplate}.
	 * @param ctx the parse tree
	 */
	void exitTriplesTemplate(@NotNull RSPQLParser.TriplesTemplateContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(@NotNull RSPQLParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(@NotNull RSPQLParser.WhereClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#propertyListPathNotEmpty}.
	 * @param ctx the parse tree
	 */
	void enterPropertyListPathNotEmpty(@NotNull RSPQLParser.PropertyListPathNotEmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#propertyListPathNotEmpty}.
	 * @param ctx the parse tree
	 */
	void exitPropertyListPathNotEmpty(@NotNull RSPQLParser.PropertyListPathNotEmptyContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#blankNodePropertyListPath}.
	 * @param ctx the parse tree
	 */
	void enterBlankNodePropertyListPath(@NotNull RSPQLParser.BlankNodePropertyListPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#blankNodePropertyListPath}.
	 * @param ctx the parse tree
	 */
	void exitBlankNodePropertyListPath(@NotNull RSPQLParser.BlankNodePropertyListPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#graphNodePath}.
	 * @param ctx the parse tree
	 */
	void enterGraphNodePath(@NotNull RSPQLParser.GraphNodePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#graphNodePath}.
	 * @param ctx the parse tree
	 */
	void exitGraphNodePath(@NotNull RSPQLParser.GraphNodePathContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(@NotNull RSPQLParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(@NotNull RSPQLParser.IntegerContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#varOrIri}.
	 * @param ctx the parse tree
	 */
	void enterVarOrIri(@NotNull RSPQLParser.VarOrIriContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#varOrIri}.
	 * @param ctx the parse tree
	 */
	void exitVarOrIri(@NotNull RSPQLParser.VarOrIriContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#quadsNotTriples}.
	 * @param ctx the parse tree
	 */
	void enterQuadsNotTriples(@NotNull RSPQLParser.QuadsNotTriplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#quadsNotTriples}.
	 * @param ctx the parse tree
	 */
	void exitQuadsNotTriples(@NotNull RSPQLParser.QuadsNotTriplesContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#numericExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericExpression(@NotNull RSPQLParser.NumericExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#numericExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericExpression(@NotNull RSPQLParser.NumericExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#objectPath}.
	 * @param ctx the parse tree
	 */
	void enterObjectPath(@NotNull RSPQLParser.ObjectPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#objectPath}.
	 * @param ctx the parse tree
	 */
	void exitObjectPath(@NotNull RSPQLParser.ObjectPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#limitOffsetClauses}.
	 * @param ctx the parse tree
	 */
	void enterLimitOffsetClauses(@NotNull RSPQLParser.LimitOffsetClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#limitOffsetClauses}.
	 * @param ctx the parse tree
	 */
	void exitLimitOffsetClauses(@NotNull RSPQLParser.LimitOffsetClausesContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#logicalWindow}.
	 * @param ctx the parse tree
	 */
	void enterLogicalWindow(@NotNull RSPQLParser.LogicalWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#logicalWindow}.
	 * @param ctx the parse tree
	 */
	void exitLogicalWindow(@NotNull RSPQLParser.LogicalWindowContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterBlankNodePropertyList(@NotNull RSPQLParser.BlankNodePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitBlankNodePropertyList(@NotNull RSPQLParser.BlankNodePropertyListContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(@NotNull RSPQLParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(@NotNull RSPQLParser.ConditionalOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#triplesNodePath}.
	 * @param ctx the parse tree
	 */
	void enterTriplesNodePath(@NotNull RSPQLParser.TriplesNodePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#triplesNodePath}.
	 * @param ctx the parse tree
	 */
	void exitTriplesNodePath(@NotNull RSPQLParser.TriplesNodePathContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(@NotNull RSPQLParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(@NotNull RSPQLParser.BooleanLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#orderCondition}.
	 * @param ctx the parse tree
	 */
	void enterOrderCondition(@NotNull RSPQLParser.OrderConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#orderCondition}.
	 * @param ctx the parse tree
	 */
	void exitOrderCondition(@NotNull RSPQLParser.OrderConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#dataBlockValues}.
	 * @param ctx the parse tree
	 */
	void enterDataBlockValues(@NotNull RSPQLParser.DataBlockValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#dataBlockValues}.
	 * @param ctx the parse tree
	 */
	void exitDataBlockValues(@NotNull RSPQLParser.DataBlockValuesContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#solutionModifier}.
	 * @param ctx the parse tree
	 */
	void enterSolutionModifier(@NotNull RSPQLParser.SolutionModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#solutionModifier}.
	 * @param ctx the parse tree
	 */
	void exitSolutionModifier(@NotNull RSPQLParser.SolutionModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(@NotNull RSPQLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(@NotNull RSPQLParser.QueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#namedWindowClause}.
	 * @param ctx the parse tree
	 */
	void enterNamedWindowClause(@NotNull RSPQLParser.NamedWindowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#namedWindowClause}.
	 * @param ctx the parse tree
	 */
	void exitNamedWindowClause(@NotNull RSPQLParser.NamedWindowClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#iriOrFunction}.
	 * @param ctx the parse tree
	 */
	void enterIriOrFunction(@NotNull RSPQLParser.IriOrFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#iriOrFunction}.
	 * @param ctx the parse tree
	 */
	void exitIriOrFunction(@NotNull RSPQLParser.IriOrFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#defaultGraphClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultGraphClause(@NotNull RSPQLParser.DefaultGraphClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#defaultGraphClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultGraphClause(@NotNull RSPQLParser.DefaultGraphClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#triplesSameSubject}.
	 * @param ctx the parse tree
	 */
	void enterTriplesSameSubject(@NotNull RSPQLParser.TriplesSameSubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#triplesSameSubject}.
	 * @param ctx the parse tree
	 */
	void exitTriplesSameSubject(@NotNull RSPQLParser.TriplesSameSubjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#triplesNode}.
	 * @param ctx the parse tree
	 */
	void enterTriplesNode(@NotNull RSPQLParser.TriplesNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#triplesNode}.
	 * @param ctx the parse tree
	 */
	void exitTriplesNode(@NotNull RSPQLParser.TriplesNodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#logicalStep}.
	 * @param ctx the parse tree
	 */
	void enterLogicalStep(@NotNull RSPQLParser.LogicalStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#logicalStep}.
	 * @param ctx the parse tree
	 */
	void exitLogicalStep(@NotNull RSPQLParser.LogicalStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#collection}.
	 * @param ctx the parse tree
	 */
	void enterCollection(@NotNull RSPQLParser.CollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#collection}.
	 * @param ctx the parse tree
	 */
	void exitCollection(@NotNull RSPQLParser.CollectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#triplesSameSubjectPath}.
	 * @param ctx the parse tree
	 */
	void enterTriplesSameSubjectPath(@NotNull RSPQLParser.TriplesSameSubjectPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#triplesSameSubjectPath}.
	 * @param ctx the parse tree
	 */
	void exitTriplesSameSubjectPath(@NotNull RSPQLParser.TriplesSameSubjectPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#logicalRange}.
	 * @param ctx the parse tree
	 */
	void enterLogicalRange(@NotNull RSPQLParser.LogicalRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#logicalRange}.
	 * @param ctx the parse tree
	 */
	void exitLogicalRange(@NotNull RSPQLParser.LogicalRangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#groupClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupClause(@NotNull RSPQLParser.GroupClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#groupClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupClause(@NotNull RSPQLParser.GroupClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#valuesClause}.
	 * @param ctx the parse tree
	 */
	void enterValuesClause(@NotNull RSPQLParser.ValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#valuesClause}.
	 * @param ctx the parse tree
	 */
	void exitValuesClause(@NotNull RSPQLParser.ValuesClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#propertyListNotEmpty}.
	 * @param ctx the parse tree
	 */
	void enterPropertyListNotEmpty(@NotNull RSPQLParser.PropertyListNotEmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#propertyListNotEmpty}.
	 * @param ctx the parse tree
	 */
	void exitPropertyListNotEmpty(@NotNull RSPQLParser.PropertyListNotEmptyContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#dataBlock}.
	 * @param ctx the parse tree
	 */
	void enterDataBlock(@NotNull RSPQLParser.DataBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#dataBlock}.
	 * @param ctx the parse tree
	 */
	void exitDataBlock(@NotNull RSPQLParser.DataBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#inlineData}.
	 * @param ctx the parse tree
	 */
	void enterInlineData(@NotNull RSPQLParser.InlineDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#inlineData}.
	 * @param ctx the parse tree
	 */
	void exitInlineData(@NotNull RSPQLParser.InlineDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#rdfliteral}.
	 * @param ctx the parse tree
	 */
	void enterRdfliteral(@NotNull RSPQLParser.RdfliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#rdfliteral}.
	 * @param ctx the parse tree
	 */
	void exitRdfliteral(@NotNull RSPQLParser.RdfliteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull RSPQLParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull RSPQLParser.StringContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#constructQuery}.
	 * @param ctx the parse tree
	 */
	void enterConstructQuery(@NotNull RSPQLParser.ConstructQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#constructQuery}.
	 * @param ctx the parse tree
	 */
	void exitConstructQuery(@NotNull RSPQLParser.ConstructQueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#groupOrUnionGraphPattern}.
	 * @param ctx the parse tree
	 */
	void enterGroupOrUnionGraphPattern(@NotNull RSPQLParser.GroupOrUnionGraphPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#groupOrUnionGraphPattern}.
	 * @param ctx the parse tree
	 */
	void exitGroupOrUnionGraphPattern(@NotNull RSPQLParser.GroupOrUnionGraphPatternContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#multiExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiExpr(@NotNull RSPQLParser.MultiExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#multiExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiExpr(@NotNull RSPQLParser.MultiExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#prefixedName}.
	 * @param ctx the parse tree
	 */
	void enterPrefixedName(@NotNull RSPQLParser.PrefixedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#prefixedName}.
	 * @param ctx the parse tree
	 */
	void exitPrefixedName(@NotNull RSPQLParser.PrefixedNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#distinct}.
	 * @param ctx the parse tree
	 */
	void enterDistinct(@NotNull RSPQLParser.DistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#distinct}.
	 * @param ctx the parse tree
	 */
	void exitDistinct(@NotNull RSPQLParser.DistinctContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#askQuery}.
	 * @param ctx the parse tree
	 */
	void enterAskQuery(@NotNull RSPQLParser.AskQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#askQuery}.
	 * @param ctx the parse tree
	 */
	void exitAskQuery(@NotNull RSPQLParser.AskQueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#graphGraphPattern}.
	 * @param ctx the parse tree
	 */
	void enterGraphGraphPattern(@NotNull RSPQLParser.GraphGraphPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#graphGraphPattern}.
	 * @param ctx the parse tree
	 */
	void exitGraphGraphPattern(@NotNull RSPQLParser.GraphGraphPatternContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void enterAggregate(@NotNull RSPQLParser.AggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void exitAggregate(@NotNull RSPQLParser.AggregateContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#duration}.
	 * @param ctx the parse tree
	 */
	void enterDuration(@NotNull RSPQLParser.DurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#duration}.
	 * @param ctx the parse tree
	 */
	void exitDuration(@NotNull RSPQLParser.DurationContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#objectListPath}.
	 * @param ctx the parse tree
	 */
	void enterObjectListPath(@NotNull RSPQLParser.ObjectListPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#objectListPath}.
	 * @param ctx the parse tree
	 */
	void exitObjectListPath(@NotNull RSPQLParser.ObjectListPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#graphTerm}.
	 * @param ctx the parse tree
	 */
	void enterGraphTerm(@NotNull RSPQLParser.GraphTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#graphTerm}.
	 * @param ctx the parse tree
	 */
	void exitGraphTerm(@NotNull RSPQLParser.GraphTermContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#constructTriples}.
	 * @param ctx the parse tree
	 */
	void enterConstructTriples(@NotNull RSPQLParser.ConstructTriplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#constructTriples}.
	 * @param ctx the parse tree
	 */
	void exitConstructTriples(@NotNull RSPQLParser.ConstructTriplesContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#physicalWindow}.
	 * @param ctx the parse tree
	 */
	void enterPhysicalWindow(@NotNull RSPQLParser.PhysicalWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#physicalWindow}.
	 * @param ctx the parse tree
	 */
	void exitPhysicalWindow(@NotNull RSPQLParser.PhysicalWindowContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#describeQuery}.
	 * @param ctx the parse tree
	 */
	void enterDescribeQuery(@NotNull RSPQLParser.DescribeQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#describeQuery}.
	 * @param ctx the parse tree
	 */
	void exitDescribeQuery(@NotNull RSPQLParser.DescribeQueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#sourceSelector}.
	 * @param ctx the parse tree
	 */
	void enterSourceSelector(@NotNull RSPQLParser.SourceSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#sourceSelector}.
	 * @param ctx the parse tree
	 */
	void exitSourceSelector(@NotNull RSPQLParser.SourceSelectorContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#outputStream}.
	 * @param ctx the parse tree
	 */
	void enterOutputStream(@NotNull RSPQLParser.OutputStreamContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#outputStream}.
	 * @param ctx the parse tree
	 */
	void exitOutputStream(@NotNull RSPQLParser.OutputStreamContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#prologue}.
	 * @param ctx the parse tree
	 */
	void enterPrologue(@NotNull RSPQLParser.PrologueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#prologue}.
	 * @param ctx the parse tree
	 */
	void exitPrologue(@NotNull RSPQLParser.PrologueContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#streamUri}.
	 * @param ctx the parse tree
	 */
	void enterStreamUri(@NotNull RSPQLParser.StreamUriContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#streamUri}.
	 * @param ctx the parse tree
	 */
	void exitStreamUri(@NotNull RSPQLParser.StreamUriContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#resultStar}.
	 * @param ctx the parse tree
	 */
	void enterResultStar(@NotNull RSPQLParser.ResultStarContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#resultStar}.
	 * @param ctx the parse tree
	 */
	void exitResultStar(@NotNull RSPQLParser.ResultStarContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#minusGraphPattern}.
	 * @param ctx the parse tree
	 */
	void enterMinusGraphPattern(@NotNull RSPQLParser.MinusGraphPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#minusGraphPattern}.
	 * @param ctx the parse tree
	 */
	void exitMinusGraphPattern(@NotNull RSPQLParser.MinusGraphPatternContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#numericLiteralPositive}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteralPositive(@NotNull RSPQLParser.NumericLiteralPositiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#numericLiteralPositive}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteralPositive(@NotNull RSPQLParser.NumericLiteralPositiveContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(@NotNull RSPQLParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(@NotNull RSPQLParser.LimitClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#objectList}.
	 * @param ctx the parse tree
	 */
	void enterObjectList(@NotNull RSPQLParser.ObjectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#objectList}.
	 * @param ctx the parse tree
	 */
	void exitObjectList(@NotNull RSPQLParser.ObjectListContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#triplesBlock}.
	 * @param ctx the parse tree
	 */
	void enterTriplesBlock(@NotNull RSPQLParser.TriplesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#triplesBlock}.
	 * @param ctx the parse tree
	 */
	void exitTriplesBlock(@NotNull RSPQLParser.TriplesBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#strReplaceExpression}.
	 * @param ctx the parse tree
	 */
	void enterStrReplaceExpression(@NotNull RSPQLParser.StrReplaceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#strReplaceExpression}.
	 * @param ctx the parse tree
	 */
	void exitStrReplaceExpression(@NotNull RSPQLParser.StrReplaceExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#window}.
	 * @param ctx the parse tree
	 */
	void enterWindow(@NotNull RSPQLParser.WindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#window}.
	 * @param ctx the parse tree
	 */
	void exitWindow(@NotNull RSPQLParser.WindowContext ctx);
}