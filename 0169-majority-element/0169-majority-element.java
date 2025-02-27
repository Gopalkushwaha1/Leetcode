class Solution {
    public int majorityElement(int[] nums) {
        for  ( int i = 1 ; i < nums.length ; i++ ) {
            if ( nums[i] > nums[i-1]) continue ; 
            for ( int j = i ; j > 0 ; j-- ) {
                if ( nums[j] < nums[j-1]) {
                    int temp = nums[j] ; 
                    nums[j] = nums[j-1] ; 
                    nums[j-1] = temp ;
                }
                else {
                    break ; 
                }
            }
        }
        return nums[(0+nums.length)/2] ; 
    }
}