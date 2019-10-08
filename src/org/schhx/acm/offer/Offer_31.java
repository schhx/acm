package org.schhx.acm.offer;

import java.util.Stack;

/**
 * 栈的压入、弹出序列
 *
 * @author shanchao
 * @date 2019-05-08
 */
public class Offer_31 {

    public static void main(String[] args) {
        int[] ins = new int[]{1, 2, 3, 4, 5};
        System.out.println(isMatch(ins, new int[]{4, 5, 3, 2, 1}));
        System.out.println(isMatch(ins, new int[]{4, 5, 3, 1, 2}));
        System.out.println(isMatch(ins, new int[]{1, 2, 3, 4, 5}));
    }


    public static boolean isMatch(int[] ins, int[] outs) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;

        for (int out : outs) {
            if (!stack.empty() && stack.peek() == out) {
                stack.pop();
            } else {
                if (i >= ins.length) {
                    return false;
                }
                while (ins[i] != out) {
                    stack.push(ins[i++]);
                }
                i++;
            }
        }

        return stack.empty();
    }
}
