import java.util.Arrays;

/**
 * MergeSort
 * 归并排序
 */
public class MergeSort {

    /**
     * 归并操作
     */
    public static void merge(int[] a, int lo, int mid, int hi) {
        int[] temp = new int[hi - lo + 1];
        int i = lo; // 左下标
        int j = mid + 1; // 右下标
        int k = 0;
        // 把较小的数先移到temp中
        while (i <= mid && j <= hi) {
            temp[k++] = a[i] < a[j] ? a[i++] : a[j++];
        }
        // 把左边剩余的数移到temp中
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        // 把右边剩余的数移到temp中
        while (j <= hi) {
            temp[k++] = a[j++];
        }

        for (int p = 0; p < temp.length; p++) {
            a[p + lo] = temp[p];
        }
    }

    /**
     * 递归归并
     * 
     * @param a
     * @param lo
     * @param hi
     */
    public static void mergeSort(int[] a, int lo, int hi) {
        int mid = (lo + hi) / 2;
        if (lo < hi) {
            mergeSort(a, lo, mid); // 递归处理左边
            mergeSort(a, mid + 1, hi); // 递归处理右边
            merge(a, lo, mid, hi); // 归并操作
        }
    }
    
    public static void main(String[] args) {
        int a[] = { 51, 46, 20, 18, 65, 97, 82, 30, 77, 10 };
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}