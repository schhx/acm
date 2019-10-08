package org.schhx.acm.leetcode;

/**
 * @author shanchao
 * @date 2019-05-09
 */
public class GenerateMatrix_59 {

    public static void main(String[] args) {
        int[][] nums = new GenerateMatrix_59().generateMatrix(3);
        System.out.println(nums);
    }

    public int[][] generateMatrix(int n) {
        if (n < 1) {
            return null;
        }
        int[][] nums = new int[n][n];

        int i = 0;
        int num = 1;
        int max = n * n;
        boolean out = false;
        while (!out) {
            for (int k = i; k <= n - i - 1; k++) {
                nums[i][k] = num;
                if (num >= max) {
                    out = true;
                    break;
                }
                num++;
            }

            for (int k = i + 1; k <= n - i - 1; k++) {
                nums[k][n - i - 1] = num;
                if (num >= max) {
                    out = true;
                    break;
                }
                num++;
            }

            for (int k = n - i - 2; k >= i; k--) {
                nums[n - i - 1][k] = num;
                if (num >= max) {
                    out = true;
                    break;
                }
                num++;
            }

            for (int k = n - i - 2; k > i; k--) {
                nums[k][i] = num;
                if (num >= max) {
                    out = true;
                    break;
                }
                num++;
            }
            i++;
        }

        return nums;
    }
}
