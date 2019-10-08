package org.schhx.acm.leetcode;

/**
 * @author shanchao
 * @date 2019-05-27
 */
public class Merge_88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] tmp = new int[m + n];
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                tmp[k++] = nums1[i++];
            } else {
                tmp[k++] = nums2[j++];
            }
        }

        while (i < m) {
            tmp[k++] = nums1[i++];
        }

        while (j < n) {
            tmp[k++] = nums2[j++];
        }

        i = 0;
        while (i < nums1.length) {
            nums1[i] = tmp[i];
            i++;
        }

    }
}
