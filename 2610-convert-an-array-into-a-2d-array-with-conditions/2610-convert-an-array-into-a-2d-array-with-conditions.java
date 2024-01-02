class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer>  map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        boolean flag = false;
        while(!flag) {
            List<Integer> list = new ArrayList<>();
            for(Integer target : map.keySet()) {
                Integer value = map.get(target);
                if(value != 0) {
                    list.add(target);
                    map.put(target, value-1);
                }
            }
            result.add(list);
            flag = map.values().stream().allMatch(value -> value == 0);
        }
        
        return result;
    }
}