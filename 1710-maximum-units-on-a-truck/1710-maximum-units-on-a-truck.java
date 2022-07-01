class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
       // Arrays.sort(boxTypes, (a,b) ->{return a[1]<b[1]? 1:-1;});
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
         int maxUnit = 0;
        
        for(int i = 0 ; i < boxTypes.length;i++){
             if(truckSize == 0) break;
             if(boxTypes[i][0] > truckSize){
                   maxUnit += (truckSize*boxTypes[i][1]);
                   truckSize = 0;
             }
             else{
                   maxUnit += (boxTypes[i][0]* boxTypes[i][1]);
                   truckSize -= boxTypes[i][0];
              }
        }
        return maxUnit;
    }
}