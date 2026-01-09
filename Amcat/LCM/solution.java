public class solution {
	public static void main(String[] args) {
        System.out.println(lcm(12,18));
    }
    public static int lcm(int a, int b) {
        int g = Math.max(a,b);
        int s = Math.min(a,b);
		int x = g;
		int y = s;
        while (s != 0){ 

            int r = g % s;
            g = s;
            s = r;
            
        }
		return (x * y) / g;
    }
}
