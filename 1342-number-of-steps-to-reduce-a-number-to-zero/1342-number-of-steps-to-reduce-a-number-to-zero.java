class Solution {
    public int numberOfSteps(int num) {
        /*int result = 0;
        while(num >0){
            if(num%2==0){
                num /= 2;
            }else {
                num--;
            }
            result++;
        }
        return result;*/
        
        int c=0;
        while(num!=0){
            num=num%2==0?num/2:num-1;
            c++;
        }
        return c;
    }
}