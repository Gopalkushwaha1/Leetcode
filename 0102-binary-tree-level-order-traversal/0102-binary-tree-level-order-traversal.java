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
    public void storeLevel(TreeNode root , List<List<Integer>> list , int level ) {
        if(root == null ) return ; 

        if(level == list.size()) {
            List<Integer> l = new ArrayList<>() ; 
            l.add(root.val) ; 
            list.add(l) ; 
        }
        else {
            list.get(level).add(root.val) ; 
        }
        storeLevel(root.left , list , level+1) ;
        storeLevel(root.right , list , level+1) ;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>() ; 
        storeLevel(root , list , 0 ) ; 
        return list ; 
    }
}