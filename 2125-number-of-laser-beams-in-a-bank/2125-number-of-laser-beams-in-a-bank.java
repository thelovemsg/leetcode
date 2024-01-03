class Solution {
    public int numberOfBeams(String[] bank) {
        int cnt = 0;
        int i=0;
        int j=1;
        int length = bank.length;
        while(i < length && j < length) {
            if(j == i) {
                j++;
                continue;
            }
            
            String prev = bank[i];
            String curr = bank[j];
            int prevCnt = 0;
            int currCnt = 0;

            for(int k=0; k<prev.length(); k++) {
                if(prev.charAt(k) == '1')
                    prevCnt++;
                 if(curr.charAt(k) == '1')
                    currCnt++;
            }
            
            if(prevCnt == 0) {
                i++;
                continue;
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