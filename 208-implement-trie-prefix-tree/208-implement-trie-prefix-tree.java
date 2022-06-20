class Node{
    Node[] link = new Node[26];
    boolean flag = false;
    
    boolean containsKey(char ch){
        return (link[ch-'a'] != null);
    }
    Node get(char ch){
        return link[ch-'a'];
    }
    void put(char ch, Node node){
        link[ch-'a'] = node; // node is newly creates node for the key ch which is empty and contain flag false;
    }
    void setEnd(){
        flag = true;
    }
    boolean isEnd(){
        return flag;
    }
}
class Trie {
    private static Node root; // this is the first node  which contain 26 size link and flag value false;
    public Trie() {
        root = new Node(); // actaul createion of the object
    }
    
    public void insert(String word) {
        Node node = root;
        for(int i = 0 ; i < word.length(); i++){
            if(!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i),new Node());
            }
            node = node.get(word.charAt(i));
        }
        node.setEnd();
    }
    
    public boolean search(String word) {
        Node node = root;
        for(int i = 0  ; i < word.length(); i++){
            if(!node.containsKey(word.charAt(i))){
                return false;
            }
            node = node.get(word.charAt(i));
        }
        if(node.isEnd()) return true;
        return false;
    }
    
    public boolean startsWith(String prefix) {
        Node node = root ;
        for(int i = 0 ; i < prefix.length(); i++){
            if(!node.containsKey(prefix.charAt(i))){
                return false;
            }
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