class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        
        if(length == 1) return;
        
        int rotateCnt = k%length;
        
        int[] tempNums = Arrays.copyOf(nums, length);
        for(int i=0; i<length; i++) {
            int num = tempNums[i];
            int newIdx = i + rotateCnt;
            if(newIdx >= length) {
                nums[newIdx-length] = num;
            } else {
                nums[newIdx] = num;
            }
        }
        
    }
}