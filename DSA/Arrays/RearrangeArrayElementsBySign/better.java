import java.util.Arrays;

public class better {
	public static void main(String[] args) {
		int[] arr = {3, 1, -2, -5, 2, -4};
		int n = arr.length;
		int[] ans = rearrangeArr(arr, n);
		System.out.println(Arrays.toString(ans));
	}
}
