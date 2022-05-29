class Solution {
    public int maxProduct(String[] words) {
        int len = words.length;
        int[] val = new int[len];
        for(int i = 0 ;  i< len; i++){
            String s = words[i];
            val[i] = 0 ;
            for(int j =  0 ;j < s.length(); j++){
                val[i] |= 1<< (s.charAt(j) - 'a');
            }
        }
        System.out.println(Arrays.toString(val));
        int ans = 0 ;
        for(int i = 0 ; i< len ; i++){
            for(int j = 0 ; j < len; j++){
                if((val[i] & val[j]) == 0)
                    ans = Math.max(ans,words[i].length()*words[j].length());
            }
        }
        return ans;
    }
}