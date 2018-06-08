package demo.leetcode;

import java.util.HashMap;

public class NumJewelsInStones {
	
	
	public int numJewelsInStones(String J, String S) {
		int totalJewels = 0;
		if (J == null || J.length() == 0 || S == null || S.length() == 0) {
			return totalJewels;
		}
		char[] js = J.toCharArray();
		char[] ss = S.toCharArray();
		//
		HashMap<Character, Integer> map = new HashMap<>();
		for (char s : ss) {
			Integer count = map.get(s);
			if (count == null) {
				map.put(s, 1);
			} else {
				map.put(s, count + 1);
			}
		}
		for (char j : js) {
			Integer integer = map.get(j);
			if (integer != null) {
				totalJewels += integer;
			}
		}
		return totalJewels;
	}
}
