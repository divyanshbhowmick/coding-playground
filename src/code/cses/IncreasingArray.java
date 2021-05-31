package code.cses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IncreasingArray {
	public static void main(String ar[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String arr[] = br.readLine().split(" ");
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(arr[i]);
		}

		long moves = 0;
		for (int i = 1; i < n; i++) {
			if (array[i - 1] > array[i]) {
				moves += Math.abs(array[i - 1] - array[i]);
				array[i] = array[i - 1];
			}
		}
		System.out.println(moves);

	}
}
