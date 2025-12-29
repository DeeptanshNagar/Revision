public class main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 9};
        boolean ok = isSorted(arr);
        System.out.println(ok);
    }
    static boolean isSorted(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if(arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }
} 