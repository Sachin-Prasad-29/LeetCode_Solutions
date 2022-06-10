class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row_len = grid.length;
        int col_len = grid[0].length;
        int max_Area = 0;
        for(int i = 0 ; i < row_len; i++){
            for(int j = 0 ; j < col_len; j++){
               if(grid[i][j] == 1){
                   int temp_Area = dfs(grid,i,j);
                   max_Area = Math.max(max_Area,temp_Area);
               }
            }
        }
        return max_Area;
    }
    private static int dfs(int[][] grid,int i , int j){
        if( i <0 || i > grid.length-1 || j < 0 || j > grid[0].length-1)
            return 0;
        int area = 0;
        if(grid[i][j] == 1){
            grid[i][j] = 2;
            area = 1+dfs(grid,i-1,j)+dfs(grid,i+1,j)+dfs(grid,i,j-1)+dfs(grid,i,j+1);
        }
        return area;
    }
}