class Solution {
    public int search(int[] nums, int target) {
        int length = nums.length;

        int l = 0;
        int r = length -1;

        while (l <= r) {
            if(nums[l] == target)
                return l;
            else if (nums[r] == target)
                return r;
            l++;
            r--;
        }
        // for(int i = 0; i < l; i++){
        //     if(nums[i] == target)
        //         return i;
        // }
        return -1;
    }
}
