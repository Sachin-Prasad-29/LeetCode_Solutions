class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        int[] freq = new int[n];
        List<Integer> list = new ArrayList<>();
        getAllPermutation(nums,freq,list,ans);
        return ans;
    }
    private static void getAllPermutation(int[] nums,int[] freq,List<Integer> list,List<List<Integer>> ans){
        if(list.size() == nums.length){
                ans.add(new ArrayList(list));
              return ;
        }
        
        for(int i = 0 ; i < nums.length; i++){
            if(freq[i]  == 0 ){
                freq[i] = 1;
                list.add(nums[i]);
                getAllPermutation( nums,freq, list,ans);
                freq[i] =0;
                list.remove(list.size() -1);
            }
        }
        
    }
}