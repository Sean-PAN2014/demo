package demo.leetcode;

import java.util.Arrays;

public class RemoveDuplicates {

	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int emptyPos = -1;
		boolean prevSame = false;
		int prev = nums[0];
		int total = 1;
		for (int i = 1; i < nums.length; i++) {
			int current = nums[i];
			if (prev == current) {
				if (!prevSame) {
					if (emptyPos < 0) {
						emptyPos = i;
					}
					prevSame = true;
				}
			} else {
				if (emptyPos >= 0) {
					nums[emptyPos] = current;
					emptyPos++;
				}
				total++;
				prevSame = false;
				prev = current;
			}
		}
		// 
		return total;
	}
	
	public static void main(String[] args) {
		int[] nums = new int[] {1,2};
		System.out.println(new RemoveDuplicates().removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));
	}
	
}
