package code.random;

public class PatternMatchingBruteForce {

	public static void main(String[] args) {
		String s = "defff";
		String pat = "def";
		if (s.length() < pat.length()) {
			System.out.println(0);
			return;
		}
		int pos = 0, count = 0;
		for (int i = 0; i < s.length(); i++) {
			int j = i;
			while (s.charAt(j) == pat.charAt(pos)) {
				j++;
				pos++;
				if (pos == pat.length()) {
					pos = 0;
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}

}
