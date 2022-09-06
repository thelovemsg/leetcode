class Solution {
    public int[][] largestLocal(int[][] grid) {
//         int targetLen = grid.length-1;
//         int[][] results = new int[targetLen][targetLen];
//         int max = 0;
//         int colIndex = 0;
//         for(int i=1; i<targetLen; i++){
//             for(int j=i; j<i+1;j++){
//                 max = Math.max(grid[i-1][j-1], max);
//                 max = Math.max(grid[i-1][j], max);
//                 max = Math.max(grid[i-1][j+1], max);
               
//                 max = Math.max(grid[i][j-1], max);
//                 max = Math.max(grid[i][j], max);
//                 max = Math.max(grid[i][j+1], max);
                
//                 max = Math.max(grid[i+1][j-1], max);
//                 max = Math.max(grid[i+1][j], max);
//                 max = Math.max(grid[i+1][j+1], max);
//             }
//             if(colIndex == targetLen)
//                 colIndex = 0;
//             results[i-1][colIndex++] = max;
            
//         }
        
//         return results;
        
        int targetLen = grid.length-2;
        int[][] results = new int[targetLen][targetLen];
        int max = 0;
        int colIndex = 0;
        for(int i=0; i<targetLen; i++){
            for(int j=0; j<targetLen; j++){
                results[i][j] = getHeighest(grid,i,j);
            }
        }
        return results;
    }
    
    private static int getHeighest(int[][] arr, int r, int c){
        int max = 0;
        for(int i=r; i<r+3;i++){
            for(int j=c;j<c+3;j++){
                max = Math.max(max,arr[i][j]);
            }
        }
        
        return max;
    }
}