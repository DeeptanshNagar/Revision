public class solution {
	public static void main(String[] args) {
		String s = "(()())(())(()(()))";
		String ans = answerParentheses(s);
		System.out.println(ans);
	}
	static String answerParentheses(String s) {
		int count = 0;
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ')') count--;

            if (count != 0) {
                ans.append(ch);  
            }

            if (ch == '(') count++;
        }

        return ans.toString();
	}
}
