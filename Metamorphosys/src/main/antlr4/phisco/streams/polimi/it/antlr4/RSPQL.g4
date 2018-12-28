// Generate grammar files using the command:
// $ antlr4 -visitor RSPQL.g4 -package it.polimi.yasper.core.querying.syntax
grammar RSPQL;


// root 
queryUnit :  query ; 
// query structure
query :  prologue registerClause? (  selectQuery |  constructQuery |  describeQuery |  askQuery ) ';' ;
// prologue
prologue : (  baseDecl |  prefixDecl )* ;
baseDecl : 'BASE' IRIREF ; 
prefixDecl : 'PREFIX' PNAME_NS IRIREF ;
// types of query
// register
registerClause : 'REGISTER' streamType=('ISTREAM' | 'RSTREAM' | 'DSTREAM' ) outputStream=iri 'AS' ;
// select
selectQuery :  selectClause  datasetClause*  whereClause  solutionModifier? ;
selectClause : 'SELECT'  selectModifier? ( ( resultVar )+ | STAR ) ;
selectModifier: DISTINCT | REDUCED;
resultVar :  var | ( '('  expression 'AS'  var')' ) ;
// construct
constructQuery : 'CONSTRUCT' '{' triplesSameSubject '.'?  '}' datasetClause*  whereClause  solutionModifier; 
// describe 
describeQuery : 'DESCRIBE' (  varOrIri+ | STAR )  datasetClause*  whereClause?  solutionModifier ;
// ask
askQuery : 'ASK'  datasetClause+  whereClause  solutionModifier ; 
// dataset declaration
datasetClause : 'FROM' (  anonymousGraph=iri |  namedGraphClause | namedWindowClause ) ;
namedGraphClause : 'NAMED'  graphIRI=iri ;
namedWindowClause : 'NAMED' 'WINDOW' windowIRI=iri 'ON' streamIRI=iri '[' windowDefinition ']' ;
// window
windowDefinition : physicalWindow | logicalWindow ;
physicalWindow :  physicalRange physicalStep? ;
physicalRange : 'ELEMENTS' INTEGER ;
physicalStep : 'STEP' INTEGER ;
logicalWindow : logicalRange logicalStep? ;
logicalRange : 'RANGE' DURATION ;
logicalStep : 'STEP' DURATION ;
whereClause : 'WHERE'  groupGraphPattern ;
DURATION : 'P' ( INTEGER 'Y' )? ( INTEGER 'M' )? ( INTEGER 'D' )? 'T' ( INTEGER 'H' )? ( mins=INTEGER 'M' )? ( INTEGER ( '.' INTEGER )? 'S' )? ;

// solution modifiers 
solutionModifier :  groupClause?  havingClause?  orderClause?  limitOffsetClauses? ; 
groupClause : 'GROUP' 'BY'  groupCondition+ ; 
groupCondition :  builtInCall  | '('  expression ( 'AS'  var)? ')' |  var;
havingClause : 'HAVING'  havingCondition+ ; 
havingCondition :  constraint ; 
orderClause : 'ORDER' 'BY'  orderCondition+ ; 
orderCondition : ( ( 'ASC' | 'DESC' )  brackettedExpression ) | (  constraint |  var) ;
limitOffsetClauses :  limitClause  offsetClause? |  offsetClause  limitClause? ; 
limitClause : 'LIMIT' INTEGER ; 
offsetClause : 'OFFSET' INTEGER ; 

// BGPs no paths allowed
groupGraphPattern : '{'  ( graphPatternSub )+ '}' ;
graphPatternSub : ( triplesSameSubject '.'? | graphPatternNotTriples );

triplesSameSubject :  triplesSameSubjectNoBlankNode | triplesSameSubjectBlankNode ;
triplesSameSubjectNoBlankNode: varOrTerm  propertyListNotEmpty;
triplesSameSubjectBlankNode: blankNodePropertyList  propertyListNotEmpty?;
propertyListNotEmpty :  property ( ';' (  property )? )* ;
property :  verb  objectList ;
verb :  varOrIri | TYPE ;
objectList :  object ( ','  object )* ; 
object :  varOrTerm | blankNodePropertyList ; 
varOrTerm :  var |  graphTerm ;
blankNodePropertyList : '['  propertyListNotEmpty ']' ; 

graphPatternNotTriples :  groupOrUnionGraphPattern 
												|  optionalGraphPattern 
												|  minusGraphPattern 
												|  graphGraphPattern 
												|  windowGraphPattern 
												|  filter 
												|  bindPattern;
