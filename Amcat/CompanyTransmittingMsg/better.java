import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class better {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		HashMap<Integer, Integer> mpp = new HashMap<>();

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			mpp.put(x, mpp.getOrDefault(x, 0) + 1);
		}

		System.out.println(mpp);
		int pairs = 0;
		for(Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
			pairs = pairs + entry.getValue() / 2;
		}
		int remaining = N - (pairs * 2);
		System.out.println(pairs + " " + remaining);
		sc.close();
    }
}
