import java.util.Arrays;

public class better {
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		arrangeColors(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void arrangeColors(int[] arr) {
		int n = arr.length;
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				count0++;
			} else if (arr[i] == 1) {
				count1++;
			} else {
				count2++;
			}
    	}

		int index = 0;
		for (int j = 0; j < count0; j++) {
			arr[index++] = 0;
		}
		for (int j = 0; j < count1; j++) {
			arr[index++] = 1;
		}
		for (int j = 0; j < count2; j++) {
			arr[index++] = 2;
		}
	}
}
