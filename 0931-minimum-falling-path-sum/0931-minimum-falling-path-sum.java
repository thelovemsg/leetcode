class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] memo = new int[n][n];
        int minPathSum = Integer.MAX_VALUE;
        
        for (int[] row: memo) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        
        for (int j=0; j<n; j++) {
            minPathSum = Math.min(minPathSum, calMinFallingPath(matrix, 0, j, memo));
        }
        
        return minPathSum;
    }
    
    public int calMinFallingPath(int[][] matrix, int i, int j, int[][] memo) {
        if (j < 0 || j >= matrix.length) return Integer.MAX_VALUE;
        if (i == matrix.length - 1) return matrix[i][j];
        if (memo[i][j] != Integer.MAX_VALUE) return memo[i][j];
        
        int down = calMinFallingPath(matrix, i+1, j, memo);
        int downLeft = calMinFallingPath(matrix, i+1, j-1, memo);
        int downRight = calMinFallingPath(matrix, i+1, j+1, memo);
        
        memo[i][j] = matrix[i][j] + Math.min(down, Math.min(downLeft, downRight));
        return memo[i][j];
    }
}