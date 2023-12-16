class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sArr = new int[26];
        
        for(int i=0; i<s.length(); i++){
            sArr[s.charAt(i) - 'a'] += 1;
        }
        
        for(int i=0; i<t.length(); i++){
            sArr[t.charAt(i) - 'a'] -= 1;
        }
    
        for(int i=0; i<sArr.length; i++) {
            if(sArr[i] != 0)
                return false;
        }
        
        return true;
    }
    
}