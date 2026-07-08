class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String sorted = String.valueOf(chars);

            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(str);
        }
        return new ArrayList(map.values());
    }
}
