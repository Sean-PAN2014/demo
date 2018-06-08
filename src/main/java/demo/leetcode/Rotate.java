package demo.leetcode;

public class Rotate {
    public void rotate(int[] nums, int k) {
		if (nums == null || nums.length <= 1) {
    		return;
    	}
		while (k >= nums.length) {
			k -= nums.length;
		}
		if (k == 0) {
			return;
		}
    	int j = 0;
    	int pop = nums[j];
        for (int i = 1; i < nums.length; i++) {
        	int a = j-k;
        	if (a < 0) {
        		a += nums.length;
        	}
        	nums[j] = nums[a];
            j = a;
		}
        nums[k] = pop;
    }
    
}
