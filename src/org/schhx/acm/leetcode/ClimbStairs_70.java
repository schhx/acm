package org.schhx.acm.leetcode;

/**
 * 爬楼梯
 *
 * @author shanchao
 * @date 2019-05-09
 */
public class ClimbStairs_70 {

    public static void main(String[] args) {
        System.out.println(climbStairs(10));
        System.out.println(climbStairs2(10));
    }


    public static int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static int climbStairs2(int n) {
        if (n < 3) {
            return n;
        }
        int c1 = 1;
        int c2 = 2;
        for (int i = 3; i <= n; i++) {
            int c = c1 + c2;
            c1 = c2;
            c2 = c;
        }
        return c2;
    }
}