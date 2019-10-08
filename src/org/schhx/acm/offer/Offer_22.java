package org.schhx.acm.offer;

import org.schhx.acm.Node;

/**
 * 链表中倒数第k个节点
 *
 * @author shanchao
 * @date 2019-05-08
 */
public class Offer_22 {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        System.out.println(k(node1, 2).val);
        System.out.println(k(node1, 5));
    }

    public static Node k(Node head, int k) {
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < k - 1; i++) {
            fast = fast.next;
            if(fast == null) {
                return null;
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
