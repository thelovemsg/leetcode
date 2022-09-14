class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() <26)
            return false;
        int[] alphabet = new int[26];
        for(Character c : sentence.toCharArray()){
            alphabet[c-'a']++;
        }
        
        for(int temp : alphabet){
            if(temp==0)
                return false;
        }
        
        return true;
    }
}