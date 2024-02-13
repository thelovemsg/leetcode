class Solution {
    public String firstPalindrome(String[] words) {
        boolean result;
        for(String word : words) {
            result = true;
            int head = 0;
            int tail = word.length()-1;
            while(head < tail) {
                if(word.charAt(head++) != word.charAt(tail--)){
                    result = false;
                    break;
                }
            }
            
            if(result) {
                return word;
            }
        }
        
        return "";
    }
}