import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class MaxAreaRectangle {
    public int largestRectangleArea(int[] heights) {
        
        Stack<Pair<Integer, Integer>> nsl = new Stack<Pair<Integer, Integer>>();
        Stack<Pair<Integer, Integer>> nsr = new Stack<Pair<Integer, Integer>>();       
        ArrayList<Integer> leftOffset = new ArrayList<Integer>();
        ArrayList<Integer> rightOffset = new ArrayList<Integer>();
        for(int i = 0; i < heights.length; i++) {
            while(!nsl.isEmpty() && nsl.peek().getKey() >= heights[i]) nsl.pop();
            if(nsl.isEmpty()) leftOffset.add(i);
            else leftOffset.add(i - nsl.peek().getValue() - 1);
            nsl.push(new Pair(heights[i], i));
        }
        
        for(int i = heights.length - 1; i >= 0; i--) {
            while(!nsr.isEmpty() && nsr.peek().getKey() >= heights[i]) nsr.pop();
            if(nsr.isEmpty()) rightOffset.add(heights.length - 1 - i);
            else rightOffset.add(nsr.peek().getValue() - i - 1);
            nsr.push(new Pair(heights[i], i));
        }

        Collections.reverse(rightOffset);
        int largest = 0;
        for(int i = 0; i < heights.length; i++) {
            int area = (rightOffset.get(i) + leftOffset.get(i) + 1) * heights[i];
            if(area > largest) largest = area;
        }
        return largest;
    }
}