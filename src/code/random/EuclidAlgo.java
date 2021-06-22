package code.random;

import java.util.Scanner;

/**
 * EuclidAlgo
 */
public class EuclidAlgo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = gcd_euclid(a, b);

        System.out.println(gcd);

        sc.close();
    }

    public static int gcd_euclid(int a, int b) {

        // Just to start with the bigger number at the first place
        if (b > a) return gcd_euclid(b, a);

        // Base case gcd(a, 0) = a
        if (b == 0) return a;

        return gcd_euclid(b, a%b);
    }
}