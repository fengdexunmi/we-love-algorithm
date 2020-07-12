/**
 * InsertionSort
 * 插入排序
 */
public class InsertionSort {

    /**
     * 插入排序
     * 
     * @param array
     */
    public static void insertionSort(int[] array) {
        int len = array.length;
        // 前一个下标
        int preIndex;
        // 记录当前取出的元素
        int current;
        for (int i = 1;  i < len; i++) {
            preIndex = i - 1;
            current = array[i];
            while (preIndex >= 0 && array[preIndex] > current) {
                // 如果取出元素大小于已经排序的元素
                // 则向后移动已经排序的元素以便取出元素插入
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] {4, 3, 5, 7, 9, 1, 6, 2, 8};
        insertionSort(array);
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}