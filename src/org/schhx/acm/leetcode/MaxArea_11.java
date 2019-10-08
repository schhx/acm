package org.schhx.acm.leetcode;

/**
 * @author shanchao
 * @date 2019-05-06
 */
public class MaxArea_11 {

    public int maxArea(int[] height) {
        if (height.length < 2) {
            return 0;
        }
        int maxArea = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int area = Math.min(height[i], height[j]) * (j - i);
            if(area > maxArea) {
                maxArea = area;
            }
            if(height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}
