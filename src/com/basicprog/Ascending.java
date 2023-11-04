package com.basicprog;

public class Ascending {
	public static void main(String[] args) {
		int[] ar = new int[5];
		ar[0] = 500;
		ar[1] = 200;
		ar[2] = 400;
		ar[3] = 100;
		ar[4] = 800;
		for (int i = 0; i <5; i++) {
			for (int j = i + 1; j <5; j++) {
				if (ar[i] > ar[j]) {
					int temp = ar[i]; // 500
					ar[i] = ar[j];    // 200
					ar[j] = temp;     // 500
				}
			}
			System.out.println(ar[i]);
		}
	}
}
