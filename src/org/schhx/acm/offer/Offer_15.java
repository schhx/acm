package org.schhx.acm.offer;

/**
 * 二进制中1的个数
 *
 * @author shanchao
 * @date 2019-05-08
 */
public class Offer_15 {

    public static void main(String[] args) {
        System.out.println(countOne(13));
        System.out.println(countOne2(13));
    }

    // 常规解法
    public static int countOne(int num) {
        int count = 0;
        int cover = 1;
        while (cover <= num) {
            if ((num & cover) == cover) {
                count++;
            }
            cover = cover << 1;
        }
        return count;
    }


    public static int countOne2(int num) {
        if(num == 0) {
            return 0;
        }
        int count = 1;

        while ((num & (num - 1)) != 0) {
            count++;
            num = num & (num - 1);
        }
        return count;
    }
}
