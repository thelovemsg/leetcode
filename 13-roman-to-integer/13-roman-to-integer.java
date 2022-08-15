class Solution {
    public int romanToInt(String s) {
        
        Map<String, Integer> map = Map.of("I",1,"V",5,"X",10,"L",50,"C",100,"D",500,"M",1000);
        int result = 0;
        List<String> list = Arrays.asList(s.split("")).stream().collect(Collectors.toList());
        for(int i=0; i<list.size()-1; i++){
            Integer first = map.get(list.get(i));
            Integer second = map.get(list.get(i+1));
            if(first < second) {
                result -= first;
            }else{
                result += first;    
            }
        }
        return result + map.get(list.get(list.size()-1));
        
        
        /*int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1)))
                result = result - map.get(s.charAt(i));
            else 
                result = result + map.get(s.charAt(i));
        }
        return result + map.get(s.charAt(s.length() - 1));*/
    }
}