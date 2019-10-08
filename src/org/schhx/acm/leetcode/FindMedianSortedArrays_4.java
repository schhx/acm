package org.schhx.acm.leetcode;

/**
 * @author shanchao
 * @date 2019-05-06
 */
public class FindMedianSortedArrays_4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length + nums2.length;

        int i = 0;
        int j = 0;
        int index = 0;
        int[] sum = new int[l];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                sum[index++] = nums1[i++];
            } else {
                sum[index++] = nums2[j++];
            }
        }

        while (i < nums1.length) {
            sum[index++] = nums1[i++];
        }
        while (j < nums2.length) {
            sum[index++] = nums2[j++];
        }

        if (l % 2 == 0) {
            return (sum[(l - 1) / 2] + sum[l / 2]) / 2.0;
        } else {
            return sum[(l - 1) / 2];
        }

    }
}
