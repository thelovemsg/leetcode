class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int prev = 0;
        /*
            
        */
        for(int i=0; i<nums.length; i++){
            result[i] = prev + nums[i];
            prev = result[i];
        }
        
        return result;
    }
}