class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        
       Queue<ArrayList<Integer>> queue  = new LinkedList<>();
       int[][] sol = new int[row][col];
        
       for(int i = 0 ; i < row; i++)
            for(int j = 0 ; j < col;j++)
                if( mat[i][j] == 0){
                    ArrayList<Integer> tempList = new ArrayList<>();
                    // make sol array any 0 at i,j location
                    sol[i][j] = 0;
                    // enter its details into the queue
                    tempList.add(i);  tempList.add(j);  tempList.add(0);
                    queue.offer(tempList);  
                }
                else
                    sol[i][j] = -1;
            
        while(!queue.isEmpty()){
            ArrayList<Integer> list = queue.poll();
            System.out.println(list);
            // for i-1
             int i = list.get(0);
             int j = list.get(1);
            
               if(i-1 >= 0)
                  if(sol[i-1][j] == -1)
                      put(i-1,j,queue,sol,list);
                  
            // for i+1
               if(i+1 < row)
                   if(sol[i+1][j] == -1)
                      put(i+1,j,queue,sol,list);
                     
            // for j-1
               if(j-1 >= 0)
                   if(sol[i][j-1] == -1)
                      put(i,j-1,queue,sol,list);
                    
            // for j+1
               if(j+1 < col)
                   if(sol[i][j+1] == -1)
                      put(i,j+1,queue,sol,list);
                  
               
            
        }
        System.out.println(queue);
        return sol;
    }
    private static void put(int i, int j, Queue<ArrayList<Integer>> queue,int[][] sol,ArrayList<Integer> list){
          ArrayList<Integer> a1 = new ArrayList<>();
                      a1.add(i);
                      a1.add(j);
                      a1.add(list.get(2)+1);
                      queue.offer(a1);
                      sol[i][j] = a1.get(2);  
    }
}




