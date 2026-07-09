class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++) {
                if(i == j)
                 continue;
                // System.out.println(nums[i] == nums[j] && Math.abs(i-j) <= k);
                // System.out.println(nums[i] +" "+ nums[j] +" "+  Math.abs(i-j) +" "+ k);
                if(nums[i] == nums[j] && Math.abs(i-j) <= k)
                    return true;
            }
        }
        return false;
    }
}