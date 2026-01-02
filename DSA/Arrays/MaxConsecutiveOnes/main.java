public class main {
	public static void main(String[] args) {
		int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1};
		int ans = maxCons(arr);
		System.out.println(ans);
	}
	static int maxCons(int[] arr) {
		int maxi = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 1) {
				count++;
				maxi = Math.max(maxi, count);
			} else {
				count = 0;
			}
		}
		return maxi;
	}
	// tc : 0(n)
}
