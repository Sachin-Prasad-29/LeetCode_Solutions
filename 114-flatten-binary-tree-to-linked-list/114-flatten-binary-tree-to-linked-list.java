/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // Method 3 using Morris traversal that is O(n) time and O(1) space
    public void flatten(TreeNode root){
        if(root == null) 
            return;
        TreeNode curr = root;
        while(curr != null){
            if(curr.left != null){
                TreeNode prev = curr.left;
                while(prev.right != null)
                    prev = prev.right;
                prev.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right; // because our curr right change from right to left so it   actuall y the curr.left;
        }
        
    }
    
    // Method 2 Using Recursive Approach 
//     TreeNode prev = null;
//      public void flatten(TreeNode node) {
//          if(node == null)
//             return;
        
//            flatten(node.right);
        
//             flatten(node.left);
        
//             node.right = prev;
//              node.left = null;
//         prev = node;
         
//      }
    

    
}
    
    
    // using Stack data sturcture  method 1 
//     public void flatten(TreeNode root) {
//         if(root == null)
//             return;
//        Stack<TreeNode> s = new Stack<>();
//         s.push(root);
//         while(!s.isEmpty()){
            
//             TreeNode node = s.pop();
            
//             if(node.right != null)
//                 s.push(node.right);
            
//             if(node.left != null)
//                 s.push(node.left);
            
//             if(!s.isEmpty())
//                node.right = s.peek();
            
//              node.left = null;
               
//             }
           
//     }
// }