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
    static int ans = 0 ; 
    public void find(TreeNode root , StringBuilder sb ) {

        // root is null return 

        if(root == null ) return ; 

        // add curr bit to sb 
        sb.append(root.val) ; 

        // last node ( leaf node ) add binary to decimal to ans 
        if(root.left == null && root.right == null ) {
            int bit = Integer.parseInt(sb.toString() , 2 ) ; 
            ans += bit ; 
        }
        else {
            find(root.left , sb ) ; 
            find(root.right , sb ) ; 
        }

        sb.deleteCharAt(sb.length() - 1 ) ; 
    }
    public int sumRootToLeaf(TreeNode root) {
        ans = 0 ; 
        StringBuilder sb = new StringBuilder() ; 

        // find all binary number 
        find(root , sb ) ; 

        // return ans 
        return ans ; 
    }
}