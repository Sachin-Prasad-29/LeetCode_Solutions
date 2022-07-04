class Solution {
    public int candy(int[] r) {
        int n = r.length;
        int[] sol = new int[n];
        Arrays.fill(sol,1);
        
        for(int i = 1 ; i < n ; i++){
            if(r[i] > r[i-1]){
                sol[i] = sol[i-1] +1;
            }
        }
        for(int i = n-2 ; i >=0 ; i--){
            if(r[i] > r[i+1]){
                sol[i] = Math.max(sol[i+1]+1,sol[i]);
            }
        }
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            ans += sol[i];
        }
        return ans;
    }
}