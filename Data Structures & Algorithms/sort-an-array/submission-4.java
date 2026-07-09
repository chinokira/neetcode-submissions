class Solution {
    public int[] sortArray(int[] nums) {
        bucketSort(nums, nums.length);
        return nums;
    }

    public  void bucketSort(int[] arr, int n) {
        if (n <= 0)
            return;
        ArrayList<Integer>[] bucket = new ArrayList[n];

        // Create empty buckets
        for (int i = 0; i < n; i++)
            bucket[i] = new ArrayList<>();

        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        if(max == min)
            return;

        // Add elements into the buckets
        for (int i = 0; i < n; i++) {
            bucket[(int) ((long) (arr[i] - min) * (n - 1) / (max - min))].add(arr[i]);
        }

        // Sort the elements of each bucket
        for (int i = 0; i < n; i++) {
            Collections.sort((bucket[i]));
        }

        // Get the sorted array
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0, size = bucket[i].size(); j < size; j++) {
                arr[index++] = bucket[i].get(j);
            }
        }
    }
}