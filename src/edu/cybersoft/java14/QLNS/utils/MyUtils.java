package edu.cybersoft.java14.QLNS.utils;

public interface MyUtils {
	static void drawLine(int length) {
		for(int i = 0; i < length; i++)
			System.out.print("-");
		System.out.println();
	}
}

