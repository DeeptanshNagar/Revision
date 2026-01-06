import java.util.ArrayList;
import java.util.Arrays;

public class brute {
	public static void main(String[] args) {
		int[] arr = {3, 1, -2, -5, 2, -4};
		int n = arr.length;
		int[] ans = rearrangeArr(arr, n);
		System.out.println(Arrays.toString(ans));
	}
	static int[] rearrangeArr(int[] arr, int n) {
		ArrayList<Integer> posi = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if(arr[i] < 0) {
				neg.add(arr[i]);
			} else {
				posi.add(arr[i]);
			}
		}

		for (int i = 0; i < n/2; i++) {
			arr[i * 2] = posi.get(i);
			arr[i * 2 + 1] = neg.get(i);
		}
		return arr;
	}
}
