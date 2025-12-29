import java.util.Arrays;

public class brute {
    public static void main(String[] args) {
        int[] arr = {6, 4, 2, 3, 1};
        largestElement(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void largestElement(int[] arr) {
        int n = arr.length;
        for (int i = n-1; i >= 1; i--) {
            for (int j = 0; j <= i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(arr[arr.length-1]);

    }
}
