package org.schhx.acm.priorityqueue;

import org.schhx.acm.ArrayUtils;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 滑动窗口最大值
 *
 * @author shanchao
 * @date 2019-03-19
 */
public class SlidingWindow {
    private static PriorityQueue<Integer> priorityQueue = null;
    private static int K;


    public static void main(String[] args) {
        int[] a = ArrayUtils.generateIntArray(10, 100);
        ArrayUtils.printArray(a);
        slidingWindow(3, a);

    }

    private static void slidingWindow(int k, int[] a) {
        if (a == null || a.length == 0) {
            return;
        }
        priorityQueue = new PriorityQueue<>(k, Comparator.comparing(Integer::intValue).reversed());
        K = k;

        for (int i = 0; i < a.length; i++) {
            if (i < K) {
                priorityQueue.offer(a[i]);
            } else {
                priorityQueue.remove(a[i - K]);
                priorityQueue.offer(a[i]);
            }
            System.out.print(priorityQueue.peek() + "  ");
        }
        System.out.println();
    }
}
