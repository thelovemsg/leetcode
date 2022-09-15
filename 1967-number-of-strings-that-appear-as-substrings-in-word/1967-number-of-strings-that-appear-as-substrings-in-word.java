class Solution {
    public int numOfStrings(String[] patterns, String word) {
        return (int) Arrays.asList(patterns).stream().filter(s -> word.contains(s)).count();
    }
}