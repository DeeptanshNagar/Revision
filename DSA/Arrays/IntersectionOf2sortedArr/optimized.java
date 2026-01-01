import java.util.ArrayList;

public class optimized {
	public static void main(String[] args) {
		int[] arr1 = {2,3,4,5,6,7};
        int[] arr2 = {1,2,3,4,5,6,8,9};
        int n = arr1.length;
        int m = arr2.length;
		ArrayList<Integer> result = intersecArr(arr1, arr2, n, m);
		System.out.println(result);
	}

	static ArrayList<Integer> intersecArr(int[] arr1 , int[] arr2, int n, int m) {
		ArrayList<Integer> union = new ArrayList<>();
		int i = 0;
		int j = 0;
		while(i < n && j < m) {
			if(arr1[i] > arr2[j]) {
				j++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else {
				union.add(arr1[i]);
				i++;
				j++;
			}
		}
		return union;
	}
}