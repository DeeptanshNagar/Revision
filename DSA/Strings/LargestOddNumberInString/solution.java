public class solution {
	public static void main(String[] args) {
		String num = "35427";
		String ans = largestOdd(num);
		System.out.println(ans);
	}
	static String largestOdd(String num) {
		int n = num.length();
		for (int i = n - 1; i >= 0; i--) {
			int digits = num.charAt(i) - '0';
			if(digits % 2 == 1) {
				return num.substring(0, i + 1);
			}
		}
		return "";
	}
}
