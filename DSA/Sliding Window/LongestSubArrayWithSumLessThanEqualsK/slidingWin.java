public class slidingWin {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 10};
        int ans = longestSubArr(arr);
        System.out.println(ans);
    }

    // Longest subarray with sum <= k
    static int longestSubArr(int[] arr) {
        int n = arr.length;
        int k = 14;

        int l = 0, r = 0;
        int sum = 0;
        int maxLen = 0;

        while (r < n) {
            sum = sum + arr[r];

            // shrink window if invalid
            while (sum > k) {
                sum = sum - arr[l];
                l++;
            }

            // update answer for valid window
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }
	// TC : O(2N)
	// SC : O(1)
}
