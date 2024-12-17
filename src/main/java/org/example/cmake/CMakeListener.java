// Generated from src/main/java/org/example/cmake/CMake.g4 by ANTLR 4.13.2

package org.example.cmake;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CMakeParser}.
 */
public interface CMakeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CMakeParser#cmake}.
	 * @param ctx the parse tree
	 */
	void enterCmake(CMakeParser.CmakeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMakeParser#cmake}.
	 * @param ctx the parse tree
	 */
	void exitCmake(CMakeParser.CmakeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMakeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CMakeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMakeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CMakeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMakeParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(CMakeParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMakeParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(CMakeParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMakeParser#unsquare_value}.
	 * @param ctx the parse tree
	 */
	void enterUnsquare_value(CMakeParser.Unsquare_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMakeParser#unsquare_value}.
	 * @param ctx the parse tree
	 */
	void exitUnsquare_value(CMakeParser.Unsquare_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMakeParser#square_value}.
	 * @param ctx the parse tree
	 */
	void enterSquare_value(CMakeParser.Square_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMakeParser#square_value}.
	 * @param ctx the parse tree
	 */
	void exitSquare_value(CMakeParser.Square_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMakeParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CMakeParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMakeParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CMakeParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMakeParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(CMakeParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMakeParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(CMakeParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMakeParser#string_value}.
	 * @param ctx the parse tree
	 */
	void enterString_value(CMakeParser.String_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMakeParser#string_value}.
	 * @param ctx the parse tree
	 */
	void exitString_value(CMakeParser.String_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMakeParser#simple_value}.
	 * @param ctx the parse tree
	 */
	void enterSimple_value(CMakeParser.Simple_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMakeParser#simple_value}.
	 * @param ctx the parse tree
	 */
	void exitSimple_value(CMakeParser.Simple_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMakeParser#escape}.
	 * @param ctx the parse tree
	 */
	void enterEscape(CMakeParser.EscapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMakeParser#escape}.
	 * @param ctx the parse tree
	 */
	void exitEscape(CMakeParser.EscapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMakeParser#deref}.
	 * @param ctx the parse tree
	 */
	void enterDeref(CMakeParser.DerefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMakeParser#deref}.
	 * @param ctx the parse tree
	 */
	void exitDeref(CMakeParser.DerefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMakeParser#slash_escape}.
	 * @param ctx the parse tree
	 */
	void enterSlash_escape(CMakeParser.Slash_escapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMakeParser#slash_escape}.
	 * @param ctx the parse tree
	 */
	void exitSlash_escape(CMakeParser.Slash_escapeContext ctx);
}