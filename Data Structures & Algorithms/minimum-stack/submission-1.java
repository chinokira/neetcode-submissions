class MinStack {

    private Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        System.out.println(val);
        stack.push(val);
        System.out.println(stack.peek());
    }
    
    public void pop() {
        System.out.println(stack.peek());
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        Stack<Integer> tmp = new Stack<>();
        int mini = stack.peek();

        while (!stack.isEmpty()) {
            mini = Math.min(mini, stack.peek());
            tmp.push(stack.pop());
        }

        while (!tmp.isEmpty()) {
            stack.push(tmp.pop());
        }

        return mini;
    }
}
