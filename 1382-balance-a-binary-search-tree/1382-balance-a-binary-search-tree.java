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
    public TreeNode makeTree(List<Integer> list , int left , int right ) {
        if( left > right ) return null ; 

        int mid = (left+right) / 2 ; 
        TreeNode root = new TreeNode(list.get(mid) ) ; 

        root.left = makeTree(list , left , mid - 1 ) ; 
        root.right = makeTree(list , mid + 1 , right ) ;

        return root ;  
    }
    public void find(TreeNode root , List<Integer> list ) {
        if(root == null ) return ; 

        find(root.left , list) ; 
        list.add(root.val) ; 
        find(root.right , list ) ; 
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>() ; 

        find(root , list) ; 
        Collections.sort(list) ; 
        return makeTree(list , 0 , list.size() - 1 ) ; 
    }
}