class LinkedList {
    
    ArrayList<Integer> list;

    public LinkedList() {
        list = new ArrayList<>();
    }

    public int get(int index) {
        if(index >= list.size())
            return -1;
        return (int) list.get(index);
    }

    public void insertHead(int val) {
        list.addFirst(val);
    }

    public void insertTail(int val) {
        list.addLast(val);
    }

    public boolean remove(int index) {
        if(list.size() <= index){
            return false;
        }
        ArrayList<Integer> tmp = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(i != index)
                tmp.add(list.get(i));
        }
        list = tmp;
        return true;
    }

    public ArrayList<Integer> getValues() {
        return list;
    }
}
