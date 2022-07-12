import java.util.*;
import java.util.Collections; 
class Solution {
    public boolean makesquare(int[] ms) {
       int n = ms.length;
       int totalSum = 0;
       for(int i = 0;i < n ;i++){
            totalSum += ms[i];
       }
        if(totalSum % 4 != 0) return false;
        
 
        Integer[] mss = new Integer[n];
 
        for (int i= 0 ; i <n ; i++) {
          mss[i] = ms[i];
        }
 
        int eachSide = totalSum/4;
        Arrays.sort(mss, Collections.reverseOrder()); 
 
        return dfs(0,new int[4],eachSide,mss);
        
    }
    private static boolean dfs( int index,int[] currSum, int eachSide, Integer[] ms){
        if(index == ms.length){
            return true;
        }
        for(int i = 0 ; i < 4 ;i++){
            if(currSum[i] + ms[index] <= eachSide){
                 currSum[i] += ms[index];
                 if(dfs(index+1, currSum, eachSide, ms))
                     return true;
                currSum[i] -= ms[index];
            }    
        }
        return false;
    }
    
}