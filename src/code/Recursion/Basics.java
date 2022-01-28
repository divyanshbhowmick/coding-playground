package code.Recursion;

import java.util.List;
import java.util.Stack;

public class Basics {
    // 0 1 1 2 3 5
    // 0 1 2 3 4 5

    // 0 1 1 2 3
    // 0 1 2 3 4
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 9, 5 };
        // reverseArray(arr,0,6);
        // for(int i: arr){
        // System.out.println(i);
        // }
        // System.out.println(binarySearch(arr, 0, 5, 9));
        // System.out.println(palindrome("PeoOeP", 0));
        // printSubsequence(0, arr, new Stack());
        // printSubsequenceWhoseSumDivisibleByK(0, arr, new Stack(), 0, 3);
        // System.out.println(countSubsequenceWhoseSumDivisibleByK(0, arr, new Stack(),
        // 0, 3));
        System.out.println(reverseNumber(1020));
        // System.out.println(isArraySorted(0, arr));
        // System.out.println(linearSearch(0, arr, 12));
    }

    public static int fun(int n) {
        if (n == 0)
            return 0;
        int val = fun(--n);
        System.out.println(n);
        return val;
    }

    public static int fibonaci(int n) {
        if (n <= 1)
            return n;
        return fibonaci(n - 1) + fibonaci(n - 2);
    }

    public static int reverseNumber(int n) {
        if (n / 10 == n)
            return n;
        return ((n % 10) * (int) Math.pow(10, String.valueOf(n).length() - 1)) + reverseNumber(n / 10);
    }

    public static void reverseArray(int arr[], int i, int n) {
        if (i >= n / 2)
            return;
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        reverseArray(arr, i + 1, n);
    }

    public static boolean isArraySorted(int idx, int arr[]) {
        if (idx == arr.length - 1)
            return true;

        return arr[idx] < arr[idx + 1] && isArraySorted(idx + 1, arr);
    }

    public static boolean linearSearch(int idx, int arr[], int target) {
        if (idx == arr.length - 1)
            return false;
        if (arr[idx] == target)
            return true;
        return linearSearch(idx + 1, arr, target);
    }

    public static boolean binarySearch(int arr[], int left, int right, int searchElement) {
        if (left > right)
            return false;
        int middle = (left + right) / 2;
        if (arr[middle] == searchElement)
            return true;
        else if (arr[middle] > searchElement)
            right = middle - 1;
        else
            left = middle + 1;
        return binarySearch(arr, left, right, searchElement);
    }

    // Stack space complexity will be O(n/2) as we are only going till halfway
    // T.C will be O(n/2) as we are only goign halfway
    public static boolean palindrome(String s, int start) {
        int len = s.length();
        if (start == len / 2)
            return true;

        if (s.charAt(start) != s.charAt(len - start - 1))
            return false;

        return palindrome(s, start + 1);
    }

    // Printing subsequences / Subset
    // T.C: 2^n * n (n is for printing every susequqnece) , as every element has 2
    // choices either get selected or not selected, so 2 choices for n elemets
    // S.C : O(n) as max n opertaions will be in stack for opertaions..
    public static void printSubsequence(int idx, int arr[], Stack st) {
        if (idx == arr.length) {
            System.out.println(st);
            return;
        }
        st.push(arr[idx]);
        printSubsequence(idx + 1, arr, st);
        st.pop();
        printSubsequence(idx + 1, arr, st);
    }

    public static void printSubsequenceIterative(int arr[]) {

        for (int idx = 0; idx < arr.length; idx++) {
            // for()
        }
    }

    public static void printSubsequenceWhoseSumDivisibleByK(int idx, int arr[], Stack st, int sum, int k) {
        if (idx == arr.length) {
            if (sum % k == 0)
                System.out.println(st);
            return;
        }
        st.push(arr[idx]);
        sum += arr[idx];
        printSubsequenceWhoseSumDivisibleByK(idx + 1, arr, st, sum, k);
        st.pop();
        sum -= arr[idx];
        printSubsequenceWhoseSumDivisibleByK(idx + 1, arr, st, sum, k);
    }

    public static int countSubsequenceWhoseSumDivisibleByK(int idx, int arr[], Stack st, int sum, int k) {
        if (idx == arr.length) {
            if (sum % k == 0)
                return 1;
            return 0;
        }
        int count;
        st.push(arr[idx]);
        sum += arr[idx];
        count = countSubsequenceWhoseSumDivisibleByK(idx + 1, arr, st, sum, k);
        st.pop();
        sum -= arr[idx];
        count += countSubsequenceWhoseSumDivisibleByK(idx + 1, arr, st, sum, k);
        return count;
    }
}
