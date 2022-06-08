class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[][] dummy = new int[m][n];
        for(int i=0;i < m;i++){
            for(int j = 0 ; j < n;j++){
              dummy[i][j] = matrix[i][j];
            }
        }
        
        for(int i = 0 ; i < m; i++){
            for(int j = 0 ; j < n; j++){
                if(dummy[i][j] == 0){
                    for(int k = 0; k < m; k++)
                        matrix[k][j] = 0;
                    for(int k = 0; k < n; k++)
                        matrix[i][k] =0;
                }
            }
        }
        
    }
}