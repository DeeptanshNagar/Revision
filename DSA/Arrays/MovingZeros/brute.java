import java.util.Arrays;

public class brute {
	public static void main(String[] args) {
		int[] arr = {1, 2, 0, 0, 5, 7, 0, 12, 0, 19};
		movingZeros(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void movingZeros(int[] arr) {
		int n = arr.length;
		int[] temp = new int[n];

		int index = 0;
		for (int i = 0; i < n; i++) {
			if(arr[i] != 0) {
				temp[index] = arr[i];
				index++;
			}
		}

		for (int i = 0; i < n; i++) {
			arr[i] = temp[i];
		}
	}
}