class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(j == 0)
                    result[i]++;
                if(i != j)
                    result[i] *= nums[j];
            }
        }

        return result;
    }
}  
