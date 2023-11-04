package com.basicprog;

import java.util.Arrays;

public class Anag {
	public static void main(String[] args) {

		String s1 = "peek";
		String s2 = "keep";

		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
// hhlojoj
		Arrays.sort(a1);
		System.out.println(a1);
		Arrays.sort(a2);
		System.out.println(a2);
		boolean b = Arrays.equals(a1, a2);
		if (b == true) {
			System.out.println("anagram");
		} else {
			System.out.println("not");
		}
	}
}
//hojojjj
