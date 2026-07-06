class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        List<Character> normal = new ArrayList<>();
        List<Character> reverse = new ArrayList<>();

        for(char c : s.toCharArray()){
            if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'))
                normal.add(c);
        }
        for(int i = normal.size()-1; i >= 0; i--){
            char c = normal.get(i);
            if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'))
                reverse.add(c);
        }
        


        return normal.equals(reverse);
    }
}
