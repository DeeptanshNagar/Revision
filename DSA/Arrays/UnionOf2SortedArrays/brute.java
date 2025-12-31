import java.util.ArrayList;
import java.util.HashSet;

public class brute {
	public static void main(String[] args) {
		int[] arr1 = {2,3,4,5,6,7};
        int[] arr2 = {1,2,3,4,5,6,8,9};
        int n = arr1.length;
        int m = arr2.length;
		ArrayList<Integer> result = unionArr(arr1, arr2, n, m);
		System.out.println(result);
	}
	static ArrayList<Integer> unionArr(int[] arr1, int[] arr2, int n, int m) {
		HashSet<Integer> set = new HashSet<>();
		ArrayList<Integer> union = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			set.add(arr1[i]);
		}

		for (int i = 0; i < m; i++) {
			set.add(arr2[i]);
		}

		
		for(int num : set) {
			union.add(num);
		}
		return union;
	}
}
// may use TreeSet for ordered union of 2 array as output 