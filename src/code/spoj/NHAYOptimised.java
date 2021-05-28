package code.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NHAYOptimised {

	public static void main(String ar[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (br.readLine() != null) {
			String pattern = br.readLine();
			String text = br.readLine();
			int pos = text.indexOf(pattern);
			int flag = pos != -1 ? 1 : 0;
			// System.out.println(pattern + " " + text + " " + pos);
			while (pos != -1) {
				System.out.println(pos);
				pos = text.indexOf(pattern, pos + 1);
			}
			if (flag == 0)
				System.out.println();

		}

	}
}
