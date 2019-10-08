package org.schhx.acm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 全排列
 *
 * @author shanchao
 * @date 2019-05-09
 */
public class Permute_46 {


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 1) {
            List<Integer> list = new ArrayList<>();
            list.add(nums[0]);
            result.add(list);
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> lists = permute(removeOne(nums, nums[i]));
            for (List<Integer> list : lists) {
                list.add(nums[i]);
                result.add(list);
            }
        }

        return result;

    }

    private int[] removeOne(int[] nums, int i) {
        int[] result = new int[nums.length - 1];
        int index = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != i) {
                result[index++] = nums[j];
            }
        }
        return result;
    }


    public List<List<Integer>> permute2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 1) {
            return result;
        }

        List<Integer> ss = new ArrayList<>();
        ss.add(nums[0]);
        result.add(ss);

        for (int i = 1; i < nums.length; i++) {
            List<List<Integer>> next = new ArrayList<>();
            for (List<Integer> list : result) {
                list.add(nums[i]);

                next.add(list);
                for (int k = 0; k < list.size() - 1; k++) {
                    List<Integer> ssd = new ArrayList<>(list);
                    Integer tmp = ssd.get(k);
                    ssd.set(k, nums[i]);
                    ssd.set(list.size() - 1, tmp);
                    next.add(ssd);
                }

            }
            result = next;
        }

        return result;

    }


}
