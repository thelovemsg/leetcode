class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int length = nums.length;
        for(int i=0; i<length; i++) {
            int num = nums[i];
            map.merge(num, 1, Integer::sum);
        }
        
        List<Integer> result = new ArrayList<>();
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > length / 3)
                result.add(entry.getKey());
        }
        
        return result;
    }
}