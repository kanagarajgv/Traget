package com.basicprog;

public class OddEven {
	public static void main(String[] args) {
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 1; i <=10; i++) {
			if (i%2==0) {
				evenSum = evenSum + i;
				
			}
			else if (i%2!=0) {
				oddSum = oddSum + i;
			}
		}
		System.out.println("Even sum is: "+evenSum);
		System.out.println("Odd sum is: "+oddSum);
	}

}
