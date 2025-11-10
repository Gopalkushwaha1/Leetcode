class Solution {
    public static int ans ( int[] nums , int start , int end ) {
        int prevMax = 0 , max = 0 ; 

        for ( int i = start ; i <= end ; i++ ) {
            int temp = Math.max(max , prevMax + nums[i]) ; 
            prevMax = max ; 
            max = temp ; 
        }

        return max ; 
    }
    public int rob(int[] nums) {
        int len = nums.length ; 
        if ( len == 1 ) return nums[0] ; 
        return Math.max(ans(nums,0,len-2) , ans(nums,1,len-1) ) ; 
    }
}