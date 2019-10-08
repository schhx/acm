package org.schhx.acm.leetcode;

/**
 * @author shanchao
 * @date 2019-05-27
 */
public class MaxProfit_121 {


    public static void main(String[] args) {
        MaxProfit_121 demo = new MaxProfit_121();

        System.out.println(demo.maxProfit2(new int[]{5,4,3}));

    }

    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int[] profits = new int[prices.length - 1];
        for (int i = 1; i < prices.length; i++) {
            profits[i - 1] = prices[i] - prices[i - 1];
        }

        int max = 0;
        int tmp = 0;
        for (int i = 0; i < profits.length; i++) {
            tmp += profits[i];
            if (tmp > 0) {
                if (tmp > max) {
                    max = tmp;
                }
            } else {
                tmp = 0;
            }
        }
        return max;
    }

    public int maxProfit2(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}
