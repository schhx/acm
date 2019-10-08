package org.schhx.acm.offer;


import org.schhx.acm.Node;

/**
 * 从尾到头打印链表
 *
 * @author shanchao
 * @date 2019-05-07
 */
public class Offer_6 {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        reversePrint(node1);
    }

    public static void reversePrint(Node node) {
        if(node.next == null) {
            System.out.println(node.val);
            return;
        }
        reversePrint(node.next);
        System.out.println(node.val);
    }

}
