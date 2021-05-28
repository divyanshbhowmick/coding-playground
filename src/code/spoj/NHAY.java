package code.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NHAY {

	public static void main(String ar[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (br.readLine() != null) {
//			if (count % 3 == 0) {
//				text = s;
//				List<Integer> pos = getPosition(text, pattern);
//				if(pos.size() > 0) for (Integer no : pos) System.out.println(no);
//				else System.out.println();
//				
//			} else if (count % 2 == 0)
//				pattern = s;
//			count++;
			String pattern = br.readLine();
			String text = br.readLine();
			List<Integer> pos = getPosition(text, pattern);
			if(pos.size() > 0) for (Integer no : pos) System.out.println(no);
			else System.out.println();
		}
	}

	public static List<Integer> getPosition(String text, String pattern) {
		List<Integer> pos = new ArrayList<Integer>();
		if( pattern.length() > text.length() ) return pos;
		String transformmedString = pattern + "$" + text;
		int lps[] = new int[transformmedString.length()];
		lps[0] = 0;
		for (int i = 1; i < transformmedString.length(); i++) {
			int x = lps[i - 1];

			while (transformmedString.charAt(i) != transformmedString.charAt(x)) {
				if (x == 0) {
					x = -1;
					break;
				}
				x = lps[x - 1];
			}
			lps[i] = x + 1;
			if (lps[i] == pattern.length())
				pos.add((i + 1 - (2 * pattern.length() + 1)));
		}
		return pos;

	}
}
