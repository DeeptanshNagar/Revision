// In this we just reduce time complexity from 0(2n) to 0(n)
public class optimized {
	public static void main(String[] args) {
		int[] arr = {2, 5, 1, 7, 10}; 
        int ans = longestSubArr(arr);
        System.out.println(ans);
	}
	// r = expand
	// l = shrink
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
            if (sum > k) { // for this case : keeping the length = 3 "intact", and not going for length = 2, always finding for making it length = 4 if possible.
                sum = sum - arr[l];
                l++;
            }

            // update answer for valid window
            if(sum <= k) {
				maxLen = Math.max(maxLen, r - l + 1);
			}
            r++;
        }
        return maxLen;
    }
	// TC : O(N)
	// SC : O(1)
}

// NOTE : THIS APPROACH OF CONVERTING "WHILE" TO "IF" ONLY WORKS IF WE WANT LONGEST SUBARRAY LENGTH, BUT IT WON'T WORK IF WE WANT TO PRINT THE LONGEST SUBARRAY OR THE LONGEST SUBARRAY WITH MAXIMUM SUM LESS THAN EQUAL TO K.