import java.util.Scanner;

public class optimized {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] hash = new int[101];
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			hash[x]++; // hash[x] = hash[x] + 1;
;		}

		int pairs = 0;
		for (int i = 0; i < hash.length; i++) {
			pairs = pairs + hash[i] / 2;
		}
		int remaining = N - (pairs * 2);
		System.out.println(pairs + " " + remaining);
		sc.close();
	}
}