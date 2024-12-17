package org.example;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import picocli.CommandLine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract public class SyntaxTree implements BuildInfo {
	protected final Lexer lexer;
	protected final Parser parser;
	protected final ParseTree tree;

	protected final Map<String, Set<String>> macros = new HashMap<>();

	protected <LexerT extends Lexer, ParserT extends Parser> SyntaxTree(Class<LexerT> lexerClass, Class<ParserT> parserClass, String startRule, String filePath) {
		try {
			lexer = lexerClass.getConstructor(CharStream.class).newInstance(CharStreams.fromFileName(filePath));
			parser = parserClass.getConstructor(TokenStream.class).newInstance(new CommonTokenStream(lexer));
			tree = (ParseTree) parserClass.getMethod(startRule).invoke(parser);
		} catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException |
		         IOException e) {
			throw new RuntimeException(e);
		}
		parse();
	}

	abstract protected void parse();

	@Override
	public Map<String, Set<String>> getMacros() {
		return macros;
	}


	private static class Macro {
		@CommandLine.Option(names = "-D", mapFallbackValue = "1")
		public Map<String, String> macros;
	}

	protected void matchMacro(String[] args) {
		Macro macro = new Macro();
		CommandLine commandLine = new CommandLine(macro);
		commandLine.setUnmatchedArgumentsAllowed(true);
		commandLine.parseArgs(args);
		if (macro.macros != null) {
			macro.macros.forEach((macroName, macroValue) -> {
				macros.putIfAbsent(macroName, new HashSet<>());
				macros.get(macroName).add(macroValue);
			});
		}
	}

	protected Map<String, Set<String>> getMacrosNaive() {
		Map<String, Set<String>> macros = new HashMap<>();
		String regex = "-D([^\\s=]+)(=(\\S*))?";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(tree.getText());
		while (matcher.find()) {
			String macroName = matcher.group(1);
			String macroValue = matcher.group(3);
			macros.putIfAbsent(macroName, new HashSet<>());
			macros.get(macroName).add(macroValue == null ? "1" : macroValue);
		}
		return macros;
	}

	public void print() {
		System.out.println(tree.toStringTree(parser));
	}

//	private class Printer implements ParseTreeListener {
//		private final StringBuilder prefix = new StringBuilder();
//
//		public Printer(String filePath) {
//			try (FileWriter out = new FileWriter("syntax_tree.txt")) {
//				print(out, tree, "", true);
//			} catch (IOException e) {
//				throw new RuntimeException(e);
//			}
//		}
//
//		@Override
//		public void visitTerminal(TerminalNode terminalNode) {
//
//		}
//
//		@Override
//		public void visitErrorNode(ErrorNode errorNode) {
//
//		}
//
//		@Override
//		public void enterEveryRule(ParserRuleContext parserRuleContext) {
//			parserRuleContext.toString(parser);
//		}
//
//		@Override
//		public void exitEveryRule(ParserRuleContext parserRuleContext) {
//
//		}
//	}
//
//	public void print() {
//		try (FileWriter out = new FileWriter("syntax_tree.txt")) {
//			print(out, tree, "", true);
//		} catch (IOException e) {
//			throw new RuntimeException(e);
//		}
//	}
//
//	private void print(FileWriter out, ParseTree tree, String prefix, boolean isLast) throws IOException {
//		System.out.println(prefix + (isLast ? "└── " : "├── ") + tree.);
//		for (int i = 0; i < tree.getChildCount(); i++) {
//			print(out, tree.getChild(i), prefix + (isLast ? "    " : "│   "), i + 1 == tree.getChildCount());
//		}
//	}
}
