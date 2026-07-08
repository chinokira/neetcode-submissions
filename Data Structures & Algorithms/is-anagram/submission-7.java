class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
            
        char[] c = s.toCharArray();
        char[] v = t.toCharArray();

        Arrays.sort(c);
        Arrays.sort(v);

        for(int i = 0; i < c.length; i++){
            if(c[i] != v[i])
                return false;
        }
        return true;
    }
}
