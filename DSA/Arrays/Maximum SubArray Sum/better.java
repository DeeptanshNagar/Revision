public class better {
	public static void main(String[] args) {
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		int ans = maxSubArr(arr);
		System.out.println(ans);
	}
	static int maxSubArr(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
			int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
				maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
	}
}

