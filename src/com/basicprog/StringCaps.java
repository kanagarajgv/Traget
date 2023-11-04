package com.basicprog;

public class StringCaps {
	public static void main(String[] args) {
		String s = "welcome to java program class";
		String[] split = s.split(" ");
		for (String string : split) {
			//System.out.print(string);
			char ch = string.charAt(0);
			//System.out.println(ch);
			char upperCase = Character.toUpperCase(ch);
			//System.out.println(upperCase);
			String substring = string.substring(1);
			System.out.println(substring);
			String output = upperCase+substring+" ";
			//System.out.print(output);
		}
	}
}
