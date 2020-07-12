/**
 * HeapSort 堆排序
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] arr = { 50, 10, 90, 30, 70, 40, 80, 60, 20 };
        System.out.println("before:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // 堆排序
        heapSort(arr);

        System.out.println();
        System.out.println("after:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * 堆排序
     */
    public static void heapSort(int[] a) {
        // 构建最大堆
        for (int i = a.length / 2; i >= 0; i--) {
            adjustHeap(a, i, a.length - 1);
        }

        // 将堆顶元素与末尾元素交换
        // 调整数组，使其成为新的最大堆
        for (int i = a.length - 1; i > 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            adjustHeap(a, 0, i - 1);
        }
    }

    /**
     * 调整堆
     * 
     * @param a
     * @param adjustIndex
     * @param lastIndex
     */
    public static void adjustHeap(int[] a, int adjustIndex, int lastIndex) {
        int i;
        int j;
        int temp = a[adjustIndex];
        i = adjustIndex;
        for (j = 2 * i + 1; j <= lastIndex; j = 2 * j + 1) {
            if (j < lastIndex && a[j] < a[j + 1]) {
                j = j + 1;
            }
            // 如果调整节点大于其子节点最大的值则无需调整
            if (temp > a[j]) {
                break;
            }
            a[i] = a[j];
            i = j;
        }
        a[i] = temp;
    }

}