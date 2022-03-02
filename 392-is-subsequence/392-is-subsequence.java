class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        
        if(s.length() > t.length()){
            return false;
        }else{
             for(int i = 0; i < t.length() && index < s.length(); i++){
                if(s.charAt(index) == t.charAt(i)){
                    index++;
                }
            }
        }
        return (index == s.length());
    }
}