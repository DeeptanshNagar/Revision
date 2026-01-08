public class solution {
	public static void main(String[] args) {
		String s = "   fly me   to   the moon  ";
		int ans = lengthLastWord(s);
		System.out.println(ans);
	}

	static int lengthLastWord(String s) {
		String[] str = s.split("\\s+");
		return str[str.length - 1].length();
	}
}
