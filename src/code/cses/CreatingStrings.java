import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class CreatingStrings {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : str.toCharArray()) {
			if (map.containsKey(ch)) map.put(ch, map.get(ch) + 1);
			else map.put(ch, 1);
		}
		createString(1, str.length(), map, "");
	}

	public static void createString(int cs, int ts, HashMap<Character, Integer> map, String as) {
		if (cs > ts) {
			System.out.println(asf);
		}
		for (char ch :  map.keySet()) {
			if (map.get(ch) > 0) {
				map.put(ch, map.get(ch) - 1);
				createString(cs + 1, ts, map, asf + ch);
			}
		}

	}
}