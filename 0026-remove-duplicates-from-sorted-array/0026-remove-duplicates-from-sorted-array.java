class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }
        
        Iterator<Integer> it = set.iterator();

        int[] newNums = new int[set.size()];
        int idx = 0;
        while(it.hasNext()) {
            newNums[idx++] = it.next();
        }
        
        Arrays.sort(newNums);
        
        for(int i=0;i<newNums.length; i++) {
            nums[i] = newNums[i];
        }
        
        return set.size();
    }   
}