import java.util.Scanner;

public class soln {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int temp = n;
		int sum = 0;

		int numOfdigits = String.valueOf(n).length();

		while(n > 0) {
			int digit = n % 10;
			sum = sum + (int) Math.pow(digit, numOfdigits);
			n = n / 10;
		}

		if(sum == temp) {
			System.out.println("is Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}
	}
}
