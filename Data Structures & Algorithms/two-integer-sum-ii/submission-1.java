class Solution {
    public int[] twoSum(int[] numbers, int target) {
         int length = numbers.length;

        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                if(i != j && (numbers[i] + numbers[j]) == target)
                    return new int[]{i+1, j+1};
            }
        }
        return null;
    }
}
