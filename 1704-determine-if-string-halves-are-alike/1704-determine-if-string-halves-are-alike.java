class Solution {
    public boolean halvesAreAlike(String s) {
        int head = 0;
        int tail = s.length()-1;
        int result1 = 0;
        int result2 = 0;
        while(head < tail) {
            char c = Character.toLowerCase(s.charAt(head));
            char c1 = Character.toLowerCase(s.charAt(tail));
            
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                result1++;
            
            if(c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u')
                result2++;
            head++;
            tail--;
        }
        
        return result1 == result2;
    }
}