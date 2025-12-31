import java.util.Arrays;

public class optimized {
	public static void main(String[] args) {
		int[] arr = {2, 4, 5, 6, 8, 12};
        int k = 2;

        rotateLeft(arr, k);
        System.out.println(Arrays.toString(arr));

        rotateRight(arr, k);
        System.out.println(Arrays.toString(arr));
	}

	static void rotateLeft(int[] arr, int k) {
		int n = arr.length;
		if (n == 0) {
			return;
		}
		k = k % n;
		reverse(arr, 0, k-1);
		reverse(arr, k, n-1);
		reverse(arr, 0, n-1);
	}

	static void rotateRight(int[] arr, int k) {
		int n = arr.length;
		if (n == 0) {
			return;
		}
		k = k % n;
		reverse(arr, 0, n - k - 1);
		reverse(arr, n - k, n - 1);
		reverse(arr, 0, n - 1);
	}

	static void reverse(int[] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}