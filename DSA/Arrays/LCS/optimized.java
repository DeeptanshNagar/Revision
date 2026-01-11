import java.util.HashSet;

public class optimized {
	public static void main(String[] args) {
		int[] arr = {100,102,100,101,101,4,3,2,3,2,1,1,1,2};
		int ans = lcs(arr);
		System.out.println(ans);
	}
	static int lcs(int[] arr) {
		int longest = 1;
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		for(int el : set) {
			if(!set.contains(el - 1)) {
				int count = 1;
				int x = el;
				while(set.contains(x + 1)) {
					x = x + 1;
					count++;
				}
				longest = Math.max(longest, count);
			}
		}
		return longest;
	}
}