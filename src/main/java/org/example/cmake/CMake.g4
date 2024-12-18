grammar CMake;

@header {
package org.example.cmake;
}

cmake: statement* EOF;

statement: Identifier '(' arguments? ')';

arguments: argument+;
argument: unquoted_argument | quoted_argument | compound_argument;
compound_argument: '(' arguments ')';

quoted_argument: '"' quoted_value* '"';
quoted_value: ~'"'+;
unquoted_argument: (Value | Identifier)+;

fragment Escape: '\\' .;
Identifier: [a-zA-Z_]+;
Value: (~[ \t\r\n"()#\\] | Escape)+;

Comment: '#' ~[\r\n]* -> channel(HIDDEN);
WS: [ \t] -> skip;
NL: ('\r\n' | '\n' | '\r') -> skip;