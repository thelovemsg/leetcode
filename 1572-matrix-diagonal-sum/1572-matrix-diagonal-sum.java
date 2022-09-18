class Solution {
    public int diagonalSum(int[][] mat) {
        /*
            [   
                [1,2,3]
                [4,5,6]
                [7,8,9]
                          ]
        */
        
        int result =0;
        for(int i=0; i<mat.length; i++){
            int[] row = mat[i];
            int length = row.length;
            if(i == (length-i-1))
                result += row[i];
            else
                result += row[i] + row[length-i-1];
                
        }
        return result;
    }
}