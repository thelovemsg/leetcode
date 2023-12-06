class Solution {
    public int totalMoney(int n) {
        int cnt = 1;
        int result = 0;
        int total = 0;
        for(int i=0; i<=n/7 ; i++) {
            for (int j=0; j<7; j++){
                total++;
                if (total>n)
                    return result;
                result += j+cnt;
            }
            cnt++;
        }
        return 0;
    }
}