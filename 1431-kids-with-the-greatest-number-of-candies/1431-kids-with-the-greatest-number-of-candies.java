class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> results = new ArrayList<>();
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
        return results;
    }
}