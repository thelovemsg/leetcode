class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String first = String.join("", word1);
        String second = String.join("", word2);
        return first.equals(second);
    }
}