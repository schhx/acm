package org.schhx.acm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author shanchao
 * @date 2019-05-27
 */
public class Subsets_78 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if (nums.length <= 0) {
            list.add(new ArrayList<>());
            return list;
        }
        int[] subNums = Arrays.copyOfRange(nums, 1, nums.length);
        List<List<Integer>> subList = subsets(subNums);
        list.addAll(subList);
        for (List<Integer> sub : subList) {
            List<Integer> ss = new ArrayList<>(sub);
            ss.add(nums[0]);
            list.add(ss);
        }
        return list;
    }
}
