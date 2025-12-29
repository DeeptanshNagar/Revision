public class optimal {
    public static void main(String[] args) {
        int[] arr = {2, 7, 3, 4, 6, 5};
        int n = arr.length;
        int secLar = secondLargest(arr, n);
        System.out.println(secLar);
    }    
    static int secondLargest(int[] arr, int n) {
        if (n < 2) {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secLargest) {
                secLargest = arr[i];
            }
        }
        return (secLargest == Integer.MIN_VALUE) ? -1 : secLargest;
    }
}

// tc : o(n)