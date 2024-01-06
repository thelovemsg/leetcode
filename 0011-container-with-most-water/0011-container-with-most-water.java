class Solution {
    public int maxArea(int[] height) {
        int length = height.length;
        int left = 0;
        int result = 0;
        int right = length - 1;
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
            
            // System.out.println("target :: " + target);
            // System.out.println("diff :: " + diff);
            result = Math.max(result, target * diff);
            // System.out.println("reuslt :: " + result);
            // System.out.println("=================");           
        }
        
        
        return result;
    }
}