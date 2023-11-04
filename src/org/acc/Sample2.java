package org.acc;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Sample2 {
	public static void main(String[] args) {
		String s1 = "";
	
		List<String> li = new ArrayList<>();
		li.add(s1);
		
		Set<String> s = new LinkedHashSet<String>();
		s.addAll(li);
     
		for (String string : s) {
			System.out.print(string+" ");
		}
	}

}
