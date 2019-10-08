package org.schhx.acm.leetcode;

/**
 * @author shanchao
 * @date 2019-05-06
 */
public class RemoveElement_27 {

    public static int removeElement(int[] nums, int val) {
        if (nums.length <= 0) {
            return 0;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
