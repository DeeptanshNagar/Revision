import java.util.Arrays;

public class bubbleeSort {
    public static void main(String[] args) {
        int[] arr = {1, 2222, 45, 33, 75, 7, 6};
        int n = arr.length;
        // bubblesort(arr, n);
        // selectionsort(arr, n);
        // insertionsort(arr, n);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr, int n) {
        boolean swapped;
        for (int i = n-1; i >= 1; i--) {
            swapped = false;
            for (int j = 0; j <= i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }

    static void selectionsort(int[] arr, int n) {
        for (int i = 0; i <= n-2; i++) {
            int mini = i;
            for (int j = i+1; j <= n-1; j++) {
                if(arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            swap(arr, mini, i);
        }
    }
    public static void swap(int[] arr, int mini, int j) {
        int temp = arr[mini];
        arr[mini] = arr[j];
        arr[j] = temp;
    }

    static void insertionsort(int[] arr, int n) {
        for (int i = 0; i <= n-1; i++) {
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]) {
                swap(arr, j-1, j);
                j--;
            }
        }

    }
}