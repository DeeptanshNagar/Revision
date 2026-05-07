public class solution {
	public static void main(String[] args) {
        System.out.println(lcm(12,18));
    }
    public static int lcm(int a, int b) {
        int g = Math.max(a,b); // 18
        int s = Math.min(a,b); // 12
		int x = g; // 18
		int y = s; // 12
        while (s != 0){ 

            int r = g % s; // 18 % 12
            g = s;
            s = r;
            
        }
		int lcm = x * y / g;
		return lcm;
    }
}
