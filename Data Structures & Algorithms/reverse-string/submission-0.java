class Solution {
    public void reverseString(char[] s) {
        int length = s.length;
        for(int i = 0; i < length/2; i++) {
            char tmp = s[i];
            
            System.out.println(s[i] + " " + s[length - 1 - i] + " " +tmp);
            s[i] = s[length - 1 - i];
            s[length - 1 - i] = tmp;
        }
    }
}