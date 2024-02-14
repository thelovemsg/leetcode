class Solution {
    public int[] rearrangeArray(int[] nums) {
        int length = nums.length;
        int[] plusArr = new int[length/2];
        int[] minusArr = new int[length/2];
        int plusIdx = 0;
        int minuxIdx = 0;
        for(int i=0; i<length; i++ ){
            int num = nums[i];
            if(num < 0)
                minusArr[minuxIdx++] = num;
            else
                plusArr[plusIdx++] = num;
        } 
        
        int[] result = new int[length];
        int resultIdx = 0;
        for(int i=0; i<length/2; i++) {
            result[resultIdx++] = plusArr[i];
            result[resultIdx++] = minusArr[i];
        }
        
        
        return result;
    }
}