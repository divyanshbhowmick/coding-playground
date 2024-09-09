package prep.day1;

import java.util.HashSet;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,6,7,8,9,10};
        System.out.println(findDuplicate(arr));
        System.out.println(findDuplicate1(arr));
    }

    // T.C: O(N); S.C: O(1); it will fail for [2,2,2,2] (more than 2 occurences)
    private static int findDuplicate(int[] arr) {
        int totalSum = 0;
        int N = arr.length - 1;
        for(int i : arr) totalSum+=i;
        int actualSum = (N * (N + 1)) / 2;
        return totalSum - actualSum;
    }

    // T.C: O(N); S.C: O(N)
    private static int findDuplicate1(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: arr) {
            if(set.contains(i)) return i;
            set.add(i);
        }
        return -1;
    }
}
