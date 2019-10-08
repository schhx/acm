package org.schhx.acm.leetcode;

/**
 * @author shanchao
 * @date 2019-05-06
 */
public class MyAtoi_8 {

    public static void main(String[] args) {
        int num = new MyAtoi_8().myAtoi("9223372036854775808");
        System.out.println(num);
    }

    public int myAtoi(String str) {
        str = str.trim();
        if(str.isEmpty()) {
            return 0;
        }

        long result = 0;
        int i = 0;
        boolean nagtive = false;
        if (str.charAt(0) == '-') {
            i = 1;
            nagtive = true;
        } else if(str.charAt(0) == '+') {
            i = 1;
        }
        for (; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            if (num >= 0 && num <= 9) {
                result = result * 10 + num;
                if(result > Integer.MAX_VALUE) {
                    break;
                }
            } else {
                break;
            }

        }

        if(result > Integer.MAX_VALUE) {
            return nagtive ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

        return nagtive ? -(int)result : (int)result;
    }
}
