class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for(int i = 1; i < s.length(); i++) {
            sum += diff(s.charAt(i-1), s.charAt(i));
        }
        return sum;
    }

    public int diff(char a, char b){
        return Math.abs((int) a - (int) b);
    }
}