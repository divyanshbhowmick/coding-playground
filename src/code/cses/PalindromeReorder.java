package code.cses;

import java.io.BufferedReader;
import java.lang.StringBuffer;
import java.io.IOException;
import java.io.InputStreamReader;

class PalindromeReorder {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int lookup[] = new int[26];
        for (int i=0; i<s.length(); i++){
            lookup[s.charAt(i) - 'A']++;
        }
        int oddCount = 0;
        for (int i=0; i<lookup.length; i++){
            if ((lookup[i] & 1) == 1) {
                oddCount++;
            }
        }
        StringBuffer sb = new StringBuffer();
        if (oddCount > 1 ) {
            System.out.println("NO SOLUTION");
            return;
        }
        for (int i = 0; i < 26; i++) {
            if ((lookup[i] & 1) == 0) {
                for (int j = 0; j < lookup[i]/2; j++) {
                    sb.append((char)(i+'A'));
                }
            }
        }
        System.out.print(sb.toString());
        for (int i = 0; i < 26; i++) {
            if ((lookup[i] & 1) == 1) {
                for (int j = 0; j < lookup[i]; j++) {
                    System.out.print((char)(i+'A'));
                }
            }
        }
        System.out.print(sb.reverse().toString());
    }
}