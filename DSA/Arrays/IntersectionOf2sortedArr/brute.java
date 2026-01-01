import java.util.ArrayList;

public class brute {
	public static void main(String[] args) {
		int[] arr1 = {1,3,4,5,6,7};
        int[] arr2 = {2,3,4,6,8,9};
        int n = arr1.length;
        int m = arr2.length;
		ArrayList<Integer> result = intersecArr(arr1, arr2, n, m);
		System.out.println(result);
	}

	static ArrayList<Integer> intersecArr(int[] arr1 , int[] arr2, int n, int m) {
		ArrayList<Integer> union = new ArrayList<>();
		int[] visi = new int[m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(arr1[i] == arr2[j] && visi[j] == 0) {
					union.add(arr1[i]);
					visi[j] = 1;
					break;
				}
			}
		}
		return union;
	}
}