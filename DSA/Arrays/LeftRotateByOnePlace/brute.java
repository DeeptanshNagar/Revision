
public class brute {
	public static void main(String[] args) {
		int[] arr = {2, 4, 5, 7, 12, 15};
		int n = arr.length;
        leftRotate(arr, n);
	}
	static void leftRotate(int[] arr, int n) {
		int[] temp = new int[n];
		for (int i = 1; i < n; i++) {
			temp[i - 1] = arr[i];
		}
		temp[n - 1] = arr[0];


		System.out.print("[");
		for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + ", ");
        }
		System.out.println("]");
        System.out.println();
   }
}
// tc : o(n)
// sc : o(n)