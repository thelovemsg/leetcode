class Solution {
    public int maxDepth(String s) {
        int result = 0;
        int maxDepth = 0;
        for(int i=0; i<s.length(); i++){
            char temp = s.charAt(i);
            switch(temp){
                case '(' :
                    result++;
                    break;
                case ')' :
                    result--;
                    break;
            }
            maxDepth = Math.max(maxDepth,result);
        }
        
        return maxDepth;
    }
}