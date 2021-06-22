package code.cses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CoinPiles {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            String s[] = br.readLine().split(" ");
            long n1 = Long.parseLong(s[0]), n2 = Long.parseLong(s[1]);
            if ((n1 + n2) % 3 == 0 && 2 * n1 >= n2 && 2 * n2 >= n1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}