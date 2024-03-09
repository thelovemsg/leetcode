class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        
        int length1 = nums1.length;
        int length2 = nums2.length;
        
        int idx1 = 0;
        int idx2 = 0;
            
        while(idx1 < length1 && idx2 < length2) {
            System.out.println("idx1 :: " + idx1);
            System.out.println("idx2 :: " + idx2);
            int num1 = nums1[idx1];
            int num2 = nums2[idx2];
 
            if(num1 < num2) {
                idx1++;
                continue;
            }
            
            if(num1 > num2) {
                idx2++;
                continue;
            }
            
            if(num1 == num2) {
                return num1;
            }
            
        }
        
        return -1;
    }
}