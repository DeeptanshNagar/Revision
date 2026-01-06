import java.util.Arrays;

public class Next {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 5, 4};
		nextPermutation(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void nextPermutation(int[] arr) {
		int n = arr.length;
		int pivot = -1;

		// Step 1: Find pivot
		for (int i = n - 2; i >= 0; i--) {
			if(arr[i] < arr[i + 1]) {
				pivot = i;
				break;
			}
		}

		// Step 2: If no pivot, reverse whole array
		if(pivot == -1) {
			reverse(arr, 0, n - 1);
			return;
		}

		// Step 3: Find rightmost element greater than pivot
		for (int i = n - 1; i > pivot; i--) {
			if(arr[i] > arr[pivot]) {
				swap(arr, i, pivot);
				break;
			}
		}

		// Step 4: Reverse suffix (once, not in a loop)
		reverse(arr, pivot + 1, n - 1);
	}
	// swap
	public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	// reverse
	public static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
	}
}
