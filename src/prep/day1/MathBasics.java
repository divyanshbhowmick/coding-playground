package prep.day1;

public class MathBasics {
    /**
     * - AP or Sum of N natural numbers: (n * (n+1))/2 -> Gauss Theorem
     * - [a,b] -> a and b are included
     * - (a,b) -> a and b are excluded
     * - [3,10] -> no of elements = right - left + 1 => 10 - 3 + 1 = 8 elements
     * - Iteration -> No of times a loop is run
     * - GP (Geometric Progression) -> Series: a, a *r, a *r^2, a *r^3... a *r^n; Ex: 1 10 100 1000 (Common ratio is 10)
     *     Sum of GP = (a (r^n - 1)) / (r-1)
     * - Best way to compare two algorithms is No of Iterations not the Execution time since Execution time depends on
     *   a lot of factors. (language etc)
     */

    public static void main(String[] args) {

        // No of iterations in the below loop is: [1 N] = N - 1 + 1 = N iterations
        int N=100;
        for (int i = 0; i <= N; i++);
    }
}
