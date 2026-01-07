import java.util.HashMap;

public class better {
	public static void main(String[] args) {
		int[] arr = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
		int k = 2;
		int ans = baskets(arr, k);
		System.out.println(ans);
	}
	static int baskets(int[] arr, int k) {
		int n = arr.length;
		int maxLen = 0;
		int left = 0;
		int right = 0;
		HashMap<Integer, Integer> mpp = new HashMap<>();

		while(right < n) {
			mpp.put(arr[right], mpp.getOrDefault(arr[right], 0) + 1);

			while(mpp.size() > k) {
				mpp.put(arr[left], mpp.get(arr[left]) - 1);
				if(mpp.get(arr[left]) == 0) {
					mpp.remove(arr[left]);
				}
				left++;
			}

			maxLen = Math.max(maxLen, right - left + 1);
			right++;
		}
		// TC : O(N + N)
		// SC : O(3)
		return maxLen;
	}
}
