// Moore's Voting Algorithm

public class MooreVoting {
	public static void main(String[] args) {
		int[] arr = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5};
        int ans = majorityElement(arr);
        System.out.println(ans);
	}
	static int majorityElement(int[] arr) {
		int n = arr.length;
		int count = 0;
		int element = 0;
		for (int i = 0; i < n; i++) {
			if(count == 0) {
				count = 1;
				element = arr[i];
			} else if (arr[i] == element) {
				count++;
			} else {
				count--;
			}
		}

		int count1 = 0;
		for (int i = 0; i < n; i++) {
			if(arr[i] == element) {
				count1++;
			}
		}
		if(count1 > n/2) {
			return element;
		}
		return -1;
	}
}