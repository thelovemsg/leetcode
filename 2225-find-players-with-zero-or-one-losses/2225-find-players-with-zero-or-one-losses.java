class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> playerLosses = new HashMap<>();

        for (int[] match : matches) {
            playerLosses.put(match[0], playerLosses.getOrDefault(match[0], 0));  // 승자에 대한 패배 횟수 초기화
            playerLosses.put(match[1], playerLosses.getOrDefault(match[1], 0) + 1);  // 패자의 패배 횟수 증가
        }

        List<Integer> noLosses = playerLosses.entrySet().stream()
                .filter(entry -> entry.getValue() == 0)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList());

        List<Integer> oneLoss = playerLosses.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList());

        return Arrays.asList(noLosses, oneLoss);
    }
}