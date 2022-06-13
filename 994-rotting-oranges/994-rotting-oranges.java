class Solution {
    static int max ;
    public int orangesRotting(int[][] grid) {
         max = 0;
        int row = grid.length;
        int col = grid[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        
        for(int i = 0 ; i< row ; i++)
            for(int j = 0 ; j < col ; j++){
                if(grid[i][j] == 2){
                    int[] list = new int[3];
                    list[0] = i;
                    list[1] = j;
                    list[2] = 0;
                    queue.offer(list);
                }
            }
        
        while(!queue.isEmpty()){
            int[] arr = queue.poll();
            int i = arr[0];
            int j = arr[1];
            // for i-1
                if(i-1>=0)
                    if(grid[i-1][j] == 1)
                          put(i-1,j,queue,grid,arr);
                    
                
            // for i+1
                if(i+1<row)
                    if(grid[i+1][j] == 1)
                          put(i+1,j,queue,grid,arr);
            
            // for j-1
                 if(j-1>=0)
                    if(grid[i][j-1] == 1)
                          put(i,j-1,queue,grid,arr);
            // for j+1
                 if(j+1<col)
                    if(grid[i][j+1] == 1)
                          put(i,j+1,queue,grid,arr);
             
        }
        //System.out.println(Arrays.toString(queue.peek()));
        for(int[] g:grid)
            for(int x : g)
                if(x == 1) return -1;
        return max;
    }
    private static void put(int i, int j, Queue<int[]> queue,int[][] grid,int[] arr){
                        int[] a1 = new int[3];
                        a1[0] = i;
                        a1[1] = j;
                        a1[2] = arr[2]+1;
                        grid[i][j] = 2;
                        queue.offer(a1);
                        max = Math.max(max,a1[2]);
    }
}