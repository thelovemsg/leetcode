class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, Integer> map = new LinkedHashMap<>();
        Map<String, Integer> lastPath = new HashMap<>();
        for(int i=0; i<paths.size(); i++) {
            List<String> path = paths.get(i);
            map.put(path.get(0), map.getOrDefault(path.get(0), 0) + 1);
            map.put(path.get(1), map.getOrDefault(path.get(1), 0) + 1);
            lastPath.put(path.get(1), lastPath.getOrDefault(path.get(1), 0) + 1);
        }

        
        for(String key : map.keySet()) {
            if(map.get(key) == 1){
                if(lastPath.get(key) != null)
                    return key;
            }
        };
        
        return "";
    }
}