class Solution {
    public int[][] transpose(int[][] matrix) {
        int N = matrix.length;
        int M = matrix[0].length;
        int[][] newMatrix = new int[M][N];
        
        for(int i = 0 ; i < N; i++){
            for(int j = 0 ; j < M; j++){
                newMatrix[j][i] = matrix[i][j];
            }
        }
        return newMatrix;
    }
}