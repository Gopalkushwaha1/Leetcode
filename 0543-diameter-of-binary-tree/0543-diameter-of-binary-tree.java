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

    public int Ans(TreeNode root) {
        if(root == null ) return 0 ; 

        return 1 + Math.max(Ans(root.left) , Ans(root.right)) ; 
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if ( root == null ) return 0 ; 

        int both = Ans(root.left) + Ans(root.right) ; 
        int left = diameterOfBinaryTree(root.left) ; 
        int right = diameterOfBinaryTree(root.right) ; 

        return Math.max(both , Math.max(left , right)) ; 
    }
}