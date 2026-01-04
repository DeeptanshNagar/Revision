import java.util.ArrayList;
import java.util.Arrays;

public class brute {
	public static void main(String[] args) {
		int[] arr = {-7, -3, 1, 2, -5, 4};
		int n = arr.length;
		int[] ans = rearrangeArr(arr, n);
		System.out.println(Arrays.toString(ans));
	}
	static int[] rearrangeArr(int[] arr, int n) {
		ArrayList<Integer> list1 = new ArrayList<>();
		// list containing positives
		for (int i = 0; i < n; i++) {
			if(arr[i] > 0) {
				list1.add(arr[i]);
			}
		}
		
		ArrayList<Integer> list2 = new ArrayList<>();
		// list containing negatives
		for (int i = 0; i < n; i++) {
			if(arr[i] < 0) {
				list2.add(arr[i]);
			}
		}

		int[] result = new int[n];
		int index = 0;
		for (int i = 0; i < list1.size(); i++) {
			result[index] = list1.get(i);
			index = index + 2;
		}
		int index1 = 1;
		for (int i = 0; i < list2.size(); i++) {
			result[index1] = list2.get(i);
			index1 = index1 + 2;
		}
		return result;
	}
}
