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
	 * Enter a parse tree produced by {@link RSPQLParser#ternaryBuiltin}.
	 * @param ctx the parse tree
	 */
	void enterTernaryBuiltin(@NotNull RSPQLParser.TernaryBuiltinContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#ternaryBuiltin}.
	 * @param ctx the parse tree
	 */
	void exitTernaryBuiltin(@NotNull RSPQLParser.TernaryBuiltinContext ctx);

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
	 * Enter a parse tree produced by {@link RSPQLParser#bindPattern}.
	 * @param ctx the parse tree
	 */
	void enterBindPattern(@NotNull RSPQLParser.BindPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#bindPattern}.
	 * @param ctx the parse tree
	 */
	void exitBindPattern(@NotNull RSPQLParser.BindPatternContext ctx);

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
	 * Enter a parse tree produced by {@link RSPQLParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(@NotNull RSPQLParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(@NotNull RSPQLParser.PropertyContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#windowDefinition}.
	 * @param ctx the parse tree
	 */
	void enterWindowDefinition(@NotNull RSPQLParser.WindowDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#windowDefinition}.
	 * @param ctx the parse tree
	 */
	void exitWindowDefinition(@NotNull RSPQLParser.WindowDefinitionContext ctx);

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
	 * Enter a parse tree produced by {@link RSPQLParser#graphPatternSub}.
	 * @param ctx the parse tree
	 */
	void enterGraphPatternSub(@NotNull RSPQLParser.GraphPatternSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#graphPatternSub}.
	 * @param ctx the parse tree
	 */
	void exitGraphPatternSub(@NotNull RSPQLParser.GraphPatternSubContext ctx);

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
	 * Enter a parse tree produced by {@link RSPQLParser#boundExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoundExpression(@NotNull RSPQLParser.BoundExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#boundExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoundExpression(@NotNull RSPQLParser.BoundExpressionContext ctx);

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
	 * Enter a parse tree produced by {@link RSPQLParser#ternaryOrBinaryBuiltin}.
	 * @param ctx the parse tree
	 */
	void enterTernaryOrBinaryBuiltin(@NotNull RSPQLParser.TernaryOrBinaryBuiltinContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#ternaryOrBinaryBuiltin}.
	 * @param ctx the parse tree
	 */
	void exitTernaryOrBinaryBuiltin(@NotNull RSPQLParser.TernaryOrBinaryBuiltinContext ctx);

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
	 * Enter a parse tree produced by {@link RSPQLParser#unaryBuiltin}.
	 * @param ctx the parse tree
	 */
	void enterUnaryBuiltin(@NotNull RSPQLParser.UnaryBuiltinContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#unaryBuiltin}.
	 * @param ctx the parse tree
	 */
	void exitUnaryBuiltin(@NotNull RSPQLParser.UnaryBuiltinContext ctx);

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
	 * Enter a parse tree produced by {@link RSPQLParser#binaryBuiltin}.
	 * @param ctx the parse tree
	 */
	void enterBinaryBuiltin(@NotNull RSPQLParser.BinaryBuiltinContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#binaryBuiltin}.
	 * @param ctx the parse tree
	 */
	void exitBinaryBuiltin(@NotNull RSPQLParser.BinaryBuiltinContext ctx);

	/**
	 * Enter a parse tree produced by {@link RSPQLParser#selectModifier}.
	 * @param ctx the parse tree
	 */
	void enterSelectModifier(@NotNull RSPQLParser.SelectModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#selectModifier}.
	 * @param ctx the parse tree
	 */
	void exitSelectModifier(@NotNull RSPQLParser.SelectModifierContext ctx);

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
	 * Enter a parse tree produced by {@link RSPQLParser#registerClause}.
	 * @param ctx the parse tree
	 */
	void enterRegisterClause(@NotNull RSPQLParser.RegisterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#registerClause}.
	 * @param ctx the parse tree
	 */
	void exitRegisterClause(@NotNull RSPQLParser.RegisterClauseContext ctx);
}