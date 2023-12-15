class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        List<Integer> idxList = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                idxList.add(i);
                k++;
            }
        }
        
        int idx=0;
        for(int i=0; i<idxList.size(); i++) {
            nums[idx++] = nums[idxList.get(i)];
        }
        
        return k;
        
    }
}