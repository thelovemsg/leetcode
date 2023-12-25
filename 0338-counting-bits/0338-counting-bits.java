class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1]; 
        for(int i=1; i<=n; i++) {
            int target = i;
            int cnt = 0;
            while(target > 0){
                if((target & 1) == 1)
                    cnt++;
                target = target>>1;
            }
            
            result[i] = cnt;
        }
        
        return result;
    }
}