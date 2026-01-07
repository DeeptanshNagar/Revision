import java.util.HashSet;

public class brute {
	public static void main(String[] args) {
		int[] arr = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
		int ans = baskets(arr);
		System.out.println(ans);
	}
	static int baskets(int[] arr) {
		int n = arr.length;
		int maxLen = 0;

		for (int i = 0; i < n; i++) {
			HashSet<Integer> set = new HashSet<>();
			for (int j = i; j < n; j++) {
				set.add(arr[j]);
				if(set.size() <= 2) {
					maxLen = Math.max(maxLen, j - i + 1);
				} else {
					break;
				}
			}
		}
		// TC : O(N * N)
		// SC : O(3)
		return maxLen;
	}
}