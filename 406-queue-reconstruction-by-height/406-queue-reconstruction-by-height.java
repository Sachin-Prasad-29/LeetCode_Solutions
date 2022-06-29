class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a,b) ->{
           return b[0]!=a[0]?b[0]-a[0]:a[1]-b[1]; 
        });
        
        int[][] ans = new int[people.length][2];
        for(int[] an: ans)
            Arrays.fill(an,-1);
        
        for(int[] arr:people){
           insert(ans,arr[1],arr);
        }
        
        return ans;
    }
    public static void  insert(int[][] ans, int loc, int[] ele){
        if(ans[loc][0] == -1) {
            ans[loc] = ele;
            return ;
        }
        else{
            for(int i = ans.length-2; i >= loc; i--){
                ans[i+1] = ans[i];
            }
            ans[loc] = ele;
            return ;
        }
    }
}