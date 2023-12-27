class Solution {
    public int getMaximumGenerated(int n) {
        int[] nums = new int[n+1];
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 1;
        nums[1] = 1;
        nums[2] = nums[1];
        
        int max = -1;
        for(int i=3; i<=n; i++) {
            nums[i] = cal(i, nums);
            max = Math.max(max, nums[i]);
        }

        return max;
    }
    
    public int cal(int n, int[] nums) {
        int result = n/2;
        int rest = n%2;

        
        return rest == 0 ? nums[result] : nums[result] + nums[result+1];
    }
}