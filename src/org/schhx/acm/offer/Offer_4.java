package org.schhx.acm.offer;

/**
 * 二维数组中的查找
 *
 * @author shanchao
 * @date 2019-05-07
 */
public class Offer_4 {

    public static void main(String[] args) {
        int[][] nums = new int[][]{
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        };
        System.out.println(find(nums, 7));
        System.out.println(find(nums, 3));

    }

    public static boolean find(int[][] nums, int target) {
        int row = 0;
        int col = nums[0].length - 1;

        while (row < nums.length && col >= 0) {
            if (nums[row][col] == target) {
                return true;
            } else if (target < nums[row][col]) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }
}
