
public class optimal {
    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 5, 7, 7, 7, 12};
        int newLength = removeDuplicates(nums);
        System.out.println(newLength);
    }
    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
// tc : 0(n)
// sc : 0(1)