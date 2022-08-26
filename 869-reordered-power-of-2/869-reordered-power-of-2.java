class Solution {
   public boolean reorderedPowerOf2(int n) {
        Set<Long> two = new HashSet<>();
        for (int i = 1; i <= (int)1e9; i <<= 1){
            two.add(transform(i));
        }

        return two.contains(transform(n));
    }

    private long transform(int n){
        long sum = 0;
        while(n > 0){
            int d = n % 10;
            sum += 1L << (d*3);
            n /= 10;
        }

        return sum;
    }
}