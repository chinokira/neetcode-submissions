class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Comparator<int[]> comparator = Comparator.comparingLong(a -> {
            long s = 0;
            for (Integer x : a) s += (long) x * x;
            return s;
        });
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(comparator);

        for(int[] point : points) {
            minHeap.offer(point);
        }
        
        int[][] res = new int[k][2];

        for(int i = 0; i < k; i++) {
            res[k-i-1] = minHeap.poll();
        }
        return res;
    }
}
