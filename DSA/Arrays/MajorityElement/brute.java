public class brute {
	public static void main(String[] args) {
		int[] arr = {2, 2, 3, 3, 1, 2, 2};
		int ans = majorityNumber(arr);
		System.out.println(ans);
	}
	static int majorityNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count > arr.length/2) {
				return arr[i];
			}
		}
		return -1;
	}
}