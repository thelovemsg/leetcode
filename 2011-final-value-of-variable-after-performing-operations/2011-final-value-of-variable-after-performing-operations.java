class Solution {
    public int finalValueAfterOperations(String[] operations) {
        return Arrays.asList(operations).stream().mapToInt(s -> {
            if (s.contains("--")) {
                return -1;
            } else if (s.contains("++")) {
                return 1;
            }
            return 0;
        }).sum();
    }
}