package org.schhx.acm.leetcode;

import java.util.HashMap;

/**
 * https://leetcode-cn.com/problems/two-sum/
 *
 * @author shanchao
 * @date 2019-05-05
 */
public class TwoSum_1 {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);

        System.out.println(result[0] + " " + result[1]);
    }


    public static int[] twoSum(int[] nums, int target) {
        if (nums.length >= 2) {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
            for (int i = 0; i < nums.length; i++) {
                map.put(new Integer(nums[i]), i);
            }

            for (int i = 0; i < nums.length; i++) {
                int index = map.get(new Integer(target - nums[i]));
                if (index > 0) {
                    return new int[]{i, index};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
