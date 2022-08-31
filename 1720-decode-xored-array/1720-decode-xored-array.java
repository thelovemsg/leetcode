class Solution {
    public int[] decode(int[] encoded, int first) {
        int size = encoded.length+1;
        int[] result = new int[size];
        result[0] = first; 
        for(int i=1; i<size; i++){
            result[i] = result[i-1]^encoded[i-1];
        }
        
        return result;
    }
}