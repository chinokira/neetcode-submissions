class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[l] >= target)
                return l;
            else if(nums[r] < target)
                return r+1;
            
            l++;
            r--;
        }
        return 0;
    }
}