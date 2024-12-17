//package org.example.treeSitter;
//
//import org.example.BuildInfo;
//import org.treesitter.*;
//import picocli.CommandLine;
//
//import java.util.*;
//
//public class CMake extends SyntaxTree implements BuildInfo {
//	enum Symbol {
//		argument_list(64), argument(55), unquoted_argument(61), quoted_argument(58), quoted_element(59);
//
//		public final int id;
//
//		Symbol(int id) {
//			this.id = id;
//		}
//	}
//
//	private static final TreeSitterCmake cmake = new TreeSitterCmake();
//
//	public CMake() {
//		super(cmake, "CMakeLists.txt");
//	}
//
//	public CMake(String filePath) {
//		super(cmake, filePath);
//	}
//
//	private static class Macro {
//		@CommandLine.Option(names = "-D", mapFallbackValue = "1")
//		public Map<String, String> macros;
//	}
//
//	@Override
//	public Map<String, Set<String>> getMacros() {
//		Map<String, Set<String>> macros = new HashMap<>();
//
//		CMake.Macro macro = new CMake.Macro();
//		CommandLine commandLine = new CommandLine(macro);
//		commandLine.setUnmatchedArgumentsAllowed(true);
//
//		TSQuery list_query = new TSQuery(cmake, "(argument_list) @list");
//		TSQuery arg_query = new TSQuery(cmake, "(unquoted_argument) @unquoted_argument (quoted_element) @quoted_element");
//
//		TSQueryCursor cursor = new TSQueryCursor();
//		TSQueryCursor arg_cursor = new TSQueryCursor();
//
//		cursor.exec(list_query, tree.getRootNode());
//		for (TSQueryCursor.TSMatchIterator matches = cursor.getMatches(); matches.hasNext(); ) {
//			TSNode list_node = matches.next().getCaptures()[0].getNode();
//			ArrayList<String> args = new ArrayList<>();
//
//			arg_cursor.exec(arg_query, list_node);
//			for (TSQueryCursor.TSMatchIterator arg_matches = arg_cursor.getMatches(); arg_matches.hasNext(); ) {
//				TSNode arg_node = arg_matches.next().getCaptures()[0].getNode();
//				if (arg_node.getSymbol() == Symbol.unquoted_argument.id) {
//					args.add(getNodeText(arg_node));
//				} else {
//					args.addAll(List.of(getNodeText(arg_node).split(" ")));
//				}
//			}
//
//			commandLine.parseArgs(args.toArray(new String[0]));
//			if (macro.macros != null) {
//				macro.macros.forEach((macroName, macroValue) -> {
//					macros.putIfAbsent(macroName, new HashSet<>());
//					macros.get(macroName).add(macroValue);
//				});
//			}
//		}
//		return macros;
//	}
//}
