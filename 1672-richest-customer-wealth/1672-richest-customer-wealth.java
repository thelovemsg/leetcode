class Solution {
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts).flatMapToInt(s -> IntStream.of(Arrays.stream(s).sum())).max().getAsInt();
    }
}