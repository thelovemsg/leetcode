class Solution {
    public String replaceDigits(String s) {
        
        /* 내 풀이... 맨 마지막 거를 빼먹어서 다시 확인하는 것 자체가 넌센스
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
        
        //ㅠㅠ 이
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<s.length(); i+=2){
            char alphabet = s.charAt(i-1);
            int number = (int)(s.charAt(i) -'0');
            sb.append(alphabet);
            sb.append((char)(alphabet+number));
        }
        return sb.toString(); 
        */
        
        //애초에 새롭게 담을 필요가 없다. 기존에 있는 데이터를 조작해서 충분히 처리가 가능하기 때문이다 ㅠㅠ
        char[] charArray = s.toCharArray();
		for(int i = 1; i<charArray.length; i = i + 2) {
		  charArray[i] = (char) (charArray[i - 1] + charArray[i] - '0');
		}
		return String.valueOf(charArray);       
       
    }
}