class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] suffix = new int[nums.length] ; 
        int[] prefix = new int[nums.length] ; 

        suffix[0] = nums[0] ; 
        prefix[nums.length-1] = nums[nums.length-1] ; 

        for ( int i = 1 ; i < nums.length ; i++ ) {
            suffix[i] = suffix[i-1]*nums[i] ;
        }
        for ( int i = nums.length-2 ; i >= 0  ; i-- ) {
            prefix[i] = prefix[i+1]*nums[i] ;
        }

        int[] ans = new int[nums.length] ; 
        ans[0] = prefix[1] ; 
        ans[nums.length-1] = suffix[nums.length-2] ; 

        for ( int i = 1 ; i <= nums.length-2 ; i++ ) {
            ans[i] = suffix[i-1]*prefix[i+1] ; 
        }

        return ans ; 
    }
}