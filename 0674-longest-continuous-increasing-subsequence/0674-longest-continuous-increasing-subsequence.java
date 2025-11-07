class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count = 1 ; 
        int ans = 0 ; 
        int currEle = nums[0] ; 

        for ( int i = 1 ; i < nums.length ; i++ ) {
            if( nums[i] > currEle ) {
                count++ ; 
                ans = Math.max(count , ans) ; 
                currEle = nums[i] ; 
                continue ; 
            }
            count = 1 ; 
            currEle = nums[i] ;
            
        }
        return ans == 0 ? 1 : ans ; 
    }
}