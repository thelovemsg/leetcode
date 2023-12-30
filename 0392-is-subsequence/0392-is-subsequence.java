class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIdx = 0;
        int tIdx = 0;
        int cnt = 0;
        while(sIdx != s.length() && tIdx != t.length()) {
            if(s.charAt(sIdx) == t.charAt(tIdx)) {
                cnt++;
                sIdx++;
            } 
            tIdx++;
        }
        
        return cnt == s.length();

    }
}