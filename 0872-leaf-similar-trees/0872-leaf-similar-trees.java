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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        calLeaf(root1, list1);
        calLeaf(root2, list2);
        
        if(list1.size() != list2.size())
            return false;
        
        for(int i=0; i<list1.size(); i++) {
            if(list1.get(i) != list2.get(i)) return false;
        }
        
        return true;
    }
    
    private void calLeaf(TreeNode root1, List<Integer> list1) {
        if(root1 == null)
            return;

        calLeaf(root1.left, list1);
        calLeaf(root1.right, list1);
            
        if(root1.left == null && root1.right == null)
            list1.add(root1.val);            
        
    }
}