class Solution {
    public int search(int[] nums, int target) {
        int n =  nums.length;

        int p = findPivot(nums, 0, n - 1);

        if(nums[p] == target)
            return p;
            
        if(p == 0)
            return binary(nums, 0, n-1, target);
        
        if(nums[0] <= target)
            return binary(nums, 0, p-1, target);
        
        return binary(nums, p+1, n-1, target);
    }

    public int findPivot(int[] arr, int l, int r){
        while (l <= r) {
            if(arr[l] <= arr[r]) 
                return l;
            
            int m = (l + r) / 2;

            if(arr[m] > arr[r])
                l = m + 1;
            else r = m;
        }
        return l;
    }

    public int binary(int[] arr, int l, int r, int target) {
        while (l <= r) {
            int i = l+(r-l)/2;
            if(arr[i] == target)
                return i;
            else if(arr[i] < target)
                l = i+1;
            else
                r = i-1;
        }
        return -1;
    }
}
