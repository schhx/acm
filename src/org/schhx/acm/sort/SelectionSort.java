package org.schhx.acm.sort;


/**
 * 选择排序
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] a = ArrayUtils.generateIntArray(10, 100);
        System.out.print("原始数组为: ");
        ArrayUtils.printArray(a);
        selectionSort(a);
        System.out.print("排序后为: ");
        ArrayUtils.printArray(a);
    }


    private static void selectionSort(int[] a) {
        if (a == null || a.length <= 0) {
            throw new RuntimeException("参数不合法");
        }
        int length = a.length;
        for (int i = 0; i < length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < length; j++) {
                if (a[j] < a[index]) {
                    index = j;
                }
            }
            if (i != index) {
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
            }
        }
    }
}
