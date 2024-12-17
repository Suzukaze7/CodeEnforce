grammar Ninja;

/**
not support:
- Dynamic Dependencies
*/

@header {
package org.example.ninja;
}

ninja: (assign | rule | pool | build | comment | include | submodule | default | NL)* EOF;

assign: variable ws? '=' assign_value_lines;
variable: identify;

rule: 'rule' ws rule_name scope?;
rule_name: identify;

pool: 'pool' ws pool_name scope?;
pool_name: identify;

build: 'build' ws target ws? ':' ws? build_rule (ws depdency)? ws? scope?;
target: build_values;
depdency: build_values;
build_values: build_value (ws build_value)*;
build_value: (identify | VALUE | escape)+;
build_rule: identify;

scope: (NL scope_line)+;
scope_line: ws scope_assign; //加上 ? 就可以 indent 中有空行，但是似乎会有歧义
scope_assign: scope_variable ws? '=' assign_value_lines;
scope_variable: identify | keyword;

comment: '#' ~NL*; // ?原理

include: 'include' ws file;
submodule: 'submodule' ws file;

file: value;

default: 'default' (ws identify)+ ws?;

assign_value_lines: (assign_value_line escape_nl)* assign_value_line;
assign_value_line: ws? assign_values;
assign_values: values ws?;

values: value (ws value)*;
value: (identify | VALUE | escape | ':' | keyword)+;

escape: '$' ('$' | ':' | ws) |
		'$' SIMPLE_IDENTIFY |
		'${' identify '}';
escape_nl: '$' NL;
identify: SIMPLE_IDENTIFY | IDENTIFY;
keyword: 'rule'| 'build' | 'pool' |  'include' | 'submodule' | 'default';
ws: WS;

SIMPLE_IDENTIFY: [a-zA-Z0-9_-]+;
IDENTIFY: [a-zA-Z0-9_.-]+;
VALUE: ~[ \t\r\n#$:={}]+;
WS: [ \t]+;
NL: '\n' | '\r\n';