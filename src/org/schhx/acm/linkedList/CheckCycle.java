package org.schhx.acm.linkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * 如何判断链表中是否有环，并找出环的入口
 *
 * @author shanchao
 * @date 2019-03-12
 */
public class CheckCycle {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node2;

        Node result = checkCycle2(node1);
        if (result == null) {
            System.out.println("没有环");
        } else {
            System.out.println("有环 " + result.val);
        }
    }


    /**
     * 利用 Set， 空间复杂度 O(n)
     *
     * @param head
     * @return 环的入口，返回 null 表示没有环
     */
    public static Node checkCycle(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Set<Node> set = new HashSet<>();
        Node node = head;
        while (node != null) {
            if (set.contains(node)) {
                break;
            }
            set.add(node);
            node = node.next;
        }
        return node;
    }


    /**
     * 使用快慢指针
     *
     * @param head
     * @return
     */
    public static Node checkCycle2(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;
        boolean isCycle = false;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow.equals(fast)) {
                isCycle = true;
                break;
            }
        }

        if (isCycle) {
            slow = head;
            while (!slow.equals(fast)) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }


        return null;
    }


}
