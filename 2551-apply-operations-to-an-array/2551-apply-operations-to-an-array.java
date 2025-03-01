class Solution {
    public int[] applyOperations(int[] nums) {
        for ( int i = 0 ; i <= nums.length - 2 ; i++ ) {
            if ( nums[i] == nums[i+1 ]) {
                nums[i] = 2*nums[i] ; 
                nums[i+1] = 0 ; 
            }
        }
        int[] ans = new int[nums.length] ;
        int i = 0 ;  

        for  (int ele : nums ) {
            if ( ele != 0 ) {
                ans[i++] = ele ; 
            }
        }
        return ans ; 
    }
}