package org.example.ninja;

import org.example.SyntaxTree;

import java.util.*;


public class Ninja extends SyntaxTree {
	public Ninja() {
		super(NinjaLexer.class, NinjaParser.class, "ninja", "build.ninja");
	}

	public Ninja(String filePath) {
		super(NinjaLexer.class, NinjaParser.class, "ninja", filePath);
	}

	private class Visitor extends NinjaBaseVisitor<Void> {
		private final ArrayList<String> args = new ArrayList<>();

		@Override
		public Void visitAssign_value_lines(NinjaParser.Assign_value_linesContext ctx) {
			args.clear();
			visitChildren(ctx);
			matchMacro(args.toArray(new String[0]));
			return null;
		}

		@Override
		public Void visitValue(NinjaParser.ValueContext ctx) {
			args.add(ctx.getText());
			return null;
		}
	}

	@Override
	protected void parse() {
		tree.accept(new Visitor());
	}
}