class Solution {
    public int findSpecialInteger(int[] arr) {
        int length =arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        }
        
        for(Integer key : map.keySet()){
            if(map.get(key) > length*0.25)
                return key;
        }
        
        return 0;
    }
}