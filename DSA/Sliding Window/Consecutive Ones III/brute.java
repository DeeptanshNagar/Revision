public class brute {
	public static void main(String[] args) {
		int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
		int k = 2;
		int ans = coIII(arr, k);
		System.out.println(ans);
	}
	static int coIII(int[] arr, int k) {
		int n = arr.length;
		int maxLen = 0;
		for (int i = 0; i < n; i++) {
			int zeros = 0;
			for (int j = i; j < n; j++) {
				if(arr[j] == 0) {
					zeros++;
				}
				if(zeros <= 2) {
					int len = j - i + 1;
					maxLen = Math.max(maxLen, len);
				}
			}
		}
		return maxLen;
	}
}