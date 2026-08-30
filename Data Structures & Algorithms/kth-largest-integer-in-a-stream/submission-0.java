class KthLargest {

    int k;
    int[] stream;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        stream = nums;
    }
    
    public int add(int val) {
        int[] tmp = new int[stream.length+1];
        for(int i = 0; i < stream.length; i++){
            tmp[i] = stream[i];
        }
        tmp[stream.length] = val;

        quickSort(tmp, 0, tmp.length-1);

        stream = tmp;

        return stream[stream.length-k];
    }

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        
        swap(arr, i + 1, high);  
        return i + 1;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}
