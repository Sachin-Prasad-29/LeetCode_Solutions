/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/



class Solution {
    public Node connect(Node root) {
        if(root == null ) return root;
        Node curr = root;
        Node nxt = root.left;
        
        while(nxt != null && curr != null){
            curr.left.next = curr.right;
            if(curr.next != null){
                curr.right.next = curr.next.left;
                curr = curr.next;
            }
            else{
                curr = nxt;
                nxt = curr.left;
            }
        }
        return root;
    }
}

// class Solution {
//     public Node connect(Node root) {
//         if(root == null) return root;
//         Queue<Node> Q1 = new LinkedList<>();
//         Queue<Node> Q2 = new LinkedList<>();
        
//         Q1.offer(root);
        
//         while(!Q1.isEmpty() || !Q2.isEmpty()){
//             if(Q1.isEmpty())
//                 bfs(Q2,Q1);
//             else
//                 bfs(Q1,Q2);
//         }
//         return root;
//     }
//     private static void bfs(Queue<Node> Qs, Queue<Node> Qd){
//         while(!Qs.isEmpty()){
//             Node n = Qs.poll();
//             if(!Qs.isEmpty()) n.next = Qs.peek();
//             else n.next = null;
            
//             if(n.left != null)Qd.offer(n.left);
//             if(n.right != null) Qd.offer(n.right);
//         }
//     }
    
// }


