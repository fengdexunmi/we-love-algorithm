/**
 * BubbleSort
 * 冒泡排序
 */
public class BubbleSort {

    /**
     * 冒泡排序
     * @param array
     */
    public static void bubbleSort(int[] array) {
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // 比较相邻元素并交换
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] {4, 3, 5, 7, 9, 1, 6, 2, 8};
        bubbleSort(array);
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}