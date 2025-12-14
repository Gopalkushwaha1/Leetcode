class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0 ; 
        int j = 0 ; 

        while ( j < nums.length ) {
            while ( j < nums.length && nums[j] == nums[i]) j++ ; 
            if ( j < nums.length ) {
                i++ ; 
                nums[i] = nums[j] ; 
            }
        }
        return i +1 ; 
    }
}