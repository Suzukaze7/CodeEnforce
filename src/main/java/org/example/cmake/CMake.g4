grammar CMake;

@header {
package org.example.cmake;
}

cmake: (statement | ws)* EOF;

statement: IDENTIFY ws? '(' values? ')';

values: ws? unsquare_value (ws unsquare_value)* ws?;
unsquare_value: value | square_value;
square_value: '(' values ')';

value: string | simple_value;
string: '"' ws? string_value (ws string_value)* ws? '"';
string_value: ~(NL | WS | '"')+;

simple_value: (IDENTIFY | VALUE | escape | '$' | '{' | '}')+;

escape: deref | slash_escape;
deref: '${' IDENTIFY '}';
slash_escape: SLASH_ESCAPE;

SLASH_ESCAPE: '\\' .;
IDENTIFY: [a-zA-Z_]+;
VALUE: ~[ \t\r\n"()$#{}\\]+;

ws: (WS | NL)+;

Comment: '#' ~[\r\n]* -> channel(HIDDEN);
WS: [ \t];
NL: ('\r\n' | '\n' | '\r');