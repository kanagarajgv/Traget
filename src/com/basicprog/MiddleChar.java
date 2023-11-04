package com.basicprog;

public class MiddleChar {
	public static void main(String[] args) {
		String s = "welcome";
		int len = s.length();
		int c = len/2;
		System.out.println(c);
		char[] d = s.toCharArray();
		System.out.println(d[c]);
	}
}
