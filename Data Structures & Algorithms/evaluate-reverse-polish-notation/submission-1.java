class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
            if(s.matches("^[-+*/]$")){
                int a = stack.pop();
                int b = stack.pop();

                switch(s){
                    case "-" -> stack.push(b - a);
                    case "+" -> stack.push(b + a); 
                    case "*" -> stack.push(b * a);
                    default -> stack.push(b / a);
                }
            }else 
                stack.push(Integer.parseInt(s));
        }
        return stack.pop();
    }
}
