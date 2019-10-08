package org.schhx.acm.leetcode;

/**
 * @author shanchao
 * @date 2019-05-05
 */
public class LengthOfLongestSubstring_3 {


    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        boolean[] chars = new boolean[256]; // 256 ASCII code
        int rst = 0;
        int start = 0;
        int end = 0;
        while (start < s.length()) {
            while (end < s.length() && !chars[s.charAt(end)]) {
                chars[s.charAt(end)] = true;
                rst = Math.max(rst, end - start + 1);
                end++;
            }
            chars[s.charAt(start)] = false;
            start++;
        }
        return rst;
    }
}
