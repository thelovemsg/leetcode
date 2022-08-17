class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] input = {".-","-...","-.-.","-..",".","..-.","--."
                ,"....","..",".---","-.-",".-..","--","-.","---",".--."
                ,"--.-",".-.","...","-","..-","...-",".--","-..-"
                ,"-.--","--.."};
        Map<Character,String> map = new HashMap<>();
        char startC = 'a';
        for(int i=0; i<input.length; i++){
            map.put(startC++,input[i]);
        }

        Set<String> result = new HashSet<>();
        for(int i=0; i<words.length; i++){
            String temp = words[i];
            String newString = temp.chars().mapToObj(s -> (char) s).map(s -> map.get(s.charValue())).reduce((s1, s2) -> s1                  + s2).get();
            result.add(newString);
        }
        return result.size();
    }
}