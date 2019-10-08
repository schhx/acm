package org.schhx.acm.offer;

/**
 * 打印从1到n位最大数
 *
 * @author shanchao
 * @date 2019-05-08
 */
public class Offer_17 {

    public static void main(String[] args) {
        print(2);
    }


    public static void print(int n) {
        if (n < 1) {
            return;
        }
        int[] a = new int[n];
        while (!plusOne(a)) {
            printArray(a);
        }
    }

    /**
     * @param a
     * @return 是否达到最大值
     */
    private static boolean plusOne(int[] a) {
        int high = a[0];
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == 9) {
                a[i] = 0;
            } else {
                a[i] = a[i] + 1;
                break;
            }
        }
        return high == 9 && a[0] == 0;
    }

    private static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                continue;
            }
            while (i < a.length) {
                System.out.print(a[i]);
                i++;
            }
        }
        System.out.println();
    }
}
