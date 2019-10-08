package org.schhx.acm.offer;

/**
 * 机器人的运动范围
 * <p>
 * 回溯
 *
 * @author shanchao
 * @date 2019-05-08
 */
public class Offer_13 {

    private static boolean[][] flags;

    public static void main(String[] args) {
        int m = 10;
        int n = 10;
        flags = new boolean[m][n];

        System.out.println(range(m, n, 0, 0, 3));
    }

    /**
     * @param m   二维矩阵行数
     * @param n   二维矩阵列数
     * @param row 目前所在行
     * @param col 目前所在列
     * @param k   总数限制
     * @return 格子数
     */
    public static int range(int m, int n, int row, int col, int k) {
        if (row < 0 || row >= m || col < 0 || col >= n || flags[row][col] || !isTrue(row, col, k)) {
            return 0;
        }
        flags[row][col] = true;
        return range(m, n, row + 1, col, k) +
                range(m, n, row - 1, col, k) +
                range(m, n, row, col + 1, k) +
                range(m, n, row, col - 1, k) + 1;
    }

    public static boolean isTrue(int row, int col, int k) {
        return ss(row) + ss(col) <= k;
    }

    public static int ss(int num) {
        int c = 0;
        while (num > 0) {
            c += num % 10;
            num = num / 10;
        }
        return c;
    }
}
