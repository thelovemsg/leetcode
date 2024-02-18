class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] result = new String[score.length];
        
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
                (Comparator<Map.Entry<Integer, Integer>>) (e1, e2) -> e2.getValue().compareTo(e1.getValue())
        );    
        
        for(int i=0; i<score.length; i++) {
            map.put(i, score[i]);
        }
        
        queue.addAll(map.entrySet());
        
        int idx = 0;
        while (!queue.isEmpty()) {
            Map.Entry<Integer, Integer> entry = queue.poll();
            int key = entry.getKey();
            switch(idx) {
                case 0 :
                    result[key] = "Gold Medal";
                    break;
                case 1 :
                    result[key] = "Silver Medal";
                    break;
                case 2 :
                    result[key] = "Bronze Medal";
                    break;
                default :
                    result[key] = (idx+1) + "";        
            }
            idx++;
        }
        
        return result;
        
    }
}