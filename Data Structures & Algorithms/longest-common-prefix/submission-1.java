class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null)
            return "";
        String ans = "";

        for(int i = 0; i < strs[0].length(); i++){
            // System.out.println("strs " + strs[0] + " ans " + ans + " i " + i + " length " + strs)
            ans += strs[0].substring(i, i+1);
            for(int j = 1; j < strs.length; j++){
                if(!strs[j].startsWith(ans))
                    return ans.substring(0, i);
            }
        }
        return ans;
    }
}