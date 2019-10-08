package org.schhx.acm.offer;

/**
 * 剪绳子
 *
 * @author shanchao
 * @date 2019-05-08
 */
public class Offer_14 {

    public static void main(String[] args) {
        System.out.println(cut(8));
        System.out.println(cut2(8));
    }

    // 动态规划
    public static long cut(int n) {
        if (n < 2) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else if (n == 3) {
            return 2;
        }

        long[] p = new long[n + 1];
        p[0] = 0;
        p[1] = 1;
        p[2] = 2;
        p[3] = 3;

        for (int i = 4; i <= n; i++) {
            for (int j = 1; j <= i / 2; j++) {
                if (p[j] * p[i - j] > p[i]) {
                    p[i] = p[j] * p[i - j];
                }
            }
        }
        return p[n];
    }

    // 贪婪
    public static long cut2(int n) {
        if (n < 2) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else if (n == 3) {
            return 2;
        }

        if (n % 3 == 0) {
            return (long) Math.pow(3, n / 3);
        } else if (n % 3 == 1) {
            return (long) Math.pow(3, (n - 4) / 3) * 4;
        } else if (n % 3 == 2) {
            return (long) Math.pow(3, n / 3) * 2;
        }

        return 1;
    }
}
