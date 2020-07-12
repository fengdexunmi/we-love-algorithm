import java.util.Arrays;

/**
 * CountSort
 * 计数排序
 */
public class CountSort {

    /**
     * 将排序结果记录到新的数组中
     */
    public static int[] countSort(int[] a) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // 找出数组中的最大值和最小值
        for (int i = 0; i < a.length; i++) {
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);
        }
        int[] temp = new int[max - min + 1];
        // 累计每个元素出现的次数
        for (int i = 0; i < a.length; i++) {
            int pos = a[i] - min;
            temp[pos]++;
        }
        // 计算每个数字应该在排序后数组中应该处于的位置
        for (int i = 1; i < temp.length; i++) {
            temp[i] = temp[i - 1] + temp[i];
        }
        // 输出结果
        int result[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int pos = --temp[a[i] - min];
            result[pos] = a[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 50, 10, 90, 30, 70, 40, 80, 60, 20 };
        int[]result = countSort(arr);
        System.out.println(Arrays.toString(result));
    }
    
}