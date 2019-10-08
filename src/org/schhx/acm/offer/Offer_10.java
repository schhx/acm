package org.schhx.acm.offer;

/**
 * 斐波那契数列
 *
 * @author shanchao
 * @date 2019-05-07
 */
public class Offer_10 {

    public static void main(String[] args) {
        System.out.println(fibonacci(7));
        System.out.println(fibonacci2(7));
    }

    public static long fibonacci(int n) {
        long num;
        if (n < 2) {
            num = n;
        } else {
            num = fibonacci(n - 2) + fibonacci(n - 1);
        }
        return num;
    }

    public static long fibonacci2(int n) {
        long num = 0;
        if (n < 2) {
            num = n;
        } else {
            long pre = 0;
            long next = 1;
            for(int i=2; i<= n; i++) {
                num = pre + next;
                pre = next;
                next = num;
            }
        }
        return num;
    }
}
