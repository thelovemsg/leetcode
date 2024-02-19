public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result = 0;
        int idx = 32;
        while(idx > 0) {
            if((n & 1) == 1)
                result++;
            
            n = n >> 1;
            idx--;
        }
        return result;
    }
}
