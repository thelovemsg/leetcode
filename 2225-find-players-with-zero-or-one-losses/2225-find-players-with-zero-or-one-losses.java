class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<Integer> losers = new ArrayList<>();
        
        Set<Integer> winnerSet = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<matches.length; i++) {
            int win = matches[i][0];
            int lose = matches[i][1];
            map.put(lose, map.getOrDefault(lose, 0) + 1);
            winnerSet.add(win);
        }
        
        for (Integer key : map.keySet()) {
            int value = map.get(key);
            if(value == 1) {
                losers.add(key);
            }
            
            if(winnerSet.contains(key)){
                winnerSet.remove(key);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> winnerList = new ArrayList(winnerSet);
        Collections.sort(winnerList);
        Collections.sort(losers);
        result.add(winnerList);
        result.add(losers);
        return result;
    }
}