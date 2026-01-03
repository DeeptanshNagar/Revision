// Dutch National Flag Algorithm
import java.util.Arrays;

public class optimal {
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		arrangeColors(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void arrangeColors(int[] arr) {
		int n = arr.length;
		int low = 0;
		int mid = 0;
		int high = n - 1;
		while(mid <= high) {
			if(arr[mid] == 0) {
				int temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				mid++;
				low++;
			} else if (arr[mid] == 1) {
				mid++;
			} else {
				int temp = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp;
				high--;
			}
		}
	}
}