package code.cses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TrailingZeros {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long sum = 0;
        for (long i = 5; i <= n; i *= 5) {
            sum += n/i;
        }
        System.out.println(sum);
    }
}