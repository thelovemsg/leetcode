class Solution {
    public int mostWordsFound(String[] sentences) {
        return Arrays.asList(sentences).stream().mapToInt(s -> s.split(" ").length).max().getAsInt();
        /*int max = 0;
        for (String sentence : sentences) {
            String[] split = sentence.split(" ");
            max = Math.max(max,split.length);
        }
        return max;*/
    }
}