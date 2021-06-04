package code.cses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class TwoSets {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());

		long sum = n * (n + 1) / 2;
		
		// Check if it's odd
		if ((sum & 1) == 1) {
			System.out.print("NO");
			return;
		}

		else {
			System.out.println("YES");

			List<Long> list1 = new ArrayList<Long>();
			List<Long> list2 = new ArrayList<Long>();

			sum /= 2L;

			while (n > 0) {
				if (sum - n >= 0) {
					list1.add(n);
					sum -= n;
				} else
					list2.add(n);
				n--;
			}

			System.out.println(list1.size());
			for (long no : list1)
				System.out.print(no + " ");

			System.out.println();

			System.out.println(list2.size());
			for (long no : list2)
				System.out.print(no + " ");
		}
	}
}