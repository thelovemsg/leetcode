class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums1) {
            map.merge(num, 1, Integer::sum);
        }
        
        List<Integer> list = new ArrayList<>();
        for(int num : nums2) {
            if(map.containsKey(num) && map.get(num) > 0) {
                list.add(num);
                map.merge(num, -1, Integer::sum);
            }
        } 
        
        int arr[] = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}