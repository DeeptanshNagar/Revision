public class solution {
	public static void main(String[] args) {
		String s = "  hello world  ";
		String ans = reverseString(s);
		System.out.println(ans);
	}

	static String reverseString(String s) {
		int n = s.length();
		StringBuilder ans = new StringBuilder();

		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		s = sb.toString();

		for (int i = 0; i < n; i++) {
			StringBuilder word = new StringBuilder();

			while(i < n && s.charAt(i) != ' ') {
				word.append(s.charAt(i));
				i++;
			}

			if(word.length() > 0) {
				ans.append(' ');
				ans.append(word.reverse());
			}
		}
		return ans.substring(1);
	}
}
