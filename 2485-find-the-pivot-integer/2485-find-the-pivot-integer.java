class Solution {
    public int pivotInteger(int n) {
        int head = 1;
        int tail = n;
        
        for(int i=1; i<=n; i++) {
            int result1 = i*(i+1)/2;
            int result2 = n*(n+1)/2 - result1 + i ;
            
            if(result1 == result2)
                return i;
            
        }
            
        return -1;
    }
}