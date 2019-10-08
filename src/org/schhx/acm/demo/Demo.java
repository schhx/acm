package org.schhx.acm.demo;


import org.schhx.acm.ArrayUtils;

/**
 * @author shanchao
 * @date 2019-03-06
 */
public class Demo {

    public static void main(String[] args) {

        int[] a = ArrayUtils.generateIntArray(10, 100);
        ArrayUtils.printArray(a);
        sort(a, 0, a.length - 1);
        ArrayUtils.printArray(a);

    }

    private static void sort(int[] a, int begin, int end) {
        if (begin >= end) {
            return;
        }
        int middle = quick(a, begin, end);
        sort(a, begin, middle - 1);
        sort(a, middle + 1, end);
    }

    private static int quick(int[] a, int begin, int end) {
        int point = a[end];

        int i = begin;
        for (int j = begin; j <= end; j++) {
            if (a[j] <= point) {
                int tmp = a[j];
                a[j] = a[i];
                a[i] = tmp;
                i++;
            }
        }

//        int tmp = a[i];
//        a[i] = a[end];
//        a[end] = tmp;


        return i - 1;
    }


}
