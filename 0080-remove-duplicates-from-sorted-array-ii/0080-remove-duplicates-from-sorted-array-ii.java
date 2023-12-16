class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }
        
        List<Integer> list = new ArrayList<>();
        for(Integer num : map.keySet()) {
            int cnt = map.get(num);
            if(cnt == 1) {
                list.add(num);
            } else {
                list.add(num);
                list.add(num);
            }     
        }
        
        list.sort(Integer::compareTo);

        
        for(int i=0; i<list.size(); i++){
            nums[i] = list.get(i);
        }
        
        return list.size();
    }
} 