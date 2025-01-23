class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0  ; 

        for ( int k = 0 ; k < nums.length ; k++ ) {

            if( k + 1 == nums.length  ) {
                nums[i++] = nums[k] ; 
            }
            else if(nums[k] != nums[k+1] ) {
                nums[i] = nums[k] ; 
                i++;
            }
        }
        return i ; 
    }
}