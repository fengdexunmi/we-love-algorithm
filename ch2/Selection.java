/**
 * Selection sort 选择排序
 * 首先，找到数组中最小的那个元素，将它和数组的第一个元素交换位置(如果第一个元素就是最下元素那么它就和自己交换)。
 * 再次，在剩下的元素中找到最小的元素，将它与数组的第二个元素交换位置。
 * 如此反复，直到整个数据排序。 
 * 选择排序需要大约N²/2次比较和N次交换
 */
public class Selection {
    public static void sort(Comparable[] a) {
        int N = a.length;
        // 将a[i]和a[i+1..N]中最小的元素交换
        for (int i = 0; i < N; i++) {
            int min = i; // 最小元素的索引
            for (int j = i + 1; j < N; j++) {
                if (Example.less(a[j], a[min])) {
                    min = j;
                }
            }
            Example.exch(a, i, min);
        }
    }
}