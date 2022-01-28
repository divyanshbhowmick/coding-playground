package code.Recursion;

public class Fibo {
    static int c = 0;

    public static void main(String[] args) {
        // fibo(5);
        // Using DP
        int N = 5;
        int memo[] = new int[N + 1];
        for (int i = 0; i <= N; i++)
            memo[i] = -1;
        fiboMemo(N, memo);
        System.out.println(c);
    }

    private static int fibo(int i) {
        c++;
        if (i <= 1) {
            return i;
        }
        return fibo(i - 1) + fibo(i - 2);
    }

    private static int fiboMemo(int i, int[] memo) {
        if (i <= 1) {
            memo[i] = i;
            return i;
        }
        if (memo[i] != -1)
            return memo[i];
        c++;
        memo[i] = fiboMemo(i - 1, memo) + fiboMemo(i - 2, memo);

        return memo[i];
    }
}
