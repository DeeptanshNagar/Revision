import java.util.Arrays;

public class optimal {
	public static void main(String[] args) {
		int[] arr = {1, 2, 0, 0, 5, 7, 0, 12, 0, 19};
		movingZeros(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void movingZeros(int[] arr) {
		int n = arr.length;
		int j = -1;
		for (int i = 0; i < n; i++) {
			if(arr[i] == 0) {
				j = i;
				break;
			}
		}
		if(j == -1) return;

		for (int i = j + 1; i < n; i++) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
	}
}
