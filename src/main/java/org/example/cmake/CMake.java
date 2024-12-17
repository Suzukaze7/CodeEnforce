package org.example.cmake;

import org.example.SyntaxTree;

import java.util.ArrayList;

public class CMake extends SyntaxTree {
	public CMake() {
		super(CMakeLexer.class, CMakeParser.class, "cmake", "CMakeLists.txt");
	}

	public CMake(String filePath) {
		super(CMakeLexer.class, CMakeParser.class, "cmake", filePath);
	}

	private class Visitor extends CMakeBaseVisitor<Void> {
		private final ArrayList<String> args = new ArrayList<>();

		@Override
		public Void visitStatement(CMakeParser.StatementContext ctx) {
			args.clear();
			visitChildren(ctx);
			System.out.println(args);
			matchMacro(args.toArray(new String[0]));
			return null;
		}

		@Override
		public Void visitSimple_value(CMakeParser.Simple_valueContext ctx) {
			args.add(ctx.getText());
			return null;
		}
	}

	@Override
	protected void parse() {
		tree.accept(new Visitor());
	}
}