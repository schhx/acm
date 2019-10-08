package org.schhx.acm.leetcode;

/**
 * @author shanchao
 * @date 2019-05-27
 */
public class MaxProfit_122 {

    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                max += prices[i] - prices[i - 1];
            }
        }
        return max;
    }
}
