class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int index = (r-l)/2+l;

        while (l <= r) {
            index = (r-l)/2+l;
            if(nums[index] > target){
                r = index -1;
            } else if(nums[index] < target) {
                l = index + 1;
            } else {
                return index;
            }
        }

        return -1;
    }
}
