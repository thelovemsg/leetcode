class Solution {
    public int buyChoco(int[] prices, int money) {
        int firstMin = 101;
        int secondMin = 101;
        
        for (int i=0; i<prices.length; i++){
            if(firstMin > prices[i]){
                secondMin = firstMin;
                firstMin = prices[i];
            } else if (secondMin > prices[i]){
                secondMin = prices[i];
            }
        }
        
        int cal  = money - (firstMin + secondMin);

        return cal < 0 ? money : cal;
        
    }
}