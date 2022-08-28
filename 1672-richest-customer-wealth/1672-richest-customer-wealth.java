class Solution {
    public int maximumWealth(int[][] accounts) {
        //return Arrays.stream(accounts).flatMapToInt(s -> IntStream.of(Arrays.stream(s).sum())).max().getAsInt();
        
        int maxsum=0;
        int n=accounts.length;
        int m=accounts[0].length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=accounts[i][j];
            }
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum;
    }
}