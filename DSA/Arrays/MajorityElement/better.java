import java.util.HashMap;

public class better {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 3, 1, 2, 2};
        int result = findMajority(nums);
        System.out.println(result);
    }

    static int findMajority(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int halfLength = nums.length / 2;
        
        for (int num : nums) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
			if(mpp.get(num) > halfLength) {
				return num;
			}
        }
		// iterating the map
		// for(int key : mpp.keySet()) {
		// 	if(mpp.get(key) > halfLength) {
		// 		return key;
		// 	}
		// }
        return -1; 
    }
}