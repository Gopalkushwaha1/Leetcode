class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2] ; 
        int j = 0 ; 
        for ( int i = 0 ; i < nums.length ; i++ ) {
            if(nums[i] == 0 ) {
                nums[i] = nums.length ; 
            }
        }

        for ( int i = 0 ; i < nums.length ; i++ ) {
            int idx = Math.abs(nums[i]) ; 
            if(nums[idx%nums.length] < 0 ) {
                if ( idx == nums.length ) {
                    ans[j++] = 0 ; 
                    continue ; 
                }
                ans[j++] = idx ; 
                continue ;  
            }
            else {
                nums[idx%nums.length] = -1*nums[idx%nums.length] ; 
            }
        }
        return ans ; 
    }
}