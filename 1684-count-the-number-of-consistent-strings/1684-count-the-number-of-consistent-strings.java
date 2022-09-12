class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int result = 0;
        for(int i=0; i<words.length; i++){
            boolean flag = true;
            String[] target = words[i].split("");
            for(int j=0; j<target.length; j++){
                if(!allowed.contains(target[j])){
                    flag = false;
                    break;
                }
            }
            if(flag){
                result++;
            }
        }
        return result;
    }
}