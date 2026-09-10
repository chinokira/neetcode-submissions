class PrefixTree {
    String[] arr;
    public PrefixTree() {
        arr = new String[0];
    }

    public void insert(String word) {
        String[] tmp = new String[arr.length+1];
        for(int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        tmp[tmp.length-1] = word;
        arr = tmp;
    }

    public boolean search(String word) {
        for(String s : arr){
            if(s.equals(word)){
                return true;
            }
        }
        return false;
    }

    public boolean startsWith(String prefix) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < Math.min(arr[i].length(), prefix.length()); j++) {
                if(arr[i].charAt(j) != prefix.charAt(j))
                    break;
                if(j == prefix.length()-1)
                    return true;
            }
        }
        return false;
    }
}
