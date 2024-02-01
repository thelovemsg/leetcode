class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int idx = 0;
        int length = nums.length;
        System.out.println("length :: " + length);
        int[][] result = new int[length/3][3];
        for (int i=0; i<length/3; i++) {
            int min = nums[i*3];
            int[] arr = new int[3];
            int target = 0;
            for (int j=0; j<3; j++) {
                target = nums[idx];
                if(target - min <= k){
                    arr[j] = target;
                }else {
                    return new int[0][0];
                }
                idx++;
            }
            result[i] = arr;
        }
        
        return result;
    }
}