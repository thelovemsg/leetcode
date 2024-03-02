class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums) {
            list.add(num*num);
        }
        
        Collections.sort(list);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}