class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] ans = new int[2];
        int i = 0;
        int j = n-1;
        while(i < j){
            int res = numbers[i] + numbers[j];
            if(res == target){
              ans[0] = i+1;
              ans[1] = j+1;
              break;
            } 
            if(res > target) j = j-1;
            else i=i+1;
        }
       return ans; 
    }
}