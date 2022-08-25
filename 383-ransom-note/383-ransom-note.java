class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>();
        for(int i=0; i<magazine.length(); i++){
            magazineMap.put(magazine.charAt(i), magazineMap.getOrDefault(magazine.charAt(i),0)+1);
        }

        System.out.println("magazineMap = " + magazineMap);

        Map<Character, Integer> ransomNoteMap = new HashMap<>();
        for(int i=0; i<ransomNote.length(); i++){
            ransomNoteMap.put(ransomNote.charAt(i), ransomNoteMap.getOrDefault(ransomNote.charAt(i),0)+1);
        }

        System.out.println("ransomNoteMap = " + ransomNoteMap);

        for (Character character : ransomNoteMap.keySet()) {
              if(!magazineMap.containsKey(character))
                return false;
            if(magazineMap.get(character) < ransomNoteMap.get(character)){
                return false;
            }
        }
        
        return true;
        
    }
}