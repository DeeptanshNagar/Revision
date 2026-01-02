public class optimal_two {
	public static void main(String[] args) {
		int[] arr = {1,2,4,5};
		int N = 5;
		int ans = missingNo(arr, N);
		System.out.println(ans);
	}
	// Properties of Xor :
	// a ^ 0 = a
	// a ^ a = 0
	static int missingNo(int[] arr, int N) {
		int XOR1 = 0;
		int XOR2 = 0;
		for (int i = 0; i < arr.length; i++) {
			XOR2 = XOR2 ^ arr[i];        // 1 ^ 2 ^ 4 ^ 5
			XOR1 = XOR1 ^ i + 1;         // 1 ^ 2 ^ 3 ^ 4
		}
		XOR1 = XOR1 ^ N;                 // 1 ^ 2 ^ 3 ^ 4 ^ 5
		return XOR1 ^ XOR2;
	}
}
