class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();

        for (char a : s.toCharArray()) {
            mp.merge(a, 1, Integer::sum);
        }

        for (int i = 0; i < s.length(); i++) {
            if (mp.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}