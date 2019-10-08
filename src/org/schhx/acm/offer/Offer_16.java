package org.schhx.acm.offer;

/**
 * 数值的整数次方
 *
 * @author shanchao
 * @date 2019-05-08
 */
public class Offer_16 {



    public double pow(double base, int exponent) {
        if (base == 0) {
            return 0;
        }

        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            if (exponent % 2 == 1) {
                return pow(base, exponent / 2) * pow(base, exponent / 2) * base;
            } else {
                return pow(base, exponent / 2) * pow(base, exponent / 2);
            }
        } else {
            return 1/pow(base, -exponent);
        }

    }


}
