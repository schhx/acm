package org.schhx.acm.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author shanchao
 * @date 2019-05-06
 */
public class ValidBrackets_20 {

    public static void main(String[] args) {
        boolean isValid = new ValidBrackets_20().isValid("{}{}");
        System.out.println(isValid);
    }

    public boolean isValid(String s) {
        if (s.equals("")) {
            return true;
        }
        if (s.length() % 2 == 1) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            Character cha = s.charAt(i);
            if (cha.equals(map.get(list.peek()))) {
                list.pop();
            } else {
                list.push(cha);
            }
        }

        return list.size() == 0;

    }
}
