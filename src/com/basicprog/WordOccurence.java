package com.basicprog;

import java.util.HashMap;
import java.util.Map;

public class WordOccurence {
	public static void main(String[] args) {
		String s = "java concepts will be easy when you practice java program daily";
		String[] split = s.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (String c : split) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
}
