class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        boolean flag = true;
        for(Character temp : s.toCharArray()){
            if(temp == '|'){
                flag = !flag;
            }else if(temp == '*' && flag == true){
                count++;
            }
        }
        
        return count;
    }
}