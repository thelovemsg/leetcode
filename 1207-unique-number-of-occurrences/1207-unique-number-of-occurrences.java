class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int value = arr[i];
            map.merge(value, 1, Integer::sum);
        }
        return map.size() == new HashSet<>(map.values()).size();
    }
}
