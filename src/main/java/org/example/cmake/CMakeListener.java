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
	 * Enter a parse tree produced by {@link CMakeParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(CMakeParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMakeParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(CMakeParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMakeParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(CMakeParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMakeParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(CMakeParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMakeParser#squared_argument}.
	 * @param ctx the parse tree
	 */
	void enterSquared_argument(CMakeParser.Squared_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMakeParser#squared_argument}.
	 * @param ctx the parse tree
	 */
	void exitSquared_argument(CMakeParser.Squared_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMakeParser#quoted_argument}.
	 * @param ctx the parse tree
	 */
	void enterQuoted_argument(CMakeParser.Quoted_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMakeParser#quoted_argument}.
	 * @param ctx the parse tree
	 */
	void exitQuoted_argument(CMakeParser.Quoted_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMakeParser#quoted_value}.
	 * @param ctx the parse tree
	 */
	void enterQuoted_value(CMakeParser.Quoted_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMakeParser#quoted_value}.
	 * @param ctx the parse tree
	 */
	void exitQuoted_value(CMakeParser.Quoted_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMakeParser#unquoted_argument}.
	 * @param ctx the parse tree
	 */
	void enterUnquoted_argument(CMakeParser.Unquoted_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMakeParser#unquoted_argument}.
	 * @param ctx the parse tree
	 */
	void exitUnquoted_argument(CMakeParser.Unquoted_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMakeParser#unquoted_argument_part}.
	 * @param ctx the parse tree
	 */
	void enterUnquoted_argument_part(CMakeParser.Unquoted_argument_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMakeParser#unquoted_argument_part}.
	 * @param ctx the parse tree
	 */
	void exitUnquoted_argument_part(CMakeParser.Unquoted_argument_partContext ctx);
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
	 * Enter a parse tree produced by {@link CMakeParser#ws}.
	 * @param ctx the parse tree
	 */
	void enterWs(CMakeParser.WsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMakeParser#ws}.
	 * @param ctx the parse tree
	 */
	void exitWs(CMakeParser.WsContext ctx);
}