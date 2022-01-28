package code.searching;

import java.util.ArrayList;

public class FirstAndLastPosSorterdArray {

    public static void main(String ar[]) {
        int nums[] = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        ArrayList<Integer> result = new ArrayList<Integer>();
        findAllElements(nums, 0, nums.length - 1, target, result);
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int n : result) {
            if (min >= n)
                min = n;
            if (max <= n)
                max = n;
        }
        System.out.println("min: " + min + " max: " + max);
        System.out.println(result);
    }

    public static void findAllElements(int arr[], int s, int e, int target, ArrayList<Integer> result) {
        if (s > e) {
            return;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] > target) {
            findAllElements(arr, s, mid - 1, target, result);
        } else if (arr[mid] < target) {
            findAllElements(arr, mid + 1, e, target, result);
        } else {
            result.add(mid);
            findAllElements(arr, s, mid - 1, target, result);
            findAllElements(arr, mid + 1, e, target, result);
        }
        return;
    }

    public static int getMinOrMax(int arr[], int target, boolean isMin) {
        // Just think like you need to solve it single handed ly one time for min value
        // and one time for max value (index)..
        int s = 0, e = arr.length - 1, mid, result = -1;
        while (s <= e) {
            mid = s + (e - s) / 2;
            if (arr[mid] > target) {
                e = mid - 1;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                result = mid;
                if (isMin) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }
        return result;
    }
}
