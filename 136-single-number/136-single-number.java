class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> result = new HashMap<>();
        int number = 0;
        for(int i = 0; i < nums.length; i++){
            if(result.containsKey(nums[i])){
                result.put(nums[i], result.get(nums[i]) +1);
            }else{ 
                result.put(nums[i], 1);
            }
        }
        
        //here we cheack which elements has value 1 and we just return it
        for(Map.Entry<Integer,Integer> entery : result.entrySet())
        {
            if(entery.getValue()==1)
            {
                number = entery.getKey();
            }
        }

        
        return number;
    }
}