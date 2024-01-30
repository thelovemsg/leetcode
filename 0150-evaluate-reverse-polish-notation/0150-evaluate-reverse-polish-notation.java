class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 1)
            return Integer.parseInt(tokens[0]);
        
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for(String token : tokens) {
            try {
                stack.push(Integer.parseInt(token));
            } catch(NumberFormatException e) {
                result = calOperation(stack, token);
            }
        }
        
        return result;
    }
    
    
    public static int calOperation(Stack<Integer> stack, String token) {
        int result = 0;
        int last = stack.pop();
        int prev = stack.pop();
        switch (token.charAt(0)) {
            case '+':
                result = prev + last;
                break;
            case '-':
                result = prev - last;
                break;
            case '*':
                result = prev * last;
                break;
            case '/':
                result = prev / last;
                break;
        }
        
        stack.push(result);
        
        return result;
    }
}