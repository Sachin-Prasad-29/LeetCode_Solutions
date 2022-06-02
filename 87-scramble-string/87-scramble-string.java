class Solution {
    static HashMap<String,Boolean> map ;
    public boolean isScramble(String A, String B) {
        map = new HashMap<>();
        if(A.length() !=  B.length())  
            return false;
        if(A.length() == 0) return true;
        return helper(A,B);
    }
    private static boolean helper(String A ,String B){
        // if both string are same return true
        if(A.compareTo(B) == 0) return true;
        // if the size is one or less the return false because if size if one and we reached this part 
        // that mean both one char string is not equal so we return false here 
        if( A.length() <= 1) return false;
        //Now call the recurcive for loop for the smaller input answer
        StringBuilder sb = new StringBuilder();
        sb.append(A);
        sb.append("@@");
        sb.append(B);
        String k = sb.toString();
        if(map.containsKey(k)) return map.get(k);
        int N  = A.length();
        boolean flag = false;
        for(int i = 1; i< N; i++){
            // condition 1 we will take for the string when there is a swapping 
            String P = A.substring(0,i);
            String Q = B.substring(N-i,N);
            String R = A.substring(i,N);
            String S = B.substring(0,N-i);
            boolean condition1 =  (helper(P,Q)) && (helper(R,S));
           
            boolean condition2 = false;
            // condition 2 we will take when the there is no swapping in string
            if(condition1 == false){
                String X = A.substring(0,i);
                String Y = B.substring(0,i);
                String Z = A.substring(i,N);
                String W = B.substring(i,N);
                condition2 = (helper(X,Y)) && (helper(Z,W));
                
            }
            if( condition1 || condition2 ){
                flag = true;
                break;
            }
        }
        map.put(k,flag);
        return flag;
    }
}