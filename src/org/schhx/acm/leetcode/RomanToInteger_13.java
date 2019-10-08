package org.schhx.acm.leetcode;

import java.util.HashMap;

/**
 * @author shanchao
 * @date 2019-05-05
 */
public class RomanToInteger_13 {

    public int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len = s.length(), result = map.get(s.charAt(len - 1));
        for (int i = len - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
                result += map.get(s.charAt(i));
            } else {
                result -= map.get(s.charAt(i));
            }
        }
        return result;
    }

}
