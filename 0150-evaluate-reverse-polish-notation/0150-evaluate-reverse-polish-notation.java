class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 1)
            return Integer.parseInt(tokens[0]);
        
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for(String token : tokens) {
            if(isInteger(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                result = calOperation(stack, token);
            }
        }
        
        return result;
    }
    
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }
    
    public static int calOperation(Stack<Integer> stack, String token) {
        int result = 0;
        int last = stack.pop();
        int prev = stack.pop();
        if(token.equals("+")) {
            result = last + prev;
        }
        
        if(token.equals("-")) {
            result = prev - last;
        }
        
        if(token.equals("/")) {
            result = prev / last;
        }
        
        if(token.equals("*")) {
            result = prev * last;
        }
        
        stack.push(result);
        
        return result;
    }
}