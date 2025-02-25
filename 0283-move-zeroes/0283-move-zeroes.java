class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0 , j = 0 ; 

        while (i < nums.length &&  nums[i] != 0 ) {
            i++ ;
        }

        j = i+ 1 ; 

        while ( j < nums.length ) {
            if ( nums[j] != 0 ) {
                int temp = nums[j] ; 
                nums[j] = 0 ; 
                nums[i] = temp ; 
                i++;
                j++;
            }
            else {
                j++;
            }
        }
    }
}