// Generated from src/main/java/org/example/ninja/Ninja.g4 by ANTLR 4.13.2

package org.example.ninja;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NinjaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NinjaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NinjaParser#ninja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNinja(NinjaParser.NinjaContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(NinjaParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(NinjaParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule(NinjaParser.RuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#rule_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_name(NinjaParser.Rule_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#pool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPool(NinjaParser.PoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#pool_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPool_name(NinjaParser.Pool_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#build}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild(NinjaParser.BuildContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(NinjaParser.TargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#depdency}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDepdency(NinjaParser.DepdencyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#build_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild_values(NinjaParser.Build_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#build_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild_value(NinjaParser.Build_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#build_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild_rule(NinjaParser.Build_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope(NinjaParser.ScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#scope_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope_line(NinjaParser.Scope_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#scope_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope_assign(NinjaParser.Scope_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#scope_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope_variable(NinjaParser.Scope_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(NinjaParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(NinjaParser.IncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#submodule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubmodule(NinjaParser.SubmoduleContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(NinjaParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault(NinjaParser.DefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#assign_value_lines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_value_lines(NinjaParser.Assign_value_linesContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#assign_value_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_value_line(NinjaParser.Assign_value_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#assign_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_values(NinjaParser.Assign_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(NinjaParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(NinjaParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#escape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscape(NinjaParser.EscapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#escape_nl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscape_nl(NinjaParser.Escape_nlContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#identify}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentify(NinjaParser.IdentifyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(NinjaParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link NinjaParser#ws}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWs(NinjaParser.WsContext ctx);
}