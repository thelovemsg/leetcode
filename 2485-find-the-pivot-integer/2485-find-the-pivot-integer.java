class Solution {
    public int pivotInteger(int n) {
        int head = 1;
        int tail = n;
        
        for(int i=1; i<=n; i++) {
            int stand = i;
            int front = 0;
            int back = 0;
            for(int j = 1; j<=i; j++) {
                front+=j;
            }
            
            for(int j = i; j<=n; j++) {
                back+=j;
            }
            
            if( back == front)
                return i;
        }
            
        return -1;
    }
}