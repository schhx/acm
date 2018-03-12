package org.schhx.acm.sort;


/**
 * 冒泡排序
 */
public class BobbleSort {

    public static void main(String[] args) {
        int[] nums = SortUtils.generateIntArray(10, 100);
        System.out.print("原始数组为: ");
        SortUtils.printArray(nums);
        nums = bubbleSort(nums);
        System.out.print("排序后为: ");
        SortUtils.printArray(nums);
    }

    private static int[] bubbleSort(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return nums;
        }
        int temp;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }

}
