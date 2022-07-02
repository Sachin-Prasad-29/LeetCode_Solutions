class Solution {
    public int maxArea(int hei, int wid, int[] hCut, int[] vCut) {
         int geth = getMax(hei,hCut);
         int getW = getMax(wid, vCut);
        
        return (int)((long)geth *getW % 1000000007);
        
    }
    
    private static int getMax(int val, int[] cut){
        Arrays.sort(cut);
        int maxgap = 0;
        int prevVal =0;
        for(int i : cut){
            maxgap = Math.max( maxgap, i- prevVal);
            prevVal = i;
        }
        System.out.println( Math.max(val-prevVal,maxgap) );
        return Math.max(val-prevVal,maxgap);
    }
    	
}