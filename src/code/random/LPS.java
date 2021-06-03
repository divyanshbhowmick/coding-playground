package code.random;

import java.util.Arrays;

class LPS {

	public static void main(String args[]) {
		System.out.println(longestPrefixSuffix("aabcdaabc")); // 4
		System.out.println(longestPrefixSuffix("abcab")); // 2
		System.out.println(longestPrefixSuffix("abbaacd$dcaabba")); // 2
		System.out.println(longestPrefixSuffix("amanaplanacanal$lanacanalpanama")); // 2
		System.out.println(longestPrefixSuffix("ekabba$abbake")); // 2
	}

	public static int longestPrefixSuffix(String str) {
		int lps[] = new int[str.length()];

		// As the LPS of zero is zero becuase there will be no prefix
		lps[0] = 0;

		for (int i = 1; i < str.length(); i++) {
			int x = lps[i - 1];
			while (str.charAt(x) != str.charAt(i)) {
				if (x == 0) {
					x = -1;
					break;
				}
				x = lps[x - 1];
			}
			lps[i] = x + 1;
		}

		int largest = lps[0];
		for (int i = 0; i < lps.length; i++) {
			if (lps[i] > largest)
				largest = lps[i];
		}
		Arrays.stream(lps).forEach(System.out::print);
		System.out.println();
		return largest;
	}
}