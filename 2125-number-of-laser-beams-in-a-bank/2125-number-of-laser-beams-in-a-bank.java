class Solution {
    public int numberOfBeams(String[] bank) {
        int cnt = 0;
        int i=0;
        int j=1;
        int length = bank.length;
        while(i < length && j < length) {
            if(i == j) {
                j++;
                continue;
            }
                
            
            String prev = bank[i];
            int prevCnt = 0;
            for(int k=0; k<prev.length(); k++) {
                if(prev.charAt(k) == '1')
                    prevCnt++;
            }
            
            if(prevCnt == 0) {
                i++;
                continue;
            }
                
            String curr = bank[j];
            int currCnt = 0;
            for(int k=0; k<curr.length(); k++) {
                if(curr.charAt(k) == '1')
                    currCnt++;
            }
            
            if(currCnt == 0) {
                j++;
                continue;
            }
            
            
            cnt += prevCnt * currCnt;
            i++;
            j++;
        }
        
        return cnt;
    }
}