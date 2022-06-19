class Node{
    Node[] links = new Node[26];
    boolean flag = false;
    
    public Node(){}
    
    // it will return true is the node contain the following key
    boolean containsKey(char ch){
        return (links[ch-'a'] != null);
    }
    
    // it will return the current link Node for the asked char
    Node get(char ch){
        return links[ch-'a'];
    }
    
    // this method taked the new null node and link it to the link node with respect to the asked char
    void put(char ch, Node node){
        links[ch-'a'] = node;
    }
    
    // At last during the insertion process when char finished the we set the last node flag as true 
    void setEndTrue(){
        flag = true;
    }
    
    // it will check whether the flag value of the node is true or false 
    boolean isEnd(){
        return flag;
    }
    
}



class Trie {
    private static Node root; // creating the root Node for all starting alphabets
    
    public Trie() {
      root = new Node(); // actual creation of the object  
    }
    
    public void insert(String word) {
        Node node = root;
        for(int i = 0 ; i < word.length(); i++){
            if(!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i),new Node());
            }
            node = node.get(word.charAt(i));
        }
        node.setEndTrue();
    }
    
    
    public boolean search(String word) {
        Node node = root;
        for(int i = 0 ; i < word.length(); i++){
            if(!node.containsKey(word.charAt(i))){
                 return false;
            }
            node = node.get(word.charAt(i));
        }
        if(node.isEnd()) 
            return true;
        return false;  
    }
    
    public boolean startsWith(String prefix) {
        Node node = root ;
        for(int i = 0 ; i < prefix.length();i++){
            if(!node.containsKey(prefix.charAt(i)))
                return false;
            node = node.get(prefix.charAt(i));
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */