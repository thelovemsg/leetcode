import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        BigInteger one = new BigInteger("1");
        BigInteger ten = new BigInteger("10");
        BigInteger result = new BigInteger("0");
        for(int digit : digits){
            result = result.multiply(ten).add(BigInteger.valueOf(digit));
        }            
        String sResult = result.add(one).toString();
        
        return Stream.of(sResult.split("")).mapToInt(Integer::parseInt).toArray();
    }
}