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
		CMake cmake = new CMake("open_source\\libpng\\CMakeLists.txt");
		System.out.println(cmake.getMacros());
	}
}
