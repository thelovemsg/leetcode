class Solution {
    public int minOperations(String[] logs) {
        int result = 0; 
        for(String temp : logs){
            switch(temp){
                case "./":
                    break;
                case "../":
                    result--;
                    break;
                default:
                    result++;
                    break;
            }
            if(result <=0)
                result = 0;
        }
        
        
        return result;
    }
    
}