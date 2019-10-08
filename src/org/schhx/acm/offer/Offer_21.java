package org.schhx.acm.offer;

import org.schhx.acm.ArrayUtils;

/**
 * 数组中奇数在前偶数在后
 *
 * @author shanchao
 * @date 2019-05-08
 */
public class Offer_21 {

    public static void main(String[] args) {
        int[] nums = ArrayUtils.generateIntArray(10, 10);
        ArrayUtils.printArray(nums);
        change(nums);
        ArrayUtils.printArray(nums);
    }

    public static void change(int[] nums) {
        int i = 0;
        int j = 0;
        for (; j < nums.length; j++) {
            if (nums[j] % 2 == 1) {
                if (i != j) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
                i++;
            }
        }
    }
}