groupOrUnionGraphPattern :  groupGraphPattern ( 'UNION'  groupGraphPattern )+ ; 
optionalGraphPattern : 'OPTIONAL'  groupGraphPattern ; 
minusGraphPattern : 'MINUS'  groupGraphPattern ;
graphGraphPattern : 'GRAPH'  varOrIri  groupGraphPattern ;
windowGraphPattern : 'WINDOW'  varOrIri  '{' (triplesSameSubject '.'?)+ '}';
filter : 'FILTER'  constraint ;
bindPattern : 'BIND' '('  expression 'AS'  var')' ;

varOrIri :  var | iri ;
graphTerm : iri |  rdfliteral |  numericLiteral |  blankNode | NIL |  BOOL ;
expression : conditionalAndExpression ( '||'  conditionalAndExpression )* ; 
conditionalAndExpression :  valueLogical ( '&&'  valueLogical )* ; 
valueLogical :  relationalExpression ; 
relationalExpression :  numericExpression ( BINARY_OPERATOR numericExpression | NOT? 'IN' expressionList )? ;
expressionList : '('  expression ( ','  expression )* ')' ; 
numericExpression : multiplicativeExpression ( op=('+' | '-' ) multiplicativeExpression )* ;
multiplicativeExpression :  unaryExpression ( op=('*'|'/')  unaryExpression )* ;
unaryExpression : op=('!' | '+' | '-')?  primaryExpression ;

primaryExpression :  brackettedExpression 
									|  builtInCall 
									|  rdfliteral 
									|  numericLiteral 
									|  BOOL
									|  var;

brackettedExpression : '('  expression ')' ; 
builtInCall : aggregate
					| unaryBuiltin
					| binaryBuiltin
					| ternaryBuiltin
					| ternaryOrBinaryBuiltin
					| strReplaceExpression
					| boundExpression
					| NOT? existsFunc;
rdfliteral :  string ( LANGTAG | ( '^^' iri ) )? ; 
numericLiteral :  numericLiteralUnsigned |  numericLiteralPositive |  numericLiteralNegative ; 
numericLiteralUnsigned : INTEGER | DECIMAL | DOUBLE ; 
numericLiteralPositive : INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE ; 
numericLiteralNegative : INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE ; 

argList : NIL | '(' DISTINCT?  expression ( ','  expression )* ')' ;
constraint :  brackettedExpression |  builtInCall ;

aggregate : f='COUNT' '(' DISTINCT? ( '*' |  expression ) ')'
    | f=( 'SUM'| 'MIN' | 'MAX' | 'AVG' | 'SAMPLE' ) '(' DISTINCT?  expression ')'
    | f='GROUP_CONCAT' '(' DISTINCT?  expression ( ';' 'SEPARATOR' '='  string )? ')' ;
unaryBuiltin : f=( 'STR' | 'LANG' | 'DATATYPE'  | 'IRI' | 'URI' 
				| 'ABS' | 'CEIL' | 'FLOOR' | 'ROUND' | 'UCASE' 
				| 'LCASE' | 'YEAR'  | 'MONTH' | 'DAY'  | 'HOURS' 
				| 'MINUTES' | 'SECONDS'  | 'TIMEZONE' | 'TZ' 
				| 'MD5' | 'SHA1' | 'SHA256' | 'SHA384' | 'SHA512' 
				| 'ISIRI' | 'ISURI' | 'ISBLANK' | 'ISLITERAL' 
				| 'ISNUMERIC' | 'STRLEN' | 'ENCODE_FOR_URI' ) '('  expression ')'
				| f='BNODE' ( '('  expression ')' | NIL )
				| f=('NOW' | 'UUID' | 'STRUUID' | 'RAND') NIL;
binaryBuiltin : f=( 'CONTAINS'	| 'STRSTARTS'	| 'STRENDS'	
			| 'STRBEFORE'	| 'STRAFTER'	| 'STRLANG'	
			| 'STRDT'	| 'SAMETERM' | 'LANGMATCHES') '('  expression ','  expression ')';
ternaryBuiltin: 'IF' '(' expression ',' expression ',' expression ')' ;
ternaryOrBinaryBuiltin : f=('REGEX' |'SUBSTR') '('  expression ','  expression ( ','  expression )? ')' ; 
strReplaceExpression : 'REPLACE' '('  expression ','  expression ','  expression ( ','  expression )? ')' ; 
boundExpression : 'BOUND' '(' var')';
existsFunc : 'EXISTS'  groupGraphPattern ; 

string : STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 ;
iri : IRIREF |  prefixedName ; 
prefixedName : PNAME_LN | PNAME_NS ; 
blankNode : BLANK_NODE_LABEL | ANON ;
var : ('?'|'$') varname ;
varname : VARNAME | VAR_SINGLE_CHAR ;
VAR_SINGLE_CHAR : [a-zA-Z];

