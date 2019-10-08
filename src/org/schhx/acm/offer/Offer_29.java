package org.schhx.acm.offer;

/**
 * 顺时针打印矩阵
 *
 * @author shanchao
 * @date 2019-05-08
 */
public class Offer_29 {

    public static void main(String[] args) {
        int[][] nums = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        print(nums);
    }


    public static void print(int[][] nums) {
        int row = nums.length;
        int col = nums[0].length;
        int i = 0;
        while (row > 2 * i && col > 2 * i) {
            printC(nums, i, row, col);
            i++;
        }

    }

    private static void printC(int[][] nums, int i, int row, int col) {
        for (int j = i; j <= col - i - 1; j++) {
            System.out.print(nums[i][j] + " ");
        }

        if (row - 2 * i - 1 < 1) {
            return;
        }

        for (int j = i + 1; j <= row - i - 1; j++) {
            System.out.print(nums[j][col - i - 1] + " ");
        }

        if (col - 2 * i - 1 < 1) {
            return;
        }

        for (int j = col - i - 2; j >= i; j--) {
            System.out.print(nums[row - i - 1][j] + " ");
        }
        if (row - 2 * i - 2 < 1) {
            return;
        }

        for (int j = row - i - 2; j > i; j--) {
            System.out.print(nums[j][i] + " ");
        }
    }


}
