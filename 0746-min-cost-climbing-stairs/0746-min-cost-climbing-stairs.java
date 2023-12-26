class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int length = cost.length;
        int[] dp = new int[length + 1];

        // 0번째와 1번째 계단까지의 비용은 0 (시작점)
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= length; i++) {
            // i번째 계단에 도달하기 위한 최소 비용 계산
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }

        // 계단 꼭대기에 도달하는 데 필요한 최소 비용 반환
        return dp[length];
    }
}