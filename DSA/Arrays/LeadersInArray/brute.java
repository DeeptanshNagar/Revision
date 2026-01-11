import java.util.ArrayList;

public class brute {
	public static void main(String[] args) {
		int[] arr = {1, 2, 5, 3, 1, 2};
		ArrayList<Integer> ans = leadersInArr(arr);
		System.out.println(ans);
	}

	static ArrayList<Integer> leadersInArr(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			Boolean leader = true;
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					leader = false;
					break;
				}
			}
			if(leader == true) {
				list.add(arr[i]);
			}
		}
		return list;
	}
}
