class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        for(int i=0; i<stones.length(); i++){
            char c = stones.charAt(i);
            for(int j=0; j<jewels.length(); j++){
                char c1 = jewels.charAt(j);
                if(c == c1)
                    result++;
            }
        }
        return result;
    }
}