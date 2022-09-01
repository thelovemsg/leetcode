class Solution {
    public String restoreString(String s, int[] indices) {
        String[] result = new String[indices.length];
        for(int i=0; i<s.length(); i++){
            result[indices[i]] = String.valueOf(s.charAt(i));
        }
        return Arrays.stream(result).reduce((s1, s2) -> {
            return s1 + s2;
        }).get();
    }
}