import java.util.Arrays;

public class solution {
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		Boolean ans = isValid(s, t);
		System.out.println(ans);
	}
	static Boolean isValid(String s, String t) {
		if (s.length() != t.length()) {
            return false;
        }
		
		char[] st = s.toCharArray();
		Arrays.sort(st);
		String s1 = new String(st);

		char[] st2 = t.toCharArray();
		Arrays.sort(st2);
		String s2 = new String(st2);

		return s1.equals(s2);
	}
}
