package org.schhx.acm.leetcode;

/**
 * @author shanchao
 * @date 2019-05-05
 */
public class Reverse_7 {

    public static void main(String[] args) {
        System.out.println(reverse(-1234506));
    }

    public static int reverse(int x) {
        long result = 0;
        int tmp = Math.abs(x);
        while (tmp > 0) {
            int a = tmp % 10;
            result = result * 10 + a;
            tmp = (tmp - a) / 10;
        }
        return (int) (x > 0 ? result : -result);

    }
}
