class Solution {
    public int countSeniors(String[] details) {
        int num = 0;
        for(String s : details){
            if(s.charAt(s.length()-4) > '6')
                num++;
            else if(s.charAt(s.length()-4) == '6' && s.charAt(s.length()-3) >= '1')
                num++;
            
        }
        return num;
    }
}