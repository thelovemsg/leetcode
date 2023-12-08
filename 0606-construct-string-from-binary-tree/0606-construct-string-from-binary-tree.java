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
    public String tree2str(TreeNode root) {
        return getValues(root);
    }
    
    public String getValues(TreeNode tree) {
        String result = "";
        if(tree == null)
            return "";
        
        result += Integer.toString(tree.val);
        
        if(tree.left == null && tree.right == null)
            return result;
        
        if(tree.left == null && tree.right != null) 
            result += "()"; 
        else if(tree.left != null)
            result += "(" + getValues(tree.left) + ")";

        if(tree.right != null)
        result += "(" + getValues(tree.right) + ")";

        return result;
    }
}