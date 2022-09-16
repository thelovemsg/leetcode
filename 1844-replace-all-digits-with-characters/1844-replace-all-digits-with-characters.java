class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length()-1; i+=2){
            char alphabet = s.charAt(i);
            int number = (int)(s.charAt(i+1) -'0');
            sb.append(alphabet);
            sb.append((char)(alphabet+number));
        }
        if(sb.length() != s.length()){
            int temp = (int) (s.charAt(s.length()-1) - '0');
            if(temp > 10){
                sb.append(s.charAt(s.length()-1));
            }else{
                sb.append(temp);
            }
        }

        return sb.toString();
    }
}