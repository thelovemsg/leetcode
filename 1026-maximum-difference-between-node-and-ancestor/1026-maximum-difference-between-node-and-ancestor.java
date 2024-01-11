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
public class Solution {
    public int maxAncestorDiff(TreeNode root) {
        if (root == null) return 0;
        return dfs(root, root.val, root.val);
    }

    private int dfs(TreeNode node, int min, int max) {
        if (node == null) return max - min;
        max = Math.max(max, node.val);
        min = Math.min(min, node.val);
        int leftMaxDiff = dfs(node.left, min, max);
        int rightMaxDiff = dfs(node.right, min, max);
        return Math.max(leftMaxDiff, rightMaxDiff);
    }
}