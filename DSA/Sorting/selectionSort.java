import java.util.*;
// put the minimum in the first
public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionsort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            int mini = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if(arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            swap(arr, mini, i);
        }
    }

    public static void swap(int[] arr, int mini, int i) {
        int temp = arr[mini];
        arr[mini] = arr[i];
        arr[i] = temp;
    }
}
// best/worst tc -> o(n^2) sum of n natural numbers
