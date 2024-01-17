class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            int target = arr[i];
            map.put(target, map.getOrDefault(target, 0) + 1);
        }
        
        Set<Integer> set = new HashSet<>();
        for(Integer key : map.keySet()) {
            int value = map.get(key);
            if(set.contains(value)) {
                return false;
            }else {
                set.add(value);
            }
        }
        
        return true;
        
    }
}