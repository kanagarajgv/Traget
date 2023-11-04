package org.acc;

public class Alpha {
	
	public static void main(String[] args) {
		
		String s = "welcome to java";
		String target = "";
		for (int i = 0; i<12; i++) {
			target=target+s.charAt(i);
		}
		System.out.println(target);
	}

}
