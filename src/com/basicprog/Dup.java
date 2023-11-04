package com.basicprog;

public class Dup {
	public static void main(String[] args) {
		String s = "welcome";
		int count=0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if (ch[i]==ch[j]) {
					count++;
				}
			}
			if (count>1) {
				System.out.println(ch[i]+"="+count);
		}
			count=0;
		}
	}
}
