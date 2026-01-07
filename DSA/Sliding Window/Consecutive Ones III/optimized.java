public class optimized {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        int ans = maxConsecutiveIII(arr, k);
        System.out.println(ans);
    }
    static int maxConsecutiveIII(int[] arr, int k) {
        int n = arr.length;
        int right = 0;
        int left = 0;
        int maxLen = 0;
        int zeros = 0;

        while (right < n) {
            if(arr[right] == 0) {
                zeros++;
            }
            while(zeros > k) {
                if (arr[left] == 0) {
                    zeros--;
                }
                left++;
            }

            if(zeros <= k) {
                int len = right - left + 1;
                maxLen = Math.max(maxLen, len);
            }
            right++;
        }
        return maxLen;
    }
}