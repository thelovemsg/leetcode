class Solution {
    public int firstUniqChar(String s) {
        
        Map<Character, Integer> characterMap = new LinkedHashMap<>();
        s.chars().mapToObj(c -> (char) c).forEach(c -> characterMap.put(c, characterMap.getOrDefault(c, 0) + 1));
        return characterMap.entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(entry -> s.indexOf(entry.getKey())).findFirst().orElse(-1);
        
        
        /*HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
        
        // find the index
        for (int i = 0; i < s.charAt(i); i++) {
            if (count.get(s.charAt(i)) == 1) 
                return i;
        }
        return -1;*/
        
    }
}