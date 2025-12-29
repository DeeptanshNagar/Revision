import java.util.*;

// TC -> 0(2n)
public class better {
    public static void main(String[] args) {
        int[] arr = {0, -1, -2, -4, -7, -7, -5};
        int sL = secondLargest(arr);
        System.out.println(sL);
        
    }
    static int secondLargest(int[] arr) {
        int n = arr.length;
        if (n < 2) return -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) { // n
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) { // n
            if(max != arr[i] && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
