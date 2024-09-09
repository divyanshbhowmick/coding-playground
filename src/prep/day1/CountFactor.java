package prep.day1;

import java.util.stream.IntStream;

/**
 * Count the number of factors
 */

public class CountFactor {

    public static void main(String[] args) {
//        System.out.println(countFactor1(30));
//        System.out.println(countFactor2(30));
//        System.out.println(countFactor3(30));
        StringBuilder s1 = new StringBuilder("abc");
        String s2 = s1.toString();
        s2 = "bcd";
        System.out.println(s1.toString() + " " + s2);
        new Thread(()->{
            s1.append("+sdf");
            System.out.println(s1.toString());
        }).start();
        System.out.println(s1.toString() + " " + s2);
    }

    /**
     * Logic: i <= n
     *
     * @param no
     * @return
     */
    private static int countFactor1(int no) {
        if (no == 0) return 0;
        int factors = 0;
        for (int i = 1; i <= no; i++) {
            if (no % i == 0) factors++;
        }
        return factors;
    }

    /**
     * Logic i < n/2, ans = count + 2
     *
     * @param no
     * @return
     */
    private static int countFactor2(int no) {
        if (no == 0) return 0;
        int factors = 0;
        for (int i = 1; i < (no / 2); i++) {
            if (no % i == 0) factors++;
        }
        return factors + 2;
    }

    /**
     * Logic: i <= Math.sqrt(no), ans = count * 2 OR ans = count + 1 (when i = n/i) else count+=2
     *
     * @param no
     * @return
     */
    private static int countFactor3(int no) {
        if (no == 0) return 0;
        int factors = 0;
        for (int i = 1; i <= (int) Math.sqrt(no); i++) {
            if (no % i == 0) {
                // Factors is increased by one for the equal case else it is increased by 2
                if (i == no / i) factors++;
                else factors += 2;
            }
        }
        return factors;
    }
}
