class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> res = new HashSet<>();
        int length = nums.length;
        Arrays.sort(nums);

        for(int i = 0; i < length; i++){
            for(int j = i+1; j < length; j++){
                for(int l = j+1; l < length; l++){
                    for(int h = l+1; h < length; h++){
                        if(nums[i] + nums[j] + 0L+ nums[l] + nums[h] == target){
                            res.add(Arrays.asList(nums[i], nums[j], nums[l], nums[h]));
                        }
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
}