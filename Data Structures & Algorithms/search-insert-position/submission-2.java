class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length;
        for(int i = 0; i < nums.length; i++) {
            if(nums[l] >= target)
                return l;
            else if(nums[r-1] < target)
                return r;
            
            l++;
            r--;
        }
        return 0;
    }
}