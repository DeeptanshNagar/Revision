import java.util.Arrays;

public class optimal {
   public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 12, 15};
        leftRotate(arr);
        System.out.println(Arrays.toString(arr));
   }
   static void leftRotate(int[] arr) {
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = temp;
   }
}
// tc : 0(n)
// sc : 0(n) (array used to solve the problem)
// xtra space used (sc complexity) : 0(1)