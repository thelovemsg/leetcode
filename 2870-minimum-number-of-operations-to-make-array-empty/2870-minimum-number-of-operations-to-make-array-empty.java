class Solution {
    public int minOperations(int[] nums) {
        int result = 0;      
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }
        
        boolean isOneExist = map.values().stream().anyMatch(el -> el.intValue() == 1);
        if(isOneExist)
            return -1;
            
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            Integer value = entry.getValue();
            System.out.println("key :: " + entry.getKey());
            System.out.println("value :: " + value);
            if(value >= 5 ){
                int quotient = value / 3;
                int remainder = value % 3;
                System.out.println("quotient :: " + quotient);
                System.out.println("remainder :: " + remainder);
                result += quotient;
                if(remainder == 1 || remainder == 2) {
                    result++;    
                }
            } else if(value == 4) {
                result += 2;
            } else if(value == 2 || value == 3) {
                result++;
            }
            System.out.println("result :: " + result);
            System.out.println("=======================");
        }
        
        return result;
    }
}