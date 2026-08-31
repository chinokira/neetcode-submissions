class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1) return stones[0];
        quickSort(stones, 0, stones.length-1);

        int x = stones[stones.length - 2];
        int y = stones[stones.length - 1];
        
        int[] tmp = new int[stones.length - 1];

        for(int i = 0; i < stones.length - 2; i++) {
            tmp[i] = stones[i];
        }
        tmp[tmp.length-1] = Math.abs(x - y);
        
        return lastStoneWeight(tmp);
    }

    private int partition(int[] arr, int l, int r) {
        int i = l-1;
        for(int j = l; j < r; j++) {
            if(arr[j] < arr[r]) {
                i++;
                swap(arr, j, i);
            }
        }

        swap(arr, i+1, r);
        return i+1;
    }

    private void quickSort(int[] arr, int l, int r) {
        if(l > r) return;
        int p = partition(arr, l, r);

        quickSort(arr, l, p-1);
        quickSort(arr, p+1, r);
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
