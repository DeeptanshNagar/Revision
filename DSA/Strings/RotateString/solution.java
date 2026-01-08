public class solution {
	public static void main(String[] args) {
		String s = "abcde";
		String goal = "cdeab";
		Boolean ans = rotateString(s, goal);
		System.out.println(ans);
	}
	static Boolean rotateString(String s, String goal) {
		if(s.length() != goal.length()) {
			return false;
		}
		return (s+s).contains(goal);
	}
}