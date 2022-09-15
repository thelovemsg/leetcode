class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] target = s.split(" ");
        for(int i=0; i<target.length; i++){
            String temp = target[i];
            for(int j=temp.length()-1; j>=0; j--){
                result.append(temp.charAt(j));
            }
            result.append(" ");
        }
        
        result.setLength(result.length()-1);
        return result.toString();
    }
}