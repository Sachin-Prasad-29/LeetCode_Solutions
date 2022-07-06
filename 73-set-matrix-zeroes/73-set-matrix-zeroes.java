class Solution {
    public void setZeroes(int[][] matrix) {
        // with O(1) space
        
        boolean firstR = false;
        boolean firstC = false;
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        for(int i = 0 ; i < n;i++ ){
            for(int j = 0 ; j < m ;j++){
                if( matrix[i][j] == 0){
                    if(i == 0) 
                        firstR = true;
                    if(j == 0)
                        firstC = true;
                    
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        for(int i = 1 ; i < n ; i++){
            for( int j = 1 ; j <m ; j++ ){
                if( matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] =0;
                }
            }
        }
        
        if(firstR){
            for(int j = 0; j < m ;j++){
                matrix[0][j] =0;
            }
        }
         if(firstC){
            for(int i = 0; i < n ;i++){
                matrix[i][0] =0;
            }
        }
        
        
        // with O(m+n) space
//         int n = matrix.length;
//         int m = matrix[0].length;
//         int[] row = new int[n];
//         int[] col = new int[m];
        
//         for(int i = 0 ; i < n; i++)
//             for( int j = 0 ; j < m ; j++){
//                 if(matrix[i][j] == 0){
//                     row[i] = 1;
//                     col[j] = 1;
//                 }
//             }
        
        
//         System.out.println(Arrays.toString(row));
//         System.out.println(Arrays.toString(col));
        
//         for(int i = 0 ; i < n ;i++){
//             if(row[i] ==1){
//                 for(int j = 0 ; j < m; j++){
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
        
//         for(int j = 0 ; j < m ;j++){
//             if(col[j] ==1){
//                 for(int i = 0 ; i < n; i++){
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
    }
}