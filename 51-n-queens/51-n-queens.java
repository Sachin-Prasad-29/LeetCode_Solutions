class Solution {
    public List<List<String>> solveNQueens(int n) {
       HashSet<List<String>> set = new HashSet<>();
       char[][] pos = new char[n][n];
        for(char[] c : pos)
            Arrays.fill(c,'.');
        NQueen(0,pos,set,n); // this function will find all the possible answer and fill the hashset with the answer
        
        List<List<String>> ans = new ArrayList<>();
        for(List<String> a : set)
            ans.add(a);
        
        return ans;
        
    }
    private static void NQueen(int col, char[][] pos, HashSet<List<String>> set, int n ){
            // that means we filled our pos array with all the possible answer and now it contains anser which we needed
            if(col == n){
                set.add(charToList(pos)); // this will add the char array which is conveted to list<string> into the set
                return;
            }
            // now for each col we will check for each row posibble posittion
            for(int row = 0 ; row < n; row++){
                if(isPossible(col,row,pos,n)){ // this method will tell whether for the given row and col possible we can insert the val or not
                    pos[row][col] = 'Q';
                    NQueen(col+1, pos, set, n);
                    pos[row][col] = '.';
                    
                }
            }
    }
    private static boolean isPossible(int col, int row, char[][] pos, int n){
        int c = col;
        int r = row;
        
        // Now we will check for three direction only 
        // 1. upper left diagonal i.e c--; r--;
        while(c >= 0 && r >= 0 ){
            if(pos[r][c] == 'Q') return false;
            c--;
            r--;
        }
        r= row;
        c = col;
        //2. lower right diagonal i.e c--; r++;
        while( c >= 0 && r < n){
                if(pos[r][c] == 'Q') return false;
                c--;
                r++;
        }
        r= row;
        c = col;
        // 3. for the left side  of col for the same row i.e c--; 
        while( c >= 0){
            if(pos[r][c] == 'Q') return false;
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


