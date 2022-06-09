class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> h1 = new HashMap<>();
		HashMap<Character,Integer> h2 = new HashMap<>();
        int m = s1.length();
        int n = s2.length();
        if(m>n) return false;
        for(int i = 0 ; i < m; i++){
            h1.put(s1.charAt(i),h1.getOrDefault(s1.charAt(i),0)+1);
        }
        
        int i = 0 ,j = 0;
        while(j < n){
            h2.put(s2.charAt(j),h2.getOrDefault(s2.charAt(j),0)+1);
            if(j-i+1 < m){
                 j++; 
                continue;
            }
            else if( j-i+1 == m){
                    if(h1.equals(h2)) return true;
                    h2.put(s2.charAt(i),h2.get(s2.charAt(i))-1);
                    if(h2.get(s2.charAt(i)) == 0){
                        h2.remove(s2.charAt(i));
                    }
                i++;
            }
           j++; 
        }
        System.out.println(h1);
        
        
        
        return false;
    }
}