class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int rowLength = grid.length;
        int colLength = grid[0].length;
        
        for(int i=0; i<grid.length; i++) {
            Arrays.sort(grid[i]);
        }
        
        int result = 0;
        for(int i=0; i<colLength; i++) {
            int max = -1;
            for(int j=0; j<rowLength; j++) {
                // System.out.println(j);
               max = Math.max(max, grid[j][i]);
            }
            result += max;
        }
        
        return result;
    }
}