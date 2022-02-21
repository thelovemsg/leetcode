class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int valueNum = 0;
        int keyNum = 0;
        
        for(Integer temp : map.keySet()){
            if(valueNum < map.get(temp)){
                valueNum = map.get(temp);
                keyNum = temp;
            }
        }

        return keyNum;
    }
}