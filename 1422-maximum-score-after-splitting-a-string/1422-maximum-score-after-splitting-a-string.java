class Solution {
    public int maxScore(String s) {
        int idx = 1;
        int result = -1;
        while( idx < s.length()) {
            String left = s.substring(0,idx);
            String right = s.substring(idx);
            int zeroCnt = 0;
            int oneCnt = 0;
            for(int i=0; i<left.length(); i++) {
                if(left.charAt(i) - '0' == 0) {
                    zeroCnt++;
                }
            }
            
            for(int i=0; i<right.length(); i++) {
                if(right.charAt(i) - '0' == 1) {
                    oneCnt++;
                }
            }
            
            result = Math.max(zeroCnt + oneCnt, result);
            idx++;
        }
        
        return result;
        
    }
}