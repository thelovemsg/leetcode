class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int result = 0;
        int right = height.length - 1;
        while(left < right) {
            int l = height[left];
            int r = height[right];
            int diff = right-left;
            int target = 0;
            if(l < r) {
                target = l;
                left++;
            } else {
                target = r;
                right--;
            }
            
            result = Math.max(result, target * diff);
        }
        
        
        return result;
    }
}