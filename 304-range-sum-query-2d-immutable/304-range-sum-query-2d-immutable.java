class NumMatrix {
    static int[][] t;
    public NumMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        t = new int[row+1][col+1];
        for(int i = 1; i < row+1; i++){
             int prefix = 0;
             for(int j = 1; j < col+1; j++){
                    prefix += matrix[i-1][j-1];
                    t[i][j] = prefix+t[i-1][j];
             }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++; row2++; col1++; col2++;
        
        int ans = t[row2][col2];
        int top = t[row1-1][col2];
        int left = t[row2][col1-1];
        int above = t[row1-1][col1-1];
        
        return ans-top-left+above;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */