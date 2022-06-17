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
    static int res;
    public int minCameraCover(TreeNode root) {
        res = 0;
        int val = dfs(root);
        if(val <1) return res+1;
        return res;
        
    }
    private static int dfs(TreeNode node){
        if(node == null) return 2; // that means its not requried any camera because its never exist at all
        int left = dfs(node.left);
        int right = dfs(node.right);
        if(left == 0 || right == 0 ){
            res++;
            return 1;
        }
        if (left == 1 || right ==1 ){
            return 2;
        }
        else return 0;
    }
}

