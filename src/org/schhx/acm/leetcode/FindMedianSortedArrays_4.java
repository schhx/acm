package org.schhx.acm.leetcode;

/**
 * @author shanchao
 * @date 2019-05-06
 */
public class FindMedianSortedArrays_4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] nums = new int[length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                nums[k++] = nums1[i++];
            } else {
                nums[k++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            nums[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            nums[k++] = nums2[j++];
        }
        if (length % 2 == 1) {
            return nums[length / 2];
        } else {
            return (nums[length / 2 - 1] + nums[length / 2]) / 2.0;
        }

    }
}
