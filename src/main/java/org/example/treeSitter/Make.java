//package org.example.treeSitter;
//
//import org.example.BuildInfo;
//import org.example.SyntaxTree;
//import org.treesitter.*;
//import picocli.CommandLine;
//
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.Set;
//
//public class Make extends SyntaxTree implements BuildInfo {
//	private static final TreeSitterMake make = new TreeSitterMake();
//
//	public Make() {
//		super(make, "Makefile");
//	}
//
//	public Make(String filename) {
//		super(make, filename);
//	}
//
//	@CommandLine.Command
//	private static class Macro {
//		@CommandLine.Option(names = "-D", mapFallbackValue = "1")
//		public Map<String, String> macros;
//	}
//
//	@Override
//	public Map<String, Set<String>> getMacros() {
//		Map<String, Set<String>> macros = new HashMap<>();
//
////		TSQuery errorQuery = new TSQuery(make, "(ERROR) @error");
////		TSQueryCursor errorCursor = new TSQueryCursor();
////		errorCursor.exec(errorQuery, tree.getRootNode());
////		if (errorCursor.getMatches().hasNext()) {
////			return super.getMacros();
////		}
//
//		Macro macro = new Macro();
//		CommandLine commandLine = new CommandLine(macro);
//		commandLine.setUnmatchedArgumentsAllowed(true);
//
//		TSQuery query = new TSQuery(make, "(text) @text (shell_text) @shell_text");
//		TSQueryCursor cursor = new TSQueryCursor();
//		cursor.exec(query, tree.getRootNode());
//		for (TSQueryCursor.TSMatchIterator matches = cursor.getCaptures(); matches.hasNext(); ) {
//			TSQueryMatch match = matches.next();
//			TSNode node = match.getCaptures()[match.getCaptureIndex()].getNode();
//			commandLine.parseArgs(getNodeText(node).split(" "));
//			if (macro.macros != null) {
//				macro.macros.forEach((macroName, macroValue) -> {
//					macros.putIfAbsent(macroName, new HashSet<>());
//					macros.get(macroName).add(macroValue);
//				});
//			}
//		}
//
//		return macros;
//	}
//}
