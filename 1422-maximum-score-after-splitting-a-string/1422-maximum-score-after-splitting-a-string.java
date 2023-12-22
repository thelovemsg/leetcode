class Solution {
    public int maxScore(String s) {
        int[] oneCountFromRight = new int[s.length()];
        int cnt = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                cnt++;
            }
            oneCountFromRight[i] = cnt;
        }
        int zeroCnt = 0;
        int max = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                zeroCnt++;
            }
            int score = zeroCnt + oneCountFromRight[i + 1];
            max = Math.max(max, score);
        }
        return max;
    }
}