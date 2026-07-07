class Solution {
    public int search(int[] nums, int target) {
        int length = nums.length;

        int l = 0;
        int r = length;

        while (l < r) {
            int m = l + (r-l)/2;

            if(nums[m] > target) 
                r = m;
            else l = m+1;
        }
        // for(int i = 0; i < l; i++){
        //     if(nums[i] == target)
        //         return i;
        // }
        if(l > 0 && nums[l - 1] == target)
            return l-1;
        return -1;
    }
}
