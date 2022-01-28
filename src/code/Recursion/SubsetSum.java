package code.Recursion;

import java.util.ArrayList;

public class SubsetSum {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        getSubsetSum(0, arr, 0, ans);
        return ans;
    }

    void getSubsetSum(int idx, ArrayList<Integer> arr, int sum, ArrayList<Integer> ans) {
        if (idx == arr.size()) {
            ans.add(sum);
            return;
        }
        // pick the element
        getSubsetSum(idx + 1, arr, sum + arr.get(idx), ans);
        // dont pick the element
        getSubsetSum(idx + 1, arr, sum, ans);
    }
}
