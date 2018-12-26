// Generated from phisco/streams/polimi/it/antlr4/RSPQL.g4 by ANTLR 4.7.2
package phisco.streams.polimi.it.antlr4;
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
	 * Visit a parse tree produced by {@link RSPQLParser#queryUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryUnit(RSPQLParser.QueryUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(RSPQLParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#prologue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrologue(RSPQLParser.PrologueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#baseDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseDecl(RSPQLParser.BaseDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#prefixDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixDecl(RSPQLParser.PrefixDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#registerClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegisterClause(RSPQLParser.RegisterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#selectQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectQuery(RSPQLParser.SelectQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(RSPQLParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#selectModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectModifier(RSPQLParser.SelectModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#resultVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultVar(RSPQLParser.ResultVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#constructQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructQuery(RSPQLParser.ConstructQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#describeQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeQuery(RSPQLParser.DescribeQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#askQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAskQuery(RSPQLParser.AskQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#datasetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatasetClause(RSPQLParser.DatasetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#namedGraphClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedGraphClause(RSPQLParser.NamedGraphClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#namedWindowClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedWindowClause(RSPQLParser.NamedWindowClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#windowDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowDefinition(RSPQLParser.WindowDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#physicalWindow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhysicalWindow(RSPQLParser.PhysicalWindowContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#physicalRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhysicalRange(RSPQLParser.PhysicalRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#physicalStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhysicalStep(RSPQLParser.PhysicalStepContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#logicalWindow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalWindow(RSPQLParser.LogicalWindowContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#logicalRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalRange(RSPQLParser.LogicalRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#logicalStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalStep(RSPQLParser.LogicalStepContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(RSPQLParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuration(RSPQLParser.DurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#solutionModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSolutionModifier(RSPQLParser.SolutionModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#groupClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupClause(RSPQLParser.GroupClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#groupCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupCondition(RSPQLParser.GroupConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(RSPQLParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#havingCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingCondition(RSPQLParser.HavingConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#orderClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderClause(RSPQLParser.OrderClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#orderCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderCondition(RSPQLParser.OrderConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#limitOffsetClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitOffsetClauses(RSPQLParser.LimitOffsetClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(RSPQLParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#offsetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffsetClause(RSPQLParser.OffsetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#groupGraphPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupGraphPattern(RSPQLParser.GroupGraphPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#graphPatternSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraphPatternSub(RSPQLParser.GraphPatternSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#triplesSameSubject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriplesSameSubject(RSPQLParser.TriplesSameSubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#propertyListNotEmpty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyListNotEmpty(RSPQLParser.PropertyListNotEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(RSPQLParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#verb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerb(RSPQLParser.VerbContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#objectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectList(RSPQLParser.ObjectListContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(RSPQLParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#varOrTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarOrTerm(RSPQLParser.VarOrTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlankNodePropertyList(RSPQLParser.BlankNodePropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#graphPatternNotTriples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraphPatternNotTriples(RSPQLParser.GraphPatternNotTriplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#groupOrUnionGraphPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupOrUnionGraphPattern(RSPQLParser.GroupOrUnionGraphPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#optionalGraphPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalGraphPattern(RSPQLParser.OptionalGraphPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#minusGraphPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusGraphPattern(RSPQLParser.MinusGraphPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#graphGraphPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraphGraphPattern(RSPQLParser.GraphGraphPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#windowGraphPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowGraphPattern(RSPQLParser.WindowGraphPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(RSPQLParser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#bindPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindPattern(RSPQLParser.BindPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#varOrIri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarOrIri(RSPQLParser.VarOrIriContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#graphTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraphTerm(RSPQLParser.GraphTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(RSPQLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(RSPQLParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#valueLogical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueLogical(RSPQLParser.ValueLogicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(RSPQLParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(RSPQLParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#numericExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericExpression(RSPQLParser.NumericExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(RSPQLParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(RSPQLParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(RSPQLParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#brackettedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackettedExpression(RSPQLParser.BrackettedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#builtInCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltInCall(RSPQLParser.BuiltInCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#rdfliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRdfliteral(RSPQLParser.RdfliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(RSPQLParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#numericLiteralUnsigned}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteralUnsigned(RSPQLParser.NumericLiteralUnsignedContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#numericLiteralPositive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteralPositive(RSPQLParser.NumericLiteralPositiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#numericLiteralNegative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteralNegative(RSPQLParser.NumericLiteralNegativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(RSPQLParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(RSPQLParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#aggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate(RSPQLParser.AggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#unaryBuiltin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryBuiltin(RSPQLParser.UnaryBuiltinContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#binaryBuiltin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryBuiltin(RSPQLParser.BinaryBuiltinContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#ternaryBuiltin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryBuiltin(RSPQLParser.TernaryBuiltinContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#ternaryOrBinaryBuiltin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryOrBinaryBuiltin(RSPQLParser.TernaryOrBinaryBuiltinContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#strReplaceExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrReplaceExpression(RSPQLParser.StrReplaceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#boundExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundExpression(RSPQLParser.BoundExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#existsFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsFunc(RSPQLParser.ExistsFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(RSPQLParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#iri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIri(RSPQLParser.IriContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#prefixedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixedName(RSPQLParser.PrefixedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#blankNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlankNode(RSPQLParser.BlankNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(RSPQLParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link RSPQLParser#varname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarname(RSPQLParser.VarnameContext ctx);
}