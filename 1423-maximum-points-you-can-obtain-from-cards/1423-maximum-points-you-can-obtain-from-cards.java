class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        for(int i = 1 ; i < n; i++){
            cardPoints[i] = cardPoints[i]+cardPoints[i-1];
        }
        int total = cardPoints[n-1];
        int window = n-k;
        int i = 0;
        int j = window;
        if(window == 0) return total;
        int minSofar = cardPoints[j-1];
        System.out.println(i + "  " + j + "  " + total + " " +minSofar);
        while(j < n){
            
            minSofar = Math.min(minSofar, cardPoints[j]-cardPoints[i]);
            j++;
            i++;
        }
        return total-minSofar;
    }
}