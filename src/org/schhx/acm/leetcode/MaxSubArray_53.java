package org.schhx.acm.leetcode;

/**
 * 最大子序和
 *
 * @author shanchao
 * @date 2019-05-09
 */
public class MaxSubArray_53 {

    public int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        int sum = -1;

        for (int i = 0; i < nums.length; i++) {
            if(sum < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            if (sum > max) {
                max = sum;
            }
        }

        return max;

    }
}
