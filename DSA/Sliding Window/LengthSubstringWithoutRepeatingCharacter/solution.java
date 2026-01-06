public class solution {
	public static void main(String[] args) {
		String input = "cadbzabcd";
		int output = longestNonRepeatingSubstring(input);
		System.out.println(output);
	}
	static int longestNonRepeatingSubstring(String str) {
		int n = str.length();
		int maxLen = 0;
		for (int i = 0; i < n; i++) {
			int[] hash = new int[256];
			for (int j = i; j < n; j++) {
				if(hash[str.charAt(j)] == 1) break;
				hash[str.charAt(j)] = 1;
				maxLen = Math.max(maxLen, j - i + 1);
			}
		}
		return maxLen;
		// TC : 0(N*N)
		// SC : 0(256)
	}
}