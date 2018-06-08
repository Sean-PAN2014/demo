package demo.leetcode;

public class MaxProfit {

	public int maxProfit(int[] prices) {
		int profit = 0;
		for (int i = 1; i < prices.length; i++) {
			int j = prices[i] - prices[i-1];
			if (j > 0) {
				profit += j;
			} 
		}
		return profit;
	}

}
