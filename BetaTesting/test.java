import java.util.HashMap;

public class test {
	public static void main(String[] args) {
		HashMap<Character, Integer> mpp = new HashMap<>();
		mpp.put('a', 3);
		mpp.put('b', 1);
		mpp.put('c', 2);
		mpp.put('c', 4);

		System.out.println(mpp.keySet());

	}
}
