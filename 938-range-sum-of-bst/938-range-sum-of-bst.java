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
    
    int result = 0;
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        return sumRangeNumbers(root, low, high);
    }
    
    public int sumRangeNumbers(TreeNode root, int low, int high){

        if(root == null){
            return 0;
        }else {
            int ans = 0;
            
            if(root.val >= low && root.val <= high){
                ans += root.val;
            }
            
            if(low < root.val){
                ans += sumRangeNumbers(root.left, low, high);
            }
            
            if(high > root.val){
                ans += sumRangeNumbers(root.right, low, high);
            }
            
            return ans;
        }

    }
        
}