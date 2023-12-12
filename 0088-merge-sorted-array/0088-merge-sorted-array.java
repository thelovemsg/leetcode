class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] result = new int[m+n];
        int cnt = 0;
        for(int i=0; i<m; i++) {
            nums1[cnt] = nums1[i];
            cnt++;
        }
        
        for(int i=0; i<n; i++) {
            nums1[cnt] = nums2[i];
            cnt++;
        }
        
        Arrays.sort(nums1);
        
    }
}