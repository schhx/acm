package org.schhx.acm.sort;

/**
 * 快速排序
 *
 * @author shanchao
 * @date 2019-03-07
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] a = SortUtils.generateIntArray(10, 100);
        System.out.print("原始数组为: ");
        SortUtils.printArray(a);
        quickSort(a);
        System.out.print("排序后为: ");
        SortUtils.printArray(a);
    }


    private static void quickSort(int[] a) {
        if (a == null || a.length <= 0) {
            throw new RuntimeException("参数不合法");
        }
        sortInternal(a, 0, a.length - 1);

    }

    private static void sortInternal(int[] a, int p, int q) {
        if (p >= q) {
            return;
        }
        int m = partition(a, p, q);
        sortInternal(a, p, m-1);
        sortInternal(a, m + 1, q);
    }


    /**
     * 把比num小的放左边，比num大的放右边
     *
     * @param a 被排序的数组
     * @param p 起始下标
     * @param q 结束下标
     * @return num最后的位置
     */
    private static int partition(int[] a, int p, int q) {
        int pivot = a[q];
        int i = p;
        for(int j = p; j < q; ++j) {
            if (a[j] < pivot) {
                if (i == j) {
                    ++i;
                } else {
                    int tmp = a[i];
                    a[i++] = a[j];
                    a[j] = tmp;
                }
            }
        }

        int tmp = a[i];
        a[i] = a[q];
        a[q] = tmp;

        return i;
    }
}
