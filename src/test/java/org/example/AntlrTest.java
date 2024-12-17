package org.example;

import org.example.cmake.CMake;
import org.example.ninja.Ninja;
import org.junit.Test;

public class AntlrTest {
	@Test
	public void testNinja() {
		Ninja ninja = new Ninja();
		System.out.println(ninja.getMacros());
	}

	@Test
	public void testCMake() {
//		CMake cmake = new CMake("D:\\CodeEnforce\\OpenSource\\libpng\\CMakeLists.txt");
		CMake cmake = new CMake();
		cmake.print();
		System.out.println(cmake.getMacros());
	}
}
