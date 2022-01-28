package code.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SubsetsII {

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // getSubsetsWithDup(0, nums, new ArrayList<Integer>(), ans, true);
        getSubsetsWithDup2(0, nums, new ArrayList<Integer>(), ans, true);
        return ans;
    }

    public static void getSubsetsWithDup(int idx, int[] nums, final List<Integer> temp, List<List<Integer>> ans,
            boolean isPicked) {
        if (idx == nums.length) {
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        // Condition to check, if the index is zero or consecutive elements are not same
        // or the element is already picked then take both the choices,

        if (idx == 0 || nums[idx] != nums[idx - 1] || isPicked == true) {
            temp.add(nums[idx]);
            getSubsetsWithDup(idx + 1, nums, temp, ans, true);
            temp.remove(temp.size() - 1);
        }

        getSubsetsWithDup(idx + 1, nums, temp, ans, false);
    }

    public static void getSubsetsWithDup2(int idx, int[] nums, final List<Integer> temp, List<List<Integer>> ans,
            boolean isPicked) {
        if (idx == nums.length) {
            ans.add(new ArrayList<Integer>(temp));
            return;
        }

        getSubsetsWithDup2(idx + 1, nums, temp, ans, false);
        if (idx >= 1 && nums[idx] == nums[idx - 1] && !isPicked)
            return;
        temp.add(nums[idx]);
        getSubsetsWithDup2(idx + 1, nums, temp, ans, true);
        temp.remove(temp.size() - 1);
        return;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2 };
        System.out.println(subsetsWithDup(arr));
    }

}
