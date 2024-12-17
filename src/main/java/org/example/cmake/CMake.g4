grammar CMake;

@header {
package org.example.cmake;
}

cmake: statement* EOF;

statement: IDENTIFY '(' values ')';

values: unsquare_value* ;
unsquare_value: value | square_value;
square_value: '(' values ')';

value: string | simple_value;
string: '"' string_value* '"';
string_value: (simple_value | '(' | ')' )+;

simple_value: (IDENTIFY | VALUE | escape | '$' | '{' | '}')+;

escape: deref | slash_escape;
deref: '${' IDENTIFY '}';
slash_escape: SLASH_ESCAPE;

SLASH_ESCAPE: '\\' .;
IDENTIFY: [a-zA-Z_]+;
VALUE: ~[ \t\r\n"()$#{}\\]+;

Comment: '#' ~[\r\n]* -> skip;
WS: [ \t] -> skip;
NL: ('\r\n' | '\n' | '\r') -> skip;