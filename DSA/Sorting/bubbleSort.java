import java.util.*;
// put the maximum in the last
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 8, 6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = n - 1; i >= 1; i--) {
            swapped = false;
            for (int j = 0; j <= i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
}  
// worst  tc -> o(n^2) sum of n natural numbers
// best case tc -> o(n)