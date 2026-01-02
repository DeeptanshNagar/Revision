public class better {
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 3, 3, 4, 4};
		int ans = singleNumber(arr);
		System.out.println(ans);
	}
	static int singleNumber(int[] arr) {
		int n = arr.length;
		int maxi = 0;
		for (int i = 0; i < n; i++) {
			if(arr[i] > maxi) {
				maxi = arr[i];
			}
		}

		int[] hash = new int[maxi + 1];
		for (int i = 0; i < n; i++) {
			hash[arr[i]]++;
		}

		for (int i = 1; i < hash.length; i++) {
			if(hash[i] == 1) {
				return i;
			}
		}
		return -1;
		// fails for negatives
		// fails for 10^6 size array or even more big arrays - therefore, it's impossible to compute maxi.
	}
}
