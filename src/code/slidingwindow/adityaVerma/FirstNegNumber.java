package code.slidingwindow.adityaVerma;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegNumber {

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        printFirstNegativeNumberInWindowK(arr, 3);
        printFirstNegativeNumberInWindowKBruteForce(arr, 3);
    }

    private static void printFirstNegativeNumberInWindowK(int[] arr, int k) {

        Queue<Integer> queue = new LinkedList<>();

        int i = 0, j = 0;

        while (j < arr.length) {
            // this part only handles calculation for arr[j]
            // here it tracks all the negative numbers and stores it in a queue.
            if (arr[j] < 0) {
                queue.add(arr[j]);
            }
            // this part is to increase the pointer to get the sliding window.
            if (j - i + 1 < k) {
                j++;
            }
            // This part is where the calculations for arr[i] happens (this is the window where we do the calculation)
            else if (j - i + 1 == k) {
                // if queue is empty means there was no negative number in that interval.
                if (queue.isEmpty()) {
                    System.out.println(0);
                    break;
                }
                // Print the number which is at the head of the list. that's the first negative for that window.
                System.out.println(queue.peek());
                // cleanup: if we see that the first number for that window is equal to the first element in queue.
                // this is done to remove the calculations of arr[i]
                if (arr[i] == queue.element()) queue.remove();
                i++;
                j++;
            }
        }
    }

    private static void printFirstNegativeNumberInWindowKBruteForce(int[] arr, int k) {
        int max = 0;
        for (int i = 0; i < arr.length - k + 1; i++) {
            for (int j = i; j < i + k; j++) {
                if (arr[j] < 0) {
                    System.out.println(arr[j]);
                    break;
                } else if (j == i + k - 1) {
                    System.out.println(0);
                }
            }
        }
    }
}
