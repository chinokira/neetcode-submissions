class MinStack {

    private List<Integer> arr;

    public MinStack() {
        arr = new ArrayList<>();
    }
    
    public void push(int val) {
        arr.addLast(val);
    }
    
    public void pop() {
        arr.removeLast();
    }
    
    public int top() {
        return arr.getLast();
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;

        for(int i : arr){
            if(min > i)
                min = i;
        }
        return min;
    }
}
