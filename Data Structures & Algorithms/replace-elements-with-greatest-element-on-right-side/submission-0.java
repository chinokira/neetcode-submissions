class Solution {
    public int[] replaceElements(int[] arr) {
        int max = 0;
        for(int i = arr.length-1; i >= 0; i--){
            int tmp = arr[i];
            arr[i] = max;
            max = Math.max(max, tmp);
        }
        arr[arr.length-1] = -1;

        return arr;
    }
}