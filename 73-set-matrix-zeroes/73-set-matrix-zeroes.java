class Solution {
    public void setZeroes(int[][] matrix) {
        // with O(m+n) space
        int n = matrix.length;
        int m = matrix[0].length;
        int[] row = new int[n];
        int[] col = new int[m];
        
        for(int i = 0 ; i < n; i++)
            for( int j = 0 ; j < m ; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        
        
        System.out.println(Arrays.toString(row));
        System.out.println(Arrays.toString(col));
        
        for(int i = 0 ; i < n ;i++){
            if(row[i] ==1){
                for(int j = 0 ; j < m; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        
        for(int j = 0 ; j < m ;j++){
            if(col[j] ==1){
                for(int i = 0 ; i < n; i++){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}