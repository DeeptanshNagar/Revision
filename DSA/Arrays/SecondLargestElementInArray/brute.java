import java.util.*;

// tc of this code : o(n^2)
// note : time complexity for sorting algos is nlogN.
public class brute {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 7, 7, 5};
        int sL = secondLargest(arr);
        System.out.println(sL);
        
    }
    static int secondLargest(int[] arr) {
        int n = arr.length;
        for (int i = n-1; i >= 1; i--) { // nlogn
            for (int j = 0; j <= i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) { // n
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        int secondLargest = -1;
        for (int i = n-2; i >= 0; i--) { // n
            if(max != arr[i]) {
                secondLargest = arr[i];
                break;
            }
        }
        return secondLargest;
    }
}