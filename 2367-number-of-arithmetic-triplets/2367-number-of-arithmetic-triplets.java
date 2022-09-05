class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
//         int left=0, middle=0, right=0;
//         Stack<String> stack = new Stack<>();
//         for(int i=1; i<nums.length-1; i++){
//             int standard = i;
//             middle = nums[standard];
//             for(int j=0; j<standard; j++){
//                 for(int k=standard+1; k < nums.length; k++){
//                     if((nums[standard]-nums[j]) == diff && (nums[k]-nums[standard]) == diff){
//                         String stackVal = String.valueOf(j) + String.valueOf(standard) + String.valueOf(k); 
//                         stack.push(stackVal);
//                     }
//                 }
//             }
//         }
        
//         return stack.size();
        //사실 배열의 index로 접근하는 것이라서 겹칠일이 없으므로 stack은 사용하지 않아도 된다.ㅠㅠ 
        int result = 0;
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] - nums[i] == diff){
                    for(int k = 0; k < nums.length; k++){
                        if(nums[k] - nums[j] == diff){
                            result++;
                        }
                    }
                }
            }
        }
        
        return result;
    }
}