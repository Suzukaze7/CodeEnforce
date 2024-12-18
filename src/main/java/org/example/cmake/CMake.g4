grammar CMake;

@header {
package org.example.cmake;
}

cmake: (statement | ws)* EOF;

statement: Identifier ws? '(' arguments? ')';

arguments: ws? argument (ws argument)* ws?;
argument: unquoted_argument | quoted_argument | squared_argument;
squared_argument: '(' arguments ')';

quoted_argument: '"' (ws? quoted_value (ws quoted_value)* ws?)? '"';
quoted_value: ~(NL | WS | '"')+;
unquoted_argument: (deref | Escape | unquoted_argument_part)+;
unquoted_argument_part: (Value | Identifier | '$' | '{' | '}')+;

deref: '$' '{' Identifier '}';
ws: (WS | NL)+;

Escape: '\\' .;
Identifier: [a-zA-Z_]+;
Value: ~[ \t\r\n"${}()#\\]+;

Comment: '#' ~[\r\n]* -> channel(HIDDEN);
WS: [ \t];
NL: ('\r\n' | '\n' | '\r');