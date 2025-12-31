import java.util.HashSet;

public class brute {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 5, 7, 7, 12};
        int uniqueElements = removeDuplicates(arr);
        System.out.println(uniqueElements);

    }

    static int removeDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        int index = 0;

        for (int num : arr) {
            if (!seen.contains(num)) {
                seen.add(num);
                arr[index] = num;
                index++;
            }
        }
        return index;
    }
}
// tc : 0(n)
// sc : 0(n)