class Solution {
    public int trap(int[] height) {
        int result = 0;
        int length = height.length;
        
        int[] prefix = new int[height.length];
        int[] suffix = new int[height.length];

        int prefixMax = 0;
        int suffixMax = 0;
        for(int i = 0; i < length; i++){
            prefixMax = Math.max(prefixMax, height[i]);
            suffixMax = Math.max(suffixMax, height[length-i-1]);

            prefix[i] = prefixMax;
            suffix[length - 1 -i] = suffixMax;
        }
        for(int i = 0; i < length; i++) {
            result += Math.min(prefix[i], suffix[i]) - height[i];
        }
        return result;
    }
}
