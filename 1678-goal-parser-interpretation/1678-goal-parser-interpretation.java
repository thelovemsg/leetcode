class Solution {
    public String interpret(String command) {
        Queue<Character> queue = new LinkedList<>();
        String result = "";
        for(int i=0; i<command.length(); i++){
            queue.add(command.charAt(i));
        }

        String temp = "";
        boolean flag = true;
        while(!queue.isEmpty()){
            temp += queue.poll();
            switch(temp){
                case "()" :
                    result += "o";
                    temp = "";
                    break;
                case "(al)":
                    result += "al";
                    temp = "";
                    break;
                case "G":
                    result += temp;
                    temp = "";
                    break;
                default:
                    continue;
            }
        }
        
        return result;
    }
}