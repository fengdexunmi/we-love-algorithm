/**
 * 基数排序：Java
 *
 */

public class RadixSort {

    /*
     * 基数排序
     *
     */
    public static void radixSort(int[] a) {
        // 位数 (个位=1 十位=10)
        int exp;
        int max = getMax(a);
        // 从个位开始对数组进行排序
        for (exp = 1; max / exp > 0; exp *= 10) {
            countSort(a, exp);
        }
    }

    /*
     * 获取数组中的最大值
     */
    private static int getMax(int[] a) {
        int max;
        max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    /*
     * 使用桶排序对数组按位数排序
     */
    private static void countSort(int[] a, int exp) {
        int[] output = new int[a.length];
        int[] buckets = new int[10];
        for (int i = 0; i < a.length; i++) {
            buckets[(a[i] / exp) % 10]++;
        }
        for (int i = 1; i < 10; i++) {
            buckets[i] += buckets[i - 1];
        }
        for (int i = a.length - 1; i >= 0; i--) {
            output[buckets[(a[i] / exp) % 10] - 1] = a[i];
            buckets[(a[i] / exp) % 10]--;
        }
        // 将排序好的数据赋值给a
        for (int i = 0; i < a.length; i++) {
            a[i] = output[i];
        }
        output = null;
        buckets = null;
    }
    

    public static void main(String[] args) {
        int i;
        int a[] = { 53, 3, 542, 748, 14, 214, 154, 63, 616 };

        System.out.printf("before sort:");
        for (i = 0; i < a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");

        radixSort(a); // 基数排序

        System.out.printf("after  sort:");
        for (i = 0; i < a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");
    }
}