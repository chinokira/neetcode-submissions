class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        int length = nums.length;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                for(int l = 0; l < length; l++){
                    if(i != j && j != l && l != i){
                        if(nums[i] + nums[j] + nums[l] == 0){
                            List<Integer> list = Arrays.asList(nums[i], nums[j], nums[l]);
                            Collections.sort(list);
                            if(!lists.contains(list))
                                lists.add(list);
                        }
                    }
                }
            }
        }
        return lists;
    }
}
