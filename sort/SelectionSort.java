/**
 * SelectionSort
 */
public class SelectionSort {

    /**
     * 选择排序
     * 
     * @param array
     */
    public static void selectionSort(int[] array) {
        int len = array.length;
        // 记录最小元素下标
        int minIndex;
        int temp;
        for (int i = 0; i < len - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (array[j] < array[minIndex]) {
                    // 找到最小元素并记录下标
                    minIndex = j;
                }
            }
            // 与起始元素交换位置
            temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] {4, 3, 5, 7, 9, 1, 6, 2, 8};
        selectionSort(array);
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}