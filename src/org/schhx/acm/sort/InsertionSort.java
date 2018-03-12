package org.schhx.acm.sort;

/**
 * 插入排序
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] nums = SortUtils.generateIntArray(10, 100);
        System.out.print("原始数组为: ");
        SortUtils.printArray(nums);
        nums = insertionSort(nums);
        System.out.print("排序后为: ");
        SortUtils.printArray(nums);
    }

    private static int[] insertionSort(int[] nums){
        int length = nums.length;
        for(int i=1; i<length; i++){
            for(int j=i;j>0;j--){
                if(nums[j] >= nums[j-1]){
                    break;
                }
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
            }
        }
        return nums;
    }
}
