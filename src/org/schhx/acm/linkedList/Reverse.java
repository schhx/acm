package org.schhx.acm.linkedList;

import org.schhx.acm.Node;

/**
 * 单链表反转
 *
 * @author shanchao
 * @date 2019-03-12
 */
public class Reverse {

    public static void main(String[] args) {
        Node node = LinkedListUtil.generateIntLinkedList(10, 100);
        LinkedListUtil.printLinkedList(node);
        LinkedListUtil.printLinkedList(reverse2(node));
    }


    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node previous = null;
        Node current = head;
        Node next = null;


        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    // 递归实现
    public static Node reverse2(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        Node result = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return result;
    }
}
