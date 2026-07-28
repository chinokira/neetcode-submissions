class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int[] l = new int[n];
        int[] r = new int[n];

        int maxl = 0;
        int maxr = 0;
        for(int i = 0; i < n; i++) {
            if(height[i] > maxl)
                maxl = height[i];
            l[i] = maxl;
            if(height[n-i-1] > maxr)
                maxr = height[n-i-1];
            r[n-i-1] = maxr;
        }
        
        int res = 0;
        for(int i = 0; i < n; i++){
            res += Math.min(r[i], l[i]) - height[i];
        }
        return res;
    }
}
