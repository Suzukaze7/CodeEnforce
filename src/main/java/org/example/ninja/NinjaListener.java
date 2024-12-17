// Generated from src/main/java/org/example/ninja/Ninja.g4 by ANTLR 4.13.2

package org.example.ninja;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NinjaParser}.
 */
public interface NinjaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NinjaParser#ninja}.
	 * @param ctx the parse tree
	 */
	void enterNinja(NinjaParser.NinjaContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#ninja}.
	 * @param ctx the parse tree
	 */
	void exitNinja(NinjaParser.NinjaContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(NinjaParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(NinjaParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(NinjaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(NinjaParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(NinjaParser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(NinjaParser.RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#rule_name}.
	 * @param ctx the parse tree
	 */
	void enterRule_name(NinjaParser.Rule_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#rule_name}.
	 * @param ctx the parse tree
	 */
	void exitRule_name(NinjaParser.Rule_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#pool}.
	 * @param ctx the parse tree
	 */
	void enterPool(NinjaParser.PoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#pool}.
	 * @param ctx the parse tree
	 */
	void exitPool(NinjaParser.PoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#pool_name}.
	 * @param ctx the parse tree
	 */
	void enterPool_name(NinjaParser.Pool_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#pool_name}.
	 * @param ctx the parse tree
	 */
	void exitPool_name(NinjaParser.Pool_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#build}.
	 * @param ctx the parse tree
	 */
	void enterBuild(NinjaParser.BuildContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#build}.
	 * @param ctx the parse tree
	 */
	void exitBuild(NinjaParser.BuildContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(NinjaParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(NinjaParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#depdency}.
	 * @param ctx the parse tree
	 */
	void enterDepdency(NinjaParser.DepdencyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#depdency}.
	 * @param ctx the parse tree
	 */
	void exitDepdency(NinjaParser.DepdencyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#build_values}.
	 * @param ctx the parse tree
	 */
	void enterBuild_values(NinjaParser.Build_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#build_values}.
	 * @param ctx the parse tree
	 */
	void exitBuild_values(NinjaParser.Build_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#build_value}.
	 * @param ctx the parse tree
	 */
	void enterBuild_value(NinjaParser.Build_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#build_value}.
	 * @param ctx the parse tree
	 */
	void exitBuild_value(NinjaParser.Build_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#build_rule}.
	 * @param ctx the parse tree
	 */
	void enterBuild_rule(NinjaParser.Build_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#build_rule}.
	 * @param ctx the parse tree
	 */
	void exitBuild_rule(NinjaParser.Build_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(NinjaParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(NinjaParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#scope_line}.
	 * @param ctx the parse tree
	 */
	void enterScope_line(NinjaParser.Scope_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#scope_line}.
	 * @param ctx the parse tree
	 */
	void exitScope_line(NinjaParser.Scope_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#scope_assign}.
	 * @param ctx the parse tree
	 */
	void enterScope_assign(NinjaParser.Scope_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#scope_assign}.
	 * @param ctx the parse tree
	 */
	void exitScope_assign(NinjaParser.Scope_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#scope_variable}.
	 * @param ctx the parse tree
	 */
	void enterScope_variable(NinjaParser.Scope_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#scope_variable}.
	 * @param ctx the parse tree
	 */
	void exitScope_variable(NinjaParser.Scope_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(NinjaParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(NinjaParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(NinjaParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(NinjaParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#submodule}.
	 * @param ctx the parse tree
	 */
	void enterSubmodule(NinjaParser.SubmoduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#submodule}.
	 * @param ctx the parse tree
	 */
	void exitSubmodule(NinjaParser.SubmoduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(NinjaParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(NinjaParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#default}.
	 * @param ctx the parse tree
	 */
	void enterDefault(NinjaParser.DefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#default}.
	 * @param ctx the parse tree
	 */
	void exitDefault(NinjaParser.DefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#assign_value_lines}.
	 * @param ctx the parse tree
	 */
	void enterAssign_value_lines(NinjaParser.Assign_value_linesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#assign_value_lines}.
	 * @param ctx the parse tree
	 */
	void exitAssign_value_lines(NinjaParser.Assign_value_linesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#assign_value_line}.
	 * @param ctx the parse tree
	 */
	void enterAssign_value_line(NinjaParser.Assign_value_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#assign_value_line}.
	 * @param ctx the parse tree
	 */
	void exitAssign_value_line(NinjaParser.Assign_value_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#assign_values}.
	 * @param ctx the parse tree
	 */
	void enterAssign_values(NinjaParser.Assign_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#assign_values}.
	 * @param ctx the parse tree
	 */
	void exitAssign_values(NinjaParser.Assign_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(NinjaParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(NinjaParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(NinjaParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(NinjaParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#escape}.
	 * @param ctx the parse tree
	 */
	void enterEscape(NinjaParser.EscapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#escape}.
	 * @param ctx the parse tree
	 */
	void exitEscape(NinjaParser.EscapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#escape_nl}.
	 * @param ctx the parse tree
	 */
	void enterEscape_nl(NinjaParser.Escape_nlContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#escape_nl}.
	 * @param ctx the parse tree
	 */
	void exitEscape_nl(NinjaParser.Escape_nlContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#identify}.
	 * @param ctx the parse tree
	 */
	void enterIdentify(NinjaParser.IdentifyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#identify}.
	 * @param ctx the parse tree
	 */
	void exitIdentify(NinjaParser.IdentifyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(NinjaParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(NinjaParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link NinjaParser#ws}.
	 * @param ctx the parse tree
	 */
	void enterWs(NinjaParser.WsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NinjaParser#ws}.
	 * @param ctx the parse tree
	 */
	void exitWs(NinjaParser.WsContext ctx);
}