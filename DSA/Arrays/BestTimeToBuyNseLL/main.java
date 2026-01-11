public class main {
	public static void main(String[] args) {
		int[] arr = {7,1,5,3,6,4};
		int n = arr.length;
		int ans = bestTime(arr, n);
		System.out.println(ans);
	}
	static int bestTime(int[] arr, int n) {
		int maxProfit = 0;
		int buy = arr[0]; 
		
		for (int i = 1; i < n; i++) {
			int profit = arr[i] - buy; 
			maxProfit = Math.max(maxProfit, profit);
			buy = Math.min(buy, arr[i]); 
		}
		return maxProfit;
	}
}