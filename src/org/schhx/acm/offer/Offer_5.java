package org.schhx.acm.offer;

/**
 * 替换空格
 *
 * @author shanchao
 * @date 2019-05-07
 */
public class Offer_5 {

    public static void main(String[] args) {
        String s = "We are happy";
        System.out.println(replace(s));
    }

    public static String replace(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        for (char c : chars) {
            if (c == ' ') {
                count++;
            }
        }

        char[] res = new char[chars.length + 2 * count];
        int index = res.length - 1;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                res[index--] = '0';
                res[index--] = '2';
                res[index--] = '%';
            } else {
                res[index--] = chars[i];
            }
        }
        return new String(res);
    }
}
