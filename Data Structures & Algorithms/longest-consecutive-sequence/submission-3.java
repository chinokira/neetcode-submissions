class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        Set<Integer> set = new HashSet<>();

        for(int i : nums) {
            set.add(i);
        }

        int[] sortedArray = set.stream()
                       .mapToInt(Integer::intValue)
                       .sorted()
                       .toArray();

        int longest = 0;
        int length = 0;
        for(int i = 1; i < sortedArray.length; i++) {
            System.out.println((sortedArray[i] == sortedArray[i-1]+1) + " " + sortedArray[i] + " " + (sortedArray[i-1]+1));
            if(sortedArray[i] == sortedArray[i-1]+1)
                length++;
            else 
                length = 0;
            if(longest < length)
                longest = length;
        }
        return ++longest;
    }
}
