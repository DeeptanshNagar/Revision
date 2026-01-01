public class brute {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		int N = 5;
		int ans = missingNo(arr, N);
		System.out.println(ans);
	}

	static int missingNo(int[] arr, int N) {
		int n = arr.length;
		for (int i = 1; i <= N; i++) {
			int flag = 0;
			for (int j = 0; j < n; j++) {
				if(arr[j] == i) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				return i;
			}
		}
		return -1;
	}
}
