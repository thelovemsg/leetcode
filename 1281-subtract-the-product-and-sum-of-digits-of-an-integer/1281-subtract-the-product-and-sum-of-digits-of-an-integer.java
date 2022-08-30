class Solution {
    public int subtractProductAndSum(int n) {
        /*int multiply = 1;
        int sum = 0;
        
        while(n>0){
            multiply *= n%10;
            sum += n%10;    
            n/=10;
        }
        
        return multiply-sum;*/
        
        String str = Integer.toString(n);
        int[] pp = new int[str.length()];
        int sum = 0;
        int product = 1;
        for(int i=0; i < str.length(); i++){
            pp[i] = str.charAt(i)-'0';
            product = product * pp[i];
            sum = sum+pp[i];
        }
        return product - sum;

        /*String str = Integer.toString(n);
        int[]  pp = new int[str.length()];
        int sum = 0;
        int product = 1;
        for (int i = 0; i < str.length(); i++) {
            pp[i] = str.charAt(i)-'0';
            product = product * pp[i];
            sum = sum+ pp[i];
        }
        return product - sum;*/
        
    }
}