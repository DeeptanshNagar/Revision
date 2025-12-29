public class opti {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 2};
        int largest = largestElement(arr);
        System.out.println(largest);
    }
    static int largestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
