package code.slidingwindow.striver;

public class MaxConsecutiveSum {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 3, 4, 5, -1};
        System.out.println(getMaxConsecutiveSum(arr, 7));
    }

    static int getMaxConsecutiveSum(int arr[], int k) {

        // invalid scenario
        if(arr.length < k) return -1;

        int sum = 0;

        // Compute the sum for first window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum, r = k, l = 0;

        // Tak
        while (r < arr.length) {
            sum = sum - arr[l] + arr[r];
            maxSum = Math.max(maxSum, sum);
            l++;
            r++;
        }

        return maxSum;
    }
}
