package org.schhx.acm.leetcode;

/**
 * 搜索旋转数组
 *
 * @author shanchao
 * @date 2019-05-09
 */
public class Search_33 {

    public int search(int[] nums, int target) {
        if(nums.length <=0) {
            return -1;
        }
        return doSearch(nums, 0, nums.length - 1, target);
    }

    private int doSearch(int[] nums, int start, int end, int target) {
        if (target == nums[start]) {
            return start;
        }
        if (target == nums[end]) {
            return end;
        }
        if (start >= end - 1) {
            return -1;
        }

        int middle = (start + end) / 2;

        if (nums[middle] == nums[start] && nums[middle] == nums[end]) {
            // 顺序搜索
            for (int i = start; i <= end; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }
            return -1;
        }
        if (nums[middle] >= nums[start]) {
            if (target >= nums[start] && target <= nums[middle]) {
                return doSearch(nums, start, middle, target);
            } else {
                return doSearch(nums, middle + 1, end, target);
            }
        } else {
            if (target >= nums[middle] && target <= nums[end]) {
                return doSearch(nums, middle, end, target);
            } else {
                return doSearch(nums, start, middle - 1, target);
            }
        }
    }
}
