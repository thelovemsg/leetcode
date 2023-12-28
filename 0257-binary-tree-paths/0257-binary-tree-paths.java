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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        treePath(root, result, "");
        return result;
    }
    
    public void treePath(TreeNode node, List<String> result, String path) {    
        if (node != null) {
            path += Integer.toString(node.val);
            if (node.left == null && node.right == null) { // 잎 노드인 경우
                result.add(path);
            } else {
                path += "->"; // 다음 노드로의 경로 추가
                treePath(node.left, result, path);
                treePath(node.right, result, path);
            }
        }
        
    }
}