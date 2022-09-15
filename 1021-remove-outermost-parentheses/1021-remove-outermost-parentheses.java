class Solution {
    public String removeOuterParentheses(String s) {
        /* 내 풀이... ㅠㅠ 
        int count = 0;
        String result = "";
        for(Character c : s.toCharArray()){
            if(c == '(')
                count++;
                if(count != 1)
                    result += c;
            else if(c == ')')
                count--;
                if(count != 0)
                    result += c;
        }
        return result;*/

        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                if(counter != 0) sb.append(c);
                counter++;
            }
            else{
                counter--;
                if(counter != 0) sb.append(c);
            }
        }
        return sb.toString();
    }
}