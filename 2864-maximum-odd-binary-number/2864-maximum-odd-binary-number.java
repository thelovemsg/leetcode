class Solution {
    public String maximumOddBinaryNumber(String s) {
        int cnt = 0;
        for(char c : s.toCharArray()) {
            if(c == '1') 
                cnt++;
        }

        int length = s.length();
        StringBuilder sb = new StringBuilder();
            
        if(cnt == 0){
            for(int i=0; i<length; i++) {
                 sb.append("0");
            }
            
            return sb.toString();
        }
            
        if(cnt == 1) {
            for(int i=0; i<length-1; i++) {
                 sb.append("0");
            }
            
            sb.append("1");
            
            return sb.toString();
        }
        
        cnt--;
            
        for(int i=0; i<length-1; i++) {
            if(cnt == 0){
                sb.append("0");
            } else if(cnt > 0 ){
                cnt--;
                sb.append("1");
            }
                
                
        }

        sb.append("1");

        return sb.toString();
        
    }
}