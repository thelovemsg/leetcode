class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }
        
        StringBuilder sb = new StringBuilder();
       // order에 따라 문자 정렬
        for(char orderChar : order.toCharArray()) {
            if(map.containsKey(orderChar)) {
                // order 문자의 빈도수만큼 결과 문자열에 추가
                for(int i = 0; i < map.get(orderChar); i++) {
                    sb.append(orderChar);
                }
                // 추가된 문자는 맵에서 제거
                map.remove(orderChar);
            }
        }
        
        // order에 없는 문자들 추가
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            char c = entry.getKey();
            for(int i = 0; i < entry.getValue(); i++) {
                sb.append(c);
            }
        }
        
        return sb.toString();
        
    }
}