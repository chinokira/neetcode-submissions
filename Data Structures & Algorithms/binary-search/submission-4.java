class Solution {
    public int search(int[] nums, int target) {
        int length = nums.length;

        int l = 0;
        int r = length;

        while (l < r) {
            //on tape au millieu du tableau
            int m = l + (r-l)/2;

            //si le chiffre est plus grand que la target alors on enleve la moitier superieur du tableau
            if(nums[m] > target) 
                r = m;
            // sinon on garde que la parti superieur du tableau
            else l = m+1;
        }

        if(l > 0 && nums[l - 1] == target)
            return l-1;
        return -1;
    }
}
