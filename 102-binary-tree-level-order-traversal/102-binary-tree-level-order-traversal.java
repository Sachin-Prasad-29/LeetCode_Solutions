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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
       if(root == null) return list;
        Queue<TreeNode> q = new LinkedList<>();
        
        // add the root element to the queue
        
        q.offer(root);
        while(!q.isEmpty()){
            // now queue size is showing us the no of nodes in the tress and for each node we have to find there right node and left node if they are not empty
            int level = q.size();
            List<Integer> levelList = new ArrayList<>();
            for(int i=0;i<level;i++){
                // now check is there left and right node is empty i.e null or not 
                // add those nodes if they are not null
                if(q.peek().left != null)
                    q.offer(q.peek().left);
                if(q.peek().right != null)
                    q.offer(q.peek().right);
                
                // Now store the value of the current node into the li list
                // also poll that value form the queue at the same time
                levelList.add(q.poll().val);
            }
            // add that levelList to the main list 
            list.add(levelList);
        }
        return list;
    }
}