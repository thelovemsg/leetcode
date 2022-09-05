class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int left=0, middle=0, right=0;
        Stack<String> stack = new Stack<>();
        for(int i=1; i<nums.length-1; i++){
            int standard = i;
            middle = nums[standard];
            for(int j=0; j<standard; j++){
                for(int k=standard+1; k < nums.length; k++){
                    if((nums[standard]-nums[j]) == diff && (nums[k]-nums[standard]) == diff){
                        String stackVal = String.valueOf(j) + String.valueOf(standard) + String.valueOf(k); 
                        stack.push(stackVal);
                    }
                }
            }
        }
        
        return stack.size();
    }
}