import java.util.Arrays;

public class better {
	public static void main(String[] args) {
		int[] arr = {100,102,100,101,101,4,3,2,3,2,1,1,1,2};
		int ans = lcs(arr);
		System.out.println(ans);
	}
	static int lcs(int[] arr) {
		Arrays.sort(arr);
		int longest = 1;
		int prevSmall = Integer.MIN_VALUE;
		int count = 0;
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			if(arr[i] - 1 == prevSmall) {
				count = count + 1;
				prevSmall = arr[i];
			} else if (arr[i] != prevSmall) {
				count = 1;
				prevSmall = arr[i];
			}

			longest = Math.max(longest, count);
		}
		return longest;
	}
}