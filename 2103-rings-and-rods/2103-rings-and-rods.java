class Solution {
    public int countPoints(String rings) {
        int count = 0;
        String[] result = {"","","","","","","","","","",""};
        for (int i=0; i<rings.length(); i+=2){
            result[rings.charAt(i+1)-'0'] = result[rings.charAt(i+1)-'0'] + String.valueOf(rings.charAt(i));
        }
        return (int) Arrays.asList(result).stream().filter(s -> s.contains("R") && s.contains("B") && s.contains("G")).count();
        
    }
}