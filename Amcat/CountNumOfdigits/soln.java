public class soln {
	public static void main(String[] args) {
		int n = 52529;
		int num = String.valueOf(n).length();
		System.out.println(num);

	}
}

// ALTERNATE METHOD 
// import java.util.Scanner;

// public class CountDigits {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int count = 0;

//         if (n == 0) {
//             count = 1;
//         }

//         while (n > 0) {
//             count++;
//             n = n / 10;
//         }

//         System.out.println(count);
//     }
// }

// ------------------------------------------------------------------------

// FOR STRINGS

// import java.util.Scanner;

// public class CountDigits {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String s = sc.nextLine();
//         int count = 0;

//         for (int i = 0; i < s.length(); i++) {
//             if (Character.isDigit(s.charAt(i))) {
//                 count++;
//             }
//         }

//         System.out.println(count);
//     }
// }

