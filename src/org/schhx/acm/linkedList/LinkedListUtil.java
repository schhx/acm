package org.schhx.acm.linkedList;

import org.schhx.acm.Node;

import java.util.Random;

/**
 * @author shanchao
 * @date 2019-03-11
 */
public class LinkedListUtil {

    public static Node generateIntLinkedList(int length, int max){
        Random random = new Random();
        Node dummyHead = new Node(0);
        Node current = dummyHead;
        for(int i=0; i<length; i++){
            Node node = new Node(random.nextInt(max));
            current.next = node;
            current = node;

        }
        return dummyHead.next;
    }

    public static void printLinkedList(Node head){
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printLinkedList(generateIntLinkedList(10, 100));
    }
}
