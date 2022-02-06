class Solution {
    public int removeDuplicates(int[] nums) {
        int result = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                if(map.get(nums[i]) == 2)
                    continue;
                else{
                    map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
                    nums[count] = nums[i];
                    count++;
                }
            }else{
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
                nums[count] = nums[i];
                count++;
            }
        }
        for(Integer key : map.keySet()){
            result += map.get(key);
        }
        return result;
    }
}