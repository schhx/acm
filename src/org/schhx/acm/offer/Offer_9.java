package org.schhx.acm.offer;

import java.util.Stack;

/**
 * 用两个栈实现一个队列
 *
 * @author shanchao
 * @date 2019-05-07
 */
public class Offer_9 {

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.appendTail(1);
        queue.appendTail(2);
        queue.appendTail(3);
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
        queue.appendTail(4);
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
    }


    private static class Queue<E> {

        private static Stack in = new Stack<>();
        private static Stack out = new Stack<>();

        public void appendTail(E element) {
            in.push(element);
        }

        public E deleteHead() {
            if (!out.empty()) {
                return (E) out.pop();
            }
            if(in.empty()) {
                return null;
            }
            while (!in.empty()) {
                out.push(in.pop());
            }
            return (E) out.pop();
        }
    }
}
