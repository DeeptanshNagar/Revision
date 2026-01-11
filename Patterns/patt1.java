public class patt1 {
	public static void main(String[] args) {
		// pattern1(4);
		// pattern2(4);
		// pattern3(4);
		// pattern4(4);
		// pattern5(4);
		// pattern6(4);
		// pattern7(4);
		// pattern8(4);
		pattern9(5);
	}

	static void pattern1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	static void pattern4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	static void pattern5(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	static void pattern6(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	static void pattern7(int n) {
		for (int i = 0; i < n; i++) {
			//spaces
			for(int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			//stars
			for(int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			//spaces
			for(int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	static void pattern8(int n) {
		for (int i = 0; i < n; i++) {
			//spaces
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			//stars
			for(int j = 0; j < 2 * n - (2 * i + 1); j++) {
				System.out.print("*");
			}
			//spaces
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	static void pattern9(int n) {
		for (int i = 0; i <= 2 * n - 1; i++) {
			int stars = i;
			if(i > n) stars = 2 * n - i;
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}