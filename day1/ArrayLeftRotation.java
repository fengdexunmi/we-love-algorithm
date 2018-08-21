/**
 * 列表左旋问题
 * 
 * 在Array进行Left Rotation就是将Array内每个元素向左移动一个位置。
 * 例如，对于[1,2,3,4,5]执行步长为2的Left Rotation后结果为[3,4,5,1,2]。
 * 
 * Instead of moving one by one, divide the array in different
 * sets where numbers of sets is equal to GCD of n and d and 
 * move the elements within sets.
 * https://www.geeksforgeeks.org/array-rotation/
 * 
 * 时间复杂度为O(n)
 * 空间复杂度为O(1)
 */
public class ArrayLeftRotation {
    /**
     * Function to left rotate arr[] of size n by d
     */
    public void leftRotate(int arr[], int d, int n) {
        int i, j, k, temp;
        for (i =0; i < gcd(d, n); i++) {
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n) {
                    k = k - n;
                }
                if (k == i) {
                    break;
                }
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    /**
     * Function to print an array
     */
    public void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * Functio to get gcd of a and b
     */
    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        ArrayLeftRotation rotate = new ArrayLeftRotation();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        rotate.leftRotate(arr, 2, 7);
        rotate.printArray(arr, 7);
    }
}