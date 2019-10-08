package org.schhx.acm.leetcode;

/**
 * @author shanchao
 * @date 2019-05-05
 */
public class LongestCommonPrefix_14 {

    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if (strs.length == 0) {
            return prefix;
        }
        prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            //关键代码，不断的从后往前截取字符串，然后与之相比，直到startsWith()返回true
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
