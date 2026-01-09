import java.util.Arrays;

public class firstNLastOccurence {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 3, 3, 3, 4, 5, 6};
		int target = 3;

		int[] ans = searchInRange(arr, target);
		System.out.println(Arrays.toString(ans));
	}

	static int[] searchInRange(int[] arr, int target) {
		int[] ans = {-1, -1};

		ans[0] = search(arr, target, true);
		if(ans[0] != -1) {
			ans[1] = search(arr, target, false);
		}
		return ans;
	}

	static int search(int[] arr, int target, Boolean searchFirstIndex) {
		int ans = -1;
		int start = 0;
		int end = arr.length - 1;

		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			if(target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				ans = mid;
				if(searchFirstIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return ans;
	}
}	