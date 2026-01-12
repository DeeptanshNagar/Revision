public class optimal {
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 3, 3, 4, 4};
		int ans = singleNumber(arr);
		System.out.println(ans);
	}
	static int singleNumber(int[] arr) {
		int xor = 0;
		for (int i = 0; i < arr.length; i++) {
			xor = xor ^ arr[i];
		}
		return xor;
	}
}