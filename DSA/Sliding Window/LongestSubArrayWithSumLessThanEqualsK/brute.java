public class brute {
	public static void main(String[] args) {
		int[] arr = {2, 5, 1, 7, 10};
		int ans = longestSubArr(arr);
		System.out.println(ans);
	}
	static int longestSubArr(int[] arr) {
		int maxLen = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;	
			for (int j = i; j < arr.length; j++) {
				sum = sum + arr[j];
				if(sum <= 14) {
					maxLen = Math.max(maxLen, j - i + 1);
				} else {
					break;
				}
			}
		}
		return maxLen;
	}
}
