package org.methodoverride;

public class SbiBank extends RbiBank {
	
	@Override
	public void savings() {
		super.savings();
		System.out.println("savings % is 10:");
	}
	@Override
	public void fixed() {
		System.out.println("fixed % is 11");
	}
	@Override
	public void loan() {
		System.out.println("loan % is 12");
	}
	public static void main(String[] args) {
		SbiBank s = new SbiBank();
		s.savings();
		s.fixed();
		s.loan();
		
	}
}
