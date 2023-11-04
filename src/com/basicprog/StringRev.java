package com.basicprog;

public class StringRev {
	public static void main(String[] args) {
		String s = "welcome to java";
		String[] split = s.split(" ");
		String rev = "";
		for (int i = split.length-1; i>=0; i--) {
			rev = rev+split[i]+" ";
		}
		System.out.println(rev);
	}
}
