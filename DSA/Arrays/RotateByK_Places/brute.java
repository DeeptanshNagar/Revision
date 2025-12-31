import java.util.Arrays;

public class brute {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 8, 12};
        int k = 2;

        // rotateLeft(arr, k);
        // System.out.println(Arrays.toString(arr));

        rotateRight(arr, k);
        System.out.println(Arrays.toString(arr));

		// run one at a time
    }

    static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) {
            return;
        }

        k = k % n;

        int[] temp = Arrays.copyOfRange(arr, 0, k);

        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) {
            return;
        }

        k = k % n;

        int[] temp = Arrays.copyOfRange(arr, n - k, n);

        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }
}
