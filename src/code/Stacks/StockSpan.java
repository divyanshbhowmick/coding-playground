import java.util.Stack;

// Variation of NGL only.. 
// Extra step needed is that we neede to store the index of NGL and then substract the NGL index from the price index it will give the result
class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        Stack<Pair<Integer, Integer>> stack = new Stack<Pair<Integer, Integer>>();
        int result[] = new int[price.length];
        for(int i = 0; i < price.length; i++) {
            while(!stack.isEmpty() && stack.peek().getValue() <= price[i])  stack.pop();
            if(!stack.isEmpty()) result[i] = i - stack.peek().getKey();
            else result[i] = i + 1;
            stack.push(new Pair(i, price[i]));
        }
        return result;
    }
    
}


// /**
//  * Second Approach:
//  *       int count = 0;
//          for(int i=stocks.size() - 1; i >= 0; i--){
//             System.out.print(i);
//             if(stocks.get(i) > price) break;
//             else count++;
//          }
//         stocks.add(price);
//         return count + 1;
//  * 
//  **/

//  /**
//   * 
//   Third approach 
//   * if(stocks.size() == 0) {
//             stocks.add(price);
//             stack.add(price);
//             return 1;
//         }
        
//         int offset=0;  
//         stocks.add(price);
//         while(!stack.isEmpty() && stack.peek() <= price) stack.pop();
        
//         if(stack.isEmpty()) {
//             stack.push(price);
//             return stocks.size();
//         }
//         if(stack.peek() > price) {
//             offset = stocks.indexOf(stack.peek());
//             stack.push(price);
//             return stocks.size() - offset - 1;
//         }
        
//         stack.push(price);
//         return 1;
//   */