//  Terminals
NOT : 'NOT';
DISTINCT : 'DISTINCT' ;
REDUCED : 'REDUCED' ;
BOOL : 'TRUE' | 'FALSE' ;
STAR : '*' ;
UNDEF : 'UNDEF' ;
TYPE : 'A' | 'a' ;
COMMENT : '#' ( ~( '\r' | '\n' ) )* -> skip;
IRIREF  : '<' ~( '<' | '>' | '"' | '{' | '}' | '|' | '^' | '`' )* '>' ;
PNAME_NS : PN_PREFIX? ':' ;
PNAME_LN : PNAME_NS PN_LOCAL ;
BLANK_NODE_LABEL : '_:' ( PN_CHARS_U | '0'..'9' ) ((PN_CHARS|'.')* PN_CHARS)? ;
LANGTAG : '@' ( 'a'..'z' | 'A'..'Z' )+ ('-' ( 'a'..'z' | 'A'..'Z' | '0'..'9')+ )* ;
INTEGER : '0'..'9'+ ;
DECIMAL : '0'..'9'* '.' '0'..'9'+ ;
DOUBLE : '0'..'9'+ '.' '0'..'9'* EXPONENT | '.' ('0'..'9')+ EXPONENT | ('0'..'9')+ EXPONENT ;
INTEGER_POSITIVE : '+' INTEGER ;
DECIMAL_POSITIVE : '+' DECIMAL ;
DOUBLE_POSITIVE : '+' DOUBLE ;
INTEGER_NEGATIVE : '-' INTEGER ;
DECIMAL_NEGATIVE : '-' DECIMAL ;
DOUBLE_NEGATIVE : '-' DOUBLE ;
EXPONENT : ( 'e' | 'E' ) ( '+' | '-' )? '0'..'9'+ ;
STRING_LITERAL1 : '\'' ( ~( '\'' ) | ECHAR )* '\'' ; 
STRING_LITERAL2 : '"' ( ~( '"' ) | ECHAR )*? '"' ;
STRING_LITERAL_LONG1 : '\'\'\'' ( ( '\'' | '\'\'' )? ( ~('\'' | '\\' ) | ECHAR ) )* '\'\'\'' ;
STRING_LITERAL_LONG2 : '"""' ( ( '"' | '""' )? ( ~( '"' | '\\' ) | ECHAR ) )* '"""' ;
BINARY_OPERATOR : '=' | '!=' | '<' | '>' | '<=' | '>=' ;
ECHAR : '\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '"' | '\'') ;
NIL : '(' WS* ')' ;
WS : ( ' ' | '\t' | '\n' | 'r' ) -> skip ;
ANON : '[' WS* ']' ;
PN_CHARS_BASE : ( 'A'..'Z' | 'a'..'z' | '\u00C0'..'\u00D6' | '\u00D8'..'\u00F6' | '\u00F8'..'\u02FF' | '\u0370'..'\u037D' | '\u037F'..'\u1FFF' | '\u200C'..'\u200D' | '\u2070'..'\u218F' | '\u2C00'..'\u2FEF' | '\u3001'..'\uD7FF' | '\uF900'..'\uFDCF' | '\uFDF0'..'\uFFFD' ) ; // multi-character literals are not allowed in lexer sets
PN_CHARS_U : PN_CHARS_BASE | '_' ;
VARNAME : ( PN_CHARS_U | '0'..'9' ) ( PN_CHARS_U | '0'..'9' | '\u00B7' | '\u0300'..'\u036F' | '\u203F'..'\u2040' )* ;
PN_CHARS : PN_CHARS_U | '-' | '0'..'9' | '\u00B7' | '\u0300'..'\u036F' | '\u203F'..'\u2040' ;
PN_PREFIX : PN_CHARS_BASE ((PN_CHARS|'.')* PN_CHARS)? ;
PN_LOCAL : (PN_CHARS_U | ':' | '0'..'9' | PLX ) ((PN_CHARS | '.' | ':' | PLX)* (PN_CHARS | ':' | PLX) )? ;
PLX : PERCENT | PN_LOCAL_ESC ;
PERCENT : '%' HEX HEX ;
HEX : '0'..'9' | 'A'..'F' | 'a'..'f' ;
PN_LOCAL_ESC : '\\' ( '_' | '~' | '.' | '-' | '!' | '$' | '&' | '\'' | '(' | ')' | '*' | '+' | ',' | ';' | '=' | '/' | '?' | '#' | '@' | '%' ) ;
ANYCHAR : . ;
