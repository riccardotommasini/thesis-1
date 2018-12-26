// Generated from phisco/streams/polimi/it/antlr4/RSPQL.g4 by ANTLR 4.7.2
package phisco.streams.polimi.it.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RSPQLParser}.
 */
public interface RSPQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#queryUnit}.
	 * @param ctx the parse tree
	 */
	void enterQueryUnit(RSPQLParser.QueryUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#queryUnit}.
	 * @param ctx the parse tree
	 */
	void exitQueryUnit(RSPQLParser.QueryUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(RSPQLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(RSPQLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#prologue}.
	 * @param ctx the parse tree
	 */
	void enterPrologue(RSPQLParser.PrologueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#prologue}.
	 * @param ctx the parse tree
	 */
	void exitPrologue(RSPQLParser.PrologueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#baseDecl}.
	 * @param ctx the parse tree
	 */
	void enterBaseDecl(RSPQLParser.BaseDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#baseDecl}.
	 * @param ctx the parse tree
	 */
	void exitBaseDecl(RSPQLParser.BaseDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#prefixDecl}.
	 * @param ctx the parse tree
	 */
	void enterPrefixDecl(RSPQLParser.PrefixDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#prefixDecl}.
	 * @param ctx the parse tree
	 */
	void exitPrefixDecl(RSPQLParser.PrefixDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#registerClause}.
	 * @param ctx the parse tree
	 */
	void enterRegisterClause(RSPQLParser.RegisterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#registerClause}.
	 * @param ctx the parse tree
	 */
	void exitRegisterClause(RSPQLParser.RegisterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#selectQuery}.
	 * @param ctx the parse tree
	 */
	void enterSelectQuery(RSPQLParser.SelectQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#selectQuery}.
	 * @param ctx the parse tree
	 */
	void exitSelectQuery(RSPQLParser.SelectQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(RSPQLParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(RSPQLParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#selectModifier}.
	 * @param ctx the parse tree
	 */
	void enterSelectModifier(RSPQLParser.SelectModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#selectModifier}.
	 * @param ctx the parse tree
	 */
	void exitSelectModifier(RSPQLParser.SelectModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#resultVar}.
	 * @param ctx the parse tree
	 */
	void enterResultVar(RSPQLParser.ResultVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#resultVar}.
	 * @param ctx the parse tree
	 */
	void exitResultVar(RSPQLParser.ResultVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#constructQuery}.
	 * @param ctx the parse tree
	 */
	void enterConstructQuery(RSPQLParser.ConstructQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#constructQuery}.
	 * @param ctx the parse tree
	 */
	void exitConstructQuery(RSPQLParser.ConstructQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#describeQuery}.
	 * @param ctx the parse tree
	 */
	void enterDescribeQuery(RSPQLParser.DescribeQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#describeQuery}.
	 * @param ctx the parse tree
	 */
	void exitDescribeQuery(RSPQLParser.DescribeQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#askQuery}.
	 * @param ctx the parse tree
	 */
	void enterAskQuery(RSPQLParser.AskQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#askQuery}.
	 * @param ctx the parse tree
	 */
	void exitAskQuery(RSPQLParser.AskQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#datasetClause}.
	 * @param ctx the parse tree
	 */
	void enterDatasetClause(RSPQLParser.DatasetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#datasetClause}.
	 * @param ctx the parse tree
	 */
	void exitDatasetClause(RSPQLParser.DatasetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#namedGraphClause}.
	 * @param ctx the parse tree
	 */
	void enterNamedGraphClause(RSPQLParser.NamedGraphClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#namedGraphClause}.
	 * @param ctx the parse tree
	 */
	void exitNamedGraphClause(RSPQLParser.NamedGraphClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#namedWindowClause}.
	 * @param ctx the parse tree
	 */
	void enterNamedWindowClause(RSPQLParser.NamedWindowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#namedWindowClause}.
	 * @param ctx the parse tree
	 */
	void exitNamedWindowClause(RSPQLParser.NamedWindowClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#windowDefinition}.
	 * @param ctx the parse tree
	 */
	void enterWindowDefinition(RSPQLParser.WindowDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#windowDefinition}.
	 * @param ctx the parse tree
	 */
	void exitWindowDefinition(RSPQLParser.WindowDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#physicalWindow}.
	 * @param ctx the parse tree
	 */
	void enterPhysicalWindow(RSPQLParser.PhysicalWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#physicalWindow}.
	 * @param ctx the parse tree
	 */
	void exitPhysicalWindow(RSPQLParser.PhysicalWindowContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#physicalRange}.
	 * @param ctx the parse tree
	 */
	void enterPhysicalRange(RSPQLParser.PhysicalRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#physicalRange}.
	 * @param ctx the parse tree
	 */
	void exitPhysicalRange(RSPQLParser.PhysicalRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#physicalStep}.
	 * @param ctx the parse tree
	 */
	void enterPhysicalStep(RSPQLParser.PhysicalStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#physicalStep}.
	 * @param ctx the parse tree
	 */
	void exitPhysicalStep(RSPQLParser.PhysicalStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#logicalWindow}.
	 * @param ctx the parse tree
	 */
	void enterLogicalWindow(RSPQLParser.LogicalWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#logicalWindow}.
	 * @param ctx the parse tree
	 */
	void exitLogicalWindow(RSPQLParser.LogicalWindowContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#logicalRange}.
	 * @param ctx the parse tree
	 */
	void enterLogicalRange(RSPQLParser.LogicalRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#logicalRange}.
	 * @param ctx the parse tree
	 */
	void exitLogicalRange(RSPQLParser.LogicalRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#logicalStep}.
	 * @param ctx the parse tree
	 */
	void enterLogicalStep(RSPQLParser.LogicalStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#logicalStep}.
	 * @param ctx the parse tree
	 */
	void exitLogicalStep(RSPQLParser.LogicalStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(RSPQLParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(RSPQLParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#duration}.
	 * @param ctx the parse tree
	 */
	void enterDuration(RSPQLParser.DurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#duration}.
	 * @param ctx the parse tree
	 */
	void exitDuration(RSPQLParser.DurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#solutionModifier}.
	 * @param ctx the parse tree
	 */
	void enterSolutionModifier(RSPQLParser.SolutionModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#solutionModifier}.
	 * @param ctx the parse tree
	 */
	void exitSolutionModifier(RSPQLParser.SolutionModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#groupClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupClause(RSPQLParser.GroupClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#groupClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupClause(RSPQLParser.GroupClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#groupCondition}.
	 * @param ctx the parse tree
	 */
	void enterGroupCondition(RSPQLParser.GroupConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#groupCondition}.
	 * @param ctx the parse tree
	 */
	void exitGroupCondition(RSPQLParser.GroupConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(RSPQLParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(RSPQLParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#havingCondition}.
	 * @param ctx the parse tree
	 */
	void enterHavingCondition(RSPQLParser.HavingConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#havingCondition}.
	 * @param ctx the parse tree
	 */
	void exitHavingCondition(RSPQLParser.HavingConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#orderClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderClause(RSPQLParser.OrderClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#orderClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderClause(RSPQLParser.OrderClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#orderCondition}.
	 * @param ctx the parse tree
	 */
	void enterOrderCondition(RSPQLParser.OrderConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#orderCondition}.
	 * @param ctx the parse tree
	 */
	void exitOrderCondition(RSPQLParser.OrderConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#limitOffsetClauses}.
	 * @param ctx the parse tree
	 */
	void enterLimitOffsetClauses(RSPQLParser.LimitOffsetClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#limitOffsetClauses}.
	 * @param ctx the parse tree
	 */
	void exitLimitOffsetClauses(RSPQLParser.LimitOffsetClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(RSPQLParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(RSPQLParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void enterOffsetClause(RSPQLParser.OffsetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void exitOffsetClause(RSPQLParser.OffsetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#groupGraphPattern}.
	 * @param ctx the parse tree
	 */
	void enterGroupGraphPattern(RSPQLParser.GroupGraphPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#groupGraphPattern}.
	 * @param ctx the parse tree
	 */
	void exitGroupGraphPattern(RSPQLParser.GroupGraphPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#graphPatternSub}.
	 * @param ctx the parse tree
	 */
	void enterGraphPatternSub(RSPQLParser.GraphPatternSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#graphPatternSub}.
	 * @param ctx the parse tree
	 */
	void exitGraphPatternSub(RSPQLParser.GraphPatternSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#triplesSameSubject}.
	 * @param ctx the parse tree
	 */
	void enterTriplesSameSubject(RSPQLParser.TriplesSameSubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#triplesSameSubject}.
	 * @param ctx the parse tree
	 */
	void exitTriplesSameSubject(RSPQLParser.TriplesSameSubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#propertyListNotEmpty}.
	 * @param ctx the parse tree
	 */
	void enterPropertyListNotEmpty(RSPQLParser.PropertyListNotEmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#propertyListNotEmpty}.
	 * @param ctx the parse tree
	 */
	void exitPropertyListNotEmpty(RSPQLParser.PropertyListNotEmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(RSPQLParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(RSPQLParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(RSPQLParser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(RSPQLParser.VerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#objectList}.
	 * @param ctx the parse tree
	 */
	void enterObjectList(RSPQLParser.ObjectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#objectList}.
	 * @param ctx the parse tree
	 */
	void exitObjectList(RSPQLParser.ObjectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(RSPQLParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(RSPQLParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#varOrTerm}.
	 * @param ctx the parse tree
	 */
	void enterVarOrTerm(RSPQLParser.VarOrTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#varOrTerm}.
	 * @param ctx the parse tree
	 */
	void exitVarOrTerm(RSPQLParser.VarOrTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterBlankNodePropertyList(RSPQLParser.BlankNodePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitBlankNodePropertyList(RSPQLParser.BlankNodePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#graphPatternNotTriples}.
	 * @param ctx the parse tree
	 */
	void enterGraphPatternNotTriples(RSPQLParser.GraphPatternNotTriplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#graphPatternNotTriples}.
	 * @param ctx the parse tree
	 */
	void exitGraphPatternNotTriples(RSPQLParser.GraphPatternNotTriplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#groupOrUnionGraphPattern}.
	 * @param ctx the parse tree
	 */
	void enterGroupOrUnionGraphPattern(RSPQLParser.GroupOrUnionGraphPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#groupOrUnionGraphPattern}.
	 * @param ctx the parse tree
	 */
	void exitGroupOrUnionGraphPattern(RSPQLParser.GroupOrUnionGraphPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#optionalGraphPattern}.
	 * @param ctx the parse tree
	 */
	void enterOptionalGraphPattern(RSPQLParser.OptionalGraphPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#optionalGraphPattern}.
	 * @param ctx the parse tree
	 */
	void exitOptionalGraphPattern(RSPQLParser.OptionalGraphPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#minusGraphPattern}.
	 * @param ctx the parse tree
	 */
	void enterMinusGraphPattern(RSPQLParser.MinusGraphPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#minusGraphPattern}.
	 * @param ctx the parse tree
	 */
	void exitMinusGraphPattern(RSPQLParser.MinusGraphPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#graphGraphPattern}.
	 * @param ctx the parse tree
	 */
	void enterGraphGraphPattern(RSPQLParser.GraphGraphPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#graphGraphPattern}.
	 * @param ctx the parse tree
	 */
	void exitGraphGraphPattern(RSPQLParser.GraphGraphPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#windowGraphPattern}.
	 * @param ctx the parse tree
	 */
	void enterWindowGraphPattern(RSPQLParser.WindowGraphPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#windowGraphPattern}.
	 * @param ctx the parse tree
	 */
	void exitWindowGraphPattern(RSPQLParser.WindowGraphPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(RSPQLParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(RSPQLParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#bindPattern}.
	 * @param ctx the parse tree
	 */
	void enterBindPattern(RSPQLParser.BindPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#bindPattern}.
	 * @param ctx the parse tree
	 */
	void exitBindPattern(RSPQLParser.BindPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#varOrIri}.
	 * @param ctx the parse tree
	 */
	void enterVarOrIri(RSPQLParser.VarOrIriContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#varOrIri}.
	 * @param ctx the parse tree
	 */
	void exitVarOrIri(RSPQLParser.VarOrIriContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#graphTerm}.
	 * @param ctx the parse tree
	 */
	void enterGraphTerm(RSPQLParser.GraphTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#graphTerm}.
	 * @param ctx the parse tree
	 */
	void exitGraphTerm(RSPQLParser.GraphTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RSPQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RSPQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(RSPQLParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(RSPQLParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#valueLogical}.
	 * @param ctx the parse tree
	 */
	void enterValueLogical(RSPQLParser.ValueLogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#valueLogical}.
	 * @param ctx the parse tree
	 */
	void exitValueLogical(RSPQLParser.ValueLogicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(RSPQLParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(RSPQLParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(RSPQLParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(RSPQLParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#numericExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericExpression(RSPQLParser.NumericExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#numericExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericExpression(RSPQLParser.NumericExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(RSPQLParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(RSPQLParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(RSPQLParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(RSPQLParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(RSPQLParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(RSPQLParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#brackettedExpression}.
	 * @param ctx the parse tree
	 */
	void enterBrackettedExpression(RSPQLParser.BrackettedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#brackettedExpression}.
	 * @param ctx the parse tree
	 */
	void exitBrackettedExpression(RSPQLParser.BrackettedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#builtInCall}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInCall(RSPQLParser.BuiltInCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#builtInCall}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInCall(RSPQLParser.BuiltInCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#rdfliteral}.
	 * @param ctx the parse tree
	 */
	void enterRdfliteral(RSPQLParser.RdfliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#rdfliteral}.
	 * @param ctx the parse tree
	 */
	void exitRdfliteral(RSPQLParser.RdfliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(RSPQLParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(RSPQLParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#numericLiteralUnsigned}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteralUnsigned(RSPQLParser.NumericLiteralUnsignedContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#numericLiteralUnsigned}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteralUnsigned(RSPQLParser.NumericLiteralUnsignedContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#numericLiteralPositive}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteralPositive(RSPQLParser.NumericLiteralPositiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#numericLiteralPositive}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteralPositive(RSPQLParser.NumericLiteralPositiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#numericLiteralNegative}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteralNegative(RSPQLParser.NumericLiteralNegativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#numericLiteralNegative}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteralNegative(RSPQLParser.NumericLiteralNegativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(RSPQLParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(RSPQLParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(RSPQLParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(RSPQLParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void enterAggregate(RSPQLParser.AggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void exitAggregate(RSPQLParser.AggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#unaryBuiltin}.
	 * @param ctx the parse tree
	 */
	void enterUnaryBuiltin(RSPQLParser.UnaryBuiltinContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#unaryBuiltin}.
	 * @param ctx the parse tree
	 */
	void exitUnaryBuiltin(RSPQLParser.UnaryBuiltinContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#binaryBuiltin}.
	 * @param ctx the parse tree
	 */
	void enterBinaryBuiltin(RSPQLParser.BinaryBuiltinContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#binaryBuiltin}.
	 * @param ctx the parse tree
	 */
	void exitBinaryBuiltin(RSPQLParser.BinaryBuiltinContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#ternaryBuiltin}.
	 * @param ctx the parse tree
	 */
	void enterTernaryBuiltin(RSPQLParser.TernaryBuiltinContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#ternaryBuiltin}.
	 * @param ctx the parse tree
	 */
	void exitTernaryBuiltin(RSPQLParser.TernaryBuiltinContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#ternaryOrBinaryBuiltin}.
	 * @param ctx the parse tree
	 */
	void enterTernaryOrBinaryBuiltin(RSPQLParser.TernaryOrBinaryBuiltinContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#ternaryOrBinaryBuiltin}.
	 * @param ctx the parse tree
	 */
	void exitTernaryOrBinaryBuiltin(RSPQLParser.TernaryOrBinaryBuiltinContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#strReplaceExpression}.
	 * @param ctx the parse tree
	 */
	void enterStrReplaceExpression(RSPQLParser.StrReplaceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#strReplaceExpression}.
	 * @param ctx the parse tree
	 */
	void exitStrReplaceExpression(RSPQLParser.StrReplaceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#boundExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoundExpression(RSPQLParser.BoundExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#boundExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoundExpression(RSPQLParser.BoundExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#existsFunc}.
	 * @param ctx the parse tree
	 */
	void enterExistsFunc(RSPQLParser.ExistsFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#existsFunc}.
	 * @param ctx the parse tree
	 */
	void exitExistsFunc(RSPQLParser.ExistsFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(RSPQLParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(RSPQLParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#iri}.
	 * @param ctx the parse tree
	 */
	void enterIri(RSPQLParser.IriContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#iri}.
	 * @param ctx the parse tree
	 */
	void exitIri(RSPQLParser.IriContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#prefixedName}.
	 * @param ctx the parse tree
	 */
	void enterPrefixedName(RSPQLParser.PrefixedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#prefixedName}.
	 * @param ctx the parse tree
	 */
	void exitPrefixedName(RSPQLParser.PrefixedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#blankNode}.
	 * @param ctx the parse tree
	 */
	void enterBlankNode(RSPQLParser.BlankNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#blankNode}.
	 * @param ctx the parse tree
	 */
	void exitBlankNode(RSPQLParser.BlankNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(RSPQLParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(RSPQLParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link RSPQLParser#varname}.
	 * @param ctx the parse tree
	 */
	void enterVarname(RSPQLParser.VarnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RSPQLParser#varname}.
	 * @param ctx the parse tree
	 */
	void exitVarname(RSPQLParser.VarnameContext ctx);
}