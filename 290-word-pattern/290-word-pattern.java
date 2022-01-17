class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map1 = new HashMap<>();
        
        String[] sArray = s.split(" ");
        if(pattern.length() != sArray.length)
            return false;
        for(int i = 0; i < sArray.length; i++){
            char temp = pattern.charAt(i);
            if(map1.containsKey(temp)){
                if(!map1.get(temp).equals(sArray[i])){
                    return false;
                }
            }else{
                if(map1.containsValue(sArray[i])){
                    return false;
                }else{
                    map1.put(temp,sArray[i]);
                }
            }
        }
        return true;
    }
}