public class optimal {
	public static void main(String[] args) {
		int[] arr = {1,2,4,5};
		int N = 5;
		int ans = missingNo(arr, N);
		System.out.println(ans);
	}
	static int missingNo(int[] arr, int N) {
		int n = arr.length;
		int sum1 = (N * (N + 1)) / 2;
		int sum2 = 0;
		for (int i = 0; i < n; i++) {
			sum2 = sum2 + arr[i];
		}
		return sum1 - sum2;
	}
}
