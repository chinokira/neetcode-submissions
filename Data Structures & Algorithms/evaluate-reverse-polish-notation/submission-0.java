class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(String s : tokens){
            if(s.matches("^[-+*/]$")){
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());

                switch(s){
                    case "-" -> stack.push(String.valueOf(b - a));
                    case "+" -> stack.push(String.valueOf(b + a)); 
                    case "*" -> stack.push(String.valueOf(b * a));
                    default -> stack.push(String.valueOf(b / a));
                }
            }else 
                stack.push(s);
        }
        return Integer.parseInt(stack.pop());
    }
}
