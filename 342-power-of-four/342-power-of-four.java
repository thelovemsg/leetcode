class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1){
            return true;
        }
        
        int result = n;
        boolean left = true;
        while(result>=4){
            if((result % 4)!=0)
                left = false;
            result /= 4;
        }
        
        if(result == 1 && left){
            return true;
        }
        return false;
        
    }
}