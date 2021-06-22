package code.cses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TowerOfHanoi {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println((1<<n) - 1);
        toh(1, 2, 3, n);
    }

    public static void toh(int a, int b, int c, int n) {
        if (n == 0) return;
        toh(a, c, b, n - 1);
        System.out.println(a + " " + c);
        toh(b, a, c, n - 1);
    }
}