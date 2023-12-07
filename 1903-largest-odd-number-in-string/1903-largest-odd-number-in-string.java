class Solution {
    public String largestOddNumber(String num) {
        if(num == null || num.length() == 0) {
            return "";
        }
        
        String result = "";
        for (int i = num.length()-1; i >= 0; i--) {
            System.out.println("num.charAt(i) :: " + num.charAt(i));
            System.out.println("num.charAt(i)-'0' :: " + (num.charAt(i) - '0'));
            if(((num.charAt(i)-'0') &1) == 1){
                result = num.substring(0,i+1);
                break;
            }
        }
        
        return result;
    }
}