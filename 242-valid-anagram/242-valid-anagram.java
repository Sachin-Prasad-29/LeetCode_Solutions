class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int n = s.length();
        int[] list1 = new int[26];
        int[] list2 = new int[26];
        
        for(int i = 0 ; i < n; i++){
            list1[s.charAt(i)-'a']++;
            list2[t.charAt(i)-'a']++; 
        }
        System.out.println(Arrays.toString(list1));
        System.out.println(Arrays.toString(list2));
        
        for(int  i = 0 ; i < 26; i++){
            if(list1[i] != list2[i]) return false;
        }
        return true;
    }
}