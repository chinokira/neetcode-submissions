class MyHashMap {
    List<Integer> key;
    List<Integer> value;
    public MyHashMap() {
        key = new ArrayList<>();
        value = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        if(this.key.contains(key)){
            this.value.add(this.key.indexOf(key), value);
        }else {
            this.key.add(key);
            this.value.add(this.key.indexOf(key), value);
        }
    }
    
    public int get(int key) {
        if(!this.key.contains(key))
            return -1;
        return value.get(this.key.indexOf(key));
    }
    
    public void remove(int key) {
        if(this.key.size() >= 0 && this.key.contains(key)){

            this.value.remove(this.key.indexOf(key));
            this.key.remove(this.key.indexOf(key));
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */