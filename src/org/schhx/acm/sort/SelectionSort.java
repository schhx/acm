package org.schhx.acm.sort;


/**
 * 选择排序
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] nums = SortUtils.generateIntArray(10, 100);
        System.out.print("原始数组为: ");
        SortUtils.printArray(nums);
        nums = selectionSort(nums);
        System.out.print("排序后为: ");
        SortUtils.printArray(nums);
    }


    private static int[] selectionSort(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return nums;
        }
        for (int i = 0; i < length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < length; j++) {
                if (nums[j] < nums[index]) {
                    index = j;
                }
            }
            if (i != index) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
        }
        return nums;
    }
}
