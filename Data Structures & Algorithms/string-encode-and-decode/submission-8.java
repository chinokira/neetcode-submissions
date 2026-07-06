class Solution {

    public String encode(List<String> strs) {
        if(strs == null) return "";
        String result = "";
        List<Integer> sizes = new ArrayList<>();
        for(String str: strs){
            sizes.add(str.length());
        }
        for(int size: sizes){
            result += size + ",";
        }
        result += "#";
        for(String str: strs){
            result += str;
        }
        return result;
    }

    public List<String> decode(String str) {
        System.out.println("str " + str);
        if(str.length() < 3) return new ArrayList<>();
        String[] split = str.split("#", 2);

        String[] sizes = split[0].split(",");
        if(split.length == 1) return new ArrayList<>(Arrays.asList(""));
        String strs = split[1];
        
        System.out.println("strs " + strs);
        List<String> result = new ArrayList<>();
        int index = 0;
        for(int i = 0; i < sizes.length; i++){
            System.out.println("str " + sizes[i]);
            result.add(strs.substring(index, Integer.parseInt(sizes[i]) + index));
            index += Integer.parseInt(sizes[i]);
        }

        return result;
    }
}
