import java.util.HashMap;

public class better_two {
	public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        int ans = singleNumber(arr);
        System.out.println(ans);
    }

    static int singleNumber(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 1) { // returns value
                return key;
            }
        }
        return -1;
		// map.put(key, value);        // insert/update
		// map.get(key);               // get value
		// map.containsKey(key);       // check if key exists
		// map.getOrDefault(key, 0);   // safe get
		// map.keySet();               // all keys
		// map.values();               // all values
    }
}
