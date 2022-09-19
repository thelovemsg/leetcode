class Solution {
    public String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        int length = s.length();
        for(int i=length-1; i>=0; i--){
            char target = s.charAt(i);
            if(target == '#'){
                int calc =(s.charAt(i-2)-'0')*10 + s.charAt(i-1)-'0';
                char test = (char)(calc+96);
                result.append(test);
                i-=2;
            }else{
                result.append((char)(s.charAt(i)+48));
            }
        }
        result.reverse();
        return result.toString();
    }
}