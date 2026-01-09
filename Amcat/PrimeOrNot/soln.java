public class soln {
	public static void main(String[] args) {
		int n = 13;
		isPrime(n);
	}
	static int gcd(int a, int b) {
		int g = Math.max(a, b);
		int s = Math.min(a, b);
		while(s != 0) {
			int rem = g % s;
			g = s;
			s = rem;
		}
		return g;
	}

	static void isPrime(int n) {
		Boolean prime = true;
		
		if(n <= 1) {
			prime = false;
		}

		for (int i = 2; i < n; i++) {
			if(gcd(n, i) > 1) {
				prime = false;
				break;
			}
		}

		if(prime) {
			System.out.println("Its prime!");
		} else {
			System.out.println("not prime.");
		}
	}
}