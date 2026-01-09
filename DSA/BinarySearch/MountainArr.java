public class MountainArr {
	public static void main(String[] args) {
		int[] arr = {2,3,5,6,7,5,4,2,1};
		int ans = peakIndexInMountainArr(arr);
		System.out.println(ans);
	}

	static int peakIndexInMountainArr(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while(start < end) {
			int mid = start + (end - start) / 2;

			if(arr[mid] > arr[mid + 1]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return end;
	}
}
