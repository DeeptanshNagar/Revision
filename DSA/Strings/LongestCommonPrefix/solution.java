import java.util.Arrays;

public class solution {
	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		String ans = commonPrefix(strs);
		System.out.println(ans);
	}
	static String commonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
            return "";
        }
		
		StringBuilder ans = new StringBuilder();
		Arrays.sort(strs);

		char[] first = strs[0].toCharArray();
		char[] second = strs[strs.length - 1].toCharArray();
		for (int i = 0; i < first.length; i++) {
			if(first[i] != second[i]) {
				break;
			} else {
				ans.append(first[i]);
			}
		}
		return ans.toString();
	}
}
