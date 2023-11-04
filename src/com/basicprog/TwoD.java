package com.basicprog;

public class TwoD {
	public static void main(String[] args) {
		int [][] a = {{2,3,6},{4,5,6}};
		//int arr = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				//arr = arr + a[i][j];
				System.out.println(a[i][j]);
			}
		}
		//System.out.println(arr);
	}

}
