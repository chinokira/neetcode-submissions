class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums) {
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else
                map.put(i, 1);
        }

        int ans = 0;
        int max = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(max < entry.getValue()){
                max = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }
}