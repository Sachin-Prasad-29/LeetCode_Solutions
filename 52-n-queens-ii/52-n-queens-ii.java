class Solution {
    public int totalNQueens(int n) {
        HashSet<List<String>> set = new HashSet<>();
        char[][] pos = new char[n][n];
        for(char[] ch : pos)
            Arrays.fill(ch,'.');
        NQueen(0,set,pos,n);
        return set.size();
    }
    private static void NQueen(int col,HashSet<List<String>> set, char[][] pos,int n){
        if(col == n){
            set.add(charToList(pos));
            return;
        }
        for(int row = 0 ; row < n; row++){
            if(isPossible(row,col,pos,n)){
                pos[row][col]= 'Q';
                NQueen(col+1,set,pos,n);
                pos[row][col]= '.';
            }
        }
    }
    private static boolean isPossible(int row, int col, char[][] pos, int n){
        int r = row;
        int c = col;
        
        // check for the left side of the same column c--;
        while(c >=0){
           if(pos[r][c] == 'Q') return false;
            c--;
        }
        r = row;
        c = col;
        // check for the left upper diagonal r-- c--;
        while(r >= 0 && c >= 0){
            if(pos[r][c] == 'Q') return false;
            r--;
            c--;
        }
        r = row;
        c = col;
        // check for the left bottom diagonal r++ c--;
        while(r < n && c >= 0){
            if(pos[r][c] == 'Q')return false;
            r++;
            c--;
        }
        return true;
        
    }
    
    private static List<String> charToList(char[][] pos){
        List<String> list = new ArrayList<>();
        for(int i = 0 ; i < pos.length; i++){
            String s = new String(pos[i]);
            list.add(s);
        }
        return list;
    }
    
}

