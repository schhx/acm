package org.schhx.acm.offer;

import org.schhx.acm.Node;

/**
 * O(1)时间删除单链表节点
 *
 * @author shanchao
 * @date 2019-05-08
 */
public class Offer_18 {


    public Node delete(Node head, Node d) {
        if (head == null) {
            return null;
        } else if (d == null) {
            return head;
        } else if (d.next == null) {
            if (head == d) {
                return null;
            }
            Node node = head;
            while (node.next != null && !node.next.equals(d)) {
                node = node.next;
            }
            node.next = null;
        } else {
            d.val = d.next.val;
            d.next = d.next.next;
        }
        return head;
    }
}
