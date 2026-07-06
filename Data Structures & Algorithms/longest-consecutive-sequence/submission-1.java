class Solution {
    public int longestConsecutive(int[] nums) {
       int longest = 0;

       List<Integer> list = Arrays.stream(nums).boxed().toList();
       for(int i = 0; i < list.size(); i++){
        int num = list.get(i);
        int length = 0;
        while(list.contains(num++)){
            length++;
        }
        if(length > longest)
            longest = length;
       } 
       return longest;
    }
}
