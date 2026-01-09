import java.util.Scanner;

public class soln {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char ch = sc.next().charAt(0);

		if(Character.isDigit(ch)) {
			System.out.println("It's a digit.");
		} else if (Character.isLetter(ch)) {
			System.out.println("It's a Alphabet.");
		} else {
			System.out.println("It is a Special Character.");
		}
		sc.close();
	}
}
