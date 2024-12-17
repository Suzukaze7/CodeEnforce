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
	 * Visit a parse tree produced by {@link CMakeParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(CMakeParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMakeParser#unsquare_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsquare_value(CMakeParser.Unsquare_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMakeParser#square_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquare_value(CMakeParser.Square_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMakeParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(CMakeParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMakeParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(CMakeParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMakeParser#string_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_value(CMakeParser.String_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMakeParser#simple_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_value(CMakeParser.Simple_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMakeParser#escape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscape(CMakeParser.EscapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMakeParser#deref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeref(CMakeParser.DerefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMakeParser#slash_escape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlash_escape(CMakeParser.Slash_escapeContext ctx);
}