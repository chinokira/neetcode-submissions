class DynamicArray {
    
    private int capacity; 
    private int size;
    private int[] arr;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.arr = new int[capacity];
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public void pushback(int n) {
        if(this.size == this.capacity)
            resize();
        this.arr[size] = n;
        this.size++;
    }

    public int popback() {
        if(size > 0)
            this.size--;
        return this.arr[this.size];
    }

    private void resize() {
        this.capacity = 2 * this.capacity;
        int[] newArr = new int[this.capacity];

        for(int i = 0; i < getSize(); i++)
            newArr[i] = this.arr[i];
        this.arr = newArr;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
