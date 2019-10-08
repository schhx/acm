package org.schhx.acm.leetcode;

/**
 * @author shanchao
 * @date 2019-05-27
 */
public class SingleNumber_136 {

    public static void main(String[] args) {
        SingleNumber_136 demo = new SingleNumber_136();
        System.out.println(demo.singleNumber(new int[]{2, 2, 1}));
        System.out.println(demo.singleNumber(new int[]{4, 2, 1, 2, 1}));
        System.out.println(demo.singleNumber(new int[]{17, 12, 5, -6, 12, 4, 17, -5, 2, -3, 2, 4, 5, 16, -3, -4, 15, 15, -4, -5, -6}));
    }

    public int singleNumber(int[] nums) {
        int single = nums[0];
        for (int i = 1; i < nums.length; i++) {
            single = single ^ nums[i];
        }
        return single;
    }
}
