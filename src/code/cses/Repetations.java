package code.cses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Repetations {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Taking the input for n characters
		char arr[] = br.readLine().toCharArray();

		int c = 0, h = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1])
				c++;
			else {
				if (c > h) {
					h = c;
				}
				c = 0;
			}
		}
		if (c >= h)
			System.out.print(c + 1);
		else
			System.out.print(h + 1);
	}
}