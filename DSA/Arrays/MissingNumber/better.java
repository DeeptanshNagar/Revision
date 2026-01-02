public class better {
	public static void main(String[] args) {
		int[] arr = {1,2,4,5};
        int N = 5;
        int ans = missNo(arr, N);
        System.out.println(ans);
	}
	static int missNo(int[] arr, int N) {
		int[] hash = new int[N+1];
		for(int i = 0; i < arr.length; i++) {
			hash[arr[i]]++;
		}
		for(int i = 1; i <= N; i++) {
			if(hash[i] == 0) {
				return i;
			}
		}
		return -1;
		// tc : 0(2n)
		// sc : 0(n) using hash table
	}
} 