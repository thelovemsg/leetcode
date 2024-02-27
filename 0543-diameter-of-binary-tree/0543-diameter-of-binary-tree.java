class Solution {
    int maxDiameter = 0; // 전역 변수로 최대 지름을 추적

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return maxDiameter;
    }

    private int maxDepth(TreeNode node) {
        if (node == null) return 0; // 기저 조건
        
        int left = maxDepth(node.left); // 왼쪽 서브트리의 최대 깊이
        int right = maxDepth(node.right); // 오른쪽 서브트리의 최대 깊이
        
        maxDiameter = Math.max(maxDiameter, left + right); // 최대 지름 업데이트
        
        return Math.max(left, right) + 1; // 현재 노드를 포함하여 더 깊은 쪽의 깊이를 반환
    }
}