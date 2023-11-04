package com.basicprog;

public class Change {
	public static void main(String[] args) {
		String s = "welcome to java and welcome to india";
		
		if(s.contains("to")) {
			String replace=s.replaceAll("to", "in");
			String replace1 = replace.replaceFirst("in", "to");
			System.out.println("The replace string are: "+ replace1);
		}
//		String s1 = s.substring(0, 28);
//		String s2 = s.substring(28, 36);
//		String replace = s2.replace("to", "in");
//		String tar = s1 + replace;
//		System.out.println(tar);
	}
}
