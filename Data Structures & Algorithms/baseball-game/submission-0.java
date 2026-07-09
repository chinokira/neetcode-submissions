class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(String s: operations){
            switch(s){
                case "+":{
                    int top = stack.pop();
                    int newTop = top + stack.peek();
                    stack.push(top);
                    stack.push(newTop);
                    break;
                }
                case "D": {
                  stack.push(2 * stack.peek());
                  break;
                }
                case "C" : {
                    stack.pop();
                    break;
                } 
                default : {
                    stack.push(Integer.valueOf(s));
                    break;
                }
            }
        }
        int sum = 0;

        for(int score : stack){
            sum += score;
        }
        return sum;
    }
}