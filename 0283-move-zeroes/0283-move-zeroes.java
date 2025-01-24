class Solution {
    public void moveZeroes(int[] nums) {

        int i = 0 ; // to travel on each ele

        for ( int ele : nums ) {

            if(ele != 0 )  nums[i++] = ele ;  // shift all non zero forward

        }

        while ( i < nums.length ) nums[i++] = 0 ;  // fill all right side zero 
        
    }
}