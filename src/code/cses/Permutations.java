package code.cses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Permutations {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Taking the input for n characters
		long n = Long.parseLong(br.readLine().trim());
		if (n == 1) {
			System.out.print("1");
			return;
		}
		if (n < 4) {
			System.out.println("NO SOLUTION");
			return;
		}
		StringBuilder even = new StringBuilder();
		StringBuilder odd = new StringBuilder();

		for (long i = 1; i <= n; i++) {
			if (i % 2 == 0)
				even.append(i).append(' ');
			else
				odd.append(i).append(' ');
		}

		Arrays.stream(even.toString().trim().split(",")).forEach((k) -> {
			System.out.print(k + " ");
		});
		Arrays.stream(odd.toString().split(",")).forEach((k) -> {
			System.out.print(k + " ");
		});

	}
}