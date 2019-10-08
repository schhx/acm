package org.schhx.acm.offer;

/**
 * 旋转数组的最小数字
 *
 * @author shanchao
 * @date 2019-05-07
 */
public class Offer_11 {

    public static void main(String[] args) {
        System.out.println(minNum(new int[]{3,4,5,1,2}));
        System.out.println(minNum(new int[]{1,0,1,1,1}));
    }

    public static int minNum(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        // 第一个小于最后一个，旋转数为0，整体有序
        if (nums[i] < nums[j]) {
            return nums[i];
        }

        while (i < j - 1) {
            int middle = (j + i) / 2;
            if (nums[i] == nums[j] && nums[i] == nums[middle]) {
                // 顺序查找
                int min = Integer.MAX_VALUE;
                for (; i <= j; i++) {
                    if (nums[i] < min) {
                        min = nums[i];
                    }
                }
                return min;
            } else if (nums[middle] >= nums[i]) {
                i = middle;
            } else {
                j = middle;
            }
        }


        return nums[j];
    }
}
