class Solution {
    public List<List<Integer>> combine(int n, int k) {
          List<List<Integer>> ans = new ArrayList<>();
          List<Integer> list = new ArrayList<>();
          getAllCombination(n,list,k,ans);
        return ans;
    }
    private static void getAllCombination(int n, List<Integer> list,int k , List<List<Integer>> ans){
        if(list.size() == k ){
            ans.add(new ArrayList(list));
            return ;
        }
        if( n == 0){
            return; 
        }
        
        list.add(n);
        getAllCombination(n-1,list,k,ans);
        list.remove(list.size()-1);
        getAllCombination(n-1,list,k,ans);
    }
}