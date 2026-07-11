class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length;

        while (l < r) {
            int index = ((r-l)/2)+l;
            if(nums[index] > target){
                r = index;
            } else {
                l = index + 1;
            }
        }

        return (l > 0 && nums[l-1] == target)? l-1:-1;
    }
}
