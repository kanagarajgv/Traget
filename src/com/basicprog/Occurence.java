
package com.basicprog;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Occurence {
	public static void main(String[] args) {
		String s = "welcome";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		//unique characters
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue()==1) {
				System.out.println(entry.getKey()+"="+entry.getValue());
			}
		}
	}
}
//		char[] ch = s.toCharArray();
//		for (char c : ch) {
//			if (map.containsKey(c)) {
//				map.put(c, map.get(c) + 1);
//			} else {
//				map.put(c, 1);
//			}
//		}
//		System.out.println(map);
//		 
//	}
//}
