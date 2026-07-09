class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int[] m : matrix){
            for(int n : m){
                if(n == target)
                    return true;
            }
        }
        return false;
    }
}
