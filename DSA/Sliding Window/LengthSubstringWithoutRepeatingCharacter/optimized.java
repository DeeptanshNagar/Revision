import java.util.Arrays;

public class optimized {
	public static void main(String[] args) {
		String str = "cadbzabcd";
		int result = longestNonRepeatingSubstring(str);
        System.out.println(result);
	}
	static int longestNonRepeatingSubstring(String str) {
		int n = str.length();
		int[] hash = new int[256];
		Arrays.fill(hash, -1);
		int maxLen = 0;
		int l = 0, r = 0;
		while(r < n) {
			if(hash[str.charAt(r)] >= l) {	// tip : don't care about the character if it's not a part of window
				l = Math.max(hash[str.charAt(r)] + 1, l);
			}
			int len = r - l + 1;
			maxLen = Math.max(maxLen, len);
			hash[str.charAt(r)] = r;
			r++;
		}
		return maxLen;
		// TC : 0(N)
		// SC : 0(256)
	}
	// QUICK RANDOM NOTE : IT TAKES O(1) TIME TO ACCESS AN HASH ARRAY.
}