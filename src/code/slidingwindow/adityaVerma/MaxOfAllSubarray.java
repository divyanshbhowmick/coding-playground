package code.slidingwindow.adityaVerma;

import java.util.*;
import java.util.stream.Collectors;

public class MaxOfAllSubarray {
    public static void main(String[] args) {
//        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int[] arr = {1, 3, 1, 2, 0, 5};
        int[] result = maxSlidingWindow(arr, 3);
        String s = Arrays.stream(result)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println(s);
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        return maxOfAllSubArray(nums, k);
    }

    private static int[] maxOfAllSubArray(int[] arr, int k) {
        int i = 0, j = 0, ii = 0;
        int[] result = new int[arr.length - k + 1];
        LinkedList<Integer> queue = new LinkedList<>();

        while (j < arr.length) {
            while (!queue.isEmpty() && queue.getLast() < arr[j]) {
                queue.removeLast();
            }
            queue.addLast(arr[j]);

            if (j - i + 1 < k) j++;

            else if (j - i + 1 == k) {
                result[ii] = queue.getFirst();
                if (queue.getFirst().equals(arr[i])) queue.removeFirst();
                i++;
                j++;
                ii++;
            }
        }
        return result;
    }
}
