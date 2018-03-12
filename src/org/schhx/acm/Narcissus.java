package org.schhx.acm;

import com.sun.tools.javac.util.Assert;

/**
 * 水仙花数
 * <p>
 * 水仙花数是指一个 n 位数（n≥3 ），它的每个位上的数字的 n 次幂之和等于它本身（例如：1^3 + 5^3+ 3^3 = 153）
 */
public class Narcissus {

    public static void main(String[] args) {
        for (int i = 100; i < 10000; i++) {
            if (isNarcissus(i)) {
                System.out.println(i);
            }
        }

    }

    private static boolean isNarcissus(int num) {
        Assert.check(num > 99, "数字必须大于3位数");
        int temp = 0;
        int myNum = num;
        int length = length(num);
        while (myNum > 0) {
            int i = myNum % 10;
            temp += Math.pow(i, length);
            myNum = (myNum - i) / 10;
        }
        return temp == num;
    }

    private static int length(int num) {
        Assert.check(num >= 0, "数字必须大于等于0");
        int length = 0;
        while (num > 0) {
            num = num / 10;
            length++;
        }
        return length;
    }

}
