class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        /*List<Boolean> results = new ArrayList<>();
        for(int i=0; i<candies.length; i++){
            boolean flag = true;
            int target = candies[i];
            for(int j=0; j<candies.length;j++){
                if(i==j)
                    continue;
                if(candies[j] > target + extraCandies){
                    results.add(false);
                    flag = false;
                    break;
                }
            }
            if(flag){
                results.add(true);
            }
        }
        System.out.println(results);
        return results;*/
        
        int maxCandies = candies[0];
        for (int i = 1; i < candies.length;i++){
            if (maxCandies < candies[i]){
                maxCandies = candies[i];
            }
        }
        
        //모두 다 비교할 필요 없이 가장 큰 수보다 크거나 같기만 하면 된다. 
        List<Boolean> arr = new ArrayList<>();
        for (int i = 0; i < candies.length;i++){
            arr.add(extraCandies + candies[i] >= maxCandies);
        }
        return arr;
    }
}