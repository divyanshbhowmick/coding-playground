import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class NearestGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<Integer>();
        int n = nums.length;
        int nge[] = new int[n];
        for(int i = 2*n -1; i>=0; i--) {
            while(!stack.isEmpty() && stack.peek() <= nums[i % n]) stack.pop();
            if(i<n) {
                if(stack.isEmpty()) nge[i] = -1;
                else nge[i] = stack.peek();
            }
            stack.push(nums[i % n]);
        }
        return nge;
    }
    public static void main(String ar[]) {
        Map<String, Object> map = new HashMap<>();
        System.out.println(map.get("count"));
    }
}