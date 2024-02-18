class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] result = new String[score.length];
        
        // 점수를 기준으로 내림차순 정렬하는 PriorityQueue 생성
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        
        // 우선순위 큐에 모든 점수 추가
        for (int s : score) {
            queue.add(s);
        }
        
        // 점수와 순위 매핑
        Map<Integer, String> rankMap = new HashMap<>();
        int rank = 1;
        while (!queue.isEmpty()) {
            int s = queue.poll();
            if (rank == 1) {
                rankMap.put(s, "Gold Medal");
            } else if (rank == 2) {
                rankMap.put(s, "Silver Medal");
            } else if (rank == 3) {
                rankMap.put(s, "Bronze Medal");
            } else {
                rankMap.put(s, Integer.toString(rank));
            }
            rank++;
        }
        
        // 결과 배열에 순위 할당
        for (int i = 0; i < score.length; i++) {
            result[i] = rankMap.get(score[i]);
        }
        
        return result;
    }
}