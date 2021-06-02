package code.leetcode.junechallenge;

class Day1MaxAreaOfIsland {

    public static void main(String args[]){
        // maxAreaOfIsland();
    }
    public int maxAreaOfIsland(int[][] grid) {
        
        int max = 0;
        for (int i = 0; i < grid.length; i++){
            for(int j =0 ; j < grid[i].length; j++){
                if (grid[i][j] == 1) max = Math.max(max, dfs(grid, i, j));
            }
        }
        return max;
    }
    
    public int dfs(int [][] grid, int i, int j) {
        if(i < 0 || i >=grid.length || j < 0 || j >=grid[i].length || grid[i][j] == 0 ) return 0;
        
        // Just to mark that the node is visited. saving the space.
        grid[i][j] = 0;
        int count = 1;
        
        count += dfs(grid, i, j+1);
        count += dfs(grid, i, j-1);
        count += dfs(grid, i+1, j);
        count += dfs(grid, i-1, j);
        
        return count;
    }
}