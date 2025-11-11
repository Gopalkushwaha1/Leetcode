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
    public void travel(TreeNode root , List<Integer> result ) {
        if ( root == null ) return ; 

        travel(root.left , result) ; 
        travel(root.right , result) ; 
        result.add(root.val) ; 
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>() ; 
        travel(root , result ) ; 
        return result ; 
    }
}