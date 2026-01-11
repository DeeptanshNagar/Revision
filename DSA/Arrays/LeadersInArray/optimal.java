import java.util.ArrayList;

public class optimal {
	public static void main(String[] args) {
		int[] arr = {1, 2, 5, 3, 1, 2};
		ArrayList<Integer> ans = leadersInArr(arr);
		System.out.println(ans);
	}

	static ArrayList<Integer> leadersInArr(int[] arr) {
		int n = arr.length;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int maxi = Integer.MIN_VALUE;
		for (int i = n - 1; i >= 0; i--) {
			if(arr[i] > maxi) {
				list.add(arr[i]);
			}
			maxi = Math.max(maxi, arr[i]);
		}
		return list;
	}
}
