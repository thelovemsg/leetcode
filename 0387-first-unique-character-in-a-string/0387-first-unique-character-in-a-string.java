class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            map.merge(c, 1, Integer::sum);
        }
        
        char result = '*';
        
        for(Character c : map.keySet()) {
            Integer target= map.get(c);
            if(target == 1) {
                result = c;
                break;
            }
        }
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(result == c)
                return i;
        }
        
        return -1;
    }
}