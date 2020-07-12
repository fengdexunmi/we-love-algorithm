/**
 * ShellSort
 * 希尔排序
 */
public class ShellSort {

    /**
     * 希尔排序
     * 
     * @param array
     */
    public static void shellSort(int[] array) {
        int gap = 1;
        while (gap < array.length) {
            gap = gap * 3 + 1;
        }

        while (gap > 0) {
            for (int i = gap; i < array.length; i++) {
                int temp = array[i];
                int j = i - gap;
                while (j >= 0 && array[j] > temp) {
                    array[j + gap] = array[j];
                    j -= gap;
                }
                array[j + gap] = temp;
            }
            gap = (int) Math.floor(gap / 3);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] {4, 3, 5, 7, 9, 1, 6, 2, 8};
        shellSort(array);
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
    
}