class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            hm.merge(c, 1, Integer::sum);
        }
        
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        
        pq.addAll(hm.entrySet());
        
        StringBuilder sb = new StringBuilder();
        
        while(!pq.isEmpty()) { 
            Map.Entry<Character, Integer> entry = pq.poll();
            sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        
        return sb.toString();
         
    }

    
}