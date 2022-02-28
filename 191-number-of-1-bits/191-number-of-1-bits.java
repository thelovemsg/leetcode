public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String result = Integer.toBinaryString(n);
        int count = 0;
        for(char temp : result.toCharArray()){
            if(temp == '1') count++;
        }
        
        return count;
    }
}