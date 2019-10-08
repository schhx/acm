package org.schhx.acm.leetcode;

import java.util.Arrays;

/**
 * @author shanchao
 * @date 2019-05-06
 */
public class ThreeSumClosest_16 {

    public static void main(String[] args) {
        System.out.println(new ThreeSumClosest_16().threeSumClosest(new int[]{-1, -1, 1, 1, 3}, -1));
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int result = 0;
        int closet = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[l] + nums[r] + nums[i];
                if (sum == target) {
                    return target;
                }
                if (Math.abs(sum - target) < Math.abs(closet)) {
                    closet = Math.abs(sum - target);
                    result = sum;
                }
                if (sum > target) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return result;
    }
}
