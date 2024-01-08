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
    public int rangeSumBST(TreeNode root, int low, int high) {
        return calTree(root, low, high);
    }
    
    public int calTree(TreeNode tree, int low, int high) {
        int result = 0;
        
        if(tree == null)
            return result;
        
        if(tree != null && tree.val >= low && tree.val <= high){
            result += tree.val;
        }
        
        result += calTree(tree.left, low, high);
        result += calTree(tree.right, low, high);
        return result;
    }   
    
    
}