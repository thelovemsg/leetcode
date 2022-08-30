class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int length = nums.length;
        int[] results = new int[length];
        for(int i=0; i<length; i++){
            int count=0;
            for(int j=0; j<length; j++){
                if(i==j)
                    continue;
                if(nums[i]>nums[j])
                    count++;
            }
            results[i] = count;
        }
        return results;
    }
}