import java.util.Scanner;

public class sol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int binary = 0;
		int place = 1;

		while(n > 0) {
			int rem = n % 2;
			binary = binary + rem * place;
			place = place * 10;
			n = n / 2;
		}
		System.out.println(binary);
		// return Integer.toString(binary); // for knowledge purpose
	}
}
// class Solution {
//     static String decToBinary(int n) {
//         StringBuilder s = new StringBuilder();
//         while(n!=0){
//             s.append(n%2);
//             n/=2;
//         }
//         String r = s.reverse().toString();
//         return r;
//     }
// }

// public class Soln {
//     public static void main(String[] args) {
//         int n = 10;
//         String binary = Integer.toBinaryString(n);
//         System.out.println(binary);
//     }
// }
