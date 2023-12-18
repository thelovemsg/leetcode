class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        
        int targetValue = -1;        
        int targetKey = 0;    
        for(Integer key : map.keySet()) {
            if(targetValue < map.get(key)){
                targetValue = map.get(key);
                targetKey = key;
            }
        }
        
        return targetKey;
    }
}