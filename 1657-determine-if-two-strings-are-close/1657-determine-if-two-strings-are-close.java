class Solution {
    public boolean closeStrings(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        if(length1 != length2)
            return false;
        
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<length1; i++) {
            arr1[word1.charAt(i)-'a']++;
            arr2[word2.charAt(i)-'a']++;
        }

        for(int i=0; i<arr1.length; i++) {
            if(arr1[i] != 0 && arr2[i] == 0)
                return false;
            
            if(arr1[i] == 0 && arr2[i] != 0)
                return false;
            
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1, arr2);
        
    }
}