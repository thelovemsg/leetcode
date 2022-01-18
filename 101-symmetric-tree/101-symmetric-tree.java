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
    public boolean isSymmetric(TreeNode root) {
        return checkSymmetric(root.left, root.right);
    }
    
    static public boolean checkSymmetric(TreeNode first, TreeNode second){
        if(first == null && second == null)
            return true;
        
        if((first == null && second!=null) || (second==null && first!=null) || (first.val != second.val))
            return false;        
        boolean result1 = checkSymmetric(first.left, second.right);
        boolean result2 = checkSymmetric(first.right, second.left);
        
        return (result1 && result2);
    }
}