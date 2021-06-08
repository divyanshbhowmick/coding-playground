import java.util.ArrayList;
import java.io.BufferedReader;
import java.lang.StringBuffer;
import java.io.IOException;
import java.io.InputStreamReader;

class GrayCode {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        ArrayList<String> nBitGrayCodes = getNBitGrayCode(n);
        for (String s : nBitGrayCodes) {
            System.out.println(s);
        }
    }
    
    public static ArrayList<String> getNBitGrayCode(long n) {
        if (n == 1) {
            ArrayList<String> result = new ArrayList<String>();
            result.add("0");
            result.add("1");
            return result;
        }
        ArrayList<String> prevResult = getNBitGrayCode(n - 1);
        ArrayList<String> result = new ArrayList<String>();

        for (int i = 0; i < prevResult.size(); i++) {
            result.add(new StringBuffer().append("0").append(prevResult.get(i)).toString());
        }
        
        for (int i = prevResult.size() - 1; i >= 0; i--) {
            result.add(new StringBuffer().append("1").append(prevResult.get(i)).toString());
        }
        return result;
    }
}