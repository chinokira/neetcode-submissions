class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

        int[] arr = new int[nums.length];
        int index = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] >= 0){
                if(index > 0){
                    if(arr[index-1] != nums[i])
                        arr[index++] = nums[i];
                    }
                else 
                    arr[index++] = nums[i];
            }
        }

        if(arr[0] > 1)
            return 1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i]-1 != arr[i-1])
                return arr[i-1]+1;
        }

        return arr[arr.length-1]+1;
    }
}