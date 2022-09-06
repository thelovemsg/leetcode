class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<edges.length; i++){
            map.put(edges[i][0],map.getOrDefault(edges[i][0],0)+1);
            map.put(edges[i][1],map.getOrDefault(edges[i][1],0)+1);
        }
    
        int max = 0;
        for(Integer key : map.keySet()){
            if(map.get(key)>max){
                max = key;
            }
        }
        return max;
    }
}