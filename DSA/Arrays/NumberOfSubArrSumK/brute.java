public class brute {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
		int k = 3;
		int ans = maxNumOfArr(arr, k);
		System.out.println(ans);
	}

	static int maxNumOfArr(int[] nums, int k) {
		int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int r = i; r <= j; r++) {
                    sum = sum + nums[r];
                }
                if(sum == k) {
                    count++;
                }
            }
        }
        return count;
	}
}