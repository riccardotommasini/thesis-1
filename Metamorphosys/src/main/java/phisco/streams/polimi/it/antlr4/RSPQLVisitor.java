// Generated from phisco/streams/polimi/it/antlr4/RSPQL.g4 by ANTLR 4.3
package phisco.streams.polimi.it.antlr4;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RSPQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RSPQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#builtInCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltInCall(@NotNull RSPQLParser.BuiltInCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#groupCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupCondition(@NotNull RSPQLParser.GroupConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#brackettedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackettedExpression(@NotNull RSPQLParser.BrackettedExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull RSPQLParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#groupGraphPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupGraphPattern(@NotNull RSPQLParser.GroupGraphPatternContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#graphPatternNotTriples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraphPatternNotTriples(@NotNull RSPQLParser.GraphPatternNotTriplesContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#bind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBind(@NotNull RSPQLParser.BindContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#inlineDataFull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineDataFull(@NotNull RSPQLParser.InlineDataFullContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#valueLogical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueLogical(@NotNull RSPQLParser.ValueLogicalContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(@NotNull RSPQLParser.UnaryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(@NotNull RSPQLParser.NumericLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#substringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstringExpression(@NotNull RSPQLParser.SubstringExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#inlineDataOneVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineDataOneVar(@NotNull RSPQLParser.InlineDataOneVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#queryUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryUnit(@NotNull RSPQLParser.QueryUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#optionalGraphPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalGraphPattern(@NotNull RSPQLParser.OptionalGraphPatternContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#offsetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffsetClause(@NotNull RSPQLParser.OffsetClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#constructTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructTemplate(@NotNull RSPQLParser.ConstructTemplateContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull RSPQLParser.VarContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#verb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerb(@NotNull RSPQLParser.VerbContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#reduced}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReduced(@NotNull RSPQLParser.ReducedContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#windowGraphPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowGraphPattern(@NotNull RSPQLParser.WindowGraphPatternContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#havingCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingCondition(@NotNull RSPQLParser.HavingConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#quadPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuadPattern(@NotNull RSPQLParser.QuadPatternContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull RSPQLParser.ExpressionListContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#orderClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderClause(@NotNull RSPQLParser.OrderClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull RSPQLParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#regexExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexExpression(@NotNull RSPQLParser.RegexExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#selectQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectQuery(@NotNull RSPQLParser.SelectQueryContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(@NotNull RSPQLParser.ObjectContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#resultVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultVar(@NotNull RSPQLParser.ResultVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#dataBlockValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataBlockValue(@NotNull RSPQLParser.DataBlockValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#propertyListPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyListPath(@NotNull RSPQLParser.PropertyListPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(@NotNull RSPQLParser.RelationalExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#baseDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseDecl(@NotNull RSPQLParser.BaseDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#prefixDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixDecl(@NotNull RSPQLParser.PrefixDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#datasetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatasetClause(@NotNull RSPQLParser.DatasetClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#graphOrDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraphOrDefault(@NotNull RSPQLParser.GraphOrDefaultContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#windowUri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowUri(@NotNull RSPQLParser.WindowUriContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#numericLiteralNegative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteralNegative(@NotNull RSPQLParser.NumericLiteralNegativeContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(@NotNull RSPQLParser.SelectClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#physicalRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhysicalRange(@NotNull RSPQLParser.PhysicalRangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#varOrTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarOrTerm(@NotNull RSPQLParser.VarOrTermContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#physicalStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhysicalStep(@NotNull RSPQLParser.PhysicalStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#blankNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlankNode(@NotNull RSPQLParser.BlankNodeContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(@NotNull RSPQLParser.PrimaryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#iri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIri(@NotNull RSPQLParser.IriContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(@NotNull RSPQLParser.HavingClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#quads}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuads(@NotNull RSPQLParser.QuadsContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull RSPQLParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#collectionPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionPath(@NotNull RSPQLParser.CollectionPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#graphRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraphRef(@NotNull RSPQLParser.GraphRefContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#propertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyList(@NotNull RSPQLParser.PropertyListContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#undef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndef(@NotNull RSPQLParser.UndefContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(@NotNull RSPQLParser.ConditionalAndExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(@NotNull RSPQLParser.MultiplicativeExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#serviceGraphPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceGraphPattern(@NotNull RSPQLParser.ServiceGraphPatternContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#verbSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerbSimple(@NotNull RSPQLParser.VerbSimpleContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(@NotNull RSPQLParser.FilterContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#notExistsFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExistsFunc(@NotNull RSPQLParser.NotExistsFuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#graphNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraphNode(@NotNull RSPQLParser.GraphNodeContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(@NotNull RSPQLParser.ConstraintContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#numericLiteralUnsigned}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteralUnsigned(@NotNull RSPQLParser.NumericLiteralUnsignedContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#existsFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsFunc(@NotNull RSPQLParser.ExistsFuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#outputStreamType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStreamType(@NotNull RSPQLParser.OutputStreamTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#registerClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegisterClause(@NotNull RSPQLParser.RegisterClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(@NotNull RSPQLParser.ArgListContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#namedGraphClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedGraphClause(@NotNull RSPQLParser.NamedGraphClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#triplesTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriplesTemplate(@NotNull RSPQLParser.TriplesTemplateContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(@NotNull RSPQLParser.WhereClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#propertyListPathNotEmpty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyListPathNotEmpty(@NotNull RSPQLParser.PropertyListPathNotEmptyContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#blankNodePropertyListPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlankNodePropertyListPath(@NotNull RSPQLParser.BlankNodePropertyListPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#graphNodePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraphNodePath(@NotNull RSPQLParser.GraphNodePathContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(@NotNull RSPQLParser.IntegerContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#varOrIri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarOrIri(@NotNull RSPQLParser.VarOrIriContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#quadsNotTriples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuadsNotTriples(@NotNull RSPQLParser.QuadsNotTriplesContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#numericExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericExpression(@NotNull RSPQLParser.NumericExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#objectPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectPath(@NotNull RSPQLParser.ObjectPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#limitOffsetClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitOffsetClauses(@NotNull RSPQLParser.LimitOffsetClausesContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#logicalWindow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalWindow(@NotNull RSPQLParser.LogicalWindowContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlankNodePropertyList(@NotNull RSPQLParser.BlankNodePropertyListContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(@NotNull RSPQLParser.ConditionalOrExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#triplesNodePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriplesNodePath(@NotNull RSPQLParser.TriplesNodePathContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(@NotNull RSPQLParser.BooleanLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#orderCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderCondition(@NotNull RSPQLParser.OrderConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#dataBlockValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataBlockValues(@NotNull RSPQLParser.DataBlockValuesContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#solutionModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSolutionModifier(@NotNull RSPQLParser.SolutionModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(@NotNull RSPQLParser.QueryContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#namedWindowClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedWindowClause(@NotNull RSPQLParser.NamedWindowClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#iriOrFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIriOrFunction(@NotNull RSPQLParser.IriOrFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#defaultGraphClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultGraphClause(@NotNull RSPQLParser.DefaultGraphClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#triplesSameSubject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriplesSameSubject(@NotNull RSPQLParser.TriplesSameSubjectContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#triplesNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriplesNode(@NotNull RSPQLParser.TriplesNodeContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#logicalStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalStep(@NotNull RSPQLParser.LogicalStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection(@NotNull RSPQLParser.CollectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#triplesSameSubjectPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriplesSameSubjectPath(@NotNull RSPQLParser.TriplesSameSubjectPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#logicalRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalRange(@NotNull RSPQLParser.LogicalRangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#groupClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupClause(@NotNull RSPQLParser.GroupClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#valuesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesClause(@NotNull RSPQLParser.ValuesClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#propertyListNotEmpty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyListNotEmpty(@NotNull RSPQLParser.PropertyListNotEmptyContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#dataBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataBlock(@NotNull RSPQLParser.DataBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#inlineData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineData(@NotNull RSPQLParser.InlineDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#rdfliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRdfliteral(@NotNull RSPQLParser.RdfliteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(@NotNull RSPQLParser.StringContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#constructQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructQuery(@NotNull RSPQLParser.ConstructQueryContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#groupOrUnionGraphPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupOrUnionGraphPattern(@NotNull RSPQLParser.GroupOrUnionGraphPatternContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#multiExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiExpr(@NotNull RSPQLParser.MultiExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#prefixedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixedName(@NotNull RSPQLParser.PrefixedNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinct(@NotNull RSPQLParser.DistinctContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#askQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAskQuery(@NotNull RSPQLParser.AskQueryContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#graphGraphPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraphGraphPattern(@NotNull RSPQLParser.GraphGraphPatternContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#aggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate(@NotNull RSPQLParser.AggregateContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuration(@NotNull RSPQLParser.DurationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#objectListPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectListPath(@NotNull RSPQLParser.ObjectListPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#graphTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraphTerm(@NotNull RSPQLParser.GraphTermContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#constructTriples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructTriples(@NotNull RSPQLParser.ConstructTriplesContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#physicalWindow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhysicalWindow(@NotNull RSPQLParser.PhysicalWindowContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#describeQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeQuery(@NotNull RSPQLParser.DescribeQueryContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#sourceSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceSelector(@NotNull RSPQLParser.SourceSelectorContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#outputStream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStream(@NotNull RSPQLParser.OutputStreamContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#prologue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrologue(@NotNull RSPQLParser.PrologueContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#streamUri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStreamUri(@NotNull RSPQLParser.StreamUriContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#resultStar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultStar(@NotNull RSPQLParser.ResultStarContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#minusGraphPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusGraphPattern(@NotNull RSPQLParser.MinusGraphPatternContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#numericLiteralPositive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteralPositive(@NotNull RSPQLParser.NumericLiteralPositiveContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(@NotNull RSPQLParser.LimitClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#objectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectList(@NotNull RSPQLParser.ObjectListContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#triplesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriplesBlock(@NotNull RSPQLParser.TriplesBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#strReplaceExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrReplaceExpression(@NotNull RSPQLParser.StrReplaceExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link RSPQLParser#window}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow(@NotNull RSPQLParser.WindowContext ctx);
}