public class printMaxSubArr {
	public static void main(String[] args) {
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		int ans = maxSubArr(arr);
		System.out.println(ans);
	}

	static int maxSubArr(int[] arr) {
		if(arr == null || arr.length == 0) {
			return 0;
		}
		int maxi = Integer.MIN_VALUE;
		int sum = 0;
		int ansStart  = -1;
		int ansEnd = -1;
		int Start = 0;
		for (int i = 0; i < arr.length; i++) {
			if(sum == 0) {
				Start = i;
			}
			sum = sum + arr[i];
			if(sum > maxi) {
				maxi = sum;
				ansStart = Start;
				ansEnd = i;
			}
			if(sum < 0) {
				sum = 0;
			}
		}
		System.out.print("[");
		for (int i = ansStart; i <= ansEnd; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
		return maxi;
	}
}
