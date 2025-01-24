class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0 ; 

        for ( int ele : nums ) {
            if(ele != 0 ) {
                nums[i++] = ele ; 
            }
        }

        while ( i < nums.length ) {
            nums[i] = 0 ; 
            i++ ; 
        }
    }
}