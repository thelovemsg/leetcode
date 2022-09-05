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
    int sum = 0;
    public int getHeight(TreeNode root){
        if(root == null) return 0;
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        int height = Math.max(left, right) + 1;
        return height;
    }
    
    public void getDeepestLeavesSum(TreeNode root, int depth) {
        if(root == null) return;
        if(root.left == null && root.right == null && depth == 1){
            sum += root.val;
            return;
        } 
        
        getDeepestLeavesSum(root.left, depth - 1);
        getDeepestLeavesSum(root.right, depth - 1);
    }
    
    public int deepestLeavesSum(TreeNode root) {
        int depth = getHeight(root);
        getDeepestLeavesSum(root, depth);
        return sum;
    }
    
    
}