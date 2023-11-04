package org.acc;

public class Sample1 {
	public static void main(String[] args) {
		int[] a = new int[5];
		a[0]=700;
		a[1]=800;
		a[2]=850;
		a[3]=900;
		a[4]=950;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					int temp = a[i];
					a[i]= a[j];
					a[j]= temp;
				}
			}
			System.out.println(a[i]);
		}
	}

}
