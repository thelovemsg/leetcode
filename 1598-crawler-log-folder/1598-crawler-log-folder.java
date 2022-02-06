class Solution {
    public int minOperations(String[] logs) {
        int result = 0; 
        for(String temp : logs){
           
            switch(temp){
                case "./":
                    System.out.println("그대로");
                    break;
                case "../":
                    System.out.println("뒤로");
                    result--;
                    break;
                default:
                    System.out.println("안으로");
                    result++;
                    break;
            }
            if(result <=0)
                result = 0;
            System.out.println("-+--------------");
        }
        
        
        return result;
    }
    
}