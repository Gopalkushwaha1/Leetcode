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
    public int find(TreeNode root) {
        if(root == null ) return 0 ; 
        return 1 + Math.max(find(root.left) , find(root.right)) ; 
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null ) return true ; 
        int leftHeight = find(root.left) ; 
        int rightHeight = find(root.right) ; 

        if(Math.abs(leftHeight-rightHeight) > 1 ) return false ; 
        return isBalanced(root.left) && isBalanced(root.right) ; 
          
    }
}