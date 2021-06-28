package code.random;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MaitrishCode {

	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println(n + " is an invalid size");
			return;
		}
		System.out.println("Enter the numbers");
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < n; i++) {
			int no = sc.nextInt();
			if (no == 0) {
				System.out.println("0 is an invalid element");
				return;
			}
			if (map.containsKey(no))
				map.put(no, map.get(no) + 1);
			else
				map.put(no, 0);
		}
		int diff = 0;
		int idx = 0;
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			int value = entry.getValue();
			if (value == 1) {
				value = -value;
			}
			map.put(entry.getKey(), value);
			if (idx == 0) {
				diff = value;
			}
			else {
				diff -= value;
			}
			idx++;
		}
		System.out.println(diff);
	}
}
