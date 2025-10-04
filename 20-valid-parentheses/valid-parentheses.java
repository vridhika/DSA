class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char C:s.toCharArray()){
            if(C=='{'){
                stack.push('}');
            }
            else if(C=='('){
                stack.push(')');
            }
            else if(C=='['){
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop()!=C){ 
                return false;
            }
        }
        return stack.isEmpty();
    }
}