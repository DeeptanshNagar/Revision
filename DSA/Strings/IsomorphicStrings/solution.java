import java.util.HashMap;

public class solution {
	public static void main(String[] args) {
		String s = "egg";
		String t = "add";
		Boolean ans = isMorphism(s, t);
		System.out.println(ans);
	}
	static Boolean isMorphism(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}

		HashMap<Character, Character> mpp = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char original = s.charAt(i);
			char replacement = t.charAt(i);

			if(!mpp.containsKey(original)) {
				if(!mpp.containsValue(replacement)) {
					mpp.put(original, replacement);
				} else {
					return false;
				}
			} else {
				char mappedChar = mpp.get(original);
				if(mappedChar != replacement) {
					return false;
				}
			}
		}
		return true;
	} 
}
