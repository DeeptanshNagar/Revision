public class brute {
	public static void main(String[] args) {
		int[] arr = {100,102,100,101,101,4,3,2,3,2,1,1,1,2};
		int ans = lcs(arr);
		System.out.println(ans);
	}
	static int lcs(int[] arr) {
		int longest = 1;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int x = arr[i];
			int count = 1;
			while(linearSearch(arr, x + 1) == true) {
				x = x + 1;
				count = count + 1;
			}
			longest = Math.max(longest, count);
		}
		return longest;
	}

	static boolean linearSearch(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == x) {
				return true;
			}
		}
		return false;
	}
}