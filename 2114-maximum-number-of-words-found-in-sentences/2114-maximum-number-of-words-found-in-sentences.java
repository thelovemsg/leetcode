class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            String[] split = sentence.split(" ");
            max = Math.max(max,split.length);
        }
        return max;
    }
}