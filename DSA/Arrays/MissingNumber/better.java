public class better {
	public static void main(String[] args) {
		int[] nums = {1,2,4,5};
        int N = 5;
        int ans = missNo(nums, N);
        System.out.println(ans);
	}
	static int missNo(int[] arr, int N) {
		int[] hash = new int[N+1];
		for(int i = 0; i < N-1; i++) { // trick : input se range aayegi
			hash[arr[i]]++;
		}
		for(int i = 1; i <= N; i++) {
			if(hash[i] == 0) {
				return i;
			}
		}
		return -1;
	}
} 