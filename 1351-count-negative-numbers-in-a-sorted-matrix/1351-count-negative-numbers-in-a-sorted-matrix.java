class Solution {
    public int countNegatives(int[][] grid) {
        long result =Arrays.stream(grid).flatMapToInt(row -> Arrays.stream(row))
                .filter(o -> o < 0).count();
        return Long.valueOf(result).intValue();
    }
}