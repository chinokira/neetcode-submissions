class Solution {
    public int maxArea(int[] heights) {
        int result = 0;
        int length = heights.length;
        for(int i = 0; i < length; i++){
            for(int j = 1; j < length; j++){
                int ecart = Math.abs(i-j);
                int min = Math.min(heights[i], heights[j]);
                if(min * ecart > result)
                    result = min * ecart;
            }
        }
        return result;
    }
}
