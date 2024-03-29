class Solution {
    public int minSteps(String s, String t) {
        int length = s.length();
        int[] arr = new int[26];
        
        int idx = 0;
        while(idx < length) {
            arr[s.charAt(idx)-'a']++;
            arr[t.charAt(idx)-'a']--;
            idx++;
        }
        
        int result = 0;
        for(int i=0; i<26; i++) {
            int target = arr[i];
            if(target > 0){
                result += target;
            }
        }
        
        return result;
        
    }
}