class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i]; // 각 요소를 제곱
        }

        Arrays.sort(nums); // 배열 정렬
        return nums; // 정렬된 배열 반환
    }
}