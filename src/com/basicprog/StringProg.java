package com.basicprog;

public class StringProg {
	public static void main(String[] args) {
		String s = "Hi how are you";
		String[] s1 = s.split(" ");
		for (String string : s1) {
			if (string.length()>2) {
				System.out.print(string+" ");
			}
		}

	}

}
