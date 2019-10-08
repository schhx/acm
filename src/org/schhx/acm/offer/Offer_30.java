package org.schhx.acm.offer;

import java.util.Stack;

/**
 * 包含min函数的栈
 *
 * @author shanchao
 * @date 2019-05-08
 */
public class Offer_30 {

    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(3);
        myStack.push(2);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack.min());
        myStack.pop();
        System.out.println(myStack.min());
        myStack.pop();
        System.out.println(myStack.min());
        myStack.pop();
        System.out.println(myStack.min());
        myStack.pop();
        System.out.println(myStack.min());
    }

    private static class MyStack<E extends Comparable> {
        private Stack<E> stack = new Stack<>();
        private Stack<E> minStack = new Stack<>();

        public E push(E e) {
            if (minStack.empty() || e.compareTo(minStack.peek()) < 0) {
                minStack.push(e);
            } else {
                minStack.push(minStack.peek());
            }
            return stack.push(e);
        }

        public E pop() {
            minStack.pop();
            return stack.pop();
        }

        public E min() {
            return minStack.peek();
        }
    }
}


