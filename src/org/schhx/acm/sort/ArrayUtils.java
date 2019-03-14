package org.schhx.acm.sort;

import java.util.Random;

public class ArrayUtils {

    public static int[] generateIntArray(int length, int max){
        int[] nums = new int[length];
        Random random = new Random();
        for(int i=0; i<length; i++){
            nums[i] = random.nextInt(max);
        }
        return nums;
    }

    public static void printArray(int[] nums){
        for (int i : nums) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }
}
