class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0;
        int result = 0;
        for(int i=0; i<bank.length; i++) {
            String s = bank[i];
            int cnt = 0;
            for(int j=0; j<s.length(); j++) {
                char target = s.charAt(j);
                if(target == '1')
                    cnt++;
            }
            if(cnt == 0)
                continue;

            result += prev * cnt;
            prev = cnt;
        }
        
        return result;
    }
}