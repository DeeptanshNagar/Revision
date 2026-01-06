public class solution {
	public static void main(String[] args) {
		int[] arr = {6, 2, 3, 4, 7, 2, 1, 7, 1};
		int k = 3;
		int ans = pointsCard(arr, k);
		System.out.println(ans);
	}
	static int pointsCard(int[] arr, int k) {
		int maxSum = 0;
		int leftSum = 0;
		int rightSum = 0;

		for (int i = 0; i < k; i++) {   // O(k)
			leftSum = leftSum + arr[i];
		}
		maxSum = leftSum;

		int rightIndex = arr.length - 1;

		for (int j = k - 1; j >= 0; j--) {   // O(k)
			leftSum = leftSum - arr[j];
			rightSum = rightSum + arr[rightIndex];
			rightIndex--;
			maxSum = Math.max(maxSum, leftSum + rightSum);
		}
		return maxSum;
		// TIME COMPLEXITY : 0(2N)
		// SPACE COMPLEXITY : 0(1)
	}
}
