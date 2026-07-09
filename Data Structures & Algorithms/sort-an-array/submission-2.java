class Solution {
    public int[] sortArray(int[] nums) {
        return quickSort(nums, 0, nums.length-1);
    }

    public int[] quickSort(int[] arr, int l, int r) {
        if (l >= r) {
            return arr;
        }

        int p = partition(arr, l, r);

        quickSort(arr, l, p-1);
        quickSort(arr, p+1, r);
        return arr;
    }

    private int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = l - 1;

        for (int j = l; j < r; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, r);
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }

        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    } 
}