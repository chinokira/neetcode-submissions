class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) 
            return false;
        int r = 0;
        for(int i = 0; i < t.length() && r < s.length(); i++){
            if(t.charAt(i) == s.charAt(r)){
                r++;
            }
        }

        return r == s.length();
    }
}