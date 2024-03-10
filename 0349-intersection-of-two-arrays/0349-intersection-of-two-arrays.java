class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> ans = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                ans.add(nums2[i]);
            }
        }
        int[] array = new int[ans.size()];
        int index = 0;
        for (int num : ans) {
            array[index++] = num;
        }

        return array;
    }
}