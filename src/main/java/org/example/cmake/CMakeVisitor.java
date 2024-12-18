// Generated from src/main/java/org/example/cmake/CMake.g4 by ANTLR 4.13.2

package org.example.cmake;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CMakeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CMakeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CMakeParser#cmake}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmake(CMakeParser.CmakeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMakeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CMakeParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMakeParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(CMakeParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMakeParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(CMakeParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMakeParser#compound_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_argument(CMakeParser.Compound_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMakeParser#quoted_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuoted_argument(CMakeParser.Quoted_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMakeParser#quoted_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuoted_value(CMakeParser.Quoted_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMakeParser#unquoted_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquoted_argument(CMakeParser.Unquoted_argumentContext ctx);
}