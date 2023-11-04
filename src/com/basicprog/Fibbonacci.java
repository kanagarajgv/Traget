package com.basicprog;

public class Fibbonacci {
	public static void main(String[] args) {
		int f= 0,s=1;
		for (int i = 0; i<8; i++) {
			int t= f+s;
			    f = s;
			    s = t;
		}
		System.out.println(f);
	}
}
