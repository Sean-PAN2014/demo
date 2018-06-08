package demo.btree;

class Solution {
	public int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		if (nums == null || nums.length < 2)
			return res;

		int max = nums[0];
		int min = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (max < nums[i])
				max = nums[i];
			if (min > nums[i])
				min = nums[i];
		}

		int[] index = new int[max - min + 1];
		int other = 0;
		for (int i = 0; i < nums.length; i++) {
			// if (index[target - numbers[i] + min ] == 0) {
			// } 
			other = target - nums[i];
			if (other < min || other > max) {
				continue;
			}
			if (index[other - min] > 0) {
				res[0] = index[other - min] - 1;
				res[1] = i;
				return res;
			}
			index[nums[i] - min] = i + 1;
		}
		return res;
	}

}