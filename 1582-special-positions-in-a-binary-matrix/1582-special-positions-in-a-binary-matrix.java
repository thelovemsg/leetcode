class Solution {
    public int numSpecial(int[][] mat) {
        int result = 0;
        int rowLength = mat[0].length;
        int colLength = mat.length;
        for(int col=0; col < colLength; col++) {
            for(int row=0; row < rowLength; row++) {
                if(mat[col][row] == 1) {
                    int rowCnt=0;
                    int colCnt=0;
                    for(int i=0; i<rowLength; i++){
                        if(mat[col][i] == 1){
                            colCnt++;
                        }                        
                    }
                    
                    for(int i=0; i<colLength; i++){
                        if(mat[i][row] == 1){
                            rowCnt++;
                        }                       
                    }
                    
                    if(rowCnt == 1 && colCnt == 1)
                        result++;
                }
            }
        }
        return result;
    }
}