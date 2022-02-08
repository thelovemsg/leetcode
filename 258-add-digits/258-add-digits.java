class Solution {
    public int addDigits(int num) {
        int numLength = (int)(Math.log10(num)+1);
        int answer = num;
        int numCopy = num;
        while(numLength >= 2){
            answer= 0;
            for(int i = 0; i < numLength; i++){
                answer += numCopy%10; 
                numCopy/=10;
            }
            numLength = (int)(Math.log10(answer)+1);
            numCopy = answer;
        }
        
        return answer;
    }
}