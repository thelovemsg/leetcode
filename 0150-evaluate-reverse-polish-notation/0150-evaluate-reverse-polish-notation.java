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
        return str.matches("-?\\d+");
    }
    
    public static int calOperation(Stack<Integer> stack, String token) {
        int result = 0;
        if(token.equals("+")) {
            result = stack.pop() + stack.pop();
        }
        
        if(token.equals("-")) {
            int last = stack.pop();
            int prev = stack.pop();
            result = prev - last;
        }
        
        if(token.equals("/")) {
            int last = stack.pop();
            int prev = stack.pop();
            result = prev / last;
        }
        
        if(token.equals("*")) {
            int last = stack.pop();
            int prev = stack.pop();
            result = prev * last;
        }
        
        System.out.println("result :: " + result);
        stack.push(result);
        
        return result;
    }
}