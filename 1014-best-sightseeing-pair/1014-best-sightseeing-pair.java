class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n = values.length;
        int maxStart = 0 ;
        int End = 0;
        int result = Integer.MIN_VALUE;
        for(int i = 0,j=1; i < n-1 && j < n;j++,i++){
            maxStart = Math.max(maxStart,values[i]+i);
            End = values[j]-j;
            result = Math.max(result,maxStart+End);
        }
        return result;
    }
}