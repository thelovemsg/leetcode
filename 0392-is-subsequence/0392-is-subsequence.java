class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals(""))
            return true;
        
        int idx = 0;
        for(int j = 0; j<t.length(); j++) {
            char target = s.charAt(idx);
            if(target == t.charAt(j)){
                idx++;
            }               
            
            if(s.length() == idx)
                return true;
        }
        
        return false;
    }
}