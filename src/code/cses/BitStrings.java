package code.cses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BitStrings {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		long INF = (long) 1e9 + 7;
		long res = (long) Math.pow(2, n) % INF;
		System.out.println(res);
	}
}