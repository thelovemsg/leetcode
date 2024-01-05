class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int length = nums.length;
        int[] dp = new int[length];
        Arrays.fill(dp, 1); // 각 위치에서의 LIS 길이를 1로 초기화
        int maxLength = 1;   // 최대 길이

        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1); // LIS 길이 갱신
                }
            }
            maxLength = Math.max(maxLength, dp[i]); // 전체 최대 길이 갱신
        }

        return maxLength;
    }
}