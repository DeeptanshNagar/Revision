import java.util.ArrayList;

public class optimal {
	public static void main(String[] args) {
		int[] arr1 = {2,3,4,5,6,7};
        int[] arr2 = {1,2,3,4,5,6,8,9};
        int n = arr1.length;
        int m = arr2.length;
		ArrayList<Integer> result = unionArr(arr1, arr2, n, m);
		System.out.println(result);
	}

	static ArrayList<Integer> unionArr(int[] arr1, int[] arr2, int n, int m) {
		ArrayList<Integer> Union = new ArrayList<>();

		int i = 0;
		int j = 0;

		while(i < n && j < m) {
			if (arr1[i] < arr2[j]) {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i]) {
                    Union.add(arr1[i]);
				}
                i++; 
            } else if (arr2[j] < arr1[i]) {
				if(Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j]) {
					Union.add(arr2[j]);
				}
				j++;
			} else {
				if(Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j]) {
					Union.add(arr2[j]);
				}
				i++;
				j++;
			}
		}

		while(i < n) {
			if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i]) {
                Union.add(arr1[i]);
			}
            i++; 
		}

		while(j < m) {
			if(Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j]) {
				Union.add(arr2[j]);
			}
			j++;
		}
		return Union;
	}
}
