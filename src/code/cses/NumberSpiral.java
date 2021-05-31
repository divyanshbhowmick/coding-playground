
package code.cses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class NumberSpiral {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Taking the input for n testcases
		long n = Long.parseLong(br.readLine().trim());

		while (n-- > 0) {
			String val[] = br.readLine().trim().split(" ");
			long x = Long.parseLong(val[1]), y = Long.parseLong(val[0]);

			if (y > x) {
				if (y % 2 == 0)
					System.out.println(y * y - x + 1);
				else
					System.out.println((y - 1) * (y - 1) + x);
			} else {
				if (x % 2 != 0)
					System.out.println(x * x - y + 1);
				else
					System.out.println((x - 1) * (x - 1) + y);

			}
		}

	}

}
