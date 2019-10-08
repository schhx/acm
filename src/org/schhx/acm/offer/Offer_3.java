package org.schhx.acm.offer;

import org.schhx.acm.ArrayUtils;

/**
 * 数组中重复的数字
 *
 * @author shanchao
 * @date 2019-05-06
 */
public class Offer_3 {

    public static void main(String[] args) {
        int[] nums = ArrayUtils.generateIntArray(10, 9);
        ArrayUtils.printArray(nums);
        System.out.println(duplicate(nums));
    }

    // 数组中重复的数字
    public static int duplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                if (nums[nums[i]] == nums[i]) {
                    return nums[i];
                } else {
                    int tmp = nums[i];
                    nums[i] = nums[tmp];
                    nums[tmp] = tmp;
                }
            }
        }
        return -1;
    }

    // 题目二：不修改数组找出重复的数字
    public static int duplicate2(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int middle = (end - start) / 2 + start;
            if (countRange(nums, start, middle) > (middle - start + 1)) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return start;
    }

    private static int countRange(int[] nums, int start, int end) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= start && nums[i] <= end) {
                count++;
            }
        }
        return count;
    }
}
