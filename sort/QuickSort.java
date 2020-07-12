import java.util.Arrays;

/**
 * QuickSort
 * 快速排序
 */
public class QuickSort {

    /**
     * 递归方式实现快速排序
     * 
     * @param a
     * @param lo
     * @param hi
     */
    public static void quickSort(int[] a, int lo, int hi) {
        if (lo < hi) {
            int pivot = partition(a, lo, hi);
            quickSort(a, lo, pivot - 1);
            quickSort(a, pivot + 1, hi);
        }
    }

    /**
     * 快速排序的切分
     */
    public static int partition(int[] a, int lo, int hi) {
        int pivot = a[lo];
        while (lo < hi) {
            while (lo < hi && a[hi] >= pivot) {
                --hi;
            }
            a[lo] = a[hi];
            while (lo < hi && a[lo] <= pivot) {
                ++lo;
            }
            a[hi] = a[lo];
        }
        a[lo] = pivot;

        return lo;
    }

    public static void main(String[] args) {
        int a[] = { 51, 46, 20, 18, 65, 97, 82, 30, 77, 10 };
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

}