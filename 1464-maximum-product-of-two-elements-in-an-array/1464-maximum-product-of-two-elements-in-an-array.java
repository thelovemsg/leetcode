class Solution {
    public int maxProduct(int[] nums) {
        int result = -1;
    
        // for (int i=0;i<nums.length-1; i++) {
        //     for (int j=i+1;j<nums.length; j++) {
        //         result = Math.max((nums[i]-1) * (nums[j]-1), result);
        //     }
        // }
        Arrays.sort(nums);
        
        return (nums[nums.length-2] - 1) * (nums[nums.length-1] - 1) ;
    }
}