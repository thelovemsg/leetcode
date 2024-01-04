class Solution {
    public int minOperations(int[] nums) {
        int result = 0;      
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }
        
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            Integer value = entry.getValue();
            if(value == 1)
                return -1;
            
            if(value >= 5 ){
                int quotient = value / 3;
                int remainder = value % 3;
                result += quotient;
                if(remainder == 1 || remainder == 2) {
                    result++;    
                }
            } else if(value == 4) {
                result += 2;
            } else if(value == 2 || value == 3) {
                result++;
            }
        }
        
        return result;
    }
}