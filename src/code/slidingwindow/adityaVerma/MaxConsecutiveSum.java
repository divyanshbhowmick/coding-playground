package code.slidingwindow.adityaVerma;

public class MaxConsecutiveSum {

    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 3, 4, 5, -1};
        System.out.println(maxConsecutiveSum(arr, 7));
        System.out.println(maxConsecutiveSumBruteForce(arr, 7));
    }

    private static int maxConsecutiveSum(int[] arr, int k) {
        int i = 0, j = 0, sum = 0, maxSum = 0;

        while (j < arr.length) {
            sum += arr[j];

            // waiting till we find the window of size k
            if (j - i + 1 < k) {
                j++;
            }
            // Once we find the window of size is equal to k do the calculation (which can be anything, here sum)
            else if (j - i + 1 == k) {
                maxSum = Math.max(maxSum, sum);
                // Only removing arr[i] but not adding arr[j] since it's already added at the top
                sum -= arr[i];
                i++;
                j++;
            }
        }

        return maxSum;
    }

    private static  int maxConsecutiveSumBruteForce(int[] arr, int k) {
        int max = 0;
        for(int i = 0; i < arr.length - k + 1; i++) {
            int sum = 0;
            for(int j = i; j < i + k; j++){
                sum+=arr[j];
            }
            max = Math.max(sum, max);
        }
        return max;
    }
}
