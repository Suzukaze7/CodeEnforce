lexer grammar CMakeLexer;


LEFT_QUOTE: '"' -> pushMode(STRING);

SLASH_ESCAPE: '\\' .;
IDENTIFY: [a-zA-Z_]+;
VALUE: ~[ \t\r\n"()$#{}\\]+;
NL: ('\r\n' | '\n');

WS: [ \t] -> skip;

mode STRING;

STRING_VALUE: ~[ \t\r\n]+;