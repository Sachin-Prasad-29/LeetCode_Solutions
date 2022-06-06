class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i = 0;
        int j = n-1;
        while(i < j){
            int res = numbers[i] + numbers[j];
            if(res == target) break;
            if(res > target) j = j-1;
            else i=i+1;
        }
       return new int[]{i+1,j+1}; 
    }
}