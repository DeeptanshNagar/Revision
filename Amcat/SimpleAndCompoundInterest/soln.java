import java.util.Scanner;

public class soln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p = sc.nextDouble();
        double r = sc.nextDouble(); 
        double t = sc.nextDouble(); 

        // Simple Interest
        double si = (p * r * t) / 100;

        // Compound Interest
        double ci = p * Math.pow((1 + r / 100), t) - p;

        System.out.println("Simple Interest = " + si);
        System.out.println("Compound Interest = " + ci);
    }
}